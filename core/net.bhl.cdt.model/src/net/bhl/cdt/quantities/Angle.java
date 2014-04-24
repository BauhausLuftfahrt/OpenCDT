/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.quantities;

import static javax.measure.unit.NonSI.DEGREE_ANGLE;

import javax.measure.unit.Unit;

/**
 * This class specifies the Quantity Angle.
 * 
 * @author Martin Glas
 */
public final class Angle {
	private Angle() {

	}

	/**
	 * The default Unit of Angle is °.
	 */
	public static final Unit DEFAULTUNIT = DEGREE_ANGLE;
}
