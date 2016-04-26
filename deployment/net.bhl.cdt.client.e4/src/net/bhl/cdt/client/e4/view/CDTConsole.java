package net.bhl.cdt.client.e4.view;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class CDTConsole {
	@PostConstruct
	public void createUI(Composite parent) {
		Label label = new Label(parent, SWT.NONE);
	}
}
