/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.ui.editors.calculationset;

import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.ui.editors.CalculationSetEditor;
import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.util.ModelElementOpener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * Open a CalculationSet Wizard for assignment of name and component if component == null.
 * 
 * @author Stephan Leutenmayr
 */
public class CalculationSetOpener implements ModelElementOpener {

	@Override
	public int canOpen(EObject modelElement) {
		if (modelElement instanceof CalculationSet) {
			return 100;
		} else {
			return DONOTOPEN;
		}
	}

	@Override
	public void openModelElement(final EObject modelElement) {
		if (!(modelElement instanceof CalculationSet)) {
			throw new CDTRuntimeException("The selected ModelElement must be of type CalculationSet");
		}

		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();

		CalculationSet calculationSet = (CalculationSet) modelElement;

		CalculationSetEditorInput input = new CalculationSetEditorInput(calculationSet);
		try {
			page.openEditor(input, CalculationSetEditor.ID);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
