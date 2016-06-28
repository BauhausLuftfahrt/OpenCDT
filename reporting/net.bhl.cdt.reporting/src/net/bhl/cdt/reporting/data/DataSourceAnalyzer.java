package net.bhl.cdt.reporting.data;

import java.util.ArrayList;
import java.util.Date;

import org.eclipse.birt.chart.extension.datafeed.GanttEntry;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.DataType;
import org.eclipse.birt.chart.model.attribute.SortOption;
import org.eclipse.birt.chart.model.data.GanttDataSet;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.GanttDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.type.GanttSeries;
import org.eclipse.birt.chart.model.type.impl.GanttSeriesImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectEList;

import reporting.DataSourceDefinition;
import reporting.GanttChart;
import reporting.GanttChartDataSource;

public class DataSourceAnalyzer {
	public DataSourceAnalyzer() {
	}

	public static void createChartData(reporting.Chart chartModel, Chart chart) {
		if (chartModel instanceof GanttChart)
			createGanttChart((GanttChart)chartModel, (ChartWithAxes)chart);
	}

	private static void createGanttChart(GanttChart chartModel, ChartWithAxes chart) {
		GanttChartDataSource source = (GanttChartDataSource)chartModel.getDataSource();

		DataSourceDefinition sourceDefinition = source.getDefinition();

		EObject obj = source.getSourceObject();

		@SuppressWarnings("unchecked")
		EObjectEList<EObject> dataList = (EObjectEList<EObject>) obj.eGet(sourceDefinition.getMember());

		ArrayList<GanttEntry> entries = new ArrayList<GanttEntry>();
		
		for (EObject dataObj : dataList) {
		}

		TextDataSet set = TextDataSetImpl.create(oValues);
		
		for (EObject dataObj : dataList) {
			if (dataObj.eGet(source.getStartDateField().getField()) != null && dataObj.eGet(source.getEndDateField().getField()) != null)
				entries.add(new GanttEntry((Date)dataObj.eGet(source.getStartDateField().getField()), (Date)dataObj.eGet(source.getEndDateField().getField()), (String)dataObj.eGet(source.getTaskNameField().getField())));
		}

		// if (tagbase != null && tagbase.getProjects() != null) {
		// List<Project> projects = tagbase.getProjects().getItems();
		//
		// for (int i = 0; i < projects.size(); i++) {
		// Project proj = projects.get(i);
		//
		// if (proj.getBegin() != null && proj.getEnd() != null) {
		// if (proj.getTopic1().toLowerCase().equals("aircraft")) {
		// try {
		// int levelInt = Integer.parseInt(proj.getTechnologyLevel());
		// levels.add(levelInt);
		// entries.add(new GanttEntry(proj.getBegin(), proj.getEnd(),
		// proj.getShortName())); // $NON-NLS-1$
		// } catch (NumberFormatException e) {
		// }
		// }
		// }
		// }
		//
		// boolean sorted = false;
		// while (!sorted) {
		// sorted = true;
		// for (int i = 0; i < levels.size() - 1; i++) {
		// if (levels.get(i) > levels.get(i + 1)) {
		// int levelTemp = levels.get(i);
		// levels.set(i, levels.get(i + 1));
		// levels.set(i + 1, levelTemp);
		//
		// GanttEntry entryTemp = entries.get(i);
		// entries.set(i, entries.get(i + 1));
		// entries.set(i + 1, entryTemp);
		//
		// sorted = false;
		// }
		// }
		// }
		// }
		//
		// ArrayList<Fill> bhlPalette = ColorPaletteFactory.createBHLPalette();
		//
		GanttDataSet phase = GanttDataSetImpl.create(entries.toArray());
		//NumberDataSet categoryValues = NumberDataSetImpl.create(levels);
		//
		 // Y-Series
		 //Series seCategory = SeriesImpl.create();
		 //seCategory.setDataSet(categoryValues);
		 //seCategory.getLabel().getCaption().getFont().setSize(FONT_SIZE);
		 //seCategory.getLabel().getCaption().getFont().setName(FONT);
		
		 SeriesDefinition sdY = SeriesDefinitionImpl.create();
		 //sdY.getSeries().add(seCategory);
		 sdY.setSorting(SortOption.DESCENDING_LITERAL);
		 sdY.getGrouping().setGroupType(DataType.NUMERIC_LITERAL);
		 sdY.getGrouping().setEnabled(true);
		 chart.getPrimaryBaseAxes()[0].getSeriesDefinitions().add(sdY);
		
//		 sdY.getSeriesPalette().getEntries().clear();
//		 for (int i = 0; i < entries.size(); i++)
//		 sdY.getSeriesPalette().getEntries().add(bhlPalette.get(levels.get(i)));
		
		 // X-Series
		 GanttSeries taskPhase1 = (GanttSeries)GanttSeriesImpl.create();
		 taskPhase1.setDataSet(phase);
//		 taskPhase1.getDecorationLabel().getCaption().getFont().setSize(FONT_SIZE);
//		 taskPhase1.getDecorationLabel().getCaption().getFont().setName(FONT);
//		 taskPhase1.getLabel().getCaption().getFont().setSize(FONT_SIZE);
//		 taskPhase1.getLabel().getCaption().getFont().setName(FONT);
		 taskPhase1.getLabel().setVisible(false);
		
		 SeriesDefinition sdX = SeriesDefinitionImpl.create();
		
//		 sdX.getSeriesPalette().getEntries().clear();
//		 for (int i = 0; i < entries.size(); i++) {
//		 sdX.getSeriesPalette().getEntries().add(bhlPalette.get(levels.get(i)));
//		 }
		
		 chart.getPrimaryOrthogonalAxis(chart.getPrimaryBaseAxes()[0]).getSeriesDefinitions().add(sdX);
		 sdX.getSeries().add(taskPhase1);
	}
}
