/**
 */
package net.bhl.cdt.model.system.quantities;

import javax.measure.quantity.Length;

import net.bhl.cdt.model.system.Value;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.system.quantities.LengthValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.model.system.quantities.QuantitiesPackage#getLengthValue()
 * @model
 * @generated
 */
public interface LengthValue extends Value {
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
	 * @see net.bhl.cdt.model.system.quantities.QuantitiesPackage#getLengthValue_Value()
	 * @model dataType="net.bhl.cdt.model.system.quantities.Amount<net.bhl.cdt.model.system.quantities.Length>"
	 * @generated
	 */
	Amount<Length> getValue();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.system.quantities.LengthValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Amount<Length> value);

} // LengthValue
