/**
 */
package model.data.impl;

import javax.measure.quantity.Length;

import model.data.DataPackage;
import model.data.LengthParamenter;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length Paramenter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LengthParamenterImpl extends IQuantifiedParameterImpl<Length> implements LengthParamenter {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected LengthParamenterImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DataPackage.Literals.LENGTH_PARAMENTER;
        }

} //LengthParamenterImpl
