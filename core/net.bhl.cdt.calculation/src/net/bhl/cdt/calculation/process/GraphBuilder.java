/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.process;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.calculation.AbstractNode;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationFactory;
import net.bhl.cdt.model.calculation.CalculationGraph;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.Condition;
import net.bhl.cdt.model.calculation.ControlNode;
import net.bhl.cdt.model.calculation.IterationNode;
import net.bhl.cdt.model.calculation.Node;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.model.qualification.Qualifiable;
/**
 * Class for building Calclutation Graphes.
 * This class is currently not in use.
 * @author sven.ziemer
 *
 */
public class GraphBuilder {

	private static final double DEVIATION_VALUE = 0.0001;

	private static final int STANDARD_MAX_ITERATION = 1000;

	private CalculationSet set;

	private CalculationGraph graph;
	private AbstractNode currentNode;

	private int count;

	/**
	 * Constructor for GraphBuilder, reveiving the calculation set for which a graph is to be build.
	 * @param set The calculation set for which a graph is to be build.
	 */
	public GraphBuilder(CalculationSet set) {
		this.set = set;
	}

	/**
	 * Builds the graph for a specified calculation set.
	 * @param set Calculation set for which a graph is to be build.
	 */
	public void run(CalculationSet set) {
		this.set = set;
		run();
	}
/**
 * Builds the graph.
 */
	public void run() {
		clear();
		HashSet<MappableComponentInterface> mappables = extractAllMappableComponents();
		HashSet<MappableComponentInterface> determinedMappables = extractDeterminedMappables(mappables);

		HashSet<Calculation> calculations = new HashSet<Calculation>(set.getCalculations());

		for (Iterator<Calculation> iter = calculations.iterator(); iter.hasNext();) {
			Calculation calc = (Calculation) iter.next();

			// Check if the calculation's inparameters are included in determinedParameters
			if (determinedMappables.containsAll(calc.getParameterMapping().getInputMappables().values())) {

				HashSet<MappableComponentInterface> overdetermined = getOverdetermined(determinedMappables, calc);
				determinedMappables.addAll(calc.getParameterMapping().getOutputMappables().values());
				addToGraph(calc);

				// TODO react on overdetermined
				if (overdetermined.size() > 0) {
					List<Node> nodeList = new ArrayList<Node>();
					for (Iterator<MappableComponentInterface> iterOverdeterminedMappable = overdetermined.iterator(); iterOverdeterminedMappable
						.hasNext();) {
						MappableComponentInterface overdeterminedMappable = iterOverdeterminedMappable.next();

						// Determine if overdeterminedParameter is included in startSet
						// List<Value> startSetValues = graph.getStartSet().getValues();
						boolean feedbackLoopIdentified = false;
						//
						// for (Iterator<Value> iterStartSet = startSetValues.iterator(); iterStartSet.hasNext();) {
						// Value value = iterStartSet.next();
						// if ((Parameter) (value.eContainer()) == overdeterminedParameter) {
						// nodeList.add((Node) graph.getFirstNode());
						// feedbackLoopIdentified = true;
						// break;
						// }
						// }

						// Determine which node set the overdeterminedParameter first
						// if (!feedbackLoopIdentified) {
						AbstractNode tempNode = graph.getFirstNode();
						while (tempNode != null && !feedbackLoopIdentified) {
							if (tempNode instanceof Node) {
								// Test if tempNode sets the overdeterminedParameter
								if (((Node) tempNode).getCalculation().getParameterMapping().getOutputMappables()
									.values().contains(overdeterminedMappable)
									&& ((Node) tempNode).getCalculation() != calc) {
									nodeList.add((Node) tempNode);
									feedbackLoopIdentified = true;
								}
								tempNode = ((Node) tempNode).getNextNode();
							} else if (tempNode instanceof ControlNode) {
								tempNode = ((ControlNode) tempNode).getNextTrue();
							}
						}
						if (!feedbackLoopIdentified) {
							nodeList.add((Node) graph.getFirstNode());

						}
						// }
						addIterationNodeToGraph(overdetermined, nodeList);
					}
				}
				iter.remove();
				iter = calculations.iterator();
			}
		}

	}

