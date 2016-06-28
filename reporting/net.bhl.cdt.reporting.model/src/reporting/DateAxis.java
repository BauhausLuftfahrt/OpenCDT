/**
 */
package reporting;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.DateAxis#getFormatString <em>Format String</em>}</li>
 *   <li>{@link reporting.DateAxis#getMinDate <em>Min Date</em>}</li>
 *   <li>{@link reporting.DateAxis#getMaxDate <em>Max Date</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getDateAxis()
 * @model
 * @generated
 */
public interface DateAxis extends Axis {
	/**
	 * Returns the value of the '<em><b>Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format String</em>' attribute.
	 * @see #setFormatString(String)
	 * @see reporting.ReportingPackage#getDateAxis_FormatString()
	 * @model
	 * @generated
	 */
	String getFormatString();

	/**
	 * Sets the value of the '{@link reporting.DateAxis#getFormatString <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format String</em>' attribute.
	 * @see #getFormatString()
	 * @generated
	 */
	void setFormatString(String value);

	/**
	 * Returns the value of the '<em><b>Min Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Date</em>' attribute.
	 * @see #setMinDate(Date)
	 * @see reporting.ReportingPackage#getDateAxis_MinDate()
	 * @model
	 * @generated
	 */
	Date getMinDate();

	/**
	 * Sets the value of the '{@link reporting.DateAxis#getMinDate <em>Min Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Date</em>' attribute.
	 * @see #getMinDate()
	 * @generated
	 */
	void setMinDate(Date value);

	/**
	 * Returns the value of the '<em><b>Max Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Date</em>' attribute.
	 * @see #setMaxDate(Date)
	 * @see reporting.ReportingPackage#getDateAxis_MaxDate()
	 * @model
	 * @generated
	 */
	Date getMaxDate();

	/**
	 * Sets the value of the '{@link reporting.DateAxis#getMaxDate <em>Max Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Date</em>' attribute.
	 * @see #getMaxDate()
	 * @generated
	 */
	void setMaxDate(Date value);

} // DateAxis
