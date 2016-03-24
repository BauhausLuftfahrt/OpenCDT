package net.bhl.cdt.client.e4.log;

import java.util.Observable;
import java.util.Observer;

import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.osgi.service.log.LogEntry;

public class CDTLogView implements Observer {
	private static String EOL = System.getProperty("line.separator");
	
	private Text logText;
	
	@Inject
	public CDTLogView(Composite parent, CDTLogManager logMgr) {
		logText = new Text(parent, SWT.MULTI);
		GridData data =  new GridData();
		data.horizontalAlignment = SWT.FILL;
		data.grabExcessHorizontalSpace = true;
		logText.setLayoutData(data);
		
		logMgr.addObserver(this);
		
		LogEntry[] allEntries = logMgr.getAllEntries();
		for(int i = 1; i < allEntries.length; i++)
			logText.append(createLogLine(allEntries[i]));
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		logText.append(createLogLine((LogEntry)arg1));
	}
	
	private String createLogLine(LogEntry entry) {
		return "[" + entry.getBundle().getSymbolicName() + "] " + entry.getMessage() + EOL;
	}

	
}
