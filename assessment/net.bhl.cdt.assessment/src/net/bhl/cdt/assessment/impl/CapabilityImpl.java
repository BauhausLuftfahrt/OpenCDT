/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment.impl;

import java.util.Collection;

import net.bhl.cdt.assessment.AssessmentPackage;
import net.bhl.cdt.assessment.Capability;
import net.bhl.cdt.assessment.Technology;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Capability</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.assessment.impl.CapabilityImpl#getProvidedBy <em>Provided By</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.impl.CapabilityImpl#getRequiredBy <em>Required By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityImpl extends CapabilityElementImpl implements Capability {
	/**
	 * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Technology> providedBy;

	/**
	 * The cached value of the '{@link #getRequiredBy() <em>Required By</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRequiredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Technology> requiredBy;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Technology> getProvidedBy() {
		if (providedBy == null) {
			providedBy = new EObjectWithInverseResolvingEList.ManyInverse<Technology>(Technology.class, this,
				AssessmentPackage.CAPABILITY__PROVIDED_BY, AssessmentPackage.TECHNOLOGY__PROVIDES);
		}
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Technology> getRequiredBy() {
		if (requiredBy == null) {
			requiredBy = new EObjectWithInverseResolvingEList.ManyInverse<Technology>(Technology.class, this,
				AssessmentPackage.CAPABILITY__REQUIRED_BY, AssessmentPackage.TECHNOLOGY__REQUIRES);
		}
		return requiredBy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AssessmentPackage.CAPABILITY__PROVIDED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvidedBy()).basicAdd(otherEnd, msgs);
		case AssessmentPackage.CAPABILITY__REQUIRED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AssessmentPackage.CAPABILITY__PROVIDED_BY:
			return ((InternalEList<?>) getProvidedBy()).basicRemove(otherEnd, msgs);
		case AssessmentPackage.CAPABILITY__REQUIRED_BY:
			return ((InternalEList<?>) getRequiredBy()).basicRemove(otherEnd, msgs);
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
		case AssessmentPackage.CAPABILITY__PROVIDED_BY:
			return getProvidedBy();
		case AssessmentPackage.CAPABILITY__REQUIRED_BY:
			return getRequiredBy();
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
		case AssessmentPackage.CAPABILITY__PROVIDED_BY:
			getProvidedBy().clear();
			getProvidedBy().addAll((Collection<? extends Technology>) newValue);
			return;
		case AssessmentPackage.CAPABILITY__REQUIRED_BY:
			getRequiredBy().clear();
			getRequiredBy().addAll((Collection<? extends Technology>) newValue);
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
		case AssessmentPackage.CAPABILITY__PROVIDED_BY:
			getProvidedBy().clear();
			return;
		case AssessmentPackage.CAPABILITY__REQUIRED_BY:
			getRequiredBy().clear();
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
		case AssessmentPackage.CAPABILITY__PROVIDED_BY:
			return providedBy != null && !providedBy.isEmpty();
		case AssessmentPackage.CAPABILITY__REQUIRED_BY:
			return requiredBy != null && !requiredBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CapabilityImpl
