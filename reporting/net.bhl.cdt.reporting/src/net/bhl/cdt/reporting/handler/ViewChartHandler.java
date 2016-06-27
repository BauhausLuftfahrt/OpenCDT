 
package net.bhl.cdt.reporting.handler;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

import reporting.Chart;

public class ViewChartHandler {
	@Execute
	public void execute(EPartService partService, @Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection) {
		if (selection == null || !(selection instanceof Chart))
			return;
		
		Chart chart = (Chart)selection;
		
		MPart part = partService.createPart("net.bhl.cdt.reporting.partdescriptor.chartviewpart");
		part.setLabel(chart.getName());
		partService.showPart(part, PartState.ACTIVATE);
	}

	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection) {
		if (selection != null && selection instanceof Chart)
			return true;
		
		return false;
	}
}