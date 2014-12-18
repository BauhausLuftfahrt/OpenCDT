/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.designoperations.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.OperationWithOutput;
import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.process.DesignOperation;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.ProcessPackage;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.Formula;
import net.bhl.cdt.model.system.Parameter;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Formula</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.FormulaImpl#getProcessedElements <em>Processed Elements</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.FormulaImpl#getGeneratedElements <em>Generated Elements</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.FormulaImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.FormulaImpl#isBusy <em>Busy</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.FormulaImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.FormulaImpl#getSuperprocess <em>Superprocess</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.FormulaImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.FormulaImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormulaImpl extends MinimalEObjectImpl.Container implements Formula {
	/**
	 * The cached value of the '{@link #getProcessedElements() <em>Processed Elements</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProcessedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessableElement> processedElements;

	/**
	 * The cached value of the '{@link #getGeneratedElements() <em>Generated Elements</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGeneratedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratableElement> generatedElements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getSuperprocess() <em>Superprocess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperprocess()
	 * @generated
	 * @ordered
	 */
	protected DesignProcess superprocess;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignoperationsPackage.Literals.FORMULA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessableElement> getProcessedElements() {
		if (processedElements == null) {
			processedElements = new EObjectResolvingEList<ProcessableElement>(ProcessableElement.class, this, DesignoperationsPackage.FORMULA__PROCESSED_ELEMENTS);
		}
		return processedElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratableElement> getGeneratedElements() {
		if (generatedElements == null) {
			generatedElements = new EObjectContainmentEList<GeneratableElement>(GeneratableElement.class, this, DesignoperationsPackage.FORMULA__GENERATED_ELEMENTS);
		}
		return generatedElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignoperationsPackage.FORMULA__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DesignoperationsPackage.FORMULA__BUSY, oldBusy, busy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DesignProcess getSuperprocess() {
		if (superprocess != null && superprocess.eIsProxy()) {
			InternalEObject oldSuperprocess = (InternalEObject)superprocess;
			superprocess = (DesignProcess)eResolveProxy(oldSuperprocess);
			if (superprocess != oldSuperprocess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignoperationsPackage.FORMULA__SUPERPROCESS, oldSuperprocess, superprocess));
			}
		}
		return superprocess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DesignProcess basicGetSuperprocess() {
		return superprocess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperprocess(DesignProcess newSuperprocess) {
		DesignProcess oldSuperprocess = superprocess;
		superprocess = newSuperprocess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignoperationsPackage.FORMULA__SUPERPROCESS, oldSuperprocess, superprocess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DesignoperationsPackage.FORMULA__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignoperationsPackage.FORMULA__FORMULA, oldFormula, formula));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignoperationsPackage.FORMULA__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignoperationsPackage.FORMULA__PARAMETER, oldParameter, parameter));
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
			case DesignoperationsPackage.FORMULA__GENERATED_ELEMENTS:
				return ((InternalEList<?>)getGeneratedElements()).basicRemove(otherEnd, msgs);
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
			case DesignoperationsPackage.FORMULA__PROCESSED_ELEMENTS:
				return getProcessedElements();
			case DesignoperationsPackage.FORMULA__GENERATED_ELEMENTS:
				return getGeneratedElements();
			case DesignoperationsPackage.FORMULA__NAME:
				return getName();
			case DesignoperationsPackage.FORMULA__BUSY:
				return isBusy();
			case DesignoperationsPackage.FORMULA__TIME_STAMP:
				return getTimeStamp();
			case DesignoperationsPackage.FORMULA__SUPERPROCESS:
				if (resolve) return getSuperprocess();
				return basicGetSuperprocess();
			case DesignoperationsPackage.FORMULA__FORMULA:
				return getFormula();
			case DesignoperationsPackage.FORMULA__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case DesignoperationsPackage.FORMULA__PROCESSED_ELEMENTS:
				getProcessedElements().clear();
				getProcessedElements().addAll((Collection<? extends ProcessableElement>)newValue);
				return;
			case DesignoperationsPackage.FORMULA__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				getGeneratedElements().addAll((Collection<? extends GeneratableElement>)newValue);
				return;
			case DesignoperationsPackage.FORMULA__NAME:
				setName((String)newValue);
				return;
			case DesignoperationsPackage.FORMULA__BUSY:
				setBusy((Boolean)newValue);
				return;
			case DesignoperationsPackage.FORMULA__TIME_STAMP:
				setTimeStamp((String)newValue);
				return;
			case DesignoperationsPackage.FORMULA__SUPERPROCESS:
				setSuperprocess((DesignProcess)newValue);
				return;
			case DesignoperationsPackage.FORMULA__FORMULA:
				setFormula((String)newValue);
				return;
			case DesignoperationsPackage.FORMULA__PARAMETER:
				setParameter((Parameter)newValue);
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
			case DesignoperationsPackage.FORMULA__PROCESSED_ELEMENTS:
				getProcessedElements().clear();
				return;
			case DesignoperationsPackage.FORMULA__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				return;
			case DesignoperationsPackage.FORMULA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DesignoperationsPackage.FORMULA__BUSY:
				setBusy(BUSY_EDEFAULT);
				return;
			case DesignoperationsPackage.FORMULA__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case DesignoperationsPackage.FORMULA__SUPERPROCESS:
				setSuperprocess((DesignProcess)null);
				return;
			case DesignoperationsPackage.FORMULA__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case DesignoperationsPackage.FORMULA__PARAMETER:
				setParameter((Parameter)null);
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
			case DesignoperationsPackage.FORMULA__PROCESSED_ELEMENTS:
				return processedElements != null && !processedElements.isEmpty();
			case DesignoperationsPackage.FORMULA__GENERATED_ELEMENTS:
				return generatedElements != null && !generatedElements.isEmpty();
			case DesignoperationsPackage.FORMULA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DesignoperationsPackage.FORMULA__BUSY:
				return busy != BUSY_EDEFAULT;
			case DesignoperationsPackage.FORMULA__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case DesignoperationsPackage.FORMULA__SUPERPROCESS:
				return superprocess != null;
			case DesignoperationsPackage.FORMULA__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case DesignoperationsPackage.FORMULA__PARAMETER:
				return parameter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OperationWithOutput.class) {
			switch (derivedFeatureID) {
				case DesignoperationsPackage.FORMULA__GENERATED_ELEMENTS: return ModelPackage.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case DesignoperationsPackage.FORMULA__NAME: return ModelPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ProcessElement.class) {
			switch (derivedFeatureID) {
				case DesignoperationsPackage.FORMULA__BUSY: return ProcessPackage.PROCESS_ELEMENT__BUSY;
				case DesignoperationsPackage.FORMULA__TIME_STAMP: return ProcessPackage.PROCESS_ELEMENT__TIME_STAMP;
				default: return -1;
			}
		}
		if (baseClass == DesignOperation.class) {
			switch (derivedFeatureID) {
				case DesignoperationsPackage.FORMULA__SUPERPROCESS: return ProcessPackage.DESIGN_OPERATION__SUPERPROCESS;
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
		if (baseClass == OperationWithOutput.class) {
			switch (baseFeatureID) {
				case ModelPackage.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS: return DesignoperationsPackage.FORMULA__GENERATED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.NAMED_ELEMENT__NAME: return DesignoperationsPackage.FORMULA__NAME;
				default: return -1;
			}
		}
		if (baseClass == ProcessElement.class) {
			switch (baseFeatureID) {
				case ProcessPackage.PROCESS_ELEMENT__BUSY: return DesignoperationsPackage.FORMULA__BUSY;
				case ProcessPackage.PROCESS_ELEMENT__TIME_STAMP: return DesignoperationsPackage.FORMULA__TIME_STAMP;
				default: return -1;
			}
		}
		if (baseClass == DesignOperation.class) {
			switch (baseFeatureID) {
				case ProcessPackage.DESIGN_OPERATION__SUPERPROCESS: return DesignoperationsPackage.FORMULA__SUPERPROCESS;
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
		if (baseClass == OperationWithOutput.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ProcessElement.class) {
			switch (baseOperationID) {
				case ProcessPackage.PROCESS_ELEMENT___START: return DesignoperationsPackage.FORMULA___START;
				case ProcessPackage.PROCESS_ELEMENT___IS_STARTABLE: return DesignoperationsPackage.FORMULA___IS_STARTABLE;
				case ProcessPackage.PROCESS_ELEMENT___GET_STRATEGY__ECLASS: return DesignoperationsPackage.FORMULA___GET_STRATEGY__ECLASS;
				default: return -1;
			}
		}
		if (baseClass == DesignOperation.class) {
			switch (baseOperationID) {
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
			case DesignoperationsPackage.FORMULA___START:
				start();
				return null;
			case DesignoperationsPackage.FORMULA___IS_STARTABLE:
				return isStartable();
			case DesignoperationsPackage.FORMULA___GET_STRATEGY__ECLASS:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", busy: ");
		result.append(busy);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(", formula: ");
		result.append(formula);
		result.append(')');
		return result.toString();
	}

} // FormulaImpl
