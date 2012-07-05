/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter Mapping</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.calculation.impl.ParameterMappingImpl#getInputValues <em>Input Values</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.impl.ParameterMappingImpl#getOutputValues <em>Output Values</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.impl.ParameterMappingImpl#getInputParameters <em>Input Parameters</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.impl.ParameterMappingImpl#getOutputParameters <em>Output Parameters</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ParameterMappingImpl extends EObjectImpl implements ParameterMapping {
	/**
	 * The cached value of the '{@link #getInputMappables() <em>Input Mappables</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getInputMappables()
	 * @generated
	 * @ordered
	 */
	protected EMap<ParameterDescriptor, MappableComponentInterface> inputMappables;

	/**
	 * The cached value of the '{@link #getOutputMappables() <em>Output Mappables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMappables()
	 * @generated
	 * @ordered
	 */
	protected EMap<ParameterDescriptor, MappableComponentInterface> outputMappables;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculationPackage.Literals.PARAMETER_MAPPING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<ParameterDescriptor, MappableComponentInterface> getInputMappables() {
		if (inputMappables == null) {
			inputMappables = new EcoreEMap<ParameterDescriptor,MappableComponentInterface>(CalculationPackage.Literals.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP, ParameterDescriptorToMappableComponentInterfaceMapImpl.class, this, CalculationPackage.PARAMETER_MAPPING__INPUT_MAPPABLES);
		}
		return inputMappables;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<ParameterDescriptor, MappableComponentInterface> getOutputMappables() {
		if (outputMappables == null) {
			outputMappables = new EcoreEMap<ParameterDescriptor,MappableComponentInterface>(CalculationPackage.Literals.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP, ParameterDescriptorToMappableComponentInterfaceMapImpl.class, this, CalculationPackage.PARAMETER_MAPPING__OUTPUT_MAPPABLES);
		}
		return outputMappables;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculationPackage.PARAMETER_MAPPING__INPUT_MAPPABLES:
				return ((InternalEList<?>)getInputMappables()).basicRemove(otherEnd, msgs);
			case CalculationPackage.PARAMETER_MAPPING__OUTPUT_MAPPABLES:
				return ((InternalEList<?>)getOutputMappables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CalculationPackage.PARAMETER_MAPPING__INPUT_MAPPABLES:
				if (coreType) return getInputMappables();
				else return getInputMappables().map();
			case CalculationPackage.PARAMETER_MAPPING__OUTPUT_MAPPABLES:
				if (coreType) return getOutputMappables();
				else return getOutputMappables().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CalculationPackage.PARAMETER_MAPPING__INPUT_MAPPABLES:
				((EStructuralFeature.Setting)getInputMappables()).set(newValue);
				return;
			case CalculationPackage.PARAMETER_MAPPING__OUTPUT_MAPPABLES:
				((EStructuralFeature.Setting)getOutputMappables()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CalculationPackage.PARAMETER_MAPPING__INPUT_MAPPABLES:
				getInputMappables().clear();
				return;
			case CalculationPackage.PARAMETER_MAPPING__OUTPUT_MAPPABLES:
				getOutputMappables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CalculationPackage.PARAMETER_MAPPING__INPUT_MAPPABLES:
				return inputMappables != null && !inputMappables.isEmpty();
			case CalculationPackage.PARAMETER_MAPPING__OUTPUT_MAPPABLES:
				return outputMappables != null && !outputMappables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ParameterMappingImpl
