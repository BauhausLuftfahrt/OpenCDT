/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.utilities.currencies;

import static org.jscience.economics.money.Currency.USD;

import org.jscience.economics.money.Currency;

/**
 * This class specifies the Quantity Angle.
 * 
 * @author Martin Glas
 */
public final class Dollars {
	private Dollars() {

	}

	/**
	 * The default Unit of Angle is °.
	 */
	public static final Currency DEFAULTUNIT = USD;
}
