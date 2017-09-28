/**
 */
package model.base;

import model.data.IDataEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.base.System#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see model.base.BasePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends AModelContainerItem, IDataEntity {
        /**
         * Returns the value of the '<em><b>Components</b></em>' containment reference list.
         * The list contents are of type {@link model.base.Component}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Components</em>' containment reference list.
         * @see model.base.BasePackage#getSystem_Components()
         * @model containment="true"
         * @generated
         */
        EList<Component> getComponents();

} // System