/**
 */
package reporting.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reporting.DataDimension;
import reporting.GanttChartDataSource;
import reporting.ReportingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gantt Chart Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reporting.impl.GanttChartDataSourceImpl#getProjectPhaseField <em>Project Phase Field</em>}</li>
 *   <li>{@link reporting.impl.GanttChartDataSourceImpl#getTaskNameField <em>Task Name Field</em>}</li>
 *   <li>{@link reporting.impl.GanttChartDataSourceImpl#getStartDateField <em>Start Date Field</em>}</li>
 *   <li>{@link reporting.impl.GanttChartDataSourceImpl#getEndDateField <em>End Date Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GanttChartDataSourceImpl extends DataSourceImpl implements GanttChartDataSource {
	/**
	 * The cached value of the '{@link #getProjectPhaseField() <em>Project Phase Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPhaseField()
	 * @generated
	 * @ordered
	 */
	protected DataDimension projectPhaseField;

	/**
	 * The cached value of the '{@link #getTaskNameField() <em>Task Name Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskNameField()
	 * @generated
	 * @ordered
	 */
	protected DataDimension taskNameField;

	/**
	 * The cached value of the '{@link #getStartDateField() <em>Start Date Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateField()
	 * @generated
	 * @ordered
	 */
	protected DataDimension startDateField;

	/**
	 * The cached value of the '{@link #getEndDateField() <em>End Date Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDateField()
	 * @generated
	 * @ordered
	 */
	protected DataDimension endDateField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GanttChartDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingPackage.Literals.GANTT_CHART_DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDimension getProjectPhaseField() {
		return projectPhaseField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectPhaseField(DataDimension newProjectPhaseField, NotificationChain msgs) {
		DataDimension oldProjectPhaseField = projectPhaseField;
		projectPhaseField = newProjectPhaseField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD, oldProjectPhaseField, newProjectPhaseField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectPhaseField(DataDimension newProjectPhaseField) {
		if (newProjectPhaseField != projectPhaseField) {
			NotificationChain msgs = null;
			if (projectPhaseField != null)
				msgs = ((InternalEObject)projectPhaseField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD, null, msgs);
			if (newProjectPhaseField != null)
				msgs = ((InternalEObject)newProjectPhaseField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD, null, msgs);
			msgs = basicSetProjectPhaseField(newProjectPhaseField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD, newProjectPhaseField, newProjectPhaseField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDimension getTaskNameField() {
		return taskNameField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskNameField(DataDimension newTaskNameField, NotificationChain msgs) {
		DataDimension oldTaskNameField = taskNameField;
		taskNameField = newTaskNameField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD, oldTaskNameField, newTaskNameField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskNameField(DataDimension newTaskNameField) {
		if (newTaskNameField != taskNameField) {
			NotificationChain msgs = null;
			if (taskNameField != null)
				msgs = ((InternalEObject)taskNameField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD, null, msgs);
			if (newTaskNameField != null)
				msgs = ((InternalEObject)newTaskNameField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD, null, msgs);
			msgs = basicSetTaskNameField(newTaskNameField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD, newTaskNameField, newTaskNameField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDimension getStartDateField() {
		return startDateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartDateField(DataDimension newStartDateField, NotificationChain msgs) {
		DataDimension oldStartDateField = startDateField;
		startDateField = newStartDateField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.GANTT_CHART_DATA_SOURCE__START_DATE_FIELD, oldStartDateField, newStartDateField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDateField(DataDimension newStartDateField) {
		if (newStartDateField != startDateField) {
			NotificationChain msgs = null;
			if (startDateField != null)
				msgs = ((InternalEObject)startDateField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.GANTT_CHART_DATA_SOURCE__START_DATE_FIELD, null, msgs);
			if (newStartDateField != null)
				msgs = ((InternalEObject)newStartDateField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.GANTT_CHART_DATA_SOURCE__START_DATE_FIELD, null, msgs);
			msgs = basicSetStartDateField(newStartDateField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.GANTT_CHART_DATA_SOURCE__START_DATE_FIELD, newStartDateField, newStartDateField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDimension getEndDateField() {
		return endDateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDateField(DataDimension newEndDateField, NotificationChain msgs) {
		DataDimension oldEndDateField = endDateField;
		endDateField = newEndDateField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.GANTT_CHART_DATA_SOURCE__END_DATE_FIELD, oldEndDateField, newEndDateField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDateField(DataDimension newEndDateField) {
		if (newEndDateField != endDateField) {
			NotificationChain msgs = null;
			if (endDateField != null)
				msgs = ((InternalEObject)endDateField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.GANTT_CHART_DATA_SOURCE__END_DATE_FIELD, null, msgs);
			if (newEndDateField != null)
				msgs = ((InternalEObject)newEndDateField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.GANTT_CHART_DATA_SOURCE__END_DATE_FIELD, null, msgs);
			msgs = basicSetEndDateField(newEndDateField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.GANTT_CHART_DATA_SOURCE__END_DATE_FIELD, newEndDateField, newEndDateField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD:
				return basicSetProjectPhaseField(null, msgs);
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD:
				return basicSetTaskNameField(null, msgs);
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__START_DATE_FIELD:
				return basicSetStartDateField(null, msgs);
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__END_DATE_FIELD:
				return basicSetEndDateField(null, msgs);
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
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD:
				return getProjectPhaseField();
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD:
				return getTaskNameField();
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__START_DATE_FIELD:
				return getStartDateField();
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__END_DATE_FIELD:
				return getEndDateField();
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
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD:
				setProjectPhaseField((DataDimension)newValue);
				return;
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD:
				setTaskNameField((DataDimension)newValue);
				return;
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__START_DATE_FIELD:
				setStartDateField((DataDimension)newValue);
				return;
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__END_DATE_FIELD:
				setEndDateField((DataDimension)newValue);
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
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD:
				setProjectPhaseField((DataDimension)null);
				return;
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD:
				setTaskNameField((DataDimension)null);
				return;
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__START_DATE_FIELD:
				setStartDateField((DataDimension)null);
				return;
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__END_DATE_FIELD:
				setEndDateField((DataDimension)null);
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
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD:
				return projectPhaseField != null;
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD:
				return taskNameField != null;
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__START_DATE_FIELD:
				return startDateField != null;
			case ReportingPackage.GANTT_CHART_DATA_SOURCE__END_DATE_FIELD:
				return endDateField != null;
		}
		return super.eIsSet(featureID);
	}

} //GanttChartDataSourceImpl
