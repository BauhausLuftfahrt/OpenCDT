/**
 */
package reporting.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import reporting.Chart;
import reporting.DataSource;
import reporting.DataSourceDefinition;
import reporting.DataSourceFilter;
import reporting.DataSourceGrouping;
import reporting.ReportingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reporting.impl.DataSourceImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link reporting.impl.DataSourceImpl#getChart <em>Chart</em>}</li>
 *   <li>{@link reporting.impl.DataSourceImpl#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link reporting.impl.DataSourceImpl#getSubSource <em>Sub Source</em>}</li>
 *   <li>{@link reporting.impl.DataSourceImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link reporting.impl.DataSourceImpl#getGroupings <em>Groupings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceImpl extends MinimalEObjectImpl.Container implements DataSource {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected DataSourceDefinition definition;

	/**
	 * The cached value of the '{@link #getSourceObject() <em>Source Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected EObject sourceObject;

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
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourceFilter> filter;

	/**
	 * The cached value of the '{@link #getGroupings() <em>Groupings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupings()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourceGrouping> groupings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingPackage.Literals.DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceDefinition getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (DataSourceDefinition)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingPackage.DATA_SOURCE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceDefinition basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(DataSourceDefinition newDefinition) {
		DataSourceDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATA_SOURCE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart getChart() {
		if (eContainerFeatureID() != ReportingPackage.DATA_SOURCE__CHART) return null;
		return (Chart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChart(Chart newChart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newChart, ReportingPackage.DATA_SOURCE__CHART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChart(Chart newChart) {
		if (newChart != eInternalContainer() || (eContainerFeatureID() != ReportingPackage.DATA_SOURCE__CHART && newChart != null)) {
			if (EcoreUtil.isAncestor(this, newChart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newChart != null)
				msgs = ((InternalEObject)newChart).eInverseAdd(this, ReportingPackage.CHART__DATA_SOURCE, Chart.class, msgs);
			msgs = basicSetChart(newChart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATA_SOURCE__CHART, newChart, newChart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSourceObject() {
		if (sourceObject != null && sourceObject.eIsProxy()) {
			InternalEObject oldSourceObject = (InternalEObject)sourceObject;
			sourceObject = eResolveProxy(oldSourceObject);
			if (sourceObject != oldSourceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingPackage.DATA_SOURCE__SOURCE_OBJECT, oldSourceObject, sourceObject));
			}
		}
		return sourceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSourceObject() {
		return sourceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceObject(EObject newSourceObject) {
		EObject oldSourceObject = sourceObject;
		sourceObject = newSourceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATA_SOURCE__SOURCE_OBJECT, oldSourceObject, sourceObject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.DATA_SOURCE__SUB_SOURCE, oldSubSource, newSubSource);
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
				msgs = ((InternalEObject)subSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.DATA_SOURCE__SUB_SOURCE, null, msgs);
			if (newSubSource != null)
				msgs = ((InternalEObject)newSubSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.DATA_SOURCE__SUB_SOURCE, null, msgs);
			msgs = basicSetSubSource(newSubSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATA_SOURCE__SUB_SOURCE, newSubSource, newSubSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSourceFilter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentWithInverseEList<DataSourceFilter>(DataSourceFilter.class, this, ReportingPackage.DATA_SOURCE__FILTER, ReportingPackage.DATA_SOURCE_FILTER__DATA_SOURCE);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSourceGrouping> getGroupings() {
		if (groupings == null) {
			groupings = new EObjectContainmentWithInverseEList<DataSourceGrouping>(DataSourceGrouping.class, this, ReportingPackage.DATA_SOURCE__GROUPINGS, ReportingPackage.DATA_SOURCE_GROUPING__DATA_SOURCE);
		}
		return groupings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingPackage.DATA_SOURCE__CHART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetChart((Chart)otherEnd, msgs);
			case ReportingPackage.DATA_SOURCE__FILTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFilter()).basicAdd(otherEnd, msgs);
			case ReportingPackage.DATA_SOURCE__GROUPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupings()).basicAdd(otherEnd, msgs);
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
			case ReportingPackage.DATA_SOURCE__CHART:
				return basicSetChart(null, msgs);
			case ReportingPackage.DATA_SOURCE__SUB_SOURCE:
				return basicSetSubSource(null, msgs);
			case ReportingPackage.DATA_SOURCE__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case ReportingPackage.DATA_SOURCE__GROUPINGS:
				return ((InternalEList<?>)getGroupings()).basicRemove(otherEnd, msgs);
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
			case ReportingPackage.DATA_SOURCE__CHART:
				return eInternalContainer().eInverseRemove(this, ReportingPackage.CHART__DATA_SOURCE, Chart.class, msgs);
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
			case ReportingPackage.DATA_SOURCE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ReportingPackage.DATA_SOURCE__CHART:
				return getChart();
			case ReportingPackage.DATA_SOURCE__SOURCE_OBJECT:
				if (resolve) return getSourceObject();
				return basicGetSourceObject();
			case ReportingPackage.DATA_SOURCE__SUB_SOURCE:
				return getSubSource();
			case ReportingPackage.DATA_SOURCE__FILTER:
				return getFilter();
			case ReportingPackage.DATA_SOURCE__GROUPINGS:
				return getGroupings();
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
			case ReportingPackage.DATA_SOURCE__DEFINITION:
				setDefinition((DataSourceDefinition)newValue);
				return;
			case ReportingPackage.DATA_SOURCE__CHART:
				setChart((Chart)newValue);
				return;
			case ReportingPackage.DATA_SOURCE__SOURCE_OBJECT:
				setSourceObject((EObject)newValue);
				return;
			case ReportingPackage.DATA_SOURCE__SUB_SOURCE:
				setSubSource((DataSource)newValue);
				return;
			case ReportingPackage.DATA_SOURCE__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends DataSourceFilter>)newValue);
				return;
			case ReportingPackage.DATA_SOURCE__GROUPINGS:
				getGroupings().clear();
				getGroupings().addAll((Collection<? extends DataSourceGrouping>)newValue);
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
			case ReportingPackage.DATA_SOURCE__DEFINITION:
				setDefinition((DataSourceDefinition)null);
				return;
			case ReportingPackage.DATA_SOURCE__CHART:
				setChart((Chart)null);
				return;
			case ReportingPackage.DATA_SOURCE__SOURCE_OBJECT:
				setSourceObject((EObject)null);
				return;
			case ReportingPackage.DATA_SOURCE__SUB_SOURCE:
				setSubSource((DataSource)null);
				return;
			case ReportingPackage.DATA_SOURCE__FILTER:
				getFilter().clear();
				return;
			case ReportingPackage.DATA_SOURCE__GROUPINGS:
				getGroupings().clear();
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
			case ReportingPackage.DATA_SOURCE__DEFINITION:
				return definition != null;
			case ReportingPackage.DATA_SOURCE__CHART:
				return getChart() != null;
			case ReportingPackage.DATA_SOURCE__SOURCE_OBJECT:
				return sourceObject != null;
			case ReportingPackage.DATA_SOURCE__SUB_SOURCE:
				return subSource != null;
			case ReportingPackage.DATA_SOURCE__FILTER:
				return filter != null && !filter.isEmpty();
			case ReportingPackage.DATA_SOURCE__GROUPINGS:
				return groupings != null && !groupings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSourceImpl
