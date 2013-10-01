/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.exception;

import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

/**
 * Exception for unexpected object types during a instanceof scan. Otherwise the return value would be a null.
 * 
 * @author Michael Kagel
 */
public class UnexpectedObjectTypeException extends CDTRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6058499554319546076L;

	/**
	 * Constructor.
	 * 
	 * @param message Exception message
	 */
	public UnexpectedObjectTypeException(String message) {
		super(message);
	}

}
