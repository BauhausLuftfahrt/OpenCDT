package net.bhl.cdt.reporting.chart;

import org.eclipse.birt.chart.extension.datafeed.BubbleEntry;
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
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.BaseSampleData;
import org.eclipse.birt.chart.model.data.BubbleDataSet;
import org.eclipse.birt.chart.model.data.DataFactory;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.OrthogonalSampleData;
import org.eclipse.birt.chart.model.data.SampleData;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.BubbleDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.DateTimeDataElementImpl;
import org.eclipse.birt.chart.model.data.impl.NumberDataElementImpl;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Legend;
import org.eclipse.birt.chart.model.layout.Plot;
import org.eclipse.birt.chart.model.type.BubbleSeries;
import org.eclipse.birt.chart.model.type.impl.BubbleSeriesImpl;
import org.eclipse.birt.chart.util.CDateTime;

import reporting.BubbleChart;
import reporting.DateAxis;
import reporting.FontPropertyElement;
import reporting.GanttChart;

public class BirtChartFactory {
	
	public static Chart createChart(reporting.Chart chartModel) {
		if (chartModel instanceof GanttChart)
			return createGanttChart((GanttChart)chartModel);
		
		if (chartModel instanceof BubbleChart)
			return createTestBubbleChart();
		
		return ChartWithAxesImpl.create();
	}
	
	public static ChartWithAxes createTestBubbleChart() {
		ChartWithAxes cwaBubble = ChartWithAxesImpl.create( );
		cwaBubble.setType( "Bubble Chart" ); //$NON-NLS-1$
		cwaBubble.setSubType( "Standard Bubble Chart" ); //$NON-NLS-1$
		// Plot
		cwaBubble.getBlock( ).setBackground( ColorDefinitionImpl.WHITE( ) );
		cwaBubble.getBlock( ).getOutline( ).setVisible( true );
		Plot p = cwaBubble.getPlot( );
		p.getClientArea( ).setBackground( ColorDefinitionImpl.create( 255,
				255,
				225 ) );

		// Title
		cwaBubble.getTitle( )
				.getLabel( )
				.getCaption( )
				.setValue( "Bubble Chart" ); //$NON-NLS-1$

		// Legend
		Legend lg = cwaBubble.getLegend( );
		lg.setItemType( LegendItemType.SERIES_LITERAL );

		// X-Axis
		Axis xAxisPrimary = cwaBubble.getPrimaryBaseAxes( )[0];
		xAxisPrimary.setType( AxisType.LINEAR_LITERAL );
		xAxisPrimary.getMajorGrid( ).setTickStyle( TickStyle.BELOW_LITERAL );
		xAxisPrimary.getOrigin( ).setType( IntersectionType.MIN_LITERAL );
		xAxisPrimary.getScale( ).setMin( NumberDataElementImpl.create( 0 ) );
		xAxisPrimary.getScale( ).setMax( NumberDataElementImpl.create( 140 ) );
		
		// Y-Axis
		Axis yAxisPrimary = cwaBubble.getPrimaryOrthogonalAxis( xAxisPrimary );
		yAxisPrimary.getMajorGrid( ).setTickStyle( TickStyle.LEFT_LITERAL );
		yAxisPrimary.setType( AxisType.LINEAR_LITERAL );
		yAxisPrimary.getLabel( ).getCaption( ).getFont( ).setRotation( 90 );

		// Data Set
		NumberDataSet categoryValues = NumberDataSetImpl.create( new double[] {
				20,45,70,100,120,130
		});
		BubbleDataSet values1 = BubbleDataSetImpl.create( new BubbleEntry[]{
				null,
				new BubbleEntry( Integer.valueOf( 15 ), Integer.valueOf( 100 ) ),
				new BubbleEntry( Integer.valueOf( 18 ), Integer.valueOf( 80 ) ),
				null,
				new BubbleEntry( Integer.valueOf( 23 ), Integer.valueOf( 100 ) ),
				null
		} );
		BubbleDataSet values2 = BubbleDataSetImpl.create( new BubbleEntry[]{
				new BubbleEntry( Integer.valueOf( 50 ), Integer.valueOf( 60 ) ),
				null,
				null,
				new BubbleEntry( Integer.valueOf( 43 ), Integer.valueOf( 80 ) ),
				new BubbleEntry( Integer.valueOf( 12 ), Integer.valueOf( 100 ) ),
				null
		} );
		BubbleDataSet values3 = BubbleDataSetImpl.create( new BubbleEntry[]{
				null,
				null,
				new BubbleEntry( Integer.valueOf( 43 ), Integer.valueOf( 75 ) ),
				new BubbleEntry( Integer.valueOf( 31 ), Integer.valueOf( 93 ) ),
				null,
				new BubbleEntry( Integer.valueOf( 25 ), Integer.valueOf( 50 ) )
		} );
		SampleData sd = DataFactory.eINSTANCE.createSampleData( );
		BaseSampleData sdBase = DataFactory.eINSTANCE.createBaseSampleData( );
		sdBase.setDataSetRepresentation( "" );//$NON-NLS-1$
		sd.getBaseSampleData( ).add( sdBase );

		OrthogonalSampleData sdOrthogonal1 = DataFactory.eINSTANCE.createOrthogonalSampleData( );
		sdOrthogonal1.setDataSetRepresentation( "" );//$NON-NLS-1$
		sdOrthogonal1.setSeriesDefinitionIndex( 0 );
		sd.getOrthogonalSampleData( ).add( sdOrthogonal1 );

		cwaBubble.setSampleData( sd );

		// X-Series
		Series seCategory = SeriesImpl.create( );
		seCategory.setDataSet( categoryValues );

		SeriesDefinition sdX = SeriesDefinitionImpl.create( );
		sdX.getSeriesPalette( ).shift( 0 );
		xAxisPrimary.getSeriesDefinitions( ).add( sdX );
		sdX.getSeries( ).add( seCategory );

		// Y-Series
		BubbleSeries bs1 = (BubbleSeries) BubbleSeriesImpl.create( );
		bs1.setDataSet( values1 );
		bs1.getLabel( ).setVisible( false );
		
		BubbleSeries bs2 = (BubbleSeries) BubbleSeriesImpl.create( );
		bs2.setDataSet( values2 );
		bs2.getLabel( ).setVisible( false );
		
		BubbleSeries bs3 = (BubbleSeries) BubbleSeriesImpl.create( );
		bs3.setDataSet( values3 );
		bs3.getLabel( ).setVisible( false );

		SeriesDefinition sdY = SeriesDefinitionImpl.create( );
		sdY.getSeriesPalette( ).shift( -1 );
		yAxisPrimary.getSeriesDefinitions( ).add( sdY );
		sdY.getSeries( ).add( bs1 );
		sdY.getSeries( ).add( bs2 );
		sdY.getSeries( ).add( bs3 );

		return cwaBubble;
	}
	
