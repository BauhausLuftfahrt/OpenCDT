/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui;

import net.bhl.cdt.ui.adapter.CDTAdapterFacotry;
import net.bhl.cdt.ui.views.ConfigurationView;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecp.navigator.TreeView;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Creates the CDTPerspective. Called by implemented extension point.
 * 
 * @author Michael Kagel
 */
public class CDTPerspectiveFactory implements IPerspectiveFactory {

	private IPageLayout layout;

	@Override
	public void createInitialLayout(IPageLayout layout) {
		this.layout = layout;
		addViews();
	}

	private void addViews() {

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT,
				0.25f, layout.getEditorArea());
		left.addView("org.eclipse.emf.ecp.navigator.viewer");

		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT,
				0.70f, layout.getEditorArea());
		right.addView(ConfigurationView.ID);

		IFolderLayout bottom = layout.createFolder("bottom",
				IPageLayout.BOTTOM, 0.70f, layout.getEditorArea());
		bottom.addView(IPageLayout.ID_PROP_SHEET);

		CDTAdapterFacotry facotry = new CDTAdapterFacotry();
		Platform.getAdapterManager().registerAdapters(facotry, TreeView.class);
		Platform.getAdapterManager().registerAdapters(facotry,
				ConfigurationView.class);

	}

}
