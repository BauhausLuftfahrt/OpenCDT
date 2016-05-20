package net.bhl.cdt.client.e4.log;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogReaderService;

public class CDTLogReaderService implements LogReaderService
{
    /** The log implementation. */
    private final CDTLogManager m_log;
    /** The listeners associated with this service. */
    private final List m_listeners = new Vector();

    /**
     * Create a new instance.
     * @param log the log implementation
     */
    public CDTLogReaderService(final CDTLogManager log)
    {
        this.m_log = log;
    }

    /**
     * This method is used to subscribe to the Log Reader Service in order to receive
     * log messages as they occur.  Unlike the previously recorded log entries, all
     * log messages must be sent to subscribers of the Log Reader Service as they are
     * recorded.
     * <p>
     * A subscriber to the Log Reader Service must implement the {@link LogListener}
     * interface.
     * <p>
     * After a subscription of the Log Reader Service has been started, the subscriber's
     * {@link LogListener#logged(LogEntry)} method must be called with a {@link LogEntry}
     * object for the message each time a message is logged.
     * @param listener the listener object to subscribe
     */
    public synchronized void addLogListener(final LogListener listener)
    {
        m_listeners.add(listener);
        m_log.addListener(listener);
    }

    /**
     * This method is used to unsubscribe from the Log Reader Service.
     * @param listener the listener object to unsubscribe
     */
    public synchronized void removeLogListener(final LogListener listener)
    {
        m_listeners.remove(listener);
        m_log.removeListener(listener);
    }

    /**
     * This method retrieves past log entries as an enumeration with the most recent
     * entry first.
     * @return an enumeration of the {@link LogEntry} objects that have been stored
     */
    public Enumeration getLog()
    {
    	return null;
        //return m_log.getEntries();
    }
    
    /**
     * Remove all log listeners registered through this service.
     */
    synchronized void removeAllLogListeners()
    {
        Iterator listenerIt = m_listeners.iterator();
        while (listenerIt.hasNext())
        {
            LogListener listener = (LogListener) listenerIt.next();
            m_log.removeListener(listener);
        }
    }
}
