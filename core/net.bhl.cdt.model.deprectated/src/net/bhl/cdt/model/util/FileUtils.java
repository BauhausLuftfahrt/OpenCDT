/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.util;

import java.io.File;
import java.io.IOException;

/**
 * This helper class contains methods for File operations.
 * 
 * @author martin.glas
 */
public final class FileUtils {

	private FileUtils() {

	}

	/**
	 * This method checks whether file exists at a certain path.
	 * 
	 * @param filePath the File path
	 * @return true if a File exists at the path
	 */
	public static boolean exists(String filePath) {
		File file = new File(filePath);
		if (file.exists() && !file.isDirectory()) {
			return true;

		}
		return false;
	}

	/**
	 * This method checks if a String represents a valid File name.
	 * 
	 * @param fileName the File name
	 * @return true if the File name is valid
	 */
	public static boolean isValidFileName(String fileName) {

		File f = new File(fileName);
		try {
			f.getCanonicalPath();
			return true;
		} catch (IOException e) {
			return false;
		}

	}

	/**
	 * This method checks weather a File name is valid and has a certain suffix.
	 * 
	 * @param fileName the File name
	 * @param suffix the File name suffix
	 * @return true if the File name is valid and has the given suffix
	 */
	public static boolean isValidFileName(String fileName, String suffix) {
		if (fileName.endsWith(suffix)) {
			return isValidFileName(fileName);
		}
		return false;
	}

}
