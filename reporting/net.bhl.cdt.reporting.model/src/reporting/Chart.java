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
 *   <li>{@link reporting.Chart#isShowLegend <em>Show Legend</em>}</li>
 *   <li>{@link reporting.Chart#getDataSource <em>Data Source</em>}</li>
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
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(Label)
	 * @see reporting.ReportingPackage#getChart_Title()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Label getTitle();

	/**
	 * Sets the value of the '{@link reporting.Chart#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Label value);

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

	/**
	 * Returns the value of the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Legend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Legend</em>' attribute.
	 * @see #setShowLegend(boolean)
	 * @see reporting.ReportingPackage#getChart_ShowLegend()
	 * @model
	 * @generated
	 */
	boolean isShowLegend();

	/**
	 * Sets the value of the '{@link reporting.Chart#isShowLegend <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Legend</em>' attribute.
	 * @see #isShowLegend()
	 * @generated
	 */
	void setShowLegend(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link reporting.DataSource#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(DataSource)
	 * @see reporting.ReportingPackage#getChart_DataSource()
	 * @see reporting.DataSource#getChart
	 * @model opposite="Chart" containment="true"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link reporting.Chart#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

} // Chart
