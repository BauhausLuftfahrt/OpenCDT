/**
 */
package model.experimental;

import javax.measure.quantity.Quantity;

import model.data.IParameter;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IQuantified Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.experimental.IQuantifiedParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see model.experimental.ExperimentalPackage#getIQuantifiedParameter()
 * @model interface="true" abstract="true" QBounds="model.experimental.Quantity"
 * @generated
 */
public interface IQuantifiedParameter<Q extends Quantity> extends IParameter {
        /**
         * Returns the value of the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' attribute.
         * @see #setValue(Amount)
         * @see model.experimental.ExperimentalPackage#getIQuantifiedParameter_Value()
         * @model dataType="model.experimental.Amount&lt;Q&gt;"
         * @generated
         */
        Amount<Q> getValue();

        /**
         * Sets the value of the '{@link model.experimental.IQuantifiedParameter#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' attribute.
         * @see #getValue()
         * @generated
         */
        void setValue(Amount<Q> value);

} // IQuantifiedParameter
