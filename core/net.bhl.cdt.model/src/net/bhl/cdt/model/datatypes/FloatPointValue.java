/**
 */
package net.bhl.cdt.model.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Point Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.datatypes.FloatPointValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.datatypes.DatatypesPackage#getFloatPointValue()
 * @model
 * @generated
 */
public interface FloatPointValue extends Scalar {
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
	 * @see net.bhl.cdt.model.datatypes.DatatypesPackage#getFloatPointValue_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.datatypes.FloatPointValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // FloatPointValue
