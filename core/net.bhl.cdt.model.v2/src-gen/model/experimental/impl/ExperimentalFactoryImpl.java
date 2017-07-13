/**
 */
package model.experimental.impl;

import javax.measure.quantity.Length;
import javax.measure.quantity.Mass;
import javax.measure.quantity.Quantity;

import javax.measure.unit.Unit;

import model.experimental.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentalFactoryImpl extends EFactoryImpl implements ExperimentalFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ExperimentalFactory init() {
                try {
                        ExperimentalFactory theExperimentalFactory = (ExperimentalFactory)EPackage.Registry.INSTANCE.getEFactory(ExperimentalPackage.eNS_URI);
                        if (theExperimentalFactory != null) {
                                return theExperimentalFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new ExperimentalFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ExperimentalFactoryImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EObject create(EClass eClass) {
                switch (eClass.getClassifierID()) {
                        case ExperimentalPackage.LENGTH_PARAMETER: return createLengthParameter();
                        case ExperimentalPackage.MASS_PARAMETER: return createMassParameter();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object createFromString(EDataType eDataType, String initialValue) {
                switch (eDataType.getClassifierID()) {
                        case ExperimentalPackage.LENGTH:
                                return createLengthFromString(eDataType, initialValue);
                        case ExperimentalPackage.MASS:
                                return createMassFromString(eDataType, initialValue);
                        case ExperimentalPackage.DISTANCE:
                                return createDistanceFromString(eDataType, initialValue);
                        case ExperimentalPackage.AMOUNT:
                                return createAmountFromString(eDataType, initialValue);
                        case ExperimentalPackage.UNIT:
                                return createUnitFromString(eDataType, initialValue);
                        case ExperimentalPackage.QUANTITY:
                                return createQuantityFromString(eDataType, initialValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String convertToString(EDataType eDataType, Object instanceValue) {
                switch (eDataType.getClassifierID()) {
                        case ExperimentalPackage.LENGTH:
                                return convertLengthToString(eDataType, instanceValue);
                        case ExperimentalPackage.MASS:
                                return convertMassToString(eDataType, instanceValue);
                        case ExperimentalPackage.DISTANCE:
                                return convertDistanceToString(eDataType, instanceValue);
                        case ExperimentalPackage.AMOUNT:
                                return convertAmountToString(eDataType, instanceValue);
                        case ExperimentalPackage.UNIT:
                                return convertUnitToString(eDataType, instanceValue);
                        case ExperimentalPackage.QUANTITY:
                                return convertQuantityToString(eDataType, instanceValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public LengthParameter createLengthParameter() {
                LengthParameterImpl lengthParameter = new LengthParameterImpl();
                return lengthParameter;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MassParameter createMassParameter() {
                MassParameterImpl massParameter = new MassParameterImpl();
                return massParameter;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Length createLengthFromString(EDataType eDataType, String initialValue) {
                return (Length)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertLengthToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Mass createMassFromString(EDataType eDataType, String initialValue) {
                return (Mass)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertMassToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Length createDistanceFromString(EDataType eDataType, String initialValue) {
                return (Length)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertDistanceToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Amount<?> createAmountFromString(EDataType eDataType, String initialValue) {
                return (Amount<?>)super.createFromString(initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertAmountToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Unit<?> createUnitFromString(EDataType eDataType, String initialValue) {
                return (Unit<?>)super.createFromString(initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertUnitToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Quantity createQuantityFromString(EDataType eDataType, String initialValue) {
                return (Quantity)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertQuantityToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ExperimentalPackage getExperimentalPackage() {
                return (ExperimentalPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static ExperimentalPackage getPackage() {
                return ExperimentalPackage.eINSTANCE;
        }

} //ExperimentalFactoryImpl
