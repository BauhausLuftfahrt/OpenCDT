/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel.impl;

import java.util.Collection;
import net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator;
import net.bhl.cdt.connector.avl.avlmodel.AVLSurface;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;
import net.bhl.cdt.connector.avl.avlmodel.SymmetryType;
import net.bhl.cdt.connector.files.impl.FileGeneratorImpl;
import net.bhl.cdt.model.system.DecimalNumber;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AVL Model Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getSurfaces <em>Surfaces</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getMach <em>Mach</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getZsym <em>Zsym</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getSref <em>Sref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getCref <em>Cref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getBref <em>Bref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getYref <em>Yref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getZref <em>Zref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getIYsym <em>IYsym</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl#getIZSym <em>IZ Sym</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AVLModelGeneratorImpl extends FileGeneratorImpl implements AVLModelGenerator {
	/**
	 * The cached value of the '{@link #getSurfaces() <em>Surfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<AVLSurface> surfaces;

	/**
	 * The cached value of the '{@link #getMach() <em>Mach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMach()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber mach;

	/**
	 * The cached value of the '{@link #getZsym() <em>Zsym</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZsym()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber zsym;

	/**
	 * The cached value of the '{@link #getSref() <em>Sref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSref()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber sref;

	/**
	 * The cached value of the '{@link #getCref() <em>Cref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCref()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber cref;

	/**
	 * The cached value of the '{@link #getBref() <em>Bref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBref()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber bref;

	/**
	 * The cached value of the '{@link #getXref() <em>Xref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXref()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber xref;

	/**
	 * The cached value of the '{@link #getYref() <em>Yref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYref()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber yref;

	/**
	 * The cached value of the '{@link #getZref() <em>Zref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZref()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber zref;

	/**
	 * The default value of the '{@link #getIYsym() <em>IYsym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIYsym()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetryType IYSYM_EDEFAULT = SymmetryType.SYMMETRIC;

	/**
	 * The cached value of the '{@link #getIYsym() <em>IYsym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIYsym()
	 * @generated
	 * @ordered
	 */
	protected SymmetryType iYsym = IYSYM_EDEFAULT;

	/**
	 * The default value of the '{@link #getIZSym() <em>IZ Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIZSym()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetryType IZ_SYM_EDEFAULT = SymmetryType.SYMMETRIC;

	/**
	 * The cached value of the '{@link #getIZSym() <em>IZ Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIZSym()
	 * @generated
	 * @ordered
	 */
	protected SymmetryType iZSym = IZ_SYM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVLModelGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvlmodelPackage.Literals.AVL_MODEL_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AVLSurface> getSurfaces() {
		if (surfaces == null) {
			surfaces = new EObjectContainmentEList<AVLSurface>(AVLSurface.class, this, AvlmodelPackage.AVL_MODEL_GENERATOR__SURFACES);
		}
		return surfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getMach() {
		if (mach != null && mach.eIsProxy()) {
			InternalEObject oldMach = (InternalEObject)mach;
			mach = (DecimalNumber)eResolveProxy(oldMach);
			if (mach != oldMach) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_MODEL_GENERATOR__MACH, oldMach, mach));
			}
		}
		return mach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetMach() {
		return mach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMach(DecimalNumber newMach) {
		DecimalNumber oldMach = mach;
		mach = newMach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_MODEL_GENERATOR__MACH, oldMach, mach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType getIYsym() {
		return iYsym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIYsym(SymmetryType newIYsym) {
		SymmetryType oldIYsym = iYsym;
		iYsym = newIYsym == null ? IYSYM_EDEFAULT : newIYsym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_MODEL_GENERATOR__IYSYM, oldIYsym, iYsym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType getIZSym() {
		return iZSym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIZSym(SymmetryType newIZSym) {
		SymmetryType oldIZSym = iZSym;
		iZSym = newIZSym == null ? IZ_SYM_EDEFAULT : newIZSym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_MODEL_GENERATOR__IZ_SYM, oldIZSym, iZSym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getZsym() {
		if (zsym != null && zsym.eIsProxy()) {
			InternalEObject oldZsym = (InternalEObject)zsym;
			zsym = (DecimalNumber)eResolveProxy(oldZsym);
			if (zsym != oldZsym) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_MODEL_GENERATOR__ZSYM, oldZsym, zsym));
			}
		}
		return zsym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetZsym() {
		return zsym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZsym(DecimalNumber newZsym) {
		DecimalNumber oldZsym = zsym;
		zsym = newZsym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_MODEL_GENERATOR__ZSYM, oldZsym, zsym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getSref() {
		if (sref != null && sref.eIsProxy()) {
			InternalEObject oldSref = (InternalEObject)sref;
			sref = (DecimalNumber)eResolveProxy(oldSref);
			if (sref != oldSref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_MODEL_GENERATOR__SREF, oldSref, sref));
			}
		}
		return sref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetSref() {
		return sref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSref(DecimalNumber newSref) {
		DecimalNumber oldSref = sref;
		sref = newSref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_MODEL_GENERATOR__SREF, oldSref, sref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getCref() {
		if (cref != null && cref.eIsProxy()) {
			InternalEObject oldCref = (InternalEObject)cref;
			cref = (DecimalNumber)eResolveProxy(oldCref);
			if (cref != oldCref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_MODEL_GENERATOR__CREF, oldCref, cref));
			}
		}
		return cref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetCref() {
		return cref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCref(DecimalNumber newCref) {
		DecimalNumber oldCref = cref;
		cref = newCref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_MODEL_GENERATOR__CREF, oldCref, cref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getBref() {
		if (bref != null && bref.eIsProxy()) {
			InternalEObject oldBref = (InternalEObject)bref;
			bref = (DecimalNumber)eResolveProxy(oldBref);
			if (bref != oldBref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_MODEL_GENERATOR__BREF, oldBref, bref));
			}
		}
		return bref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetBref() {
		return bref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBref(DecimalNumber newBref) {
		DecimalNumber oldBref = bref;
		bref = newBref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_MODEL_GENERATOR__BREF, oldBref, bref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getXref() {
		if (xref != null && xref.eIsProxy()) {
			InternalEObject oldXref = (InternalEObject)xref;
			xref = (DecimalNumber)eResolveProxy(oldXref);
			if (xref != oldXref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_MODEL_GENERATOR__XREF, oldXref, xref));
			}
		}
		return xref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetXref() {
		return xref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXref(DecimalNumber newXref) {
		DecimalNumber oldXref = xref;
		xref = newXref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_MODEL_GENERATOR__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getYref() {
		if (yref != null && yref.eIsProxy()) {
			InternalEObject oldYref = (InternalEObject)yref;
			yref = (DecimalNumber)eResolveProxy(oldYref);
			if (yref != oldYref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_MODEL_GENERATOR__YREF, oldYref, yref));
			}
		}
		return yref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetYref() {
		return yref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYref(DecimalNumber newYref) {
		DecimalNumber oldYref = yref;
		yref = newYref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_MODEL_GENERATOR__YREF, oldYref, yref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getZref() {
		if (zref != null && zref.eIsProxy()) {
			InternalEObject oldZref = (InternalEObject)zref;
			zref = (DecimalNumber)eResolveProxy(oldZref);
			if (zref != oldZref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.AVL_MODEL_GENERATOR__ZREF, oldZref, zref));
			}
		}
		return zref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetZref() {
		return zref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZref(DecimalNumber newZref) {
		DecimalNumber oldZref = zref;
		zref = newZref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.AVL_MODEL_GENERATOR__ZREF, oldZref, zref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AvlmodelPackage.AVL_MODEL_GENERATOR__SURFACES:
				return ((InternalEList<?>)getSurfaces()).basicRemove(otherEnd, msgs);
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
			case AvlmodelPackage.AVL_MODEL_GENERATOR__SURFACES:
				return getSurfaces();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__MACH:
				if (resolve) return getMach();
				return basicGetMach();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__ZSYM:
				if (resolve) return getZsym();
				return basicGetZsym();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__SREF:
				if (resolve) return getSref();
				return basicGetSref();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__CREF:
				if (resolve) return getCref();
				return basicGetCref();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__BREF:
				if (resolve) return getBref();
				return basicGetBref();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__XREF:
				if (resolve) return getXref();
				return basicGetXref();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__YREF:
				if (resolve) return getYref();
				return basicGetYref();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__ZREF:
				if (resolve) return getZref();
				return basicGetZref();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__IYSYM:
				return getIYsym();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__IZ_SYM:
				return getIZSym();
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
			case AvlmodelPackage.AVL_MODEL_GENERATOR__SURFACES:
				getSurfaces().clear();
				getSurfaces().addAll((Collection<? extends AVLSurface>)newValue);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__MACH:
				setMach((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__ZSYM:
				setZsym((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__SREF:
				setSref((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__CREF:
				setCref((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__BREF:
				setBref((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__XREF:
				setXref((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__YREF:
				setYref((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__ZREF:
				setZref((DecimalNumber)newValue);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__IYSYM:
				setIYsym((SymmetryType)newValue);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__IZ_SYM:
				setIZSym((SymmetryType)newValue);
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
			case AvlmodelPackage.AVL_MODEL_GENERATOR__SURFACES:
				getSurfaces().clear();
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__MACH:
				setMach((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__ZSYM:
				setZsym((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__SREF:
				setSref((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__CREF:
				setCref((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__BREF:
				setBref((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__XREF:
				setXref((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__YREF:
				setYref((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__ZREF:
				setZref((DecimalNumber)null);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__IYSYM:
				setIYsym(IYSYM_EDEFAULT);
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__IZ_SYM:
				setIZSym(IZ_SYM_EDEFAULT);
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
			case AvlmodelPackage.AVL_MODEL_GENERATOR__SURFACES:
				return surfaces != null && !surfaces.isEmpty();
			case AvlmodelPackage.AVL_MODEL_GENERATOR__MACH:
				return mach != null;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__ZSYM:
				return zsym != null;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__SREF:
				return sref != null;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__CREF:
				return cref != null;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__BREF:
				return bref != null;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__XREF:
				return xref != null;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__YREF:
				return yref != null;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__ZREF:
				return zref != null;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__IYSYM:
				return iYsym != IYSYM_EDEFAULT;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__IZ_SYM:
				return iZSym != IZ_SYM_EDEFAULT;
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
		result.append(" (iYsym: ");
		result.append(iYsym);
		result.append(", iZSym: ");
		result.append(iZSym);
		result.append(')');
		return result.toString();
	}

} //AVLModelGeneratorImpl
