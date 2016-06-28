 
package net.bhl.cdt.reporting.handler;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;

import net.bhl.cdt.reporting.chartmodel.ChartModelFactory;
import reporting.Report;

public class CreateGanttChartHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection) {
		if (selection == null || !(selection instanceof Report))
			return;
		
		Report report = (Report)selection;
		report.getCharts().add(ChartModelFactory.generateGanttChart());
	}
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection) {
		if (selection != null && selection instanceof Report)
			return true;
		
		return false;
	}
}