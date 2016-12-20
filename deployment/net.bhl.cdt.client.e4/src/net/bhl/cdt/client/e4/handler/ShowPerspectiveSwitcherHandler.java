 
package net.bhl.cdt.client.e4.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;

import net.bhl.cdt.client.ui.CDTUIManager;

public class ShowPerspectiveSwitcherHandler {
	@Execute
	public void execute(CDTUIManager manager, MHandledItem handledItem) {
		manager.CDTPerspectiveSwitcherVisibility(handledItem.isSelected());
		manager.SetWindowTitle("PAXelerate");
	}	
}