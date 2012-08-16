/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors.function;

import net.bhl.cdt.calculationrepository.functions.CalculationScript;
import net.bhl.cdt.calculationrepository.functions.ScilabFunction;
import net.bhl.cdt.ui.editors.FunctionEditor;
import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.util.ModelElementOpener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * Opens the FunctionEditor on a double click action on a Function.
 * 
 * @author Sebastian Höcht
 */
public class FunctionEditorOpener implements ModelElementOpener {

	@Override
	public int canOpen(EObject modelElement) {
		if (modelElement instanceof CalculationScript) {
			return 100;
		} else {
			return DONOTOPEN;
		}
	}

	@Override
	public void openModelElement(EObject modelElement) {

		if (!(modelElement instanceof CalculationScript)) {
			throw new CDTRuntimeException(
					"The selected ModelElement must be of type ScilabFunction");
		}

		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();

		FunctionEditorInput input;
		if (modelElement instanceof ScilabFunction) {
			input = new FunctionEditorInput((ScilabFunction) modelElement);
		}

		else {
			input = new FunctionEditorInput((CalculationScript) modelElement);
		}

		try {
			page.openEditor(input, FunctionEditor.ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
