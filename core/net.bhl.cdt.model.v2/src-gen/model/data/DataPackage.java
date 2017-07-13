/**
 */
package model.data;

import model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see model.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "data";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/data";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "net.bhl.cdt.model";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        DataPackage eINSTANCE = model.data.impl.DataPackageImpl.init();

        /**
         * The meta object id for the '{@link model.data.IDimension <em>IDimension</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.IDimension
         * @see model.data.impl.DataPackageImpl#getIDimension()
         * @generated
         */
        int IDIMENSION = 0;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDIMENSION__ID = BasePackage.AIDENTIFIABLE_ITEM__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDIMENSION__NAME = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Units</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDIMENSION__UNITS = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>IDimension</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDIMENSION_FEATURE_COUNT = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>IDimension</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDIMENSION_OPERATION_COUNT = BasePackage.AIDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.IParameter <em>IParameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.IParameter
         * @see model.data.impl.DataPackageImpl#getIParameter()
         * @generated
         */
        int IPARAMETER = 1;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IPARAMETER__NAME = BasePackage.ANAMED_ITEM__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IPARAMETER__ID = BasePackage.ANAMED_ITEM_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>IParameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IPARAMETER_FEATURE_COUNT = BasePackage.ANAMED_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>IParameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IPARAMETER_OPERATION_COUNT = BasePackage.ANAMED_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.IDataEntity <em>IData Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.IDataEntity
         * @see model.data.impl.DataPackageImpl#getIDataEntity()
         * @generated
         */
        int IDATA_ENTITY = 2;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDATA_ENTITY__ID = BasePackage.AIDENTIFIABLE_ITEM__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDATA_ENTITY__NAME = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDATA_ENTITY__PARAMETERS = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>IData Entity</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDATA_ENTITY_FEATURE_COUNT = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>IData Entity</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDATA_ENTITY_OPERATION_COUNT = BasePackage.AIDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.impl.StringParameterImpl <em>String Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.impl.StringParameterImpl
         * @see model.data.impl.DataPackageImpl#getStringParameter()
         * @generated
         */
        int STRING_PARAMETER = 3;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PARAMETER__NAME = IPARAMETER__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PARAMETER__ID = IPARAMETER__ID;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PARAMETER__VALUE = IPARAMETER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>String Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PARAMETER_FEATURE_COUNT = IPARAMETER_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>String Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PARAMETER_OPERATION_COUNT = IPARAMETER_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.impl.DateParameterImpl <em>Date Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.impl.DateParameterImpl
         * @see model.data.impl.DataPackageImpl#getDateParameter()
         * @generated
         */
        int DATE_PARAMETER = 4;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_PARAMETER__NAME = IPARAMETER__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_PARAMETER__ID = IPARAMETER__ID;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_PARAMETER__VALUE = IPARAMETER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Date Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_PARAMETER_FEATURE_COUNT = IPARAMETER_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Date Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_PARAMETER_OPERATION_COUNT = IPARAMETER_OPERATION_COUNT + 0;


        /**
         * Returns the meta object for class '{@link model.data.IDimension <em>IDimension</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>IDimension</em>'.
         * @see model.data.IDimension
         * @generated
         */
        EClass getIDimension();

        /**
         * Returns the meta object for the containment reference list '{@link model.data.IDimension#getUnits <em>Units</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Units</em>'.
         * @see model.data.IDimension#getUnits()
         * @see #getIDimension()
         * @generated
         */
        EReference getIDimension_Units();

        /**
         * Returns the meta object for class '{@link model.data.IParameter <em>IParameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>IParameter</em>'.
         * @see model.data.IParameter
         * @generated
         */
        EClass getIParameter();

        /**
         * Returns the meta object for class '{@link model.data.IDataEntity <em>IData Entity</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>IData Entity</em>'.
         * @see model.data.IDataEntity
         * @generated
         */
        EClass getIDataEntity();

        /**
         * Returns the meta object for the containment reference list '{@link model.data.IDataEntity#getParameters <em>Parameters</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Parameters</em>'.
         * @see model.data.IDataEntity#getParameters()
         * @see #getIDataEntity()
         * @generated
         */
        EReference getIDataEntity_Parameters();

        /**
         * Returns the meta object for class '{@link model.data.StringParameter <em>String Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>String Parameter</em>'.
         * @see model.data.StringParameter
         * @generated
         */
        EClass getStringParameter();

        /**
         * Returns the meta object for the attribute '{@link model.data.StringParameter#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Value</em>'.
         * @see model.data.StringParameter#getValue()
         * @see #getStringParameter()
         * @generated
         */
        EAttribute getStringParameter_Value();

        /**
         * Returns the meta object for class '{@link model.data.DateParameter <em>Date Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Date Parameter</em>'.
         * @see model.data.DateParameter
         * @generated
         */
        EClass getDateParameter();

        /**
         * Returns the meta object for the attribute '{@link model.data.DateParameter#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Value</em>'.
         * @see model.data.DateParameter#getValue()
         * @see #getDateParameter()
         * @generated
         */
        EAttribute getDateParameter_Value();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        DataFactory getDataFactory();

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
                 * The meta object literal for the '{@link model.data.IDimension <em>IDimension</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.IDimension
                 * @see model.data.impl.DataPackageImpl#getIDimension()
                 * @generated
                 */
                EClass IDIMENSION = eINSTANCE.getIDimension();

                /**
                 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference IDIMENSION__UNITS = eINSTANCE.getIDimension_Units();

                /**
                 * The meta object literal for the '{@link model.data.IParameter <em>IParameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.IParameter
                 * @see model.data.impl.DataPackageImpl#getIParameter()
                 * @generated
                 */
                EClass IPARAMETER = eINSTANCE.getIParameter();

                /**
                 * The meta object literal for the '{@link model.data.IDataEntity <em>IData Entity</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.IDataEntity
                 * @see model.data.impl.DataPackageImpl#getIDataEntity()
                 * @generated
                 */
                EClass IDATA_ENTITY = eINSTANCE.getIDataEntity();

                /**
                 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference IDATA_ENTITY__PARAMETERS = eINSTANCE.getIDataEntity_Parameters();

                /**
                 * The meta object literal for the '{@link model.data.impl.StringParameterImpl <em>String Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.impl.StringParameterImpl
                 * @see model.data.impl.DataPackageImpl#getStringParameter()
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
                 * The meta object literal for the '{@link model.data.impl.DateParameterImpl <em>Date Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.impl.DateParameterImpl
                 * @see model.data.impl.DataPackageImpl#getDateParameter()
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

        }

} //DataPackage
