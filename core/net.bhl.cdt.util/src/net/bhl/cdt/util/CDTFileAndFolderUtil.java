package net.bhl.cdt.util;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-26
 *
 */
public class CDTFileAndFolderUtil {
	public static String getCDTWorkPathString() {
		return ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	}
	
	public static File getCDTWorkPathFile() {
		return new File(getCDTWorkPathString());
	}
}
