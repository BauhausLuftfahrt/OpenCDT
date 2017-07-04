/**
 */
package model.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AModel Container Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.base.AModelContainerItem#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see model.base.BasePackage#getAModelContainerItem()
 * @model abstract="true"
 * @generated
 */
public interface AModelContainerItem extends AIdentifiableItem, ANamedItem {
        /**
         * Returns the value of the '<em><b>Container</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link model.base.ModelContainer#getContainedItems <em>Contained Items</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Container</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Container</em>' container reference.
         * @see #setContainer(ModelContainer)
         * @see model.base.BasePackage#getAModelContainerItem_Container()
         * @see model.base.ModelContainer#getContainedItems
         * @model opposite="containedItems" required="true" transient="false"
         * @generated
         */
        ModelContainer getContainer();

        /**
         * Sets the value of the '{@link model.base.AModelContainerItem#getContainer <em>Container</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Container</em>' container reference.
         * @see #getContainer()
         * @generated
         */
        void setContainer(ModelContainer value);

} // AModelContainerItem
