package net.bhl.cdt.client.e4;

import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.e4.ui.workbench.lifecycle.PreSave;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessAdditions;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessRemovals;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.service.log.LogReaderService;
import org.osgi.util.tracker.ServiceTracker;

import net.bhl.cdt.client.e4.log.CDTLogManager;
import net.bhl.cdt.client.e4.log.ConsoleOSGILogger;

/**
 * This is a stub implementation containing e4 LifeCycle annotated methods.<br />
 * There is a corresponding entry in <em>plugin.xml</em> (under the
 * <em>org.eclipse.core.runtime.products' extension point</em>) that references
 * this class.
 **/
@SuppressWarnings("restriction")
public class E4LifeCycle {
	private CDTLogManager logMgr;
	
	private ConsoleOSGILogger logger = new ConsoleOSGILogger();
	
	private LinkedList<LogReaderService> m_readers = new LinkedList<LogReaderService>();
	
	private ServiceListener m_servlistener = new ServiceListener() {
        public void serviceChanged(ServiceEvent event)
        {
            BundleContext bc = event.getServiceReference().getBundle().getBundleContext();
            LogReaderService lrs = (LogReaderService)bc.getService(event.getServiceReference());
            if (lrs != null)
            {
                if (event.getType() == ServiceEvent.REGISTERED)
                {
                    m_readers.add(lrs);
                    lrs.addLogListener(logMgr);
                    lrs.addLogListener(logger);
                } else if (event.getType() == ServiceEvent.UNREGISTERING)
                {
                    lrs.removeLogListener(logMgr);
                    lrs.removeLogListener(logger);
                    m_readers.remove(lrs);
                }
            }
        }
	};
	
	@PostContextCreate
	void postContextCreate(IEclipseContext workbenchContext) {
		logMgr = new CDTLogManager();

		InitializeLogging(FrameworkUtil.getBundle(this.getClass()).getBundleContext());
		
		workbenchContext.set(CDTLogManager.class, logMgr);
	}

	@PreSave
	void preSave(IEclipseContext workbenchContext) {
	}

	@ProcessAdditions
	void processAdditions(IEclipseContext workbenchContext) {
	}

	@ProcessRemovals
	void processRemovals(IEclipseContext workbenchContext) {
		for (Iterator<LogReaderService> i = m_readers.iterator(); i.hasNext(); )
        {
            LogReaderService lrs = i.next();
            lrs.removeLogListener(logMgr);
            lrs.removeLogListener(logger);
            i.remove();
        }
	}
	
	private void InitializeLogging(BundleContext context) {
		ServiceTracker logReaderTracker = new ServiceTracker(context, org.osgi.service.log.LogReaderService.class.getName(), null);
		logReaderTracker.open();
        Object[] readers = logReaderTracker.getServices();
        if (readers != null)
        {
            for (int i=0; i<readers.length; i++)
            {
                LogReaderService lrs = (LogReaderService)readers[i];
                m_readers.add(lrs);
                lrs.addLogListener(logMgr);
                lrs.addLogListener(logger);
            }
        }
       
        // Add the ServiceListener, but with a filter so that we only receive events related to LogReaderService
        String filter = "(objectclass=" + LogReaderService.class.getName() + ")";
        try {
            context.addServiceListener(m_servlistener, filter);
        } catch (InvalidSyntaxException e) {
            e.printStackTrace();
        }
	}
}
