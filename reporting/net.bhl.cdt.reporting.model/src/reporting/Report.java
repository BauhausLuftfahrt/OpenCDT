/**
 */
package reporting;

import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.Report#getMap <em>Map</em>}</li>
 *   <li>{@link reporting.Report#getCharts <em>Charts</em>}</li>
 *   <li>{@link reporting.Report#getDataSources <em>Data Sources</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getReport()
 * @model
 * @generated
 */
public interface Report extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link reporting.ReportMap#getReports <em>Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' container reference.
	 * @see #setMap(ReportMap)
	 * @see reporting.ReportingPackage#getReport_Map()
	 * @see reporting.ReportMap#getReports
	 * @model opposite="Reports" transient="false"
	 * @generated
	 */
	ReportMap getMap();

	/**
	 * Sets the value of the '{@link reporting.Report#getMap <em>Map</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' container reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(ReportMap value);

	/**
	 * Returns the value of the '<em><b>Charts</b></em>' containment reference list.
	 * The list contents are of type {@link reporting.Chart}.
	 * It is bidirectional and its opposite is '{@link reporting.Chart#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charts</em>' containment reference list.
	 * @see reporting.ReportingPackage#getReport_Charts()
	 * @see reporting.Chart#getReport
	 * @model opposite="Report" containment="true" keys="name"
	 * @generated
	 */
	EList<Chart> getCharts();

	/**
	 * Returns the value of the '<em><b>Data Sources</b></em>' containment reference list.
	 * The list contents are of type {@link reporting.DataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sources</em>' containment reference list.
	 * @see reporting.ReportingPackage#getReport_DataSources()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<DataSource> getDataSources();

} // Report
