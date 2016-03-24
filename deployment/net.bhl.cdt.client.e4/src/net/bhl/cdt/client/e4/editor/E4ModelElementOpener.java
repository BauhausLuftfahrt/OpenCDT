/*******************************************************************************
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 *
 *******************************************************************************/
package net.bhl.cdt.client.e4.editor;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.ui.e4.util.EPartServiceHelper;
import org.eclipse.emf.ecp.ui.util.ECPModelElementOpener;

/**
 * Opens a model element in the {@link E4ModelEditor}.
 *
 * @author Michael Shamiyeh
 *
 */
@SuppressWarnings("restriction")
public class E4ModelElementOpener implements ECPModelElementOpener {

	private final String partId = "net.bhl.cdt.client.e4.partdescriptor.editor"; //$NON-NLS-1$

	@Override
	public void openModelElement(Object modelElement, @Optional ECPProject ecpProject) {
		final EPartService partService = EPartServiceHelper.getEPartService();
		for (final MPart existingPart : partService.getParts()) {
			if (!partId.equals(existingPart.getElementId())) {
				continue;
			}

			if (existingPart.getContext() == null) {
				continue;
			}

			if (existingPart.getContext().get(E4ModelEditor.INPUT) == modelElement) {
				if (!existingPart.isVisible() || !existingPart.isOnTop()) {
					partService.showPart(existingPart, PartState.ACTIVATE);
				}
				return;
			}
		}

		final MPart part = partService.createPart(partId);
		partService.showPart(part, PartState.ACTIVATE);
		part.getContext().set(E4ModelEditor.INPUT, modelElement);
	}
}
