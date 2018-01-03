/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;

import net.bhl.cdt.core.pref.CDTPreferencesService;
import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.ui.e4.parts.explorer.ExplorerViewPart;
import net.bhl.cdt.util.ui.UIHelper;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-03
 *
 */
public class SetCDTExplorerWorkFolderHandler {    
    @Execute
    public void execute(Shell shell, CDTPreferencesService prefService, CDTLogService logService) {
	String dialogResult = UIHelper.showDirectoryDialog(shell, "Choose Work-Folder...");
	
	if (dialogResult != null) {
	    prefService.setPreference(ExplorerViewPart.PREF_KEY_WORKFOLDER, dialogResult);
	    logService.info("Work folder set to: '" + dialogResult + "'");
	}
    }
}