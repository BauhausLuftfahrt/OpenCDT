package net.bhl.cdt.report.part;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.type.BarSeries;
import org.eclipse.birt.chart.model.type.impl.BarSeriesImpl;

public class BarChartViewPart extends AbstractChartViewPart {
	
	@Override
	protected Chart createChart() {
		chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH_LITERAL);

		chart.getPlot().setBackground(ColorDefinitionImpl.ORANGE());
		chart.getPlot().getClientArea().setBackground(ColorDefinitionImpl.YELLOW());

		chart.getLegend().setItemType(LegendItemType.CATEGORIES_LITERAL);
		chart.getLegend().setVisible(true);

		chart.getTitle().getLabel().getCaption().setValue("Chart Title");
		chart.getTitle().getLabel().getCaption().getFont().setSize(14);
		chart.getTitle().getLabel().getCaption().getFont().setName("Arial");

//		xAxis = ((ChartWithAxes)chart).getPrimaryBaseAxes()[0];
//		xAxis.getTitle().setVisible(true);
//
//		xAxis.getTitle().getCaption().setValue(xTitle);
//
//		yAxis = ((ChartWithAxes)chart).getPrimaryOrthogonalAxis(xAxis);
//		yAxis.getTitle().setVisible(true);
//		yAxis.getTitle().getCaption().setValue(yTitle);
//		yAxis.getScale().setStep(1.0);
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
