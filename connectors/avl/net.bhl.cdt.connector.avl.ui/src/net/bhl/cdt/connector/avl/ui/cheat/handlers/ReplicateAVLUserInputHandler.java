/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.cheat.handlers;

import net.bhl.cdt.connector.avl.AVL;
import net.bhl.cdt.connector.avl.ui.cheat.commands.ReplicateAVLUserInputCommand;
import net.bhl.cdt.ui.handler.AbstractCDTHandler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;

/**
 * This is the handler of the ReplicateAVLUserInputCommand.
 * 
 * @author martin.glas
 */
public class ReplicateAVLUserInputHandler extends AbstractCDTHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		EObject selection = getSelection(event);

		if (selection instanceof AVL) {
			AVL avl = (AVL) selection;
			ReplicateAVLUserInputCommand replicateAVLUserInputCommand = new ReplicateAVLUserInputCommand(avl,
				getShell());
			replicateAVLUserInputCommand.execute();
		}
		return null;
	}

}
