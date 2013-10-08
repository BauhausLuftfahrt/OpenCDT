/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.modelview.disciplineview.handler;

import java.util.HashSet;

import net.bhl.cdt.calculation.handlers.AbstractCDTHandler;
import net.bhl.cdt.model.modelview.ConfigurationInput;
import net.bhl.cdt.model.modelview.DisciplineView;
import net.bhl.cdt.model.modelview.ViewLink;
import net.bhl.cdt.utilities.commands.CDTCommand;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;

public class RemoveComponentHandler extends AbstractCDTHandler implements
		IHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		final EObject selection = getSelection(event);
		final IEditorInput input = HandlerUtil.getActiveEditorInput(event);
		if (!(input instanceof ConfigurationInput)) {
			return null;
		}
		new CDTCommand() {

			@Override
			protected void doRun() {
				DisciplineView view = (DisciplineView) ((ConfigurationInput) input)
						.getView();
				HashSet<ViewLink> toRemove = new HashSet<ViewLink>();
				for (ViewLink link : view.getViewLinks()) {
					if (selection == link.getVirtualChild()) {
						toRemove.add(link);
					}
				}
				view.getViewLinks().removeAll(toRemove);
				// EcoreUtil.delete(selection);
			}
		}.run();

		return null;
	}

}
