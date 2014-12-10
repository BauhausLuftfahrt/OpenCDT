/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment.impl;

import java.util.Collection;

import net.bhl.cdt.assessment.AssessmentPackage;
import net.bhl.cdt.assessment.Technologies;
import net.bhl.cdt.assessment.TechnologyElement;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Technologies</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.assessment.impl.TechnologiesImpl#getTechnologies <em>Technologies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologiesImpl extends TechnologyElementImpl implements Technologies {
	/**
	 * The cached value of the '{@link #getTechnologies() <em>Technologies</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTechnologies()
	 * @generated
	 * @ordered
	 */
	protected EList<TechnologyElement> technologies;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TechnologiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.TECHNOLOGIES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TechnologyElement> getTechnologies() {
		if (technologies == null) {
			technologies = new EObjectContainmentEList<TechnologyElement>(TechnologyElement.class, this,
				AssessmentPackage.TECHNOLOGIES__TECHNOLOGIES);
		}
		return technologies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AssessmentPackage.TECHNOLOGIES__TECHNOLOGIES:
			return ((InternalEList<?>) getTechnologies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AssessmentPackage.TECHNOLOGIES__TECHNOLOGIES:
			return getTechnologies();
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
		case AssessmentPackage.TECHNOLOGIES__TECHNOLOGIES:
			getTechnologies().clear();
			getTechnologies().addAll((Collection<? extends TechnologyElement>) newValue);
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
		case AssessmentPackage.TECHNOLOGIES__TECHNOLOGIES:
			getTechnologies().clear();
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
		case AssessmentPackage.TECHNOLOGIES__TECHNOLOGIES:
			return technologies != null && !technologies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TechnologiesImpl
