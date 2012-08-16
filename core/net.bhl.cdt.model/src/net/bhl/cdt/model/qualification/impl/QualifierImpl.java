/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification.impl;

import java.util.Collection;

import net.bhl.cdt.model.impl.ElementImpl;
import net.bhl.cdt.model.qualification.Qualifiable;
import net.bhl.cdt.model.qualification.QualificationPackage;
import net.bhl.cdt.model.qualification.Qualifier;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Qualifier</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.qualification.impl.QualifierImpl#getQualifies <em>Qualifies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class QualifierImpl extends ElementImpl implements Qualifier {
	/**
	 * The cached value of the '{@link #getQualifies() <em>Qualifies</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getQualifies()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualifiable> qualifies;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualificationPackage.Literals.QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualifiable> getQualifies() {
		if (qualifies == null) {
			qualifies = new EObjectResolvingEList<Qualifiable>(Qualifiable.class, this, QualificationPackage.QUALIFIER__QUALIFIES);
		}
		return qualifies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualificationPackage.QUALIFIER__QUALIFIES:
				return getQualifies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualificationPackage.QUALIFIER__QUALIFIES:
				getQualifies().clear();
				getQualifies().addAll((Collection<? extends Qualifiable>)newValue);
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
			case QualificationPackage.QUALIFIER__QUALIFIES:
				getQualifies().clear();
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
			case QualificationPackage.QUALIFIER__QUALIFIES:
				return qualifies != null && !qualifies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // QualifierImpl
