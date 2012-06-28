/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.utilities.exchangemodel.util;

import javax.units.ConversionException;
import javax.units.Unit;

import net.bhl.cdt.utilities.datatypes.MeasuredValue;

/**
 * @author Martin Glas
 * @author Florian Penn
 */
public final class ExModelHelper {
	private ExModelHelper() {

	}

	/**
	 * The method gets the value attribute of an ExValue and converts it to a given Unit.
	 * 
	 * @param measuredValue The source ExValue Object which contains the value attribute
	 * @param unit The unit the value attribute of the ExValue is converted to
	 * @return The value attribute converted to the given Unit
	 * @throws ConversionException The exception is thrown if the given Unit is not compatible with the Unit of the
	 *             ExValue
	 */
	public static double getExValueAttributeToUnit(MeasuredValue measuredValue, Unit unit) throws ConversionException {

		return measuredValue.getUnit().getConverterTo(unit).convert(measuredValue.getValue());

	}
}
