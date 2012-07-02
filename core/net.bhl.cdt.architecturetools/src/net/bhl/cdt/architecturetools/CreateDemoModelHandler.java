/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools;

import net.bhl.cdt.calculation.handlers.AbstractCDTHandler;
import net.bhl.cdt.model.Model;
import net.bhl.cdt.utilities.commands.CDTCommand;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;

public class CreateDemoModelHandler extends AbstractCDTHandler implements
		IHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		final EObject selection = getSelection(event);
		if (selection instanceof Model) {
			new CDTCommand() {

				@Override
				protected void doRun() {
					PowerConsumerHelper.createDemoStructure((Model) selection);
				}
			}.run(true);
		}
		// END CREATE DEMO DATA
		return null;
	}

}
