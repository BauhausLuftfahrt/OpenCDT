/**
 */
package model.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDimension Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.data.IDimensionParameter#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see model.data.DataPackage#getIDimensionParameter()
 * @model
 * @generated
 */
public interface IDimensionParameter extends IParameter {
        /**
         * Returns the value of the '<em><b>Dimension</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Dimension</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Dimension</em>' reference.
         * @see #setDimension(IDimension)
         * @see model.data.DataPackage#getIDimensionParameter_Dimension()
         * @model required="true"
         * @generated
         */
        IDimension getDimension();

        /**
         * Sets the value of the '{@link model.data.IDimensionParameter#getDimension <em>Dimension</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Dimension</em>' reference.
         * @see #getDimension()
         * @generated
         */
        void setDimension(IDimension value);

} // IDimensionParameter
