package net.bhl.cdt.client.e4.view;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
	/*private JPanel topActionPanel;
	private JCheckBox errorCheckbox;
	private JCheckBox warningCheckbox;
	private JCheckBox infoCheckbox;
	private JCheckBox debugCheckbox;*/

	public CDTConsole() {
		registerLogViewer();
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
		parent.setLayout(new GridLayout());

		/*
		 * text = new StyledText(parent, SWT.MULTI | SWT.BORDER | SWT.WRAP |
		 * SWT.V_SCROLL); text.setLayoutData(new GridData(GridData.FILL_BOTH));
		 */
		Composite topActionPanelSWT = new Composite(parent, SWT.FILL);
		
		Button errorCheck = new Button(topActionPanelSWT, SWT.CHECK);
		errorCheck.setText("Hello");
		
		/*topActionPanel = new JPanel(parent);
		errorCheckbox = new CheckBox("Error Log");
		warningCheckbox = new JCheckBox("Warning Log");
		infoCheckbox = new JCheckBox("Info Log");
		debugCheckbox = new JCheckBox("Debug Log");
		
		topActionPanel.add(errorCheckbox);
		topActionPanel.add(warningCheckbox);
		topActionPanel.add(infoCheckbox);
		topActionPanel.add(debugCheckbox);
		topActionPanel.setVisible(true);

		JCheckBox checkbox = new JCheckBox("Enable logging", true);*/
		
		logTableViewer = new TableViewer(parent);
		Table table = logTableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		for (int i = 0; i < COLUMN_NAMES.length; i++) {
			TableColumn tableColumn = new TableColumn(table, SWT.LEFT);
			tableColumn.setText(COLUMN_NAMES[i]);
			tableColumn.setWidth(COLUMN_WIDTHS[i]);
		}

		logTableViewer.setContentProvider(new ModelContentProvider());
		logTableViewer.setLabelProvider(new ModelLabelProvider());

		logger.info("CDT Console initialized.");
		logger.error("This is a sample Error Msg");
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

		Display.getDefault().asyncExec(new Runnable() {

			public void run() {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

				/*
				 * //Object newLine = new Date(log.getTime()).toString() + ": "
				 * + log.getMessage() + " [" + log.getBundle() + "]";
				 * //logTable.add(newLine); //logTable.reveal(newLine);
				 * /*text.append( log.getLevel() +"[" +
				 * log.getBundle().getSymbolicName() + "] " + log.getMessage() +
				 * " ( " + dateFormat.format(new Date(log.getTime())).toString()
				 * + " ) " + System.getProperty("line.separator"));
				 */

				logList.add(log);

				final List<Model> models = new ArrayList<Model>();

				for (int i = 0; i < logList.size(); i++)
					models.add(new Model(String.valueOf(logList.get(i).getLevel()),
							String.valueOf(logList.get(i).getLevel()), logList.get(i).getBundle().getSymbolicName(),
							logList.get(i).getMessage(),
							dateFormat.format(new Date(logList.get(i).getTime())).toString()));

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
		}

	}

	/*
	 * Label provider for logTableViewer
	 */
	static class ModelLabelProvider extends LabelProvider implements ITableLabelProvider {

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			// no image to show
			/*Image image = null;
			if (!(element instanceof Model)) {
				return null;
			}

			Model model = (Model) element;
			Display display = new Display();

			switch (columnIndex) {
			case 0:
				image = new Image(display, model.getMsgTypeIcon());
				GC gc = new GC(image);
				Rectangle bounds = image.getBounds();
				gc.drawLine(0, 0, bounds.width, bounds.height);
				gc.drawLine(0, bounds.height, bounds.width, 0);

				return image;
			default:
				break;
			}*/
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
			msgTypeIconMap.put("1", "icons/error.PNG");
			msgTypeIconMap.put("2", "icons/warning.PNG");
			msgTypeIconMap.put("3", "icons/info.PNG");
			msgTypeIconMap.put("4", "icons/debug.PNG");

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
				if (key.contentEquals(msgTypeIcon))
					msgTypeIcon = msgTypeIconMap.get(key);
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
