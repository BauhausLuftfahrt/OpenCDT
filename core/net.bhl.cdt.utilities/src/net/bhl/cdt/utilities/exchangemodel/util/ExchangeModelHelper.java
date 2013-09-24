/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.utilities.exchangemodel.util;

import java.util.ArrayList;
import java.util.List;

import javax.units.ConversionException;
import javax.units.Unit;

import net.bhl.cdt.utilities.datatypes.CompositeValues;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;
import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

/**
 * @author Martin Glas
 * @author Florian Penn
 */
public final class ExchangeModelHelper {
	private ExchangeModelHelper() {

	}

	/**
	 * The method gets the value attribute of an ExchangeValue and converts it to a given Unit.
	 * 
	 * @param measuredValue The source ExValue Object which contains the value attribute
	 * @param unit The unit the value attribute of the ExValue is converted to
	 * @return The value attribute converted to the given Unit
	 * @throws ConversionException The exception is thrown if the given Unit is not compatible with the Unit of the
	 *             ExValue
	 */
	public static double getExchangeValueAttributeToUnit(MeasuredValue measuredValue, Unit unit)
		throws ConversionException {

		return measuredValue.getUnit().getConverterTo(unit).convert(measuredValue.getValue());

	}

	/**
	 * This method returns children of a Composite element being instance if a given class and having a specified name.
	 * 
	 * @param <T> T This is the return type of the method correlated with the given class
	 * @param parent The parent ComposoteElement which contains the returns ExchangeElements
	 * @param clazz The method searches for children being instance of this class and a given name
	 * @param name The method searches for children having this name and a given class
	 * @return the returned children ModelElements which are instance of a given class and specifically named
	 */
	@SuppressWarnings("unchecked")
	public static <T extends ExchangeElement> List<T> getChildrenByClassAndName(CompositeValues parent, Class<T> clazz,
		String name) {
		List<T> result = new ArrayList<T>();
		TreeIterator<EObject> iterator = parent.eAllContents();
		while (iterator.hasNext()) {
			ExchangeElement ob = (ExchangeElement) iterator.next();
			if ((clazz.isInstance(ob) && (ob.getName().equals(name)))) {
				result.add((T) ob);
			}
		}
		return result;
	}

}
