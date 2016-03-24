package net.bhl.cdt.client.e4.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

public class ExitOpenCDTHandler {
	@Execute
	public void execute(IWorkbench workbench) {
		workbench.close();
	}
}