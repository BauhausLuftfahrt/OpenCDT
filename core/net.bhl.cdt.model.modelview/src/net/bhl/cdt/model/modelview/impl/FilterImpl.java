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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getDiscipline <em>Discipline</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getDesignPhase <em>Design Phase</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getSource <em>Source</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.impl.FilterImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterImpl extends SetExpressionImpl implements Filter {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The default value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COMPLEMENT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected Boolean complement = COMPLEMENT_EDEFAULT;

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
	 * The cached value of the '{@link #getDesignPhase() <em>Design Phase</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignPhase()
	 * @generated
	 * @ordered
	 */
	protected EList<String> designPhase;

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
	 * The default value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected String annotation = ANNOTATION_EDEFAULT;

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
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInterface> interface_;

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
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectResolvingEList<Component>(Component.class, this, ModelviewPackage.FILTER__COMPONENT);
		}
		return component;
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
	public String getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(String newAnnotation) {
		String oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelviewPackage.FILTER__ANNOTATION, oldAnnotation, annotation));
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
	public EList<String> getDesignPhase() {
		if (designPhase == null) {
			designPhase = new EDataTypeUniqueEList<String>(String.class, this, ModelviewPackage.FILTER__DESIGN_PHASE);
		}
		return designPhase;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelviewPackage.FILTER__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<ComponentInterface>(ComponentInterface.class, this, ModelviewPackage.FILTER__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getComplement() {
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplement(Boolean newComplement) {
		Boolean oldComplement = complement;
		complement = newComplement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelviewPackage.FILTER__COMPLEMENT, oldComplement, complement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelviewPackage.FILTER__COMPONENT:
				return getComponent();
			case ModelviewPackage.FILTER__COMPLEMENT:
				return getComplement();
			case ModelviewPackage.FILTER__DISCIPLINE:
				return getDiscipline();
			case ModelviewPackage.FILTER__DESIGN_PHASE:
				return getDesignPhase();
			case ModelviewPackage.FILTER__SOURCE:
				return getSource();
			case ModelviewPackage.FILTER__ANNOTATION:
				return getAnnotation();
			case ModelviewPackage.FILTER__OWNER:
				return getOwner();
			case ModelviewPackage.FILTER__INTERFACE:
				return getInterface();
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
			case ModelviewPackage.FILTER__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case ModelviewPackage.FILTER__COMPLEMENT:
				setComplement((Boolean)newValue);
				return;
			case ModelviewPackage.FILTER__DISCIPLINE:
				getDiscipline().clear();
				getDiscipline().addAll((Collection<? extends String>)newValue);
				return;
			case ModelviewPackage.FILTER__DESIGN_PHASE:
				getDesignPhase().clear();
				getDesignPhase().addAll((Collection<? extends String>)newValue);
				return;
			case ModelviewPackage.FILTER__SOURCE:
				setSource((String)newValue);
				return;
			case ModelviewPackage.FILTER__ANNOTATION:
				setAnnotation((String)newValue);
				return;
			case ModelviewPackage.FILTER__OWNER:
				setOwner((String)newValue);
				return;
			case ModelviewPackage.FILTER__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends ComponentInterface>)newValue);
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
			case ModelviewPackage.FILTER__COMPONENT:
				getComponent().clear();
				return;
			case ModelviewPackage.FILTER__COMPLEMENT:
				setComplement(COMPLEMENT_EDEFAULT);
				return;
			case ModelviewPackage.FILTER__DISCIPLINE:
				getDiscipline().clear();
				return;
			case ModelviewPackage.FILTER__DESIGN_PHASE:
				getDesignPhase().clear();
				return;
			case ModelviewPackage.FILTER__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case ModelviewPackage.FILTER__ANNOTATION:
				setAnnotation(ANNOTATION_EDEFAULT);
				return;
			case ModelviewPackage.FILTER__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case ModelviewPackage.FILTER__INTERFACE:
				getInterface().clear();
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
			case ModelviewPackage.FILTER__COMPONENT:
				return component != null && !component.isEmpty();
			case ModelviewPackage.FILTER__COMPLEMENT:
				return COMPLEMENT_EDEFAULT == null ? complement != null : !COMPLEMENT_EDEFAULT.equals(complement);
			case ModelviewPackage.FILTER__DISCIPLINE:
				return discipline != null && !discipline.isEmpty();
			case ModelviewPackage.FILTER__DESIGN_PHASE:
				return designPhase != null && !designPhase.isEmpty();
			case ModelviewPackage.FILTER__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case ModelviewPackage.FILTER__ANNOTATION:
				return ANNOTATION_EDEFAULT == null ? annotation != null : !ANNOTATION_EDEFAULT.equals(annotation);
			case ModelviewPackage.FILTER__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case ModelviewPackage.FILTER__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
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
		result.append(" (complement: ");
		result.append(complement);
		result.append(", discipline: ");
		result.append(discipline);
		result.append(", designPhase: ");
		result.append(designPhase);
		result.append(", source: ");
		result.append(source);
		result.append(", annotation: ");
		result.append(annotation);
		result.append(", owner: ");
		result.append(owner);
		result.append(')');
		return result.toString();
	}

} //FilterImpl
