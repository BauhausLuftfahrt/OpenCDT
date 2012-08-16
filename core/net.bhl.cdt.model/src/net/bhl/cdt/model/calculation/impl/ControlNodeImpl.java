/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import java.util.Collection;

import net.bhl.cdt.model.calculation.AbstractNode;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.Condition;
import net.bhl.cdt.model.calculation.ControlNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Control Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.calculation.impl.ControlNodeImpl#getNextTrue <em>Next True</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.impl.ControlNodeImpl#getNextFalse <em>Next False</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.impl.ControlNodeImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ControlNodeImpl extends AbstractNodeImpl implements ControlNode {
	/**
	 * The cached value of the '{@link #getNextTrue() <em>Next True</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNextTrue()
	 * @generated
	 * @ordered
	 */
	protected AbstractNode nextTrue;

	/**
	 * The cached value of the '{@link #getNextFalse() <em>Next False</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNextFalse()
	 * @generated
	 * @ordered
	 */
	protected AbstractNode nextFalse;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> condition;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculationPackage.Literals.CONTROL_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode getNextTrue() {
		if (nextTrue != null && nextTrue.eIsProxy()) {
			InternalEObject oldNextTrue = (InternalEObject)nextTrue;
			nextTrue = (AbstractNode)eResolveProxy(oldNextTrue);
			if (nextTrue != oldNextTrue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculationPackage.CONTROL_NODE__NEXT_TRUE, oldNextTrue, nextTrue));
			}
		}
		return nextTrue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode basicGetNextTrue() {
		return nextTrue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextTrue(AbstractNode newNextTrue) {
		AbstractNode oldNextTrue = nextTrue;
		nextTrue = newNextTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.CONTROL_NODE__NEXT_TRUE, oldNextTrue, nextTrue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode getNextFalse() {
		if (nextFalse != null && nextFalse.eIsProxy()) {
			InternalEObject oldNextFalse = (InternalEObject)nextFalse;
			nextFalse = (AbstractNode)eResolveProxy(oldNextFalse);
			if (nextFalse != oldNextFalse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculationPackage.CONTROL_NODE__NEXT_FALSE, oldNextFalse, nextFalse));
			}
		}
		return nextFalse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode basicGetNextFalse() {
		return nextFalse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFalse(AbstractNode newNextFalse) {
		AbstractNode oldNextFalse = nextFalse;
		nextFalse = newNextFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.CONTROL_NODE__NEXT_FALSE, oldNextFalse, nextFalse));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList.Resolving<Condition>(Condition.class, this, CalculationPackage.CONTROL_NODE__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculationPackage.CONTROL_NODE__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
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
			case CalculationPackage.CONTROL_NODE__NEXT_TRUE:
				if (resolve) return getNextTrue();
				return basicGetNextTrue();
			case CalculationPackage.CONTROL_NODE__NEXT_FALSE:
				if (resolve) return getNextFalse();
				return basicGetNextFalse();
			case CalculationPackage.CONTROL_NODE__CONDITION:
				return getCondition();
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
			case CalculationPackage.CONTROL_NODE__NEXT_TRUE:
				setNextTrue((AbstractNode)newValue);
				return;
			case CalculationPackage.CONTROL_NODE__NEXT_FALSE:
				setNextFalse((AbstractNode)newValue);
				return;
			case CalculationPackage.CONTROL_NODE__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Condition>)newValue);
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
			case CalculationPackage.CONTROL_NODE__NEXT_TRUE:
				setNextTrue((AbstractNode)null);
				return;
			case CalculationPackage.CONTROL_NODE__NEXT_FALSE:
				setNextFalse((AbstractNode)null);
				return;
			case CalculationPackage.CONTROL_NODE__CONDITION:
				getCondition().clear();
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
			case CalculationPackage.CONTROL_NODE__NEXT_TRUE:
				return nextTrue != null;
			case CalculationPackage.CONTROL_NODE__NEXT_FALSE:
				return nextFalse != null;
			case CalculationPackage.CONTROL_NODE__CONDITION:
				return condition != null && !condition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ControlNodeImpl
