package net.bhl.cdt.ui.e4.parts.logview;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogService;

import net.bhl.cdt.core.pref.CDTPreferencesService;
import net.bhl.cdt.log.service.CDTLogReaderService;
import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.util.constants.StringConstants;
import net.bhl.cdt.util.ui.UIHelper;

public class LogViewPart implements LogListener {
	private static final String[] COLUMN_NAMES = new String[] { StringConstants.EMPTY, "Time", "Type", "Bundle", "Description" };
	private static final int[] COLUMN_WIDTHS = new int[] { 50, 100, 200, 500, 200 };

	private static final String ERRORS_VISIBLE = "errorsVisible";
	private static final String INFOS_VISIBLE = "infosVisible";
	private static final String WARNINGS_VISIBLE = "warningsVisible";
	private static final String DEBUG_VISIBLE = "debugVisible";
	private static final String SELECTED_BUNDLE = "selectedBundle";

	private Button errorsVisibleButton;
	private Button warningsVisibleButton;
	private Button infosVisibleButton;
	private Button debugVisibleButton;

	private TableViewer logTableViewer;

	private static Set<String> msgBundleSet = new HashSet<String>();

	private ArrayList<LogEntry> logList = new ArrayList<LogEntry>();
	private ArrayList<LogEntry> logListFiltered = new ArrayList<LogEntry>();

	private Combo comboBundle;

	@Inject
	private CDTPreferencesService preferencesService;

	@Inject
	private CDTLogReaderService logReaderService;

