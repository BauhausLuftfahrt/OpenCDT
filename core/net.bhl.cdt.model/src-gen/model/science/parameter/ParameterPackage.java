/**
 */
package model.science.parameter;

import model.science.SciencePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.science.parameter.ParameterFactory
 * @model kind="package"
 * @generated
 */
public interface ParameterPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "parameter";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/data/parameter";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "net.bhl.cdt.model.data";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        ParameterPackage eINSTANCE = model.science.parameter.impl.ParameterPackageImpl.init();

        /**
         * The meta object id for the '{@link model.science.parameter.impl.StringParameterImpl <em>String Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.science.parameter.impl.StringParameterImpl
         * @see model.science.parameter.impl.ParameterPackageImpl#getStringParameter()
         * @generated
         */
        int STRING_PARAMETER = 0;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PARAMETER__NAME = SciencePackage.IPARAMETER__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PARAMETER__ID = SciencePackage.IPARAMETER__ID;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PARAMETER__VALUE = SciencePackage.IPARAMETER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>String Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PARAMETER_FEATURE_COUNT = SciencePackage.IPARAMETER_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>String Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PARAMETER_OPERATION_COUNT = SciencePackage.IPARAMETER_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.science.parameter.impl.DateParameterImpl <em>Date Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.science.parameter.impl.DateParameterImpl
         * @see model.science.parameter.impl.ParameterPackageImpl#getDateParameter()
         * @generated
         */
        int DATE_PARAMETER = 1;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_PARAMETER__NAME = SciencePackage.IPARAMETER__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_PARAMETER__ID = SciencePackage.IPARAMETER__ID;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_PARAMETER__VALUE = SciencePackage.IPARAMETER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Date Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_PARAMETER_FEATURE_COUNT = SciencePackage.IPARAMETER_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Date Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_PARAMETER_OPERATION_COUNT = SciencePackage.IPARAMETER_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.science.parameter.impl.DistanceParameterImpl <em>Distance Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.science.parameter.impl.DistanceParameterImpl
         * @see model.science.parameter.impl.ParameterPackageImpl#getDistanceParameter()
         * @generated
         */
        int DISTANCE_PARAMETER = 2;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_PARAMETER__NAME = SciencePackage.IQUANTIFIED_PARAMETER__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_PARAMETER__ID = SciencePackage.IQUANTIFIED_PARAMETER__ID;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_PARAMETER__VALUE = SciencePackage.IQUANTIFIED_PARAMETER__VALUE;

        /**
         * The feature id for the '<em><b>Unit</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_PARAMETER__UNIT = SciencePackage.IQUANTIFIED_PARAMETER__UNIT;

        /**
         * The feature id for the '<em><b>Quantity</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_PARAMETER__QUANTITY = SciencePackage.IQUANTIFIED_PARAMETER__QUANTITY;

        /**
         * The number of structural features of the '<em>Distance Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_PARAMETER_FEATURE_COUNT = SciencePackage.IQUANTIFIED_PARAMETER_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Distance Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_PARAMETER_OPERATION_COUNT = SciencePackage.IQUANTIFIED_PARAMETER_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.science.parameter.impl.TimeParameterImpl <em>Time Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.science.parameter.impl.TimeParameterImpl
         * @see model.science.parameter.impl.ParameterPackageImpl#getTimeParameter()
         * @generated
         */
        int TIME_PARAMETER = 3;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_PARAMETER__NAME = SciencePackage.IQUANTIFIED_PARAMETER__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_PARAMETER__ID = SciencePackage.IQUANTIFIED_PARAMETER__ID;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_PARAMETER__VALUE = SciencePackage.IQUANTIFIED_PARAMETER__VALUE;

        /**
         * The feature id for the '<em><b>Unit</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_PARAMETER__UNIT = SciencePackage.IQUANTIFIED_PARAMETER__UNIT;

        /**
         * The feature id for the '<em><b>Quantity</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_PARAMETER__QUANTITY = SciencePackage.IQUANTIFIED_PARAMETER__QUANTITY;

        /**
         * The number of structural features of the '<em>Time Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_PARAMETER_FEATURE_COUNT = SciencePackage.IQUANTIFIED_PARAMETER_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Time Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_PARAMETER_OPERATION_COUNT = SciencePackage.IQUANTIFIED_PARAMETER_OPERATION_COUNT + 0;


        /**
         * Returns the meta object for class '{@link model.science.parameter.StringParameter <em>String Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>String Parameter</em>'.
         * @see model.science.parameter.StringParameter
         * @generated
         */
        EClass getStringParameter();

        /**
         * Returns the meta object for the attribute '{@link model.science.parameter.StringParameter#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Value</em>'.
         * @see model.science.parameter.StringParameter#getValue()
         * @see #getStringParameter()
         * @generated
         */
        EAttribute getStringParameter_Value();

        /**
         * Returns the meta object for class '{@link model.science.parameter.DateParameter <em>Date Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Date Parameter</em>'.
         * @see model.science.parameter.DateParameter
         * @generated
         */
        EClass getDateParameter();

        /**
         * Returns the meta object for the attribute '{@link model.science.parameter.DateParameter#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Value</em>'.
         * @see model.science.parameter.DateParameter#getValue()
         * @see #getDateParameter()
         * @generated
         */
        EAttribute getDateParameter_Value();

        /**
         * Returns the meta object for class '{@link model.science.parameter.DistanceParameter <em>Distance Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Distance Parameter</em>'.
         * @see model.science.parameter.DistanceParameter
         * @generated
         */
        EClass getDistanceParameter();

        /**
         * Returns the meta object for class '{@link model.science.parameter.TimeParameter <em>Time Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Time Parameter</em>'.
         * @see model.science.parameter.TimeParameter
         * @generated
         */
        EClass getTimeParameter();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        ParameterFactory getParameterFactory();

        /**
         * <!-- begin-user-doc -->
         * Defines literals for the meta objects that represent
         * <ul>
         *   <li>each class,</li>
         *   <li>each feature of each class,</li>
         *   <li>each operation of each class,</li>
         *   <li>each enum,</li>
         *   <li>and each data type</li>
         * </ul>
         * <!-- end-user-doc -->
         * @generated
         */
        interface Literals {
                /**
                 * The meta object literal for the '{@link model.science.parameter.impl.StringParameterImpl <em>String Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.science.parameter.impl.StringParameterImpl
                 * @see model.science.parameter.impl.ParameterPackageImpl#getStringParameter()
                 * @generated
                 */
                EClass STRING_PARAMETER = eINSTANCE.getStringParameter();

                /**
                 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STRING_PARAMETER__VALUE = eINSTANCE.getStringParameter_Value();

                /**
                 * The meta object literal for the '{@link model.science.parameter.impl.DateParameterImpl <em>Date Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.science.parameter.impl.DateParameterImpl
                 * @see model.science.parameter.impl.ParameterPackageImpl#getDateParameter()
                 * @generated
                 */
                EClass DATE_PARAMETER = eINSTANCE.getDateParameter();

                /**
                 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DATE_PARAMETER__VALUE = eINSTANCE.getDateParameter_Value();

                /**
                 * The meta object literal for the '{@link model.science.parameter.impl.DistanceParameterImpl <em>Distance Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.science.parameter.impl.DistanceParameterImpl
                 * @see model.science.parameter.impl.ParameterPackageImpl#getDistanceParameter()
                 * @generated
                 */
                EClass DISTANCE_PARAMETER = eINSTANCE.getDistanceParameter();

                /**
                 * The meta object literal for the '{@link model.science.parameter.impl.TimeParameterImpl <em>Time Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.science.parameter.impl.TimeParameterImpl
                 * @see model.science.parameter.impl.ParameterPackageImpl#getTimeParameter()
                 * @generated
                 */
                EClass TIME_PARAMETER = eINSTANCE.getTimeParameter();

        }

} //ParameterPackage
