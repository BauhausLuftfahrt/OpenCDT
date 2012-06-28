/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.handlers;

import net.bhl.cdt.calculation.command.DemoAircraftModelCommand;
import net.bhl.cdt.model.Model;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;

/**
 * Handler class for DemoAircraftModelCommand.
 * 
 * @author Sven Ziemer
 */
public class DemoAircraftModelHandler extends AbstractCDTHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		final EObject selection = getSelection(event);

		if (selection instanceof Model) {

			new DemoAircraftModelCommand((Model) selection).run();
		}
		return null;
	}

}
