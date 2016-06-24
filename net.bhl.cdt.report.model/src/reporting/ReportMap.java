/**
 */
package reporting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.ReportMap#getReports <em>Reports</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getReportMap()
 * @model
 * @generated
 */
public interface ReportMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Reports</b></em>' containment reference list.
	 * The list contents are of type {@link reporting.Report}.
	 * It is bidirectional and its opposite is '{@link reporting.Report#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reports</em>' containment reference list.
	 * @see reporting.ReportingPackage#getReportMap_Reports()
	 * @see reporting.Report#getMap
	 * @model opposite="Map" containment="true" keys="name"
	 * @generated
	 */
	EList<Report> getReports();

} // ReportMap
