/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculationrepository.kernel.scilab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import net.bhl.cdt.calculationrepository.exceptions.CalculationException;

import org.eclipse.core.runtime.Platform;

/**
 * Class for using scilab in calculations.
 * 
 * @author Florian Penn
 * @author Otto von Wesendonk
 */
public final class ScilabKernel {

	private static ScilabKernel instance;
	private static String sciCommand;
	private static String sciOpt;
	private static Process sciProcess;
	private static String sciOutput;
	private static PrintStream sciExec;

	private ScilabKernel() {
	}

	/**
	 * Return an instance of this class.
	 * 
	 * @return Instance of ScilabKernel
	 */
	public static ScilabKernel getInstance() {
		if (instance == null) {
			instance = new ScilabKernel();
			sciCommand = Platform.getPreferencesService().getString("net.bhl.cdt.ui", "SCIEXEC", "", null);
			sciOpt = Platform.getPreferencesService().getString("net.bhl.cdt.ui", "SCIOPT", "", null);
			if (sciCommand == "") {
				sciCommand = "C:\\Program Files\\scilab-5.3.0\\bin\\Scilex.exe";
			}

			List<String> command = new LinkedList<String>();
			command.add(sciCommand);
			if (sciOpt != null && sciOpt != "") {
				command.add(sciOpt);
			}
			ProcessBuilder pb = new ProcessBuilder(command);
			pb.redirectErrorStream(true);
			try {
				sciProcess = pb.start();
				// Shutdown scilab after CDT is closed
				Runtime.getRuntime().addShutdownHook(new Thread() {
					public void run() {
						sciProcess.destroy();
					}
				});
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new CalculationException("Could not start Scilab!");
			}
			new Thread() {
				public void run() {
					BufferedReader r = new BufferedReader(new InputStreamReader(sciProcess.getInputStream()));
					while (true) {
						try {
							String tmp = r.readLine();
							// r.readLine() returns null if process dead
							if (tmp == null) {
								throw new CalculationException("Scilab not available!");
							}
							if (tmp.trim().length() != 0) {
								sciOutput = tmp.trim();
								System.out.println("Scilab: " + tmp);
							}
						} catch (IOException e) {
							throw new CalculationException("Scilab not available!");
						}
					}
				}
			}.start();
			sciExec = new PrintStream(sciProcess.getOutputStream());

			try {
				Thread.sleep(6000);
				sciProcess.exitValue();
				System.out.println("Scilab not running!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalThreadStateException e) {
				System.out.println("Scilab is running!");
			}

		}
		return instance;
	}

	/**
	 * Return an instance of this class.
	 * 
	 * @return Instance of ScilabKernel
	 */
	// public static ScilabKernel getInstance() {
	// if (instance == null) {
	// instance = new ScilabKernel();
	// }
	// return instance;
	// }

	/**
	 * Executes a scilab function.
	 * 
	 * @param functionDef The function definition
	 * @param functionBody The function body
	 * @param functionCall The call of the function
	 * @param functionResult The name of the variable containing the result
	 * @return A list containing the results
	 * @throws CalculationException The use of scilab can cause an CalculationException
	 */
	public synchronized List<Double> eval(String functionDef, String functionBody, String functionCall,
		String functionResult) throws CalculationException {

		/** Code from Florian --- */
		sciExec.println("deff('" + functionDef + "','" + functionBody + "')");
		sciExec.println(functionCall);
		sciExec.println("disp(" + functionResult + ")");
		sciExec.flush();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// System.out.println("Scilab output: " + sciOutput);
		double returnvalue;
		try {
			returnvalue = Double.parseDouble(sciOutput.trim());
		} catch (NumberFormatException e) {
			throw new CalculationException("Scilab returned unparseable String: \"" + sciOutput + "\"");
		}
		return Arrays.asList(returnvalue);
		/**
		 * Experimental version -------------------------
		 */
		// try {
		// Scilab sci = new Scilab();
		// if (sci.open()) {
		// sci.exec("a=cos(%pi)*sin(%pi^2);");
		// ScilabType c = sci.get("a");
		// System.out.println("c = " + c);
		//
		// sci.exec("disp(%pi);");
		//
		// ScilabDouble a = new ScilabDouble(3.14);
		// sci.put("a", a);
		// sci.exec("b=sin(a);");
		// ScilabType b = sci.get("b");
		// System.out.println("b = " + b);
		//
		// // System.out.println("CDT example");
		// //
		// // sci.exec("deff('k = kFactor(AR, e)','k = 1/(%pi*AR*e);')");
		// //
		// // if (sci.exec("kFactor(1, 2);")) {
		// // sci.exec ("disp(" + functionResult + ")") ;
		// //
		// // ScilabType k = sci.get("k ");
		// //
		// // System.out.println ("k = " + k) ;
		// // }
		// //
		// // if ((sci.exec("AR = 1; e = 2")) && (sci.exec("exec(kFactor)"))) {
		// // ScilabType k = sci.get("k");
		// // System.out.println("Attempt 2: k = " + k);
		// // }
		// // sci.exec("plot3d();");
		// // System.out.println("isGraphicOpened: " + sci.isGraphicOpened());
		// // System.out.println("isexistingVariable: " + sci.isExistingVariable("k"));
		// // System.out.println("Last error Code/Message: " + sci.getLastErrorCode() + ":" // +
		// // sci.getLastErrorMessage());
		// //
		// sci.close();
		// }
		// //
		// } catch (Exception e) {
		// System.err.println("An exception occurred: " + e.getLocalizedMessage());
		// }

		/**
		 * Old version --------------------------------------------------------------
		 */
		// String host = "localhost";
		// int port = 3333;
		//
		// ConnectionManager connection = null;
		// try {
		// connection = new ConnectionManager(host, port);
		// } catch (ConnectionException e) {
		// ProcessHelper.createProcess();
		// connection = new ConnectionManager(host, port);
		// }
		//
		// connection.execute("deff('" + functionDef + "','" + functionBody + "')");
		// connection.execute(functionCall);
		// // connection.execute("disp("+functionResult+")");
		// double returnvalue = connection.get(functionResult);
		//
		// connection.close();
		//
		// return Arrays.asList(returnvalue);
		// return null;

	}

	/**
	 * This method gets the value of a given variable.
	 * 
	 * @param variableName The name of the variable
	 * @return The value as String
	 * @throws CalculationException The use of scilab can cause an CalculationException
	 */
	public synchronized String getValue(String variableName) throws CalculationException {

		/** Code from Martin --- */
		sciExec.flush();
		sciExec.println(variableName);

		sciExec.flush();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// System.out.println("Scilab output: " + sciOutput);
		String returnvalue;
		try {
			returnvalue = sciOutput.trim();
			if (returnvalue.endsWith(".")) {
				returnvalue = returnvalue.substring(0, returnvalue.length() - 1);
			}
		} catch (NumberFormatException e) {
			throw new CalculationException("Scilab returned unparseable String: \"" + sciOutput + "\"");
		}
		return returnvalue;
	}

	/**
	 * Executes a scilab command.
	 * 
	 * @param commandString The scilab command
	 * @throws CalculationException The use of scilab can cause an CalculationException
	 */
	public synchronized void command(String commandString) throws CalculationException {
		sciExec.println(commandString);
		sciExec.flush();

		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Scilab output: " + sciOutput);
		// double returnvalue;
		// try {
		// returnvalue = Double.parseDouble(sciOutput.trim());
		// } catch (NumberFormatException e) {
		// throw new CalculationException("Scilab returned unparseable String: \"" + sciOutput + "\"");
		// }
	}
}
