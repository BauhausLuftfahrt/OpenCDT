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
import net.bhl.cdt.model.architecturetools.Massive;
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
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Massive</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.architecturetools.impl.MassiveImpl#getMassParameter <em>Mass Parameter</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MassiveImpl extends ComponentInterfaceImpl implements Massive {
	/**
	 * The cached value of the '{@link #getMassParameter() <em>Mass Parameter</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMassParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter massParameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MassiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolsPackage.Literals.MASSIVE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter getMassParameter() {
		if (massParameter != null && massParameter.eIsProxy()) {
			InternalEObject oldMassParameter = (InternalEObject) massParameter;
			massParameter = (Parameter) eResolveProxy(oldMassParameter);
			if (massParameter != oldMassParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						ArchitecturetoolsPackage.MASSIVE__MASS_PARAMETER, oldMassParameter, massParameter));
			}
		}
		return massParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter basicGetMassParameter() {
		return massParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMassParameter(Parameter newMassParameter) {
		Parameter oldMassParameter = massParameter;
		massParameter = newMassParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolsPackage.MASSIVE__MASS_PARAMETER,
				oldMassParameter, massParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getMass() {
		if (massParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (massParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		return massParameter.getValues().get(0);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue() {
		if (massParameter.getValue() == null) {
			throw new NoValueFoundException();
		}
		return massParameter.getValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Quantity getQuantity() {
		if (massParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return massParameter.getQuantity();
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
		massParameter.getValues().add(value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getParameter() {
		if (massParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return massParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValue() {
		if (massParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		return massParameter.hasValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue(CalculationSpaceQualifier calcSpaceQualifier) {
		if (massParameter == null) {
			throw new NoParameterSetForInterfaceException();
		}
		if (massParameter.getValues().size() == 0) {
			throw new NoValueFoundException();
		}
		List<Value> values = new ArrayList<Value>();
		for (Value value : massParameter.getValues()) {
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
		case ArchitecturetoolsPackage.MASSIVE__MASS_PARAMETER:
			if (resolve)
				return getMassParameter();
			return basicGetMassParameter();
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
		case ArchitecturetoolsPackage.MASSIVE__MASS_PARAMETER:
			setMassParameter((Parameter) newValue);
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
		case ArchitecturetoolsPackage.MASSIVE__MASS_PARAMETER:
			setMassParameter((Parameter) null);
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
		case ArchitecturetoolsPackage.MASSIVE__MASS_PARAMETER:
			return massParameter != null;
		}
		return super.eIsSet(featureID);
	}

} // MassiveImpl
