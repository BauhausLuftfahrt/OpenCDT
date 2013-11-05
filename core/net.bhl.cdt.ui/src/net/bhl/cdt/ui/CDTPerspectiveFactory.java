/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui;

import net.bhl.cdt.ui.views.ConfigurationView;

import org.eclipse.emf.ecp.ui.views.ModelExplorerView;
import org.eclipse.emf.ecp.ui.views.ModelRepositoriesView;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Creates the CDTPerspective. Called by implemented extension point.
 * 
 * @author Michael Kagel, David Otter
 */
@SuppressWarnings("restriction")
public class CDTPerspectiveFactory implements IPerspectiveFactory {

	private IPageLayout layout;

	@Override
	public void createInitialLayout(IPageLayout layout) {
		this.layout = layout;
		addViews();
	}

	private void addViews() {

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.25f, layout.getEditorArea());
		left.addView(ModelExplorerView.ID);

		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, 0.70f, layout.getEditorArea());
		right.addView(ConfigurationView.ID);
		right.addView(ModelRepositoriesView.ID);

		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.70f, layout.getEditorArea());
		bottom.addView(IPageLayout.ID_PROP_SHEET);
	}

}
