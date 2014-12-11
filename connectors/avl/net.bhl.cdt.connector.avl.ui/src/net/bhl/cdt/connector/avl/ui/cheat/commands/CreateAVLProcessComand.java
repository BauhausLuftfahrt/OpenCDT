/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.cheat.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.connector.avl.AVL;
import net.bhl.cdt.connector.avl.AvlFactory;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.impl.ProcessFactoryImpl;

import org.eclipse.swt.widgets.Shell;

/**
 * This command creates an AVL tool connector.
 * 
 * @author martin.glas
 */
public class CreateAVLProcessComand extends CDTCommand {

	private DesignProcess designProcess;

	/**
	 * This is the constructor of the command.
	 * 
	 * @param designProcess the design process which is supposed contain the AVL tool connector
	 * @param shell the current Shell
	 */
	public CreateAVLProcessComand(DesignProcess designProcess) {
		setDesignProcess(designProcess);
		
	}

	@Override
	protected void doRun() {

		
		// Create AVL Engine and set default values
		AVL newAvl = AvlFactory.eINSTANCE.createAVL();
		newAvl.setName("New AVL Process");

		designProcess.getDesignProcessElements().add(newAvl);
		new CreateAVLInputsComand(newAvl).doRun();

	}

	private DesignProcess getDesignProcess() {
		return designProcess;
	}

	private void setDesignProcess(DesignProcess designProcess) {
		this.designProcess = designProcess;
	}

}
