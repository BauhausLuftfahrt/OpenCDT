/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.handlers;

import net.bhl.cdt.calculation.command.VerifyCalculationSetCommand;
import net.bhl.cdt.model.calculation.CalculationSet;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;

/**
 * Handler for the VerifyCalculationSetCommand.
 * @author sven.ziemer
 *
 */
public class VerifyCalculationSetHandler extends AbstractCDTHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		EObject selection = getSelection(event);
		if (selection instanceof CalculationSet) {
			new VerifyCalculationSetCommand((CalculationSet) selection).run();
		}
		return null;
	}
}
