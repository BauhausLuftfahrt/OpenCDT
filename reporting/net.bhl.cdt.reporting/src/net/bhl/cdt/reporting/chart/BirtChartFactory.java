package net.bhl.cdt.reporting.chart;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.FontDefinition;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.JavaDateFormatSpecifier;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.Orientation;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.JavaDateFormatSpecifierImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.data.impl.DateTimeDataElementImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Legend;
import org.eclipse.birt.chart.model.layout.Plot;
import org.eclipse.birt.chart.util.CDateTime;

import reporting.BubbleChart;
import reporting.DateAxis;
import reporting.FontPropertyElement;
import reporting.GanttChart;

public class BirtChartFactory {
	private static String TYPE_BUBBLE = "Bubble Chart"; //$NON-NLS-1$
	private static String SUBTYPE_BUBBLE_STANDARD = "Standard Bubble Chart"; //$NON-NLS-1$

	private static String TYPE_GANTT = "Gantt Chart"; //$NON-NLS-1$
	private static String SUBTYPE_GANTT_STANDARD = "Standard Gantt Chart"; //$NON-NLS-1$

	public static Chart createChart(reporting.Chart chartModel) {
		if (chartModel instanceof GanttChart)
			return createGanttChart((GanttChart) chartModel);

		if (chartModel instanceof BubbleChart)
			return createTestBubbleChart((BubbleChart) chartModel);

		return ChartWithAxesImpl.create();
	}

	public static ChartWithAxes createTestBubbleChart(BubbleChart chartModel) {
		ChartWithAxes cwaBubble = createChartWithAxes(TYPE_BUBBLE, SUBTYPE_BUBBLE_STANDARD, chartModel);

		// Legend
		Legend lg = cwaBubble.getLegend();
		lg.setItemType(LegendItemType.SERIES_LITERAL);
		cwaBubble.getLegend().setVisible(false);

		// X-Axis
		Axis xAxisPrimary = cwaBubble.getPrimaryBaseAxes()[0];
		xAxisPrimary.setType(AxisType.TEXT_LITERAL);
		xAxisPrimary.getOrigin().setType(IntersectionType.MIN_LITERAL);
		copyCaptionStyle(xAxisPrimary.getLabel().getCaption().getFont(), chartModel.getXAxis());

		// Y-Axis
		Axis yAxisPrimary = cwaBubble.getPrimaryOrthogonalAxis(xAxisPrimary);
		yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
		yAxisPrimary.setType(AxisType.LINEAR_LITERAL);
		yAxisPrimary.getLabel().getCaption().getFont().setRotation(90);
		copyCaptionStyle(yAxisPrimary.getLabel().getCaption().getFont(), chartModel.getYAxis());
		
		return cwaBubble;
	}

	public static ChartWithAxes createGanttChart(reporting.GanttChart chartModel) {
		ChartWithAxes chart = createChartWithAxes(TYPE_GANTT, SUBTYPE_GANTT_STANDARD, chartModel);

		chart.setOrientation(Orientation.HORIZONTAL_LITERAL);

		// Legend
		Legend lg = chart.getLegend();
		lg.setItemType(LegendItemType.CATEGORIES_LITERAL);
		lg.setVisible(chartModel.isShowLegend());

		// Y-Axis
		Axis yAxisPrimary = chart.getPrimaryBaseAxes()[0];
		yAxisPrimary.setCategoryAxis(true);
		yAxisPrimary.setType(AxisType.TEXT_LITERAL);
		yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
		yAxisPrimary.getOrigin().setType(IntersectionType.MIN_LITERAL);
		copyCaptionStyle(yAxisPrimary.getLabel().getCaption().getFont(), chartModel.getYAxis());

		DateAxis xAxisModel = (DateAxis) chartModel.getXAxis();

		// X-Axis
		Axis xAxisPrimary = chart.getPrimaryOrthogonalAxis(yAxisPrimary);
		xAxisPrimary.setType(AxisType.DATE_TIME_LITERAL);
		xAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
		xAxisPrimary.setInterval(1);

		if (xAxisModel.getMinDate() != null)
			xAxisPrimary.getScale().setMin(DateTimeDataElementImpl.create(new CDateTime(xAxisModel.getMinDate())));

		if (xAxisModel.getMaxDate() != null)
			xAxisPrimary.getScale().setMax(DateTimeDataElementImpl.create(new CDateTime(xAxisModel.getMaxDate())));

		copyCaptionStyle(xAxisPrimary.getLabel().getCaption().getFont(), xAxisModel);

		JavaDateFormatSpecifier dfs = JavaDateFormatSpecifierImpl.create("yyyy");// AttributeFactory.eINSTANCE.createDateFormatSpecifier();
		// dfs.setDetail(DateFormatDetail.DATE_LITERAL);
		// dfs.setType(DateFormatType.SHORT_LITERAL);
		xAxisPrimary.setFormatSpecifier(dfs);

		return chart;
	}

