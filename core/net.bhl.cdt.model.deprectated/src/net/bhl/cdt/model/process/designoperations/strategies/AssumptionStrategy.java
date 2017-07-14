/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.process.designoperations.strategies;

import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;

import org.eclipse.emf.ecore.EClass;

public class AssumptionStrategy implements OperationStrategy {

	@Override
	public void start(ProcessElement processElement) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isStartable(ProcessElement processElement) {

		return true;
	}

	@Override
	public EClass getEClass() {
		return DesignoperationsPackage.Literals.ASSUMPTION;
	}

}
