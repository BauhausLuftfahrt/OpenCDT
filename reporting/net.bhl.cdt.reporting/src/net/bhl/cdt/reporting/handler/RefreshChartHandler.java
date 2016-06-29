 
package net.bhl.cdt.reporting.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import net.bhl.cdt.reporting.part.ChartViewPart;

public class RefreshChartHandler {
	@Execute
	public void execute(EPartService partService) {
		if (partService.getActivePart().getObject() instanceof ChartViewPart)
			((ChartViewPart)partService.getActivePart().getObject()).refresh();
	}
}