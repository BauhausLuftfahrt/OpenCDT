/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.ComponentInterface;
import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.architecturetools.exceptions.NoValueFoundException;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.utilities.units.Quantity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.impl.ParameterImpl#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ParameterImpl#getSource <em>Source</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ParameterImpl#getDiscipline <em>Discipline</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ParameterImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ParameterImpl#getDesignPhase <em>Design Phase</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ParameterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ParameterImpl#getValues <em>Values</em>}</li>
 *   <li>{@link net.bhl.cdt.model.impl.ParameterImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends StructuralElementImpl implements Parameter {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiscipline() <em>Discipline</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscipline()
	 * @generated
	 * @ordered
	 */
	protected EList<String> discipline;

	/**
	 * The default value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected String annotation = ANNOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignPhase() <em>Design Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignPhase() <em>Design Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignPhase()
	 * @generated
	 * @ordered
	 */
	protected String designPhase = DESIGN_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Quantity QUANTITY_EDEFAULT = Quantity.LENGTH;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity = QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component getParentComponent() {
		if (eContainerFeatureID() != ModelPackage.PARAMETER__PARENT_COMPONENT) return null;
		return (Component)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetParentComponent() {
		if (eContainerFeatureID() != ModelPackage.PARAMETER__PARENT_COMPONENT) return null;
		return (Component)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentComponent(Component newParentComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentComponent, ModelPackage.PARAMETER__PARENT_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponent(Component newParentComponent) {
		if (newParentComponent != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PARAMETER__PARENT_COMPONENT && newParentComponent != null)) {
			if (EcoreUtil.isAncestor(this, newParentComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentComponent != null)
				msgs = ((InternalEObject)newParentComponent).eInverseAdd(this, ModelPackage.COMPONENT__INTERFACES, Component.class, msgs);
			msgs = basicSetParentComponent(newParentComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER__PARENT_COMPONENT, newParentComponent, newParentComponent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDiscipline() {
		if (discipline == null) {
			discipline = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.PARAMETER__DISCIPLINE);
		}
		return discipline;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(String newAnnotation) {
		String oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesignPhase() {
		return designPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignPhase(String newDesignPhase) {
		String oldDesignPhase = designPhase;
		designPhase = newDesignPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER__DESIGN_PHASE, oldDesignPhase, designPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList.Resolving<Value>(Value.class, this, ModelPackage.PARAMETER__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity == null ? QUANTITY_EDEFAULT : newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return The selected value for this parameter
	 * @generated NOT
	 */
	public Value getValue() {
		if (this.getValues().isEmpty()) {
			throw new NoValueFoundException();
		}
		return getValues().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 * 
	 * @param value -- Value which should be set
	 * @generated NOT
	 */
	public void setValue(Value value) {
		// getValues().set(0, value);
		getValues().add(value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getParameter() {
		return this;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValue() {
		return (this.getValues().size() > 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Value getValue(CalculationSpaceQualifier calcSpaceQualifier) {

		List<Value> values = new ArrayList<Value>();
		for (Value value : this.getValues()) {
			if (calcSpaceQualifier.getQualifies().contains(value)) {
				values.add(value);
			}
		}
		return values.get(values.size() - 1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PARAMETER__PARENT_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentComponent((Component)otherEnd, msgs);
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
			case ModelPackage.PARAMETER__PARENT_COMPONENT:
				return basicSetParentComponent(null, msgs);
			case ModelPackage.PARAMETER__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.PARAMETER__PARENT_COMPONENT:
				return eInternalContainer().eInverseRemove(this, ModelPackage.COMPONENT__INTERFACES, Component.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PARAMETER__PARENT_COMPONENT:
				if (resolve) return getParentComponent();
				return basicGetParentComponent();
			case ModelPackage.PARAMETER__SOURCE:
				return getSource();
			case ModelPackage.PARAMETER__DISCIPLINE:
				return getDiscipline();
			case ModelPackage.PARAMETER__ANNOTATION:
				return getAnnotation();
			case ModelPackage.PARAMETER__DESIGN_PHASE:
				return getDesignPhase();
			case ModelPackage.PARAMETER__OWNER:
				return getOwner();
			case ModelPackage.PARAMETER__VALUES:
				return getValues();
			case ModelPackage.PARAMETER__QUANTITY:
				return getQuantity();
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
			case ModelPackage.PARAMETER__PARENT_COMPONENT:
				setParentComponent((Component)newValue);
				return;
			case ModelPackage.PARAMETER__SOURCE:
				setSource((String)newValue);
				return;
			case ModelPackage.PARAMETER__DISCIPLINE:
				getDiscipline().clear();
				getDiscipline().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.PARAMETER__ANNOTATION:
				setAnnotation((String)newValue);
				return;
			case ModelPackage.PARAMETER__DESIGN_PHASE:
				setDesignPhase((String)newValue);
				return;
			case ModelPackage.PARAMETER__OWNER:
				setOwner((String)newValue);
				return;
			case ModelPackage.PARAMETER__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
				return;
			case ModelPackage.PARAMETER__QUANTITY:
				setQuantity((Quantity)newValue);
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
			case ModelPackage.PARAMETER__PARENT_COMPONENT:
				setParentComponent((Component)null);
				return;
			case ModelPackage.PARAMETER__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case ModelPackage.PARAMETER__DISCIPLINE:
				getDiscipline().clear();
				return;
			case ModelPackage.PARAMETER__ANNOTATION:
				setAnnotation(ANNOTATION_EDEFAULT);
				return;
			case ModelPackage.PARAMETER__DESIGN_PHASE:
				setDesignPhase(DESIGN_PHASE_EDEFAULT);
				return;
			case ModelPackage.PARAMETER__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case ModelPackage.PARAMETER__VALUES:
				getValues().clear();
				return;
			case ModelPackage.PARAMETER__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
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
			case ModelPackage.PARAMETER__PARENT_COMPONENT:
				return basicGetParentComponent() != null;
			case ModelPackage.PARAMETER__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case ModelPackage.PARAMETER__DISCIPLINE:
				return discipline != null && !discipline.isEmpty();
			case ModelPackage.PARAMETER__ANNOTATION:
				return ANNOTATION_EDEFAULT == null ? annotation != null : !ANNOTATION_EDEFAULT.equals(annotation);
			case ModelPackage.PARAMETER__DESIGN_PHASE:
				return DESIGN_PHASE_EDEFAULT == null ? designPhase != null : !DESIGN_PHASE_EDEFAULT.equals(designPhase);
			case ModelPackage.PARAMETER__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case ModelPackage.PARAMETER__VALUES:
				return values != null && !values.isEmpty();
			case ModelPackage.PARAMETER__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ComponentInterface.class) {
			switch (derivedFeatureID) {
				case ModelPackage.PARAMETER__PARENT_COMPONENT: return ModelPackage.COMPONENT_INTERFACE__PARENT_COMPONENT;
				case ModelPackage.PARAMETER__SOURCE: return ModelPackage.COMPONENT_INTERFACE__SOURCE;
				case ModelPackage.PARAMETER__DISCIPLINE: return ModelPackage.COMPONENT_INTERFACE__DISCIPLINE;
				case ModelPackage.PARAMETER__ANNOTATION: return ModelPackage.COMPONENT_INTERFACE__ANNOTATION;
				case ModelPackage.PARAMETER__DESIGN_PHASE: return ModelPackage.COMPONENT_INTERFACE__DESIGN_PHASE;
				case ModelPackage.PARAMETER__OWNER: return ModelPackage.COMPONENT_INTERFACE__OWNER;
				default: return -1;
			}
		}
		if (baseClass == MappableComponentInterface.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == ComponentInterface.class) {
			switch (baseFeatureID) {
				case ModelPackage.COMPONENT_INTERFACE__PARENT_COMPONENT: return ModelPackage.PARAMETER__PARENT_COMPONENT;
				case ModelPackage.COMPONENT_INTERFACE__SOURCE: return ModelPackage.PARAMETER__SOURCE;
				case ModelPackage.COMPONENT_INTERFACE__DISCIPLINE: return ModelPackage.PARAMETER__DISCIPLINE;
				case ModelPackage.COMPONENT_INTERFACE__ANNOTATION: return ModelPackage.PARAMETER__ANNOTATION;
				case ModelPackage.COMPONENT_INTERFACE__DESIGN_PHASE: return ModelPackage.PARAMETER__DESIGN_PHASE;
				case ModelPackage.COMPONENT_INTERFACE__OWNER: return ModelPackage.PARAMETER__OWNER;
				default: return -1;
			}
		}
		if (baseClass == MappableComponentInterface.class) {
			switch (baseFeatureID) {
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (source: "); //$NON-NLS-1$
		result.append(source);
		result.append(", discipline: "); //$NON-NLS-1$
		result.append(discipline);
		result.append(", annotation: "); //$NON-NLS-1$
		result.append(annotation);
		result.append(", designPhase: "); //$NON-NLS-1$
		result.append(designPhase);
		result.append(", Owner: "); //$NON-NLS-1$
		result.append(owner);
		result.append(", quantity: "); //$NON-NLS-1$
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} // ParameterImpl
