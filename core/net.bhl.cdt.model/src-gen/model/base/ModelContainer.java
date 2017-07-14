/**
 */
package model.base;

import model.data.QuantitySet;
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
 *   <li>{@link model.base.ModelContainer#getQuantitySet <em>Quantity Set</em>}</li>
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

        /**
         * Returns the value of the '<em><b>Quantity Set</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Quantity Set</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Quantity Set</em>' reference.
         * @see #setQuantitySet(QuantitySet)
         * @see model.base.BasePackage#getModelContainer_QuantitySet()
         * @model
         * @generated
         */
        QuantitySet getQuantitySet();

        /**
         * Sets the value of the '{@link model.base.ModelContainer#getQuantitySet <em>Quantity Set</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Quantity Set</em>' reference.
         * @see #getQuantitySet()
         * @generated
         */
        void setQuantitySet(QuantitySet value);

} // ModelContainer
