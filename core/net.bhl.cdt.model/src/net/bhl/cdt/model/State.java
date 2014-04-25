/**
 */
package net.bhl.cdt.model;

import net.bhl.cdt.model.datatypes.DataType;
import net.bhl.cdt.model.datatypes.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.State#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.ModelPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.datatypes.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getState_Values()
	 * @model
	 * @generated
	 */
	EList<DataType> getValues();

} // State
