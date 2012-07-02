/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.calculation.AbstractNode;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationGraph;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.CalculationSetNode;
import net.bhl.cdt.model.calculation.ConditionalNode;
import net.bhl.cdt.model.calculation.IterationNode;
import net.bhl.cdt.model.calculation.Node;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.model.exceptions.MappableValueErrorException;
import net.bhl.cdt.model.impl.ElementImpl;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.calculation.impl.CalculationSetImpl#getCalculations <em>Calculations</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.impl.CalculationSetImpl#getGraphs <em>Graphs</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.impl.CalculationSetImpl#getSpaceQualifiers <em>Space Qualifiers</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.impl.CalculationSetImpl#getSubCalculationSet <em>Sub Calculation Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CalculationSetImpl extends ElementImpl implements CalculationSet {
	/**
	 * The cached value of the '{@link #getCalculations() <em>Calculations</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCalculations()
	 * @generated
	 * @ordered
	 */
	protected EList<Calculation> calculations;
	/**
	 * The cached value of the '{@link #getGraphs() <em>Graphs</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getGraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<CalculationGraph> graphs;

	/**
	 * The cached value of the '{@link #getSpaceQualifiers() <em>Space Qualifiers</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSpaceQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CalculationSpaceQualifier> spaceQualifiers;

	/**
	 * The cached value of the '{@link #getSubCalculationSet() <em>Sub Calculation Set</em>}' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubCalculationSet()
	 * @generated
	 * @ordered
	 */
	protected EList<CalculationSet> subCalculationSet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CalculationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculationPackage.Literals.CALCULATION_SET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Calculation> getCalculations() {
		if (calculations == null) {
			calculations = new EObjectContainmentEList.Resolving<Calculation>(Calculation.class, this,
				CalculationPackage.CALCULATION_SET__CALCULATIONS);
		}
		return calculations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CalculationGraph> getGraphs() {
		if (graphs == null) {
			graphs = new EObjectContainmentEList.Resolving<CalculationGraph>(CalculationGraph.class, this,
				CalculationPackage.CALCULATION_SET__GRAPHS);
		}
		return graphs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CalculationSpaceQualifier> getSpaceQualifiers() {
		if (spaceQualifiers == null) {
			spaceQualifiers = new EObjectResolvingEList<CalculationSpaceQualifier>(CalculationSpaceQualifier.class,
				this, CalculationPackage.CALCULATION_SET__SPACE_QUALIFIERS);
		}
		return spaceQualifiers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CalculationSet> getSubCalculationSet() {
		if (subCalculationSet == null) {
			subCalculationSet = new EObjectContainmentEList.Resolving<CalculationSet>(CalculationSet.class, this,
				CalculationPackage.CALCULATION_SET__SUB_CALCULATION_SET);
		}
		return subCalculationSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param calcSpaceQualifier the calculationSpace where the results of an calculation are stored.
	 * @return If this calculation set is calculable, this method returns true
	 * @generated NOT
	 */
	public boolean isCalculable(CalculationSpaceQualifier calcSpaceQualifier) {
		// is no graph there, than nothing is calculable
		if (getGraphs().size() == 0) {
			return false;
		}
		// TODO: Select first graph by default; but what if user has selected a graph?
		CalculationGraph calculationGraph = getGraphs().get(0);

		List<MappableComponentInterface> outputMappables = new ArrayList<MappableComponentInterface>();

		// return checkNode(calculationGraph.getFirstNode(), outputMappables);
		return checkGraph(calculationGraph, outputMappables, calcSpaceQualifier);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return If this calculation set is calculable, this method returns true
	 * @generated NOT
	 */
	public boolean checkGraph(CalculationGraph graph, List<MappableComponentInterface> outputMappables,
		CalculationSpaceQualifier calcSpaceQualifier) {
		// is no g graph there, than nothing is calculable
		boolean calculable = false;
		AbstractNode abstractNode = graph.getFirstNode();

		while (abstractNode != null) {
			if (abstractNode instanceof Node) {
				calculable = checkNode((Node) abstractNode, outputMappables, calcSpaceQualifier);
				abstractNode = ((Node) abstractNode).getNextNode();
			} else if (abstractNode instanceof CalculationSetNode) {
				CalculationGraph subGraph = ((CalculationSetNode) abstractNode).getCalculationSet().getGraphs().get(0);
				calculable = checkGraph(subGraph, outputMappables, calcSpaceQualifier);
				abstractNode = ((CalculationSetNode) abstractNode).getNextNode();
			} else if (abstractNode instanceof IterationNode) {
				abstractNode = ((IterationNode) abstractNode).getNextTrue();
			} else if (abstractNode instanceof ConditionalNode) {

			} else {
				// something is wrong; unknown node tpye
				throw new CDTRuntimeException();
			}
		}

		return calculable;
	}

	/**
	 * @param outputMappables -- List of calculated output mappables
	 * @param node -- The currently checked node
	 */
	private boolean checkNode(Node node, List<MappableComponentInterface> outputMappables,
		CalculationSpaceQualifier calcSpaceQualifier) {
		if (node == null) {
			return false;
		}

		Calculation calculation = node.getCalculation();
		// Does the node wrap a calculation?
		if (calculation == null) {
			return false;
		}
		// Is the calculation mapped?
		if (!calculation.isMapped()) {
			return false;
		}
		ParameterMapping mapping = calculation.getParameterMapping();

		// Iterate over all input parameters of the calculation and check if the parameter has...
		boolean nodedMapped = false;
		Collection<MappableComponentInterface> mappables = mapping.getInputMappables().values();
		for (MappableComponentInterface mappable : mappables) {
			Parameter parameterMappable = null;

			// Determine whether mappable is an initial value, i.e. the referred parameter has a value
			boolean initialValue = false;

			initialValue = mappable.hasValue();

			if (!initialValue) {
				nodedMapped = false;
				// Mappable must be set by prior calculations
				if (mappable instanceof Parameter) {
					parameterMappable = (Parameter) mappable;
				} else {
					parameterMappable = mappable.getParameter();
				}
				if (outputMappables.contains(parameterMappable)) {
					// Everything ok
					nodedMapped = true;
				} else {
					// Mappable is neither initial value or set by prior calculation
					nodedMapped = false;
					return nodedMapped;
				}
			} else {
				// Initial values are registered in calculation space
				Value value = mappable.getValue();
				calcSpaceQualifier.getQualifies().add(value);

			}
		}

		// If the calculation is executeable, add all their output parameter to the output parameter list, get the
		// next node and check this again if there is one.
		// outputMappables contains only parameter
		nodedMapped = true;
		for (MappableComponentInterface mappable : mapping.getOutputMappables().values()) {
			if (mappable instanceof Parameter) {
				outputMappables.add((Parameter) mappable);// All(mapping.getOutputMappables().values());
			} else {
				outputMappables.add((Parameter) mappable.getParameter());
			}
		}

		return nodedMapped;
	}

	/**
	 * @param outputMappables -- List of calculated output mappables
	 * @param node -- The currently checked node
	 */
	@SuppressWarnings("unused")
	private boolean checkNode(AbstractNode node, List<MappableComponentInterface> outputMappables) {
		if (node == null) {
			return false;
		}

		if (node instanceof Node) {
			Calculation calculation = ((Node) node).getCalculation();
			// Does the node wrap a calculation?
			if (calculation == null) {
				return false;
			}
			// Is the calculation mapped?
			if (!calculation.isMapped()) {
				return false;
			}
			ParameterMapping mapping = calculation.getParameterMapping();

			// Loop over all input parameters of the calculation and check if the parameter has...
			boolean nodedMapped = false;
			Collection<MappableComponentInterface> mappables = mapping.getInputMappables().values();
			for (MappableComponentInterface mappable : mappables) {
				Parameter parameterMappable = null;

				// Is mappable an initial value?
				Value value = null;
				boolean initialValue = false;

				if (mappable instanceof Parameter) {
					if (!((Parameter) mappable).getValues().isEmpty()) {
						initialValue = true;
					}
				} else {
					try {
						value = mappable.getValue();
					} catch (MappableValueErrorException e) {
						// TODO:do nothing?
					} catch (Exception e) {
						throw new CDTRuntimeException(e.getMessage());
					}

					if (value != null) {
						// Mappable is initial value
						initialValue = true;
					}
				}

				if (!initialValue) {
					nodedMapped = false;
					// Mappable must be set by prior calculations
					if (mappable instanceof Parameter) {
						parameterMappable = (Parameter) mappable;
					} else {
						parameterMappable = mappable.getParameter();
					}
					if (outputMappables.contains(parameterMappable)) {
						// Everything ok
						nodedMapped = true;
					} else {
						// Mappable is neither initial value or set by prior calculation
						nodedMapped = false;
						return nodedMapped;
					}
				}
				// if (parameterMappable.getValue() != null) {
				//
				// continue;
				// }
				// // ... or the list of output parameters of the before executed calculations contains a fitting
				// // parameter.
				// if (outputMappables.contains(parameterMappable)) {
				// continue;
				// }
				// return false;
			}

			// If the calculation is executeable, add all their output parameter to the output parameter list, get the
			// next node and check this again if there is one.

			// outputMappables contains only parameter
			for (MappableComponentInterface mappable : mapping.getOutputMappables().values()) {
				if (mappable instanceof Parameter) {
					outputMappables.add((Parameter) mappable);// All(mapping.getOutputMappables().values());
				} else {
					outputMappables.add((Parameter) mappable.getParameter());
				}
			}
			AbstractNode nextNode = ((Node) node).getNextNode();
			return (nextNode == null ? true : checkNode(nextNode, outputMappables));
		} else if (node instanceof IterationNode) {
			return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CalculationPackage.CALCULATION_SET__CALCULATIONS:
			return ((InternalEList<?>) getCalculations()).basicRemove(otherEnd, msgs);
		case CalculationPackage.CALCULATION_SET__GRAPHS:
			return ((InternalEList<?>) getGraphs()).basicRemove(otherEnd, msgs);
		case CalculationPackage.CALCULATION_SET__SUB_CALCULATION_SET:
			return ((InternalEList<?>) getSubCalculationSet()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CalculationPackage.CALCULATION_SET__CALCULATIONS:
			return getCalculations();
		case CalculationPackage.CALCULATION_SET__GRAPHS:
			return getGraphs();
		case CalculationPackage.CALCULATION_SET__SPACE_QUALIFIERS:
			return getSpaceQualifiers();
		case CalculationPackage.CALCULATION_SET__SUB_CALCULATION_SET:
			return getSubCalculationSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CalculationPackage.CALCULATION_SET__CALCULATIONS:
			getCalculations().clear();
			getCalculations().addAll((Collection<? extends Calculation>) newValue);
			return;
		case CalculationPackage.CALCULATION_SET__GRAPHS:
			getGraphs().clear();
			getGraphs().addAll((Collection<? extends CalculationGraph>) newValue);
			return;
		case CalculationPackage.CALCULATION_SET__SPACE_QUALIFIERS:
			getSpaceQualifiers().clear();
			getSpaceQualifiers().addAll((Collection<? extends CalculationSpaceQualifier>) newValue);
			return;
		case CalculationPackage.CALCULATION_SET__SUB_CALCULATION_SET:
			getSubCalculationSet().clear();
			getSubCalculationSet().addAll((Collection<? extends CalculationSet>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CalculationPackage.CALCULATION_SET__CALCULATIONS:
			getCalculations().clear();
			return;
		case CalculationPackage.CALCULATION_SET__GRAPHS:
			getGraphs().clear();
			return;
		case CalculationPackage.CALCULATION_SET__SPACE_QUALIFIERS:
			getSpaceQualifiers().clear();
			return;
		case CalculationPackage.CALCULATION_SET__SUB_CALCULATION_SET:
			getSubCalculationSet().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CalculationPackage.CALCULATION_SET__CALCULATIONS:
			return calculations != null && !calculations.isEmpty();
		case CalculationPackage.CALCULATION_SET__GRAPHS:
			return graphs != null && !graphs.isEmpty();
		case CalculationPackage.CALCULATION_SET__SPACE_QUALIFIERS:
			return spaceQualifiers != null && !spaceQualifiers.isEmpty();
		case CalculationPackage.CALCULATION_SET__SUB_CALCULATION_SET:
			return subCalculationSet != null && !subCalculationSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CalculationSetImpl
