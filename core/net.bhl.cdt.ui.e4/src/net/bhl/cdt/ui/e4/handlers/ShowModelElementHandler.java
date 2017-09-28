
package net.bhl.cdt.ui.e4.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.ecore.EObject;

import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.ui.e4.E4ResourceIds;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-09-27
 *
 */
public class ShowModelElementHandler {
    @Execute
    public void execute(@Named(E4ResourceIds.COMMAND_SHOW_MODELELEMENT_PARAM_ELEMENT_ID)EObject modelElement, EPartService partService, CDTLogService logService) {
	if (modelElement != null) {
	    logService.info("Model-File '" + modelElement + "' loaded. Opening assigned editor...");
	    
	    MPart part = partService.createPart(E4ResourceIds.PARTDESCRIPTOR_MODELELEMENTEDITOR_ID);
	    part.setLabel("Element Parameters");
	    
//	    part.getTransientData().put(ModelElementEditorPart.MODEL_ELEMENT_KEY, modelElement);
	    partService.showPart(part, PartState.ACTIVATE);
	}
	else
	    logService.error("Model-File '" + modelElement + "' doesn't exist.");
    }
}