/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.handlers;

import java.io.IOException;
import java.util.Collections;
import java.util.Optional;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.widgets.Shell;

import model.base.BaseFactory;
import model.base.ModelContainer;
import net.bhl.cdt.core.pref.CDTPreferencesService;
import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.ui.e4.E4ResourceIds;
import net.bhl.cdt.ui.e4.parts.explorer.CDTExplorerViewPart;
import net.bhl.cdt.util.constants.StringConstants;
import net.bhl.cdt.util.ui.UIHelper;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-04
 *
 */
public class NewCDTModelHandler {
    @Execute
    public void execute(Shell shell, EHandlerService handlerService, ECommandService commandService, CDTLogService logService, CDTPreferencesService prefService) {
	Optional<String> optWorkFolder = prefService.getPreference(CDTExplorerViewPart.PREF_KEY_WORKFOLDER);

	String initialFolder = StringConstants.EMPTY;
	if (optWorkFolder.isPresent())
	    initialFolder = optWorkFolder.get() + StringConstants.BACKSLASH + "NewCDTModel";

	String newModelFile = UIHelper.showSaveFileDialog(shell, "New CDT Model", new String[] { "*.cdm" }, initialFolder);
	if (newModelFile != null) {
	    ModelContainer container = BaseFactory.eINSTANCE.createModelContainer();
	    container.setName(newModelFile.substring(newModelFile.lastIndexOf(StringConstants.BACKSLASH) + 1, newModelFile.lastIndexOf(StringConstants.DOT)));
	    
	    ResourceSet resSet = new ResourceSetImpl();
	    Resource resource = resSet.createResource(URI.createFileURI(newModelFile));
	    resource.getContents().add(container);

	    try {
		resource.save(Collections.EMPTY_MAP);
		logService.info("New CDT-Model successfully created: '" + newModelFile + "'");
		
		ParameterizedCommand cmd = commandService.createCommand(E4ResourceIds.COMMAND_REFRESH_EXPLORERVIEW_ID, Collections.EMPTY_MAP);
		handlerService.executeHandler(cmd);
	    } catch (IOException e) {
		logService.error("Error while saving CDT-Model: '" + e.getMessage() + "'", e);
	    }
	}
    }
}