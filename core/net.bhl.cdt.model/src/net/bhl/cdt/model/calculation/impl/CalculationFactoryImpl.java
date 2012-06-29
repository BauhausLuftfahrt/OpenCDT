/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import java.util.Map;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationFactory;
import net.bhl.cdt.model.calculation.CalculationGraph;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.CalculationSetNode;
import net.bhl.cdt.model.calculation.Condition;
import net.bhl.cdt.model.calculation.ConditionalNode;
import net.bhl.cdt.model.calculation.IterationNode;
import net.bhl.cdt.model.calculation.Node;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.model.calculation.StartSet;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class CalculationFactoryImpl extends EFactoryImpl implements CalculationFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CalculationFactory init() {
		try {
			CalculationFactory theCalculationFactory = (CalculationFactory) EPackage.Registry.INSTANCE
				.getEFactory("http://bhl.net/cdt/model/calculation"); //$NON-NLS-1$ 
			if (theCalculationFactory != null) {
				return theCalculationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CalculationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalculationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CalculationPackage.CALCULATION_SET:
			return createCalculationSet();
		case CalculationPackage.CALCULATION:
			return createCalculation();
		case CalculationPackage.PARAMETER_MAPPING:
			return createParameterMapping();
		case CalculationPackage.CALCULATION_GRAPH:
			return createCalculationGraph();
		case CalculationPackage.NODE:
			return createNode();
		case CalculationPackage.CONDITION:
			return createCondition();
		case CalculationPackage.ITERATION_NODE:
			return createIterationNode();
		case CalculationPackage.CONDITIONAL_NODE:
			return createConditionalNode();
		case CalculationPackage.START_SET:
			return createStartSet();
		case CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP:
			return (EObject) createParameterDescriptorToMappableComponentInterfaceMap();
		case CalculationPackage.CALCULATION_SET_NODE:
			return createCalculationSetNode();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalculationSet createCalculationSet() {
		CalculationSetImpl calculationSet = new CalculationSetImpl();
		return calculationSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Calculation createCalculation() {
		CalculationImpl calculation = new CalculationImpl();
		return calculation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterMapping createParameterMapping() {
		ParameterMappingImpl parameterMapping = new ParameterMappingImpl();
		return parameterMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalculationGraph createCalculationGraph() {
		CalculationGraphImpl calculationGraph = new CalculationGraphImpl();
		return calculationGraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IterationNode createIterationNode() {
		IterationNodeImpl iterationNode = new IterationNodeImpl();
		return iterationNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConditionalNode createConditionalNode() {
		ConditionalNodeImpl conditionalNode = new ConditionalNodeImpl();
		return conditionalNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StartSet createStartSet() {
		StartSetImpl startSet = new StartSetImpl();
		return startSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<ParameterDescriptor, MappableComponentInterface> createParameterDescriptorToMappableComponentInterfaceMap() {
		ParameterDescriptorToMappableComponentInterfaceMapImpl parameterDescriptorToMappableComponentInterfaceMap = new ParameterDescriptorToMappableComponentInterfaceMapImpl();
		return parameterDescriptorToMappableComponentInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalculationSetNode createCalculationSetNode() {
		CalculationSetNodeImpl calculationSetNode = new CalculationSetNodeImpl();
		return calculationSetNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalculationPackage getCalculationPackage() {
		return (CalculationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CalculationPackage getPackage() {
		return CalculationPackage.eINSTANCE;
	}

} // CalculationFactoryImpl
