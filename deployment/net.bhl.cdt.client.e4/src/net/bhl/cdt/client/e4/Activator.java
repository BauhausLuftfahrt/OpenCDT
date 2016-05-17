package net.bhl.cdt.client.e4;

import java.util.Locale;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private static LogService logService;
	
	public static BundleContext getContext() {
		return context;
	}
	
	public static LogService getLogService() {
		return logService;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		Locale.setDefault(Locale.US);
		
		ServiceReference ref = context.getServiceReference(LogService.class.getName());
        if (ref != null)
        {
        	logService = (LogService)context.getService(ref);
        }
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;	
	}
}