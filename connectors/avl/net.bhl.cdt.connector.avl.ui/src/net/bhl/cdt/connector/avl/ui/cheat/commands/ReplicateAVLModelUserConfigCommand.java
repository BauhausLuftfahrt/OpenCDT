/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.cheat.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator;
import net.bhl.cdt.connector.avl.ui.cheat.CheatHelper;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.swt.widgets.Shell;

/**
 * This command starts the replication of the user's configuration of the AVLModelGenerator.
 * 
 * @author martin.glas
 */
public class ReplicateAVLModelUserConfigCommand extends CDTCommand {

	private ESLocalProject designProject;

	private AVLModelGenerator avlModelGenerator;

	/**
	 * This commands executes the replication of the user's configuration of the AVLModelGenerator.
	 * 
	 * @param avlModelGenerator the AVLModelGenerator
	 * @param shell the current Shell
	 */
	public ReplicateAVLModelUserConfigCommand(AVLModelGenerator avlModelGenerator, Shell shell) {
		setAvlModelGenerator(avlModelGenerator);
		setDesignProject(ModelHelper.getContainingProject(avlModelGenerator));

	}

	@Override
	protected void doRun() {
		CheatHelper.replicateModelGeneratorUserConfig(getDesignProject(), getAvlModelGenerator());

	}

	private ESLocalProject getDesignProject() {
		return designProject;
	}

	private void setDesignProject(ESLocalProject designProject) {
		this.designProject = designProject;
	}

	private AVLModelGenerator getAvlModelGenerator() {
		return avlModelGenerator;
	}

	private void setAvlModelGenerator(AVLModelGenerator avlModelGenerator) {
		this.avlModelGenerator = avlModelGenerator;
	}

}
