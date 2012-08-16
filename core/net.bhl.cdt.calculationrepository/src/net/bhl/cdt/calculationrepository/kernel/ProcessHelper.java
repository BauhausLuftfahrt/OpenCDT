/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculationrepository.kernel;

import java.io.File;
import java.io.IOException;

import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;

/**
 * Helper class for starting the scilab server.
 * 
 * @author Otto von Wesendonk
 * @author Florian Penn
 */
public final class ProcessHelper {

	private static String scilabServerPath;
	private static String sci;
	private static String ldPath;
	private static final String OPTS = "-jar";
	private static String java;
	private static Process process;

	private ProcessHelper() {
	}

	/**
	 * WARNING: this is preliminary, test code.
	 */
	public static void createProcess() {

		sci = Platform.getPreferencesService().getString("net.bhl.cdt.gui", "SCI", "", null);
		ldPath = Platform.getPreferencesService().getString("net.bhl.cdt.gui", "PATH", "", null);
		scilabServerPath = Platform.getPreferencesService().getString("net.bhl.cdt.gui", "SCILABSERVER", "", null);

		String command;
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java.exe";
			// java = java.replaceAll(" ", "\" \"");
			java = "\"" + java + "\"";
			// scilabServerPath = scilabServerPath.replaceAll(" ", "\" \"");
			// scilabServerPath = "\"" + scilabServerPath + "\"";
		} else {
			java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
			java = java.replaceAll(" ", "\\ ");
			scilabServerPath = scilabServerPath.replaceAll(" ", "\\ ");
		}
		// command = java + " " + OPTS + " " + "-Xms512M" + " " + "-Xmx512M" + " " + "\"" + scilabServerPath + "\"";
		command = java + " " + OPTS + " " + "\"" + scilabServerPath + "\"";

		System.out.println(command);

		// System.out.println(java);

		try {

			if (process != null) {
				return;
			}

			ProcessBuilder builder = new ProcessBuilder(command.split("\\s"));
			builder.environment().put("SCI", sci);
			builder.environment().put("LD_LIBRARY_PATH", ldPath);
			builder.environment().put("PATH", ldPath);
			builder.redirectErrorStream(true);

			// System.out.println("Starting Scilab server...");
			process = builder.start();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// System.out.println("Still alive?");
			try {
				process.exitValue();
				// System.out.println("No!");
				throw new IOException("Scilab Server Process terminated premature!");
			} catch (IllegalThreadStateException e) {
				// process still running, everything ok!
				System.out.println("Yes!");
				Runtime.getRuntime().addShutdownHook(new Thread() {
					public void run() {
						process.destroy();
					}
				});
			}

		} catch (IOException e) {
			e.printStackTrace();
			String message = "Couldn't start Scilab process. Maybe Scilab isn't installed. Also check that java and scilab path variables are set on your system.";
			ModelUtil.logWarning(message, e);
			process = null;
			throw new CDTRuntimeException(message, e);
		}
	}
}
