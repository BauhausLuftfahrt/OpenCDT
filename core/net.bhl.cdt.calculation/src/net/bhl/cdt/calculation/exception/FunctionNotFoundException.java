/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.exception;

/**
 * A exception class for the case that a function is not found during the mapping process.
 * 
 * @author Michael Kagel
 */
public class FunctionNotFoundException extends ConfigureCalculationException {

	/**
	 * Generated serial ID.
	 */
	private static final long serialVersionUID = -3161564950043555547L;

	/**
	 * Constructor.
	 * 
	 * @param string The exception message
	 */
	public FunctionNotFoundException(String string) {
		super(string);
	}

}
