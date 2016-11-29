package net.bhl.cdt.client.e4.view;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;

import net.bhl.cdt.client.e4.Activator;
import net.bhl.cdt.log.service.CDTLogReaderService;
import net.bhl.cdt.log.service.CDTLogService;

public class CDTConsole implements LogListener {
	// private StyledText text;
	private TableViewer logTableViewer;
	private String[] COLUMN_NAMES = new String[] { " ", "Type", "Bundle", "Description", "Date-Time" };
	private int[] COLUMN_WIDTHS = new int[] { 50, 100, 200, 500, 200 };
	private static Map<String, String> msgTypeMap;
	private static Map<String, String> msgTypeIconMap;
	private List<LogEntry> logList = new ArrayList<LogEntry>();
	private List<LogEntry> selectedLogList = new ArrayList<LogEntry>();
	private static File propertiesFile = new File("msgConfig.properties");
	private static String errorChecked = "false", infoChecked = "false", warningChecked = "false",
			debugChecked = "false";
	private Button errorCheckbox, warningCheckbox, infoCheckbox, debugCheckbox;
	private int errFlag = 0;

	public CDTConsole() {
		registerLogViewer();

		if (propertiesFile.exists() && propertiesExist(propertiesFile)) {
			// System.out.println("Properties file was found and is intact");
			;
		} else {
			// System.out.println("Properties file is being created");
			createProperties(propertiesFile);
			// System.out.println("Properties was created!");
		}

	}

