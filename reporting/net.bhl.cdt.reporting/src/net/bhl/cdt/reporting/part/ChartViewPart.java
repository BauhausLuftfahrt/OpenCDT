package net.bhl.cdt.reporting.part;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.exception.ChartException;
import org.eclipse.birt.chart.factory.GeneratedChartState;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.util.PluginSettings;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.reporting.chart.BirtChartFactory;

/**
 * 
 * @author Michael.Shamiyeh
 *
 */
public class ChartViewPart {
	
	private CDTLogService log;
	
	private Canvas canvas;

	/**
	 * The device render for rendering chart.
	 */
	private IDeviceRenderer render = null;

	/**
	 * The chart model.
	 */
	private reporting.Chart chartModel;
	
	/**
	 * The chart instance.
	 */
	private Chart chart = null;
	
	/**
	 * The chart state.
	 */
	private GeneratedChartState state = null;
	
	/**
	 * The image which caches the chart image to improve drawing performance.
	 */
	private Image cachedImage = null;

	public ChartViewPart() {
	}
	
	@PostConstruct
	public void createUI(Composite parent, @Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection, CDTLogService log) {
		this.log = log;
		
		canvas = new Canvas(parent, SWT.NONE);
		
		chartModel = (reporting.Chart)selection;
		
		chart = BirtChartFactory.createChart(chartModel);
		
		try {
			PluginSettings ps = PluginSettings.instance();
			render = ps.getDevice("dv.SWT");
		} catch (ChartException pex) {
			pex.printStackTrace();
		}

		canvas.addPaintListener(new PaintListener() {

			public void paintControl(PaintEvent e) {

				Composite co = (Composite) e.getSource();
				final Rectangle rect = co.getClientArea();

				render.setProperty(IDeviceRenderer.GRAPHICS_CONTEXT, e.gc);

				if (cachedImage == null) {
					buildChart();
					drawToCachedImage(rect);
				}
				e.gc.drawImage(cachedImage, 0, 0, cachedImage.getBounds().width, cachedImage.getBounds().height, 0, 0, rect.width, rect.height);

			}
		});

		canvas.addControlListener(new ControlAdapter() {

			public void controlResized(ControlEvent e) {

				render.setProperty(IDeviceRenderer.GRAPHICS_CONTEXT, new GC(canvas));

				buildChart();
				cachedImage = null;
			}
		});
	}
	
	@Inject
	public void setInput(@Optional Chart chart) {
		
	}
	
	/**
	 * Builds the chart state. This method should be call when data is changed.
	 */
	private void buildChart() {
		Point size = canvas.getSize();
		Bounds bo = BoundsImpl.create(0, 0, size.x, size.y);
		int resolution = render.getDisplayServer().getDpiResolution();
		bo.scale(72d / resolution);
		try {
			Generator gr = Generator.instance();
			state = gr.build(render.getDisplayServer(), chart, bo, null, null, null);
		} catch (ChartException ex) {
			log.error("Error while building chart...", ex);
		}
	}

	/**
	 * Draws the chart onto the cached image in the area of the given
	 * <code>Rectangle</code>.
	 * 
	 * @param size
	 *            the area to draw
	 */
	public void drawToCachedImage(Rectangle size) {
		GC gc = null;
		try {
			if (cachedImage != null)
				cachedImage.dispose();
			cachedImage = new Image(Display.getCurrent(), size.width, size.height);

			gc = new GC(cachedImage);
			render.setProperty(IDeviceRenderer.GRAPHICS_CONTEXT, gc);

			Generator gr = Generator.instance();

			gr.render(render, state);
		} catch (ChartException ex) {
			log.error("Error while drawing chart to image...", ex);
		} finally {
			if (gc != null)
				gc.dispose();
		}
	}
	
	/**
	 * Returns the chart which is contained in this canvas.
	 * 
	 * @return the chart contained in this canvas.
	 */
	public Chart getChart() {
		return chart;
	}

	/**
	 * Sets the chart into this canvas. Note: When the chart is set, the cached
	 * image will be dopped, but this method doesn't reset the flag
	 * <code>cachedImage</code>.
	 * 
	 * @param chart
	 *            the chart to set
	 */
	public void setChart(Chart chart) {
		if (cachedImage != null)
			cachedImage.dispose();

		cachedImage = null;
		this.chart = chart;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.widgets.Widget#dispose()
	 */
	public void dispose() {
		if (cachedImage != null)
			cachedImage.dispose();
	}
}
