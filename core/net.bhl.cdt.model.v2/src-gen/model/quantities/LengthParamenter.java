/**
 */
package model.quantities;

import javax.measure.quantity.Length;
import javax.measure.unit.Unit;
import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Paramenter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.quantities.LengthParamenter#getValue <em>Value</em>}</li>
 *   <li>{@link model.quantities.LengthParamenter#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see model.quantities.QuantitiesPackage#getLengthParamenter()
 * @model
 * @generated
 */
public interface LengthParamenter extends INumberParameter {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Amount)
	 * @see model.quantities.QuantitiesPackage#getLengthParamenter_Value()
	 * @model dataType="model.quantities.Amount<model.quantities.Length>"
	 * @generated
	 */
	Amount<Length> getValue();

	/**
	 * Sets the value of the '{@link model.quantities.LengthParamenter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Amount<Length> value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(Unit)
	 * @see model.quantities.QuantitiesPackage#getLengthParamenter_Unit()
	 * @model dataType="model.quantities.Unit<model.quantities.Length>"
	 * @generated
	 */
	Unit<Length> getUnit();

	/**
	 * Sets the value of the '{@link model.quantities.LengthParamenter#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit<Length> value);
} // LengthParamenter
