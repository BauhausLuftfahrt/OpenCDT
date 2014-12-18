/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.ui.decorators;

import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.ProcessPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;

/**
 * This Decorator signals whether a ProcessElement is startable.
 * 
 * @author martin.glas
 */
public class IsStartableDecorator extends LabelProvider implements ILightweightLabelDecorator {

	public static final String ICON = "/icons/sample.gif";

	@Override
	public void decorate(Object resource, IDecoration decoration) {
		try {
			if (resource instanceof ProcessElement) {
				ProcessElement processElement = (ProcessElement) resource;

				if (processElement.isStartable()) {
					decoration.addOverlay(
						ImageDescriptor.createFromFile(IsStartableDecorator.class, "/icons/ready.gif"),
						IDecoration.TOP_RIGHT);
				} else
					decoration.addOverlay(
						ImageDescriptor.createFromFile(IsStartableDecorator.class, "/icons/nogo.gif"),
						IDecoration.TOP_RIGHT);

				/**
				 * Dummy Notification to get the Containment (the parent) refreshed so that decorate is called. The
				 * containment sets a notification that itself has changed.
				 */
				processElement.eContainer().eNotify(
					new ENotificationImpl((InternalEObject) processElement.eContainer(), Notification.UNSET,
						ProcessPackage.DESIGN_OPERATION___IS_STARTABLE, null, null));
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
