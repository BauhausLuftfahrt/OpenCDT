/**
 */
package model.engineering;

import model.science.IDataEntity;

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
 *   <li>{@link model.engineering.Component#getContainingComponent <em>Containing Component</em>}</li>
 *   <li>{@link model.engineering.Component#getSubComponents <em>Sub Components</em>}</li>
 * </ul>
 *
 * @see model.engineering.EngineeringPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends IDataEntity {
        /**
         * Returns the value of the '<em><b>Containing Component</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link model.engineering.Component#getSubComponents <em>Sub Components</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Containing Component</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Containing Component</em>' container reference.
         * @see #setContainingComponent(Component)
         * @see model.engineering.EngineeringPackage#getComponent_ContainingComponent()
         * @see model.engineering.Component#getSubComponents
         * @model opposite="subComponents" transient="false"
         * @generated
         */
        Component getContainingComponent();

        /**
         * Sets the value of the '{@link model.engineering.Component#getContainingComponent <em>Containing Component</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Containing Component</em>' container reference.
         * @see #getContainingComponent()
         * @generated
         */
        void setContainingComponent(Component value);

        /**
         * Returns the value of the '<em><b>Sub Components</b></em>' containment reference list.
         * The list contents are of type {@link model.engineering.Component}.
         * It is bidirectional and its opposite is '{@link model.engineering.Component#getContainingComponent <em>Containing Component</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Sub Components</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Sub Components</em>' containment reference list.
         * @see model.engineering.EngineeringPackage#getComponent_SubComponents()
         * @see model.engineering.Component#getContainingComponent
         * @model opposite="containingComponent" containment="true"
         * @generated
         */
        EList<Component> getSubComponents();

} // Component
