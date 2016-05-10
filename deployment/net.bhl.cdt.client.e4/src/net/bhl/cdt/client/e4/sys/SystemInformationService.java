package net.bhl.cdt.client.e4.sys;

import java.net.UnknownHostException;

/**
 * Contains information about the operating system and the user logged in.
 * @author michael.shamiyeh
 *
 */
public class SystemInformationService {
	/**
	 * OS type categorization
	 * @author raoul.rothfeld
	 */
	public enum OSType {
		Windows, MacOS, Linux, Solaris, Other
	}
	
	private OSType operatingSystem;
	
	public OSType getOperatingSystem() {
		if (operatingSystem == null)
			operatingSystem = getActiveOS();
		
		return operatingSystem;
	}
	
	
	private String systemUsername;
	
	public String getSystemUsername() {
		if (systemUsername == null)
			systemUsername = System.getProperty("user.name");
		
		return systemUsername;
	}
	
	private String localMachineName;
	
	public String getLocalMachineName() {
		if (localMachineName == null)
			try {
				localMachineName = java.net.InetAddress.getLocalHost().getHostName();
			} catch (UnknownHostException e) {
				localMachineName = "";
			}
		
		return localMachineName;
	}
	
	public SystemInformationService() {
	}
	

	/**
	 * Test if OS type is Windows
	 * @return whether OS type is Windows
	 */
	public boolean isWindows() {
		return operatingSystem == OSType.Windows;
	}

	/**
	 * Test if OS type is MacOS
	 * @return whether OS type is MacOS
	 */
	public boolean isMac() {
		return operatingSystem == OSType.MacOS;
	}

	/**
	 * Test if OS type is Linux
	 * @return whether OS type is Linux
	 */
	public boolean isUnix() {
		return operatingSystem == OSType.Linux;
	}

	/**
	 * Test if OS type is Solaris
	 * @return whether OS type is Solaris
	 */
	public boolean isSolaris() {
		return operatingSystem == OSType.Solaris;
	}

	/**
	 * Private population of the OS type instance variable to one-time OS
	 * retrieval from host system
	 * 
	 * @return active OS type enumerator
	 * @author marc.engelmann, raoul.rothfeld, michael.shamiyeh
	 */
	private static OSType getActiveOS() {
		String OS = System.getProperty("os.name").toLowerCase();
		if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
			return OSType.MacOS;
		} else if (OS.indexOf("win") >= 0) {
			return OSType.Windows;
		} else if (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0) {
			return OSType.Linux;
		} else if (OS.indexOf("sunos") >= 0) {
			return OSType.Solaris;
		} else {
			return OSType.Other;
		}
	}
}
