/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import net.bhl.cdt.ui.e4.parts.logview.CDTLogViewPart;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-30
 *
 */
public class SortCDTLogViewHandler {
    @Execute
    public void execute(final MToolItem item, EPartService partService) {
	CDTLogViewPart logPart = (CDTLogViewPart)partService.findPart(CDTLogViewPart.PART_ID).getObject();

	switch (item.getElementId()) {
	case CDTLogViewPart.PART_TOOLBAR_ITEM_INFOSVISIBLE_ID:
	    logPart.setInfosVisible(item.isSelected());
	    break;

	case CDTLogViewPart.PART_TOOLBAR_ITEM_WARNINGSVISIBLE_ID:
	    logPart.setWarningsVisible(item.isSelected());
	    break;

	case CDTLogViewPart.PART_TOOLBAR_ITEM_ERRORSVISIBLE_ID:
	    logPart.setErrorsVisible(item.isSelected());
	    break;

	case CDTLogViewPart.PART_TOOLBAR_ITEM_DEBUGVISIBLE_ID:
	    logPart.setDebugVisible(item.isSelected());
	    break;
	}

	logPart.updateFilter();
    }
}