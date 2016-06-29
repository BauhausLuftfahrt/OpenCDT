/**
 */
package reporting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gantt Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.GanttChart#getTaskNameField <em>Task Name Field</em>}</li>
 *   <li>{@link reporting.GanttChart#getStartDateField <em>Start Date Field</em>}</li>
 *   <li>{@link reporting.GanttChart#getEndDateField <em>End Date Field</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getGanttChart()
 * @model
 * @generated
 */
public interface GanttChart extends Chart2D {
	/**
	 * Returns the value of the '<em><b>Task Name Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Name Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Name Field</em>' containment reference.
	 * @see #setTaskNameField(DataField)
	 * @see reporting.ReportingPackage#getGanttChart_TaskNameField()
	 * @model containment="true"
	 * @generated
	 */
	DataField getTaskNameField();

	/**
	 * Sets the value of the '{@link reporting.GanttChart#getTaskNameField <em>Task Name Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Name Field</em>' containment reference.
	 * @see #getTaskNameField()
	 * @generated
	 */
	void setTaskNameField(DataField value);

	/**
	 * Returns the value of the '<em><b>Start Date Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date Field</em>' containment reference.
	 * @see #setStartDateField(DataField)
	 * @see reporting.ReportingPackage#getGanttChart_StartDateField()
	 * @model containment="true"
	 * @generated
	 */
	DataField getStartDateField();

	/**
	 * Sets the value of the '{@link reporting.GanttChart#getStartDateField <em>Start Date Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date Field</em>' containment reference.
	 * @see #getStartDateField()
	 * @generated
	 */
	void setStartDateField(DataField value);

	/**
	 * Returns the value of the '<em><b>End Date Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date Field</em>' containment reference.
	 * @see #setEndDateField(DataField)
	 * @see reporting.ReportingPackage#getGanttChart_EndDateField()
	 * @model containment="true"
	 * @generated
	 */
	DataField getEndDateField();

	/**
	 * Sets the value of the '{@link reporting.GanttChart#getEndDateField <em>End Date Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date Field</em>' containment reference.
	 * @see #getEndDateField()
	 * @generated
	 */
	void setEndDateField(DataField value);

} // GanttChart
