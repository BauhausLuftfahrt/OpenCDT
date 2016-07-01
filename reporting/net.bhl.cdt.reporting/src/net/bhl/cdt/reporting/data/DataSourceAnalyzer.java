package net.bhl.cdt.reporting.data;

import java.util.ArrayList;
import java.util.Date;

import org.eclipse.birt.chart.extension.datafeed.BubbleEntry;
import org.eclipse.birt.chart.extension.datafeed.GanttEntry;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.DataType;
import org.eclipse.birt.chart.model.attribute.Fill;
import org.eclipse.birt.chart.model.attribute.SortOption;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.BubbleDataSet;
import org.eclipse.birt.chart.model.data.GanttDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.impl.BubbleDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.GanttDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.type.BubbleSeries;
import org.eclipse.birt.chart.model.type.GanttSeries;
import org.eclipse.birt.chart.model.type.impl.BubbleSeriesImpl;
import org.eclipse.birt.chart.model.type.impl.GanttSeriesImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectEList;

import net.bhl.cdt.reporting.chart.ColorPaletteFactory;
import reporting.BubbleChart;
import reporting.DataSource;
import reporting.DataSourceDefinition;
import reporting.DataSourceFilter;
import reporting.DataSourceGrouping;
import reporting.GanttChart;

public class DataSourceAnalyzer {
	public DataSourceAnalyzer() {
	}

	public static void createChartData(reporting.Chart chartModel, Chart chart) {
		if (chartModel instanceof GanttChart)
			createGanttChart((GanttChart) chartModel, (ChartWithAxes) chart);

		if (chartModel instanceof BubbleChart)
			createBubbleChart((BubbleChart) chartModel, (ChartWithAxes) chart);
	}

	@SuppressWarnings("unchecked")
	private static void createBubbleChart(BubbleChart chartModel, ChartWithAxes chart) {
		DataSource source = chartModel.getDataSource();

		DataSourceDefinition sourceDefinition = source.getDefinition();

		EObject obj = source.getSourceObject();

		EObjectEList<EObject> dataList = (EObjectEList<EObject>) obj.eGet(sourceDefinition.getMember());
		
		DataSourceGrouping grouping = chartModel.getDataSource().getGroupings().get(0);
		
		ArrayList<String> countries = new ArrayList<String>();
		ArrayList<Integer> levels = new ArrayList<Integer>();
		ArrayList<EObject> projects = new ArrayList<EObject>();
		for (EObject dataObj : dataList) {
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
				String level = (String) dataObj.eGet(chartModel.getYCoordinateField().getField());
				try {
					int levInt = Integer.parseInt(level);

					if (!levels.contains(levInt))
						levels.add(levInt);

					EObject organisation = (EObject) dataObj.eGet(grouping.getSubSource().getDefinition().getMember());
					String country = (String) organisation.eGet(chartModel.getXCoordinateField().getField());
					if (!countries.contains(country))
						countries.add(country);

					projects.add(dataObj);
				} catch (NumberFormatException ex) {
				}
			}
		}
		
		int[][] count = new int[countries.size()][levels.size()];
		for(int i = 0; i < countries.size(); i++)
			for(int j = 0; j < levels.size(); j++)
				count[i][j] = 0;
		
		for (EObject dataObj : projects) {
			EObject organisation = (EObject)dataObj.eGet(grouping.getSubSource().getDefinition().getMember());
			String country = (String)organisation.eGet(chartModel.getXCoordinateField().getField());
			String level = (String)dataObj.eGet(chartModel.getYCoordinateField().getField());
			
			int countryIndex = countries.indexOf(country);
			int levelIndex = levels.indexOf(Integer.parseInt(level));
			
			count[countryIndex][levelIndex] = count[countryIndex][levelIndex] + 1;
		}
		
		String[] countryArray = new String[countries.size()];
		TextDataSet categoryValues = TextDataSetImpl.create(countries.toArray(countryArray));
		
