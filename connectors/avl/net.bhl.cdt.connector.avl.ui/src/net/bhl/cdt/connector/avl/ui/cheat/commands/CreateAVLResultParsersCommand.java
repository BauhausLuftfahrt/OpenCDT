/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.cheat.commands;

import java.io.File;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter;
import net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessFactoryImpl;
import net.bhl.cdt.model.process.DesignProcess;

import org.eclipse.swt.widgets.Shell;

/**
 * This command creates the appropriate number of AVL result parsers.
 * 
 * @author martin.glas
 */
public class CreateAVLResultParsersCommand extends CDTCommand {

	private AVLProcessGenerator avlProcessGenerator;

	/**
	 * This is the constructor of the Command.
	 * 
	 * @param avlProcessGenerator the AVLProcessGenerator
	 * @param shell the current Shell
	 */
	public CreateAVLResultParsersCommand(AVLProcessGenerator avlProcessGenerator, Shell shell) {
		setAVLProcessGenerator(avlProcessGenerator);
	}

	@Override
	protected void doRun() {
		DesignProcess avlSubProcess = (DesignProcess) avlProcessGenerator.eContainer();
		File avlProcessFile = new File(avlProcessGenerator.getCommandFileName());
		int fileSeperatorIndex = avlProcessFile.getName().indexOf(".");
		String processFileName = "avl" + avlProcessFile.getName().subSequence(0, fileSeperatorIndex);
		if (avlProcessGenerator.getRuncaseCounter() > 1) {

			for (int i = 1; i < avlProcessGenerator.getRuncaseCounter(); i++) {

				String fullResultFileName = processFileName + String.valueOf(i) + ".out";
				AVLResultImporter avlResultImporter = AvlprocessFactoryImpl.eINSTANCE.createAVLResultImporter();
				avlResultImporter.setFileName(fullResultFileName);
				avlResultImporter.setName(fullResultFileName);
				avlSubProcess.getDesignProcessElements().add(avlResultImporter);
			}

		}

	}

	private void setAVLProcessGenerator(AVLProcessGenerator avlProcessGenerator) {
		this.avlProcessGenerator = avlProcessGenerator;
	}

}
