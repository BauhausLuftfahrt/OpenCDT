/**
 */
package net.bhl.cdt.model.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.datatypes.CompositeValues#getDatatypes <em>Datatypes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.datatypes.DatatypesPackage#getCompositeValues()
 * @model
 * @generated
 */
public interface CompositeValues extends DataType {
	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.datatypes.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see net.bhl.cdt.model.datatypes.DatatypesPackage#getCompositeValues_Datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDatatypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<?> getDimensions();

} // CompositeValues
