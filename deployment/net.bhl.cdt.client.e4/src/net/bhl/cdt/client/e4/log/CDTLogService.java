package net.bhl.cdt.client.e4.log;

import java.util.LinkedList;

import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogService;

public class CDTLogService implements LogService {
	private LinkedList<LogEntry> entries;
	
	public CDTLogService() {
		entries = new LinkedList<LogEntry>();
	}
	
	public LogEntry[] getAllEntries() {
		return entries.toArray(new LogEntry[entries.size()]);
	}
	
	public LogEntry getLatestEntry() {
		return entries.getLast();
	}
	
	@Override
	public void log(int level, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(int level, String message, Throwable exception) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void log(ServiceReference sr, int level, String message) {
		// TODO Auto-generated method stub
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void log(ServiceReference sr, int level, String message, Throwable exception) {
		// TODO Auto-generated method stub
		
	}
	
	public void info(String message) {
		
	}
	
	public void warning(String message) {
		
	}
	
	public void warning(String message, Throwable exception) {
		
	}
	
	public void error(String message) {
		
	}
	
	public void error(String message, Throwable exception) {
		
	}
}
