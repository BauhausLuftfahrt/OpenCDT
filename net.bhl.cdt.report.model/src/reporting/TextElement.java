/**
 */
package reporting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.TextElement#getText <em>Text</em>}</li>
 *   <li>{@link reporting.TextElement#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getTextElement()
 * @model
 * @generated
 */
public interface TextElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see reporting.ReportingPackage#getTextElement_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link reporting.TextElement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link reporting.FontProperties#getTextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(FontProperties)
	 * @see reporting.ReportingPackage#getTextElement_Properties()
	 * @see reporting.FontProperties#getTextElement
	 * @model opposite="TextElement" containment="true" required="true"
	 * @generated
	 */
	FontProperties getProperties();

	/**
	 * Sets the value of the '{@link reporting.TextElement#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(FontProperties value);

} // TextElement
