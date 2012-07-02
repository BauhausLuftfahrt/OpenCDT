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
import net.bhl.cdt.architecturetools.model.architecturetools.CoefficientInterface;
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
 * <em><b>Coefficient Interface</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link net.bhl.cdt.architecturetools.model.architecturetools.impl.CoefficientInterfaceImpl#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link net.bhl.cdt.architecturetools.model.architecturetools.impl.CoefficientInterfaceImpl#getCoefficientParameter
 * <em>Coefficient Parameter</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CoefficientInterfaceImpl extends ComponentInterfaceImpl implements
		CoefficientInterface {
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
	 * The cached value of the '{@link #getCoefficientParameter()
	 * <em>Coefficient Parameter</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCoefficientParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter coefficientParameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CoefficientInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolsPackage.Literals.COEFFICIENT_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter getCoefficientParameter() {
		if (coefficientParameter != null && coefficientParameter.eIsProxy()) {
			InternalEObject oldCoefficientParameter = (InternalEObject) coefficientParameter;
			coefficientParameter = (Parameter) eResolveProxy(oldCoefficientParameter);
			if (coefficientParameter != oldCoefficientParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__COEFFICIENT_PARAMETER,
							oldCoefficientParameter, coefficientParameter));
			}
		}
		return coefficientParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter basicGetCoefficientParameter() {
		return coefficientParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCoefficientParameter(Parameter newCoefficientParameter) {
		Parameter oldCoefficientParameter = coefficientParameter;
		coefficientParameter = newCoefficientParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__COEFFICIENT_PARAMETER,
					oldCoefficientParameter, coefficientParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getCoefficient() {
		if (coefficientParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (coefficientParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		return coefficientParameter.getValues().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue() {
		if (getCoefficient() == null) {
			throw new NoValueFoundException();
		}
		return getCoefficient();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Quantity getQuantity() {
		if (coefficientParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return coefficientParameter.getQuantity();
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
		coefficientParameter.getValues().add(value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getParameter() {
		if (coefficientParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return coefficientParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValue() {
		if (coefficientParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return coefficientParameter.hasValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue(CalculationSpaceQualifier calcSpaceQualifier) {
		if (coefficientParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (coefficientParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		List<Value> values = new ArrayList<Value>();
		for (Value value : coefficientParameter.getValues()) {
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
		case ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__TYPE:
			return getType();
		case ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__COEFFICIENT_PARAMETER:
			if (resolve)
				return getCoefficientParameter();
			return basicGetCoefficientParameter();
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
		case ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__TYPE:
			setType((String) newValue);
			return;
		case ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__COEFFICIENT_PARAMETER:
			setCoefficientParameter((Parameter) newValue);
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
		case ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__COEFFICIENT_PARAMETER:
			setCoefficientParameter((Parameter) null);
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
		case ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		case ArchitecturetoolsPackage.COEFFICIENT_INTERFACE__COEFFICIENT_PARAMETER:
			return coefficientParameter != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // CoefficientInterfaceImpl
