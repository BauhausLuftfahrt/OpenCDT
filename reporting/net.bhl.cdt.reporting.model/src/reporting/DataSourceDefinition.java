/**
 */
package reporting;

import net.bhl.cdt.model.NamedElement;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.DataSourceDefinition#getSource <em>Source</em>}</li>
 *   <li>{@link reporting.DataSourceDefinition#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getDataSourceDefinition()
 * @model
 * @generated
 */
public interface DataSourceDefinition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EClass)
	 * @see reporting.ReportingPackage#getDataSourceDefinition_Source()
	 * @model
	 * @generated
	 */
	EClass getSource();

	/**
	 * Sets the value of the '{@link reporting.DataSourceDefinition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EClass value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(EReference)
	 * @see reporting.ReportingPackage#getDataSourceDefinition_Member()
	 * @model
	 * @generated
	 */
	EReference getMember();

	/**
	 * Sets the value of the '{@link reporting.DataSourceDefinition#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(EReference value);

} // DataSourceDefinition
