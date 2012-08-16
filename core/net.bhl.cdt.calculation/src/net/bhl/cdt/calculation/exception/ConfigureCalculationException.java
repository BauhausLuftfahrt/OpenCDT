/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.exception;

import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

/**
 * A exception class for exceptions during the configuration of a calculation object.
 * 
 * @author Michael Kagel
 */
public class ConfigureCalculationException extends CDTRuntimeException {

	/**
	 * Generated serial ID.
	 */
	private static final long serialVersionUID = 3248448033959659312L;

	/**
	 * Constructor.
	 * 
	 * @param string The exception message
	 */
	public ConfigureCalculationException(String string) {
		super(string);
	}

}
