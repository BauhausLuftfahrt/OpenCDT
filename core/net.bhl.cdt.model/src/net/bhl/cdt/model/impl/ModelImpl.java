/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.impl;

import java.util.Collection;

import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Model;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.qualification.QualifyingSpace;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.impl.ModelImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ModelImpl#getQualifyingSpaces <em>Qualifying Spaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends ElementImpl implements Model {
	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configurations;

	/**
	 * The cached value of the '{@link #getQualifyingSpaces() <em>Qualifying Spaces</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQualifyingSpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<QualifyingSpace> qualifyingSpaces;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList.Resolving<Configuration>(Configuration.class, this, ModelPackage.MODEL__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualifyingSpace> getQualifyingSpaces() {
		if (qualifyingSpaces == null) {
			qualifyingSpaces = new EObjectContainmentEList.Resolving<QualifyingSpace>(QualifyingSpace.class, this, ModelPackage.MODEL__QUALIFYING_SPACES);
		}
		return qualifyingSpaces;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.MODEL__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
			case ModelPackage.MODEL__QUALIFYING_SPACES:
				return ((InternalEList<?>)getQualifyingSpaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MODEL__CONFIGURATIONS:
				return getConfigurations();
			case ModelPackage.MODEL__QUALIFYING_SPACES:
				return getQualifyingSpaces();
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
			case ModelPackage.MODEL__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case ModelPackage.MODEL__QUALIFYING_SPACES:
				getQualifyingSpaces().clear();
				getQualifyingSpaces().addAll((Collection<? extends QualifyingSpace>)newValue);
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
			case ModelPackage.MODEL__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case ModelPackage.MODEL__QUALIFYING_SPACES:
				getQualifyingSpaces().clear();
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
			case ModelPackage.MODEL__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case ModelPackage.MODEL__QUALIFYING_SPACES:
				return qualifyingSpaces != null && !qualifyingSpaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ModelImpl
