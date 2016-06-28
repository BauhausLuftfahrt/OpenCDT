/**
 */
package reporting;

import net.bhl.cdt.model.NamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.DataSource#getDefinition <em>Definition</em>}</li>
 *   <li>{@link reporting.DataSource#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link reporting.DataSource#getChart <em>Chart</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(DataSourceDefinition)
	 * @see reporting.ReportingPackage#getDataSource_Definition()
	 * @model required="true"
	 * @generated
	 */
	DataSourceDefinition getDefinition();

	/**
	 * Sets the value of the '{@link reporting.DataSource#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(DataSourceDefinition value);

	/**
	 * Returns the value of the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Object</em>' reference.
	 * @see #setSourceObject(EObject)
	 * @see reporting.ReportingPackage#getDataSource_SourceObject()
	 * @model
	 * @generated
	 */
	EObject getSourceObject();

	/**
	 * Sets the value of the '{@link reporting.DataSource#getSourceObject <em>Source Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Object</em>' reference.
	 * @see #getSourceObject()
	 * @generated
	 */
	void setSourceObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Chart</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link reporting.Chart#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' container reference.
	 * @see #setChart(Chart)
	 * @see reporting.ReportingPackage#getDataSource_Chart()
	 * @see reporting.Chart#getDataSource
	 * @model opposite="DataSource" transient="false"
	 * @generated
	 */
	Chart getChart();

	/**
	 * Sets the value of the '{@link reporting.DataSource#getChart <em>Chart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart</em>' container reference.
	 * @see #getChart()
	 * @generated
	 */
	void setChart(Chart value);

} // DataSource
