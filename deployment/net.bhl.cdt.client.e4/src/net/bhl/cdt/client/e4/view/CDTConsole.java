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
import org.osgi.service.log.LogReaderService;
import org.osgi.service.log.LogService;

import net.bhl.cdt.client.e4.Activator;
import net.bhl.cdt.client.e4.log.CDTLogManager;

public class CDTConsole implements LogListener {
	private StyledText text;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostConstruct
	public void createUI(Composite parent, CDTLogManager logManager, LogService logger) {
		parent.setLayout(new FillLayout());
		
		text = new StyledText(parent, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
	    text.setLayoutData(new GridData(GridData.FILL_BOTH));
	    
	    ServiceReference ref = Activator.getContext().getServiceReference(LogReaderService.class.getName());
	    if (ref != null)
	    {
	        LogReaderService reader = (LogReaderService) Activator.getContext().getService(ref);
	        reader.addLogListener(this);
	    }
	    
	    logger.log(LogService.LOG_INFO, "CDT Console initialized.");
	}

	@Override
	public void logged(LogEntry log) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				text.append("[" + log.getBundle().getSymbolicName() + "] " + log.getMessage() + System.getProperty("line.separator"));
			}
		});
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PreDestroy
	public void deRegisterLogListener() {
		ServiceReference ref = Activator.getContext().getServiceReference(LogReaderService.class.getName());
	    if (ref != null)
	    {
	        LogReaderService reader = (LogReaderService) Activator.getContext().getService(ref);
	        reader.removeLogListener(this);
	    }
	}
}
