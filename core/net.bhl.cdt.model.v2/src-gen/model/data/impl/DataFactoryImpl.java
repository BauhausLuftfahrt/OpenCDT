/**
 */
package model.data.impl;

import model.data.*;

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
                        case DataPackage.AVALUE: return createAValue();
                        case DataPackage.IDIMENSION_PARAMETER: return createIDimensionParameter();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public AValue createAValue() {
                AValueImpl aValue = new AValueImpl();
                return aValue;
        }

	/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public IDimensionParameter createIDimensionParameter() {
                IDimensionParameterImpl iDimensionParameter = new IDimensionParameterImpl();
                return iDimensionParameter;
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
