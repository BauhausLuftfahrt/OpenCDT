/**
 */
package model.science;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IData Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.science.IDataEntity#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see model.science.SciencePackage#getIDataEntity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDataEntity extends AIdentifiableItem, ANamedItem {
        /**
         * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
         * The list contents are of type {@link model.science.IParameter}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Parameters</em>' containment reference list.
         * @see model.science.SciencePackage#getIDataEntity_Parameters()
         * @model containment="true"
         * @generated
         */
        EList<IParameter> getParameters();

} // IDataEntity
