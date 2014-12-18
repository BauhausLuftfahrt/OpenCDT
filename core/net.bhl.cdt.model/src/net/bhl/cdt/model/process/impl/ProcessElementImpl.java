/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.impl;

import java.lang.reflect.InvocationTargetException;

import net.bhl.cdt.model.impl.NamedElementImpl;
import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.ProcessPackage;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.impl.ProcessElementImpl#isBusy <em>Busy</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.impl.ProcessElementImpl#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProcessElementImpl extends NamedElementImpl implements ProcessElement {
	/**
	 * The default value of the '{@link #isBusy() <em>Busy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isBusy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUSY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBusy() <em>Busy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isBusy()
	 * @generated
	 * @ordered
	 */
	protected boolean busy = BUSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.PROCESS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBusy() {
		return busy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusy(boolean newBusy) {
		boolean oldBusy = busy;
		busy = newBusy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS_ELEMENT__BUSY, oldBusy, busy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(String newTimeStamp) {
		String oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS_ELEMENT__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		setBusy(true);
		
		OperationStrategy executable = null;
		OperationStrategy strategy = getStrategy(this.eClass());
		if(strategy != null){
			if (strategy.isStartable(this)){
				executable = strategy;
			}
		}
		if (executable == null && !this.eClass().getEAllSuperTypes().isEmpty()) {
			for (EClass superClass : this.eClass().getEAllSuperTypes()) {
				strategy = getStrategy(superClass);
				if(strategy != null){
					if (strategy.isStartable(this)){
						executable = strategy;
						break;
					}
				}
			}
		}
		
		if (executable == null){
			System.out.println("No Strategy found!");
			return;
		}
		
		final OperationStrategy execute = executable;
		final ProcessElement self = this;
		ISafeRunnable runnable = new ISafeRunnable() {
			@Override
		      public void handleException(Throwable e) {
		        	System.out.println("Exception in Strategy");
		      }
		
		      @Override
		      public void run() throws Exception {
		        	execute.start(self);
		      }
		};
		SafeRunner.run(runnable);
		
		setBusy(false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStartable() {
		OperationStrategy strategy = getStrategy(this.eClass());
		try {
			if (strategy != null) {
				if (strategy.isStartable(this)) {
					return true;
				} else {
					return false;
				}
			}
			if (!this.eClass().getEAllSuperTypes().isEmpty()) {
				for (EClass superClass : this.eClass().getEAllSuperTypes()) {
					strategy = getStrategy(superClass);
					if (strategy != null) {
						if (strategy.isStartable(this)) {
							return true;
						} else {
							return false;
						}
					}
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OperationStrategy getStrategy(final EClass eClass) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] config = registry.getConfigurationElementsFor("net.bhl.cdt.model.design_operation_strategy");
		try {
			for (IConfigurationElement e : config) {
		       	final Object o = e.createExecutableExtension("class");
				OperationStrategy strategy = ((OperationStrategy)o);
		       	if(strategy.getEClass().equals(eClass)){
					//if (strategy.isStartable(this)){
						return strategy;
					//} else {
					//	return null;
					//}
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.PROCESS_ELEMENT__BUSY:
				return isBusy();
			case ProcessPackage.PROCESS_ELEMENT__TIME_STAMP:
				return getTimeStamp();
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
			case ProcessPackage.PROCESS_ELEMENT__BUSY:
				setBusy((Boolean)newValue);
				return;
			case ProcessPackage.PROCESS_ELEMENT__TIME_STAMP:
				setTimeStamp((String)newValue);
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
			case ProcessPackage.PROCESS_ELEMENT__BUSY:
				setBusy(BUSY_EDEFAULT);
				return;
			case ProcessPackage.PROCESS_ELEMENT__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
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
			case ProcessPackage.PROCESS_ELEMENT__BUSY:
				return busy != BUSY_EDEFAULT;
			case ProcessPackage.PROCESS_ELEMENT__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProcessPackage.PROCESS_ELEMENT___START:
				start();
				return null;
			case ProcessPackage.PROCESS_ELEMENT___IS_STARTABLE:
				return isStartable();
			case ProcessPackage.PROCESS_ELEMENT___GET_STRATEGY__ECLASS:
				return getStrategy((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (busy: ");
		result.append(busy);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} // ProcessElementImpl
