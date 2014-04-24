/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.exception;

import net.bhl.cdt.exceptions.CDTRuntimeException;

/**
 * A exception which will be thrown, when a part of a file import fails.
 * Possible reasons could be a yet unknown or not implemented type of an input
 * line, which can't be parsed yet.
 * 
 * @author Sebastian Höcht
 */
public class ImportPartException extends CDTRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6463252211366541462L;

	/**
	 * Constructor with standard message.
	 */
	public ImportPartException() {
		super("An Error during a file import of a PACE line occurred.");
	}

	/**
	 * Constructor.
	 * 
	 * @param msg
	 *            The exception message
	 */
	public ImportPartException(String msg) {
		super(msg);
	}

	/**
	 * Constructor.
	 * 
	 * @param e
	 *            Exception which should be encapsulated by this exception
	 */
	public ImportPartException(Throwable e) {
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
	public ImportPartException(String message, Throwable t) {
		super(message, t);
	}
}
