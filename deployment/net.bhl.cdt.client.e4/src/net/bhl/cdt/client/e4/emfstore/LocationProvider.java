package net.bhl.cdt.client.e4.emfstore;

import java.io.File;

import javax.inject.Inject;

import org.eclipse.emf.emfstore.server.ESLocationProvider;
import org.osgi.service.log.LogService;

public class LocationProvider implements ESLocationProvider {
	public static final Object CDT_FOLDERNAME = "cdt";
	
	@Inject private LogService logService;
	
	public LocationProvider() {
	}

	@Override
	public String getWorkspaceDirectory() {
		File f = new File(".");

		StringBuffer sb = new StringBuffer();
		sb.append(f.getAbsolutePath().toString());
		//sb.append(Platform.getInstanceLocation().toString());
		//sb.append(System.getProperty("user.home"));
		sb.append(File.separatorChar);
		sb.append(CDT_FOLDERNAME);

		if (logService != null)
			logService.log(LogService.LOG_INFO, "CDT Working Folder: " + sb.toString());
		
		return sb.toString();
	}
}
