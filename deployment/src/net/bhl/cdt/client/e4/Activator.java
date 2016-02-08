package net.bhl.cdt.client.e4;

import java.util.Locale;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		Locale.setDefault(Locale.US);
//		EMFStoreController.runAsNewThread();
//		System.out.println(EMFStoreController.getInstance() == null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}
}
