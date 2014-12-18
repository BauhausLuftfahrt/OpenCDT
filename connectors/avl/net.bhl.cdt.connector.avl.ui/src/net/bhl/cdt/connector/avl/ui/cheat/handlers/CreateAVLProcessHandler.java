/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.cheat.handlers;

import net.bhl.cdt.connector.avl.ui.cheat.commands.CreateAVLProcessComand;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.ui.handler.AbstractCDTHandler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;

/**
 * This is the handler of the CreateAVLProcessCommand.
 * 
 * @author martin.glas
 */
public class CreateAVLProcessHandler extends AbstractCDTHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		EObject selection = getSelection(event);

		if (selection instanceof DesignProcess) {
			DesignProcess designOperation = (DesignProcess) selection;
			CreateAVLProcessComand createAVLProcessCommand = new CreateAVLProcessComand(designOperation);
			createAVLProcessCommand.execute();
		}
		return null;

	}
}
