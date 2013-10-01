/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.command;

import java.util.Iterator;
import java.util.Map.Entry;

import net.bhl.cdt.calculation.exception.MappingErrorException;
import net.bhl.cdt.calculation.exception.UncompatibleQuantityInMappingException;
import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.architecturetools.exceptions.NoValueFoundException;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.units.Quantity;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.emf.common.util.EMap;

/**
 * Verifies a calculation set.
 * 
 * @author Sven Ziemer
 */

public class VerifyCalculationSetCommand extends CDTCommand {

	private CalculationSet calculationSet;
	private CalculationRepositoryManager manager;
	
	/**
	 * Constructor, receiving the calculationSet to be verified.
	 * @param calculationSet Calculation set to be verified
	 */
	public VerifyCalculationSetCommand(CalculationSet calculationSet) {
		this.calculationSet = calculationSet;
		manager = CalculationRepositoryManager.getInstance();
	}

	@Override
	protected void doRun() {
		verifyCalculationSet(calculationSet);
	}

	/**
	 * Verifies a calculation set by verifying the subcalculation sets and calculations it contains.
	 * @param calculationSet The calculation set to be verified
	 */
	protected void verifyCalculationSet(CalculationSet calculationSet) {
		System.out.println(calculationSet.getName());

		for (Calculation calculation : calculationSet.getCalculations()) {
			verifyCalculation(calculation);
		}

		for (CalculationSet subCalculationSet : calculationSet.getSubCalculationSet()) {
			verifyCalculationSet(subCalculationSet);
		}
	}

	/**
	 * Verifies a calculation.
	 * @param calculation The calculation to be verified
	 */
	protected void verifyCalculation(Calculation calculation) {
		//Should this method be moved to the Calculation class?
		System.out.println("Calculation: " + calculation.getName());
		Component component = null;

		// retrieve parametermapping
		ParameterMapping parameterMapping = calculation.getParameterMapping();

		/**
		 * Check inputParameterMapping. If the inputParameterMapping contains Parameters, all parameters must have the
		 * same ParentComponent
		 */

		String functionID = calculation.getFunctionID();

		Function function = manager.getFunction(UtilitiesHelper.getProjectId(calculation), functionID);
		if (function == null) {
			throw new MappingErrorException();
		}
		int sizeInputParameterDescriptor = function.getInputDescriptors().size();
		int sizeOutputParameterDescriptor = function.getOutputDescriptors().size();

		EMap<ParameterDescriptor, MappableComponentInterface> inputParameterDescriptors = parameterMapping
			.getInputMappables();
		if (sizeInputParameterDescriptor != inputParameterDescriptors.size()) {
			throw new MappingErrorException();
		}
		Iterator<Entry<ParameterDescriptor, MappableComponentInterface>> iterator = inputParameterDescriptors
			.iterator();
		boolean privateCalculation = false;
		while (iterator.hasNext()) {
			Entry<ParameterDescriptor, MappableComponentInterface> entry;
			entry = iterator.next();
			ParameterDescriptor parameterDescriptor = entry.getKey();
			MappableComponentInterface mappableComponentInterface = entry.getValue();

			// verify common quantity
			Quantity pDQuantity = parameterDescriptor.getQuantity();
			Quantity mCIQuantity = null;

			try {
				mCIQuantity = mappableComponentInterface.getQuantity();
			} catch (NoValueFoundException e) {
				// Do nothing
			} 
			if (!pDQuantity.equals(mCIQuantity)) {
				throw new UncompatibleQuantityInMappingException();
			}

			if (mappableComponentInterface instanceof Parameter) {
				if (!privateCalculation) {
					// First mapping to parameter in calculation; set component
					privateCalculation = true;
					component = ((Parameter) mappableComponentInterface).getParentComponent();
				} else {
					if (!component.equals(((Parameter) mappableComponentInterface).getParentComponent())) {
						throw new MappingErrorException();
					}
				}
			}
		}

		/**
		 * Check outputParameterMapping. If the calculation is a private calculation, all mappings must be with
		 * parameters. All parameters must have the same ParentComponent as the parameters in the inputParameterMapping.
		 * If the calculation is not a private calculation, all mappings must be with interfaces
		 */
		boolean outputDescriptorMappingContainsInterfaces = false;
		EMap<ParameterDescriptor, MappableComponentInterface> outputParameterDescriptors = parameterMapping
			.getOutputMappables();
		if (sizeOutputParameterDescriptor != outputParameterDescriptors.size()) {
			throw new MappingErrorException();
		}
		iterator = outputParameterDescriptors.iterator();
		while (iterator.hasNext()) {
			Entry<ParameterDescriptor, MappableComponentInterface> entry;
			entry = iterator.next();
			ParameterDescriptor parameterDescriptor = entry.getKey();
			MappableComponentInterface mappableComponentInterface = entry.getValue();

			// verify common quantity
			Quantity pDQuantity = parameterDescriptor.getQuantity();
			Quantity mCIQuantity = null;

			try {
				mCIQuantity = mappableComponentInterface.getQuantity();
			} catch (NoValueFoundException e) {
				// Do nothing
			}
			
			if (!pDQuantity.equals(mCIQuantity)) {
				throw new UncompatibleQuantityInMappingException();
			}

			if (!(mappableComponentInterface instanceof Parameter)) {
				outputDescriptorMappingContainsInterfaces = true;
				if (privateCalculation) {
					// No interfaces are allowed in the outputParameterMapping for private Calculations
					throw new MappingErrorException();
				}
			} else {
				if (outputDescriptorMappingContainsInterfaces) {
					throw new MappingErrorException();
				}
				if (!privateCalculation) {
					// First mapping to parameter in calculation; set component
					privateCalculation = true;
					component = ((Parameter) mappableComponentInterface).getParentComponent();
				} else {
					if (!component.equals(((Parameter) mappableComponentInterface).getParentComponent())) {
						throw new MappingErrorException();
					}
				}
			}
		}
	}
}
