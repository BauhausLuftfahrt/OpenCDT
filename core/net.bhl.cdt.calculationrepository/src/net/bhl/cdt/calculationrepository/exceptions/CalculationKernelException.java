/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculationrepository.exceptions;

/**
 * This Exception handles errors in the calculation kernel package.
 * 
 * @author Martin Glas
 */

public class CalculationKernelException extends CalculationException {

	private static final long serialVersionUID = 6269692920361067886L;

	/**
	 * This is the constructor method with an exception as argument.
	 * 
	 * @param e the exception
	 */
	public CalculationKernelException(Throwable e) {
		super(e);
	}

}
