/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.calculation.AbstractNode;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationGraph;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.CalculationSetNode;
import net.bhl.cdt.model.calculation.Condition;
import net.bhl.cdt.model.calculation.IterationNode;
import net.bhl.cdt.model.calculation.Node;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.model.qualification.CalculationSpace;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.model.qualification.Qualifiable;
import net.bhl.cdt.model.qualification.QualificationFactory;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;
import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.emf.emfstore.server.model.ProjectId;

/**
 * Executes the {@link CalculationGraph} or a single {@link Calculation}.
 * 
 * @author Otto von Wesendonk
 * @author Florian Penn
 * @author Sven Ziemer
 * @author Martin Glas
 */

public class CalculationCommand extends CDTCommand {

	private Calculation calculation;
	private CalculationGraph graph;
	private CalculationRepositoryManager manager;
	private CalculationSpace calcSpace;
	private boolean feedbackLoop;
	//private StartSet startSet;
	private ProjectId projectId;

	/**
	 * Constructor for {@link Calculation}.
	 * 
	 * @param calculation input
	 */
	public CalculationCommand(Calculation calculation) {
		nullCheck(calculation);
		this.calculation = calculation;
		this.projectId = UtilitiesHelper.getProjectId(calculation);

		init();
	}

	/**
	 * Constructor for {@link CalculationGraph}.
	 * 
	 * @param graph input
	 */
	public CalculationCommand(CalculationGraph graph) {
		nullCheck(graph);
		this.graph = graph;
		this.projectId = UtilitiesHelper.getProjectId(graph);

		init();
	}

	private void init() {
		manager = CalculationRepositoryManager.getInstance();
		manager.reloadRepository();
		feedbackLoop = false;
	}

	/**
	 * {@inheritDoc}
	 */
	public void doRun() {
		if (graph != null) {
			// Check if the calculationset containing the graph is calculable
			CalculationSet calcSet = (CalculationSet) graph.eContainer();

			calcSpace = graph.getCalculationSpace();
			if (calcSpace == null) {
				throw new CDTRuntimeException("Couldn't find calculation space.");
			}

			CalculationSpaceQualifier calcSpaceQualifier = QualificationFactory.eINSTANCE
				.createCalculationSpaceQualifier();
			calcSpaceQualifier.setName(calcSet.getName());
			calcSpace.getSpaceQualifier().add(calcSpaceQualifier);
			if (calcSet.isCalculable(calcSpaceQualifier)) {
				// Create new spaceQualifyer in the CalculationSpace

				runGraph(graph, calcSpaceQualifier);
			}
		} else if (calculation != null) {
			runCalculation(calculation, null);
		} else {
			throw new CDTRuntimeException("Invalid command execution.");
		}
	}

	private void runCalculation(Calculation calculation, CalculationSpaceQualifier calcSpaceQualifier) {
		// Check if a calculation exists
		nullCheck("Calculation is null.", calculation);

		// Retrieve Function
		String functionID = calculation.getFunctionID();
		nullCheck("No Function ID set.", functionID);

		CalculationRepositoryManager.getInstance().reloadRepository();

		Function function = manager.getFunction(projectId, functionID);
		nullCheck("Function '" + functionID + "' not found.", function);

		// Retrieve calculation mapping
		ParameterMapping mapping = calculation.getParameterMapping();

		// Execute calculation
		List<MeasuredValue> result = function.execute(getInput(mapping, calcSpaceQualifier));

		// Store results
		integrateOutput(result, mapping, calcSpaceQualifier);

		// TODO qualifying
	}
/**
 * Returns the MeasuredValues of all mapped parameters for a calculation in a specified calculation space.
 * @param mapping the parameter mapping for a calculation
 * @param calcSpaceQualifier the calculation space that the calculation command is performed within
 * @return List of measured values
 */
	private List<MeasuredValue> getInput(ParameterMapping mapping, CalculationSpaceQualifier calcSpaceQualifier) {
		if (mapping == null) {
			throw new CDTRuntimeException("Calculation has no mapping.");
		}

		ArrayList<MeasuredValue> result = new ArrayList<MeasuredValue>();
		if (mapping.getInputMappables().size() == 0) {
			// This case is not in use currently
		} else {
			int index = 0;
			int size = mapping.getInputMappables().values().size();
			while (index < size) {
				MappableComponentInterface mappable = mapping.getInputMappables().get(index).getValue();
				result.add(ModelHelper.valueToEx(mappable.getValue(calcSpaceQualifier)));
				index += 1;
			}
		}

		return result;
	}

