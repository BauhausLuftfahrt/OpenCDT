 
package net.bhl.cdt.ontology.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

public class ShowOntologyManagerHandler {
	@Execute
	public void execute(EPartService partService) {
		MPart part = partService.createPart("net.bhl.cdt.ontology.manager");
		part.setLabel("Ontology-Manager");
		partService.showPart(part, PartState.ACTIVATE);
	}
}