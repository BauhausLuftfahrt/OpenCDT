package net.bhl.cdt.ui.e4.parts.logview;

import java.text.SimpleDateFormat;
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

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectToolItem;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogService;

import net.bhl.cdt.core.pref.CDTPreferencesService;
import net.bhl.cdt.log.service.CDTLogReaderService;
import net.bhl.cdt.ui.e4.PluginResources;
import net.bhl.cdt.util.constants.StringConstants;
import net.bhl.cdt.util.ui.UIHelper;

/**
 * 
 * @author Michael Shamiyeh
 * @author Moddasir Khan
 * @since 2017-01-26
 *
 */
public class LogViewPart implements LogListener {
	public static final String PART_ID = "net.bhl.cdt.ui.e4.part.logviewpart";

	public static final String ERRORS_VISIBLE_BT_ID = "net.bhl.cdt.ui.e4.logviewpart.errorsvisible";
	public static final String WARNINGS_VISIBLE_BT_ID = "net.bhl.cdt.ui.e4.logviewpart.warningsvisible";
	public static final String INFOS_VISIBLE_BT_ID = "net.bhl.cdt.ui.e4.logviewpart.infosvisible";
	public static final String DEBUG_VISIBLE_BT_ID = "net.bhl.cdt.ui.e4.logviewpart.debugvisible";

	private static final String[] COLUMN_NAMES = new String[] { StringConstants.EMPTY, "Time", "Description", "Bundle" };
	private static final int[] COLUMN_WIDTHS = new int[] { 25, 125, 500, 250 };
	
	private static final String FILTER_STRING = "net.bhl.cdt";

	private static final String ERRORS_VISIBLE = "errorsVisible";
	private static final String INFOS_VISIBLE = "infosVisible";
	private static final String WARNINGS_VISIBLE = "warningsVisible";
	private static final String DEBUG_VISIBLE = "debugVisible";

	private boolean errorsVisible = true;
	private boolean warningsVisible = true;
	private boolean infosVisible = true;
	private boolean debugVisible = false;

	private TableViewer logTableViewer;

	private static Set<String> msgBundleSet = new HashSet<String>();

	private ArrayList<LogEntry> logList = new ArrayList<LogEntry>();
	private ArrayList<LogEntry> logListFiltered = new ArrayList<LogEntry>();

	@Inject
	private CDTPreferencesService preferencesService;

	@Inject
	private CDTLogReaderService logReaderService;

	public void setErrorsVisible(boolean errorsVisible) {
		this.errorsVisible = errorsVisible;
		preferencesService.setPreference(ERRORS_VISIBLE, Boolean.toString(errorsVisible));
	}

	public void setWarningsVisible(boolean warningsVisible) {
		this.warningsVisible = warningsVisible;
		preferencesService.setPreference(WARNINGS_VISIBLE, Boolean.toString(warningsVisible));
	}

	public void setInfosVisible(boolean infosVisible) {
		this.infosVisible = infosVisible;
		preferencesService.setPreference(INFOS_VISIBLE, Boolean.toString(infosVisible));
	}

	public void setDebugVisible(boolean debugVisible) {
		this.debugVisible = debugVisible;
		preferencesService.setPreference(DEBUG_VISIBLE, Boolean.toString(debugVisible));
	}
	
	@PostConstruct
	public void postConstruct(Composite parent, EModelService modelService, final MPart part) {
		initializeToolbar(modelService, part);

		logTableViewer = new TableViewer(parent,
				SWT.MULTI | SWT.BORDER | SWT.FILL | SWT.FULL_SELECTION | SWT.V_SCROLL | SWT.H_SCROLL);

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
	}

