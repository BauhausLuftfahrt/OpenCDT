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
import java.net.Socket;
import java.net.UnknownHostException;

import net.bhl.cdt.calculationrepository.exceptions.CalculationException;
import net.bhl.cdt.calculationrepository.exceptions.ConnectionException;

/**
 * Class for managing the connections to the scilab server.
 * 
 * @author Otto von Wesendonk
 * @author Florian Penn
 */
public class ConnectionManager {

	private Socket socket;
	private PrintStream writer;
	private BufferedReader reader;

	/**
	 * Constructor.
	 * 
	 * @param host The hostname of the host running the scilab server
	 * @param port The port the scilab server ist running on
	 */
	public ConnectionManager(String host, int port) {
		try {
			socket = new Socket(host, port);

			writer = new PrintStream(socket.getOutputStream());
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		} catch (UnknownHostException e) {
			throw new ConnectionException(e);
		} catch (IOException e) {
			throw new ConnectionException(e);
		}
	}

	/**
	 * Executes a scilab script.
	 * 
	 * @param script The script to be executed
	 * @throws CalculationException Throws a CalculationException if calculation was not successful
	 */
	public void execute(String script) throws CalculationException {
		write("EXEC " + script);
		if (!"OK".equals(read())) {
			throw new CalculationException();
		}
	}

	/**
	 * Retruns a variable from scilab.
	 * 
	 * @param var The variable name
	 * @return The scilab variable
	 * @throws CalculationException Throws a CalculationException if no valid value is returned
	 */
	public double get(String var) throws CalculationException {
		write("GET " + var);
		String load = read();
		try {
			return Double.parseDouble(load);
		} catch (NumberFormatException e) {
			// TODO exception
			throw new CalculationException();
		}
	}

	private void write(String load) {
		if (load != null) {
			writer.println(load.trim());
		}
	}

	private String read() throws ConnectionException {
		try {
			return reader.readLine().trim();
		} catch (IOException e) {
			throw new ConnectionException(e);
		}
	}

	/**
	 * Closes the connection to the scilab server.
	 * 
	 * @throws ConnectionException In case of failure a ConnectionException is thrown
	 */
	public void close() throws ConnectionException {
		try {
			write("END");
			socket.close();
		} catch (IOException e) {
			throw new ConnectionException(e);
		}
	}
}