	private IterationNode addIterationNodeToGraph(HashSet<MappableComponentInterface> overdetermined,
		List<Node> nodeList) {
		// TODO Auto-generated method stub
		if (graph == null) {
			graph = CalculationFactory.eINSTANCE.createCalculationGraph();
			set.getGraphs().add(graph);
		}

		IterationNode node = CalculationFactory.eINSTANCE.createIterationNode();
		node.setName("" + count++);

		if (currentNode == null) {
			graph.setFirstNode(node);
		} else {
			// TODO control nodes etc
			if (currentNode instanceof Node) {
				((Node) currentNode).setNextNode(node);
			} else if (currentNode instanceof ControlNode) {
				((ControlNode) currentNode).setNextTrue(node);
			}
		}
		currentNode = node;

		// Set up IterationNode

		// TODO: current algorithm handels only the feedbackloop for the first detected overdetermined parameter
		node.setNextFalse(nodeList.get(0));
		Iterator<MappableComponentInterface> iteratorOverdeterminedMappable = overdetermined.iterator();
		while (iteratorOverdeterminedMappable.hasNext()) {
			MappableComponentInterface mappableOfInterest = iteratorOverdeterminedMappable.next();
			Condition condition = CalculationFactory.eINSTANCE.createCondition();
			node.getCondition().add(condition);
			condition.setMappableComponentOfInterest(mappableOfInterest);
			condition.setValue(DEVIATION_VALUE);
		}
		node.setMaxIteration(STANDARD_MAX_ITERATION);
		return node;
	}

	private HashSet<MappableComponentInterface> getOverdetermined(
		HashSet<MappableComponentInterface> determinedMappables, Calculation calc) {
		HashSet<MappableComponentInterface> result = new HashSet<MappableComponentInterface>();
		for (MappableComponentInterface mappable : calc.getParameterMapping().getOutputMappables().values()) {
			if (determinedMappables.contains(mappable)) {
				result.add(mappable);
			}
		}
		return result;
	}

	private void clear() {
		graph = null;
		currentNode = null;
		count = 0;
	}

	private void addToGraph(Calculation calc) {
		if (graph == null) {
			graph = CalculationFactory.eINSTANCE.createCalculationGraph();
			set.getGraphs().add(graph);
		}

		Node node = CalculationFactory.eINSTANCE.createNode();
		node.setCalculation(calc);
		node.setName("" + count++);
		graph.getNodes().add(node);

		if (currentNode == null) {
			graph.setFirstNode(node);
		} else {
			// TODO control nodes etc
			((Node) currentNode).setNextNode(node);
		}
		currentNode = node;
	}

	private HashSet<MappableComponentInterface> extractDeterminedMappables(HashSet<MappableComponentInterface> mappables) {
		HashSet<MappableComponentInterface> result = new HashSet<MappableComponentInterface>();

		for (MappableComponentInterface mappable : mappables) {
			Value value = mappable.getValue();
			if (!isQualified(value)) {
				result.add(mappable);
				break;
			}
		}
		return result;
	}

	// we could use a caching mechanism
	private boolean isQualified(Value value) {
		for (CalculationSpaceQualifier qa : set.getSpaceQualifiers()) {
			for (Qualifiable element : qa.getQualifies()) {
				if (element.equals(value)) {
					return true;
				}
			}
		}
		return false;
	}

	private HashSet<MappableComponentInterface> extractAllMappableComponents() {
		HashSet<MappableComponentInterface> mappables = new HashSet<MappableComponentInterface>();
		for (Calculation calc : set.getCalculations()) {
			// ignore value mapping for now
			mappables.addAll(calc.getParameterMapping().getInputMappables().values());
			mappables.addAll(calc.getParameterMapping().getOutputMappables().values());
		}
		return mappables;
	}
}
