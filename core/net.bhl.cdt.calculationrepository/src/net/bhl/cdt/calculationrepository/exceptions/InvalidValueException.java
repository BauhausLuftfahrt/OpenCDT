/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculationrepository.exceptions;

/**
 * This exception handles errors in wiring calculations if the values are invalid.
 * 
 * @author Martin Glas
 */
public class InvalidValueException extends CalculationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8826004542662748419L;

	/**
	 * This is the constructor method without argument.
	 */
	public InvalidValueException() {
		super("Invalid values.");
	}

	/**
	 * This is the constructor method with a String message as argument.
	 * 
	 * @param msg the String message
	 */
	public InvalidValueException(String msg) {
		super(msg);
	}
}
