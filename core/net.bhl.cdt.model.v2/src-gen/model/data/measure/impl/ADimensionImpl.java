/**
 */
package model.data.measure.impl;

import model.base.impl.ANamedItemImpl;

import model.data.measure.ADimension;
import model.data.measure.MeasurePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ADimensionImpl extends ANamedItemImpl implements ADimension {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ADimensionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MeasurePackage.Literals.ADIMENSION;
        }

} //ADimensionImpl
