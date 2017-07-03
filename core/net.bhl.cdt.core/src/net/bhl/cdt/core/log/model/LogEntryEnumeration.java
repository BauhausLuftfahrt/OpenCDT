/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.core.log.model;

import java.util.Enumeration;
import java.util.Iterator;

import org.osgi.service.log.LogEntry;

/**
 * 
 * @author Michael Shamiyeh
 *
 */
public class LogEntryEnumeration implements Enumeration<LogEntry> {	
	private Iterator<LogEntryImpl> logEntryIterator;
	
	public LogEntryEnumeration(Iterator<LogEntryImpl> it) {
		logEntryIterator = it;
	}
	
	
	@Override
	public boolean hasMoreElements() {
		return logEntryIterator.hasNext();
	}

	@Override
	public LogEntry nextElement() {
		return logEntryIterator.next();
	}
}
