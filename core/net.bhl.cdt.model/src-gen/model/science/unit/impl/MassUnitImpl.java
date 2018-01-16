/**
 */
package model.science.unit.impl;

import model.science.impl.UnitImpl;

import model.science.quantities.Mass;

import model.science.unit.MassUnit;
import model.science.unit.UnitPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mass Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MassUnitImpl extends UnitImpl<Mass> implements MassUnit {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MassUnitImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return UnitPackage.Literals.MASS_UNIT;
        }

} //MassUnitImpl
