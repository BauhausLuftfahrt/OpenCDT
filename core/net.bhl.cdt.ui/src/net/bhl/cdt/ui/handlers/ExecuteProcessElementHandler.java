/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.ui.handlers;

import net.bhl.cdt.commands.ExecuteProcessElementCommand;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.ui.handler.AbstractCDTHandler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;

/**
 * This is the handler of the ExecuteProcessElement Command.
 * 
 * @author martin.glas
 */
public class ExecuteProcessElementHandler extends AbstractCDTHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		EObject selection = getSelection(event);

		if (selection instanceof ProcessElement) {
			ProcessElement processElement = (ProcessElement) selection;
			ExecuteProcessElementCommand executeDesignOperationCommand = new ExecuteProcessElementCommand(
				processElement, getShell());
			executeDesignOperationCommand.execute();
		}
		return null;

	}
}
