/**
 */
package model.data;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.data.IDimension#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see model.data.DataPackage#getIDimension()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDimension extends AIdentifiableItem, ANamedItem {
        /**
         * Returns the value of the '<em><b>Units</b></em>' containment reference list.
         * The list contents are of type {@link model.data.AUnit}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Units</em>' containment reference list.
         * @see model.data.DataPackage#getIDimension_Units()
         * @model containment="true"
         * @generated
         */
        EList<AUnit> getUnits();

} // IDimension
