/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.core.log;

import java.util.Iterator;
import java.util.LinkedList;

import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.framework.FrameworkEvent;
import org.osgi.framework.FrameworkListener;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogService;

import net.bhl.cdt.core.log.LogListenerThread;
import net.bhl.cdt.core.log.model.LogEntryImpl;

/**
 * 
 * @author Michael Shamiyeh
 *
 */
public final class CDTLog implements BundleListener, FrameworkListener, ServiceListener {
    private LinkedList<LogEntryImpl> logEntries = new LinkedList<LogEntryImpl>();

    /** The log listener thread. */
    private LogListenerThread listenerThread;

    /** Whether or not to store debug messages. */
    private final boolean storeDebug = false;

    public CDTLog() {
    }

    public synchronized void addEntry(final LogEntryImpl entry) {
	if (!storeDebug && entry.getLevel() == LogService.LOG_DEBUG)
	    return;

	logEntries.add(entry);

	if (listenerThread != null)
	    listenerThread.addEntry(entry);
    }

    public void close() {
	if (listenerThread != null) {
	    listenerThread.shutdown();
	    listenerThread = null;
	}
    }

    public Iterator<LogEntryImpl> getEntryIterator() {
	return logEntries.iterator();
    }

    /**
     * Add a listener to the log.
     * 
     * @param listener
     *            the log listener to subscribe
     */
    public synchronized void addListener(final LogListener listener) {
	if (listenerThread == null) {
	    // create a new listener thread if necessary:
	    // the listener thread only runs if there are any registered
	    // listeners
	    listenerThread = new LogListenerThread();
	    listenerThread.start();
	}
	listenerThread.addListener(listener);
    }

    /**
     * Remove a listener from the log.
     * 
     * @param listener
     *            the log listener to unsubscribe
     */
    public synchronized void removeListener(final LogListener listener) {
	if (listenerThread != null) {
	    listenerThread.removeListener(listener);

	    // shutdown the thread if there are no listeners
	    if (listenerThread.getListenerCount() == 0) {
		listenerThread.shutdown();
		listenerThread = null;
	    }
	}
    }

    /** The messages returned for the framework events. */
    private static final String[] FRAMEWORK_EVENT_MESSAGES = { "FrameworkEvent STARTED", "FrameworkEvent ERROR", "FrameworkEvent PACKAGES REFRESHED", "FrameworkEvent STARTLEVEL CHANGED",
	    "FrameworkEvent WARNING", "FrameworkEvent INFO" };

    /**
     * Called when a framework event occurs.
     * 
     * @param event
     *            the event that occured
     */
    public void frameworkEvent(final FrameworkEvent event) {
	int eventType = event.getType();
	String message = null;

	for (int i = 0; message == null && i < FRAMEWORK_EVENT_MESSAGES.length; ++i) {
	    if (eventType >> i == 1) {
		message = FRAMEWORK_EVENT_MESSAGES[i];
	    }
	}

	addEntry(new LogEntryImpl(event.getBundle(), null, (eventType == FrameworkEvent.ERROR) ? LogService.LOG_ERROR : LogService.LOG_INFO, message, event.getThrowable()));
    }

    /** The messages returned for the bundle events. */
    private static final String[] BUNDLE_EVENT_MESSAGES = { "BundleEvent INSTALLED", "BundleEvent STARTED", "BundleEvent STOPPED", "BundleEvent UPDATED", "BundleEvent UNINSTALLED",
	    "BundleEvent RESOLVED", "BundleEvent UNRESOLVED" };

    /**
     * Called when a bundle event occurs.
     * 
     * @param event
     *            the event that occured
     */
    public void bundleChanged(final BundleEvent event) {
	int eventType = event.getType();
	String message = null;

	for (int i = 0; message == null && i < BUNDLE_EVENT_MESSAGES.length; ++i) {
	    if (eventType >> i == 1) {
		message = BUNDLE_EVENT_MESSAGES[i];
	    }
	}

	if (message != null) {
	    addEntry(new LogEntryImpl(event.getBundle(), null, LogService.LOG_INFO, message, null));
	}
    }

    /** The messages returned for the service events. */
    private static final String[] SERVICE_EVENT_MESSAGES = { "ServiceEvent REGISTERED", "ServiceEvent MODIFIED", "ServiceEvent UNREGISTERING" };

    /**
     * Called when a service event occurs.
     * 
     * @param event
     *            the event that occured
     */
    public void serviceChanged(final ServiceEvent event) {
	int eventType = event.getType();
	String message = null;

	for (int i = 0; message == null && i < SERVICE_EVENT_MESSAGES.length; ++i) {
	    if (eventType >> i == 1) {
		message = SERVICE_EVENT_MESSAGES[i];
	    }
	}

	addEntry(new LogEntryImpl(event.getServiceReference().getBundle(), event.getServiceReference(), (eventType == ServiceEvent.MODIFIED) ? LogService.LOG_DEBUG : LogService.LOG_INFO, message,
		null));
    }
}
