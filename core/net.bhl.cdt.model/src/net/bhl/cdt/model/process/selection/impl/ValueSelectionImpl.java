/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection.impl;

import java.util.Collection;

import net.bhl.cdt.model.process.impl.ProcessElementImpl;
import net.bhl.cdt.model.process.selection.SelectedValue;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.ValueSelection;
import net.bhl.cdt.model.process.selection.ValueSelectionCriterion;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Value Selection</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.process.selection.impl.ValueSelectionImpl#getCriteria <em>Criteria</em>}</li>
 * <li>{@link net.bhl.cdt.model.process.selection.impl.ValueSelectionImpl#getSelectedValues <em>Selected Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSelectionImpl extends ProcessElementImpl implements ValueSelection {
	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSelectionCriterion> criteria;

	/**
	 * The cached value of the '{@link #getSelectedValues() <em>Selected Values</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSelectedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectedValue> selectedValues;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectionPackage.Literals.VALUE_SELECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSelectionCriterion> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectContainmentEList<ValueSelectionCriterion>(ValueSelectionCriterion.class, this, SelectionPackage.VALUE_SELECTION__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectedValue> getSelectedValues() {
		if (selectedValues == null) {
			selectedValues = new EObjectContainmentEList<SelectedValue>(SelectedValue.class, this, SelectionPackage.VALUE_SELECTION__SELECTED_VALUES);
		}
		return selectedValues;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelectionPackage.VALUE_SELECTION__CRITERIA:
				return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
			case SelectionPackage.VALUE_SELECTION__SELECTED_VALUES:
				return ((InternalEList<?>)getSelectedValues()).basicRemove(otherEnd, msgs);
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
			case SelectionPackage.VALUE_SELECTION__CRITERIA:
				return getCriteria();
			case SelectionPackage.VALUE_SELECTION__SELECTED_VALUES:
				return getSelectedValues();
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
			case SelectionPackage.VALUE_SELECTION__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends ValueSelectionCriterion>)newValue);
				return;
			case SelectionPackage.VALUE_SELECTION__SELECTED_VALUES:
				getSelectedValues().clear();
				getSelectedValues().addAll((Collection<? extends SelectedValue>)newValue);
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
			case SelectionPackage.VALUE_SELECTION__CRITERIA:
				getCriteria().clear();
				return;
			case SelectionPackage.VALUE_SELECTION__SELECTED_VALUES:
				getSelectedValues().clear();
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
			case SelectionPackage.VALUE_SELECTION__CRITERIA:
				return criteria != null && !criteria.isEmpty();
			case SelectionPackage.VALUE_SELECTION__SELECTED_VALUES:
				return selectedValues != null && !selectedValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ValueSelectionImpl
