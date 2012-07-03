/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.util;

import java.util.Map;

import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.calculation.*;
import net.bhl.cdt.model.calculation.AbstractNode;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationGraph;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.CalculationSetNode;
import net.bhl.cdt.model.calculation.Condition;
import net.bhl.cdt.model.calculation.ConditionalNode;
import net.bhl.cdt.model.calculation.ControlNode;
import net.bhl.cdt.model.calculation.IterationNode;
import net.bhl.cdt.model.calculation.Node;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.model.calculation.StartSet;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;

import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see net.bhl.cdt.model.calculation.CalculationPackage
 * @generated
 */
public class CalculationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static CalculationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationSwitch() {
		if (modelPackage == null) {
			modelPackage = CalculationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CalculationPackage.CALCULATION_SET: {
				CalculationSet calculationSet = (CalculationSet)theEObject;
				T result = caseCalculationSet(calculationSet);
				if (result == null) result = caseElement(calculationSet);
				if (result == null) result = caseExchangeElement(calculationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.CALCULATION: {
				Calculation calculation = (Calculation)theEObject;
				T result = caseCalculation(calculation);
				if (result == null) result = caseElement(calculation);
				if (result == null) result = caseExchangeElement(calculation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.PARAMETER_MAPPING: {
				ParameterMapping parameterMapping = (ParameterMapping)theEObject;
				T result = caseParameterMapping(parameterMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.CALCULATION_GRAPH: {
				CalculationGraph calculationGraph = (CalculationGraph)theEObject;
				T result = caseCalculationGraph(calculationGraph);
				if (result == null) result = caseElement(calculationGraph);
				if (result == null) result = caseExchangeElement(calculationGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.ABSTRACT_NODE: {
				AbstractNode abstractNode = (AbstractNode)theEObject;
				T result = caseAbstractNode(abstractNode);
				if (result == null) result = caseElement(abstractNode);
				if (result == null) result = caseExchangeElement(abstractNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseAbstractNode(node);
				if (result == null) result = caseElement(node);
				if (result == null) result = caseExchangeElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.CONTROL_NODE: {
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseAbstractNode(controlNode);
				if (result == null) result = caseElement(controlNode);
				if (result == null) result = caseExchangeElement(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseElement(condition);
				if (result == null) result = caseExchangeElement(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.ITERATION_NODE: {
				IterationNode iterationNode = (IterationNode)theEObject;
				T result = caseIterationNode(iterationNode);
				if (result == null) result = caseControlNode(iterationNode);
				if (result == null) result = caseAbstractNode(iterationNode);
				if (result == null) result = caseElement(iterationNode);
				if (result == null) result = caseExchangeElement(iterationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.CONDITIONAL_NODE: {
				ConditionalNode conditionalNode = (ConditionalNode)theEObject;
				T result = caseConditionalNode(conditionalNode);
				if (result == null) result = caseControlNode(conditionalNode);
				if (result == null) result = caseAbstractNode(conditionalNode);
				if (result == null) result = caseElement(conditionalNode);
				if (result == null) result = caseExchangeElement(conditionalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.START_SET: {
				StartSet startSet = (StartSet)theEObject;
				T result = caseStartSet(startSet);
				if (result == null) result = caseElement(startSet);
				if (result == null) result = caseExchangeElement(startSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<ParameterDescriptor, MappableComponentInterface> parameterDescriptorToMappableComponentInterfaceMap = (Map.Entry<ParameterDescriptor, MappableComponentInterface>)theEObject;
				T result = caseParameterDescriptorToMappableComponentInterfaceMap(parameterDescriptorToMappableComponentInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalculationPackage.CALCULATION_SET_NODE: {
				CalculationSetNode calculationSetNode = (CalculationSetNode)theEObject;
				T result = caseCalculationSetNode(calculationSetNode);
				if (result == null) result = caseAbstractNode(calculationSetNode);
				if (result == null) result = caseElement(calculationSetNode);
				if (result == null) result = caseExchangeElement(calculationSetNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculationSet(CalculationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculation(Calculation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Mapping</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterMapping(ParameterMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculationGraph(CalculationGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNode(AbstractNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Node</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationNode(IterationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Node</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalNode(ConditionalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartSet(StartSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Descriptor To Mappable Component Interface Map</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Descriptor To Mappable Component Interface Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDescriptorToMappableComponentInterfaceMap(
		Map.Entry<ParameterDescriptor, MappableComponentInterface> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Node</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculationSetNode(CalculationSetNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeElement(ExchangeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // CalculationSwitch
