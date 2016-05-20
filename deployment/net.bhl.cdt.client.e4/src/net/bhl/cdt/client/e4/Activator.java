package net.bhl.cdt.client.e4;

import java.util.Locale;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogReaderService;
import org.osgi.service.log.LogService;

import net.bhl.cdt.client.e4.log.CDTLogManager;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private static CDTLogManager logManager;

	public static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.
	 * BundleContext)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		Locale.setDefault(Locale.US);

		logManager = new CDTLogManager();

		context.addBundleListener(logManager);
		context.addFrameworkListener(logManager);
		context.addServiceListener(logManager);

		//context.registerService(LogService.class.getName(), new LogServiceFactory(m_log), null);

		//context.registerService(LogReaderService.class.getName(), new LogReaderServiceFactory(m_log), null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
}