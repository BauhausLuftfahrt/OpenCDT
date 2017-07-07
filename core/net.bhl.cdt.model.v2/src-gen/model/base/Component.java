/**
 */
package model.base;

import model.data.IDataEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.base.Component#getContainingComponent <em>Containing Component</em>}</li>
 *   <li>{@link model.base.Component#getSubComponents <em>Sub Components</em>}</li>
 * </ul>
 *
 * @see model.base.BasePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends IDataEntity {
        /**
         * Returns the value of the '<em><b>Containing Component</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link model.base.Component#getSubComponents <em>Sub Components</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Containing Component</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Containing Component</em>' container reference.
         * @see #setContainingComponent(Component)
         * @see model.base.BasePackage#getComponent_ContainingComponent()
         * @see model.base.Component#getSubComponents
         * @model opposite="subComponents" transient="false"
         * @generated
         */
        Component getContainingComponent();

        /**
         * Sets the value of the '{@link model.base.Component#getContainingComponent <em>Containing Component</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Containing Component</em>' container reference.
         * @see #getContainingComponent()
         * @generated
         */
        void setContainingComponent(Component value);

        /**
         * Returns the value of the '<em><b>Sub Components</b></em>' containment reference list.
         * The list contents are of type {@link model.base.Component}.
         * It is bidirectional and its opposite is '{@link model.base.Component#getContainingComponent <em>Containing Component</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Sub Components</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Sub Components</em>' containment reference list.
         * @see model.base.BasePackage#getComponent_SubComponents()
         * @see model.base.Component#getContainingComponent
         * @model opposite="containingComponent" containment="true"
         * @generated
         */
        EList<Component> getSubComponents();

} // Component
