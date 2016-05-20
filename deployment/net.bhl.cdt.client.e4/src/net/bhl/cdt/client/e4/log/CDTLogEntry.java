/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.client.e4.log;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogEntry;

/**
 * Implementation of the OSGi {@link LogEntry} interface.
 * <p>
 * Provides methods to access the information contained in an individual Log
 * Service log entry.
 * <p>
 * A LogEntry object may be acquired from the
 * {@link org.osgi.service.log.LogReaderService#getLog()} method or by
 * registering a {@link org.osgi.service.log.LogListener} object.
 * 
 * @see org.osgi.service.log.LogReaderService#getLog()
 * @see org.osgi.service.log.LogListener
 */
final class CDTLogEntry implements LogEntry {
	
	private final long logTime;
	private final String message;
	private final int level;
	private final Throwable exception;
	
	private final Bundle loggingBundle;
	private final ServiceReference serviceReference;

	/**
	 * Create a new instance.
	 * 
	 * @param bundle
	 *            the bundle that created the LogEntry object
	 * @param sr
	 *            the service reference to associate with this LogEntry object
	 * @param level
	 *            the severity level for this LogEntry object
	 * @param message
	 *            the message to associate with this LogEntry object
	 * @param exception
	 *            the exception to associate with this LogEntry object
	 */
	CDTLogEntry(final Bundle bundle, final ServiceReference sr, final int level, final String message, final Throwable exception) {
		this.loggingBundle = bundle;
		this.exception = LogException.getException(exception);
		this.level = level;
		this.message = message;
		this.serviceReference = sr;
		this.logTime = System.currentTimeMillis();
	}

	/**
	 * Returns the bundle that created this LogEntry object.
	 * 
	 * @return the bundle that created this LogEntry object;<code>null</code> if
	 *         no bundle is associated with this LogEntry object
	 */
	public Bundle getBundle() {
		return loggingBundle;
	}

	/**
	 * Returns the {@link ServiceReference} object for the service associated
	 * with this LogEntry object.
	 * 
	 * @return the {@link ServiceReference} object for the service associated
	 *         with this LogEntry object; <code>null</code> if no
	 *         {@link ServiceReference} object was provided
	 */
	public ServiceReference getServiceReference() {
		return serviceReference;
	}

	/**
	 * Returns the severity level of this LogEntry object.
	 * <p>
	 * This is one of the severity levels defined by the
	 * {@link org.osgi.service.logLogService} interface.
	 * 
	 * @return severity level of this LogEntry object.
	 * @see org.osgi.service.LogService#LOG_ERROR
	 * @see org.osgi.service.LogService#LOG_WARNING
	 * @see org.osgi.service.LogService#LOG_INFO
	 * @see org.osgi.service.LogService#LOG_DEBUG
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Returns the human readable message associated with this LogEntry object.
	 * 
	 * @return a string containing the message associated with this LogEntry
	 *         object
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Returns the exception object associated with this LogEntry object.
	 * <p>
	 * The returned exception may not be the original exception. To avoid
	 * references to a bundle defined exception class, thus preventing an
	 * uninstalled bundle from being garbage collected, this LogService will
	 * return an exception object of an implementation defined {@link Throwable}
	 * sub-class. This exception will maintain as much information as possible
	 * from the original exception object such as the message and stack trace.
	 * 
	 * @return throwable object of the exception associated with this LogEntry;
	 *         <code>null</code> if no exception is associated with this
	 *         LogEntry object
	 */
	public Throwable getException() {
		return exception;
	}

	/**
	 * Returns the value of {@link System#currentTimeMillis()} at the time this
	 * LogEntry object was created.
	 * 
	 * @return the system time in milliseconds when this LogEntry object was
	 *         created
	 * @see System#currentTimeMillis()
	 */
	public long getTime() {
		return logTime;
	}
}