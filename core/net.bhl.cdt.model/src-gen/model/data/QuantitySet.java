/**
 */
package model.data;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.data.QuantitySet#getQuantityKinds <em>Quantity Kinds</em>}</li>
 * </ul>
 *
 * @see model.data.DataPackage#getQuantitySet()
 * @model
 * @generated
 */
public interface QuantitySet extends AIdentifiableItem, ANamedItem {
        /**
         * Returns the value of the '<em><b>Quantity Kinds</b></em>' containment reference list.
         * The list contents are of type {@link model.data.QuantityKind}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Quantity Kinds</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Quantity Kinds</em>' containment reference list.
         * @see model.data.DataPackage#getQuantitySet_QuantityKinds()
         * @model containment="true"
         * @generated
         */
        EList<QuantityKind> getQuantityKinds();

} // QuantitySet
