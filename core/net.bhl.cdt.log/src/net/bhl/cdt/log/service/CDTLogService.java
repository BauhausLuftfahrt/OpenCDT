/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.log.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

import net.bhl.cdt.log.CDTLog;
import net.bhl.cdt.log.model.LogEntryImpl;

/**
 * Implementation of the OGSI LogService.
 * 
 * @author Michael Shamiyeh
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

    @SuppressWarnings("rawtypes")
    @Override
    public void log(ServiceReference sr, int level, String message) {
	log(sr, level, message, null);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void log(ServiceReference sr, int level, String message, Throwable exception) {
	cdtLog.addEntry(new LogEntryImpl((sr != null) ? sr.getBundle() : bundle, sr, level, message, exception));
    }

    public void info(String message) {
	log(LogService.LOG_INFO, message);
    }

    public void warning(String message) {
	log(LogService.LOG_WARNING, message);
    }

    public void warning(String message, Throwable exception) {
	log(null, LogService.LOG_WARNING, message, exception);
    }

    public void error(String message) {
	log(LogService.LOG_ERROR, message);
    }

    public void error(String message, Throwable exception) {
	log(null, LogService.LOG_ERROR, message, exception);
    }
}
