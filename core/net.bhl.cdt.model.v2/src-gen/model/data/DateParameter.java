/**
 */
package model.data;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.data.DateParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see model.data.DataPackage#getDateParameter()
 * @model
 * @generated
 */
public interface DateParameter extends IParameter {
        /**
         * Returns the value of the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' attribute.
         * @see #setValue(Date)
         * @see model.data.DataPackage#getDateParameter_Value()
         * @model
         * @generated
         */
        Date getValue();

        /**
         * Sets the value of the '{@link model.data.DateParameter#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' attribute.
         * @see #getValue()
         * @generated
         */
        void setValue(Date value);

} // DateParameter
