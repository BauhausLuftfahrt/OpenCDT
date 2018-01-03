/*******************************************************************************
* <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
* materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
* and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
******************************************************************************/
package net.bhl.cdt.ui.e4.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import net.bhl.cdt.ui.e4.parts.explorer.ExplorerViewPart;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-04
 *
 */
public class RefreshCDTExplorerViewHandler {
    @Execute
    public void execute(EPartService partService) {
	ExplorerViewPart explorerPart = (ExplorerViewPart)partService.findPart(ExplorerViewPart.PART_ID).getObject();
	explorerPart.refresh();
    }
}