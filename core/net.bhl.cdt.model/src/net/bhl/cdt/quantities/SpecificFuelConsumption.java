/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.quantities;

import static javax.measure.unit.SI.KILOGRAM;
import static javax.measure.unit.SI.NEWTON;
import static javax.measure.unit.SI.SECOND;

import javax.measure.unit.Unit;

/**
 * This class specifies the Specific Fuel Consumption Quantity.
 * 
 * @author Martin Glas
 */
public final class SpecificFuelConsumption {

	private SpecificFuelConsumption() {

	}

	/**
	 * The default Unit of Density is kg/(N s).
	 */
	public static final Unit DEFAULTUNIT = KILOGRAM.divide(NEWTON.times(SECOND));
}
