/**
 */
package reporting.impl;

import java.util.Collection;

import net.bhl.cdt.model.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import reporting.Chart;
import reporting.DataSource;
import reporting.Report;
import reporting.ReportMap;
import reporting.ReportingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reporting.impl.ReportImpl#getMap <em>Map</em>}</li>
 *   <li>{@link reporting.impl.ReportImpl#getCharts <em>Charts</em>}</li>
 *   <li>{@link reporting.impl.ReportImpl#getDataSources <em>Data Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportImpl extends NamedElementImpl implements Report {
	/**
	 * The cached value of the '{@link #getCharts() <em>Charts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharts()
	 * @generated
	 * @ordered
	 */
	protected EList<Chart> charts;

	/**
	 * The cached value of the '{@link #getDataSources() <em>Data Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSources()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> dataSources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingPackage.Literals.REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportMap getMap() {
		if (eContainerFeatureID() != ReportingPackage.REPORT__MAP) return null;
		return (ReportMap)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(ReportMap newMap, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMap, ReportingPackage.REPORT__MAP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(ReportMap newMap) {
		if (newMap != eInternalContainer() || (eContainerFeatureID() != ReportingPackage.REPORT__MAP && newMap != null)) {
			if (EcoreUtil.isAncestor(this, newMap))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMap != null)
				msgs = ((InternalEObject)newMap).eInverseAdd(this, ReportingPackage.REPORT_MAP__REPORTS, ReportMap.class, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.REPORT__MAP, newMap, newMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chart> getCharts() {
		if (charts == null) {
			charts = new EObjectContainmentWithInverseEList<Chart>(Chart.class, this, ReportingPackage.REPORT__CHARTS, ReportingPackage.CHART__REPORT);
		}
		return charts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSource> getDataSources() {
		if (dataSources == null) {
			dataSources = new EObjectContainmentEList<DataSource>(DataSource.class, this, ReportingPackage.REPORT__DATA_SOURCES);
		}
		return dataSources;
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
			case ReportingPackage.REPORT__MAP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMap((ReportMap)otherEnd, msgs);
			case ReportingPackage.REPORT__CHARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCharts()).basicAdd(otherEnd, msgs);
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
			case ReportingPackage.REPORT__MAP:
				return basicSetMap(null, msgs);
			case ReportingPackage.REPORT__CHARTS:
				return ((InternalEList<?>)getCharts()).basicRemove(otherEnd, msgs);
			case ReportingPackage.REPORT__DATA_SOURCES:
				return ((InternalEList<?>)getDataSources()).basicRemove(otherEnd, msgs);
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
			case ReportingPackage.REPORT__MAP:
				return eInternalContainer().eInverseRemove(this, ReportingPackage.REPORT_MAP__REPORTS, ReportMap.class, msgs);
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
			case ReportingPackage.REPORT__MAP:
				return getMap();
			case ReportingPackage.REPORT__CHARTS:
				return getCharts();
			case ReportingPackage.REPORT__DATA_SOURCES:
				return getDataSources();
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
			case ReportingPackage.REPORT__MAP:
				setMap((ReportMap)newValue);
				return;
			case ReportingPackage.REPORT__CHARTS:
				getCharts().clear();
				getCharts().addAll((Collection<? extends Chart>)newValue);
				return;
			case ReportingPackage.REPORT__DATA_SOURCES:
				getDataSources().clear();
				getDataSources().addAll((Collection<? extends DataSource>)newValue);
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
			case ReportingPackage.REPORT__MAP:
				setMap((ReportMap)null);
				return;
			case ReportingPackage.REPORT__CHARTS:
				getCharts().clear();
				return;
			case ReportingPackage.REPORT__DATA_SOURCES:
				getDataSources().clear();
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
			case ReportingPackage.REPORT__MAP:
				return getMap() != null;
			case ReportingPackage.REPORT__CHARTS:
				return charts != null && !charts.isEmpty();
			case ReportingPackage.REPORT__DATA_SOURCES:
				return dataSources != null && !dataSources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReportImpl
