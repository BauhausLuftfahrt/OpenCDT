/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import net.bhl.cdt.model.calculation.AbstractNode;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.CalculationSetNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Set Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.calculation.impl.CalculationSetNodeImpl#getNextNode <em>Next Node</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.impl.CalculationSetNodeImpl#getCalculationSet <em>Calculation Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CalculationSetNodeImpl extends AbstractNodeImpl implements CalculationSetNode {
	/**
	 * The cached value of the '{@link #getNextNode() <em>Next Node</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getNextNode()
	 * @generated
	 * @ordered
	 */
	protected AbstractNode nextNode;

	/**
	 * The cached value of the '{@link #getCalculationSet() <em>Calculation Set</em>}' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getCalculationSet()
	 * @generated
	 * @ordered
	 */
	protected CalculationSet calculationSet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CalculationSetNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculationPackage.Literals.CALCULATION_SET_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbstractNode getNextNode() {
		if (nextNode != null && nextNode.eIsProxy()) {
			InternalEObject oldNextNode = (InternalEObject) nextNode;
			nextNode = (AbstractNode) eResolveProxy(oldNextNode);
			if (nextNode != oldNextNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						CalculationPackage.CALCULATION_SET_NODE__NEXT_NODE, oldNextNode, nextNode));
			}
		}
		return nextNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbstractNode basicGetNextNode() {
		return nextNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNextNode(AbstractNode newNextNode) {
		AbstractNode oldNextNode = nextNode;
		nextNode = newNextNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.CALCULATION_SET_NODE__NEXT_NODE,
				oldNextNode, nextNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalculationSet getCalculationSet() {
		if (calculationSet != null && calculationSet.eIsProxy()) {
			InternalEObject oldCalculationSet = (InternalEObject) calculationSet;
			calculationSet = (CalculationSet) eResolveProxy(oldCalculationSet);
			if (calculationSet != oldCalculationSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						CalculationPackage.CALCULATION_SET_NODE__CALCULATION_SET, oldCalculationSet, calculationSet));
			}
		}
		return calculationSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalculationSet basicGetCalculationSet() {
		return calculationSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCalculationSet(CalculationSet newCalculationSet) {
		CalculationSet oldCalculationSet = calculationSet;
		calculationSet = newCalculationSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				CalculationPackage.CALCULATION_SET_NODE__CALCULATION_SET, oldCalculationSet, calculationSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CalculationPackage.CALCULATION_SET_NODE__NEXT_NODE:
			if (resolve)
				return getNextNode();
			return basicGetNextNode();
		case CalculationPackage.CALCULATION_SET_NODE__CALCULATION_SET:
			if (resolve)
				return getCalculationSet();
			return basicGetCalculationSet();
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
		case CalculationPackage.CALCULATION_SET_NODE__NEXT_NODE:
			setNextNode((AbstractNode) newValue);
			return;
		case CalculationPackage.CALCULATION_SET_NODE__CALCULATION_SET:
			setCalculationSet((CalculationSet) newValue);
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
		case CalculationPackage.CALCULATION_SET_NODE__NEXT_NODE:
			setNextNode((AbstractNode) null);
			return;
		case CalculationPackage.CALCULATION_SET_NODE__CALCULATION_SET:
			setCalculationSet((CalculationSet) null);
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
		case CalculationPackage.CALCULATION_SET_NODE__NEXT_NODE:
			return nextNode != null;
		case CalculationPackage.CALCULATION_SET_NODE__CALCULATION_SET:
			return calculationSet != null;
		}
		return super.eIsSet(featureID);
	}

} // CalculationSetNodeImpl
