 
package net.bhl.cdt.client.e4.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.osgi.service.log.LogService;

import net.bhl.cdt.log.service.CDTLogService;

public class ExitHandler {
	@Execute
	public void execute(CDTLogService log) {
		log.log(LogService.LOG_INFO, "Shutdown!!!");
	}	
}