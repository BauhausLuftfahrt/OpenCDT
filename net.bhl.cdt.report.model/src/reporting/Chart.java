/**
 */
package reporting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.Chart#getTitle <em>Title</em>}</li>
 *   <li>{@link reporting.Chart#getReport <em>Report</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getChart()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Chart extends ReportElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TextElement)
	 * @see reporting.ReportingPackage#getChart_Title()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextElement getTitle();

	/**
	 * Sets the value of the '{@link reporting.Chart#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TextElement value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link reporting.Report#getCharts <em>Charts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' container reference.
	 * @see #setReport(Report)
	 * @see reporting.ReportingPackage#getChart_Report()
	 * @see reporting.Report#getCharts
	 * @model opposite="Charts" transient="false"
	 * @generated
	 */
	Report getReport();

	/**
	 * Sets the value of the '{@link reporting.Chart#getReport <em>Report</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report</em>' container reference.
	 * @see #getReport()
	 * @generated
	 */
	void setReport(Report value);

} // Chart
