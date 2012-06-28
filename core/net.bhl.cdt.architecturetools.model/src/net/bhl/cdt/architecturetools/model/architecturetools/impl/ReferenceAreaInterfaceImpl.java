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
import net.bhl.cdt.architecturetools.model.architecturetools.ReferenceAreaInterface;
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
 * <em><b>Reference Area Interface</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link net.bhl.cdt.architecturetools.model.architecturetools.impl.ReferenceAreaInterfaceImpl#getReferenceAreaParameter
 * <em>Reference Area Parameter</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReferenceAreaInterfaceImpl extends ComponentInterfaceImpl
		implements ReferenceAreaInterface {
	/**
	 * The cached value of the '{@link #getReferenceAreaParameter()
	 * <em>Reference Area Parameter</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferenceAreaParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter referenceAreaParameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReferenceAreaInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolsPackage.Literals.REFERENCE_AREA_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter getReferenceAreaParameter() {
		if (referenceAreaParameter != null && referenceAreaParameter.eIsProxy()) {
			InternalEObject oldReferenceAreaParameter = (InternalEObject) referenceAreaParameter;
			referenceAreaParameter = (Parameter) eResolveProxy(oldReferenceAreaParameter);
			if (referenceAreaParameter != oldReferenceAreaParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ArchitecturetoolsPackage.REFERENCE_AREA_INTERFACE__REFERENCE_AREA_PARAMETER,
							oldReferenceAreaParameter, referenceAreaParameter));
			}
		}
		return referenceAreaParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter basicGetReferenceAreaParameter() {
		return referenceAreaParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReferenceAreaParameter(Parameter newReferenceAreaParameter) {
		Parameter oldReferenceAreaParameter = referenceAreaParameter;
		referenceAreaParameter = newReferenceAreaParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ArchitecturetoolsPackage.REFERENCE_AREA_INTERFACE__REFERENCE_AREA_PARAMETER,
					oldReferenceAreaParameter, referenceAreaParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getReferenceArea() {
		if (referenceAreaParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (referenceAreaParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		return referenceAreaParameter.getValues().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue() {
		if (getReferenceArea() == null) {
			throw new NoValueFoundException();
		}
		return getReferenceArea();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Quantity getQuantity() {
		Parameter parameter = getReferenceAreaParameter();
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
		referenceAreaParameter.getValues().add(value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getParameter() {
		if (referenceAreaParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return referenceAreaParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValue() {
		if (referenceAreaParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return referenceAreaParameter.hasValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue(CalculationSpaceQualifier calcSpaceQualifier) {
		if (referenceAreaParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (referenceAreaParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		List<Value> values = new ArrayList<Value>();
		for (Value value : referenceAreaParameter.getValues()) {
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
		case ArchitecturetoolsPackage.REFERENCE_AREA_INTERFACE__REFERENCE_AREA_PARAMETER:
			if (resolve)
				return getReferenceAreaParameter();
			return basicGetReferenceAreaParameter();
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
		case ArchitecturetoolsPackage.REFERENCE_AREA_INTERFACE__REFERENCE_AREA_PARAMETER:
			setReferenceAreaParameter((Parameter) newValue);
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
		case ArchitecturetoolsPackage.REFERENCE_AREA_INTERFACE__REFERENCE_AREA_PARAMETER:
			setReferenceAreaParameter((Parameter) null);
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
		case ArchitecturetoolsPackage.REFERENCE_AREA_INTERFACE__REFERENCE_AREA_PARAMETER:
			return referenceAreaParameter != null;
		}
		return super.eIsSet(featureID);
	}

} // ReferenceAreaInterfaceImpl
