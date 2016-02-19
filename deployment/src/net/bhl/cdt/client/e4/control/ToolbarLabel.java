package net.bhl.cdt.client.e4.control;

import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class ToolbarLabel {
	@Inject
	public ToolbarLabel(Composite composite, Shell shell) {
		Label l = new Label(composite, SWT.NONE);
		l.setText("GUCHU");
	}
}
