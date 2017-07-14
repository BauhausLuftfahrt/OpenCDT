/**
 */
package model.data.unit.impl;

import model.data.impl.UnitImpl;

import model.data.quantities.Distance;

import model.data.unit.DistanceUnit;
import model.data.unit.UnitPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DistanceUnitImpl extends UnitImpl<Distance> implements DistanceUnit {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DistanceUnitImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return UnitPackage.Literals.DISTANCE_UNIT;
        }

} //DistanceUnitImpl
