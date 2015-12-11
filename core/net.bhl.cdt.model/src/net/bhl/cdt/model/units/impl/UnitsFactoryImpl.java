/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.units.impl;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import net.bhl.cdt.model.units.*;
import net.bhl.cdt.model.units.UnitsFactory;
import net.bhl.cdt.model.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class UnitsFactoryImpl extends EFactoryImpl implements UnitsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitsFactory init() {
		try {
			UnitsFactory theUnitsFactory = (UnitsFactory)EPackage.Registry.INSTANCE.getEFactory(UnitsPackage.eNS_URI);
			if (theUnitsFactory != null) {
				return theUnitsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnitsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UnitsPackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
			case UnitsPackage.QUANTITY:
				return createQuantityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UnitsPackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			case UnitsPackage.QUANTITY:
				return convertQuantityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantityFromString(EDataType eDataType, String initialValue) {
		return (Quantity)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public Unit<?> createUnitFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}

		if (getEPackage() != eDataType.getEPackage()) {
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
		if (eDataType.getInstanceClass().equals(Unit.class)) {
			return Unit.valueOf(initialValue);
		}
		// TODO message
		throw new IllegalArgumentException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {

		if (getEPackage() != eDataType.getEPackage()) {
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}

		if (eDataType.getInstanceClass().equals(Unit.class)) {
			if (instanceValue instanceof Unit) {
				return instanceValue.toString();
			} else {
				return "";
			}
		}
		// TODO message
		throw new IllegalArgumentException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsPackage getUnitsPackage() {
		return (UnitsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnitsPackage getPackage() {
		return UnitsPackage.eINSTANCE;
	}

} // UnitsFactoryImpl
