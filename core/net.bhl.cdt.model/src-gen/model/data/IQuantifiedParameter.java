/**
 */
package model.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IQuantified Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.data.IQuantifiedParameter#getValue <em>Value</em>}</li>
 *   <li>{@link model.data.IQuantifiedParameter#getUnit <em>Unit</em>}</li>
 *   <li>{@link model.data.IQuantifiedParameter#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see model.data.DataPackage#getIQuantifiedParameter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IQuantifiedParameter<Q extends QuantityKind> extends IParameter {
        /**
         * Returns the value of the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' attribute.
         * @see #setValue(double)
         * @see model.data.DataPackage#getIQuantifiedParameter_Value()
         * @model
         * @generated
         */
        double getValue();

        /**
         * Sets the value of the '{@link model.data.IQuantifiedParameter#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' attribute.
         * @see #getValue()
         * @generated
         */
        void setValue(double value);

        /**
         * Returns the value of the '<em><b>Unit</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Unit</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Unit</em>' reference.
         * @see #setUnit(Unit)
         * @see model.data.DataPackage#getIQuantifiedParameter_Unit()
         * @model required="true"
         * @generated
         */
        Unit<Q> getUnit();

        /**
         * Sets the value of the '{@link model.data.IQuantifiedParameter#getUnit <em>Unit</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Unit</em>' reference.
         * @see #getUnit()
         * @generated
         */
        void setUnit(Unit<Q> value);

        /**
         * Returns the value of the '<em><b>Quantity</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Quantity</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Quantity</em>' reference.
         * @see #setQuantity(QuantityKind)
         * @see model.data.DataPackage#getIQuantifiedParameter_Quantity()
         * @model required="true"
         * @generated
         */
        Q getQuantity();

        /**
         * Sets the value of the '{@link model.data.IQuantifiedParameter#getQuantity <em>Quantity</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Quantity</em>' reference.
         * @see #getQuantity()
         * @generated
         */
        void setQuantity(Q value);

} // IQuantifiedParameter
