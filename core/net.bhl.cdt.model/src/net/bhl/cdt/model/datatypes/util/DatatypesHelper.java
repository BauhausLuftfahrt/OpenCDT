/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.datatypes.util;

import java.util.List;

import javax.measure.unit.Unit;

import net.bhl.cdt.model.datatypes.Array;
import net.bhl.cdt.model.datatypes.CompositeValues;
import net.bhl.cdt.model.datatypes.DatatypesFactory;
import net.bhl.cdt.model.datatypes.FloatPointValue;
import net.bhl.cdt.model.datatypes.IntegerValue;
import net.bhl.cdt.model.datatypes.MeasuredValue;

/**
 * This is a helper class for the datatypes package.
 * 
 * @author Martin Glas
 */
public final class DatatypesHelper {
	private DatatypesHelper() {

	}

	/**
	 * This method creates a MeasuredValue object out of given attributes values.
	 * 
	 * @param name The name of the MeasuredValue object
	 * @param value The Double value of the MeasuredValue object
	 * @param unit The Unit attribute of the MeasuredValue object
	 * @return the created MeasuredValue object
	 */
	public static MeasuredValue createMeasuredValue(String name, Double value, Unit<?> unit) {
		MeasuredValue resultMeasuredValue = DatatypesFactory.eINSTANCE.createMeasuredValue();
		resultMeasuredValue.setName(name);
		resultMeasuredValue.setValue(value);
		resultMeasuredValue.setUnit(unit);

		return resultMeasuredValue;
	}

	/**
	 * This method creates a CompositeValues object with a given name.
	 * 
	 * @param name the name of the CompositeValues object
	 * @return the created CompositeValues object
	 */
	public static CompositeValues createCompositeValues(String name) {
		CompositeValues resultCompositeValues = DatatypesFactory.eINSTANCE.createCompositeValues();
		resultCompositeValues.setName(name);
		return resultCompositeValues;
	}

	/**
	 * This method creates a vector as an Array object with a given name, unit and a List of Double values.
	 * 
	 * @param name the name of the Array object
	 * @param unit the Unit of the Array
	 * @param values a list of Double Values
	 * @return the created vector as Array object
	 */
	public static Array createVector(String name, Unit unit, List<Double> values) {
		Array resultArray = DatatypesFactory.eINSTANCE.createArray();
		resultArray.setName(name);

		int i = 0;
		for (Double value : values) {
			i++;
			MeasuredValue leafValue = DatatypesFactory.eINSTANCE.createMeasuredValue();
			leafValue.setName(name + "." + i);
			leafValue.setUnit(unit);
			leafValue.setValue(value);
			resultArray.getDatatypes().add(leafValue);
		}

		return resultArray;
	}

	/**
	 * This method creates an IntegerValue object out of given attributes values.
	 * 
	 * @param name The name of the IntegerValue object
	 * @param value The integer value of the IntegerValue object
	 * @return the created IntegerValue object
	 */
	public static IntegerValue createIntegerValue(String name, int value) {
		IntegerValue resultMeasuredValue = DatatypesFactory.eINSTANCE.createIntegerValue();
		resultMeasuredValue.setName(name);
		resultMeasuredValue.setValue(value);
		return resultMeasuredValue;
	}

	/**
	 * This method creates an FloatPointValue object out of given attributes values.
	 * 
	 * @param name The name of the FloatPointValue object
	 * @param value The Double value of the FloatPointValue object
	 * @return the created FloatPointValue object
	 */
	public static FloatPointValue createFloatPointValue(String name, Double value) {
		FloatPointValue resultFloatPointValue = DatatypesFactory.eINSTANCE.createFloatPointValue();
		resultFloatPointValue.setName(name);
		resultFloatPointValue.setValue(value);
		return resultFloatPointValue;
	}
}
