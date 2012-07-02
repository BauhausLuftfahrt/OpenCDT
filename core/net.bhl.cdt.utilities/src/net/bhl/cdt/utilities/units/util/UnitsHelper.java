/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.utilities.units.util;

import javax.units.Unit;

import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;
import net.bhl.cdt.utilities.quantities.Acceleration;
import net.bhl.cdt.utilities.quantities.Angle;
import net.bhl.cdt.utilities.quantities.Area;
import net.bhl.cdt.utilities.quantities.Coefficient;
import net.bhl.cdt.utilities.quantities.Density;
import net.bhl.cdt.utilities.quantities.Length;
import net.bhl.cdt.utilities.quantities.Mass;
import net.bhl.cdt.utilities.quantities.SpecificFuelConsumption;
import net.bhl.cdt.utilities.quantities.Temperature;
import net.bhl.cdt.utilities.quantities.Velocity;
import net.bhl.cdt.utilities.quantities.Weight;
import net.bhl.cdt.utilities.units.Quantity;

/**
 * This is a helper class for the Units package.
 * 
 * @author Martin Glas
 * @author Sebastian H�cht
 */
public final class UnitsHelper {
	private UnitsHelper() {
	}

	/**
	 * This method returns the appropriate Quantity from a given Unit.
	 * 
	 * @param unit Unit from which the Quantity is reasoned from
	 * @return The appropriate Quantity of the given Unit
	 */

	public static Quantity getQuantityByUnit(Unit unit) {
		// Degree_Angle is compatible with dimensionless unit. therefore, it is at the beginning
		// Other forms of angles will not be recognized
		// TODO general handling of dimensionless Quantities
		if (unit.equals(Angle.DEFAULTUNIT)) {
			return Quantity.ANGLE;
		} else if (unit.isCompatible(Area.DEFAULTUNIT)) {
			return Quantity.AREA;
		} else if (unit.isCompatible(Length.DEFAULTUNIT)) {
			return Quantity.LENGTH;
		} else if (unit.isCompatible(Weight.DEFAULTUNIT)) {
			return Quantity.WEIGHT;
		} else if (unit.isCompatible(Acceleration.DEFAULTUNIT)) {
			return Quantity.ACCELERATION;
		} else if (unit.isCompatible(Temperature.DEFAULTUNIT)) {
			return Quantity.TEMPERATURE;
		} else if (unit.isCompatible(Velocity.DEFAULTUNIT)) {
			return Quantity.VELOCITY;
		} else if (unit.isCompatible(Density.DEFAULTUNIT)) {
			return Quantity.DENSITY;
		} else if (unit.isCompatible(SpecificFuelConsumption.DEFAULTUNIT)) {
			return Quantity.SPECIFICFUELCONSUMPTION;
		} else if (unit.isCompatible(Mass.DEFAULTUNIT)) {
			return Quantity.MASS;
		} else if (unit.isCompatible(Coefficient.DEFAULTUNIT)) {
			return Quantity.COEFFICIENT;
		}

		return null;
		// throw new CDTRuntimeException("unknown Unit: " + unit.toString());
	}

	/**
	 * Checks if the a Unit is compatible with a Quantity.
	 * 
	 * @author Sebastian H�cht
	 * @param unit the unit of the quantity
	 * @param quantity the quantity of the unit
	 * @return true if the unit is compatible with the quantity. For Example "kg" or "g" is compatible with "MASS"
	 */
	public static boolean isCompatible(Unit unit, Quantity quantity) {
		if (quantity.equals(Quantity.ANGLE)) {
			return unit.isCompatible(Angle.DEFAULTUNIT);
		} else if (quantity.equals(Quantity.AREA)) {
			return unit.isCompatible(Area.DEFAULTUNIT);
		} else if (quantity.equals(Quantity.LENGTH)) {
			return unit.isCompatible(Length.DEFAULTUNIT);
		} else if (quantity.equals(Quantity.WEIGHT)) {
			return unit.isCompatible(Weight.DEFAULTUNIT);
		} else if (quantity.equals(Quantity.ACCELERATION)) {
			return unit.isCompatible(Acceleration.DEFAULTUNIT);
		} else if (quantity.equals(Quantity.TEMPERATURE)) {
			return unit.isCompatible(Temperature.DEFAULTUNIT);
		} else if (quantity.equals(Quantity.VELOCITY)) {
			return unit.isCompatible(Velocity.DEFAULTUNIT);
		} else if (quantity.equals(Quantity.DENSITY)) {
			return unit.isCompatible(Density.DEFAULTUNIT);
		} else if (quantity.equals(Quantity.SPECIFICFUELCONSUMPTION)) {
			return unit.isCompatible(SpecificFuelConsumption.DEFAULTUNIT);
		} else if (quantity.equals(Quantity.MASS)) {
			return unit.isCompatible(Mass.DEFAULTUNIT);
		} else if (quantity.equals(Quantity.COEFFICIENT)) {
			return unit.isCompatible(Coefficient.DEFAULTUNIT);
		}

		throw new CDTRuntimeException("unknown Quantity: " + quantity.getLiteral());
	}

	/**
	 * Get the default Unit based on the Quantity.
	 * 
	 * @author Sebastian H�cht
	 * @param quantity the quantity of the unit to return
	 * @return the default Unit based of a Quantity
	 */
	public static Unit getDefaultUnit(Quantity quantity) {
		if (quantity.equals(Quantity.ANGLE)) {
			return Angle.DEFAULTUNIT;
		} else if (quantity.equals(Quantity.AREA)) {
			return Area.DEFAULTUNIT;
		} else if (quantity.equals(Quantity.LENGTH)) {
			return Length.DEFAULTUNIT;
		} else if (quantity.equals(Quantity.WEIGHT)) {
			return Weight.DEFAULTUNIT;
		} else if (quantity.equals(Quantity.ACCELERATION)) {
			return Acceleration.DEFAULTUNIT;
		} else if (quantity.equals(Quantity.TEMPERATURE)) {
			return Temperature.DEFAULTUNIT;
		} else if (quantity.equals(Quantity.VELOCITY)) {
			return Velocity.DEFAULTUNIT;
		} else if (quantity.equals(Quantity.DENSITY)) {
			return Density.DEFAULTUNIT;
		} else if (quantity.equals(Quantity.SPECIFICFUELCONSUMPTION)) {
			return SpecificFuelConsumption.DEFAULTUNIT;
		} else if (quantity.equals(Quantity.MASS)) {
			return Mass.DEFAULTUNIT;
		} else if (quantity.equals(Quantity.COEFFICIENT)) {
			return Coefficient.DEFAULTUNIT;
		}

		throw new CDTRuntimeException("unknown Quantity: " + quantity.getLiteral());
	}

	/**
	 * This Method gives back the Quantity of a given Unit which is coded as a String.
	 * 
	 * @param unitString the unit coded as a String
	 * @return the appropriate Quantity to the given Unit
	 */
	public static Quantity getQuantityByUnit(String unitString) {
		return getQuantityByUnit(Unit.valueOf(unitString));
	}

}
