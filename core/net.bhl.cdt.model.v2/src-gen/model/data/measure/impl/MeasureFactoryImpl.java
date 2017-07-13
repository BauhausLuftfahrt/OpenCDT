/**
 */
package model.data.measure.impl;

import model.data.measure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureFactoryImpl extends EFactoryImpl implements MeasureFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static MeasureFactory init() {
                try {
                        MeasureFactory theMeasureFactory = (MeasureFactory)EPackage.Registry.INSTANCE.getEFactory(MeasurePackage.eNS_URI);
                        if (theMeasureFactory != null) {
                                return theMeasureFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new MeasureFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureFactoryImpl() {
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
                        case MeasurePackage.LENGTH: return createLength();
                        case MeasurePackage.METER: return createMeter();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Length createLength() {
                LengthImpl length = new LengthImpl();
                return length;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Meter createMeter() {
                MeterImpl meter = new MeterImpl();
                return meter;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasurePackage getMeasurePackage() {
                return (MeasurePackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static MeasurePackage getPackage() {
                return MeasurePackage.eINSTANCE;
        }

} //MeasureFactoryImpl