	public static ChartWithAxes createGanttChart(reporting.GanttChart chartModel) {
		ChartWithAxes chart = ChartWithAxesImpl.create();
		chart.setType("Gantt Chart"); //$NON-NLS-1$
		chart.setSubType("Standard Gantt Chart"); //$NON-NLS-1$
		chart.setOrientation(Orientation.HORIZONTAL_LITERAL);
		
		chart.getBlock().setBackground(ColorDefinitionImpl.WHITE());
		chart.getBlock().getOutline().setVisible(false);

		Plot p = chart.getPlot();
		p.getClientArea().setBackground(ColorDefinitionImpl.WHITE());

		copyCaptionStyle(chart.getTitle().getLabel().getCaption().getFont(), chartModel.getTitle());
		chart.getTitle().getLabel().getCaption().setValue(chartModel.getTitle().getText());
		
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

		DateAxis xAxisModel = (DateAxis)chartModel.getXAxis();
			
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
		//dfs.setDetail(DateFormatDetail.DATE_LITERAL);
		//dfs.setType(DateFormatType.SHORT_LITERAL);
		xAxisPrimary.setFormatSpecifier(dfs);
		
		return chart;
	}
	
	private static void copyCaptionStyle(FontDefinition fontDefinition, FontPropertyElement fontProperty) {
		fontDefinition.setName(fontProperty.getFamily());
		fontDefinition.setSize(fontProperty.getSize());
		fontDefinition.setBold(fontProperty.isBold());
		fontDefinition.setItalic(fontProperty.isItalic());
	}
	
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
