/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.cheat.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.connector.avl.AVL;
import net.bhl.cdt.connector.avl.ui.cheat.CheatHelper;

import org.eclipse.swt.widgets.Shell;

/**
 * This Command executes the replication of the user's Calculations required for the AVL connector.
 * 
 * @author martin.glas
 */
public class ReplicateAVLUserCalculationsCommand extends CDTCommand {

	private AVL avl;

	/**
	 * This is the constructor of the command.
	 * 
	 * @param avl the AVL engine connector
	 * @param shell the current Shell
	 */
	public ReplicateAVLUserCalculationsCommand(AVL avl, Shell shell) {
		setAvl(avl);
	}

	@Override
	protected void doRun() {

		CheatHelper.replicateUserCalculations(getAvl());

	}

	private AVL getAvl() {
		return avl;
	}

	private void setAvl(AVL avl) {
		this.avl = avl;
	}

}
