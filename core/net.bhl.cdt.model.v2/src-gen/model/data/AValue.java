/**
 */
package model.data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AValue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.data.AValue#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see model.data.DataPackage#getAValue()
 * @model
 * @generated
 */
public interface AValue extends EObject {
	/**
         * Returns the value of the '<em><b>Parameter</b></em>' reference.
         * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
         * @return the value of the '<em>Parameter</em>' reference.
         * @see #setParameter(IParameter)
         * @see model.data.DataPackage#getAValue_Parameter()
         * @model required="true"
         * @generated
         */
	IParameter getParameter();

	/**
         * Sets the value of the '{@link model.data.AValue#getParameter <em>Parameter</em>}' reference.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @param value the new value of the '<em>Parameter</em>' reference.
         * @see #getParameter()
         * @generated
         */
	void setParameter(IParameter value);

} // AValue
