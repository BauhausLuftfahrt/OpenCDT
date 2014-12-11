/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.cheat.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.connector.avl.AVL;
import net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelFactory;
import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.avlprocess.AvlprocessFactory;
import net.bhl.cdt.model.process.DesignProcess;

/**
 * This Command creates the input Generators necessary for the AVL connector.
 * 
 * @author martin.glas
 */
public class CreateAVLInputsComand extends CDTCommand {

	private AVL avl;
	private DesignProcess designProcess;

	/**
	 * This is the Constructor of the command.
	 * 
	 * @param avl the AVL connector
	 * @param shell the current Shell
	 */
	public CreateAVLInputsComand(AVL avl) {
		setAvl(avl);
		if (avl.eContainer() != null) {
			setDesignProcess((DesignProcess) avl.eContainer());
		}
	}

	@Override
	protected void doRun() {

		// Create AVL Model Builder and set default values
		AVLModelGenerator newAvlModelGenerator = AvlmodelFactory.eINSTANCE.createAVLModelGenerator();
		newAvlModelGenerator.setName("New AVL Model");
		newAvlModelGenerator.setFileName("newAVLModel.avl");
		getDesignProcess().getDesignProcessElements().add(newAvlModelGenerator);

		// Create AVL Process Generator and set default values
		AVLProcessGenerator newAvlProcessGenerator = AvlprocessFactory.eINSTANCE.createAVLProcessGenerator();
		newAvlProcessGenerator.setName("New AVL Process");
		newAvlProcessGenerator.setFileName("newAVLProcess.run");
		newAvlProcessGenerator.setCommandFileName("newAVLCommand.cmd");
		getDesignProcess().getDesignProcessElements().add(newAvlProcessGenerator);
		avl.getDesignProcessElements().add(newAvlModelGenerator);
		avl.getDesignProcessElements().add(newAvlProcessGenerator);

	}

	private void setAvl(AVL avl) {
		this.avl = avl;
	}

	private DesignProcess getDesignProcess() {
		return designProcess;
	}

	private void setDesignProcess(DesignProcess designProcess) {
		this.designProcess = designProcess;
	}
}
