package net.bhl.cdt.e4.client;

import java.io.File;
import org.eclipse.emf.emfstore.server.ESLocationProvider;

public class EMFStoreLocationProvider implements ESLocationProvider {
	private final String WORKSPACE_DIR = ".cdt";
	
	@Override
	public String getWorkspaceDirectory() {
		StringBuffer sb = new StringBuffer();
		sb.append(System.getProperty("user.home"));
		sb.append(File.separatorChar);
		sb.append(WORKSPACE_DIR);

		return sb.toString();
	}
}
