/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.log;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;

/**
 * 
 * @author Michael Shamiyeh
 *
 */
public class LogListenerThread extends Thread {
	private boolean threadIsStopping = false;
	private final List<LogEntry> entriesToDeliver = new LinkedList<LogEntry>();
	private final List<LogListener> listeners = new LinkedList<LogListener>();

	public void addEntry(final LogEntry entry) {
		synchronized (entriesToDeliver) {
			entriesToDeliver.add(entry);
			entriesToDeliver.notifyAll();
		}
	}

	public void addListener(final LogListener listener) {
		synchronized (listeners) {
			listeners.add(listener);
		}
	}

	public void removeListener(final LogListener listener) {
		synchronized (listeners) {
			listeners.remove(listener);
		}
	}
	
	public int getListenerCount() {
		return listeners.size();
	}

	public void shutdown() {
		synchronized (entriesToDeliver) {
			threadIsStopping = true;
			entriesToDeliver.notifyAll();
		}
	}
	
	public void run() {
		boolean stop = false;

		while(!stop) {
			synchronized (entriesToDeliver) {
				if (!entriesToDeliver.isEmpty()) {
					LogEntry entry = (LogEntry) entriesToDeliver.remove(0);

					synchronized (listeners) {
						Iterator<LogListener> listenerIt = listeners.iterator();
						while (listenerIt.hasNext()) {
							try {
								LogListener listener = (LogListener) listenerIt.next();
								listener.logged(entry);
							} catch (Throwable t) {
								// catch and discard any exceptions thrown by
								// the listener
							}
						}
					}
				}

				if (entriesToDeliver.isEmpty()) {
					try {
						entriesToDeliver.wait();
					} catch (InterruptedException e) { }
				}
			}

			if (threadIsStopping)
				stop = true;
		}
	}
}