		ArrayList<BubbleDataSet> bubbleDataSets = new ArrayList<BubbleDataSet>();
		for (int j = 0; j < levels.size(); j++) {
			ArrayList<BubbleEntry> bubbles = new ArrayList<BubbleEntry>();
			for (int i = 0; i < countries.size(); i++) {
					bubbles.add(new BubbleEntry(levels.get(j), count[i][j]));
			}
			
			BubbleEntry[] bubbleArray = new BubbleEntry[bubbles.size()];
			bubbleArray = bubbles.toArray(bubbleArray);
			
			bubbleDataSets.add(BubbleDataSetImpl.create(bubbleArray));
		}
		
//		// Data Set
//		NumberDataSet categoryValues = NumberDataSetImpl.create(new double[] { 20, 45, 70, 100, 120, 130 });
//		BubbleDataSet values1 = BubbleDataSetImpl
//				.create(new BubbleEntry[] { null, new BubbleEntry(Integer.valueOf(15), Integer.valueOf(100)),
//						new BubbleEntry(Integer.valueOf(18), Integer.valueOf(80)), null,
//						new BubbleEntry(Integer.valueOf(23), Integer.valueOf(100)), null });
//		BubbleDataSet values2 = BubbleDataSetImpl
//				.create(new BubbleEntry[] { new BubbleEntry(Integer.valueOf(50), Integer.valueOf(60)), null, null,
//						new BubbleEntry(Integer.valueOf(43), Integer.valueOf(80)),
//						new BubbleEntry(Integer.valueOf(12), Integer.valueOf(100)), null });
//		BubbleDataSet values3 = BubbleDataSetImpl
//				.create(new BubbleEntry[] { null, null, new BubbleEntry(Integer.valueOf(43), Integer.valueOf(75)),
//						new BubbleEntry(Integer.valueOf(31), Integer.valueOf(93)), null,
//						new BubbleEntry(Integer.valueOf(25), Integer.valueOf(50)) });
//		SampleData sd = DataFactory.eINSTANCE.createSampleData();
//		BaseSampleData sdBase = DataFactory.eINSTANCE.createBaseSampleData();
//		sdBase.setDataSetRepresentation("");//$NON-NLS-1$
//		sd.getBaseSampleData().add(sdBase);
//
//		OrthogonalSampleData sdOrthogonal1 = DataFactory.eINSTANCE.createOrthogonalSampleData();
//		sdOrthogonal1.setDataSetRepresentation("");//$NON-NLS-1$
//		sdOrthogonal1.setSeriesDefinitionIndex(0);
//		sd.getOrthogonalSampleData().add(sdOrthogonal1);
//
//		chart.setSampleData(sd);

		// X-Series
		Series seCategory = SeriesImpl.create();
		seCategory.setDataSet(categoryValues);

		SeriesDefinition sdX = SeriesDefinitionImpl.create();
		sdX.getSeriesPalette().shift(0);
		chart.getPrimaryBaseAxes()[0].getSeriesDefinitions().add(sdX);
		sdX.getSeries().add(seCategory);

		// Y-Series
		SeriesDefinition sdY = SeriesDefinitionImpl.create();
		sdY.getSeriesPalette().shift(-1);
		chart.getPrimaryOrthogonalAxis(chart.getPrimaryBaseAxes()[0]).getSeriesDefinitions().add(sdY);
		
		for (BubbleDataSet ds : bubbleDataSets) {
			BubbleSeries bs = (BubbleSeries) BubbleSeriesImpl.create();
			bs.setDataSet(ds);
			bs.getLabel().setVisible(false);
			sdY.getSeries().add(bs);
		}
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

		if (entries.size() > 20) {
			sdY.getSeriesPalette().getEntries().clear();

			ArrayList<Fill> bhlColors = ColorPaletteFactory.createBHLPalette();
			
			int currentColorIndex = 0;
			String lastCategory = categoryArray[0];
			for (int i = 0; i < entries.size(); i++) {
				if (!categoryArray[i].equalsIgnoreCase(lastCategory)) {
					if (currentColorIndex < bhlColors.size() - 1)
						currentColorIndex = currentColorIndex + 1;
					else
						currentColorIndex = 0;
					
					lastCategory = categoryArray[i];
				}
				
				sdY.getSeriesPalette().getEntries().add(bhlColors.get(currentColorIndex));
			}
		}

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
				if (categories.get(i).compareTo(categories.get(i + 1)) > 0) {
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