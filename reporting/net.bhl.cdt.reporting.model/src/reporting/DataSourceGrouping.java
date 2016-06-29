/**
 */
package reporting;

import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Grouping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.DataSourceGrouping#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link reporting.DataSourceGrouping#getGroupingField <em>Grouping Field</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getDataSourceGrouping()
 * @model
 * @generated
 */
public interface DataSourceGrouping extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link reporting.DataSource#getGroupings <em>Groupings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' container reference.
	 * @see #setDataSource(DataSource)
	 * @see reporting.ReportingPackage#getDataSourceGrouping_DataSource()
	 * @see reporting.DataSource#getGroupings
	 * @model opposite="Groupings" transient="false"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link reporting.DataSourceGrouping#getDataSource <em>Data Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' container reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Grouping Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Field</em>' reference.
	 * @see #setGroupingField(EAttribute)
	 * @see reporting.ReportingPackage#getDataSourceGrouping_GroupingField()
	 * @model
	 * @generated
	 */
	EAttribute getGroupingField();

	/**
	 * Sets the value of the '{@link reporting.DataSourceGrouping#getGroupingField <em>Grouping Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Field</em>' reference.
	 * @see #getGroupingField()
	 * @generated
	 */
	void setGroupingField(EAttribute value);

} // DataSourceGrouping
