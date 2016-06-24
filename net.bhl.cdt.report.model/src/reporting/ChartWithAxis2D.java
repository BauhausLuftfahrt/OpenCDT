/**
 */
package reporting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart With Axis2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.ChartWithAxis2D#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link reporting.ChartWithAxis2D#getYAxis <em>YAxis</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getChartWithAxis2D()
 * @model
 * @generated
 */
public interface ChartWithAxis2D extends Chart {
	/**
	 * Returns the value of the '<em><b>XAxis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAxis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis</em>' reference.
	 * @see #setXAxis(Axis)
	 * @see reporting.ReportingPackage#getChartWithAxis2D_XAxis()
	 * @model required="true"
	 * @generated
	 */
	Axis getXAxis();

	/**
	 * Sets the value of the '{@link reporting.ChartWithAxis2D#getXAxis <em>XAxis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis</em>' reference.
	 * @see #getXAxis()
	 * @generated
	 */
	void setXAxis(Axis value);

	/**
	 * Returns the value of the '<em><b>YAxis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAxis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis</em>' reference.
	 * @see #setYAxis(Axis)
	 * @see reporting.ReportingPackage#getChartWithAxis2D_YAxis()
	 * @model required="true"
	 * @generated
	 */
	Axis getYAxis();

	/**
	 * Sets the value of the '{@link reporting.ChartWithAxis2D#getYAxis <em>YAxis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis</em>' reference.
	 * @see #getYAxis()
	 * @generated
	 */
	void setYAxis(Axis value);

} // ChartWithAxis2D
