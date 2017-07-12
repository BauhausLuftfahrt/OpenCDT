/**
 */
package model.data;

import javax.measure.quantity.Quantity;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link model.data.IQuantifiedParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see model.data.DataPackage#getIQuantifiedParameter()
 * @model QBounds="model.data.Quantity"
 * @generated
 */
public interface IQuantifiedParameter<Q extends Quantity> extends EObject {
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
         * @see model.data.DataPackage#getIQuantifiedParameter_Value()
         * @model dataType="model.data.Amount&lt;Q&gt;"
         * @generated
         */
        Amount<Q> getValue();

        /**
         * Sets the value of the '{@link model.data.IQuantifiedParameter#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' attribute.
         * @see #getValue()
         * @generated
         */
        void setValue(Amount<Q> value);

} // IQuantifiedParameter
