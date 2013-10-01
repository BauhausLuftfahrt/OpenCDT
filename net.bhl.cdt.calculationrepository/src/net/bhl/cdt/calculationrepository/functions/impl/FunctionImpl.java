/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.calculationrepository.functions.impl;

import java.util.Collection;
import java.util.List;

import javax.units.Unit;

import net.bhl.cdt.calculationrepository.exceptions.CalculationException;
import net.bhl.cdt.calculationrepository.exceptions.InvalidValueException;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.calculationrepository.functions.FunctionsPackage;
import net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelFactory;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;
import net.bhl.cdt.utilities.units.Quantity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Function</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.impl.FunctionImpl#getFunctionID <em>Function ID</em>}</li>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.impl.FunctionImpl#getInputDescriptors <em>Input Descriptors
 * </em>}</li>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.impl.FunctionImpl#getOutputDescriptors <em>Output Descriptors
 * </em>}</li>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.impl.FunctionImpl#getName <em>Name</em>}</li>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.impl.FunctionImpl#getSynopsis <em>Synopsis</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class FunctionImpl extends EObjectImpl implements Function {
	/**
	 * The default value of the '{@link #getFunctionID() <em>Function ID</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getFunctionID()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionID() <em>Function ID</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getFunctionID()
	 * @generated
	 * @ordered
	 */
	protected String functionID = FUNCTION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputDescriptors() <em>Input Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInputDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDescriptor> inputDescriptors;

	/**
	 * The cached value of the '{@link #getOutputDescriptors() <em>Output Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutputDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDescriptor> outputDescriptors;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSynopsis() <em>Synopsis</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSynopsis()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNOPSIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSynopsis() <em>Synopsis</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSynopsis()
	 * @generated
	 * @ordered
	 */
	protected String synopsis = SYNOPSIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFunctionID() {
		return functionID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFunctionID(String newFunctionID) {
		String oldFunctionID = functionID;
		functionID = newFunctionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION__FUNCTION_ID,
				oldFunctionID, functionID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ParameterDescriptor> getInputDescriptors() {
		if (inputDescriptors == null) {
			inputDescriptors = new EObjectContainmentEList.Resolving<ParameterDescriptor>(ParameterDescriptor.class,
				this, FunctionsPackage.FUNCTION__INPUT_DESCRIPTORS);
		}
		return inputDescriptors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ParameterDescriptor> getOutputDescriptors() {
		if (outputDescriptors == null) {
			outputDescriptors = new EObjectContainmentEList.Resolving<ParameterDescriptor>(ParameterDescriptor.class,
				this, FunctionsPackage.FUNCTION__OUTPUT_DESCRIPTORS);
		}
		return outputDescriptors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSynopsis() {
		return synopsis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSynopsis(String newSynopsis) {
		String oldSynopsis = synopsis;
		synopsis = newSynopsis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION__SYNOPSIS, oldSynopsis,
				synopsis));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FunctionsPackage.FUNCTION__INPUT_DESCRIPTORS:
			return ((InternalEList<?>) getInputDescriptors()).basicRemove(otherEnd, msgs);
		case FunctionsPackage.FUNCTION__OUTPUT_DESCRIPTORS:
			return ((InternalEList<?>) getOutputDescriptors()).basicRemove(otherEnd, msgs);
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
		case FunctionsPackage.FUNCTION__FUNCTION_ID:
			return getFunctionID();
		case FunctionsPackage.FUNCTION__INPUT_DESCRIPTORS:
			return getInputDescriptors();
		case FunctionsPackage.FUNCTION__OUTPUT_DESCRIPTORS:
			return getOutputDescriptors();
		case FunctionsPackage.FUNCTION__NAME:
			return getName();
		case FunctionsPackage.FUNCTION__SYNOPSIS:
			return getSynopsis();
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
		case FunctionsPackage.FUNCTION__FUNCTION_ID:
			setFunctionID((String) newValue);
			return;
		case FunctionsPackage.FUNCTION__INPUT_DESCRIPTORS:
			getInputDescriptors().clear();
			getInputDescriptors().addAll((Collection<? extends ParameterDescriptor>) newValue);
			return;
		case FunctionsPackage.FUNCTION__OUTPUT_DESCRIPTORS:
			getOutputDescriptors().clear();
			getOutputDescriptors().addAll((Collection<? extends ParameterDescriptor>) newValue);
			return;
		case FunctionsPackage.FUNCTION__NAME:
			setName((String) newValue);
			return;
		case FunctionsPackage.FUNCTION__SYNOPSIS:
			setSynopsis((String) newValue);
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
		case FunctionsPackage.FUNCTION__FUNCTION_ID:
			setFunctionID(FUNCTION_ID_EDEFAULT);
			return;
		case FunctionsPackage.FUNCTION__INPUT_DESCRIPTORS:
			getInputDescriptors().clear();
			return;
		case FunctionsPackage.FUNCTION__OUTPUT_DESCRIPTORS:
			getOutputDescriptors().clear();
			return;
		case FunctionsPackage.FUNCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FunctionsPackage.FUNCTION__SYNOPSIS:
			setSynopsis(SYNOPSIS_EDEFAULT);
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
		case FunctionsPackage.FUNCTION__FUNCTION_ID:
			return FUNCTION_ID_EDEFAULT == null ? functionID != null : !FUNCTION_ID_EDEFAULT.equals(functionID);
		case FunctionsPackage.FUNCTION__INPUT_DESCRIPTORS:
			return inputDescriptors != null && !inputDescriptors.isEmpty();
		case FunctionsPackage.FUNCTION__OUTPUT_DESCRIPTORS:
			return outputDescriptors != null && !outputDescriptors.isEmpty();
		case FunctionsPackage.FUNCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FunctionsPackage.FUNCTION__SYNOPSIS:
			return SYNOPSIS_EDEFAULT == null ? synopsis != null : !SYNOPSIS_EDEFAULT.equals(synopsis);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (functionID: ");
		result.append(functionID);
		result.append(", name: ");
		result.append(name);
		result.append(", synopsis: ");
		result.append(synopsis);
		result.append(')');
		return result.toString();
	}

	protected void addOutputDescriptor(String label, Quantity quantity, Unit unit, EClass datatype) {
		if (label == null || quantity == null || unit == null || datatype == null) {
			throw new IllegalArgumentException("An argument is null.");
		}

		ParameterDescriptor param = BasecalculationmodelFactory.eINSTANCE.createParameterDescriptor();
		param.setLabel(label);
		param.setQuantity(quantity);
		param.setUnit(unit);
		param.setDataType(datatype);
		getOutputDescriptors().add(param);
	}

	protected void addInputDescriptor(String label, Quantity quantity, Unit unit, EClass datatype) {
		if (label == null || quantity == null || unit == null || datatype == null) {
			throw new IllegalArgumentException("An argument is null.");
		}

		ParameterDescriptor param = BasecalculationmodelFactory.eINSTANCE.createParameterDescriptor();
		param.setLabel(label);
		param.setQuantity(quantity);
		param.setUnit(unit);
		param.setDataType(datatype);
		getInputDescriptors().add(param);
	}

	public List<MeasuredValue> execute(List<MeasuredValue> inputValues) throws CalculationException {
		validate(inputValues);
		return eval(inputValues);
	}

	protected void validate(List<MeasuredValue> inputValues) throws CalculationException {
		int inputIndex = 0;
		for (ParameterDescriptor desc : getInputDescriptors()) {
			if (inputIndex >= inputValues.size()) {
				throw new InvalidValueException();
			}
			MeasuredValue value = inputValues.get(inputIndex++);
			if (value == null) {
				throw new InvalidValueException();
			}

			// TODO check quantity
			// if(desc.getQuantity().equals))

			if (!desc.getUnit().equals(value.getUnit())) {

				throw new InvalidValueException("Unit mismatch.");
			}
		}
		if (inputIndex + 1 < inputValues.size()) {
			throw new InvalidValueException();
		}
	}

} // FunctionImpl
