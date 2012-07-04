/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.IterationNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Iteration Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.calculation.impl.IterationNodeImpl#getMaxIteration <em>Max Iteration</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IterationNodeImpl extends ControlNodeImpl implements IterationNode {
	/**
	 * The default value of the '{@link #getMaxIteration() <em>Max Iteration</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMaxIteration()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ITERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxIteration() <em>Max Iteration</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMaxIteration()
	 * @generated
	 * @ordered
	 */
	protected int maxIteration = MAX_ITERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IterationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculationPackage.Literals.ITERATION_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getMaxIteration() {
		return maxIteration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMaxIteration(int newMaxIteration) {
		int oldMaxIteration = maxIteration;
		maxIteration = newMaxIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.ITERATION_NODE__MAX_ITERATION,
				oldMaxIteration, maxIteration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CalculationPackage.ITERATION_NODE__MAX_ITERATION:
			return getMaxIteration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CalculationPackage.ITERATION_NODE__MAX_ITERATION:
			setMaxIteration((Integer) newValue);
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
		case CalculationPackage.ITERATION_NODE__MAX_ITERATION:
			setMaxIteration(MAX_ITERATION_EDEFAULT);
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
		case CalculationPackage.ITERATION_NODE__MAX_ITERATION:
			return maxIteration != MAX_ITERATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxIteration: "); //$NON-NLS-1$
		result.append(maxIteration);
		result.append(')');
		return result.toString();
	}

} // IterationNodeImpl
