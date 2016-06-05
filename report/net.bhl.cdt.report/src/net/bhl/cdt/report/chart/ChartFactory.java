package net.bhl.cdt.report.chart;

import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.Orientation;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Plot;

public class ChartFactory {
	public static ChartWithAxes createGanttChart(String title) {
		ChartWithAxes chart = ChartWithAxesImpl.create();
		chart.setType("Gantt Chart"); //$NON-NLS-1$
		chart.setSubType("Standard Gantt Chart"); //$NON-NLS-1$
		chart.setOrientation(Orientation.HORIZONTAL_LITERAL);

		chart.getBlock().setBackground(ColorDefinitionImpl.WHITE());
		chart.getBlock().getOutline().setVisible(false);
		
		Plot p = chart.getPlot();
		p.getClientArea().setBackground(ColorDefinitionImpl.WHITE());
		
		chart.getTitle().getLabel().getCaption().setValue(title); // $NON-NLS-1$
		
		return chart;
	}
}
