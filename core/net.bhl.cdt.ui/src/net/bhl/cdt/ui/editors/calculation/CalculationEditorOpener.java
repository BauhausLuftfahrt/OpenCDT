/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.ui.editors.calculation;

import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.ui.editors.CalculationEditor;
import net.bhl.cdt.ui.editors.function.FunctionEditorInput;
import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.util.ModelElementOpener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * Open a Calculation Editor upon double click on calculation node.
 * 
 * @author Stephan Leutenmayr
 */
public class CalculationEditorOpener implements ModelElementOpener {

	@Override
	public int canOpen(EObject modelElement) {
		if (modelElement instanceof Calculation) {
			return 100;
		} else {
			return DONOTOPEN;
		}
	}

	@Override
	public void openModelElement(EObject modelElement) {
		if (!(modelElement instanceof Calculation)) {
			throw new CDTRuntimeException("The selected ModelElement must be of type Calculation");
		}

		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();

		CalculationEditorInput input = new CalculationEditorInput((Calculation) modelElement);

		try {
			page.openEditor(input, CalculationEditor.ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
