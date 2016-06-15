/**
 */
package tagbase.impl;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tagbase.NamedTag;
import tagbase.NamedTagDefinition;
import tagbase.TagbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tagbase.impl.NamedTagImpl#getName <em>Name</em>}</li>
 *   <li>{@link tagbase.impl.NamedTagImpl#getTagDefinition <em>Tag Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedTagImpl extends TagImpl implements NamedTag {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTagDefinition() <em>Tag Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagDefinition()
	 * @generated
	 * @ordered
	 */
	protected NamedTagDefinition tagDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagbasePackage.Literals.NAMED_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.NAMED_TAG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTagDefinition getTagDefinition() {
		if (tagDefinition != null && tagDefinition.eIsProxy()) {
			InternalEObject oldTagDefinition = (InternalEObject)tagDefinition;
			tagDefinition = (NamedTagDefinition)eResolveProxy(oldTagDefinition);
			if (tagDefinition != oldTagDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TagbasePackage.NAMED_TAG__TAG_DEFINITION, oldTagDefinition, tagDefinition));
			}
		}
		return tagDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTagDefinition basicGetTagDefinition() {
		return tagDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagDefinition(NamedTagDefinition newTagDefinition) {
		NamedTagDefinition oldTagDefinition = tagDefinition;
		tagDefinition = newTagDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.NAMED_TAG__TAG_DEFINITION, oldTagDefinition, tagDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TagbasePackage.NAMED_TAG__NAME:
				return getName();
			case TagbasePackage.NAMED_TAG__TAG_DEFINITION:
				if (resolve) return getTagDefinition();
				return basicGetTagDefinition();
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
			case TagbasePackage.NAMED_TAG__NAME:
				setName((String)newValue);
				return;
			case TagbasePackage.NAMED_TAG__TAG_DEFINITION:
				setTagDefinition((NamedTagDefinition)newValue);
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
			case TagbasePackage.NAMED_TAG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TagbasePackage.NAMED_TAG__TAG_DEFINITION:
				setTagDefinition((NamedTagDefinition)null);
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
			case TagbasePackage.NAMED_TAG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TagbasePackage.NAMED_TAG__TAG_DEFINITION:
				return tagDefinition != null;
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case TagbasePackage.NAMED_TAG__NAME: return ModelPackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.NAMED_ELEMENT__NAME: return TagbasePackage.NAMED_TAG__NAME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NamedTagImpl