	public static boolean propertiesExist(File propertiesFile) {
		Properties prop = new Properties();
		InputStream input = null;
		boolean exists = false;

		try {
			input = new FileInputStream(propertiesFile);

			prop.load(input);

			exists = prop.getProperty("errorChecked") != null && prop.getProperty("warningChecked") != null
					&& prop.getProperty("infoChecked") != null && prop.getProperty("debugChecked") != null;

			if (prop.getProperty("errorChecked") != null && prop.getProperty("warningChecked") != null
					&& prop.getProperty("infoChecked") != null && prop.getProperty("debugChecked") != null) {
				errorChecked = prop.getProperty("errorChecked");
				warningChecked = prop.getProperty("warningChecked");
				infoChecked = prop.getProperty("infoChecked");
				debugChecked = prop.getProperty("debugChecked");
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return exists;
	}

	public static void createProperties(File propertiesFile) {
		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream(propertiesFile);

			prop.setProperty("errorChecked", "false");
			prop.setProperty("warningChecked", "false");
			prop.setProperty("infoChecked", "false");
			prop.setProperty("debugChecked", "false");

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void setProperties(String checkedItem, String checkedValue) {

		Properties prop = new Properties();
		OutputStream output = null;

		try {

			FileInputStream in = new FileInputStream(propertiesFile);
			prop.load(in);
			in.close();

			output = new FileOutputStream(propertiesFile);

			if ((!checkedItem.isEmpty() && checkedItem != null) && (!checkedValue.isEmpty() && checkedValue != null)) {

				prop.setProperty(checkedItem, checkedValue);
				// System.out.println(checkedItem + " " + checkedValue);
			}

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void registerLogViewer() {
		ServiceReference ref = Activator.getContext().getServiceReference(CDTLogReaderService.class.getName());
		if (ref != null) {
			CDTLogReaderService reader = (CDTLogReaderService) Activator.getContext().getService(ref);
			reader.addLogListener(this);
		}
	}

	@PostConstruct
	public void createUI(Composite parent, CDTLogService logger) {
		propertiesExist(propertiesFile);
		ExpandBar msgTypeActionBar = new ExpandBar(parent, SWT.NONE);
		Composite composite = new Composite(msgTypeActionBar, SWT.NONE);
		GridLayout layout = new GridLayout(6, true);
		layout.verticalSpacing = 10;
		composite.setLayout(layout);

		errorCheckbox = new Button(composite, SWT.CHECK | SWT.NULL);
		errorCheckbox.setText("Error Log");

		if (errorChecked.equalsIgnoreCase("true"))
			errorCheckbox.setSelection(true);

		warningCheckbox = new Button(composite, SWT.CHECK | SWT.NULL);
		warningCheckbox.setText("Warning Log");

		if (warningChecked.equalsIgnoreCase("true"))
			warningCheckbox.setSelection(true);

		infoCheckbox = new Button(composite, SWT.CHECK | SWT.NULL);
		infoCheckbox.setText("Info Log");

		if (infoChecked.equalsIgnoreCase("true"))
			infoCheckbox.setSelection(true);

		debugCheckbox = new Button(composite, SWT.CHECK | SWT.NULL);
		debugCheckbox.setText("Debug Log");

		if (debugChecked.equalsIgnoreCase("true"))
			debugCheckbox.setSelection(true);

		Label label = new Label(composite, SWT.NULL);
		label.setText("Select Bundle: ");
		final Combo comboBundle = new Combo(composite, SWT.READ_ONLY);
		comboBundle.setBounds(50, 50, 150, 65);
		String bundleItems[] = { "Item One", "Item Two", "Item Three", "Item Four", "Item Five" };
		comboBundle.setItems(bundleItems);

		ExpandItem items = new ExpandItem(msgTypeActionBar, SWT.NONE, 0);
		items.setText("Message Types Action");
		items.setHeight(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		items.setControl(composite); // item0.setImage(image);
		items.setExpanded(true);
		msgTypeActionBar.setSpacing(1);

		logTableViewer = new TableViewer(parent, SWT.SINGLE | SWT.BORDER | SWT.FILL | SWT.V_SCROLL | SWT.H_SCROLL);
		Table table = logTableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_END));

		for (int i = 0; i < COLUMN_NAMES.length; i++) {
			TableColumn tableColumn = new TableColumn(table, SWT.LEFT);
			tableColumn.setText(COLUMN_NAMES[i]);
			tableColumn.setWidth(COLUMN_WIDTHS[i]);

		}

		table.addListener(SWT.SetData, new Listener() {
			@Override
			public void handleEvent(Event event) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * text = new StyledText(parent, SWT.MULTI | SWT.BORDER | SWT.WRAP |
		 * SWT.V_SCROLL); text.setLayoutData(new GridData(GridData.FILL_BOTH));
		 */

		logger.info("CDT Console initialized.");
		logger.error("This is a sample Error Msg");
		logger.error("This is a sample Error Msg 1");
		logger.error("This is a sample Error Msg 2");
		logger.warning("This is a sample Warning Msg");
	}

	// @PostConstruct
	// public void createUI(Composite parent) {
	// parent.setLayout(new GridLayout(1, false));
	//
	// logTable = new TableViewer(parent, SWT.NONE);
	// logTable.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
	// }

	// @Focus
	// public void setFocus() {
	// logTable.getTable().setFocus();
	// }

	@Override
	public void logged(LogEntry log) {
		logList.add(log);
		Display.getDefault().asyncExec(new Runnable() {

			public void run() {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

				errorCheckbox.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						Button button = (Button) e.widget;

						if (button.getSelection()) {
							setProperties("errorChecked", "true");
							System.out.println("True Condition");
							// if (log.getLevel() == 1) {
							//
							// if (errFlag == 0) {
							// selectedLogList.clear();
							// System.out.println(
							// "Array Size True : " + logList.size() + " " +
							// selectedLogList.size());
							//
							// run();
							// errFlag = 1;
							// }
							// }

						} else {
							setProperties("errorChecked", "false");

							System.out.println("False Condition" );
							//
							// System.out.println("Array Size false : " +
							// logList.size() + " " + selectedLogList.size());
							// if (log.getLevel() == 1) {
							//
							// if (errFlag == 1) {
							// selectedLogList.clear();
							// run();
							// errFlag = 0;
							//
							// }
							//
							// }
						}
					}
				});
				//
				// warningCheckbox.addSelectionListener(new SelectionAdapter() {
				// @Override
				// public void widgetSelected(SelectionEvent e) {
				// Button button = (Button) e.widget;
				// if (button.getSelection()) {
				// setProperties("warningChecked", "true");
				// if (log.getLevel() == 2) {
				// // System.out.println("True Condition");
				// if (flag == 0) {
				// // selectedLogList.clear();
				// run();
				// }
				// }
				// } else {
				// setProperties("warningChecked", "false");
				// if (flag == 0) {
				// // selectedLogList.clear();
				// System.out
				// .println("Array Size false : " + logList.size() + " " +
				// selectedLogList.size());
				// run();
				// }
				// }
				// }
				// });

				// infoCheckbox.addSelectionListener(new SelectionAdapter() {
				// @Override
				// public void widgetSelected(SelectionEvent e) {
				// Button button = (Button) e.widget;
				// if (button.getSelection()) {
				// setProperties("infoChecked", "true");
				// if (log.getLevel() == 3) {
				// if (flag == 0) {
				// // selectedLogList.clear();
				// run();
				// }
				// }
				// } else {
				// setProperties("infoChecked", "false");
				// if (flag == 0) {
				// // selectedLogList.clear();
				// System.out
				// .println("Array Size false : " + logList.size() + " " +
				// selectedLogList.size());
				// run();
				// }
				// }
				// }
				// });
				//
				// debugCheckbox.addSelectionListener(new SelectionAdapter() {
				// @Override
				// public void widgetSelected(SelectionEvent e) {
				// Button button = (Button) e.widget;
				// if (button.getSelection()) {
				// setProperties("debugChecked", "true");
				// if (log.getLevel() == 4) {
				// if (flag == 0) {
				// // selectedLogList.clear();
				// run();
				// }
				// }
				// } else {
				// setProperties("debugChecked", "false");
				// if (flag == 0) {
				// // selectedLogList.clear();
				// System.out
				// .println("Array Size false : " + logList.size() + " " +
				// selectedLogList.size());
				// run();
				// }
				// }
				// }
				// });

				selectedLogList.clear();

				if (errorChecked.equalsIgnoreCase("false") && warningChecked.equalsIgnoreCase("false")
						&& infoChecked.equalsIgnoreCase("false") && debugChecked.equalsIgnoreCase("false")) {
					System.out.println("Array Size IF : " + logList.size() + " " + selectedLogList.size());
					// selectedLogList = logList;
					for (int i = 0; i < logList.size(); i++) {
						selectedLogList.add(logList.get(i));
					}
				} else {
					for (int i = 0; i < logList.size(); i++) {
						if (errorChecked.equalsIgnoreCase("true") && logList.get(i).getLevel() == 1) {
							// System.out.println("err Value : " + i);

							selectedLogList.add(logList.get(i));
						}
						if (warningChecked.equalsIgnoreCase("true") && logList.get(i).getLevel() == 2) {
							// System.out.println("war Value : " + i);

							selectedLogList.add(logList.get(i));

						}
						if (infoChecked.equalsIgnoreCase("true") && logList.get(i).getLevel() == 3) {
							// System.out.println("info Value : " + i);

							selectedLogList.add(logList.get(i));

						}
						if (debugChecked.equalsIgnoreCase("true") && logList.get(i).getLevel() == 4) {
							// System.out.println("deb Value : " + i);

							selectedLogList.add(logList.get(i));

						}

					}
				}

				System.out.println("Array Size : " + logList.size() + " " + selectedLogList.size());

				final List<Model> models = new ArrayList<Model>();

				// for (int i = 0; i < logList.size(); i++) {
				//
				// models.add(new
				// Model(String.valueOf(logList.get(i).getLevel()),
				// String.valueOf(logList.get(i).getLevel()),
				// logList.get(i).getBundle().getSymbolicName(),
				// logList.get(i).getMessage(),
				// dateFormat.format(new
				// Date(logList.get(i).getTime())).toString()));
				// }

				for (int i = 0; i < selectedLogList.size(); i++) {

					models.add(new Model(String.valueOf(selectedLogList.get(i).getLevel()),
							String.valueOf(selectedLogList.get(i).getLevel()),
							selectedLogList.get(i).getBundle().getSymbolicName(), selectedLogList.get(i).getMessage(),
							dateFormat.format(new Date(selectedLogList.get(i).getTime())).toString()));
				}

				logTableViewer.setContentProvider(new ModelContentProvider());
				logTableViewer.setLabelProvider(new ModelLabelProvider());
				logTableViewer.setInput(models);

			}
		});
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PreDestroy
	public void deRegisterLogListener() {
		ServiceReference ref = Activator.getContext().getServiceReference(CDTLogReaderService.class.getName());
		if (ref != null) {
			CDTLogReaderService reader = (CDTLogReaderService) Activator.getContext().getService(ref);
			reader.removeLogListener(this);
		}
	}

	/*
	 * Content provider for logTableViewer
	 */
	static class ModelContentProvider implements IStructuredContentProvider {

		@SuppressWarnings("unchecked")
		@Override
		public Object[] getElements(Object inputElement) {
			// The inputElement comes from view.setInput()
			if (inputElement instanceof List) {
				List<Model> models = (List<Model>) inputElement;
				return models.toArray();
			}
			return new Object[0];
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// System.out.println(" Hello : " + newInput.toString());
		}

	}

	/*
	 * Label provider for logTableViewer
	 */
	static class ModelLabelProvider extends LabelProvider implements ITableLabelProvider {

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			// each element comes from the ContentProvider.getElements(Object)
			// if (!(element instanceof Model)) {
			// return null;
			// }
			//
			// Model model = (Model) element;
			// Image image = null;
			//
			// switch (columnIndex) {
			// case 0:
			// image = model.getMsgTypeIcon();
			// return image;
			// default:
			// break;
			//
			// }

			return null;
		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			// each element comes from the ContentProvider.getElements(Object)
			if (!(element instanceof Model)) {
				return "";
			}

			Model model = (Model) element;

			switch (columnIndex) {

			case 0:
				return model.getMsgTypeIcon();
			case 1:
				return model.getMsgTypeLevel();
			case 2:
				return model.getMsgTypeBundle();
			case 3:
				return model.getMsgDescription();
			case 4:
				return model.getMsgDateTime();
			default:
				break;
			}
			return "";
		}
	}

	/*
	 * Data Model for logTableViewer
	 */
	static class Model {
		private String msgTypeIcon;
		private String msgTypeLevel;
		private String msgTypeBundle;
		private String msgDescription;
		private String msgDateTime;

		public Model(String msgTypeIcon, String msgTypeLevel, String msgTypeBundle, String msgDescription,
				String msgDateTime) {
			super();

			msgTypeIconMap = new HashMap<String, String>();

			msgTypeIconMap.put("1", "errorIcon");
			msgTypeIconMap.put("2", "warningIcon");
			msgTypeIconMap.put("3", "infoIcon");
			msgTypeIconMap.put("4", "debugIcon");

			// msgTypeIconMap.put("1", "icons/error.PNG");
			// msgTypeIconMap.put("2", "icons/warning.PNG");
			// msgTypeIconMap.put("3", "icons/info.PNG");
			// msgTypeIconMap.put("4", "icons/debug.PNG");

			// msgTypeIconMap.put("1", "SWT.ICON_ERROR");
			// msgTypeIconMap.put("2", "SWT.ICON_WARNING");
			// msgTypeIconMap.put("3", "SWT.ICON_INFORMATION");
			// msgTypeIconMap.put("4", "SWT.ICON_DEBUG");

			msgTypeMap = new HashMap<String, String>();
			msgTypeMap.put("1", "Error");
			msgTypeMap.put("2", "Warning");
			msgTypeMap.put("3", "Info");
			msgTypeMap.put("4", "Debug");

			this.msgTypeIcon = msgTypeIcon;
			this.msgTypeLevel = msgTypeLevel;
			this.msgTypeBundle = msgTypeBundle;
			this.msgDescription = msgDescription;
			this.msgDateTime = msgDateTime;
		}

		public String getMsgTypeIcon() {

			Iterator<String> itr = msgTypeIconMap.keySet().iterator();

			while (itr.hasNext()) {
				String key = itr.next();
				if (key.contentEquals(msgTypeIcon)) {
					msgTypeIcon = msgTypeIconMap.get(key);
				}

			}

			return msgTypeIcon;
		}

		public void setMsgTypeIcon(String msgTypeIcon) {
			this.msgTypeIcon = msgTypeIcon;
		}

		public String getMsgTypeLevel() {
			Iterator<String> itr = msgTypeMap.keySet().iterator();

			while (itr.hasNext()) {
				String key = itr.next();
				if (key.contentEquals(msgTypeLevel))
					msgTypeLevel = msgTypeMap.get(key);
			}

			return msgTypeLevel;
		}

		public void setMsgTypeLevel(String msgTypeLevel) {
			this.msgTypeLevel = msgTypeLevel;
		}

		public String getMsgTypeBundle() {
			return msgTypeBundle;
		}

		public void setMsgTypeBundle(String msgTypeBundle) {
			this.msgTypeBundle = msgTypeBundle;
		}

		public String getMsgDescription() {
			return msgDescription;
		}

		public void setMsgDescription(String msgDescription) {
			this.msgDescription = msgDescription;
		}

		public String getMsgDateTime() {
			return msgDateTime;
		}

		public void setMsgDateTime(String msgDateTime) {
			this.msgDateTime = msgDateTime;
		}

	}

}