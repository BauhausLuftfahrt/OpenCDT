/**
 */
package model.base;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technical System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.base.TechnicalSystem#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see model.base.BasePackage#getTechnicalSystem()
 * @model
 * @generated
 */
public interface TechnicalSystem extends AModelContainerItem {

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
         * @see model.base.BasePackage#getTechnicalSystem_Components()
         * @model containment="true"
         * @generated
         */
        EList<Component> getComponents();
} // TechnicalSystem
