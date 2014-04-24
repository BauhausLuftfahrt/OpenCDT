/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.exceptions;

/**
 * This class inherits from RuntimeException and implements some special constructors.
 * 
 * @author Martin Glas
 */
public class CDTRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8371177630681757696L;

	/**
	 * This method is the constructor without argument.
	 */
	public CDTRuntimeException() {
		super("An error has occurred.");
	}

	/**
	 * This method is the constructor with a message as argument.
	 * 
	 * @param msg The message of the exception
	 */
	public CDTRuntimeException(String msg) {
		super(msg);
	}

	/**
	 * This method is the constructor with an exception as argument.
	 * 
	 * @param e The exception which is given to the constructor as argument
	 */
	public CDTRuntimeException(Throwable e) {
		super(e);
	}

	/**
	 * This method is the constructor with a message and an exception as argument.
	 * 
	 * @param message The message of the exception
	 * @param e The exception which is given to the constructor as argument
	 */
	public CDTRuntimeException(String message, Throwable e) {
		super(message, e);
	}

}
