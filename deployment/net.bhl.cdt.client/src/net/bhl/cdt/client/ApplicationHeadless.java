/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.client;

import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import net.bhl.cdt.paxelerate.core.ui.commands.RunBatchSimulationCommand;

/**
 * This class controls all aspects of the application's execution.
 */
public class ApplicationHeadless implements IApplication {

	@Override
	public Object start(final IApplicationContext context) throws Exception {

		System.out.println();
		System.out.println("=======================================");
		System.out.println("     PAXelerate - Headless v0.8");
		System.out.println("=======================================");
		System.out.println();
		System.out.println("Starting application...");

		final Map<?, ?> args = context.getArguments();
		final String[] appArgs = (String[]) args.get("application.args");

		System.out.print("Passed arguments: ");
		for (final String arg : appArgs) {
			System.out.print(arg + ", ");
		}

		System.out.println();

		if (appArgs.length < 2) {
			System.out.println("No input arguments given: file name and folder name required.");
			System.out.println("Application is closed!");
			return IApplication.EXIT_OK;

		} else {
			// Arguments: (String) inputFilename, (String) folderName, optional: (String) folderDirectory, (boolean)
			// disembarking, (String) paxListFile
			String inputFilename = appArgs[0];
			String folderName = appArgs[1];
			String folderDirectory = "";
			boolean disembarking = false;
			String paxListFile = "";

			System.out.println("Opening file: " + inputFilename + " in " + folderName);

			if (appArgs.length == 3) {
				folderDirectory = appArgs[2];
			}

			if (appArgs.length == 4) {
				if (appArgs[3].equals("true")) {
					disembarking = true;
					System.out.println("Mode disembarking is enabled");
				}
			}

			if (appArgs.length == 5) {
				paxListFile = appArgs[4];
				System.out.println("Sorted passenger list " + paxListFile + " was passed.");
			}

			System.out.println();
			System.out.println("---------------------------------------");
			System.out.println();
			System.out.println("Starting simulations...");
			System.out.println();

			new RunBatchSimulationCommand(inputFilename, folderName, folderDirectory, disembarking, paxListFile)
				.execute();

			return IApplication.EXIT_OK;
		}
	}

	@Override
	public void stop() {
		// nothing to do
	}
}
