/**
 */
package reporting;

import net.bhl.cdt.model.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reporting.Axis#getTitle <em>Title</em>}</li>
 *   <li>{@link reporting.Axis#getChart <em>Chart</em>}</li>
 * </ul>
 *
 * @see reporting.ReportingPackage#getAxis()
 * @model
 * @generated
 */
public interface Axis extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TextElement)
	 * @see reporting.ReportingPackage#getAxis_Title()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextElement getTitle();

	/**
	 * Sets the value of the '{@link reporting.Axis#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TextElement value);

	/**
	 * Returns the value of the '<em><b>Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' reference.
	 * @see #setChart(Chart)
	 * @see reporting.ReportingPackage#getAxis_Chart()
	 * @model
	 * @generated
	 */
	Chart getChart();

	/**
	 * Sets the value of the '{@link reporting.Axis#getChart <em>Chart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart</em>' reference.
	 * @see #getChart()
	 * @generated
	 */
	void setChart(Chart value);

} // Axis
