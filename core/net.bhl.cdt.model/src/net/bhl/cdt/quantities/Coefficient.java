/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.quantities;

import static javax.measure.unit.Unit.ONE;

import javax.measure.quantity.Dimensionless;
import javax.measure.unit.Unit;

/**
 * This class specifies the Coefficient Quantity.
 * 
 * @author Martin Glas
 */
public final class Coefficient {
	private Coefficient() {

	}

	/**
	 * The default Unit of an Coefficient is " ".
	 */
	public static final Unit<Dimensionless> DEFAULTUNIT = ONE;
}
