/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.designoperations.impl;

import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.DisciplineToolService;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discipline Tool Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.DisciplineToolServiceImpl#getServiceURL <em>Service URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DisciplineToolServiceImpl extends DisciplineToolImpl implements DisciplineToolService {
	/**
	 * The default value of the '{@link #getServiceURL() <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getServiceURL() <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURL()
	 * @generated
	 * @ordered
	 */
	protected String serviceURL = SERVICE_URL_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisciplineToolServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignoperationsPackage.Literals.DISCIPLINE_TOOL_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceURL() {
		return serviceURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceURL(String newServiceURL) {
		String oldServiceURL = serviceURL;
		serviceURL = newServiceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__SERVICE_URL, oldServiceURL, serviceURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__SERVICE_URL:
				return getServiceURL();
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
			case DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__SERVICE_URL:
				setServiceURL((String)newValue);
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
			case DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__SERVICE_URL:
				setServiceURL(SERVICE_URL_EDEFAULT);
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
			case DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__SERVICE_URL:
				return SERVICE_URL_EDEFAULT == null ? serviceURL != null : !SERVICE_URL_EDEFAULT.equals(serviceURL);
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
		result.append(" (serviceURL: ");
		result.append(serviceURL);
		result.append(')');
		return result.toString();
	}

} //DisciplineToolServiceImpl
