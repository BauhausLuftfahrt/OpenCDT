/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.cheat.handlers;

import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.ui.cheat.commands.ReplicateAVLProcessUserConfigCommand;
import net.bhl.cdt.ui.handler.AbstractCDTHandler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;

/**
 * This is the handler of the ReplicateAVLProcessUserConfigCommand.
 * 
 * @author martin.glas
 */
public class ReplicateAVLProcessUserConfigHandler extends AbstractCDTHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		EObject selection = getSelection(event);

		if (selection instanceof AVLProcessGenerator) {
			AVLProcessGenerator avlProcessGenerator = (AVLProcessGenerator) selection;
			ReplicateAVLProcessUserConfigCommand replicateAVLProcessUserConfigCommand = new ReplicateAVLProcessUserConfigCommand(
				avlProcessGenerator, getShell());
			replicateAVLProcessUserConfigCommand.execute();
		}
		return null;
	}

}
