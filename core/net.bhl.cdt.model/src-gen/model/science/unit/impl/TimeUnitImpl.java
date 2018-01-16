/**
 */
package model.science.unit.impl;

import model.science.impl.UnitImpl;

import model.science.quantities.Time;

import model.science.unit.TimeUnit;
import model.science.unit.UnitPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TimeUnitImpl extends UnitImpl<Time> implements TimeUnit {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TimeUnitImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return UnitPackage.Literals.TIME_UNIT;
        }

} //TimeUnitImpl
