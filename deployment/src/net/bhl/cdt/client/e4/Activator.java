package net.bhl.cdt.client.e4;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Controls the starting and stopping of the client bundle.
 * 
 * @author raoul.rothfeld
 *
 */
public class Activator implements BundleActivator {

	/** Shared singleton instance */
	private static BundleContext CONTEXT;

	/**
	 * Retrieve bundle context instance.
	 * 
	 * @return shared singleton instance
	 */
	static BundleContext getContext() {
		return CONTEXT;
	}

	/*
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.CONTEXT = bundleContext;
	}

	/*
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.CONTEXT = null;
	}
}
