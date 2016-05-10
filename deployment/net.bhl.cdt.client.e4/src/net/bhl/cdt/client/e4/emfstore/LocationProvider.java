package net.bhl.cdt.client.e4.emfstore;

import java.io.File;

import org.eclipse.emf.emfstore.server.ESLocationProvider;
import org.osgi.service.log.LogService;

import net.bhl.cdt.client.e4.Activator;

public class LocationProvider implements ESLocationProvider {
	public static final Object CDT_FOLDERNAME = "cdt";
	
	//@Inject
	//private LogService logService;
	
	public LocationProvider() {
	}
	
	//@PostConstruct
	//public void InitLogService(LogService service) {
	//	logService = service;
	//}

	@Override
	public String getWorkspaceDirectory() {
		File f = new File(".");

		StringBuffer sb = new StringBuffer();
		sb.append(f.getAbsolutePath().toString());
		//sb.append(Platform.getInstanceLocation().toString());
		//sb.append(System.getProperty("user.home"));
		sb.append(File.separatorChar);
		sb.append(CDT_FOLDERNAME);

		//if (logService != null)
		//	logService.log(LogService.LOG_INFO, "CDT Working Folder: " + sb.toString());
		
		Activator.getLogService().log(LogService.LOG_INFO, "CDT Working Folder: " + sb.toString());
		
		return sb.toString();
	}
}
