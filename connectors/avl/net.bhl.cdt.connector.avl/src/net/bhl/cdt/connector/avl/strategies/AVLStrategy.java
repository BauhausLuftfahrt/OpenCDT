/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.strategies;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.connector.avl.AVL;
import net.bhl.cdt.connector.avl.AvlPackage;
import net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator;
import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.designoperations.strategies.DesignProcessStrategy;
import net.bhl.cdt.model.system.util.SystemHelper;
import net.bhl.cdt.ui.Activator;

import org.eclipse.emf.ecore.EClass;

/**
 * This strategy executes the AVL tool.
 * 
 * @author martin.glas
 */
public class AVLStrategy extends DesignProcessStrategy {

	@Override
	public void start(ProcessElement processElement) {
		if (processElement instanceof AVL) {
			AVL avl = (AVL) processElement;
			SystemHelper.getChildrenByClass(avl, AVLModelGenerator.class).get(0).start();
			SystemHelper.getChildrenByClass(avl, AVLProcessGenerator.class).get(0).start();
			try {
				String line;
				String[] args = new String[1];
				args[0] = "";
				List<File> avlFiles = new ArrayList<>();

				avlFiles.add(new File(Activator.getDefault().getPreferenceStore().getString("AVLPATH")));
				String avlFolder = avlFiles.get(0).getParentFile().getPath() + File.separator;

				avlFiles.add(new File(avlFolder
					+ SystemHelper.getDirectChildrenByClass(avl, AVLModelGenerator.class).get(0).getFileName()));
				avlFiles.add(new File(avlFolder
					+ SystemHelper.getDirectChildrenByClass(avl, AVLProcessGenerator.class).get(0).getFileName()));
				avlFiles.add(new File(avlFolder
					+ SystemHelper.getChildrenByClass(avl, AVLProcessGenerator.class).get(0).getCommandFileName()));

				Process p = Runtime.getRuntime().exec(
					"cmd /C " + avlFiles.get(0).getName() + " " + avlFiles.get(1).getName() + " "
						+ avlFiles.get(2).getName() + " < " + avlFiles.get(3).getName(), args,
					avlFiles.get(0).getParentFile());
				BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
				BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
				while ((line = bri.readLine()) != null) {
					System.out.println(line);
				}
				bri.close();
				while ((line = bre.readLine()) != null) {
					System.out.println(line);
				}
				bre.close();
				p.waitFor();

				for (AVLResultImporter avlResultImporter : SystemHelper
					.getChildrenByClass(avl, AVLResultImporter.class)) {
					avlResultImporter.start();
				}

			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public boolean isStartable(ProcessElement processElement) {
		if (processElement instanceof AVL) {
			String avlPathPreference = Activator.getDefault().getPreferenceStore().getString("AVLPATH");
			AVL avl = (AVL) processElement;
			if ((SystemHelper.getChildrenByClass(avl, AVLModelGenerator.class).get(0).isStartable())
				&& (SystemHelper.getChildrenByClass(avl, AVLProcessGenerator.class).get(0).isStartable())) {

				if (!avlPathPreference.isEmpty()) {
					File avlFile = new File(avlPathPreference);

					if (avlFile.getName().equalsIgnoreCase("avl.exe") && avlFile.exists() && !avlFile.isDirectory()) {

						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public EClass getEClass() {
		return AvlPackage.Literals.AVL;
	}
}
