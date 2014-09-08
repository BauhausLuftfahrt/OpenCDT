/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.process.registry;

import java.util.HashMap;

import net.bhl.cdt.model.process.OperationStrategy;

import org.eclipse.emf.ecore.EClass;

public class OperationStrategyRegistry {
	private static OperationStrategyRegistry instance = null;
	private HashMap<EClass, OperationStrategy> operationStrategies;

	private OperationStrategyRegistry() {
		operationStrategies = new HashMap<EClass, OperationStrategy>();
	}

	public static OperationStrategyRegistry getInstance() {
		if (instance == null) {
			instance = new OperationStrategyRegistry();
		}
		return instance;
	}

	public void addStrategy(EClass eclass, OperationStrategy processStrategy) {
		operationStrategies.put(eclass, processStrategy);

	}

	public OperationStrategy getStrategy(EClass eClass) {
		if (operationStrategies.containsKey(eClass)) {
			return operationStrategies.get(eClass);
		} else if (!eClass.getEAllSuperTypes().isEmpty()) {
			for (EClass superClass : eClass.getEAllSuperTypes()) {
				if (hasStrategy(superClass)) {
					return operationStrategies.get(superClass);
				}
			}
		}

		return null;
	}

	public boolean hasStrategy(EClass eClass) {
		if (operationStrategies.containsKey(eClass)) {
			return true;
		} else if (!eClass.getEAllSuperTypes().isEmpty()) {
			for (EClass superClass : eClass.getEAllSuperTypes()) {
				if (hasStrategy(superClass)) {
					return true;
				}
			}
		}
		return false;

	}

}
