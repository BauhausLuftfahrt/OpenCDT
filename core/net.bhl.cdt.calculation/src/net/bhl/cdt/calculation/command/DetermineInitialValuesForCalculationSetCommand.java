/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.command;

import java.util.Map.Entry;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.architecturetools.AltitudeInterface;
import net.bhl.cdt.model.architecturetools.CoefficientInterface;
import net.bhl.cdt.model.architecturetools.Massive;
import net.bhl.cdt.model.architecturetools.PowerConsumer;
import net.bhl.cdt.model.architecturetools.RangeInterface;
import net.bhl.cdt.model.architecturetools.ReferenceAreaInterface;
import net.bhl.cdt.model.architecturetools.SFCInterface;
import net.bhl.cdt.model.architecturetools.WettedAreaInterface;
import net.bhl.cdt.model.architecturetools.exceptions.UnsupportedInterfaceClass;
import net.bhl.cdt.model.calculation.AbstractNode;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationGraph;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.CalculationSetNode;
import net.bhl.cdt.model.calculation.IterationNode;
import net.bhl.cdt.model.calculation.Node;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.datatypes.DataType;
import net.bhl.cdt.utilities.datatypes.DatatypesFactory;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

/**
 * Class to determine initial parameters for a specified calculation graph.
 * @author sven.ziemer
 *
 */
public class DetermineInitialValuesForCalculationSetCommand extends CDTCommand {
	private CalculationGraph graph;
	private EMap<ParameterDescriptor, Parameter> initialMappingEntrys;
	private EList<Parameter> initialParameters;
	private EList<Parameter> determinedParameters;

	/**
	 * Constructor for DetermineInitialValuesForCalcuationSetCommand. It receives the calculation set that is to be used
	 * 	 * @param selection the CalculationSet selected by the user
	 */
	public DetermineInitialValuesForCalculationSetCommand(CalculationSet selection) {
		if (selection.getGraphs() != null || (selection.getGraphs().size() != 0)) {
			if (selection.getGraphs().size() == 1) {
				this.graph = selection.getGraphs().get(0);
			} else {
				// two or more graphs available, user has to specify a graph.
			}
		} else {
			// no calculation graph
		}

	}

	/**
	 * Constructor for DetermineInitialValuesForCalcuationSetCommand. It receives the actual calculation graph
	 * @param graph the graph selected by the user
	 */
	public DetermineInitialValuesForCalculationSetCommand(CalculationGraph graph) {
		this.graph = graph;
	}

	@Override
	protected void doRun() {
		initialMappingEntrys = new BasicEMap<ParameterDescriptor, Parameter>();
		initialParameters = new BasicEList<Parameter>();
		determinedParameters = new BasicEList<Parameter>();

		determineInitialParameters(graph);

		// create Values for initial Parameters
		for (Entry<ParameterDescriptor, Parameter> mappingEntry : initialMappingEntrys) {
			System.out.println(mappingEntry.getValue().getName());
			createValues(mappingEntry);
		}
	}

	private void determineInitialParameters(CalculationGraph graph) {
		AbstractNode abstractNode = graph.getFirstNode();
		while (abstractNode != null) {
			if (abstractNode instanceof Node) {
				System.out.println("Calculation: " + ((Node) abstractNode).getCalculation().getName());
				analyseCalculation(((Node) abstractNode).getCalculation());
				abstractNode = ((Node) abstractNode).getNextNode();
			} else if (abstractNode instanceof IterationNode) {
				// do nothing, go to next node
				abstractNode = ((IterationNode) abstractNode).getNextTrue();
			} else if (abstractNode instanceof CalculationSetNode) {
				System.out.println("CalculationSet: "
					+ ((CalculationSetNode) abstractNode).getCalculationSet().getName());
				determineInitialParameters(((CalculationSetNode) abstractNode).getCalculationSet().getGraphs().get(0));
				abstractNode = ((CalculationSetNode) abstractNode).getNextNode();
			}
		}
		System.out.println();
	}

	private void analyseCalculation(Calculation calculation) {

		ParameterMapping parameterMapping = calculation.getParameterMapping();
		for (Entry<ParameterDescriptor, MappableComponentInterface> inputMapping : parameterMapping.getInputMappables()) {
			MappableComponentInterface mappableComponentInterface = inputMapping.getValue();
			Parameter parameter = getParameter(mappableComponentInterface);
			if (!determinedParameters.contains(parameter)) {
				if (!initialParameters.contains(parameter)) {
					initialParameters.add(parameter);
					initialMappingEntrys.put(inputMapping.getKey(), parameter);
				}
			}
		}

		for (MappableComponentInterface mappableComponentInterface : parameterMapping.getOutputMappables().values()) {
			Parameter parameter = getParameter(mappableComponentInterface);
			if (!determinedParameters.contains(parameter)) {
				determinedParameters.add(parameter);
			} else {
				// Parameter is overdetermined.
			}
		}
	}

	private Parameter getParameter(MappableComponentInterface mappableComponentInterface) {
		// TODO: Refactor
		if (mappableComponentInterface instanceof Parameter) {
			return (Parameter) mappableComponentInterface;
		} else if (mappableComponentInterface instanceof AltitudeInterface) {
			return ((AltitudeInterface) mappableComponentInterface).getAltitudeParameter();
		} else if (mappableComponentInterface instanceof CoefficientInterface) {
			return ((CoefficientInterface) mappableComponentInterface).getCoefficientParameter();
		} else if (mappableComponentInterface instanceof Massive) {
			return ((Massive) mappableComponentInterface).getMassParameter();
		} else if (mappableComponentInterface instanceof PowerConsumer) {
			return ((PowerConsumer) mappableComponentInterface).getPowerParameter();
		} else if (mappableComponentInterface instanceof RangeInterface) {
			return ((RangeInterface) mappableComponentInterface).getRangeParameter();
		} else if (mappableComponentInterface instanceof ReferenceAreaInterface) {
			return ((ReferenceAreaInterface) mappableComponentInterface).getReferenceAreaParameter();
		} else if (mappableComponentInterface instanceof SFCInterface) {
			return ((SFCInterface) mappableComponentInterface).getSfcParameter();
		} else if (mappableComponentInterface instanceof WettedAreaInterface) {
			return ((WettedAreaInterface) mappableComponentInterface).getWettedAreaParameter();
		} else {
			// unknown interface, throw exception
			throw new UnsupportedInterfaceClass();
		}
	}

	private void createValues(Entry<ParameterDescriptor, Parameter> mappingEntry) {
		Value value = ModelFactory.eINSTANCE.createValue();
		Parameter parameter = mappingEntry.getValue();

		value.setUnit(mappingEntry.getKey().getUnit());

		parameter.getValues().add(value);
		EClass dataTypeClass = mappingEntry.getKey().getDataType();
		if (dataTypeClass != null) {
			DataType dataType = (DataType) DatatypesFactory.eINSTANCE.create(dataTypeClass);
			value.getDatatypes().add(dataType);
		} else {
			// Functions dataType not correctly registered
			// throw new net.bhl.cdt.calculationrepository.exceptions.ScilabFunctionError () ;
			DataType dataType = DatatypesFactory.eINSTANCE.createMeasuredValue();
			if (parameter.getName() != null) {
				dataType.setName(parameter.getName());
			}
			value.getDatatypes().add(dataType);
		}

	}
}
