package net.bhl.cdt.client.e4.view;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;

import net.bhl.cdt.client.e4.Activator;
import net.bhl.cdt.log.service.CDTLogReaderService;
import net.bhl.cdt.log.service.CDTLogService;

public class CDTConsole implements LogListener {
	//private TableViewer logTable;
	
	private StyledText text;
	
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
	public void createUI(Composite parent, CDTLogService logger) {
		parent.setLayout(new FillLayout());
		
		text = new StyledText(parent, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
	    text.setLayoutData(new GridData(GridData.FILL_BOTH));
	    
	    logger.info("CDT Console initialized.");
	}
	
//	@PostConstruct
//	public void createUI(Composite parent) {
//		parent.setLayout(new GridLayout(1, false));
//
//		logTable = new TableViewer(parent, SWT.NONE);
//		logTable.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
//	}

//	@Focus
//	public void setFocus() {
//		logTable.getTable().setFocus();
//	}

	@Override
	public void logged(LogEntry log) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				//Object newLine = new Date(log.getTime()).toString() + ": " + log.getMessage() + " [" + log.getBundle() + "]";
				//logTable.add(newLine);
				//logTable.reveal(newLine);
				text.append("[" + log.getBundle().getSymbolicName() + "] " + log.getMessage() + System.getProperty("line.separator"));
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
}
