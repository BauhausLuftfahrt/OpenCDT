/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.resources.impl;

import net.bhl.cdt.resources.FunctionalData;
import net.bhl.cdt.resources.ResourceDescriptor;
import net.bhl.cdt.resources.ResourcesPackage;
import net.bhl.cdt.resources.StructuralData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource Descriptor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.resources.impl.ResourceDescriptorImpl#getURI <em>URI
 * </em>}</li>
 * <li>
 * {@link net.bhl.cdt.resources.impl.ResourceDescriptorImpl#getStructrualData
 * <em>Structrual Data</em>}</li>
 * <li>
 * {@link net.bhl.cdt.resources.impl.ResourceDescriptorImpl#getFunctionalData
 * <em>Functional Data</em>}</li>
 * <li>{@link net.bhl.cdt.resources.impl.ResourceDescriptorImpl#getName <em>Name
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ResourceDescriptorImpl extends EObjectImpl implements
		ResourceDescriptor {
	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructrualData()
	 * <em>Structrual Data</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getStructrualData()
	 * @generated
	 * @ordered
	 */
	protected StructuralData structrualData;

	/**
	 * The cached value of the '{@link #getFunctionalData()
	 * <em>Functional Data</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctionalData()
	 * @generated
	 * @ordered
	 */
	protected FunctionalData functionalData;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResourceDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.RESOURCE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ResourcesPackage.RESOURCE_DESCRIPTOR__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StructuralData getStructrualData() {
		if (structrualData != null && structrualData.eIsProxy()) {
			InternalEObject oldStructrualData = (InternalEObject) structrualData;
			structrualData = (StructuralData) eResolveProxy(oldStructrualData);
			if (structrualData != oldStructrualData) {
				InternalEObject newStructrualData = (InternalEObject) structrualData;
				NotificationChain msgs = oldStructrualData
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA,
								null, null);
				if (newStructrualData.eInternalContainer() == null) {
					msgs = newStructrualData
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA,
							oldStructrualData, structrualData));
			}
		}
		return structrualData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StructuralData basicGetStructrualData() {
		return structrualData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStructrualData(
			StructuralData newStructrualData, NotificationChain msgs) {
		StructuralData oldStructrualData = structrualData;
		structrualData = newStructrualData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA,
					oldStructrualData, newStructrualData);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStructrualData(StructuralData newStructrualData) {
		if (newStructrualData != structrualData) {
			NotificationChain msgs = null;
			if (structrualData != null)
				msgs = ((InternalEObject) structrualData)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA,
								null, msgs);
			if (newStructrualData != null)
				msgs = ((InternalEObject) newStructrualData)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA,
								null, msgs);
			msgs = basicSetStructrualData(newStructrualData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA,
					newStructrualData, newStructrualData));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionalData getFunctionalData() {
		if (functionalData != null && functionalData.eIsProxy()) {
			InternalEObject oldFunctionalData = (InternalEObject) functionalData;
			functionalData = (FunctionalData) eResolveProxy(oldFunctionalData);
			if (functionalData != oldFunctionalData) {
				InternalEObject newFunctionalData = (InternalEObject) functionalData;
				NotificationChain msgs = oldFunctionalData
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA,
								null, null);
				if (newFunctionalData.eInternalContainer() == null) {
					msgs = newFunctionalData
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA,
							oldFunctionalData, functionalData));
			}
		}
		return functionalData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionalData basicGetFunctionalData() {
		return functionalData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFunctionalData(
			FunctionalData newFunctionalData, NotificationChain msgs) {
		FunctionalData oldFunctionalData = functionalData;
		functionalData = newFunctionalData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA,
					oldFunctionalData, newFunctionalData);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFunctionalData(FunctionalData newFunctionalData) {
		if (newFunctionalData != functionalData) {
			NotificationChain msgs = null;
			if (functionalData != null)
				msgs = ((InternalEObject) functionalData)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA,
								null, msgs);
			if (newFunctionalData != null)
				msgs = ((InternalEObject) newFunctionalData)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA,
								null, msgs);
			msgs = basicSetFunctionalData(newFunctionalData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA,
					newFunctionalData, newFunctionalData));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ResourcesPackage.RESOURCE_DESCRIPTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA:
			return basicSetStructrualData(null, msgs);
		case ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA:
			return basicSetFunctionalData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ResourcesPackage.RESOURCE_DESCRIPTOR__URI:
			return getURI();
		case ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA:
			if (resolve)
				return getStructrualData();
			return basicGetStructrualData();
		case ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA:
			if (resolve)
				return getFunctionalData();
			return basicGetFunctionalData();
		case ResourcesPackage.RESOURCE_DESCRIPTOR__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ResourcesPackage.RESOURCE_DESCRIPTOR__URI:
			setURI((String) newValue);
			return;
		case ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA:
			setStructrualData((StructuralData) newValue);
			return;
		case ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA:
			setFunctionalData((FunctionalData) newValue);
			return;
		case ResourcesPackage.RESOURCE_DESCRIPTOR__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ResourcesPackage.RESOURCE_DESCRIPTOR__URI:
			setURI(URI_EDEFAULT);
			return;
		case ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA:
			setStructrualData((StructuralData) null);
			return;
		case ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA:
			setFunctionalData((FunctionalData) null);
			return;
		case ResourcesPackage.RESOURCE_DESCRIPTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ResourcesPackage.RESOURCE_DESCRIPTOR__URI:
			return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT
					.equals(uri);
		case ResourcesPackage.RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA:
			return structrualData != null;
		case ResourcesPackage.RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA:
			return functionalData != null;
		case ResourcesPackage.RESOURCE_DESCRIPTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (URI: ");
		result.append(uri);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // ResourceDescriptorImpl
