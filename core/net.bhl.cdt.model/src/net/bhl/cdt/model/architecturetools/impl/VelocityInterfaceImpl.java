/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.architecturetools.impl;

import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage;
import net.bhl.cdt.model.architecturetools.VelocityInterface;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Velocity Interface</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.architecturetools.impl.VelocityInterfaceImpl#getVelocityParameter <em>Velocity Parameter
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class VelocityInterfaceImpl extends ComponentInterfaceImpl implements VelocityInterface {
	/**
	 * The cached value of the '{@link #getVelocityParameter() <em>Velocity Parameter</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVelocityParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter velocityParameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VelocityInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolsPackage.Literals.VELOCITY_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getVelocityParameter() {
		if (velocityParameter != null && velocityParameter.eIsProxy()) {
			InternalEObject oldVelocityParameter = (InternalEObject)velocityParameter;
			velocityParameter = (Parameter)eResolveProxy(oldVelocityParameter);
			if (velocityParameter != oldVelocityParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturetoolsPackage.VELOCITY_INTERFACE__VELOCITY_PARAMETER, oldVelocityParameter, velocityParameter));
			}
		}
		return velocityParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetVelocityParameter() {
		return velocityParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocityParameter(Parameter newVelocityParameter) {
		Parameter oldVelocityParameter = velocityParameter;
		velocityParameter = newVelocityParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolsPackage.VELOCITY_INTERFACE__VELOCITY_PARAMETER, oldVelocityParameter, velocityParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getVelocity() {
		if (velocityParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (velocityParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		return velocityParameter.getValues().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue() {
		if (getVelocity() == null) {
			throw new NoValueFoundException();
		}
		return getVelocity();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Quantity getQuantity() {
		Parameter parameter = getVelocityParameter();
		if (parameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return parameter.getQuantity();
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
		velocityParameter.getValues().add(value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getParameter() {
		if (velocityParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return velocityParameter;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValue() {
		if (velocityParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return velocityParameter.hasValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue(CalculationSpaceQualifier calcSpaceQualifier) {
		if (velocityParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (velocityParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		List<Value> values = new ArrayList<Value>();
		for (Value value : velocityParameter.getValues()) {
			if (calcSpaceQualifier.getQualifies().contains(value)) {
				values.add(value);
			}
		}
		return values.get(values.size() - 1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturetoolsPackage.VELOCITY_INTERFACE__VELOCITY_PARAMETER:
				if (resolve) return getVelocityParameter();
				return basicGetVelocityParameter();
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
			case ArchitecturetoolsPackage.VELOCITY_INTERFACE__VELOCITY_PARAMETER:
				setVelocityParameter((Parameter)newValue);
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
			case ArchitecturetoolsPackage.VELOCITY_INTERFACE__VELOCITY_PARAMETER:
				setVelocityParameter((Parameter)null);
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
			case ArchitecturetoolsPackage.VELOCITY_INTERFACE__VELOCITY_PARAMETER:
				return velocityParameter != null;
		}
		return super.eIsSet(featureID);
	}

} // VelocityInterfaceImpl
