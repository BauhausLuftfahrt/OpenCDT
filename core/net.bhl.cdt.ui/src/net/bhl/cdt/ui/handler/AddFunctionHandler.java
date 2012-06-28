/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.handler;

import net.bhl.cdt.calculation.handlers.AbstractCDTHandler;
import net.bhl.cdt.calculationrepository.functions.CalculationRepository;
import net.bhl.cdt.ui.command.AddFunctionCommand;
import net.bhl.cdt.ui.editors.FunctionEditor;
import net.bhl.cdt.ui.editors.function.FunctionEditorInput;
import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * If someone calls the addFunction function, this handler creates a new
 * addFunction command, which creates a new function and opens the editor. For
 * further information check the AddFunction command.
 * 
 * @author Sebastian Höcht
 */
public class AddFunctionHandler extends AbstractCDTHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {

		if (!(getSelection(event) instanceof CalculationRepository)) {
			throw new CDTRuntimeException(
					"The Calculation Repository should be selected");
		}

		final CalculationRepository calculationRepository = (CalculationRepository) getSelection(event);
		AddFunctionCommand command = new AddFunctionCommand(
				calculationRepository);
		command.run();

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();

		FunctionEditorInput input = new FunctionEditorInput(
				command.getFunction());
		try {
			page.openEditor(input, FunctionEditor.ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// AddFunctionCommand command = new
		// AddFunctionCommand(calculationRepository);
		// command.run();

		return null;
	}

}
