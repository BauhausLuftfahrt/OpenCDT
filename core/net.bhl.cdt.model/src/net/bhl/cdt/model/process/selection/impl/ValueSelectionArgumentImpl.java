/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection.impl;

import java.util.Collection;

import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.ValueSelectionArgument;
import net.bhl.cdt.model.process.selection.ValueSelectionCriterion;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Value Selection Argument</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.ValueSelectionArgumentImpl#getSupportedCriteria <em>Supported Criteria</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.ValueSelectionArgumentImpl#getOpposedCriteria <em>Opposed Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSelectionArgumentImpl extends RationaleImpl implements ValueSelectionArgument {
	/**
	 * The cached value of the '{@link #getSupportedCriteria() <em>Supported Criteria</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSupportedCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSelectionCriterion> supportedCriteria;

	/**
	 * The cached value of the '{@link #getOpposedCriteria() <em>Opposed Criteria</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOpposedCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSelectionCriterion> opposedCriteria;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSelectionArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectionPackage.Literals.VALUE_SELECTION_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSelectionCriterion> getSupportedCriteria() {
		if (supportedCriteria == null) {
			supportedCriteria = new EObjectResolvingEList<ValueSelectionCriterion>(ValueSelectionCriterion.class, this, SelectionPackage.VALUE_SELECTION_ARGUMENT__SUPPORTED_CRITERIA);
		}
		return supportedCriteria;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSelectionCriterion> getOpposedCriteria() {
		if (opposedCriteria == null) {
			opposedCriteria = new EObjectResolvingEList<ValueSelectionCriterion>(ValueSelectionCriterion.class, this, SelectionPackage.VALUE_SELECTION_ARGUMENT__OPPOSED_CRITERIA);
		}
		return opposedCriteria;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectionPackage.VALUE_SELECTION_ARGUMENT__SUPPORTED_CRITERIA:
				return getSupportedCriteria();
			case SelectionPackage.VALUE_SELECTION_ARGUMENT__OPPOSED_CRITERIA:
				return getOpposedCriteria();
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
			case SelectionPackage.VALUE_SELECTION_ARGUMENT__SUPPORTED_CRITERIA:
				getSupportedCriteria().clear();
				getSupportedCriteria().addAll((Collection<? extends ValueSelectionCriterion>)newValue);
				return;
			case SelectionPackage.VALUE_SELECTION_ARGUMENT__OPPOSED_CRITERIA:
				getOpposedCriteria().clear();
				getOpposedCriteria().addAll((Collection<? extends ValueSelectionCriterion>)newValue);
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
			case SelectionPackage.VALUE_SELECTION_ARGUMENT__SUPPORTED_CRITERIA:
				getSupportedCriteria().clear();
				return;
			case SelectionPackage.VALUE_SELECTION_ARGUMENT__OPPOSED_CRITERIA:
				getOpposedCriteria().clear();
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
			case SelectionPackage.VALUE_SELECTION_ARGUMENT__SUPPORTED_CRITERIA:
				return supportedCriteria != null && !supportedCriteria.isEmpty();
			case SelectionPackage.VALUE_SELECTION_ARGUMENT__OPPOSED_CRITERIA:
				return opposedCriteria != null && !opposedCriteria.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ValueSelectionArgumentImpl
