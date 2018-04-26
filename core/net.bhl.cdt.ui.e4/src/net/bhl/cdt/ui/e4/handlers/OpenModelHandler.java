/*******************************************************************************
* <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
* materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
* and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
******************************************************************************/
package net.bhl.cdt.ui.e4.handlers;

import java.io.File;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import net.bhl.cdt.connector.stp.StepManager;
import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.ui.e4.E4ResourceIds;
import net.bhl.cdt.ui.e4.parts.modeleditor.ModelStructureEditorPart;
import net.bhl.cdt.util.constants.FileConstants;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-05
 *
 */
public class OpenModelHandler {
    @Execute
    public void execute(@Named(E4ResourceIds.COMMAND_OPEN_MODEL_PARAM_FILEPATH_ID) String modelFilePath, EPartService partService, CDTLogService logService) {
	File modelFile = new File(modelFilePath);
	if (modelFile.exists()) {
	    if (modelFile.getName().endsWith(FileConstants.CDT_MODELFILE_EXTENSION)) {
		ResourceSet modelResourceSet = new ResourceSetImpl();
		Resource modelResource = modelResourceSet.getResource(URI.createFileURI(modelFile.getPath()), true);

		logService.info("Model-File '" + modelFilePath + "' loaded. Opening assigned editor...");

		MPart part = partService.createPart(E4ResourceIds.PARTDESCRIPTOR_MODELEDITOR_ID);
		part.setLabel(modelFile.getName());

		part.getTransientData().put(ModelStructureEditorPart.MODEL_RESOURCE_KEY, modelResource);
		part.getTransientData().put(ModelStructureEditorPart.FILE_RESOURCE_KEY, modelFile);
		partService.showPart(part, PartState.ACTIVATE);
	    } else if (modelFile.getName().endsWith(FileConstants.STP_MODELFILE_EXTENSION)) {
		ResourceSet modelResourceSet = new ResourceSetImpl();
		Resource modelResource = modelResourceSet.createResource(URI.createFileURI(modelFile.getPath()));
		
		model.engineering.System s = StepManager.Instance().ImportStepFile(modelFile.getPath(), true);
		
		modelResource.getContents().add(s);
		
		logService.info("Model-File '" + modelFilePath + "' loaded. Opening assigned editor...");

		MPart part = partService.createPart(E4ResourceIds.PARTDESCRIPTOR_MODELEDITOR_ID);
		part.setLabel(modelFile.getName());

		part.getTransientData().put(ModelStructureEditorPart.MODEL_RESOURCE_KEY, modelResource);
		part.getTransientData().put(ModelStructureEditorPart.FILE_RESOURCE_KEY, modelFile);
		partService.showPart(part, PartState.ACTIVATE);
	    } else
		logService.warning("No editor assigned.");
	} else
	    logService.error("Model-File '" + modelFilePath + "' doesn't exist.");
    }
}