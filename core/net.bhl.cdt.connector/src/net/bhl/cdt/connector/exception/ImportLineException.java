/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.exception;

/**
 * An Exception that occured for a part of a file import, which is a set of
 * String lines.
 * 
 * @author Sebastian Höcht
 */
public class ImportLineException extends ImportPartException {
	private String inputLine;
	private int lineNumber;

	private static final long serialVersionUID = -2034621737171519584L;

	/**
	 * Create a new exception for one line of a file import.
	 * 
	 * @param message
	 *            an explanatory message describing the error
	 * @param inputLine
	 *            the line of the file where the error occurred
	 */
	public ImportLineException(String message, String inputLine) {
		super(message);
		this.inputLine = inputLine;
	}

	/**
	 * get input line string.
	 * 
	 * @return the string of the line
	 */
	public String getInputLString() {
		return inputLine;
	}

	/**
	 * get the line number.
	 * 
	 * @return the number of the line
	 */
	public int getLineNumber() {
		return lineNumber;
	}

	/**
	 * Set the line number.
	 * 
	 * @param lineNumber
	 *            the number of the line
	 */
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
}
