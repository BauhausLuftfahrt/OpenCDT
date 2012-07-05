/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview.impl;

import net.bhl.cdt.model.impl.ElementImpl;
import net.bhl.cdt.model.modelview.ModelviewPackage;
import net.bhl.cdt.model.modelview.ViewLink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.ViewLinkImpl#getVirtualParent <em>Virtual Parent</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.ViewLinkImpl#getVirtualChild <em>Virtual Child</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelviewPackage.Literals.VIEW_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVirtualParent() {
		if (virtualParent != null && virtualParent.eIsProxy()) {
			InternalEObject oldVirtualParent = (InternalEObject)virtualParent;
			virtualParent = eResolveProxy(oldVirtualParent);
			if (virtualParent != oldVirtualParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelviewPackage.VIEW_LINK__VIRTUAL_PARENT, oldVirtualParent, virtualParent));
			}
		}
		return virtualParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetVirtualParent() {
		return virtualParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualParent(EObject newVirtualParent) {
		EObject oldVirtualParent = virtualParent;
		virtualParent = newVirtualParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelviewPackage.VIEW_LINK__VIRTUAL_PARENT, oldVirtualParent, virtualParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVirtualChild() {
		if (virtualChild != null && virtualChild.eIsProxy()) {
			InternalEObject oldVirtualChild = (InternalEObject)virtualChild;
			virtualChild = eResolveProxy(oldVirtualChild);
			if (virtualChild != oldVirtualChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelviewPackage.VIEW_LINK__VIRTUAL_CHILD, oldVirtualChild, virtualChild));
			}
		}
		return virtualChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetVirtualChild() {
		return virtualChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualChild(EObject newVirtualChild) {
		EObject oldVirtualChild = virtualChild;
		virtualChild = newVirtualChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelviewPackage.VIEW_LINK__VIRTUAL_CHILD, oldVirtualChild, virtualChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelviewPackage.VIEW_LINK__VIRTUAL_PARENT:
				if (resolve) return getVirtualParent();
				return basicGetVirtualParent();
			case ModelviewPackage.VIEW_LINK__VIRTUAL_CHILD:
				if (resolve) return getVirtualChild();
				return basicGetVirtualChild();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelviewPackage.VIEW_LINK__VIRTUAL_PARENT:
				setVirtualParent((EObject)newValue);
				return;
			case ModelviewPackage.VIEW_LINK__VIRTUAL_CHILD:
				setVirtualChild((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelviewPackage.VIEW_LINK__VIRTUAL_PARENT:
				setVirtualParent((EObject)null);
				return;
			case ModelviewPackage.VIEW_LINK__VIRTUAL_CHILD:
				setVirtualChild((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelviewPackage.VIEW_LINK__VIRTUAL_PARENT:
				return virtualParent != null;
			case ModelviewPackage.VIEW_LINK__VIRTUAL_CHILD:
				return virtualChild != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewLinkImpl
