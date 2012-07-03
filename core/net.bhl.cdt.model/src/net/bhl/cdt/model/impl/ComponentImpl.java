/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.impl;

import java.util.Collection;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.ComponentInterface;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.calculation.CalculationSet;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.impl.ComponentImpl#getSubComponents <em>Sub Components</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ComponentImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ComponentImpl#getConnectedComponents <em>Connected Components</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ComponentImpl#getCalculationSets <em>Calculation Sets</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ComponentImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends StructuralElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getSubComponents() <em>Sub Components</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> subComponents;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getConnectedComponents() <em>Connected Components</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConnectedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> connectedComponents;

	/**
	 * The cached value of the '{@link #getCalculationSets() <em>Calculation Sets</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCalculationSets()
	 * @generated
	 * @ordered
	 */
	protected EList<CalculationSet> calculationSets;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInterface> interfaces;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getSubComponents() {
		if (subComponents == null) {
			subComponents = new EObjectContainmentEList.Resolving<Component>(Component.class, this, ModelPackage.COMPONENT__SUB_COMPONENTS);
		}
		return subComponents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList.Resolving<Parameter>(Parameter.class, this, ModelPackage.COMPONENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getConnectedComponents() {
		if (connectedComponents == null) {
			connectedComponents = new EObjectResolvingEList<Component>(Component.class, this, ModelPackage.COMPONENT__CONNECTED_COMPONENTS);
		}
		return connectedComponents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalculationSet> getCalculationSets() {
		if (calculationSets == null) {
			calculationSets = new EObjectContainmentEList.Resolving<CalculationSet>(CalculationSet.class, this, ModelPackage.COMPONENT__CALCULATION_SETS);
		}
		return calculationSets;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentWithInverseEList.Resolving<ComponentInterface>(ComponentInterface.class, this, ModelPackage.COMPONENT__INTERFACES, ModelPackage.COMPONENT_INTERFACE__PARENT_COMPONENT);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMPONENT__INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaces()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMPONENT__SUB_COMPONENTS:
				return ((InternalEList<?>)getSubComponents()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMPONENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMPONENT__CALCULATION_SETS:
				return ((InternalEList<?>)getCalculationSets()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMPONENT__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.COMPONENT__SUB_COMPONENTS:
				return getSubComponents();
			case ModelPackage.COMPONENT__PARAMETERS:
				return getParameters();
			case ModelPackage.COMPONENT__CONNECTED_COMPONENTS:
				return getConnectedComponents();
			case ModelPackage.COMPONENT__CALCULATION_SETS:
				return getCalculationSets();
			case ModelPackage.COMPONENT__INTERFACES:
				return getInterfaces();
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
			case ModelPackage.COMPONENT__SUB_COMPONENTS:
				getSubComponents().clear();
				getSubComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case ModelPackage.COMPONENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ModelPackage.COMPONENT__CONNECTED_COMPONENTS:
				getConnectedComponents().clear();
				getConnectedComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case ModelPackage.COMPONENT__CALCULATION_SETS:
				getCalculationSets().clear();
				getCalculationSets().addAll((Collection<? extends CalculationSet>)newValue);
				return;
			case ModelPackage.COMPONENT__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends ComponentInterface>)newValue);
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
			case ModelPackage.COMPONENT__SUB_COMPONENTS:
				getSubComponents().clear();
				return;
			case ModelPackage.COMPONENT__PARAMETERS:
				getParameters().clear();
				return;
			case ModelPackage.COMPONENT__CONNECTED_COMPONENTS:
				getConnectedComponents().clear();
				return;
			case ModelPackage.COMPONENT__CALCULATION_SETS:
				getCalculationSets().clear();
				return;
			case ModelPackage.COMPONENT__INTERFACES:
				getInterfaces().clear();
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
			case ModelPackage.COMPONENT__SUB_COMPONENTS:
				return subComponents != null && !subComponents.isEmpty();
			case ModelPackage.COMPONENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ModelPackage.COMPONENT__CONNECTED_COMPONENTS:
				return connectedComponents != null && !connectedComponents.isEmpty();
			case ModelPackage.COMPONENT__CALCULATION_SETS:
				return calculationSets != null && !calculationSets.isEmpty();
			case ModelPackage.COMPONENT__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T extends ComponentInterface> T getInterfaceByClass(Class<T> clazz) {
		if (clazz != null) {
			for (ComponentInterface inter : getInterfaces()) {
				if (clazz.isInstance(inter)) {
					return (T) inter;
				}
			}
		}
		return null;
	}

} // ComponentImpl
