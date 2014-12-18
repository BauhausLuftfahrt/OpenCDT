/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel.impl;

import java.util.Collection;
import net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface;
import net.bhl.cdt.connector.avl.avlmodel.AVLSection;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;
import net.bhl.cdt.model.system.DecimalNumber;
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
 * An implementation of the model object '<em><b>AVL Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl#getControlSurfaces <em>Control Surfaces</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl#getXle <em>Xle</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl#getYle <em>Yle</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl#getZle <em>Zle</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl#getChord <em>Chord</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl#getAinc <em>Ainc</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl#getNspanwise <em>Nspanwise</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl#getSspace <em>Sspace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AVLSectionImpl extends MinimalEObjectImpl.Container implements AVLSection {
	/**
	 * The cached value of the '{@link #getControlSurfaces() <em>Control Surfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<AVLControlSurface> controlSurfaces;

	/**
	 * The cached value of the '{@link #getXle() <em>Xle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXle()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber xle;

	/**
	 * The cached value of the '{@link #getYle() <em>Yle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYle()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber yle;

	/**
	 * The cached value of the '{@link #getZle() <em>Zle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZle()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber zle;

	/**
	 * The cached value of the '{@link #getChord() <em>Chord</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChord()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber chord;

	/**
	 * The cached value of the '{@link #getAinc() <em>Ainc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAinc()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber ainc;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVLSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvlmodelPackage.Literals.AVL_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AVLControlSurface> getControlSurfaces() {
		if (controlSurfaces == null) {
			controlSurfaces = new EObjectContainmentEList<AVLControlSurface>(AVLControlSurface.class, this, AvlmodelPackage.AVL_SECTION__CONTROL_SURFACES);
		}
		return controlSurfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getXle() {
		if (xle != null && xle.eIsProxy()) {
			InternalEObject oldXle = (InternalEObject)xle;
			xle = (DecimalNumber)eResolveProxy(oldXle);
			if (xle != oldXle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_SECTION__XLE, oldXle, xle));
			}
		}
		return xle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetXle() {
		return xle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXle(DecimalNumber newXle) {
		DecimalNumber oldXle = xle;
		xle = newXle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SECTION__XLE, oldXle, xle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getYle() {
		if (yle != null && yle.eIsProxy()) {
			InternalEObject oldYle = (InternalEObject)yle;
			yle = (DecimalNumber)eResolveProxy(oldYle);
			if (yle != oldYle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_SECTION__YLE, oldYle, yle));
			}
		}
		return yle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetYle() {
		return yle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYle(DecimalNumber newYle) {
		DecimalNumber oldYle = yle;
		yle = newYle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SECTION__YLE, oldYle, yle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getZle() {
		if (zle != null && zle.eIsProxy()) {
			InternalEObject oldZle = (InternalEObject)zle;
			zle = (DecimalNumber)eResolveProxy(oldZle);
			if (zle != oldZle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_SECTION__ZLE, oldZle, zle));
			}
		}
		return zle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetZle() {
		return zle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZle(DecimalNumber newZle) {
		DecimalNumber oldZle = zle;
		zle = newZle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SECTION__ZLE, oldZle, zle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getChord() {
		if (chord != null && chord.eIsProxy()) {
			InternalEObject oldChord = (InternalEObject)chord;
			chord = (DecimalNumber)eResolveProxy(oldChord);
			if (chord != oldChord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_SECTION__CHORD, oldChord, chord));
			}
		}
		return chord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetChord() {
		return chord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChord(DecimalNumber newChord) {
		DecimalNumber oldChord = chord;
		chord = newChord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SECTION__CHORD, oldChord, chord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getAinc() {
		if (ainc != null && ainc.eIsProxy()) {
			InternalEObject oldAinc = (InternalEObject)ainc;
			ainc = (DecimalNumber)eResolveProxy(oldAinc);
			if (ainc != oldAinc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_SECTION__AINC, oldAinc, ainc));
			}
		}
		return ainc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetAinc() {
		return ainc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAinc(DecimalNumber newAinc) {
		DecimalNumber oldAinc = ainc;
		ainc = newAinc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SECTION__AINC, oldAinc, ainc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SECTION__NSPANWISE, oldNspanwise, nspanwise));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_SECTION__SSPACE, oldSspace, sspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AvlmodelPackage.AVL_SECTION__CONTROL_SURFACES:
				return ((InternalEList<?>)getControlSurfaces()).basicRemove(otherEnd, msgs);
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
			case AvlmodelPackage.AVL_SECTION__CONTROL_SURFACES:
				return getControlSurfaces();
			case AvlmodelPackage.AVL_SECTION__XLE:
				if (resolve) return getXle();
				return basicGetXle();
			case AvlmodelPackage.AVL_SECTION__YLE:
				if (resolve) return getYle();
				return basicGetYle();
			case AvlmodelPackage.AVL_SECTION__ZLE:
				if (resolve) return getZle();
				return basicGetZle();
			case AvlmodelPackage.AVL_SECTION__CHORD:
				if (resolve) return getChord();
				return basicGetChord();
			case AvlmodelPackage.AVL_SECTION__AINC:
				if (resolve) return getAinc();
				return basicGetAinc();
			case AvlmodelPackage.AVL_SECTION__NSPANWISE:
				return getNspanwise();
			case AvlmodelPackage.AVL_SECTION__SSPACE:
				return getSspace();
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
			case AvlmodelPackage.AVL_SECTION__CONTROL_SURFACES:
				getControlSurfaces().clear();
				getControlSurfaces().addAll((Collection<? extends AVLControlSurface>)newValue);
				return;
			case AvlmodelPackage.AVL_SECTION__XLE:
				setXle((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_SECTION__YLE:
				setYle((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_SECTION__ZLE:
				setZle((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_SECTION__CHORD:
				setChord((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_SECTION__AINC:
				setAinc((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_SECTION__NSPANWISE:
				setNspanwise((Integer)newValue);
				return;
			case AvlmodelPackage.AVL_SECTION__SSPACE:
				setSspace((Double)newValue);
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
			case AvlmodelPackage.AVL_SECTION__CONTROL_SURFACES:
				getControlSurfaces().clear();
				return;
			case AvlmodelPackage.AVL_SECTION__XLE:
				setXle((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_SECTION__YLE:
				setYle((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_SECTION__ZLE:
				setZle((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_SECTION__CHORD:
				setChord((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_SECTION__AINC:
				setAinc((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_SECTION__NSPANWISE:
				setNspanwise(NSPANWISE_EDEFAULT);
				return;
			case AvlmodelPackage.AVL_SECTION__SSPACE:
				setSspace(SSPACE_EDEFAULT);
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
			case AvlmodelPackage.AVL_SECTION__CONTROL_SURFACES:
				return controlSurfaces != null && !controlSurfaces.isEmpty();
			case AvlmodelPackage.AVL_SECTION__XLE:
				return xle != null;
			case AvlmodelPackage.AVL_SECTION__YLE:
				return yle != null;
			case AvlmodelPackage.AVL_SECTION__ZLE:
				return zle != null;
			case AvlmodelPackage.AVL_SECTION__CHORD:
				return chord != null;
			case AvlmodelPackage.AVL_SECTION__AINC:
				return ainc != null;
			case AvlmodelPackage.AVL_SECTION__NSPANWISE:
				return nspanwise != NSPANWISE_EDEFAULT;
			case AvlmodelPackage.AVL_SECTION__SSPACE:
				return sspace != SSPACE_EDEFAULT;
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
		result.append(" (nspanwise: ");
		result.append(nspanwise);
		result.append(", sspace: ");
		result.append(sspace);
		result.append(')');
		return result.toString();
	}

} //AVLSectionImpl
