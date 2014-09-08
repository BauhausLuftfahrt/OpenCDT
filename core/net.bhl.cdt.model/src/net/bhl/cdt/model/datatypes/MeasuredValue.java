/**
 */
package net.bhl.cdt.model.datatypes;

import javax.measure.unit.Unit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.datatypes.MeasuredValue#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.datatypes.DatatypesPackage#getMeasuredValue()
 * @model
 * @generated
 */
public interface MeasuredValue extends FloatPointValue {
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
	 * @see net.bhl.cdt.model.datatypes.DatatypesPackage#getMeasuredValue_Unit()
	 * @model dataType="net.bhl.cdt.model.units.Unit<?>"
	 * @generated
	 */
	Unit<?> getUnit();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.datatypes.MeasuredValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit<?> value);

} // MeasuredValue
