 
package net.bhl.cdt.reporting.handler;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;

import reporting.Axis;
import reporting.GanttChart;
import reporting.Report;
import reporting.ReportingFactory;

public class CreateGanttChartHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection) {
		if (selection == null || !(selection instanceof Report))
			return;
		
		Report report = (Report)selection;
		
		GanttChart ganttChart = ReportingFactory.eINSTANCE.createGanttChart();
		
		Axis xAxis = ReportingFactory.eINSTANCE.createAxis();
		xAxis.setLabel(ReportingFactory.eINSTANCE.createLabel());
		
		Axis yAxis = ReportingFactory.eINSTANCE.createAxis();
		yAxis.setLabel(ReportingFactory.eINSTANCE.createLabel());
		
		ganttChart.setTitle(ReportingFactory.eINSTANCE.createLabel());
		
		ganttChart.setXAxis(xAxis);
		ganttChart.setYAxis(yAxis);
		
		report.getCharts().add(ganttChart);
	}
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection) {
		if (selection != null && selection instanceof Report)
			return true;
		
		return false;
	}
}