	private void initializeToolbar(EModelService modelService, MPart part) {
		Optional<Boolean> errorsVisibleOpt = preferencesService.getBooleanPreference(ERRORS_VISIBLE);
		if (errorsVisibleOpt.isPresent())
			errorsVisible = errorsVisibleOpt.get();

		Optional<Boolean> warningsVisibleOpt = preferencesService.getBooleanPreference(WARNINGS_VISIBLE);
		if (warningsVisibleOpt.isPresent())
			warningsVisible = warningsVisibleOpt.get();

		Optional<Boolean> infosVisibleOpt = preferencesService.getBooleanPreference(INFOS_VISIBLE);
		if (infosVisibleOpt.isPresent())
			infosVisible = infosVisibleOpt.get();

		Optional<Boolean> debugVisibleOpt = preferencesService.getBooleanPreference(DEBUG_VISIBLE);
		if (debugVisibleOpt.isPresent())
			debugVisible = debugVisibleOpt.get();

		((MDirectToolItem) modelService.find(ERRORS_VISIBLE_BT_ID, part.getToolbar())).setSelected(errorsVisible);
		((MDirectToolItem) modelService.find(WARNINGS_VISIBLE_BT_ID, part.getToolbar())).setSelected(warningsVisible);
		((MDirectToolItem) modelService.find(INFOS_VISIBLE_BT_ID, part.getToolbar())).setSelected(infosVisible);
		((MDirectToolItem) modelService.find(DEBUG_VISIBLE_BT_ID, part.getToolbar())).setSelected(debugVisible);
	}

	private void createColumns() {
		TableViewerColumn col = createTableViewerColumn(COLUMN_NAMES[0], COLUMN_WIDTHS[0], false);
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
					return resourceManager.createImage(UIHelper
							.getImageDescriptor(FrameworkUtil.getBundle(this.getClass()), PluginResources.INFO_ICON));
				case LogService.LOG_ERROR:
					return resourceManager.createImage(UIHelper
							.getImageDescriptor(FrameworkUtil.getBundle(this.getClass()), PluginResources.ERROR_ICON));
				case LogService.LOG_WARNING:
					return resourceManager.createImage(UIHelper.getImageDescriptor(
							FrameworkUtil.getBundle(this.getClass()), PluginResources.WARNING_ICON));
				case LogService.LOG_DEBUG:
					return resourceManager.createImage(UIHelper
							.getImageDescriptor(FrameworkUtil.getBundle(this.getClass()), PluginResources.DEBUG_ICON));
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

		col = createTableViewerColumn(COLUMN_NAMES[1], COLUMN_WIDTHS[1], false);
		col.setLabelProvider(new ColumnLabelProvider() {
			private SimpleDateFormat format = new SimpleDateFormat("[yyyy-MM-dd] HH:mm:ss");
			
			@Override
			public String getText(Object element) {
				return format.format(new Date(((LogEntry) element).getTime()));
			}
		});

		col = createTableViewerColumn(COLUMN_NAMES[2], COLUMN_WIDTHS[2], true);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((LogEntry) element).getMessage();
			}
		});

		col = createTableViewerColumn(COLUMN_NAMES[3], COLUMN_WIDTHS[3], true);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((LogEntry) element).getBundle().getSymbolicName();
			}
		});
	}

	private TableViewerColumn createTableViewerColumn(String title, int bound, boolean resizable) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(logTableViewer, SWT.ICON);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(resizable);
		return viewerColumn;
	}

	private boolean isEntryVisible(final LogEntry entry) {
		if (!getVisibilityByEntryLevel(entry.getLevel()))
			return false;

		if (!getVisiblityByBundlenameFilter(entry.getBundle().getSymbolicName()))
			return false;
		
		return true;
	}

	private boolean getVisibilityByEntryLevel(int logLevel) {
		switch (logLevel) {
		case LogService.LOG_ERROR:
			return errorsVisible;
		case LogService.LOG_WARNING:
			return warningsVisible;
		case LogService.LOG_INFO:
			return infosVisible;
		case LogService.LOG_DEBUG:
			return debugVisible;
		default:
			return false;
		}
	}
	
	private boolean getVisiblityByBundlenameFilter(String bundleName) {
		return bundleName.startsWith(FILTER_STRING);
	}

	private void addEntry(LogEntry entry) {
		logList.add(entry);

		if (isEntryVisible(entry)) {
			logListFiltered.add(entry);
			
			Display.getDefault().asyncExec(new Runnable() {
			    public void run() {
			    	logTableViewer.refresh();
			    	logTableViewer.reveal(entry);
			    }
			});
		}
	}

	public void updateFilter() {
		logListFiltered.clear();
		logListFiltered.addAll(logList.stream().filter(entry -> isEntryVisible(entry)).collect(Collectors.toList()));
		logTableViewer.refresh();
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

	@Override
	public void logged(LogEntry log) {
		addEntry(log);

		msgBundleSet.add("ALL");
		msgBundleSet.add(log.getBundle().getSymbolicName());
	}
}
