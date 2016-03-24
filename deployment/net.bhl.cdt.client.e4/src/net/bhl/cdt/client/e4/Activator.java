package net.bhl.cdt.client.e4;

import java.util.Locale;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
//	private LinkedList<LogReaderService> m_readers = new LinkedList<LogReaderService>();
//	
//	private ConsoleOSGILogger logger = new ConsoleOSGILogger();
//	
//	private ServiceListener m_servlistener = new ServiceListener() {
//        public void serviceChanged(ServiceEvent event)
//        {
//            BundleContext bc = event.getServiceReference().getBundle().getBundleContext();
//            LogReaderService lrs = (LogReaderService)bc.getService(event.getServiceReference());
//            if (lrs != null)
//            {
//                if (event.getType() == ServiceEvent.REGISTERED)
//                {
//                    m_readers.add(lrs);
//                    lrs.addLogListener(logger);
//                } else if (event.getType() == ServiceEvent.UNREGISTERING)
//                {
//                    lrs.removeLogListener(logger);
//                    m_readers.remove(lrs);
//                }
//            }
//        }
//	};
//	
	@Override
	public void start(BundleContext context) throws Exception {
		Locale.setDefault(Locale.US);
		
//		ServiceTracker logReaderTracker = new ServiceTracker(context, org.osgi.service.log.LogReaderService.class.getName(), null);
//        logReaderTracker.open();
//        Object[] readers = logReaderTracker.getServices();
//        if (readers != null)
//        {
//            for (int i=0; i<readers.length; i++)
//            {
//                LogReaderService lrs = (LogReaderService)readers[i];
//                m_readers.add(lrs);
//                lrs.addLogListener(logger);
//            }
//        }
//       
//        // Add the ServiceListener, but with a filter so that we only receive events related to LogReaderService
//        String filter = "(objectclass=" + LogReaderService.class.getName() + ")";
//        try {
//            context.addServiceListener(m_servlistener, filter);
//        } catch (InvalidSyntaxException e) {
//            e.printStackTrace();
//        }
	}

	@Override
	public void stop(BundleContext context) throws Exception {
//		for (Iterator<LogReaderService> i = m_readers.iterator(); i.hasNext(); )
//        {
//            LogReaderService lrs = i.next();
//            lrs.removeLogListener(logger);
//            i.remove();
//        }
	}
}