	@PostConstruct
	public void postConstruct(Composite parent, CDTLogService logger) {
		ExpandBar msgTypeActionBar = new ExpandBar(parent, SWT.NONE);
		Composite composite = new Composite(msgTypeActionBar, SWT.NONE);
		GridLayout layout = new GridLayout(6, false);
		layout.verticalSpacing = 10;
		composite.setLayout(layout);

		errorsVisibleButton = createVisibilityCheckbox(composite, "Errors", LogService.LOG_ERROR, ERRORS_VISIBLE);
		warningsVisibleButton = createVisibilityCheckbox(composite, "Warnings", LogService.LOG_WARNING,
				WARNINGS_VISIBLE);
		infosVisibleButton = createVisibilityCheckbox(composite, "Infos", LogService.LOG_INFO, INFOS_VISIBLE);
		debugVisibleButton = createVisibilityCheckbox(composite, "Debug", LogService.LOG_DEBUG, DEBUG_VISIBLE);

		Label label = new Label(composite, SWT.NULL);
		label.setText("  Select Bundle: ");
		comboBundle = new Combo(composite, SWT.READ_ONLY | SWT.DROP_DOWN);
		// comboBundle.setBounds(50, 50, 150, 50);
		comboBundle.setSize(200, 30);

		Optional<String> selectedBundleOpt = preferencesService.getPreference(SELECTED_BUNDLE);
		if (selectedBundleOpt.isPresent())
			comboBundle.setItems(selectedBundleOpt.get());

		comboBundle.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				preferencesService.setPreference(SELECTED_BUNDLE, comboBundle.getText());
				// filterList();
				// getList();
				// run();
			}
		});

		ExpandItem items = new ExpandItem(msgTypeActionBar, SWT.NONE, 0);
		items.setText("Message Types Action");
		items.setHeight(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		items.setControl(composite);
		items.setExpanded(true);
		msgTypeActionBar.setSpacing(1);

		logTableViewer = new TableViewer(parent, SWT.MULTI | SWT.BORDER | SWT.FILL | SWT.FULL_SELECTION | SWT.V_SCROLL | SWT.H_SCROLL);

		final Table table = logTableViewer.getTable();

		createColumns();

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		logTableViewer.setContentProvider(ArrayContentProvider.getInstance());
		logTableViewer.setInput(logListFiltered);
		
		GridData gridData = new GridData();
        gridData.verticalAlignment = GridData.FILL;
        gridData.horizontalSpan = 2;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalAlignment = GridData.FILL;
        table.setLayoutData(gridData);
        
        // Full Row Selection:
        logTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            private boolean update;
            private ISelection lastSelection;

            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                if (event.getSelection().isEmpty() && !update) {
                    update = true;
                    logTableViewer.setSelection(lastSelection);
                    update = false;
                } else if (!event.getSelection().isEmpty()) {
                    lastSelection = event.getSelection();
                }
            }
        });

		registerLogReader();

		logger.info("CDT Console initialized.");
		logger.error("This is a sample Error Msg");
		logger.error("This is a sample Error Msg 1");
		logger.error("This is a sample Error Msg 2");
		logger.warning("This is a sample Warning Msg");
	}

	private void createColumns() {
		TableViewerColumn col = createTableViewerColumn(COLUMN_NAMES[0], COLUMN_WIDTHS[0], 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			private ResourceManager resourceManager = new LocalResourceManager(JFaceResources.getResources());
			
			@Override
		    public String getText(Object element) {
		        return null;
		    }
			
			@Override
			public Image getImage(Object element) {
				switch (((LogEntry) element).getLevel()) {
				case LogService.LOG_INFO:
					return resourceManager.createImage(UIHelper.getImageDescriptor(FrameworkUtil.getBundle(this.getClass()), "icons/info.png"));
				case LogService.LOG_ERROR:
					return resourceManager.createImage(UIHelper.getImageDescriptor(FrameworkUtil.getBundle(this.getClass()), "icons/error.png"));
				case LogService.LOG_WARNING:
					return resourceManager.createImage(UIHelper.getImageDescriptor(FrameworkUtil.getBundle(this.getClass()), "icons/warning.png"));
				case LogService.LOG_DEBUG:
					return resourceManager.createImage(UIHelper.getImageDescriptor(FrameworkUtil.getBundle(this.getClass()), "icons/debug.png"));
				default:
					return null;
				}
			}
			
			@Override
		    public void dispose() {
		        super.dispose();
		        resourceManager.dispose();
		    }
		});

		col = createTableViewerColumn(COLUMN_NAMES[1], COLUMN_WIDTHS[1], 1);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return new Date(((LogEntry) element).getTime()).toString();
			}
		});

		col = createTableViewerColumn(COLUMN_NAMES[2], COLUMN_WIDTHS[2], 2);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				switch (((LogEntry) element).getLevel()) {
				case LogService.LOG_INFO:
					return "Information";
				case LogService.LOG_ERROR:
					return "Error";
				case LogService.LOG_WARNING:
					return "Warning";
				case LogService.LOG_DEBUG:
					return "Debug";
				default:
					return StringConstants.EMPTY;
				}
			}
		});

		col = createTableViewerColumn(COLUMN_NAMES[3], COLUMN_WIDTHS[3], 3);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((LogEntry) element).getBundle().getSymbolicName();
			}
		});

		col = createTableViewerColumn(COLUMN_NAMES[4], COLUMN_WIDTHS[4], 4);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((LogEntry) element).getMessage();
			}
		});
	}

	private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(logTableViewer, SWT.ICON);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
	}

	private boolean isEntryFiltered(final LogEntry entry) {
		if (filterByEntryLevel(entry.getLevel()))
			return true;

		return false;
	}

	private boolean filterByEntryLevel(int logLevel) {
		switch (logLevel) {
		case LogService.LOG_ERROR:
			return errorsVisibleButton.getSelection();
		case LogService.LOG_WARNING:
			return warningsVisibleButton.getSelection();
		case LogService.LOG_INFO:
			return infosVisibleButton.getSelection();
		case LogService.LOG_DEBUG:
			return debugVisibleButton.getSelection();
		default:
			return false;
		}
	}

	private void addEntry(LogEntry entry) {
		logList.add(entry);

		if (!isEntryFiltered(entry)) {
			logListFiltered.add(entry);
			logTableViewer.refresh();
		}
	}

	private Button createVisibilityCheckbox(Composite parent, String text, int level, String visibilitySettingsKey) {
		Button visibilityCheckbox = new Button(parent, SWT.CHECK | SWT.NULL);
		visibilityCheckbox.setText(text);

		Optional<Boolean> visibilityOpt = preferencesService.getBooleanPreference(visibilitySettingsKey);
		if (visibilityOpt.isPresent())
			visibilityCheckbox.setSelection(visibilityOpt.get());

		visibilityCheckbox.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				preferencesService.setPreference(visibilitySettingsKey,
						Boolean.toString(visibilityCheckbox.getSelection()));

				logListFiltered.clear();
				logListFiltered.addAll(
						logList.stream().filter(entry -> isEntryFiltered(entry) == true).collect(Collectors.toList()));
				logTableViewer.refresh();
			}
		});

		return visibilityCheckbox;
	}

	private void registerLogReader() {
		if (logReaderService != null) {
			logReaderService.addLogListener(this);

			logList.clear();
			logListFiltered.clear();

			Enumeration<?> entries = logReaderService.getLog();
			while (entries.hasMoreElements())
				addEntry((LogEntry) entries.nextElement());
		}
	}

	private void deRegisterLogReader() {
		if (logReaderService != null)
			logReaderService.removeLogListener(this);
	}

	@PreDestroy
	public void preDestroy() {
		deRegisterLogReader();
	}

	// @Focus
	// public void setFocus() {
	// logTable.getTable().setFocus();
	// }

	@Override
	public void logged(LogEntry log) {
		addEntry(log);

		msgBundleSet.add("ALL");
		msgBundleSet.add(log.getBundle().getSymbolicName());
	}
}
