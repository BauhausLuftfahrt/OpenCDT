/**
 */
package reporting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bubble Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.BubbleChart#getXCoordinateField <em>XCoordinate Field</em>}</li>
 *   <li>{@link reporting.BubbleChart#getYCoordinateField <em>YCoordinate Field</em>}</li>
 *   <li>{@link reporting.BubbleChart#getBubbleSizeField <em>Bubble Size Field</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getBubbleChart()
 * @model
 * @generated
 */
public interface BubbleChart extends Chart2D {
	/**
	 * Returns the value of the '<em><b>XCoordinate Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XCoordinate Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCoordinate Field</em>' containment reference.
	 * @see #setXCoordinateField(DataField)
	 * @see reporting.ReportingPackage#getBubbleChart_XCoordinateField()
	 * @model containment="true"
	 * @generated
	 */
	DataField getXCoordinateField();

	/**
	 * Sets the value of the '{@link reporting.BubbleChart#getXCoordinateField <em>XCoordinate Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCoordinate Field</em>' containment reference.
	 * @see #getXCoordinateField()
	 * @generated
	 */
	void setXCoordinateField(DataField value);

	/**
	 * Returns the value of the '<em><b>YCoordinate Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YCoordinate Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCoordinate Field</em>' containment reference.
	 * @see #setYCoordinateField(DataField)
	 * @see reporting.ReportingPackage#getBubbleChart_YCoordinateField()
	 * @model containment="true"
	 * @generated
	 */
	DataField getYCoordinateField();

	/**
	 * Sets the value of the '{@link reporting.BubbleChart#getYCoordinateField <em>YCoordinate Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCoordinate Field</em>' containment reference.
	 * @see #getYCoordinateField()
	 * @generated
	 */
	void setYCoordinateField(DataField value);

	/**
	 * Returns the value of the '<em><b>Bubble Size Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bubble Size Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bubble Size Field</em>' containment reference.
	 * @see #setBubbleSizeField(DataField)
	 * @see reporting.ReportingPackage#getBubbleChart_BubbleSizeField()
	 * @model containment="true"
	 * @generated
	 */
	DataField getBubbleSizeField();

	/**
	 * Sets the value of the '{@link reporting.BubbleChart#getBubbleSizeField <em>Bubble Size Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bubble Size Field</em>' containment reference.
	 * @see #getBubbleSizeField()
	 * @generated
	 */
	void setBubbleSizeField(DataField value);

} // BubbleChart
