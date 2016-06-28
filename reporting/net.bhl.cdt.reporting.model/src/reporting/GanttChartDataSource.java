/**
 */
package reporting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gantt Chart Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.GanttChartDataSource#getProjectPhaseField <em>Project Phase Field</em>}</li>
 *   <li>{@link reporting.GanttChartDataSource#getTaskNameField <em>Task Name Field</em>}</li>
 *   <li>{@link reporting.GanttChartDataSource#getStartDateField <em>Start Date Field</em>}</li>
 *   <li>{@link reporting.GanttChartDataSource#getEndDateField <em>End Date Field</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getGanttChartDataSource()
 * @model
 * @generated
 */
public interface GanttChartDataSource extends DataSource {
	/**
	 * Returns the value of the '<em><b>Project Phase Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Phase Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Phase Field</em>' containment reference.
	 * @see #setProjectPhaseField(DataDimension)
	 * @see reporting.ReportingPackage#getGanttChartDataSource_ProjectPhaseField()
	 * @model containment="true"
	 * @generated
	 */
	DataDimension getProjectPhaseField();

	/**
	 * Sets the value of the '{@link reporting.GanttChartDataSource#getProjectPhaseField <em>Project Phase Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Phase Field</em>' containment reference.
	 * @see #getProjectPhaseField()
	 * @generated
	 */
	void setProjectPhaseField(DataDimension value);

	/**
	 * Returns the value of the '<em><b>Task Name Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Name Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Name Field</em>' containment reference.
	 * @see #setTaskNameField(DataDimension)
	 * @see reporting.ReportingPackage#getGanttChartDataSource_TaskNameField()
	 * @model containment="true"
	 * @generated
	 */
	DataDimension getTaskNameField();

	/**
	 * Sets the value of the '{@link reporting.GanttChartDataSource#getTaskNameField <em>Task Name Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Name Field</em>' containment reference.
	 * @see #getTaskNameField()
	 * @generated
	 */
	void setTaskNameField(DataDimension value);

	/**
	 * Returns the value of the '<em><b>Start Date Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date Field</em>' containment reference.
	 * @see #setStartDateField(DataDimension)
	 * @see reporting.ReportingPackage#getGanttChartDataSource_StartDateField()
	 * @model containment="true"
	 * @generated
	 */
	DataDimension getStartDateField();

	/**
	 * Sets the value of the '{@link reporting.GanttChartDataSource#getStartDateField <em>Start Date Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date Field</em>' containment reference.
	 * @see #getStartDateField()
	 * @generated
	 */
	void setStartDateField(DataDimension value);

	/**
	 * Returns the value of the '<em><b>End Date Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date Field</em>' containment reference.
	 * @see #setEndDateField(DataDimension)
	 * @see reporting.ReportingPackage#getGanttChartDataSource_EndDateField()
	 * @model containment="true"
	 * @generated
	 */
	DataDimension getEndDateField();

	/**
	 * Sets the value of the '{@link reporting.GanttChartDataSource#getEndDateField <em>End Date Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date Field</em>' containment reference.
	 * @see #getEndDateField()
	 * @generated
	 */
	void setEndDateField(DataDimension value);

} // GanttChartDataSource
