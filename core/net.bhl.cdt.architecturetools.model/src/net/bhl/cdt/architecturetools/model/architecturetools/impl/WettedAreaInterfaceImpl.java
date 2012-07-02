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
import net.bhl.cdt.architecturetools.model.architecturetools.WettedAreaInterface;
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
 * <em><b>Wetted Area Interface</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link net.bhl.cdt.architecturetools.model.architecturetools.impl.WettedAreaInterfaceImpl#getWettedAreaParameter
 * <em>Wetted Area Parameter</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WettedAreaInterfaceImpl extends ComponentInterfaceImpl implements
		WettedAreaInterface {
	/**
	 * The cached value of the '{@link #getWettedAreaParameter()
	 * <em>Wetted Area Parameter</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getWettedAreaParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter wettedAreaParameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected WettedAreaInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolsPackage.Literals.WETTED_AREA_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter getWettedAreaParameter() {
		if (wettedAreaParameter != null && wettedAreaParameter.eIsProxy()) {
			InternalEObject oldWettedAreaParameter = (InternalEObject) wettedAreaParameter;
			wettedAreaParameter = (Parameter) eResolveProxy(oldWettedAreaParameter);
			if (wettedAreaParameter != oldWettedAreaParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ArchitecturetoolsPackage.WETTED_AREA_INTERFACE__WETTED_AREA_PARAMETER,
							oldWettedAreaParameter, wettedAreaParameter));
			}
		}
		return wettedAreaParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter basicGetWettedAreaParameter() {
		return wettedAreaParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setWettedAreaParameter(Parameter newWettedAreaParameter) {
		Parameter oldWettedAreaParameter = wettedAreaParameter;
		wettedAreaParameter = newWettedAreaParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ArchitecturetoolsPackage.WETTED_AREA_INTERFACE__WETTED_AREA_PARAMETER,
					oldWettedAreaParameter, wettedAreaParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getWettedArea() {
		if (wettedAreaParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (wettedAreaParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		return wettedAreaParameter.getValues().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue() {
		if (getWettedArea() == null) {
			throw new NoValueFoundException();
		}
		return getWettedArea();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Quantity getQuantity() {
		Parameter parameter = getWettedAreaParameter();
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
		wettedAreaParameter.getValues().add(value);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getParameter() {
		if (wettedAreaParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return wettedAreaParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValue() {
		if (wettedAreaParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return wettedAreaParameter.hasValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue(CalculationSpaceQualifier calcSpaceQualifier) {
		if (wettedAreaParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (wettedAreaParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		List<Value> values = new ArrayList<Value>();
		for (Value value : wettedAreaParameter.getValues()) {
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
		case ArchitecturetoolsPackage.WETTED_AREA_INTERFACE__WETTED_AREA_PARAMETER:
			if (resolve)
				return getWettedAreaParameter();
			return basicGetWettedAreaParameter();
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
		case ArchitecturetoolsPackage.WETTED_AREA_INTERFACE__WETTED_AREA_PARAMETER:
			setWettedAreaParameter((Parameter) newValue);
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
		case ArchitecturetoolsPackage.WETTED_AREA_INTERFACE__WETTED_AREA_PARAMETER:
			setWettedAreaParameter((Parameter) null);
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
		case ArchitecturetoolsPackage.WETTED_AREA_INTERFACE__WETTED_AREA_PARAMETER:
			return wettedAreaParameter != null;
		}
		return super.eIsSet(featureID);
	}

} // WettedAreaInterfaceImpl
