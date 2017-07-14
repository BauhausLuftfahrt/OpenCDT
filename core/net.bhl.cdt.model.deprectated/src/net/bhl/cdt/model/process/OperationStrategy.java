/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.process;

import org.eclipse.emf.ecore.EClass;

/**
 * @author martin.glas
 */
public interface OperationStrategy {
	/**
	 * This method executes the OperationStrategy.
	 * 
	 * @param processElement the process element, the strategy is applied to
	 */
	void start(ProcessElement processElement);

	/**
	 * This method test whether the strategy allied to a certain Process element is startable.
	 * 
	 * @param processElement the Process element the strategy is applied to
	 * @return true of it is startable
	 */
	boolean isStartable(ProcessElement processElement);

	/**
	 * This method returns the EClass the strategy is for.
	 * 
	 * @return the EClass the strategy is for
	 */
	EClass getEClass();
}
