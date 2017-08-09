package net.bhl.cdt.literature.model.parsley;

import org.osgi.framework.BundleContext;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class ParsleyActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "net.bhl.cdt.literature.model.parsley"; //$NON-NLS-1$

	// The shared instance
	private static ParsleyActivator plugin;

	public ParsleyActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ParsleyActivator getDefault() {
		return plugin;
	}

}
