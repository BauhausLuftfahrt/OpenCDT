/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.core.log.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogLevel;
import org.osgi.service.log.LogService;
import org.osgi.service.log.Logger;

import net.bhl.cdt.core.log.CDTLog;
import net.bhl.cdt.core.log.model.LogEntryImpl;

/**
 * Implementation of the OGSI LogService.
 * 
 * @author Michael.Shamiyeh
 *
 */
public class CDTLogService implements LogService {
	
	private Bundle bundle;
	
	private CDTLog cdtLog;

	public CDTLogService(CDTLog log, Bundle bundle) {
		this.cdtLog = log;
		this.bundle = bundle;
	}

	@Override
	public void log(int level, String message) {
		log(null, level, message, null);
	}

	@Override
	public void log(int level, String message, Throwable exception) {
		log(null, level, message, exception);
	}

	@Override
	public void log(ServiceReference<?> sr, int level, String message) {
		log(sr, level, message, null);
	}

	@Override
	public void log(ServiceReference<?> sr, int level, String message, Throwable exception) {
		LogLevel logLevel;
		
		if (level == LogLevel.AUDIT.ordinal())
			logLevel = LogLevel.AUDIT;
		else if (level == LogLevel.DEBUG.ordinal())
			logLevel = LogLevel.DEBUG;
		else if (level == LogLevel.ERROR.ordinal())
			logLevel = LogLevel.ERROR;
		else if (level == LogLevel.INFO.ordinal())
			logLevel = LogLevel.INFO;
		else if (level == LogLevel.TRACE.ordinal())
			logLevel = LogLevel.TRACE;
		else
			logLevel = LogLevel.WARN;

		cdtLog.addEntry(new LogEntryImpl((sr != null) ? sr.getBundle() : bundle, message, logLevel, sr, exception));
	}

	public void info(String message) {
		log(LogLevel.INFO.ordinal(), message);
	}

	public void warning(String message) {
		log(LogLevel.WARN.ordinal(), message);
	}

	public void warning(String message, Throwable exception) {
		log(null, LogLevel.WARN.ordinal(), message, exception);
	}

	public void error(String message) {
		log(LogLevel.ERROR.ordinal(), message);
	}

	public void error(String message, Throwable exception) {
		log(null, LogLevel.ERROR.ordinal(), message, exception);
	}

	@Override
	public Logger getLogger(String name) {
	    // TODO Auto-generated method stub
	    return null;
	}

	@Override
	public Logger getLogger(Class<?> clazz) {
	    // TODO Auto-generated method stub
	    return null;
	}

	@Override
	public <L extends Logger> L getLogger(String name, Class<L> loggerType) {
	    // TODO Auto-generated method stub
	    return null;
	}

	@Override
	public <L extends Logger> L getLogger(Class<?> clazz, Class<L> loggerType) {
	    // TODO Auto-generated method stub
	    return null;
	}

	@Override
	public <L extends Logger> L getLogger(Bundle bundle, String name, Class<L> loggerType) {
	    // TODO Auto-generated method stub
	    return null;
	}
}
