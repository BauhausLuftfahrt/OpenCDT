/**
 */
package reporting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.Chart2D#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link reporting.Chart2D#getYAxis <em>YAxis</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getChart2D()
 * @model abstract="true"
 * @generated
 */
public interface Chart2D extends Chart {
	/**
	 * Returns the value of the '<em><b>XAxis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAxis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis</em>' containment reference.
	 * @see #setXAxis(Axis)
	 * @see reporting.ReportingPackage#getChart2D_XAxis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Axis getXAxis();

	/**
	 * Sets the value of the '{@link reporting.Chart2D#getXAxis <em>XAxis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis</em>' containment reference.
	 * @see #getXAxis()
	 * @generated
	 */
	void setXAxis(Axis value);

	/**
	 * Returns the value of the '<em><b>YAxis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAxis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis</em>' containment reference.
	 * @see #setYAxis(Axis)
	 * @see reporting.ReportingPackage#getChart2D_YAxis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Axis getYAxis();

	/**
	 * Sets the value of the '{@link reporting.Chart2D#getYAxis <em>YAxis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis</em>' containment reference.
	 * @see #getYAxis()
	 * @generated
	 */
	void setYAxis(Axis value);

} // Chart2D
