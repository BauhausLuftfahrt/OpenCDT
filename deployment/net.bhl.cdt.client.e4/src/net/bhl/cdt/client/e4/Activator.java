package net.bhl.cdt.client.e4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.service.log.LogReaderService;
import org.osgi.util.tracker.ServiceTracker;

import net.bhl.cdt.client.e4.log.ConsoleOSGILogger;

public class Activator implements BundleActivator {

	private static BundleContext context;

	private ConsoleOSGILogger logger = new ConsoleOSGILogger();
	
	private LinkedList<LogReaderService> m_readers = new LinkedList<LogReaderService>();
	
	private ServiceListener m_servlistener = new ServiceListener() {
		public void serviceChanged(ServiceEvent event) {
			BundleContext bc = event.getServiceReference().getBundle().getBundleContext();
			LogReaderService lrs = (LogReaderService)bc.getService(event.getServiceReference());
			if (lrs != null) {
				if (event.getType() == ServiceEvent.REGISTERED) {
					m_readers.add(lrs);
					lrs.addLogListener(logger);
				} else if (event.getType() == ServiceEvent.UNREGISTERING) {
					lrs.removeLogListener(logger);
					m_readers.remove(lrs);
				}
			}
		}
	};
	
	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		Locale.setDefault(Locale.US);
		
		// Move to E4 LifeCycle Manager later/sometime?
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ServiceTracker logReaderTracker = new ServiceTracker(context, org.osgi.service.log.LogReaderService.class.getName(), null);
		logReaderTracker.open();
		Object[] readers = logReaderTracker.getServices();
		if (readers != null) {
			for (int i = 0; i < readers.length; i++) {
				LogReaderService lrs = (LogReaderService)readers[i];
				m_readers.add(lrs);
				lrs.addLogListener(logger);
			}
		}

		// Add the ServiceListener, but with a filter so that we only receive events related to LogReaderService:
		String filter = "(objectclass=" + LogReaderService.class.getName() + ")";
		try {
			context.addServiceListener(m_servlistener, filter);
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		
		for (Iterator<LogReaderService> i = m_readers.iterator(); i.hasNext(); )
		{
			LogReaderService lrs = i.next();
			lrs.removeLogListener(logger);
			i.remove();
		}
	}
}
