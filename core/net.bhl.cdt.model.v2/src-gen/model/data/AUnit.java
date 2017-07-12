/**
 */
package model.data;

import model.base.ANamedItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AUnit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.data.AUnit#getParameter <em>Parameter</em>}</li>
 *   <li>{@link model.data.AUnit#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see model.data.DataPackage#getAUnit()
 * @model
 * @generated
 */
public interface AUnit extends ANamedItem {
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
         * @see model.data.DataPackage#getAUnit_Parameter()
         * @model required="true"
         * @generated
         */
        IParameter getParameter();

        /**
         * Sets the value of the '{@link model.data.AUnit#getParameter <em>Parameter</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Parameter</em>' reference.
         * @see #getParameter()
         * @generated
         */
        void setParameter(IParameter value);

        /**
         * Returns the value of the '<em><b>Symbol</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Symbol</em>' attribute.
         * @see #setSymbol(String)
         * @see model.data.DataPackage#getAUnit_Symbol()
         * @model
         * @generated
         */
        String getSymbol();

        /**
         * Sets the value of the '{@link model.data.AUnit#getSymbol <em>Symbol</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Symbol</em>' attribute.
         * @see #getSymbol()
         * @generated
         */
        void setSymbol(String value);

} // AUnit
