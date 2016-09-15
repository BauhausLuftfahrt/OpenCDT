
package net.bhl.cdt.reporting.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Shell;

import net.bhl.cdt.core.ui.UIHelper;
import net.bhl.cdt.reporting.part.ChartViewPart;

public class SaveChartAsHandler {
	@Execute
	public void execute(EPartService partService, Shell shell) {
		if (partService.getActivePart().getObject() instanceof ChartViewPart) {

			ImageLoader loader = new ImageLoader();
			loader.data = new ImageData[] {
					((ChartViewPart) partService.getActivePart().getObject()).getImage().getImageData() };

			String path = UIHelper.showSaveFileDialog(shell, "Save Image", new String[] { ".png" });

			loader.save(path, SWT.IMAGE_PNG);
		}
	}
}