/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.client.e4.log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;

public class LogListenerThread extends Thread {
	// Whether the thread is stopping or not.
	private boolean m_stopping = false;
	// The list of entries waiting to be delivered to the log listeners.
	private final List m_entriesToDeliver = new ArrayList();
	// The list of listeners.
	private final List m_listeners = new ArrayList();

	/**
	 * Add an entry to the list of messages to deliver.
	 * 
	 * @param entry
	 *            the log entry to deliver
	 */
	void addEntry(final LogEntry entry) {
		synchronized (m_entriesToDeliver) {
			m_entriesToDeliver.add(entry);
			m_entriesToDeliver.notifyAll();
		}
	}

	/**
	 * Add a listener to the list of listeners that are subscribed.
	 * 
	 * @param listener
	 *            the listener to add to the list of subscribed listeners
	 */
	void addListener(final LogListener listener) {
		synchronized (m_listeners) {
			m_listeners.add(listener);
		}
	}

	/**
	 * Remove a listener from the list of listeners that are subscribed.
	 * 
	 * @param listener
	 *            the listener to remove from the list of subscribed listeners
	 */
	void removeListener(final LogListener listener) {
		synchronized (m_listeners) {
			m_listeners.remove(listener);
		}
	}

	/**
	 * Returns the number of listeners that are currently registered.
	 * 
	 * @return the number of listeners that are currently registered
	 */
	int getListenerCount() {
		return m_listeners.size();
	}

	/**
	 * Stop the thread. This will happen asynchronously.
	 */
	void shutdown() {
		synchronized (m_entriesToDeliver) {
			m_stopping = true;
			m_entriesToDeliver.notifyAll();
		}
	}

	/**
	 * The main method of the thread: waits for new messages to be receieved and
	 * then delivers them to any registered log listeners.
	 */
	public void run() {
		boolean stop = false;

		for (; !stop;) {
			synchronized (m_entriesToDeliver) {
				if (!m_entriesToDeliver.isEmpty()) {
					LogEntry entry = (LogEntry)m_entriesToDeliver.remove(0);

					synchronized (m_listeners) {
						Iterator listenerIt = m_listeners.iterator();
						while (listenerIt.hasNext()) {
							try {
								LogListener listener = (LogListener)listenerIt.next();
								listener.logged(entry);
							} catch (Throwable t) {
								// catch and discard any exceptions thrown by
								// the listener
							}
						}
					}
				}

				if (m_entriesToDeliver.isEmpty()) {
					try {
						m_entriesToDeliver.wait();
					} catch (InterruptedException e) {
						// do nothing
					}
				}
			}

			if (m_stopping) {
				stop = true;
			}
		}
	}
}