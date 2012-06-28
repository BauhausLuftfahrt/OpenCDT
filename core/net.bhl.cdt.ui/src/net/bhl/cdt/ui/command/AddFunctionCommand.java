/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.command;

import net.bhl.cdt.calculationrepository.functions.CalculationRepository;
import net.bhl.cdt.calculationrepository.functions.FunctionsFactory;
import net.bhl.cdt.calculationrepository.functions.ScilabFunction;
import net.bhl.cdt.utilities.commands.CDTCommand;

/**
 * This Command creates a new Function and opens the FunctionEditor.
 * 
 * @author Sebastian Höcht
 */
public class AddFunctionCommand extends CDTCommand {

	private CalculationRepository calculationRepository;
	private ScilabFunction scilabFunction;

	/**
	 * 
	 * @param calculationRepository
	 *            where the new Function should be added to
	 */
	public AddFunctionCommand(CalculationRepository calculationRepository) {
		this.calculationRepository = calculationRepository;
	}

	@Override
	protected void doRun() {

		ScilabFunction function = FunctionsFactory.eINSTANCE
				.createScilabFunction();
		function.setName("a new scilab function");
		calculationRepository.getFunctions().add(function);
		this.scilabFunction = function;
	}

	/**
	 * 
	 * @return the Function
	 */
	public ScilabFunction getFunction() {
		return this.scilabFunction;
	}
}
