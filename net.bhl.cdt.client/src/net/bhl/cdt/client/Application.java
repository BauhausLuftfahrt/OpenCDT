package net.bhl.cdt.client;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import net.bhl.cdt.client.ui.ApplicationWorkbenchAdvisor;

public class Application implements IApplication {
	@Override
	public Object start(IApplicationContext context) throws Exception {
		Display display = PlatformUI.createDisplay();
		PlatformUI.createAndRunWorkbench(display, new ApplicationWorkbenchAdvisor());
		return null;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
}
