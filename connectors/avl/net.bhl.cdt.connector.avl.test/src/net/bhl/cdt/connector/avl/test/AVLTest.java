/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * This class is a unit test of the AVL engine.
 * 
 * @author martin.glas
 */
public class AVLTest {
	/**
	 * This method performs the AVL unit test.
	 */
	@Test
	public void testAVL() {

		String line;
		String[] args = new String[1];
		args[0] = "";
		List<File> avlFiles = new ArrayList<>();
		avlFiles.add(new File("./sample/avl.exe"));
		avlFiles.add(new File("./sample/wing.avl"));
		avlFiles.add(new File("./sample/test.run"));
		avlFiles.add(new File("./sample/run.cmd"));

		String path = avlFiles.get(0).getParent();

		for (File file : avlFiles) {
			if (!path.equals(file.getParent())) {
				System.out.println(" Paths are not identical");
				return;
			}
		}

		Process p;
		try {
			p = Runtime.getRuntime().exec(
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
			System.out.println("Done.");
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
