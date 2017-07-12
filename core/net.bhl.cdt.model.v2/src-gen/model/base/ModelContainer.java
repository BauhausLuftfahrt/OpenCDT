/**
 */
package model.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.base.ModelContainer#getContainedItems <em>Contained Items</em>}</li>
 * </ul>
 *
 * @see model.base.BasePackage#getModelContainer()
 * @model
 * @generated
 */
public interface ModelContainer extends ANamedItem, AIdentifiableItem {
        /**
         * Returns the value of the '<em><b>Contained Items</b></em>' containment reference list.
         * The list contents are of type {@link model.base.AModelContainerItem}.
         * It is bidirectional and its opposite is '{@link model.base.AModelContainerItem#getContainer <em>Container</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Contained Items</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Contained Items</em>' containment reference list.
         * @see model.base.BasePackage#getModelContainer_ContainedItems()
         * @see model.base.AModelContainerItem#getContainer
         * @model opposite="container" containment="true"
         * @generated
         */
        EList<AModelContainerItem> getContainedItems();

} // ModelContainer
