/*******************************************************************************
 * Copyright (c) 2012 Joseph Carroll and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Joseph Carroll <jdsalingerjr@gmail.com> - initial API and implementation
 ******************************************************************************/
package org.eclipse.e4.ui.workbench.perspectiveswitcher.internal.dialogs;

import java.util.HashMap;

import javax.inject.Inject;

import org.eclipse.core.runtime.Assert;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.core.services.translation.TranslationService;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.workbench.IResourceUtilities;
import org.eclipse.e4.ui.workbench.perspectiveswitcher.E4PerspectiveSwitcherActivator;
import org.eclipse.e4.ui.workbench.perspectiveswitcher.tools.E4Util;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

@Creatable
public class PerspectiveLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Inject
	private Logger logger;

	@Inject
	private IResourceUtilities<ImageDescriptor> resourceUtilities;

	@Inject
	private TranslationService translationService;

	/**
	 * List of all Image objects this label provider is responsible for.
	 */
	private HashMap<ImageDescriptor, Image> imageCache = new HashMap<>(5);

	/**
	 * Indicates whether the default perspective is visually marked.
	 */
	private boolean markActive = true;

	@Override
	public final Image getImage(Object element) {
		Assert.isTrue(element instanceof MPerspective);
		Image icon = null;
		MPerspective perspective = (MPerspective) element;

		String _uri = perspective.getIconURI();
		ImageDescriptor descriptor = null;

		try {
			URI iconURI = URI.createURI(_uri);
			descriptor = resourceUtilities.imageDescriptorFromURI(iconURI);
		} catch (RuntimeException ex) {
			logger.error("PerspectiveLabelProvider: uri=" + _uri);
		}

		if (descriptor != null) {
			icon = imageCache.get(descriptor);

			if (icon == null) {
				icon = descriptor.createImage();
				imageCache.put(descriptor, icon);
			}
		}

		return icon;
	}

	@Override
	public final void dispose() {
		for (Image image : imageCache.values()) {
			image.dispose();
		}
		imageCache.clear();
	}

	@Override
	public final String getText(Object element) {
		String label = translationService.translate("unknown",
				"platform:/plugin/" + E4PerspectiveSwitcherActivator.PLUGIN_ID); //$NON-NLS-1$

		if (element instanceof MPerspective) {
			MPerspective perspective = (MPerspective) element;
			String _lbl = perspective.getLocalizedLabel();

			if (_lbl != null && !_lbl.equals("")) {
				label = _lbl;
			}

			if (markActive && E4Util.isSelectedElement(perspective)) {
				label = label + "\t(" + translationService.translate("active",
						"platform:/plugin/" + E4PerspectiveSwitcherActivator.PLUGIN_ID) + ")"; //$NON-NLS-1$
			}
		}
		return label;
	}

	@Override
	public final Image getColumnImage(Object element, int columnIndex) {
		return getImage(element);
	}

	@Override
	public final String getColumnText(Object element, int columnIndex) {
		return getText(element);
	}

}