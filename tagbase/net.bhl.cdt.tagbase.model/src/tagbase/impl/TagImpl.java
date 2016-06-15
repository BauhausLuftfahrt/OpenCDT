/**
 */
package tagbase.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tagbase.Tag;
import tagbase.TagbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tagbase.impl.TagImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link tagbase.impl.TagImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link tagbase.impl.TagImpl#getLastChanger <em>Last Changer</em>}</li>
 *   <li>{@link tagbase.impl.TagImpl#getLastChangeDate <em>Last Change Date</em>}</li>
 *   <li>{@link tagbase.impl.TagImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends MinimalEObjectImpl.Container implements Tag {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagbasePackage.Literals.TAG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG__CREATION_DATE, oldCreationDate, creationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG__LAST_CHANGER, oldLastChanger, lastChanger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG__LAST_CHANGE_DATE, oldLastChangeDate, lastChangeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TagbasePackage.TAG__CREATOR:
				return getCreator();
			case TagbasePackage.TAG__CREATION_DATE:
				return getCreationDate();
			case TagbasePackage.TAG__LAST_CHANGER:
				return getLastChanger();
			case TagbasePackage.TAG__LAST_CHANGE_DATE:
				return getLastChangeDate();
			case TagbasePackage.TAG__VALUE:
				return getValue();
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
			case TagbasePackage.TAG__CREATOR:
				setCreator((String)newValue);
				return;
			case TagbasePackage.TAG__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case TagbasePackage.TAG__LAST_CHANGER:
				setLastChanger((String)newValue);
				return;
			case TagbasePackage.TAG__LAST_CHANGE_DATE:
				setLastChangeDate((Date)newValue);
				return;
			case TagbasePackage.TAG__VALUE:
				setValue((String)newValue);
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
			case TagbasePackage.TAG__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case TagbasePackage.TAG__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case TagbasePackage.TAG__LAST_CHANGER:
				setLastChanger(LAST_CHANGER_EDEFAULT);
				return;
			case TagbasePackage.TAG__LAST_CHANGE_DATE:
				setLastChangeDate(LAST_CHANGE_DATE_EDEFAULT);
				return;
			case TagbasePackage.TAG__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case TagbasePackage.TAG__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case TagbasePackage.TAG__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case TagbasePackage.TAG__LAST_CHANGER:
				return LAST_CHANGER_EDEFAULT == null ? lastChanger != null : !LAST_CHANGER_EDEFAULT.equals(lastChanger);
			case TagbasePackage.TAG__LAST_CHANGE_DATE:
				return LAST_CHANGE_DATE_EDEFAULT == null ? lastChangeDate != null : !LAST_CHANGE_DATE_EDEFAULT.equals(lastChangeDate);
			case TagbasePackage.TAG__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (Creator: ");
		result.append(creator);
		result.append(", CreationDate: ");
		result.append(creationDate);
		result.append(", LastChanger: ");
		result.append(lastChanger);
		result.append(", LastChangeDate: ");
		result.append(lastChangeDate);
		result.append(", Value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TagImpl
