/**
 */
package model.data;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.data.QuantityKind#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see model.data.DataPackage#getQuantityKind()
 * @model abstract="true"
 * @generated
 */
public interface QuantityKind extends AIdentifiableItem, ANamedItem {
        /**
         * Returns the value of the '<em><b>Units</b></em>' containment reference list.
         * The list contents are of type {@link model.data.Unit}<code>&lt;?&gt;</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Units</em>' containment reference list.
         * @see model.data.DataPackage#getQuantityKind_Units()
         * @model containment="true"
         * @generated
         */
        EList<Unit<?>> getUnits();

} // QuantityKind
