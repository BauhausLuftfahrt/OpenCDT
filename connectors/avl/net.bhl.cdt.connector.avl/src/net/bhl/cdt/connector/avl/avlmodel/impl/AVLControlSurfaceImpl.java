/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel.impl;

import net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;
import net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection;
import net.bhl.cdt.model.geometry.SpaceVector;
import net.bhl.cdt.model.system.DecimalNumber;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AVL Control Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLControlSurfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLControlSurfaceImpl#getCgain <em>Cgain</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLControlSurfaceImpl#getXhinge <em>Xhinge</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLControlSurfaceImpl#getHingeVector <em>Hinge Vector</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLControlSurfaceImpl#getSgnDup <em>Sgn Dup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AVLControlSurfaceImpl extends MinimalEObjectImpl.Container implements AVLControlSurface {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCgain() <em>Cgain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCgain()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber cgain;

	/**
	 * The cached value of the '{@link #getXhinge() <em>Xhinge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXhinge()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber xhinge;

	/**
	 * The cached value of the '{@link #getHingeVector() <em>Hinge Vector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHingeVector()
	 * @generated
	 * @ordered
	 */
	protected SpaceVector hingeVector;

	/**
	 * The default value of the '{@link #getSgnDup() <em>Sgn Dup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgnDup()
	 * @generated
	 * @ordered
	 */
	protected static final SignOfDeflection SGN_DUP_EDEFAULT = SignOfDeflection.ELEVATOR;

	/**
	 * The cached value of the '{@link #getSgnDup() <em>Sgn Dup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgnDup()
	 * @generated
	 * @ordered
	 */
	protected SignOfDeflection sgnDup = SGN_DUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVLControlSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvlmodelPackage.Literals.AVL_CONTROL_SURFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_CONTROL_SURFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getCgain() {
		if (cgain != null && cgain.eIsProxy()) {
			InternalEObject oldCgain = (InternalEObject)cgain;
			cgain = (DecimalNumber)eResolveProxy(oldCgain);
			if (cgain != oldCgain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_CONTROL_SURFACE__CGAIN, oldCgain, cgain));
			}
		}
		return cgain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetCgain() {
		return cgain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCgain(DecimalNumber newCgain) {
		DecimalNumber oldCgain = cgain;
		cgain = newCgain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_CONTROL_SURFACE__CGAIN, oldCgain, cgain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getXhinge() {
		if (xhinge != null && xhinge.eIsProxy()) {
			InternalEObject oldXhinge = (InternalEObject)xhinge;
			xhinge = (DecimalNumber)eResolveProxy(oldXhinge);
			if (xhinge != oldXhinge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_CONTROL_SURFACE__XHINGE, oldXhinge, xhinge));
			}
		}
		return xhinge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetXhinge() {
		return xhinge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXhinge(DecimalNumber newXhinge) {
		DecimalNumber oldXhinge = xhinge;
		xhinge = newXhinge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_CONTROL_SURFACE__XHINGE, oldXhinge, xhinge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceVector getHingeVector() {
		if (hingeVector != null && hingeVector.eIsProxy()) {
			InternalEObject oldHingeVector = (InternalEObject)hingeVector;
			hingeVector = (SpaceVector)eResolveProxy(oldHingeVector);
			if (hingeVector != oldHingeVector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_CONTROL_SURFACE__HINGE_VECTOR, oldHingeVector, hingeVector));
			}
		}
		return hingeVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceVector basicGetHingeVector() {
		return hingeVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHingeVector(SpaceVector newHingeVector) {
		SpaceVector oldHingeVector = hingeVector;
		hingeVector = newHingeVector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_CONTROL_SURFACE__HINGE_VECTOR, oldHingeVector, hingeVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignOfDeflection getSgnDup() {
		return sgnDup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSgnDup(SignOfDeflection newSgnDup) {
		SignOfDeflection oldSgnDup = sgnDup;
		sgnDup = newSgnDup == null ? SGN_DUP_EDEFAULT : newSgnDup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_CONTROL_SURFACE__SGN_DUP, oldSgnDup, sgnDup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvlmodelPackage.AVL_CONTROL_SURFACE__NAME:
				return getName();
			case AvlmodelPackage.AVL_CONTROL_SURFACE__CGAIN:
				if (resolve) return getCgain();
				return basicGetCgain();
			case AvlmodelPackage.AVL_CONTROL_SURFACE__XHINGE:
				if (resolve) return getXhinge();
				return basicGetXhinge();
			case AvlmodelPackage.AVL_CONTROL_SURFACE__HINGE_VECTOR:
				if (resolve) return getHingeVector();
				return basicGetHingeVector();
			case AvlmodelPackage.AVL_CONTROL_SURFACE__SGN_DUP:
				return getSgnDup();
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
			case AvlmodelPackage.AVL_CONTROL_SURFACE__NAME:
				setName((String)newValue);
				return;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__CGAIN:
				setCgain((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__XHINGE:
				setXhinge((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__HINGE_VECTOR:
				setHingeVector((SpaceVector)newValue);
				return;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__SGN_DUP:
				setSgnDup((SignOfDeflection)newValue);
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
			case AvlmodelPackage.AVL_CONTROL_SURFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__CGAIN:
				setCgain((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__XHINGE:
				setXhinge((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__HINGE_VECTOR:
				setHingeVector((SpaceVector)null);
				return;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__SGN_DUP:
				setSgnDup(SGN_DUP_EDEFAULT);
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
			case AvlmodelPackage.AVL_CONTROL_SURFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AvlmodelPackage.AVL_CONTROL_SURFACE__CGAIN:
				return cgain != null;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__XHINGE:
				return xhinge != null;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__HINGE_VECTOR:
				return hingeVector != null;
			case AvlmodelPackage.AVL_CONTROL_SURFACE__SGN_DUP:
				return sgnDup != SGN_DUP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", sgnDup: ");
		result.append(sgnDup);
		result.append(')');
		return result.toString();
	}

} //AVLControlSurfaceImpl
