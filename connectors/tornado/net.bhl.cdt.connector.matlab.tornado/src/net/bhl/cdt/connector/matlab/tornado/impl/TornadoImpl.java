/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.matlab.tornado.impl;

import java.util.Collection;
import net.bhl.cdt.connector.matlab.tornado.Tornado;
import net.bhl.cdt.connector.matlab.tornado.TornadoGeometry;
import net.bhl.cdt.connector.matlab.tornado.TornadoPackage;
import net.bhl.cdt.connector.matlab.tornado.TornadoState;
import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.OperationWithOutput;
import net.bhl.cdt.model.process.designoperations.impl.DisciplineToolServiceImpl;
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
 * An implementation of the model object '<em><b>Tornado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoImpl#getGeneratedElements <em>Generated Elements</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoImpl#getTornadoGeometry <em>Tornado Geometry</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoImpl#getTornadoState <em>Tornado State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public  class TornadoImpl extends DisciplineToolServiceImpl implements Tornado {
	/**
	 * The cached value of the '{@link #getGeneratedElements() <em>Generated Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratableElement> generatedElements;
	/**
	 * The cached value of the '{@link #getTornadoGeometry() <em>Tornado Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTornadoGeometry()
	 * @generated
	 * @ordered
	 */
	protected TornadoGeometry tornadoGeometry;
	/**
	 * The cached value of the '{@link #getTornadoState() <em>Tornado State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTornadoState()
	 * @generated
	 * @ordered
	 */
	protected TornadoState tornadoState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TornadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TornadoPackage.Literals.TORNADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratableElement> getGeneratedElements() {
		if (generatedElements == null) {
			generatedElements = new EObjectContainmentEList<GeneratableElement>(GeneratableElement.class, this, TornadoPackage.TORNADO__GENERATED_ELEMENTS);
		}
		return generatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TornadoGeometry getTornadoGeometry() {
		return tornadoGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTornadoGeometry(TornadoGeometry newTornadoGeometry, NotificationChain msgs) {
		TornadoGeometry oldTornadoGeometry = tornadoGeometry;
		tornadoGeometry = newTornadoGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TornadoPackage.TORNADO__TORNADO_GEOMETRY, oldTornadoGeometry, newTornadoGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTornadoGeometry(TornadoGeometry newTornadoGeometry) {
		if (newTornadoGeometry != tornadoGeometry) {
			NotificationChain msgs = null;
			if (tornadoGeometry != null)
				msgs = ((InternalEObject)tornadoGeometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TornadoPackage.TORNADO__TORNADO_GEOMETRY, null, msgs);
			if (newTornadoGeometry != null)
				msgs = ((InternalEObject)newTornadoGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TornadoPackage.TORNADO__TORNADO_GEOMETRY, null, msgs);
			msgs = basicSetTornadoGeometry(newTornadoGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TornadoPackage.TORNADO__TORNADO_GEOMETRY, newTornadoGeometry, newTornadoGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TornadoState getTornadoState() {
		return tornadoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTornadoState(TornadoState newTornadoState, NotificationChain msgs) {
		TornadoState oldTornadoState = tornadoState;
		tornadoState = newTornadoState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TornadoPackage.TORNADO__TORNADO_STATE, oldTornadoState, newTornadoState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTornadoState(TornadoState newTornadoState) {
		if (newTornadoState != tornadoState) {
			NotificationChain msgs = null;
			if (tornadoState != null)
				msgs = ((InternalEObject)tornadoState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TornadoPackage.TORNADO__TORNADO_STATE, null, msgs);
			if (newTornadoState != null)
				msgs = ((InternalEObject)newTornadoState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TornadoPackage.TORNADO__TORNADO_STATE, null, msgs);
			msgs = basicSetTornadoState(newTornadoState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TornadoPackage.TORNADO__TORNADO_STATE, newTornadoState, newTornadoState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TornadoPackage.TORNADO__GENERATED_ELEMENTS:
				return ((InternalEList<?>)getGeneratedElements()).basicRemove(otherEnd, msgs);
			case TornadoPackage.TORNADO__TORNADO_GEOMETRY:
				return basicSetTornadoGeometry(null, msgs);
			case TornadoPackage.TORNADO__TORNADO_STATE:
				return basicSetTornadoState(null, msgs);
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
			case TornadoPackage.TORNADO__GENERATED_ELEMENTS:
				return getGeneratedElements();
			case TornadoPackage.TORNADO__TORNADO_GEOMETRY:
				return getTornadoGeometry();
			case TornadoPackage.TORNADO__TORNADO_STATE:
				return getTornadoState();
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
			case TornadoPackage.TORNADO__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				getGeneratedElements().addAll((Collection<? extends GeneratableElement>)newValue);
				return;
			case TornadoPackage.TORNADO__TORNADO_GEOMETRY:
				setTornadoGeometry((TornadoGeometry)newValue);
				return;
			case TornadoPackage.TORNADO__TORNADO_STATE:
				setTornadoState((TornadoState)newValue);
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
			case TornadoPackage.TORNADO__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				return;
			case TornadoPackage.TORNADO__TORNADO_GEOMETRY:
				setTornadoGeometry((TornadoGeometry)null);
				return;
			case TornadoPackage.TORNADO__TORNADO_STATE:
				setTornadoState((TornadoState)null);
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
			case TornadoPackage.TORNADO__GENERATED_ELEMENTS:
				return generatedElements != null && !generatedElements.isEmpty();
			case TornadoPackage.TORNADO__TORNADO_GEOMETRY:
				return tornadoGeometry != null;
			case TornadoPackage.TORNADO__TORNADO_STATE:
				return tornadoState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OperationWithOutput.class) {
			switch (derivedFeatureID) {
				case TornadoPackage.TORNADO__GENERATED_ELEMENTS: return ModelPackage.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OperationWithOutput.class) {
			switch (baseFeatureID) {
				case ModelPackage.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS: return TornadoPackage.TORNADO__GENERATED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


} //TornadoImpl
