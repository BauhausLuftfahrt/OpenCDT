/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.architecturetools.impl;

import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage;
import net.bhl.cdt.model.architecturetools.RangeInterface;
import net.bhl.cdt.model.architecturetools.exceptions.NoParameterSetForInterfaceException;
import net.bhl.cdt.model.architecturetools.exceptions.NoValueFoundException;
import net.bhl.cdt.model.impl.ComponentInterfaceImpl;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.utilities.units.Quantity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Range Interface</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.architecturetools.impl.RangeInterfaceImpl#getRangeParameter <em>Range Parameter</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RangeInterfaceImpl extends ComponentInterfaceImpl implements RangeInterface {
	/**
	 * The cached value of the '{@link #getRangeParameter() <em>Range Parameter</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getRangeParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter rangeParameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolsPackage.Literals.RANGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getRangeParameter() {
		if (rangeParameter != null && rangeParameter.eIsProxy()) {
			InternalEObject oldRangeParameter = (InternalEObject)rangeParameter;
			rangeParameter = (Parameter)eResolveProxy(oldRangeParameter);
			if (rangeParameter != oldRangeParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturetoolsPackage.RANGE_INTERFACE__RANGE_PARAMETER, oldRangeParameter, rangeParameter));
			}
		}
		return rangeParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetRangeParameter() {
		return rangeParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeParameter(Parameter newRangeParameter) {
		Parameter oldRangeParameter = rangeParameter;
		rangeParameter = newRangeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolsPackage.RANGE_INTERFACE__RANGE_PARAMETER, oldRangeParameter, rangeParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getRange() {
		if (rangeParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (rangeParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		return rangeParameter.getValues().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue() {
		if (getRange() == null) {
			throw new NoValueFoundException();
		}
		return getRange();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Quantity getQuantity() {
		if (rangeParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return rangeParameter.getQuantity();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setValue(Value value) {
		// TODO: policy for value management must be implemented
		if (value == null) {
			throw new NoValueFoundException();
		}
		rangeParameter.getValues().add(value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getParameter() {
		if (rangeParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return rangeParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValue() {
		if (rangeParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return rangeParameter.hasValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue(CalculationSpaceQualifier calcSpaceQualifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturetoolsPackage.RANGE_INTERFACE__RANGE_PARAMETER:
				if (resolve) return getRangeParameter();
				return basicGetRangeParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturetoolsPackage.RANGE_INTERFACE__RANGE_PARAMETER:
				setRangeParameter((Parameter)newValue);
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
			case ArchitecturetoolsPackage.RANGE_INTERFACE__RANGE_PARAMETER:
				setRangeParameter((Parameter)null);
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
			case ArchitecturetoolsPackage.RANGE_INTERFACE__RANGE_PARAMETER:
				return rangeParameter != null;
		}
		return super.eIsSet(featureID);
	}

} // RangeInterfaceImpl
