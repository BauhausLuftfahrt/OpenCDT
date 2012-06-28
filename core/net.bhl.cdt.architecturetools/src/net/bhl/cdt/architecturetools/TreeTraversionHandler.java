/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools;

import net.bhl.cdt.calculation.handlers.AbstractCDTHandler;
import net.bhl.cdt.model.MappableComponentInterface;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;

/**
 * Executes the {@link TreeTraversionCommand}.
 * 
 * @author Sven Ziemer
 */

public class TreeTraversionHandler extends AbstractCDTHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		EObject selection = getSelection(event);
		if (selection instanceof MappableComponentInterface) {
			new TreeTraversionCommand((MappableComponentInterface) selection)
					.run();
		}
		// if (selection instanceof PowerConsumerImpl) {
		// new TreeTraversionCommand((PowerConsumerImpl) selection).run();
		// }

		return null;
	}

}
