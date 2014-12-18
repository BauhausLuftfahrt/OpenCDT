/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.cheat.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.ui.cheat.CheatHelper;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.swt.widgets.Shell;

/**
 * This command triggers the replication of the user's configuration of the AVLProcessGenerator.
 * 
 * @author martin.glas
 */
public class ReplicateAVLProcessUserConfigCommand extends CDTCommand {

	private ESLocalProject designProject;
	private AVLProcessGenerator avlProcessGenerator;

	/**
	 * This is the constructor of the command.
	 * 
	 * @param avlProcessGenerator the AvlProcessGenerator
	 * @param shell the current Shell
	 */
	public ReplicateAVLProcessUserConfigCommand(AVLProcessGenerator avlProcessGenerator, Shell shell) {
		setAvlProcessGenerator(avlProcessGenerator);
		setDesignProject(ModelHelper.getContainingProject(avlProcessGenerator));

	}

	@Override
	protected void doRun() {

		CheatHelper.replicateProcessGeneratorUserConfig(getDesignProject(), getAvlProcessGenerator());

	}

	private ESLocalProject getDesignProject() {
		return designProject;
	}

	private void setDesignProject(ESLocalProject designProject) {
		this.designProject = designProject;
	}

	private AVLProcessGenerator getAvlProcessGenerator() {
		return avlProcessGenerator;
	}

	private void setAvlProcessGenerator(AVLProcessGenerator avlProcessGenerator) {
		this.avlProcessGenerator = avlProcessGenerator;
	}

}
