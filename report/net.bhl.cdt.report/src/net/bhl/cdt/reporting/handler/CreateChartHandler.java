 
package net.bhl.cdt.reporting.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

public class CreateChartHandler {
	@Execute
	public void execute(EPartService partService) {
		MPart part = partService.createPart("net.bhl.cdt.reporting.partdescriptor.barchart");
		part.setLabel("Bar Chart");
		
		partService.showPart(part, PartState.ACTIVATE);
	}
}