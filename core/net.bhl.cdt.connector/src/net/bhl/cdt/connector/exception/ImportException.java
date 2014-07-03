/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.exception;

import net.bhl.cdt.exceptions.CDTRuntimeException;

/**
 * A exception class which will be thrown if during the import process is some
 * kind of exception.
 * 
 * @author Michael Kagel
 * @author Sven Ziemer
 */
public class ImportException extends CDTRuntimeException {

	private static final long serialVersionUID = 6985549901414184038L;

	/**
	 * Constructor with standard message.
	 */
	public ImportException() {
		super("An error during file import occurred.");
	}

	/**
	 * Constructor.
	 * 
	 * @param msg
	 *            The exception message
	 */
	public ImportException(String msg) {
		super(msg);
	}

	/**
	 * Constructor.
	 * 
	 * @param e
	 *            Exception which should be encapsulated by this exception
	 */
	public ImportException(Throwable e) {
		super(e);
	}

	/**
	 * Constructor.
	 * 
	 * @param message
	 *            The exception message
	 * @param t
	 *            Exception which should be encapsulated by this exception
	 */
	public ImportException(String message, Throwable t) {
		super(message, t);
	}
}
