/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.exception;

/**
 * A exception class which will be thrown if someone tries to import a not
 * supported file format.
 * 
 * @author Michael Kagel
 * @author Sven Ziemer
 */
public class UnexpectedFileFormatException extends ImportException {

	private static final long serialVersionUID = 6985549901414184038L;

	/**
	 * Constructor with standard message.
	 */
	public UnexpectedFileFormatException() {
		super("Selected file has an unexpected file format.");
	}

	/**
	 * Constructor.
	 * 
	 * @param msg
	 *            The exception message
	 */
	public UnexpectedFileFormatException(String msg) {
		super(msg);
	}

	/**
	 * Constructor.
	 * 
	 * @param e
	 *            Exception which should be encapsulated by this exception
	 */
	public UnexpectedFileFormatException(Throwable e) {
		super(e);
	}
}
