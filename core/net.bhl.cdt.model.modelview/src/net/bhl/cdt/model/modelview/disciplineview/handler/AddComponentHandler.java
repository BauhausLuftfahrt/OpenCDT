/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.modelview.disciplineview.handler;

import net.bhl.cdt.calculation.handlers.AbstractCDTHandler;
import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.modelview.ConfigurationInput;
import net.bhl.cdt.model.modelview.DisciplineView;
import net.bhl.cdt.model.modelview.ModelviewFactory;
import net.bhl.cdt.model.modelview.ViewLink;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.dialogs.ModelElementSelectionDialog;
import org.eclipse.emf.ecp.common.model.ECPWorkspaceManager;
import org.eclipse.emf.ecp.common.model.workSpaceModel.ECPProject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;

public class AddComponentHandler extends AbstractCDTHandler implements IHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		final EObject selection = getSelection(event);
		final IEditorInput input = HandlerUtil.getActiveEditorInput(event);
		if (!(input instanceof ConfigurationInput)) {
			return null;
		}

		if (selection instanceof Component) {
			ECPProject ecpProject = ECPWorkspaceManager.getECPProject(selection);
			ModelElementSelectionDialog dialog = new ModelElementSelectionDialog() {
			};
			// ModelElementSelectionDialog dialog = new
			// ModelElementSelectionDialog(ecpProject,
			// ModelPackage.eINSTANCE.getComponent()) {
			// };
			dialog.setModelElements(UtilitiesHelper.getChildrenOfType(((ConfigurationInput) input).getConfiguration(),
				Component.class));
			if (dialog.open() == Dialog.OK) {
				final Object firstResult = dialog.getFirstResult();
				if (!(firstResult instanceof EObject)) {
					return null;
				}
				new CDTCommand() {
					@Override
					protected void doRun() {
						ViewLink viewLink = ModelviewFactory.eINSTANCE.createViewLink();
						viewLink.setVirtualParent(selection);
						viewLink.setVirtualChild((EObject) firstResult);
						DisciplineView view = (DisciplineView) ((ConfigurationInput) input).getView();
						view.getViewLinks().add(viewLink);
					}
				}.run();
			}
		}
		return null;
	}

}
