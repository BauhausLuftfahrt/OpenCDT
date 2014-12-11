/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlprocess.impl;

import java.util.Collection;
import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter;
import net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage;
import net.bhl.cdt.connector.avl.avlprocess.VariableSweep;
import net.bhl.cdt.connector.files.impl.FileGeneratorImpl;
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
 * An implementation of the model object '<em><b>AVL Process Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.impl.AVLProcessGeneratorImpl#getVariableSweeps <em>Variable Sweeps</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.impl.AVLProcessGeneratorImpl#getCommandFileName <em>Command File Name</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.impl.AVLProcessGeneratorImpl#getRuncaseCounter <em>Runcase Counter</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.impl.AVLProcessGeneratorImpl#getAvlResultImporters <em>Avl Result Importers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AVLProcessGeneratorImpl extends FileGeneratorImpl implements AVLProcessGenerator {
	/**
	 * The cached value of the '{@link #getVariableSweeps() <em>Variable Sweeps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSweeps()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableSweep> variableSweeps;

	/**
	 * The default value of the '{@link #getCommandFileName() <em>Command File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandFileName() <em>Command File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandFileName()
	 * @generated
	 * @ordered
	 */
	protected String commandFileName = COMMAND_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuncaseCounter() <em>Runcase Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuncaseCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int RUNCASE_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRuncaseCounter() <em>Runcase Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuncaseCounter()
	 * @generated
	 * @ordered
	 */
	protected int runcaseCounter = RUNCASE_COUNTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvlResultImporters() <em>Avl Result Importers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvlResultImporters()
	 * @generated
	 * @ordered
	 */
	protected EList<AVLResultImporter> avlResultImporters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVLProcessGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvlprocessPackage.Literals.AVL_PROCESS_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableSweep> getVariableSweeps() {
		if (variableSweeps == null) {
			variableSweeps = new EObjectContainmentEList<VariableSweep>(VariableSweep.class, this, AvlprocessPackage.AVL_PROCESS_GENERATOR__VARIABLE_SWEEPS);
		}
		return variableSweeps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandFileName() {
		return commandFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandFileName(String newCommandFileName) {
		String oldCommandFileName = commandFileName;
		commandFileName = newCommandFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlprocessPackage.AVL_PROCESS_GENERATOR__COMMAND_FILE_NAME, oldCommandFileName, commandFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRuncaseCounter() {
		return runcaseCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuncaseCounter(int newRuncaseCounter) {
		int oldRuncaseCounter = runcaseCounter;
		runcaseCounter = newRuncaseCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlprocessPackage.AVL_PROCESS_GENERATOR__RUNCASE_COUNTER, oldRuncaseCounter, runcaseCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AVLResultImporter> getAvlResultImporters() {
		if (avlResultImporters == null) {
			avlResultImporters = new EObjectContainmentEList<AVLResultImporter>(AVLResultImporter.class, this, AvlprocessPackage.AVL_PROCESS_GENERATOR__AVL_RESULT_IMPORTERS);
		}
		return avlResultImporters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__VARIABLE_SWEEPS:
				return ((InternalEList<?>)getVariableSweeps()).basicRemove(otherEnd, msgs);
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__AVL_RESULT_IMPORTERS:
				return ((InternalEList<?>)getAvlResultImporters()).basicRemove(otherEnd, msgs);
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
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__VARIABLE_SWEEPS:
				return getVariableSweeps();
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__COMMAND_FILE_NAME:
				return getCommandFileName();
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__RUNCASE_COUNTER:
				return getRuncaseCounter();
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__AVL_RESULT_IMPORTERS:
				return getAvlResultImporters();
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
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__VARIABLE_SWEEPS:
				getVariableSweeps().clear();
				getVariableSweeps().addAll((Collection<? extends VariableSweep>)newValue);
				return;
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__COMMAND_FILE_NAME:
				setCommandFileName((String)newValue);
				return;
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__RUNCASE_COUNTER:
				setRuncaseCounter((Integer)newValue);
				return;
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__AVL_RESULT_IMPORTERS:
				getAvlResultImporters().clear();
				getAvlResultImporters().addAll((Collection<? extends AVLResultImporter>)newValue);
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
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__VARIABLE_SWEEPS:
				getVariableSweeps().clear();
				return;
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__COMMAND_FILE_NAME:
				setCommandFileName(COMMAND_FILE_NAME_EDEFAULT);
				return;
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__RUNCASE_COUNTER:
				setRuncaseCounter(RUNCASE_COUNTER_EDEFAULT);
				return;
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__AVL_RESULT_IMPORTERS:
				getAvlResultImporters().clear();
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
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__VARIABLE_SWEEPS:
				return variableSweeps != null && !variableSweeps.isEmpty();
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__COMMAND_FILE_NAME:
				return COMMAND_FILE_NAME_EDEFAULT == null ? commandFileName != null : !COMMAND_FILE_NAME_EDEFAULT.equals(commandFileName);
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__RUNCASE_COUNTER:
				return runcaseCounter != RUNCASE_COUNTER_EDEFAULT;
			case AvlprocessPackage.AVL_PROCESS_GENERATOR__AVL_RESULT_IMPORTERS:
				return avlResultImporters != null && !avlResultImporters.isEmpty();
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
		result.append(" (commandFileName: ");
		result.append(commandFileName);
		result.append(", runcaseCounter: ");
		result.append(runcaseCounter);
		result.append(')');
		return result.toString();
	}

} //AVLProcessGeneratorImpl
