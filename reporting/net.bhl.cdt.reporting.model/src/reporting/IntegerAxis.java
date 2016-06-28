/**
 */
package reporting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.IntegerAxis#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link reporting.IntegerAxis#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getIntegerAxis()
 * @model
 * @generated
 */
public interface IntegerAxis extends Axis {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(int)
	 * @see reporting.ReportingPackage#getIntegerAxis_MinValue()
	 * @model
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link reporting.IntegerAxis#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(int value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see reporting.ReportingPackage#getIntegerAxis_MaxValue()
	 * @model
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link reporting.IntegerAxis#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

} // IntegerAxis
