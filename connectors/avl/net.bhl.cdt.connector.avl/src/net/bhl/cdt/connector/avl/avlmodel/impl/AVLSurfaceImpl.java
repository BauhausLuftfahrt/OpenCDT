/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel.impl;

import java.util.Collection;
import net.bhl.cdt.connector.avl.avlmodel.AVLSection;
import net.bhl.cdt.connector.avl.avlmodel.AVLSurface;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;
import net.bhl.cdt.connector.avl.avlmodel.SufaceAngle;
import net.bhl.cdt.connector.avl.avlmodel.YDuplicate;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AVL Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl#getYDuplicate <em>YDuplicate</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl#getNchordwise <em>Nchordwise</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl#getNspanwise <em>Nspanwise</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl#getSspace <em>Sspace</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl#getCspace <em>Cspace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AVLSurfaceImpl extends MinimalEObjectImpl.Container implements AVLSurface {
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
	 * The cached value of the '{@link #getYDuplicate() <em>YDuplicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDuplicate()
	 * @generated
	 * @ordered
	 */
	protected YDuplicate yDuplicate;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<AVLSection> sections;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected SufaceAngle angle;

	/**
	 * The default value of the '{@link #getNchordwise() <em>Nchordwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNchordwise()
	 * @generated
	 * @ordered
	 */
	protected static final int NCHORDWISE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNchordwise() <em>Nchordwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNchordwise()
	 * @generated
	 * @ordered
	 */
	protected int nchordwise = NCHORDWISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNspanwise() <em>Nspanwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNspanwise()
	 * @generated
	 * @ordered
	 */
	protected static final int NSPANWISE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNspanwise() <em>Nspanwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNspanwise()
	 * @generated
	 * @ordered
	 */
	protected int nspanwise = NSPANWISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSspace() <em>Sspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSspace()
	 * @generated
	 * @ordered
	 */
	protected static final double SSPACE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSspace() <em>Sspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSspace()
	 * @generated
	 * @ordered
	 */
	protected double sspace = SSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCspace() <em>Cspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCspace()
	 * @generated
	 * @ordered
	 */
	protected static final double CSPACE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCspace() <em>Cspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCspace()
	 * @generated
	 * @ordered
	 */
	protected double cspace = CSPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVLSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvlmodelPackage.Literals.AVL_SURFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SURFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNchordwise() {
		return nchordwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNchordwise(int newNchordwise) {
		int oldNchordwise = nchordwise;
		nchordwise = newNchordwise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SURFACE__NCHORDWISE, oldNchordwise, nchordwise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCspace() {
		return cspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCspace(double newCspace) {
		double oldCspace = cspace;
		cspace = newCspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SURFACE__CSPACE, oldCspace, cspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNspanwise() {
		return nspanwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNspanwise(int newNspanwise) {
		int oldNspanwise = nspanwise;
		nspanwise = newNspanwise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SURFACE__NSPANWISE, oldNspanwise, nspanwise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSspace() {
		return sspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSspace(double newSspace) {
		double oldSspace = sspace;
		sspace = newSspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SURFACE__SSPACE, oldSspace, sspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDuplicate getYDuplicate() {
		return yDuplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYDuplicate(YDuplicate newYDuplicate, NotificationChain msgs) {
		YDuplicate oldYDuplicate = yDuplicate;
		yDuplicate = newYDuplicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SURFACE__YDUPLICATE, oldYDuplicate, newYDuplicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDuplicate(YDuplicate newYDuplicate) {
		if (newYDuplicate != yDuplicate) {
			NotificationChain msgs = null;
			if (yDuplicate != null)
				msgs = ((InternalEObject)yDuplicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvlmodelPackage.AVL_SURFACE__YDUPLICATE, null, msgs);
			if (newYDuplicate != null)
				msgs = ((InternalEObject)newYDuplicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvlmodelPackage.AVL_SURFACE__YDUPLICATE, null, msgs);
			msgs = basicSetYDuplicate(newYDuplicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SURFACE__YDUPLICATE, newYDuplicate, newYDuplicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AVLSection> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<AVLSection>(AVLSection.class, this, AvlmodelPackage.AVL_SURFACE__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SufaceAngle getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(SufaceAngle newAngle, NotificationChain msgs) {
		SufaceAngle oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SURFACE__ANGLE, oldAngle, newAngle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(SufaceAngle newAngle) {
		if (newAngle != angle) {
			NotificationChain msgs = null;
			if (angle != null)
				msgs = ((InternalEObject)angle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvlmodelPackage.AVL_SURFACE__ANGLE, null, msgs);
			if (newAngle != null)
				msgs = ((InternalEObject)newAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvlmodelPackage.AVL_SURFACE__ANGLE, null, msgs);
			msgs = basicSetAngle(newAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SURFACE__ANGLE, newAngle, newAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AvlmodelPackage.AVL_SURFACE__YDUPLICATE:
				return basicSetYDuplicate(null, msgs);
			case AvlmodelPackage.AVL_SURFACE__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
			case AvlmodelPackage.AVL_SURFACE__ANGLE:
				return basicSetAngle(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvlmodelPackage.AVL_SURFACE__NAME:
				return getName();
			case AvlmodelPackage.AVL_SURFACE__YDUPLICATE:
				return getYDuplicate();
			case AvlmodelPackage.AVL_SURFACE__SECTIONS:
				return getSections();
			case AvlmodelPackage.AVL_SURFACE__ANGLE:
				return getAngle();
			case AvlmodelPackage.AVL_SURFACE__NCHORDWISE:
				return getNchordwise();
			case AvlmodelPackage.AVL_SURFACE__NSPANWISE:
				return getNspanwise();
			case AvlmodelPackage.AVL_SURFACE__SSPACE:
				return getSspace();
			case AvlmodelPackage.AVL_SURFACE__CSPACE:
				return getCspace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AvlmodelPackage.AVL_SURFACE__NAME:
				setName((String)newValue);
				return;
			case AvlmodelPackage.AVL_SURFACE__YDUPLICATE:
				setYDuplicate((YDuplicate)newValue);
				return;
			case AvlmodelPackage.AVL_SURFACE__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends AVLSection>)newValue);
				return;
			case AvlmodelPackage.AVL_SURFACE__ANGLE:
				setAngle((SufaceAngle)newValue);
				return;
			case AvlmodelPackage.AVL_SURFACE__NCHORDWISE:
				setNchordwise((Integer)newValue);
				return;
			case AvlmodelPackage.AVL_SURFACE__NSPANWISE:
				setNspanwise((Integer)newValue);
				return;
			case AvlmodelPackage.AVL_SURFACE__SSPACE:
				setSspace((Double)newValue);
				return;
			case AvlmodelPackage.AVL_SURFACE__CSPACE:
				setCspace((Double)newValue);
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
			case AvlmodelPackage.AVL_SURFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AvlmodelPackage.AVL_SURFACE__YDUPLICATE:
				setYDuplicate((YDuplicate)null);
				return;
			case AvlmodelPackage.AVL_SURFACE__SECTIONS:
				getSections().clear();
				return;
			case AvlmodelPackage.AVL_SURFACE__ANGLE:
				setAngle((SufaceAngle)null);
				return;
			case AvlmodelPackage.AVL_SURFACE__NCHORDWISE:
				setNchordwise(NCHORDWISE_EDEFAULT);
				return;
			case AvlmodelPackage.AVL_SURFACE__NSPANWISE:
				setNspanwise(NSPANWISE_EDEFAULT);
				return;
			case AvlmodelPackage.AVL_SURFACE__SSPACE:
				setSspace(SSPACE_EDEFAULT);
				return;
			case AvlmodelPackage.AVL_SURFACE__CSPACE:
				setCspace(CSPACE_EDEFAULT);
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
			case AvlmodelPackage.AVL_SURFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AvlmodelPackage.AVL_SURFACE__YDUPLICATE:
				return yDuplicate != null;
			case AvlmodelPackage.AVL_SURFACE__SECTIONS:
				return sections != null && !sections.isEmpty();
			case AvlmodelPackage.AVL_SURFACE__ANGLE:
				return angle != null;
			case AvlmodelPackage.AVL_SURFACE__NCHORDWISE:
				return nchordwise != NCHORDWISE_EDEFAULT;
			case AvlmodelPackage.AVL_SURFACE__NSPANWISE:
				return nspanwise != NSPANWISE_EDEFAULT;
			case AvlmodelPackage.AVL_SURFACE__SSPACE:
				return sspace != SSPACE_EDEFAULT;
			case AvlmodelPackage.AVL_SURFACE__CSPACE:
				return cspace != CSPACE_EDEFAULT;
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
		result.append(", nchordwise: ");
		result.append(nchordwise);
		result.append(", nspanwise: ");
		result.append(nspanwise);
		result.append(", sspace: ");
		result.append(sspace);
		result.append(", cspace: ");
		result.append(cspace);
		result.append(')');
		return result.toString();
	}

} //AVLSurfaceImpl
