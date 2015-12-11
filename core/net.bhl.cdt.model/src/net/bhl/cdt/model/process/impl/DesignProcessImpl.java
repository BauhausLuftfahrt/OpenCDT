/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.impl;

import java.util.Collection;

import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.ProcessPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Design Process</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.impl.DesignProcessImpl#getDesignProcessElements <em>Design Process Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignProcessImpl extends ProcessElementImpl implements DesignProcess {
	/**
	 * The cached value of the '{@link #getDesignProcessElements() <em>Design Process Elements</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDesignProcessElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessElement> designProcessElements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.DESIGN_PROCESS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessElement> getDesignProcessElements() {
		if (designProcessElements == null) {
			designProcessElements = new EObjectContainmentEList<ProcessElement>(ProcessElement.class, this, ProcessPackage.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS);
		}
		return designProcessElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS:
				return ((InternalEList<?>)getDesignProcessElements()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS:
				return getDesignProcessElements();
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
			case ProcessPackage.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS:
				getDesignProcessElements().clear();
				getDesignProcessElements().addAll((Collection<? extends ProcessElement>)newValue);
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
			case ProcessPackage.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS:
				getDesignProcessElements().clear();
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
			case ProcessPackage.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS:
				return designProcessElements != null && !designProcessElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DesignProcessImpl
