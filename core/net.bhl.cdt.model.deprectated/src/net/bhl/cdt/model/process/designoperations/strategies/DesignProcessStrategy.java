/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.process.designoperations.strategies;

import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.ProcessPackage;

import org.eclipse.emf.ecore.EClass;

public class DesignProcessStrategy implements OperationStrategy {

	@Override
	public void start(ProcessElement processElement) {

		if (processElement instanceof DesignProcess) {
			DesignProcess designProcess = (DesignProcess) processElement;
			if (designProcess.isStartable()) {
				designProcess.setBusy(true);
				for (ProcessElement subProcessElement : designProcess.getDesignProcessElements()) {
					subProcessElement.start();
				}

				designProcess.setBusy(false);
			}

		}
	}

	@Override
	public boolean isStartable(ProcessElement processElement) {
		if (processElement instanceof DesignProcess) {
			DesignProcess designProcess = (DesignProcess) processElement;

			for (ProcessElement subProcessElement : designProcess.getDesignProcessElements()) {
				if (!subProcessElement.isStartable())
					return false;
			}
			return true;
		}
		return false;
	}

	@Override
	public EClass getEClass() {
		return ProcessPackage.Literals.DESIGN_PROCESS;
	}

}
