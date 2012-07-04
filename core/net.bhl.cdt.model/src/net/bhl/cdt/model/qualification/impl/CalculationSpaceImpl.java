/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification.impl;

import java.util.Collection;

import net.bhl.cdt.model.qualification.CalculationSpace;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.model.qualification.QualificationPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Calculation Space</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.qualification.impl.CalculationSpaceImpl#getSpaceQualifier <em>Space Qualifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CalculationSpaceImpl extends QualifyingSpaceImpl implements CalculationSpace {
	/**
	 * The cached value of the '{@link #getSpaceQualifier() <em>Space Qualifier</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSpaceQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CalculationSpaceQualifier> spaceQualifier;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CalculationSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualificationPackage.Literals.CALCULATION_SPACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CalculationSpaceQualifier> getSpaceQualifier() {
		if (spaceQualifier == null) {
			spaceQualifier = new EObjectResolvingEList<CalculationSpaceQualifier>(CalculationSpaceQualifier.class,
				this, QualificationPackage.CALCULATION_SPACE__SPACE_QUALIFIER);
		}
		return spaceQualifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QualificationPackage.CALCULATION_SPACE__SPACE_QUALIFIER:
			return getSpaceQualifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QualificationPackage.CALCULATION_SPACE__SPACE_QUALIFIER:
			getSpaceQualifier().clear();
			getSpaceQualifier().addAll((Collection<? extends CalculationSpaceQualifier>) newValue);
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
		case QualificationPackage.CALCULATION_SPACE__SPACE_QUALIFIER:
			getSpaceQualifier().clear();
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
		case QualificationPackage.CALCULATION_SPACE__SPACE_QUALIFIER:
			return spaceQualifier != null && !spaceQualifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CalculationSpaceImpl
