/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.util;

import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.Model;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.model.qualification.CalculationSpace;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.model.qualification.Qualifiable;
import net.bhl.cdt.model.qualification.QualifyingSpace;

/**
 * This is a Helper class for handling Calculations.
 * 
 * @author Sven Ziemer
 */
public final class CalculationHelper {

	private CalculationHelper() {

	}

	/**
	 * This method determines if a calculation is mapped.
	 * 
	 * @param calculation the calculation which is checked
	 * @return true if a calculation is mapped, otherwise false
	 */
	public static boolean isMapped(Calculation calculation) {
		ParameterMapping paraMapping = calculation.getParameterMapping();
		if (paraMapping != null) {
			return true;
		}
		return false;
	}

	/**
	 * Returns true if a value is qualified with a CalculationSpaceQualifier.
	 * 
	 * @param value
	 * @return true if value is qualified
	 */

	public static boolean isQualified(Value value) {
		// Find instance of Model that contains value
		for (QualifyingSpace qs : getModel(value).getQualifyingSpaces()) {
			// Find container of CalculationSpaceQualifier
			if (qs instanceof CalculationSpace) {
				for (CalculationSpaceQualifier qa : ((CalculationSpace) qs).getSpaceQualifier()) {
					// Return true when value is qualified by a SpaceQualifier in CalculationSpace
					for (Qualifiable element : qa.getQualifies()) {
						if (element.equals(value)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * Returns the Model instance that contains element.
	 * 
	 * @param element
	 * @return Reference to Model or null
	 */
	private static Model getModel(Element element) {
		if (element != null) {

			while (element != null && (!(element instanceof Model))) {
				element = (Element) element.eContainer();
			}
			if (element instanceof Model) {
				return (Model) element;
			}
		}
		return null;
	}

}
