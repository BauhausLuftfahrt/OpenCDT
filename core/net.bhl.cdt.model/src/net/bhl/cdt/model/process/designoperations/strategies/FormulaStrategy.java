/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.process.designoperations.strategies;

import java.util.HashMap;
import java.util.Map;

import javax.measure.unit.Unit;

import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.Formula;
import net.bhl.cdt.model.system.Counter;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.Value;
import net.bhl.cdt.model.system.util.SystemHelper;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.emf.ecore.EClass;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
import de.congrace.exp4j.UnknownFunctionException;
import de.congrace.exp4j.UnparsableExpressionException;

public class FormulaStrategy implements OperationStrategy {

	@Override
	public void start(ProcessElement processElement) {

		if (processElement instanceof Formula) {
			Formula formula = (Formula) processElement;
			if (formula.isStartable()) {
				formula.setBusy(true);
				Map<String, Double> variables = new HashMap<String, Double>();
				for (ProcessableElement processableElement : formula.getProcessedElements()) {

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
					int equalsIndex = formula.getFormula().indexOf("=");
					String expression = formula.getFormula().substring(equalsIndex + 1);
					int i = 1;

					Calculable calc = new ExpressionBuilder(expression).withVariables(variables).build();

					Unit unit1 = Unit.valueOf("m");
					Unit unit2 = Unit.valueOf("s");
					Unit unit3 = unit1.divide(unit2);

					Double result = calc.calculate();

					Value newValue = SystemHelper.generateValue(formula.getParameter().getName(), result.toString(),
						formula, ModelHelper.getContainingProject(formula));
					formula.getParameter().getValues().add(newValue);

				} catch (UnknownFunctionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnparsableExpressionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				formula.setBusy(false);
			}

		}
	}

	@Override
	public boolean isStartable(ProcessElement processElement) {

		if (processElement instanceof Formula) {
			Formula formula = (Formula) processElement;

			if ((formula.getParameter() != null) && (formula.getFormula() != null)) {
				int equalsIndex = formula.getFormula().indexOf("=");
				String parameterName = formula.getParameter().getName().substring(0, equalsIndex);
				if (formula.getParameter().getName().equals(parameterName)) {

					Map<String, Double> variables = new HashMap<String, Double>();
					for (ProcessableElement processableElement : formula.getProcessedElements()) {

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
						String expression = formula.getFormula().substring(equalsIndex + 1);
						int i = 1;

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
		return DesignoperationsPackage.Literals.FORMULA;
	}
}
