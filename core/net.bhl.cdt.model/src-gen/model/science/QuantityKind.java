/**
 */
package model.science;

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
 *   <li>{@link model.science.QuantityKind#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see model.science.SciencePackage#getQuantityKind()
 * @model abstract="true"
 * @generated
 */
public interface QuantityKind extends AIdentifiableItem, ANamedItem {
        /**
         * Returns the value of the '<em><b>Units</b></em>' containment reference list.
         * The list contents are of type {@link model.science.Unit}<code>&lt;?&gt;</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Units</em>' containment reference list.
         * @see model.science.SciencePackage#getQuantityKind_Units()
         * @model containment="true"
         * @generated
         */
        EList<Unit<?>> getUnits();

} // QuantityKind
