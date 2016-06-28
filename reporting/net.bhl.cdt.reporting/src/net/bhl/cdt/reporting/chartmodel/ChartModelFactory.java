package net.bhl.cdt.reporting.chartmodel;

import reporting.Axis;
import reporting.DateAxis;
import reporting.FontPropertyElement;
import reporting.GanttChart;
import reporting.ReportingFactory;

public class ChartModelFactory {
	public static GanttChart generateGanttChart() {
		GanttChart ganttChart = ReportingFactory.eINSTANCE.createGanttChart();
		
		DateAxis xAxis = ReportingFactory.eINSTANCE.createDateAxis();
		xAxis.setLabel(ReportingFactory.eINSTANCE.createLabel());
		xAxis.setFormatString("yyyy");
		setDefaultFontStyle(xAxis);
		setDefaultFontStyle(xAxis.getLabel());
		
		Axis yAxis = ReportingFactory.eINSTANCE.createAxis();
		yAxis.setLabel(ReportingFactory.eINSTANCE.createLabel());
		setDefaultFontStyle(yAxis);
		setDefaultFontStyle(yAxis.getLabel());
		
		ganttChart.setTitle(ReportingFactory.eINSTANCE.createLabel());
		setDefaultFontStyle(ganttChart.getTitle());
		ganttChart.getTitle().setBold(true);
		ganttChart.getTitle().setSize(20);
		
		ganttChart.setXAxis(xAxis);
		ganttChart.setYAxis(yAxis);
		
		return ganttChart;
	}
	
	
	private static void setDefaultFontStyle(FontPropertyElement element) {
		element.setFamily("Calibri");
		element.setSize(10);
	}
}
