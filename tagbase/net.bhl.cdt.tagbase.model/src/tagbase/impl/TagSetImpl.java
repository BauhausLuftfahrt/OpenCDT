/**
 */
package tagbase.impl;

import java.util.Collection;
import java.util.Date;

import net.bhl.cdt.model.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tagbase.AbstractLoggedItem;
import tagbase.NamedTag;
import tagbase.TagSet;
import tagbase.TagbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tagbase.impl.TagSetImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link tagbase.impl.TagSetImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link tagbase.impl.TagSetImpl#getLastChanger <em>Last Changer</em>}</li>
 *   <li>{@link tagbase.impl.TagSetImpl#getLastChangeDate <em>Last Change Date</em>}</li>
 *   <li>{@link tagbase.impl.TagSetImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagSetImpl extends NamedElementImpl implements TagSet {
	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastChanger() <em>Last Changer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChanger()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_CHANGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastChanger() <em>Last Changer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChanger()
	 * @generated
	 * @ordered
	 */
	protected String lastChanger = LAST_CHANGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastChangeDate() <em>Last Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChangeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_CHANGE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastChangeDate() <em>Last Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChangeDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastChangeDate = LAST_CHANGE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedTag> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagbasePackage.Literals.TAG_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG_SET__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG_SET__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastChanger() {
		return lastChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastChanger(String newLastChanger) {
		String oldLastChanger = lastChanger;
		lastChanger = newLastChanger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG_SET__LAST_CHANGER, oldLastChanger, lastChanger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastChangeDate() {
		return lastChangeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastChangeDate(Date newLastChangeDate) {
		Date oldLastChangeDate = lastChangeDate;
		lastChangeDate = newLastChangeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG_SET__LAST_CHANGE_DATE, oldLastChangeDate, lastChangeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedTag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<NamedTag>(NamedTag.class, this, TagbasePackage.TAG_SET__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TagbasePackage.TAG_SET__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
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
			case TagbasePackage.TAG_SET__CREATOR:
				return getCreator();
			case TagbasePackage.TAG_SET__CREATION_DATE:
				return getCreationDate();
			case TagbasePackage.TAG_SET__LAST_CHANGER:
				return getLastChanger();
			case TagbasePackage.TAG_SET__LAST_CHANGE_DATE:
				return getLastChangeDate();
			case TagbasePackage.TAG_SET__TAGS:
				return getTags();
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
			case TagbasePackage.TAG_SET__CREATOR:
				setCreator((String)newValue);
				return;
			case TagbasePackage.TAG_SET__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case TagbasePackage.TAG_SET__LAST_CHANGER:
				setLastChanger((String)newValue);
				return;
			case TagbasePackage.TAG_SET__LAST_CHANGE_DATE:
				setLastChangeDate((Date)newValue);
				return;
			case TagbasePackage.TAG_SET__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends NamedTag>)newValue);
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
			case TagbasePackage.TAG_SET__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case TagbasePackage.TAG_SET__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case TagbasePackage.TAG_SET__LAST_CHANGER:
				setLastChanger(LAST_CHANGER_EDEFAULT);
				return;
			case TagbasePackage.TAG_SET__LAST_CHANGE_DATE:
				setLastChangeDate(LAST_CHANGE_DATE_EDEFAULT);
				return;
			case TagbasePackage.TAG_SET__TAGS:
				getTags().clear();
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
			case TagbasePackage.TAG_SET__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case TagbasePackage.TAG_SET__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case TagbasePackage.TAG_SET__LAST_CHANGER:
				return LAST_CHANGER_EDEFAULT == null ? lastChanger != null : !LAST_CHANGER_EDEFAULT.equals(lastChanger);
			case TagbasePackage.TAG_SET__LAST_CHANGE_DATE:
				return LAST_CHANGE_DATE_EDEFAULT == null ? lastChangeDate != null : !LAST_CHANGE_DATE_EDEFAULT.equals(lastChangeDate);
			case TagbasePackage.TAG_SET__TAGS:
				return tags != null && !tags.isEmpty();
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
		if (baseClass == AbstractLoggedItem.class) {
			switch (derivedFeatureID) {
				case TagbasePackage.TAG_SET__CREATOR: return TagbasePackage.ABSTRACT_LOGGED_ITEM__CREATOR;
				case TagbasePackage.TAG_SET__CREATION_DATE: return TagbasePackage.ABSTRACT_LOGGED_ITEM__CREATION_DATE;
				case TagbasePackage.TAG_SET__LAST_CHANGER: return TagbasePackage.ABSTRACT_LOGGED_ITEM__LAST_CHANGER;
				case TagbasePackage.TAG_SET__LAST_CHANGE_DATE: return TagbasePackage.ABSTRACT_LOGGED_ITEM__LAST_CHANGE_DATE;
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
		if (baseClass == AbstractLoggedItem.class) {
			switch (baseFeatureID) {
				case TagbasePackage.ABSTRACT_LOGGED_ITEM__CREATOR: return TagbasePackage.TAG_SET__CREATOR;
				case TagbasePackage.ABSTRACT_LOGGED_ITEM__CREATION_DATE: return TagbasePackage.TAG_SET__CREATION_DATE;
				case TagbasePackage.ABSTRACT_LOGGED_ITEM__LAST_CHANGER: return TagbasePackage.TAG_SET__LAST_CHANGER;
				case TagbasePackage.ABSTRACT_LOGGED_ITEM__LAST_CHANGE_DATE: return TagbasePackage.TAG_SET__LAST_CHANGE_DATE;
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
		result.append(" (Creator: ");
		result.append(creator);
		result.append(", CreationDate: ");
		result.append(creationDate);
		result.append(", LastChanger: ");
		result.append(lastChanger);
		result.append(", LastChangeDate: ");
		result.append(lastChangeDate);
		result.append(')');
		return result.toString();
	}

} //TagSetImpl
