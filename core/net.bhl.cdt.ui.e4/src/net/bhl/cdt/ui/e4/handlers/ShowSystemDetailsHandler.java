
package net.bhl.cdt.ui.e4.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import model.science.IDataEntity;
import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.ui.e4.E4ResourceIds;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2018-01-15
 *
 */
public class ShowSystemDetailsHandler {
    @Execute
    public void execute(@Named(E4ResourceIds.COMMAND_SHOW_SYSTEM_DETAILS_PARAM_SYSTEM_ID)EObject modelElement, EPartService partService, CDTLogService logService) {
	if (modelElement != null && modelElement instanceof IDataEntity) {
	    ResourceSet modelResourceSet = new ResourceSetImpl();
//	    Resource modelResource = modelResourceSet.getResource(URI.createFileURI(modelFile.getPath()), true);
//	    
//	    logService.info("Model-File '" + modelFilePath + "' loaded. Opening assigned editor...");
//	    
//	    MPart part = partService.createPart(E4ResourceIds.PARTDESCRIPTOR_MODELEDITOR_ID);
//	    part.setLabel(modelFile.getName());
//	    
//	    part.getTransientData().put(ModelStructureEditorPart.MODEL_RESOURCE_KEY, modelResource);
//	    partService.showPart(part, PartState.ACTIVATE);
	}
	else
	    logService.error("Model-Element was null.");
    }
}