	/**
	 * Integrates the results from a calculation into the openCDT model.
	 * @param result a list of measrued values
	 * @param mapping the parameter mapping for a calculation
	 * @param calcSpaceQualifier the calculation space that contains the result from a calculation
	 */
	private void integrateOutput(List<MeasuredValue> result, ParameterMapping mapping,
	// TODO intelligent parameter value mapping
		CalculationSpaceQualifier calcSpaceQualifier) {
		if (mapping.getOutputMappables().size() == 0) {
			// This option is not in use  currenlty
		} else {
			Iterator<MappableComponentInterface> iterator = mapping.getOutputMappables().values().iterator();
			int i = -1;
			while (iterator.hasNext()) {
				i++;
				MappableComponentInterface mappable = iterator.next();
				Value value = ModelHelper.exToValue(result.get(i));
				mappable.setValue(value);
				if (calcSpaceQualifier != null) {
					calcSpaceQualifier.getQualifies().add(value);
				}
			}
		}
	}

	
	/**
	 * A calculation graph is traversed for the execution of a calculation set.
	 * @param graph the calculation graph to be executed
	 * @param calcSpaceQualifier the calculation space in which the calculation takes place
	 */
	private void runGraph(CalculationGraph graph, CalculationSpaceQualifier calcSpaceQualifier) {
		Integer iterations = 0;

		nullCheck("The graph is empty.", graph.getFirstNode());

		// TODO Create start set -- this option is not in use currently
		// startSet = CalculationFactory.eINSTANCE.createStartSet();
		//
		// // get starting values from graph, copy values into calculation space and initialize Start Set
		// List<Value> startValues = new ArrayList<Value>();
		// startValues = graph.getStartValues();
		// Iterator<Value> iterator = startValues.iterator();
		// while (iterator.hasNext()) {
		// Value value = iterator.next();
		// Value startValue = (Value) EcoreUtil.copy(value);
		// startValue.setName("StartSet: " + calcSet.getName());
		// startSet.getValues().add(startValue);
		// Parameter containingParameter = (Parameter) value.eContainer();
		// containingParameter.getValues().add(startValue);
		// calcSpaceQualifier.getQualifies().add((Qualifiable) startValue);
		// }
		// graph.setStartSet(startSet);

		// Run calculation graph
		AbstractNode currentNode = graph.getFirstNode();
		feedbackLoop = false;
		while (currentNode != null) {
			if (currentNode instanceof Node) {
				runCalculation(((Node) currentNode).getCalculation(), calcSpaceQualifier);
				System.out.println(((Node) currentNode).getCalculation().getName());
				currentNode = ((Node) currentNode).getNextNode();
			} else if (currentNode instanceof CalculationSetNode) {
				CalculationSet subCalcSet = ((CalculationSetNode) currentNode).getCalculationSet();
				System.out.println(((CalculationSetNode) currentNode).getCalculationSet().getName());
				CalculationGraph subGraph = subCalcSet.getGraphs().get(0);
				runGraph(subGraph, calcSpaceQualifier);
				currentNode = ((CalculationSetNode) currentNode).getNextNode();
			} else if (currentNode instanceof IterationNode) {
				// evaluate condition of an interation node
				List<Condition> conditions = ((IterationNode) currentNode).getCondition();
				for (Iterator<Condition> iterCondition = conditions.iterator(); iterCondition.hasNext();) {
					Condition condition = iterCondition.next();
					MappableComponentInterface mappableOfInterest = condition.getMappableComponentOfInterest();
					Value originalValue, overdeterminedValue;

					/* Get the list of values of the parameter of interest in the calculation space qualifier */
					List<Value> values = new ArrayList<Value>();
					for (Iterator<Qualifiable> iteratorQualifiable = calcSpaceQualifier.getQualifies().iterator(); iteratorQualifiable
						.hasNext();) {
						Value value = (Value) iteratorQualifiable.next();
						if (value.eContainer().equals(mappableOfInterest)) {
							values.add(value);
						}
					}

					/* Get last added value */
					originalValue = values.get(values.size() - 2);

					/* Get new added value */
					overdeterminedValue = values.get(values.size() - 1);

					// TODO: current implementation does only support a single parameter of interest
					// Deviation is only tested for Double

					if (originalValue.getDatatypes().get(0) instanceof MeasuredValue) {
						if (deviation((MeasuredValue) originalValue.getDatatypes().get(0),
							(MeasuredValue) overdeterminedValue.getDatatypes().get(0), condition.getValue())) {
							feedbackLoop = true;
							iterations++;
						} else {
							feedbackLoop = false;
							iterations = 0;
						}
						System.out.println("Feedbackloop: " + feedbackLoop + ". OriginalValue: "
							+ ((MeasuredValue) originalValue.getDatatypes().get(0)).getValue()
							+ ", OverdeterminedValue: "
							+ ((MeasuredValue) overdeterminedValue.getDatatypes().get(0)).getValue() + ". Iterations"
							+ iterations);
					}
				}
				if (feedbackLoop) {
					// Current node is iteration node. Update iteration count and set next nodeTODO something
					if (iterations <= ((IterationNode) currentNode).getMaxIteration()) {
						currentNode = ((IterationNode) currentNode).getNextFalse();
					} else {
						currentNode = ((IterationNode) currentNode).getNextTrue();
					}
				} else {
					currentNode = ((IterationNode) currentNode).getNextTrue();
				}
			}
		}
	}

//	/**
//	 * Method not in use currently
//	 * Removes all the temporary calculated values from the model.
//	 * 
//	 * @param calcSpaceQualifier The calculation space Qualifier that contains the calculated values
//	 */
//
//	private void cleanUpCalcSpace(CalculationSpaceQualifier calcSpaceQualifier) {
//
//		/* Create list of all parameters whose values were calculated */
//		List<Parameter> allOutputParameters = new ArrayList<Parameter>();
//		for (Qualifiable q : calcSpaceQualifier.getQualifies()) {
//			if (!allOutputParameters.contains(((Value) q).eContainer())) {
//				allOutputParameters.add((Parameter) ((Value) q).eContainer());
//			}
//		}
//
//		/* For every parameter create a list of associated values created in this calculation */
//		for (Parameter param : allOutputParameters) {
//			List<Value> values = new ArrayList<Value>();
//			for (Iterator<Qualifiable> iteratorQualifiable = calcSpaceQualifier.getQualifies().iterator(); iteratorQualifiable
//				.hasNext();) {
//				Value value = (Value) iteratorQualifiable.next();
//				// if (value.eContainer() == null) {
//				// System.out.println();
//				// }
//				if (param.equals(value.eContainer())) {
//					values.add(value);
//				}
//			}
//			/* Identify the last calculated value */
//			Value lastValue = values.get(values.size() - 1);
//
//			/* Delete all values except the last and from the start set */
//			for (Value v : values) {
//				if (v != lastValue && !startSet.getValues().contains(v)) {
//					param.getValues().remove(v);
//				}
//			}
//		}
//	}

	/**
	 * Calculates whether the difference of the two values is within the allowed limit.
	 * 
	 * @param originalValue The original value
	 * @param overdeterminedValue The new value
	 * @param value percental limit
	 * @return true if the difference of the two values is not within the allow limit, false if within the limit
	 */
	private boolean deviation(MeasuredValue originalValue, MeasuredValue overdeterminedValue, double value) {
		return Math.abs(originalValue.getValue() - overdeterminedValue.getValue()) > value * originalValue.getValue();
	}
}
