/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.utilities.quantities;

import static javax.units.SI.METER;

import javax.units.Unit;

/**
 * This class specifies the Area Quantity.
 * 
 * @author Martin Glas
 */
public final class Area {

	private Area() {

	}

	/**
	 * The default unit of Area is m².
	 */
	public static final Unit DEFAULTUNIT = METER.multiply(METER);
}
