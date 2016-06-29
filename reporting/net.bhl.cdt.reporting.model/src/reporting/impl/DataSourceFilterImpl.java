/**
 */
package reporting.impl;

import net.bhl.cdt.model.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import reporting.DataSource;
import reporting.DataSourceFilter;
import reporting.ReportingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reporting.impl.DataSourceFilterImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link reporting.impl.DataSourceFilterImpl#getFilterField <em>Filter Field</em>}</li>
 *   <li>{@link reporting.impl.DataSourceFilterImpl#getFilterValue <em>Filter Value</em>}</li>
 *   <li>{@link reporting.impl.DataSourceFilterImpl#getSubSource <em>Sub Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceFilterImpl extends NamedElementImpl implements DataSourceFilter {
	/**
	 * The cached value of the '{@link #getFilterField() <em>Filter Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterField()
	 * @generated
	 * @ordered
	 */
	protected EAttribute filterField;

	/**
	 * The default value of the '{@link #getFilterValue() <em>Filter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterValue()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterValue() <em>Filter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterValue()
	 * @generated
	 * @ordered
	 */
	protected String filterValue = FILTER_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubSource() <em>Sub Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource subSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingPackage.Literals.DATA_SOURCE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDataSource() {
		if (eContainerFeatureID() != ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE) return null;
		return (DataSource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(DataSource newDataSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataSource, ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(DataSource newDataSource) {
		if (newDataSource != eInternalContainer() || (eContainerFeatureID() != ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE && newDataSource != null)) {
			if (EcoreUtil.isAncestor(this, newDataSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, ReportingPackage.DATA_SOURCE__FILTER, DataSource.class, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterField() {
		if (filterField != null && filterField.eIsProxy()) {
			InternalEObject oldFilterField = (InternalEObject)filterField;
			filterField = (EAttribute)eResolveProxy(oldFilterField);
			if (filterField != oldFilterField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingPackage.DATA_SOURCE_FILTER__FILTER_FIELD, oldFilterField, filterField));
			}
		}
		return filterField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetFilterField() {
		return filterField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterField(EAttribute newFilterField) {
		EAttribute oldFilterField = filterField;
		filterField = newFilterField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATA_SOURCE_FILTER__FILTER_FIELD, oldFilterField, filterField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterValue() {
		return filterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterValue(String newFilterValue) {
		String oldFilterValue = filterValue;
		filterValue = newFilterValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATA_SOURCE_FILTER__FILTER_VALUE, oldFilterValue, filterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getSubSource() {
		return subSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubSource(DataSource newSubSource, NotificationChain msgs) {
		DataSource oldSubSource = subSource;
		subSource = newSubSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.DATA_SOURCE_FILTER__SUB_SOURCE, oldSubSource, newSubSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSource(DataSource newSubSource) {
		if (newSubSource != subSource) {
			NotificationChain msgs = null;
			if (subSource != null)
				msgs = ((InternalEObject)subSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.DATA_SOURCE_FILTER__SUB_SOURCE, null, msgs);
			if (newSubSource != null)
				msgs = ((InternalEObject)newSubSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.DATA_SOURCE_FILTER__SUB_SOURCE, null, msgs);
			msgs = basicSetSubSource(newSubSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATA_SOURCE_FILTER__SUB_SOURCE, newSubSource, newSubSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataSource((DataSource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
			case ReportingPackage.DATA_SOURCE_FILTER__SUB_SOURCE:
				return basicSetSubSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE:
				return eInternalContainer().eInverseRemove(this, ReportingPackage.DATA_SOURCE__FILTER, DataSource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE:
				return getDataSource();
			case ReportingPackage.DATA_SOURCE_FILTER__FILTER_FIELD:
				if (resolve) return getFilterField();
				return basicGetFilterField();
			case ReportingPackage.DATA_SOURCE_FILTER__FILTER_VALUE:
				return getFilterValue();
			case ReportingPackage.DATA_SOURCE_FILTER__SUB_SOURCE:
				return getSubSource();
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
			case ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case ReportingPackage.DATA_SOURCE_FILTER__FILTER_FIELD:
				setFilterField((EAttribute)newValue);
				return;
			case ReportingPackage.DATA_SOURCE_FILTER__FILTER_VALUE:
				setFilterValue((String)newValue);
				return;
			case ReportingPackage.DATA_SOURCE_FILTER__SUB_SOURCE:
				setSubSource((DataSource)newValue);
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
			case ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE:
				setDataSource((DataSource)null);
				return;
			case ReportingPackage.DATA_SOURCE_FILTER__FILTER_FIELD:
				setFilterField((EAttribute)null);
				return;
			case ReportingPackage.DATA_SOURCE_FILTER__FILTER_VALUE:
				setFilterValue(FILTER_VALUE_EDEFAULT);
				return;
			case ReportingPackage.DATA_SOURCE_FILTER__SUB_SOURCE:
				setSubSource((DataSource)null);
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
			case ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE:
				return getDataSource() != null;
			case ReportingPackage.DATA_SOURCE_FILTER__FILTER_FIELD:
				return filterField != null;
			case ReportingPackage.DATA_SOURCE_FILTER__FILTER_VALUE:
				return FILTER_VALUE_EDEFAULT == null ? filterValue != null : !FILTER_VALUE_EDEFAULT.equals(filterValue);
			case ReportingPackage.DATA_SOURCE_FILTER__SUB_SOURCE:
				return subSource != null;
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
		result.append(" (FilterValue: ");
		result.append(filterValue);
		result.append(')');
		return result.toString();
	}

} //DataSourceFilterImpl