	private static void copyCaptionStyle(FontDefinition fontDefinition, FontPropertyElement fontProperty) {
		fontDefinition.setName(fontProperty.getFamily());
		fontDefinition.setSize(fontProperty.getSize());
		fontDefinition.setBold(fontProperty.isBold());
		fontDefinition.setItalic(fontProperty.isItalic());
	}

	private static ChartWithAxes createChartWithAxes(String type, String subType, reporting.Chart chartModel) {
		ChartWithAxes chart = ChartWithAxesImpl.create();
		chart.setType(type);
		chart.setSubType(subType);

		chart.getBlock().setBackground(ColorDefinitionImpl.WHITE());
		chart.getBlock().getOutline().setVisible(false);

		Plot p = chart.getPlot();
		p.getClientArea().setBackground(ColorDefinitionImpl.WHITE());

		copyCaptionStyle(chart.getTitle().getLabel().getCaption().getFont(), chartModel.getTitle());
		chart.getTitle().getLabel().getCaption().setValue(chartModel.getTitle().getText());

		return chart;
	}

	public static ChartWithAxes createBubbleChart(String title, boolean legendVisible, float fontSize, String font) {
		ChartWithAxes chart = ChartWithAxesImpl.create();

		chart.setType("Bubble Chart"); //$NON-NLS-1$
		chart.setSubType("Standard Bubble Chart"); //$NON-NLS-1$
		// Plot
		chart.getBlock().setBackground(ColorDefinitionImpl.WHITE());
		chart.getBlock().getOutline().setVisible(false);
		Plot p = chart.getPlot();
		p.getClientArea().setBackground(ColorDefinitionImpl.WHITE());

		// Title
		chart.getTitle().getLabel().getCaption().setValue(title); // $NON-NLS-1$

		// Legend
		Legend lg = chart.getLegend();
		lg.setItemType(LegendItemType.SERIES_LITERAL);
		lg.setVisible(legendVisible);

		// X-Axis
		Axis xAxisPrimary = chart.getPrimaryBaseAxes()[0];
		xAxisPrimary.setType(AxisType.TEXT_LITERAL);
		xAxisPrimary.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
		xAxisPrimary.getOrigin().setType(IntersectionType.MIN_LITERAL);
		xAxisPrimary.getLabel().getCaption().getFont().setSize(fontSize);
		xAxisPrimary.getLabel().getCaption().getFont().setName(font);

		// Y-Axis
		Axis yAxisPrimary = chart.getPrimaryOrthogonalAxis(xAxisPrimary);
		yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
		yAxisPrimary.setType(AxisType.LINEAR_LITERAL);
		// yAxisPrimary.getLabel( ).getCaption( ).getFont( ).setRotation( 90 );
		yAxisPrimary.getLabel().getCaption().getFont().setSize(fontSize);
		yAxisPrimary.getLabel().getCaption().getFont().setName(font);
		yAxisPrimary.getTitle().getCaption().getFont().setSize(fontSize);
		yAxisPrimary.getTitle().getCaption().getFont().setName(font);
		yAxisPrimary.getTitle().getCaption().getFont().setBold(true);
		yAxisPrimary.getTitle().getCaption().setValue("Technology Level");//$NON-NLS-1$
		yAxisPrimary.getTitle().setVisible(true);

		return chart;
	}
}
