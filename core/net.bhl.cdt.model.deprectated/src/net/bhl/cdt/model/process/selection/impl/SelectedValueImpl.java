/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.ProcessPackage;
import net.bhl.cdt.model.process.selection.SelectedValue;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.ValueSelectionArgument;
import net.bhl.cdt.model.process.selection.ValueSelectionCriterion;
import net.bhl.cdt.model.system.Value;
import net.bhl.cdt.model.system.impl.ValueImpl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Selected Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.SelectedValueImpl#isBusy <em>Busy</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.SelectedValueImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.SelectedValueImpl#getAppliedCriteria <em>Applied Criteria</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.SelectedValueImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.SelectedValueImpl#getSelectedValues <em>Selected Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectedValueImpl extends ValueImpl implements SelectedValue {
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
	 * The cached value of the '{@link #getAppliedCriteria() <em>Applied Criteria</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAppliedCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSelectionCriterion> appliedCriteria;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSelectionArgument> arguments;

	/**
	 * The cached value of the '{@link #getSelectedValues() <em>Selected Values</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSelectedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> selectedValues;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectionPackage.Literals.SELECTED_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.SELECTED_VALUE__BUSY, oldBusy, busy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.SELECTED_VALUE__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSelectionCriterion> getAppliedCriteria() {
		if (appliedCriteria == null) {
			appliedCriteria = new EObjectResolvingEList<ValueSelectionCriterion>(ValueSelectionCriterion.class, this, SelectionPackage.SELECTED_VALUE__APPLIED_CRITERIA);
		}
		return appliedCriteria;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSelectionArgument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<ValueSelectionArgument>(ValueSelectionArgument.class, this, SelectionPackage.SELECTED_VALUE__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getSelectedValues() {
		if (selectedValues == null) {
			selectedValues = new EObjectResolvingEList<Value>(Value.class, this, SelectionPackage.SELECTED_VALUE__SELECTED_VALUES);
		}
		return selectedValues;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelectionPackage.SELECTED_VALUE__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectionPackage.SELECTED_VALUE__BUSY:
				return isBusy();
			case SelectionPackage.SELECTED_VALUE__TIME_STAMP:
				return getTimeStamp();
			case SelectionPackage.SELECTED_VALUE__APPLIED_CRITERIA:
				return getAppliedCriteria();
			case SelectionPackage.SELECTED_VALUE__ARGUMENTS:
				return getArguments();
			case SelectionPackage.SELECTED_VALUE__SELECTED_VALUES:
				return getSelectedValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SelectionPackage.SELECTED_VALUE__BUSY:
				setBusy((Boolean)newValue);
				return;
			case SelectionPackage.SELECTED_VALUE__TIME_STAMP:
				setTimeStamp((String)newValue);
				return;
			case SelectionPackage.SELECTED_VALUE__APPLIED_CRITERIA:
				getAppliedCriteria().clear();
				getAppliedCriteria().addAll((Collection<? extends ValueSelectionCriterion>)newValue);
				return;
			case SelectionPackage.SELECTED_VALUE__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends ValueSelectionArgument>)newValue);
				return;
			case SelectionPackage.SELECTED_VALUE__SELECTED_VALUES:
				getSelectedValues().clear();
				getSelectedValues().addAll((Collection<? extends Value>)newValue);
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
			case SelectionPackage.SELECTED_VALUE__BUSY:
				setBusy(BUSY_EDEFAULT);
				return;
			case SelectionPackage.SELECTED_VALUE__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case SelectionPackage.SELECTED_VALUE__APPLIED_CRITERIA:
				getAppliedCriteria().clear();
				return;
			case SelectionPackage.SELECTED_VALUE__ARGUMENTS:
				getArguments().clear();
				return;
			case SelectionPackage.SELECTED_VALUE__SELECTED_VALUES:
				getSelectedValues().clear();
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
			case SelectionPackage.SELECTED_VALUE__BUSY:
				return busy != BUSY_EDEFAULT;
			case SelectionPackage.SELECTED_VALUE__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case SelectionPackage.SELECTED_VALUE__APPLIED_CRITERIA:
				return appliedCriteria != null && !appliedCriteria.isEmpty();
			case SelectionPackage.SELECTED_VALUE__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case SelectionPackage.SELECTED_VALUE__SELECTED_VALUES:
				return selectedValues != null && !selectedValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ProcessElement.class) {
			switch (derivedFeatureID) {
				case SelectionPackage.SELECTED_VALUE__BUSY: return ProcessPackage.PROCESS_ELEMENT__BUSY;
				case SelectionPackage.SELECTED_VALUE__TIME_STAMP: return ProcessPackage.PROCESS_ELEMENT__TIME_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ProcessElement.class) {
			switch (baseFeatureID) {
				case ProcessPackage.PROCESS_ELEMENT__BUSY: return SelectionPackage.SELECTED_VALUE__BUSY;
				case ProcessPackage.PROCESS_ELEMENT__TIME_STAMP: return SelectionPackage.SELECTED_VALUE__TIME_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ProcessElement.class) {
			switch (baseOperationID) {
				case ProcessPackage.PROCESS_ELEMENT___START: return SelectionPackage.SELECTED_VALUE___START;
				case ProcessPackage.PROCESS_ELEMENT___IS_STARTABLE: return SelectionPackage.SELECTED_VALUE___IS_STARTABLE;
				case ProcessPackage.PROCESS_ELEMENT___GET_STRATEGY__ECLASS: return SelectionPackage.SELECTED_VALUE___GET_STRATEGY__ECLASS;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SelectionPackage.SELECTED_VALUE___START:
				start();
				return null;
			case SelectionPackage.SELECTED_VALUE___IS_STARTABLE:
				return isStartable();
			case SelectionPackage.SELECTED_VALUE___GET_STRATEGY__ECLASS:
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

} // SelectedValueImpl
