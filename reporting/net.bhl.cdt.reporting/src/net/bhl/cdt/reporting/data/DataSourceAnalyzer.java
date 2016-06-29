package net.bhl.cdt.reporting.data;

import java.util.ArrayList;
import java.util.Date;

import org.eclipse.birt.chart.extension.datafeed.GanttEntry;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.DataType;
import org.eclipse.birt.chart.model.attribute.SortOption;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.GradientImpl;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.GanttDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.impl.GanttDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.type.GanttSeries;
import org.eclipse.birt.chart.model.type.impl.GanttSeriesImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectEList;

import reporting.DataSource;
import reporting.DataSourceDefinition;
import reporting.DataSourceFilter;
import reporting.GanttChart;

public class DataSourceAnalyzer {
	public DataSourceAnalyzer() {
	}

	public static void createChartData(reporting.Chart chartModel, Chart chart) {
		if (chartModel instanceof GanttChart)
			createGanttChart((GanttChart) chartModel, (ChartWithAxes) chart);
	}

	@SuppressWarnings("unchecked")
	private static void createGanttChart(GanttChart chartModel, ChartWithAxes chart) {
		DataSource source = chartModel.getDataSource();

		DataSourceDefinition sourceDefinition = source.getDefinition();

		EObject obj = source.getSourceObject();

		EObjectEList<EObject> dataList = (EObjectEList<EObject>) obj.eGet(sourceDefinition.getMember());

		ArrayList<GanttEntry> entries = new ArrayList<GanttEntry>();
		ArrayList<String> categories = new ArrayList<String>();

		for (EObject dataObj : dataList) {
			if (dataObj.eGet(chartModel.getStartDateField().getField()) != null
					&& dataObj.eGet(chartModel.getEndDateField().getField()) != null) {
				boolean filtersPassed = true;
				for (DataSourceFilter filter : source.getFilter()) {
					boolean filterPassed = false;
					EObjectEList<EObject> filterObjectList = (EObjectEList<EObject>) dataObj
							.eGet(filter.getSubSource().getDefinition().getMember());

					for (EObject fObj : filterObjectList) {
						if (fObj.eGet(filter.getFilterField()).equals(filter.getFilterValue())) {
							filterPassed = true;
							break;
						}
					}

					if (!filterPassed) {
						filtersPassed = false;
						break;
					}
				}

				if (filtersPassed) {
					entries.add(new GanttEntry((Date) dataObj.eGet(chartModel.getStartDateField().getField()),
							(Date) dataObj.eGet(chartModel.getEndDateField().getField()),
							(String) dataObj.eGet(chartModel.getTaskNameField().getField())));

					if (!source.getGroupings().isEmpty())
						categories.add(dataObj.eGet(source.getGroupings().get(0).getGroupingField()).toString());
					else
						categories.add((String) dataObj.eGet(chartModel.getTaskNameField().getField()));
				}
			}
		}

		groupData(entries, categories);

		String[] categoryArray = new String[categories.size()];

		TextDataSet categoryValues = TextDataSetImpl.create(categories.toArray(categoryArray));
		GanttDataSet phase = GanttDataSetImpl.create(entries.toArray());

		// Y-Series
		Series seCategory = SeriesImpl.create();
		seCategory.setDataSet(categoryValues);

		SeriesDefinition sdY = SeriesDefinitionImpl.create();
		sdY.getSeries().add(seCategory);
		sdY.setSorting(SortOption.DESCENDING_LITERAL);
		sdY.getGrouping().setGroupType(DataType.NUMERIC_LITERAL);
		sdY.getGrouping().setEnabled(true);
		chart.getPrimaryBaseAxes()[0].getSeriesDefinitions().add(sdY);

		sdY.getSeriesPalette().getEntries().clear();

		for (int i = 0; i < entries.size(); i++)
			sdY.getSeriesPalette().getEntries().add(GradientImpl.create(ColorDefinitionImpl.create(10, 58, 90),
					ColorDefinitionImpl.create(10, 58, 90), 0, false));

		// X-Series
		GanttSeries taskPhase1 = (GanttSeries) GanttSeriesImpl.create();
		taskPhase1.setDataSet(phase);
		taskPhase1.getLabel().setVisible(false);

		SeriesDefinition sdX = SeriesDefinitionImpl.create();
		sdX.getSeriesPalette().shift(0);

		chart.getPrimaryOrthogonalAxis(chart.getPrimaryBaseAxes()[0]).getSeriesDefinitions().add(sdX);
		sdX.getSeries().add(taskPhase1);
	}

	private static void groupData(ArrayList<GanttEntry> entries, ArrayList<String> categories) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < categories.size() - 1; i++) {
				if (categories.get(i).compareTo(categories.get(i + 1)) > 1) {
					String categoryTemp = categories.get(i);
					categories.set(i, categories.get(i + 1));
					categories.set(i + 1, categoryTemp);

					GanttEntry entryTemp = entries.get(i);
					entries.set(i, entries.get(i + 1));
					entries.set(i + 1, entryTemp);

					sorted = false;
				}
			}
		}
	}
}