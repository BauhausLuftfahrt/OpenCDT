/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.math.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
import de.congrace.exp4j.UnknownFunctionException;
import de.congrace.exp4j.UnparsableExpressionException;

/**
 * This class evaluates the testexp4j library.
 * 
 * @author martin.glas
 */
public class TestExp4j {

	/**
	 * This method performs a simple calculation with the ExpressionBuilder.
	 */
	@Test
	public void testCalculator() {

		try {
			Calculable calc = new ExpressionBuilder("x * y - 2").withVariableNames("x", "y").build();
			calc.setVariable("x", 1);
			calc.setVariable("y", 2);
			assertTrue(calc.calculate() == 0);
		} catch (UnknownFunctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnparsableExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
