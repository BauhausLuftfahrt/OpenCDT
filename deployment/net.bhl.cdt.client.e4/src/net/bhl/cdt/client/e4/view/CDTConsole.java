package net.bhl.cdt.client.e4.view;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogService;

import net.bhl.cdt.client.e4.Activator;
import net.bhl.cdt.log.service.CDTLogReaderService;

public class CDTConsole implements LogListener {
	private TableViewer logTable;
	
	//private StyledText text;
	
	public CDTConsole() {
		registerLogViewer();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void registerLogViewer() {
		ServiceReference ref = Activator.getContext().getServiceReference(CDTLogReaderService.class.getName());
	    if (ref != null)
	    {
	        CDTLogReaderService reader = (CDTLogReaderService)Activator.getContext().getService(ref);
	        reader.addLogListener(this);
	    }
	}
	
	@PostConstruct
	public void createUI(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		logTable = new TableViewer(parent, SWT.NONE);
		
		createColumns(logTable);
		
		final Table table = logTable.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		logTable.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
	}

	@Focus
	public void setFocus() {
		logTable.getTable().setFocus();
	}
	
	private void createColumns(TableViewer logTable) {
		TableViewerColumn colTime = new TableViewerColumn(logTable, SWT.NONE);
		colTime.getColumn().setWidth(200);
		colTime.getColumn().setText("Time");
		colTime.setLabelProvider(new LineColorLabelProvider() {
			@Override
			public String getText(Object element) {
			  return new Date(((LogEntry)element).getTime()).toString();
		}});

		// create more text columns if required...

		// create column for married property of Person
		// uses getImage() method instead of getText()
		// CHECKED and UNCHECK are fields of type Image

		TableViewerColumn colMessage = new TableViewerColumn(logTable, SWT.NONE);
		colMessage.getColumn().setWidth(200);
		colMessage.getColumn().setText("Message");
		colMessage.setLabelProvider(new LineColorLabelProvider() {
			@Override
			public String getText(Object element) {
			  return ((LogEntry)element).getMessage();
		}});
		
		TableViewerColumn colBundle = new TableViewerColumn(logTable, SWT.NONE);
		colBundle.getColumn().setWidth(200);
		colBundle.getColumn().setText("Message");
		colBundle.setLabelProvider(new LineColorLabelProvider() {
			@Override
			public String getText(Object element) {
			  return ((LogEntry)element).getMessage();
		}});
	}
	

	@Override
	public void logged(LogEntry log) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				String[] newLine = new String[] {new Date(log.getTime()).toString(), log.getMessage(), log.getBundle().getSymbolicName() };
				
				logTable.add(newLine);
				logTable.reveal(newLine);
			}
		});
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PreDestroy
	public void deRegisterLogListener() {
		ServiceReference ref = Activator.getContext().getServiceReference(CDTLogReaderService.class.getName());
	    if (ref != null)
	    {
	        CDTLogReaderService reader = (CDTLogReaderService) Activator.getContext().getService(ref);
	        reader.removeLogListener(this);
	    }
	}
	
	public class LineColorLabelProvider extends ColumnLabelProvider {
	    @Override
	    public void update(ViewerCell cell)
	    {
	        Object element = cell.getElement();
	        if(element instanceof LogEntry)
	        {
	        	LogEntry log = (LogEntry)element;

				switch (log.getLevel()) {
				case LogService.LOG_INFO:
					cell.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
					break;
				case LogService.LOG_WARNING:
					cell.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_YELLOW));
					break;
				case LogService.LOG_ERROR:
					cell.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
					break;
				case LogService.LOG_DEBUG:
					cell.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_GRAY));
					break;
				}
	        }
	    }
	}
}
