/**
 */
package reporting;

import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.DataSourceFilter#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link reporting.DataSourceFilter#getFilterField <em>Filter Field</em>}</li>
 *   <li>{@link reporting.DataSourceFilter#getFilterValue <em>Filter Value</em>}</li>
 *   <li>{@link reporting.DataSourceFilter#getSubSource <em>Sub Source</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getDataSourceFilter()
 * @model
 * @generated
 */
public interface DataSourceFilter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link reporting.DataSource#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' container reference.
	 * @see #setDataSource(DataSource)
	 * @see reporting.ReportingPackage#getDataSourceFilter_DataSource()
	 * @see reporting.DataSource#getFilter
	 * @model opposite="Filter" transient="false"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link reporting.DataSourceFilter#getDataSource <em>Data Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' container reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Filter Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Field</em>' reference.
	 * @see #setFilterField(EAttribute)
	 * @see reporting.ReportingPackage#getDataSourceFilter_FilterField()
	 * @model
	 * @generated
	 */
	EAttribute getFilterField();

	/**
	 * Sets the value of the '{@link reporting.DataSourceFilter#getFilterField <em>Filter Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Field</em>' reference.
	 * @see #getFilterField()
	 * @generated
	 */
	void setFilterField(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Filter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Value</em>' attribute.
	 * @see #setFilterValue(String)
	 * @see reporting.ReportingPackage#getDataSourceFilter_FilterValue()
	 * @model
	 * @generated
	 */
	String getFilterValue();

	/**
	 * Sets the value of the '{@link reporting.DataSourceFilter#getFilterValue <em>Filter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Value</em>' attribute.
	 * @see #getFilterValue()
	 * @generated
	 */
	void setFilterValue(String value);

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
	 * @see reporting.ReportingPackage#getDataSourceFilter_SubSource()
	 * @model containment="true"
	 * @generated
	 */
	DataSource getSubSource();

	/**
	 * Sets the value of the '{@link reporting.DataSourceFilter#getSubSource <em>Sub Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Source</em>' containment reference.
	 * @see #getSubSource()
	 * @generated
	 */
	void setSubSource(DataSource value);

} // DataSourceFilter
