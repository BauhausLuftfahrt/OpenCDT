/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.resources.exceptions;

import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

/**
 * This class is an exception thrown in the context of the Resources plug-in.
 * 
 * @author Martin Glas
 * 
 */
public class ResourcesRuntimeException extends CDTRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This is the constructor without argument.
	 */
	public ResourcesRuntimeException() {
		super("An error occurred.");
	}

	/**
	 * This is the constructor with a String message as argument.
	 * 
	 * @param msg
	 *            The string message
	 */
	public ResourcesRuntimeException(String msg) {
		super(msg);
	}

	/**
	 * This is the constructor with an exception as argument.
	 * 
	 * @param e
	 *            The argument exception
	 */
	public ResourcesRuntimeException(Throwable e) {
		super(e);
	}
}
