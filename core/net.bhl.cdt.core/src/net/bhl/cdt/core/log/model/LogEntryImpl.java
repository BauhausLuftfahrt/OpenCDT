/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.core.log.model;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogLevel;

/**
 * 
 * @author Michael Shamiyeh
 *
 */
public final class LogEntryImpl implements LogEntry {
	
	private final long logTime;
	private final String message;
	private final LogLevel level;
	private final Throwable exception;
	
	private final Bundle loggingBundle;
	private final ServiceReference<?> serviceReference;

	public LogEntryImpl(Bundle bundle, String message, LogLevel level, ServiceReference<?> serviceReference, Throwable exception) {
		this.loggingBundle = bundle;
		this.message = message;
		this.level = level;
		this.serviceReference = serviceReference;
		this.exception = exception;
		this.logTime = System.currentTimeMillis();
	}

	@Override
	public Bundle getBundle() {
		return loggingBundle;
	}

	@Override
	public ServiceReference<?> getServiceReference() {
		return serviceReference;
	}

	@Override
	public int getLevel() {
		return level.ordinal();
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public Throwable getException() {
		return exception;
	}

	@Override
	public long getTime() {
		return logTime;
	}

	@Override
	public String getLoggerName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getSequence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getThreadInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StackTraceElement getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LogLevel getLogLevel() {
		// TODO Auto-generated method stub
		return null;
	}
}