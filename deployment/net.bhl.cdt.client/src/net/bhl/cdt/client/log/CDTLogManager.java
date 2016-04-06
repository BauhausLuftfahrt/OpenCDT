package net.bhl.cdt.client.log;

import java.util.LinkedList;
import java.util.Observable;

import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;

public class CDTLogManager extends Observable implements LogListener {
	private LinkedList<LogEntry> entries;
	
	public CDTLogManager() {
		entries = new LinkedList<LogEntry>();
	}
	
	public LogEntry[] getAllEntries() {
		return entries.toArray(new LogEntry[entries.size()]);
	}
	
	public LogEntry getLatestEntry() {
		return entries.getLast();
	}
	
	@Override
	public void logged(LogEntry entry) {
		entries.add(entry);
		notifyObservers(entry);
	}
}
