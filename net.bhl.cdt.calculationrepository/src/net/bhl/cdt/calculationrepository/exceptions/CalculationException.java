/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculationrepository.exceptions;

import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

/**
 * This Exception handles errors in the Calculation repository plug-in.
 * 
 * @author Martin Glas
 */
public class CalculationException extends CDTRuntimeException {

	private static final long serialVersionUID = 6985549901414184038L;

	/**
	 * This is the constructor method without argument.
	 */
	public CalculationException() {
		super("An error occurred.");
	}

	/**
	 * This is the constructor method with a String message as argument.
	 * 
	 * @param msg the String message
	 */
	public CalculationException(String msg) {
		super(msg);
	}

	/**
	 * This is the constructor method with an exception as argument.
	 * 
	 * @param e the exception
	 */
	public CalculationException(Throwable e) {
		super(e);
	}
}
