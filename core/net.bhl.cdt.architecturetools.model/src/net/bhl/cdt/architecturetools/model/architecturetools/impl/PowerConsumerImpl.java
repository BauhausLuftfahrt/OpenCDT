/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools.model.architecturetools.impl;

import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.architecturetools.exceptions.NoParameterSetForInterfaceException;
import net.bhl.cdt.architecturetools.exceptions.NoValueFoundException;
import net.bhl.cdt.architecturetools.model.architecturetools.ArchitecturetoolsPackage;
import net.bhl.cdt.architecturetools.model.architecturetools.PowerConsumer;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.impl.ComponentInterfaceImpl;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.utilities.units.Quantity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Power Consumer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link net.bhl.cdt.architecturetools.model.architecturetools.impl.PowerConsumerImpl#getPowerParameter
 * <em>Power Parameter</em>}</li>
 * <li>
 * {@link net.bhl.cdt.architecturetools.model.architecturetools.impl.PowerConsumerImpl#getType
 * <em>Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PowerConsumerImpl extends ComponentInterfaceImpl implements
		PowerConsumer {
	/**
	 * The cached value of the '{@link #getPowerParameter()
	 * <em>Power Parameter</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPowerParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter powerParameter;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PowerConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolsPackage.Literals.POWER_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getPowerParameter() {
		if (powerParameter != null && powerParameter.eIsProxy()) {
			InternalEObject oldPowerParameter = (InternalEObject) powerParameter;
			powerParameter = (Parameter) eResolveProxy(oldPowerParameter);
			if (powerParameter != oldPowerParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ArchitecturetoolsPackage.POWER_CONSUMER__POWER_PARAMETER,
							oldPowerParameter, powerParameter));
			}
		}
		return powerParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter basicGetPowerParameter() {
		return powerParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setPowerParameter(Parameter newPowerParameter) {
		Parameter oldPowerParameter = powerParameter;
		powerParameter = newPowerParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArchitecturetoolsPackage.POWER_CONSUMER__POWER_PARAMETER,
					oldPowerParameter, powerParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArchitecturetoolsPackage.POWER_CONSUMER__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getPowerConsumption() {

		if (powerParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (powerParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		return powerParameter.getValues().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue() {
		if (getPowerConsumption() == null) {
			throw new NoValueFoundException();
		}
		return getPowerConsumption();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Quantity getQuantity() {
		Parameter parameter = getPowerParameter();
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
		powerParameter.getValues().add(value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getParameter() {
		if (powerParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return powerParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValue() {
		if (powerParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return powerParameter.hasValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue(CalculationSpaceQualifier calcSpaceQualifier) {
		if (powerParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (powerParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		List<Value> values = new ArrayList<Value>();
		for (Value value : powerParameter.getValues()) {
			if (calcSpaceQualifier.getQualifies().contains(value)) {
				values.add(value);
			}
		}
		return values.get(values.size() - 1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchitecturetoolsPackage.POWER_CONSUMER__POWER_PARAMETER:
			if (resolve)
				return getPowerParameter();
			return basicGetPowerParameter();
		case ArchitecturetoolsPackage.POWER_CONSUMER__TYPE:
			return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArchitecturetoolsPackage.POWER_CONSUMER__POWER_PARAMETER:
			setPowerParameter((Parameter) newValue);
			return;
		case ArchitecturetoolsPackage.POWER_CONSUMER__TYPE:
			setType((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArchitecturetoolsPackage.POWER_CONSUMER__POWER_PARAMETER:
			setPowerParameter((Parameter) null);
			return;
		case ArchitecturetoolsPackage.POWER_CONSUMER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArchitecturetoolsPackage.POWER_CONSUMER__POWER_PARAMETER:
			return powerParameter != null;
		case ArchitecturetoolsPackage.POWER_CONSUMER__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // PowerConsumerImpl
