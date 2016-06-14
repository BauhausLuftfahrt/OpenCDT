/**
 */
package tagbase.impl;

import java.util.Collection;
import java.util.Date;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.NamedElement;

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

import tagbase.NamedTagDefinition;
import tagbase.TagBase;
import tagbase.TagSet;
import tagbase.TagableSet;
import tagbase.TagbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tagbase.impl.TagBaseImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link tagbase.impl.TagBaseImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link tagbase.impl.TagBaseImpl#getLastChanger <em>Last Changer</em>}</li>
 *   <li>{@link tagbase.impl.TagBaseImpl#getLastChangeDate <em>Last Change Date</em>}</li>
 *   <li>{@link tagbase.impl.TagBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link tagbase.impl.TagBaseImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link tagbase.impl.TagBaseImpl#getTagDefinitions <em>Tag Definitions</em>}</li>
 *   <li>{@link tagbase.impl.TagBaseImpl#getTagSets <em>Tag Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagBaseImpl extends MinimalEObjectImpl.Container implements TagBase {
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
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<TagableSet> tables;

	/**
	 * The cached value of the '{@link #getTagDefinitions() <em>Tag Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedTagDefinition> tagDefinitions;

	/**
	 * The cached value of the '{@link #getTagSets() <em>Tag Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagSets()
	 * @generated
	 * @ordered
	 */
	protected EList<TagSet> tagSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagbasePackage.Literals.TAG_BASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG_BASE__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG_BASE__CREATION_DATE, oldCreationDate, creationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG_BASE__LAST_CHANGER, oldLastChanger, lastChanger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG_BASE__LAST_CHANGE_DATE, oldLastChangeDate, lastChangeDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TagbasePackage.TAG_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TagableSet> getTables() {
		if (tables == null) {
			tables = new EObjectResolvingEList<TagableSet>(TagableSet.class, this, TagbasePackage.TAG_BASE__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedTagDefinition> getTagDefinitions() {
		if (tagDefinitions == null) {
			tagDefinitions = new EObjectContainmentEList<NamedTagDefinition>(NamedTagDefinition.class, this, TagbasePackage.TAG_BASE__TAG_DEFINITIONS);
		}
		return tagDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TagSet> getTagSets() {
		if (tagSets == null) {
			tagSets = new EObjectContainmentEList<TagSet>(TagSet.class, this, TagbasePackage.TAG_BASE__TAG_SETS);
		}
		return tagSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TagbasePackage.TAG_BASE__TAG_DEFINITIONS:
				return ((InternalEList<?>)getTagDefinitions()).basicRemove(otherEnd, msgs);
			case TagbasePackage.TAG_BASE__TAG_SETS:
				return ((InternalEList<?>)getTagSets()).basicRemove(otherEnd, msgs);
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
			case TagbasePackage.TAG_BASE__CREATOR:
				return getCreator();
			case TagbasePackage.TAG_BASE__CREATION_DATE:
				return getCreationDate();
			case TagbasePackage.TAG_BASE__LAST_CHANGER:
				return getLastChanger();
			case TagbasePackage.TAG_BASE__LAST_CHANGE_DATE:
				return getLastChangeDate();
			case TagbasePackage.TAG_BASE__NAME:
				return getName();
			case TagbasePackage.TAG_BASE__TABLES:
				return getTables();
			case TagbasePackage.TAG_BASE__TAG_DEFINITIONS:
				return getTagDefinitions();
			case TagbasePackage.TAG_BASE__TAG_SETS:
				return getTagSets();
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
			case TagbasePackage.TAG_BASE__CREATOR:
				setCreator((String)newValue);
				return;
			case TagbasePackage.TAG_BASE__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case TagbasePackage.TAG_BASE__LAST_CHANGER:
				setLastChanger((String)newValue);
				return;
			case TagbasePackage.TAG_BASE__LAST_CHANGE_DATE:
				setLastChangeDate((Date)newValue);
				return;
			case TagbasePackage.TAG_BASE__NAME:
				setName((String)newValue);
				return;
			case TagbasePackage.TAG_BASE__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends TagableSet>)newValue);
				return;
			case TagbasePackage.TAG_BASE__TAG_DEFINITIONS:
				getTagDefinitions().clear();
				getTagDefinitions().addAll((Collection<? extends NamedTagDefinition>)newValue);
				return;
			case TagbasePackage.TAG_BASE__TAG_SETS:
				getTagSets().clear();
				getTagSets().addAll((Collection<? extends TagSet>)newValue);
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
			case TagbasePackage.TAG_BASE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case TagbasePackage.TAG_BASE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case TagbasePackage.TAG_BASE__LAST_CHANGER:
				setLastChanger(LAST_CHANGER_EDEFAULT);
				return;
			case TagbasePackage.TAG_BASE__LAST_CHANGE_DATE:
				setLastChangeDate(LAST_CHANGE_DATE_EDEFAULT);
				return;
			case TagbasePackage.TAG_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TagbasePackage.TAG_BASE__TABLES:
				getTables().clear();
				return;
			case TagbasePackage.TAG_BASE__TAG_DEFINITIONS:
				getTagDefinitions().clear();
				return;
			case TagbasePackage.TAG_BASE__TAG_SETS:
				getTagSets().clear();
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
			case TagbasePackage.TAG_BASE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case TagbasePackage.TAG_BASE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case TagbasePackage.TAG_BASE__LAST_CHANGER:
				return LAST_CHANGER_EDEFAULT == null ? lastChanger != null : !LAST_CHANGER_EDEFAULT.equals(lastChanger);
			case TagbasePackage.TAG_BASE__LAST_CHANGE_DATE:
				return LAST_CHANGE_DATE_EDEFAULT == null ? lastChangeDate != null : !LAST_CHANGE_DATE_EDEFAULT.equals(lastChangeDate);
			case TagbasePackage.TAG_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TagbasePackage.TAG_BASE__TABLES:
				return tables != null && !tables.isEmpty();
			case TagbasePackage.TAG_BASE__TAG_DEFINITIONS:
				return tagDefinitions != null && !tagDefinitions.isEmpty();
			case TagbasePackage.TAG_BASE__TAG_SETS:
				return tagSets != null && !tagSets.isEmpty();
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
				case TagbasePackage.TAG_BASE__NAME: return ModelPackage.NAMED_ELEMENT__NAME;
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
				case ModelPackage.NAMED_ELEMENT__NAME: return TagbasePackage.TAG_BASE__NAME;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TagBaseImpl
