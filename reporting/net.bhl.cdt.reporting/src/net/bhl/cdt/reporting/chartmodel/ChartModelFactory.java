package net.bhl.cdt.reporting.chartmodel;

import reporting.Axis;
import reporting.BubbleChart;
import reporting.DataSource;
import reporting.DateAxis;
import reporting.FontPropertyElement;
import reporting.GanttChart;
import reporting.ReportingFactory;

public class ChartModelFactory {
	public static GanttChart generateGanttChart() {
		GanttChart ganttChart = ReportingFactory.eINSTANCE.createGanttChart();
		ganttChart.setName("Gantt-Chart");
		
		ganttChart.setTitle(ReportingFactory.eINSTANCE.createLabel());
		ganttChart.getTitle().setText("Gantt-Chart");
		setDefaultFontStyle(ganttChart.getTitle());
		ganttChart.getTitle().setSize(20);
		
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
		
		DataSource source = ReportingFactory.eINSTANCE.createDataSource();
		ganttChart.setDataSource(source);
		
		ganttChart.setStartDateField(ReportingFactory.eINSTANCE.createDataField());
		ganttChart.setEndDateField(ReportingFactory.eINSTANCE.createDataField());
		ganttChart.setTaskNameField(ReportingFactory.eINSTANCE.createDataField());
		
		return ganttChart;
	}
	
	public static BubbleChart generateBubbleChart() {
		BubbleChart bubbleChart = ReportingFactory.eINSTANCE.createBubbleChart();
		bubbleChart.setName("Bubble-Chart");
		
		bubbleChart.setTitle(ReportingFactory.eINSTANCE.createLabel());
		bubbleChart.getTitle().setText("Bubble-Chart");
		setDefaultFontStyle(bubbleChart.getTitle());
		bubbleChart.getTitle().setSize(20);
		
		Axis xAxis = ReportingFactory.eINSTANCE.createAxis();
		xAxis.setLabel(ReportingFactory.eINSTANCE.createLabel());
		setDefaultFontStyle(xAxis);
		setDefaultFontStyle(xAxis.getLabel());
		
		Axis yAxis = ReportingFactory.eINSTANCE.createAxis();
		yAxis.setLabel(ReportingFactory.eINSTANCE.createLabel());
		setDefaultFontStyle(yAxis);
		setDefaultFontStyle(yAxis.getLabel());
		
		bubbleChart.setTitle(ReportingFactory.eINSTANCE.createLabel());
		setDefaultFontStyle(bubbleChart.getTitle());
		bubbleChart.getTitle().setBold(true);
		bubbleChart.getTitle().setSize(20);
		
		bubbleChart.setXAxis(xAxis);
		bubbleChart.setYAxis(yAxis);
		
		DataSource source = ReportingFactory.eINSTANCE.createDataSource();
		bubbleChart.setDataSource(source);
		
		bubbleChart.setXCoordinateField(ReportingFactory.eINSTANCE.createDataField());
		bubbleChart.setYCoordinateField(ReportingFactory.eINSTANCE.createDataField());
		bubbleChart.setBubbleSizeField(ReportingFactory.eINSTANCE.createDataField());

		return bubbleChart;
	}
	
	
	private static void setDefaultFontStyle(FontPropertyElement element) {
		element.setFamily("Calibri");
		element.setSize(10);
	}
}
