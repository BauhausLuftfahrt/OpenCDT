package net.bhl.cdt.report.part;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;

public class BarChartViewPart extends AbstractChartViewPart {
	
	private Axis xAxis;
	private Axis yAxis;
	
	@Override
	protected Chart createChart() {
		chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH_LITERAL);

		chart.getPlot().setBackground(ColorDefinitionImpl.WHITE());
		chart.getPlot().getClientArea().setBackground(ColorDefinitionImpl.WHITE());

		chart.getLegend().setItemType(LegendItemType.CATEGORIES_LITERAL);
		chart.getLegend().setVisible(false);

		chart.getTitle().getLabel().getCaption().setValue("Chart Title");
		chart.getTitle().getLabel().getCaption().getFont().setSize(14);
		chart.getTitle().getLabel().getCaption().getFont().setName("Arial");
		
		xAxis = ((ChartWithAxes)chart).getPrimaryBaseAxes()[0];
		xAxis.getTitle().setVisible(true);

		xAxis.getTitle().getCaption().setValue("X-Axis Title");

		yAxis = ((ChartWithAxes)chart).getPrimaryOrthogonalAxis(xAxis);
		yAxis.getTitle().setVisible(true);
		yAxis.getTitle().getCaption().setValue("Y-Axis Title");
		yAxis.getScale().setStep(1.0);
//
//		TextDataSet categoryValues = TextDataSetImpl.create(dataSet.getCities());
//
//		Series seCategory = SeriesImpl.create();
//		seCategory.setDataSet(categoryValues);
//
//		SeriesDefinition sdX = SeriesDefinitionImpl.create();
//		sdX.getSeriesPalette().update(1);
//
//		xAxisPrimary.getSeriesDefinitions().add(sdX);
//		sdX.getSeries().add(seCategory);
//
//		NumberDataSet orthoValuesDataSet1 = NumberDataSetImpl.create(dataSet.getTechnitians());
//
//		BarSeries bs1 = (BarSeries)BarSeriesImpl.create();
//		bs1.setDataSet(orthoValuesDataSet1);
//
//		SeriesDefinition sdY = SeriesDefinitionImpl.create();
//		yAxisPrimary.getSeriesDefinitions().add(sdY);
//		sdY.getSeries().add(bs1);

		return chart;
	}

}
