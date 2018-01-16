/**
 */
package model.science;

import model.base.ANamedItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.science.Unit#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see model.science.SciencePackage#getUnit()
 * @model abstract="true"
 * @generated
 */
public interface Unit<Q extends QuantityKind> extends ANamedItem {
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
         * @see model.science.SciencePackage#getUnit_Symbol()
         * @model
         * @generated
         */
        String getSymbol();

        /**
         * Sets the value of the '{@link model.science.Unit#getSymbol <em>Symbol</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Symbol</em>' attribute.
         * @see #getSymbol()
         * @generated
         */
        void setSymbol(String value);

} // Unit
