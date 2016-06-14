package net.bhl.cdt.report.chart;

import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.JavaDateFormatSpecifier;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.Orientation;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.JavaDateFormatSpecifierImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Legend;
import org.eclipse.birt.chart.model.layout.Plot;

public class ChartFactory {
	public static ChartWithAxes createGanttChart(String title, boolean legendVisible, float fontSize, String font) {
		ChartWithAxes chart = ChartWithAxesImpl.create();
		chart.setType("Gantt Chart"); //$NON-NLS-1$
		chart.setSubType("Standard Gantt Chart"); //$NON-NLS-1$
		chart.setOrientation(Orientation.HORIZONTAL_LITERAL);

		chart.getBlock().setBackground(ColorDefinitionImpl.WHITE());
		chart.getBlock().getOutline().setVisible(false);

		Plot p = chart.getPlot();
		p.getClientArea().setBackground(ColorDefinitionImpl.WHITE());

		chart.getTitle().getLabel().getCaption().setValue(title); // $NON-NLS-1$

		// Legend
		Legend lg = chart.getLegend();
		lg.setItemType(LegendItemType.CATEGORIES_LITERAL);
		lg.setVisible(legendVisible);

		// Y-Axis
		Axis yAxisPrimary = chart.getPrimaryBaseAxes()[0];
		yAxisPrimary.setCategoryAxis(true);
		yAxisPrimary.setType(AxisType.TEXT_LITERAL);
		yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
		yAxisPrimary.getOrigin().setType(IntersectionType.MIN_LITERAL);
		yAxisPrimary.getLabel().getCaption().getFont().setSize(fontSize);
		yAxisPrimary.getLabel().getCaption().getFont().setName(font);

		// X-Axis
		Axis xAxisPrimary = chart.getPrimaryOrthogonalAxis(yAxisPrimary);
		xAxisPrimary.setType(AxisType.DATE_TIME_LITERAL);
		xAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
		xAxisPrimary.setInterval(1);
		xAxisPrimary.getLabel().getCaption().getFont().setSize(fontSize);
		xAxisPrimary.getLabel().getCaption().getFont().setName(font);
		
		JavaDateFormatSpecifier dfs = JavaDateFormatSpecifierImpl.create("yyyy");// AttributeFactory.eINSTANCE.createDateFormatSpecifier();
		//dfs.setDetail(DateFormatDetail.DATE_LITERAL);
		//dfs.setType(DateFormatType.SHORT_LITERAL);
		xAxisPrimary.setFormatSpecifier(dfs);

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
		Legend lg = chart.getLegend( );
		lg.setItemType( LegendItemType.SERIES_LITERAL );
		lg.setVisible(legendVisible);

		// X-Axis
		Axis xAxisPrimary = chart.getPrimaryBaseAxes( )[0];
		xAxisPrimary.setType( AxisType.TEXT_LITERAL );
		xAxisPrimary.getMajorGrid( ).setTickStyle( TickStyle.BELOW_LITERAL );
		xAxisPrimary.getOrigin( ).setType( IntersectionType.MIN_LITERAL );
		xAxisPrimary.getLabel().getCaption().getFont().setSize(fontSize);
		xAxisPrimary.getLabel().getCaption().getFont().setName(font);
		
		// Y-Axis
		Axis yAxisPrimary = chart.getPrimaryOrthogonalAxis( xAxisPrimary );
		yAxisPrimary.getMajorGrid( ).setTickStyle( TickStyle.LEFT_LITERAL );
		yAxisPrimary.setType( AxisType.LINEAR_LITERAL );
		//yAxisPrimary.getLabel( ).getCaption( ).getFont( ).setRotation( 90 );
		yAxisPrimary.getLabel().getCaption().getFont().setSize(fontSize);
		yAxisPrimary.getLabel().getCaption().getFont().setName(font);
		yAxisPrimary.getTitle().getCaption().getFont().setSize(fontSize);
		yAxisPrimary.getTitle().getCaption().getFont().setName(font);
		yAxisPrimary.getTitle().getCaption().getFont().setBold(true);
		yAxisPrimary.getTitle( ).getCaption( ).setValue( "Technology Level" );//$NON-NLS-1$
		yAxisPrimary.getTitle().setVisible(true);

		return chart;
	}
}
