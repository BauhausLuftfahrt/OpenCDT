/**
 */
package model.data.parameter.impl;

import model.data.parameter.*;

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
public class ParameterFactoryImpl extends EFactoryImpl implements ParameterFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ParameterFactory init() {
                try {
                        ParameterFactory theParameterFactory = (ParameterFactory)EPackage.Registry.INSTANCE.getEFactory(ParameterPackage.eNS_URI);
                        if (theParameterFactory != null) {
                                return theParameterFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new ParameterFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParameterFactoryImpl() {
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
                        case ParameterPackage.STRING_PARAMETER: return createStringParameter();
                        case ParameterPackage.DATE_PARAMETER: return createDateParameter();
                        case ParameterPackage.DISTANCE_PARAMETER: return createDistanceParameter();
                        case ParameterPackage.TIME_PARAMETER: return createTimeParameter();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
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
        public DistanceParameter createDistanceParameter() {
                DistanceParameterImpl distanceParameter = new DistanceParameterImpl();
                return distanceParameter;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TimeParameter createTimeParameter() {
                TimeParameterImpl timeParameter = new TimeParameterImpl();
                return timeParameter;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParameterPackage getParameterPackage() {
                return (ParameterPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static ParameterPackage getPackage() {
                return ParameterPackage.eINSTANCE;
        }

} //ParameterFactoryImpl
