/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.impl;

import java.util.Collection;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.View;
import net.bhl.cdt.model.calculation.CalculationSet;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Configuration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.impl.ConfigurationImpl#getViews <em>Views</em>}</li>
 * <li>{@link net.bhl.cdt.model.impl.ConfigurationImpl#getComponents <em>Components</em>}</li>
 * <li>{@link net.bhl.cdt.model.impl.ConfigurationImpl#getCalculationSets <em>Calculation Sets</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ConfigurationImpl extends StructuralElementImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getCalculationSets() <em>Calculation Sets</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCalculationSets()
	 * @generated
	 * @ordered
	 */
	protected EList<CalculationSet> calculationSets;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList.Resolving<Component>(Component.class, this,
				ModelPackage.CONFIGURATION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CalculationSet> getCalculationSets() {
		if (calculationSets == null) {
			calculationSets = new EObjectContainmentEList.Resolving<CalculationSet>(CalculationSet.class, this,
				ModelPackage.CONFIGURATION__CALCULATION_SETS);
		}
		return calculationSets;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList.Resolving<View>(View.class, this, ModelPackage.CONFIGURATION__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.CONFIGURATION__VIEWS:
			return ((InternalEList<?>) getViews()).basicRemove(otherEnd, msgs);
		case ModelPackage.CONFIGURATION__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case ModelPackage.CONFIGURATION__CALCULATION_SETS:
			return ((InternalEList<?>) getCalculationSets()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.CONFIGURATION__VIEWS:
			return getViews();
		case ModelPackage.CONFIGURATION__COMPONENTS:
			return getComponents();
		case ModelPackage.CONFIGURATION__CALCULATION_SETS:
			return getCalculationSets();
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
		case ModelPackage.CONFIGURATION__VIEWS:
			getViews().clear();
			getViews().addAll((Collection<? extends View>) newValue);
			return;
		case ModelPackage.CONFIGURATION__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case ModelPackage.CONFIGURATION__CALCULATION_SETS:
			getCalculationSets().clear();
			getCalculationSets().addAll((Collection<? extends CalculationSet>) newValue);
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
		case ModelPackage.CONFIGURATION__VIEWS:
			getViews().clear();
			return;
		case ModelPackage.CONFIGURATION__COMPONENTS:
			getComponents().clear();
			return;
		case ModelPackage.CONFIGURATION__CALCULATION_SETS:
			getCalculationSets().clear();
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
		case ModelPackage.CONFIGURATION__VIEWS:
			return views != null && !views.isEmpty();
		case ModelPackage.CONFIGURATION__COMPONENTS:
			return components != null && !components.isEmpty();
		case ModelPackage.CONFIGURATION__CALCULATION_SETS:
			return calculationSets != null && !calculationSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ConfigurationImpl
