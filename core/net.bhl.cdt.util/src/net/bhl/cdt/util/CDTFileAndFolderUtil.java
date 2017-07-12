/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.util;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;

import net.bhl.cdt.util.constants.FileConstants;
import net.bhl.cdt.util.constants.StringConstants;

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
    
    public static String getUserHomeDirectory() {
	return System.getProperty("user.home");
    }
    
    public static String getUserDefaultWorkFolderPath() {
	return getUserHomeDirectory() + StringConstants.BACKSLASH + FileConstants.CDT_DEFAULT_WORK_FOLDERNAME;
    }
}
