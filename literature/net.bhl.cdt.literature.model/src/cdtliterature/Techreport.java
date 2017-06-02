/**
 */
package cdtliterature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Techreport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdtliterature.Techreport#getInstitution <em>Institution</em>}</li>
 * </ul>
 *
 * @see cdtliterature.CdtliteraturePackage#getTechreport()
 * @model
 * @generated
 */
public interface Techreport extends ALiteratureBase {
	/**
	 * Returns the value of the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution</em>' attribute.
	 * @see #setInstitution(String)
	 * @see cdtliterature.CdtliteraturePackage#getTechreport_Institution()
	 * @model
	 * @generated
	 */
	String getInstitution();

	/**
	 * Sets the value of the '{@link cdtliterature.Techreport#getInstitution <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' attribute.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(String value);

} // Techreport
