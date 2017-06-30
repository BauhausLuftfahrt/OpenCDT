package net.bhl.cdt.ui.e4.parts.logview;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-30
 *
 */
public class LogViewPartFilterHandler {
	@Execute
	public void execute(final MToolItem item, final MPart part) {
		LogViewPart logPart = (LogViewPart) part.getObject();

		switch (item.getElementId()) {
		case LogViewPart.INFOS_VISIBLE_BT_ID:
			logPart.setInfosVisible(item.isSelected());
			break;
			
		case LogViewPart.WARNINGS_VISIBLE_BT_ID:
			logPart.setWarningsVisible(item.isSelected());
			break;
			
		case LogViewPart.ERRORS_VISIBLE_BT_ID:
			logPart.setErrorsVisible(item.isSelected());
			break;
			
		case LogViewPart.DEBUG_VISIBLE_BT_ID:
			logPart.setDebugVisible(item.isSelected());
			break;
		}

		logPart.updateFilter();
	}
}
