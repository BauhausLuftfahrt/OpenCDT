package net.bhl.cdt.client.log;

import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;

public class ConsoleOSGILogger implements LogListener {
	@Override
	public void logged(LogEntry entry) {
		if (entry.getMessage() != null)
            System.out.println("[" + entry.getBundle().getSymbolicName() + "] " + entry.getMessage());
	}
}
