package net.bhl.cdt.client.e4.view;

import java.util.Observable;
import java.util.Observer;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.osgi.service.log.LogEntry;

import net.bhl.cdt.client.e4.log.CDTLogManager;

public class CDTConsole implements Observer {
	private StyledText text;
	
	@PostConstruct
	public void createUI(Composite parent, CDTLogManager logManager) {
		parent.setLayout(new FillLayout());
		
		text = new StyledText(parent, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
	    text.setLayoutData(new GridData(GridData.FILL_BOTH));
	    
	    logManager.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		text.setText(((LogEntry)arg1).getMessage());
	}
}
