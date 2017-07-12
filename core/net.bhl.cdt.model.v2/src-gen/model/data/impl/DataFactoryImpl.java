/**
 */
package model.data.impl;

import javax.measure.quantity.Length;
import javax.measure.quantity.Quantity;

import javax.measure.unit.Unit;

import model.data.*;

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
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static DataFactory init() {
                try {
                        DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory(DataPackage.eNS_URI);
                        if (theDataFactory != null) {
                                return theDataFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new DataFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DataFactoryImpl() {
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
                        case DataPackage.AUNIT: return createAUnit();
                        case DataPackage.STRING_PARAMETER: return createStringParameter();
                        case DataPackage.DATE_PARAMETER: return createDateParameter();
                        case DataPackage.IQUANTIFIED_PARAMETER: return createIQuantifiedParameter();
                        case DataPackage.LENGTH_PARAMENTER: return createLengthParamenter();
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
                        case DataPackage.LENGTH:
                                return createLengthFromString(eDataType, initialValue);
                        case DataPackage.DISTANCE:
                                return createDistanceFromString(eDataType, initialValue);
                        case DataPackage.AMOUNT:
                                return createAmountFromString(eDataType, initialValue);
                        case DataPackage.UNIT:
                                return createUnitFromString(eDataType, initialValue);
                        case DataPackage.QUANTITY:
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
                        case DataPackage.LENGTH:
                                return convertLengthToString(eDataType, instanceValue);
                        case DataPackage.DISTANCE:
                                return convertDistanceToString(eDataType, instanceValue);
                        case DataPackage.AMOUNT:
                                return convertAmountToString(eDataType, instanceValue);
                        case DataPackage.UNIT:
                                return convertUnitToString(eDataType, instanceValue);
                        case DataPackage.QUANTITY:
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
        public AUnit createAUnit() {
                AUnitImpl aUnit = new AUnitImpl();
                return aUnit;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StringParameter createStringParameter() {
                StringParameterImpl stringParameter = new StringParameterImpl();
                return stringParameter;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DateParameter createDateParameter() {
                DateParameterImpl dateParameter = new DateParameterImpl();
                return dateParameter;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public <Q extends Quantity> IQuantifiedParameter<Q> createIQuantifiedParameter() {
                IQuantifiedParameterImpl<Q> iQuantifiedParameter = new IQuantifiedParameterImpl<Q>();
                return iQuantifiedParameter;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public LengthParamenter createLengthParamenter() {
                LengthParamenterImpl lengthParamenter = new LengthParamenterImpl();
                return lengthParamenter;
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
        public DataPackage getDataPackage() {
                return (DataPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static DataPackage getPackage() {
                return DataPackage.eINSTANCE;
        }

} //DataFactoryImpl
