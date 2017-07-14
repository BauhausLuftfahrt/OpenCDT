/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.process.designoperations.strategies;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.system.Counter;
import net.bhl.cdt.model.system.DecimalNumber;

import org.eclipse.emf.ecore.EClass;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
import de.congrace.exp4j.UnknownFunctionException;
import de.congrace.exp4j.UnparsableExpressionException;

public class CalculatedDecimalNumberStrategy implements OperationStrategy {
	@Override
	public void start(ProcessElement processElement) {

		if (processElement instanceof CalculatedDecimalNumber) {
			CalculatedDecimalNumber CalculatedDecimalNumber = (CalculatedDecimalNumber) processElement;
			if (CalculatedDecimalNumber.isStartable()) {
				CalculatedDecimalNumber.setBusy(true);
				Map<String, Double> variables = new HashMap<String, Double>();
				for (ProcessableElement processableElement : CalculatedDecimalNumber.getProcessedElements()) {

					if (processableElement instanceof DecimalNumber) {
						DecimalNumber decimalNumber = (DecimalNumber) processableElement;
						variables.put(decimalNumber.getName(), decimalNumber.getValue().doubleValue());
					}

					else if (processableElement instanceof Counter) {
						Counter counter = (Counter) processableElement;
						variables.put(counter.getName(), Double.valueOf(counter.getValue()));
					}

				}

				try {
					String expression = CalculatedDecimalNumber.getExpression().substring(1);

					Calculable calc = new ExpressionBuilder(expression).withVariables(variables).build();

					Double result = calc.calculate();

					CalculatedDecimalNumber.setValue(BigDecimal.valueOf(Double.valueOf(result)));

				} catch (UnknownFunctionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnparsableExpressionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				CalculatedDecimalNumber.setBusy(false);
			}

		}
	}

	@Override
	public boolean isStartable(ProcessElement processElement) {

		if (processElement instanceof CalculatedDecimalNumber) {
			CalculatedDecimalNumber CalculatedDecimalNumber = (CalculatedDecimalNumber) processElement;

			if (/** (CalculatedDecimalNumber.getParameter() != null) && */
			(CalculatedDecimalNumber.getExpression() != null)) {
				int equalsIndex = CalculatedDecimalNumber.getExpression().indexOf("=");
				if (equalsIndex == 0) {

					Map<String, Double> variables = new HashMap<String, Double>();
					for (ProcessableElement processableElement : CalculatedDecimalNumber.getProcessedElements()) {

						if (processableElement instanceof DecimalNumber) {
							DecimalNumber decimalNumber = (DecimalNumber) processableElement;
							variables.put(decimalNumber.getName(), decimalNumber.getValue().doubleValue());
						}

						else if (processableElement instanceof Counter) {
							Counter counter = (Counter) processableElement;
							variables.put(counter.getName(), Double.valueOf(counter.getValue()));
						}

					}

					try {
						String expression = CalculatedDecimalNumber.getExpression().substring(equalsIndex + 1);

						@SuppressWarnings("unused")
						Calculable calc = new ExpressionBuilder(expression).withVariables(variables).build();

						return true;

					} catch (UnknownFunctionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (UnparsableExpressionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}
		return false;
	}

	@Override
	public EClass getEClass() {
		return DesignoperationsPackage.Literals.CALCULATED_DECIMAL_NUMBER;
	}
}
