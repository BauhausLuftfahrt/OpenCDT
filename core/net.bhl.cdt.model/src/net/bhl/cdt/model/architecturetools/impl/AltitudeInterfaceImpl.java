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
import net.bhl.cdt.model.architecturetools.AltitudeInterface;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage;
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
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Altitude Interface</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.architecturetools.impl.AltitudeInterfaceImpl#getAltitudeParameter <em>Altitude Parameter
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AltitudeInterfaceImpl extends ComponentInterfaceImpl implements AltitudeInterface {
	/**
	 * The cached value of the '{@link #getAltitudeParameter() <em>Altitude Parameter</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAltitudeParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter altitudeParameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AltitudeInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolsPackage.Literals.ALTITUDE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter getAltitudeParameter() {
		if (altitudeParameter != null && altitudeParameter.eIsProxy()) {
			InternalEObject oldAltitudeParameter = (InternalEObject) altitudeParameter;
			altitudeParameter = (Parameter) eResolveProxy(oldAltitudeParameter);
			if (altitudeParameter != oldAltitudeParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						ArchitecturetoolsPackage.ALTITUDE_INTERFACE__ALTITUDE_PARAMETER, oldAltitudeParameter,
						altitudeParameter));
			}
		}
		return altitudeParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter basicGetAltitudeParameter() {
		return altitudeParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAltitudeParameter(Parameter newAltitudeParameter) {
		Parameter oldAltitudeParameter = altitudeParameter;
		altitudeParameter = newAltitudeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				ArchitecturetoolsPackage.ALTITUDE_INTERFACE__ALTITUDE_PARAMETER, oldAltitudeParameter,
				altitudeParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getAltitude() {
		if (altitudeParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (altitudeParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		return altitudeParameter.getValues().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue() {
		if (altitudeParameter.getValue() == null) {
			throw new NoValueFoundException();
		}
		return getAltitude();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Quantity getQuantity() {
		Parameter parameter = getAltitudeParameter();
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
		altitudeParameter.getValues().add(value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getParameter() {
		if (altitudeParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return altitudeParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValue() {
		if (altitudeParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return altitudeParameter.hasValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue(CalculationSpaceQualifier calcSpaceQualifier) {
		if (altitudeParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (altitudeParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		List<Value> values = new ArrayList<Value>();
		for (Value value : altitudeParameter.getValues()) {
			if (calcSpaceQualifier.getQualifies().contains(value)) {
				values.add(value);
			}
		}
		return values.get(values.size() - 1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchitecturetoolsPackage.ALTITUDE_INTERFACE__ALTITUDE_PARAMETER:
			if (resolve)
				return getAltitudeParameter();
			return basicGetAltitudeParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArchitecturetoolsPackage.ALTITUDE_INTERFACE__ALTITUDE_PARAMETER:
			setAltitudeParameter((Parameter) newValue);
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
		case ArchitecturetoolsPackage.ALTITUDE_INTERFACE__ALTITUDE_PARAMETER:
			setAltitudeParameter((Parameter) null);
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
		case ArchitecturetoolsPackage.ALTITUDE_INTERFACE__ALTITUDE_PARAMETER:
			return altitudeParameter != null;
		}
		return super.eIsSet(featureID);
	}

} // AltitudeInterfaceImpl
