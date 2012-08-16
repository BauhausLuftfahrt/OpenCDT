/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.handlers;

import net.bhl.cdt.calculation.process.GraphBuilder;
import net.bhl.cdt.model.calculation.CalculationSet;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;

/**
 * Runs the {@link GraphBuilder}.
 * 
 * @author Michael Kagel
 */
public class GenerateCalculationGraphHandler extends AbstractCDTHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {

		final EObject selection = getSelection(event);

		if (selection instanceof CalculationSet) {

			new EMFStoreCommand() {
				@Override
				protected void doRun() {
					// TODO make builder a command? integration of user interaction?
					GraphBuilder builder = new GraphBuilder((CalculationSet) selection);
					builder.run();
				}
			}.run();

		}
		return null;
	}

}
