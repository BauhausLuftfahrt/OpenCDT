/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.impl;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.ViewLink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>View Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.impl.ViewLinkImpl#getVirtualParent <em>Virtual Parent</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ViewLinkImpl#getVirtualChild <em>Virtual Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewLinkImpl extends ElementImpl implements ViewLink {
	/**
	 * The cached value of the '{@link #getVirtualParent() <em>Virtual Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualParent()
	 * @generated
	 * @ordered
	 */
	protected EObject virtualParent;

	/**
	 * The cached value of the '{@link #getVirtualChild() <em>Virtual Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualChild()
	 * @generated
	 * @ordered
	 */
	protected EObject virtualChild;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VIEW_LINK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVirtualParent() {
		if (virtualParent != null && virtualParent.eIsProxy()) {
			InternalEObject oldVirtualParent = (InternalEObject)virtualParent;
			virtualParent = eResolveProxy(oldVirtualParent);
			if (virtualParent != oldVirtualParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.VIEW_LINK__VIRTUAL_PARENT, oldVirtualParent, virtualParent));
			}
		}
		return virtualParent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetVirtualParent() {
		return virtualParent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualParent(EObject newVirtualParent) {
		EObject oldVirtualParent = virtualParent;
		virtualParent = newVirtualParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VIEW_LINK__VIRTUAL_PARENT, oldVirtualParent, virtualParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVirtualChild() {
		if (virtualChild != null && virtualChild.eIsProxy()) {
			InternalEObject oldVirtualChild = (InternalEObject)virtualChild;
			virtualChild = eResolveProxy(oldVirtualChild);
			if (virtualChild != oldVirtualChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.VIEW_LINK__VIRTUAL_CHILD, oldVirtualChild, virtualChild));
			}
		}
		return virtualChild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetVirtualChild() {
		return virtualChild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualChild(EObject newVirtualChild) {
		EObject oldVirtualChild = virtualChild;
		virtualChild = newVirtualChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VIEW_LINK__VIRTUAL_CHILD, oldVirtualChild, virtualChild));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.VIEW_LINK__VIRTUAL_PARENT:
				if (resolve) return getVirtualParent();
				return basicGetVirtualParent();
			case ModelPackage.VIEW_LINK__VIRTUAL_CHILD:
				if (resolve) return getVirtualChild();
				return basicGetVirtualChild();
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
			case ModelPackage.VIEW_LINK__VIRTUAL_PARENT:
				setVirtualParent((EObject)newValue);
				return;
			case ModelPackage.VIEW_LINK__VIRTUAL_CHILD:
				setVirtualChild((EObject)newValue);
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
			case ModelPackage.VIEW_LINK__VIRTUAL_PARENT:
				setVirtualParent((EObject)null);
				return;
			case ModelPackage.VIEW_LINK__VIRTUAL_CHILD:
				setVirtualChild((EObject)null);
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
			case ModelPackage.VIEW_LINK__VIRTUAL_PARENT:
				return virtualParent != null;
			case ModelPackage.VIEW_LINK__VIRTUAL_CHILD:
				return virtualChild != null;
		}
		return super.eIsSet(featureID);
	}

} // ViewLinkImpl
