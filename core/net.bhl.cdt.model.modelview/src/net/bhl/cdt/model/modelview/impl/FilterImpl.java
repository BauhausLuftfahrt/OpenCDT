/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview.impl;

import java.util.Collection;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.ComponentInterface;

import net.bhl.cdt.model.impl.ElementImpl;

import net.bhl.cdt.model.modelview.Filter;
import net.bhl.cdt.model.modelview.ModelviewPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getSource <em>Source</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getDiscipline <em>Discipline</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterImpl extends SetExpressionImpl implements Filter {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInterface> interface_;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelviewPackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<ComponentInterface>(ComponentInterface.class, this, ModelviewPackage.FILTER__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelviewPackage.FILTER__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelviewPackage.FILTER__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelviewPackage.FILTER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDiscipline() {
		if (discipline == null) {
			discipline = new EDataTypeUniqueEList<String>(String.class, this, ModelviewPackage.FILTER__DISCIPLINE);
		}
		return discipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelviewPackage.FILTER__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelviewPackage.FILTER__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
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
			case ModelviewPackage.FILTER__INTERFACE:
				return getInterface();
			case ModelviewPackage.FILTER__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case ModelviewPackage.FILTER__SOURCE:
				return getSource();
			case ModelviewPackage.FILTER__DISCIPLINE:
				return getDiscipline();
			case ModelviewPackage.FILTER__TEXT:
				return getText();
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
			case ModelviewPackage.FILTER__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends ComponentInterface>)newValue);
				return;
			case ModelviewPackage.FILTER__COMPONENT:
				setComponent((Component)newValue);
				return;
			case ModelviewPackage.FILTER__SOURCE:
				setSource((String)newValue);
				return;
			case ModelviewPackage.FILTER__DISCIPLINE:
				getDiscipline().clear();
				getDiscipline().addAll((Collection<? extends String>)newValue);
				return;
			case ModelviewPackage.FILTER__TEXT:
				setText((String)newValue);
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
			case ModelviewPackage.FILTER__INTERFACE:
				getInterface().clear();
				return;
			case ModelviewPackage.FILTER__COMPONENT:
				setComponent((Component)null);
				return;
			case ModelviewPackage.FILTER__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case ModelviewPackage.FILTER__DISCIPLINE:
				getDiscipline().clear();
				return;
			case ModelviewPackage.FILTER__TEXT:
				setText(TEXT_EDEFAULT);
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
			case ModelviewPackage.FILTER__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case ModelviewPackage.FILTER__COMPONENT:
				return component != null;
			case ModelviewPackage.FILTER__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case ModelviewPackage.FILTER__DISCIPLINE:
				return discipline != null && !discipline.isEmpty();
			case ModelviewPackage.FILTER__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
		result.append(" (source: ");
		result.append(source);
		result.append(", discipline: ");
		result.append(discipline);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //FilterImpl
