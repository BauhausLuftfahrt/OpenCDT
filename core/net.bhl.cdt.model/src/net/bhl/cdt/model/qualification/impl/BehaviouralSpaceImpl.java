/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification.impl;

import java.util.Collection;

import net.bhl.cdt.model.qualification.BehaviouralQualifier;
import net.bhl.cdt.model.qualification.BehaviouralSpace;
import net.bhl.cdt.model.qualification.QualificationPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Behavioural Space</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.qualification.impl.BehaviouralSpaceImpl#getBehaviouralQualifier <em>Behavioural
 * Qualifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BehaviouralSpaceImpl extends QualifyingSpaceImpl implements BehaviouralSpace {
	/**
	 * The cached value of the '{@link #getBehaviouralQualifier() <em>Behavioural Qualifier</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBehaviouralQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviouralQualifier> behaviouralQualifier;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BehaviouralSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualificationPackage.Literals.BEHAVIOURAL_SPACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BehaviouralQualifier> getBehaviouralQualifier() {
		if (behaviouralQualifier == null) {
			behaviouralQualifier = new EObjectResolvingEList<BehaviouralQualifier>(BehaviouralQualifier.class, this,
				QualificationPackage.BEHAVIOURAL_SPACE__BEHAVIOURAL_QUALIFIER);
		}
		return behaviouralQualifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QualificationPackage.BEHAVIOURAL_SPACE__BEHAVIOURAL_QUALIFIER:
			return getBehaviouralQualifier();
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
		case QualificationPackage.BEHAVIOURAL_SPACE__BEHAVIOURAL_QUALIFIER:
			getBehaviouralQualifier().clear();
			getBehaviouralQualifier().addAll((Collection<? extends BehaviouralQualifier>) newValue);
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
		case QualificationPackage.BEHAVIOURAL_SPACE__BEHAVIOURAL_QUALIFIER:
			getBehaviouralQualifier().clear();
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
		case QualificationPackage.BEHAVIOURAL_SPACE__BEHAVIOURAL_QUALIFIER:
			return behaviouralQualifier != null && !behaviouralQualifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BehaviouralSpaceImpl
