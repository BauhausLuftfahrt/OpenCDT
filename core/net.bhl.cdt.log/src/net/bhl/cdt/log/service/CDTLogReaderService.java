/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.log.service;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogReaderService;

import net.bhl.cdt.log.CDTLog;
import net.bhl.cdt.log.model.LogEntryEnumeration;

/**
 * 
 * @author Michael Shamiyeh
 *
 */
public final class CDTLogReaderService implements LogReaderService {
    private final CDTLog log;
    private final List<LogListener> listenerList = new LinkedList<LogListener>();

    public CDTLogReaderService(final CDTLog log) {
	this.log = log;
    }

    public synchronized void addLogListener(final LogListener listener) {
	listenerList.add(listener);
	log.addListener(listener);
    }

    public synchronized void removeLogListener(final LogListener listener) {
	listenerList.remove(listener);
	log.removeListener(listener);
    }

    @Override
    public Enumeration<?> getLog() {
	return new LogEntryEnumeration(log.getEntryIterator());
    }

    public synchronized void removeAllLogListeners() {
	listenerList.clear();
    }
}
