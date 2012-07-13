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
import net.bhl.cdt.model.architecturetools.DensityInterface;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Density Interface</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.architecturetools.impl.DensityInterfaceImpl#getDensityParameter <em>Density Parameter
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DensityInterfaceImpl extends ComponentInterfaceImpl implements DensityInterface {
	/**
	 * The cached value of the '{@link #getDensityParameter() <em>Density Parameter</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDensityParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter densityParameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DensityInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolsPackage.Literals.DENSITY_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter getDensityParameter() {
		if (densityParameter != null && densityParameter.eIsProxy()) {
			InternalEObject oldDensityParameter = (InternalEObject) densityParameter;
			densityParameter = (Parameter) eResolveProxy(oldDensityParameter);
			if (densityParameter != oldDensityParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						ArchitecturetoolsPackage.DENSITY_INTERFACE__DENSITY_PARAMETER, oldDensityParameter,
						densityParameter));
			}
		}
		return densityParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter basicGetDensityParameter() {
		return densityParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDensityParameter(Parameter newDensityParameter) {
		Parameter oldDensityParameter = densityParameter;
		densityParameter = newDensityParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				ArchitecturetoolsPackage.DENSITY_INTERFACE__DENSITY_PARAMETER, oldDensityParameter, densityParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getDensity() {
		if (densityParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (densityParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		return densityParameter.getValues().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue() {
		if (getDensity() == null) {
			throw new NoValueFoundException();
		}
		return getDensity();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Quantity getQuantity() {
		Parameter parameter = getDensityParameter();
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
		densityParameter.getValues().add(value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getParameter() {
		if (densityParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return densityParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValue() {
		if (densityParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return densityParameter.hasValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue(CalculationSpaceQualifier calcSpaceQualifier) {
		if (densityParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (densityParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		List<Value> values = new ArrayList<Value>();
		for (Value value : densityParameter.getValues()) {
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
		case ArchitecturetoolsPackage.DENSITY_INTERFACE__DENSITY_PARAMETER:
			if (resolve)
				return getDensityParameter();
			return basicGetDensityParameter();
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
		case ArchitecturetoolsPackage.DENSITY_INTERFACE__DENSITY_PARAMETER:
			setDensityParameter((Parameter) newValue);
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
		case ArchitecturetoolsPackage.DENSITY_INTERFACE__DENSITY_PARAMETER:
			setDensityParameter((Parameter) null);
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
		case ArchitecturetoolsPackage.DENSITY_INTERFACE__DENSITY_PARAMETER:
			return densityParameter != null;
		}
		return super.eIsSet(featureID);
	}

} // DensityInterfaceImpl
