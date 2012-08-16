/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.utilities.quantities;

import static javax.units.SI.METER;
import static javax.units.SI.SECOND;

import javax.units.Unit;

/**
 * This class specifies the Quantity Acceleration.
 * 
 * @author Martin Glas
 */
public final class Acceleration {
	/**
	 * The constructor does not anything.
	 */
	private Acceleration() {

	}

	/**
	 * The default unit of Acceleration is m/s�.
	 */
	public static final Unit DEFAULTUNIT = METER.divide(SECOND.multiply(SECOND));

}
