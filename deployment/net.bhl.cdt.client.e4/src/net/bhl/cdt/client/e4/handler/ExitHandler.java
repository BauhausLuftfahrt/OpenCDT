 
package net.bhl.cdt.client.e4.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.osgi.service.log.LogService;

public class ExitHandler {
	@Execute
	@Inject
	public void execute(LogService log) {
		log.log(LogService.LOG_INFO, "Shutdown!!!");
	}	
}