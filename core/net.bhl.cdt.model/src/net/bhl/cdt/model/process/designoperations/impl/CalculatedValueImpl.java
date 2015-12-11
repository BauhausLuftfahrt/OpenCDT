/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.designoperations.impl;

import java.util.Collection;

import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.OperationWithOutput;
import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.process.designoperations.CalculatedValue;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.impl.DesignOperationImpl;
import net.bhl.cdt.model.system.Parameter;
import net.bhl.cdt.model.system.State;
import net.bhl.cdt.model.system.SystemModelElement;
import net.bhl.cdt.model.system.SystemPackage;
import net.bhl.cdt.model.system.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculated Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.CalculatedValueImpl#getSourceOperation <em>Source Operation</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.CalculatedValueImpl#getStates <em>States</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.CalculatedValueImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.CalculatedValueImpl#getProcessedElements <em>Processed Elements</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.impl.CalculatedValueImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CalculatedValueImpl extends DesignOperationImpl implements CalculatedValue {
	/**
	 * The cached value of the '{@link #getSourceOperation() <em>Source Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOperation()
	 * @generated
	 * @ordered
	 */
	protected OperationWithOutput sourceOperation;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The cached value of the '{@link #getProcessedElements() <em>Processed Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessableElement> processedElements;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculatedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignoperationsPackage.Literals.CALCULATED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationWithOutput getSourceOperation() {
		if (sourceOperation != null && sourceOperation.eIsProxy()) {
			InternalEObject oldSourceOperation = (InternalEObject)sourceOperation;
			sourceOperation = (OperationWithOutput)eResolveProxy(oldSourceOperation);
			if (sourceOperation != oldSourceOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignoperationsPackage.CALCULATED_VALUE__SOURCE_OPERATION, oldSourceOperation, sourceOperation));
			}
		}
		return sourceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationWithOutput basicGetSourceOperation() {
		return sourceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceOperation(OperationWithOutput newSourceOperation) {
		OperationWithOutput oldSourceOperation = sourceOperation;
		sourceOperation = newSourceOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignoperationsPackage.CALCULATED_VALUE__SOURCE_OPERATION, oldSourceOperation, sourceOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectResolvingEList<State>(State.class, this, DesignoperationsPackage.CALCULATED_VALUE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignoperationsPackage.CALCULATED_VALUE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignoperationsPackage.CALCULATED_VALUE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessableElement> getProcessedElements() {
		if (processedElements == null) {
			processedElements = new EObjectResolvingEList<ProcessableElement>(ProcessableElement.class, this, DesignoperationsPackage.CALCULATED_VALUE__PROCESSED_ELEMENTS);
		}
		return processedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignoperationsPackage.CALCULATED_VALUE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DesignoperationsPackage.CALCULATED_VALUE__SOURCE_OPERATION:
				if (resolve) return getSourceOperation();
				return basicGetSourceOperation();
			case DesignoperationsPackage.CALCULATED_VALUE__STATES:
				return getStates();
			case DesignoperationsPackage.CALCULATED_VALUE__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case DesignoperationsPackage.CALCULATED_VALUE__PROCESSED_ELEMENTS:
				return getProcessedElements();
			case DesignoperationsPackage.CALCULATED_VALUE__EXPRESSION:
				return getExpression();
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
			case DesignoperationsPackage.CALCULATED_VALUE__SOURCE_OPERATION:
				setSourceOperation((OperationWithOutput)newValue);
				return;
			case DesignoperationsPackage.CALCULATED_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case DesignoperationsPackage.CALCULATED_VALUE__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case DesignoperationsPackage.CALCULATED_VALUE__PROCESSED_ELEMENTS:
				getProcessedElements().clear();
				getProcessedElements().addAll((Collection<? extends ProcessableElement>)newValue);
				return;
			case DesignoperationsPackage.CALCULATED_VALUE__EXPRESSION:
				setExpression((String)newValue);
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
			case DesignoperationsPackage.CALCULATED_VALUE__SOURCE_OPERATION:
				setSourceOperation((OperationWithOutput)null);
				return;
			case DesignoperationsPackage.CALCULATED_VALUE__STATES:
				getStates().clear();
				return;
			case DesignoperationsPackage.CALCULATED_VALUE__PARAMETER:
				setParameter((Parameter)null);
				return;
			case DesignoperationsPackage.CALCULATED_VALUE__PROCESSED_ELEMENTS:
				getProcessedElements().clear();
				return;
			case DesignoperationsPackage.CALCULATED_VALUE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
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
			case DesignoperationsPackage.CALCULATED_VALUE__SOURCE_OPERATION:
				return sourceOperation != null;
			case DesignoperationsPackage.CALCULATED_VALUE__STATES:
				return states != null && !states.isEmpty();
			case DesignoperationsPackage.CALCULATED_VALUE__PARAMETER:
				return parameter != null;
			case DesignoperationsPackage.CALCULATED_VALUE__PROCESSED_ELEMENTS:
				return processedElements != null && !processedElements.isEmpty();
			case DesignoperationsPackage.CALCULATED_VALUE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
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
		if (baseClass == GeneratableElement.class) {
			switch (derivedFeatureID) {
				case DesignoperationsPackage.CALCULATED_VALUE__SOURCE_OPERATION: return ModelPackage.GENERATABLE_ELEMENT__SOURCE_OPERATION;
				default: return -1;
			}
		}
		if (baseClass == ProcessableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SystemModelElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Value.class) {
			switch (derivedFeatureID) {
				case DesignoperationsPackage.CALCULATED_VALUE__STATES: return SystemPackage.VALUE__STATES;
				case DesignoperationsPackage.CALCULATED_VALUE__PARAMETER: return SystemPackage.VALUE__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == OperationWithInput.class) {
			switch (derivedFeatureID) {
				case DesignoperationsPackage.CALCULATED_VALUE__PROCESSED_ELEMENTS: return ModelPackage.OPERATION_WITH_INPUT__PROCESSED_ELEMENTS;
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
		if (baseClass == GeneratableElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.GENERATABLE_ELEMENT__SOURCE_OPERATION: return DesignoperationsPackage.CALCULATED_VALUE__SOURCE_OPERATION;
				default: return -1;
			}
		}
		if (baseClass == ProcessableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SystemModelElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Value.class) {
			switch (baseFeatureID) {
				case SystemPackage.VALUE__STATES: return DesignoperationsPackage.CALCULATED_VALUE__STATES;
				case SystemPackage.VALUE__PARAMETER: return DesignoperationsPackage.CALCULATED_VALUE__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == OperationWithInput.class) {
			switch (baseFeatureID) {
				case ModelPackage.OPERATION_WITH_INPUT__PROCESSED_ELEMENTS: return DesignoperationsPackage.CALCULATED_VALUE__PROCESSED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //CalculatedValueImpl
