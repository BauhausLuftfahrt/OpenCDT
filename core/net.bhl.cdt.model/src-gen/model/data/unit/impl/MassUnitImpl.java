/**
 */
package model.data.unit.impl;

import model.data.impl.UnitImpl;

import model.data.quantities.Mass;

import model.data.unit.MassUnit;
import model.data.unit.UnitPackage;

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
