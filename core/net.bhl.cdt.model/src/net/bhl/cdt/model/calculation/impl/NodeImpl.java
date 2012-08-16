/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import net.bhl.cdt.model.calculation.AbstractNode;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.calculation.impl.NodeImpl#getNextNode <em>Next Node</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.impl.NodeImpl#getCalculation <em>Calculation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends AbstractNodeImpl implements Node {
	/**
	 * The cached value of the '{@link #getNextNode() <em>Next Node</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNextNode()
	 * @generated
	 * @ordered
	 */
	protected AbstractNode nextNode;

	/**
	 * The cached value of the '{@link #getCalculation() <em>Calculation</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCalculation()
	 * @generated
	 * @ordered
	 */
	protected Calculation calculation;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculationPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode getNextNode() {
		if (nextNode != null && nextNode.eIsProxy()) {
			InternalEObject oldNextNode = (InternalEObject)nextNode;
			nextNode = (AbstractNode)eResolveProxy(oldNextNode);
			if (nextNode != oldNextNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculationPackage.NODE__NEXT_NODE, oldNextNode, nextNode));
			}
		}
		return nextNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode basicGetNextNode() {
		return nextNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextNode(AbstractNode newNextNode) {
		AbstractNode oldNextNode = nextNode;
		nextNode = newNextNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.NODE__NEXT_NODE, oldNextNode, nextNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Calculation getCalculation() {
		if (calculation != null && calculation.eIsProxy()) {
			InternalEObject oldCalculation = (InternalEObject)calculation;
			calculation = (Calculation)eResolveProxy(oldCalculation);
			if (calculation != oldCalculation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculationPackage.NODE__CALCULATION, oldCalculation, calculation));
			}
		}
		return calculation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Calculation basicGetCalculation() {
		return calculation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculation(Calculation newCalculation) {
		Calculation oldCalculation = calculation;
		calculation = newCalculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.NODE__CALCULATION, oldCalculation, calculation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CalculationPackage.NODE__NEXT_NODE:
				if (resolve) return getNextNode();
				return basicGetNextNode();
			case CalculationPackage.NODE__CALCULATION:
				if (resolve) return getCalculation();
				return basicGetCalculation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CalculationPackage.NODE__NEXT_NODE:
				setNextNode((AbstractNode)newValue);
				return;
			case CalculationPackage.NODE__CALCULATION:
				setCalculation((Calculation)newValue);
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
			case CalculationPackage.NODE__NEXT_NODE:
				setNextNode((AbstractNode)null);
				return;
			case CalculationPackage.NODE__CALCULATION:
				setCalculation((Calculation)null);
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
			case CalculationPackage.NODE__NEXT_NODE:
				return nextNode != null;
			case CalculationPackage.NODE__CALCULATION:
				return calculation != null;
		}
		return super.eIsSet(featureID);
	}

} // NodeImpl
