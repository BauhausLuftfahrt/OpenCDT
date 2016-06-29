/**
 */
package reporting;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link reporting.DataSource#getChart <em>Chart</em>}</li>
 *   <li>{@link reporting.DataSource#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link reporting.DataSource#getSubSource <em>Sub Source</em>}</li>
 *   <li>{@link reporting.DataSource#getFilter <em>Filter</em>}</li>
 *   <li>{@link reporting.DataSource#getGroupings <em>Groupings</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends EObject {
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
	 * Returns the value of the '<em><b>Sub Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Source</em>' containment reference.
	 * @see #setSubSource(DataSource)
	 * @see reporting.ReportingPackage#getDataSource_SubSource()
	 * @model containment="true"
	 * @generated
	 */
	DataSource getSubSource();

	/**
	 * Sets the value of the '{@link reporting.DataSource#getSubSource <em>Sub Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Source</em>' containment reference.
	 * @see #getSubSource()
	 * @generated
	 */
	void setSubSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link reporting.DataSourceFilter}.
	 * It is bidirectional and its opposite is '{@link reporting.DataSourceFilter#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see reporting.ReportingPackage#getDataSource_Filter()
	 * @see reporting.DataSourceFilter#getDataSource
	 * @model opposite="DataSource" containment="true"
	 * @generated
	 */
	EList<DataSourceFilter> getFilter();

	/**
	 * Returns the value of the '<em><b>Groupings</b></em>' containment reference list.
	 * The list contents are of type {@link reporting.DataSourceGrouping}.
	 * It is bidirectional and its opposite is '{@link reporting.DataSourceGrouping#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupings</em>' containment reference list.
	 * @see reporting.ReportingPackage#getDataSource_Groupings()
	 * @see reporting.DataSourceGrouping#getDataSource
	 * @model opposite="DataSource" containment="true"
	 * @generated
	 */
	EList<DataSourceGrouping> getGroupings();

} // DataSource
