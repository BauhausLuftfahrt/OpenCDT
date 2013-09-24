/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.menu;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchPartSite;

/**
 * Helper class for generating a context menu.
 * 
 * @author Michael Kagel
 */
public final class ContextMenuGenerator {

	private ContextMenuGenerator() {
	}

	/**
	 * Generates a context menu, register the menu by a IWorkbenchPartSite for a
	 * specific Viewer.
	 * 
	 * @param partSite
	 *            The IWorkbenchPartSite where the context menu will be
	 *            registered
	 * @param viewer
	 *            The Viewer which the context menu is for
	 */
	public static void generateContextMenu(IWorkbenchPartSite partSite,
			Viewer viewer) {
		// create menu manager
		MenuManager menuManager = new MenuManager();
		menuManager.setRemoveAllWhenShown(true);

		// create menu
		Control control = viewer.getControl();
		Menu menu = menuManager.createContextMenu(control);
		control.setMenu(menu);

		// register menu for extension
		partSite.registerContextMenu(menuManager, viewer);
	}

}
