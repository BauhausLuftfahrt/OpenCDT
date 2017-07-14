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
         * The meta object id for the '{@link model.data.impl.QuantitySetImpl <em>Quantity Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.impl.QuantitySetImpl
         * @see model.data.impl.DataPackageImpl#getQuantitySet()
         * @generated
         */
        int QUANTITY_SET = 0;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int QUANTITY_SET__ID = BasePackage.AIDENTIFIABLE_ITEM__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int QUANTITY_SET__NAME = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Quantity Kinds</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int QUANTITY_SET__QUANTITY_KINDS = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Quantity Set</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int QUANTITY_SET_FEATURE_COUNT = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>Quantity Set</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int QUANTITY_SET_OPERATION_COUNT = BasePackage.AIDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.impl.QuantityKindImpl <em>Quantity Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.impl.QuantityKindImpl
         * @see model.data.impl.DataPackageImpl#getQuantityKind()
         * @generated
         */
        int QUANTITY_KIND = 1;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int QUANTITY_KIND__ID = BasePackage.AIDENTIFIABLE_ITEM__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int QUANTITY_KIND__NAME = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Units</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int QUANTITY_KIND__UNITS = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Quantity Kind</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int QUANTITY_KIND_FEATURE_COUNT = BasePackage.AIDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>Quantity Kind</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int QUANTITY_KIND_OPERATION_COUNT = BasePackage.AIDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.impl.UnitImpl <em>Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.impl.UnitImpl
         * @see model.data.impl.DataPackageImpl#getUnit()
         * @generated
         */
        int UNIT = 2;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNIT__NAME = BasePackage.ANAMED_ITEM__NAME;

        /**
         * The feature id for the '<em><b>Symbol</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNIT__SYMBOL = BasePackage.ANAMED_ITEM_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Unit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNIT_FEATURE_COUNT = BasePackage.ANAMED_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Unit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNIT_OPERATION_COUNT = BasePackage.ANAMED_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.IDataEntity <em>IData Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.IDataEntity
         * @see model.data.impl.DataPackageImpl#getIDataEntity()
         * @generated
         */
        int IDATA_ENTITY = 3;

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
         * The meta object id for the '{@link model.data.IParameter <em>IParameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.IParameter
         * @see model.data.impl.DataPackageImpl#getIParameter()
         * @generated
         */
        int IPARAMETER = 4;

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
         * The meta object id for the '{@link model.data.IQuantifiedParameter <em>IQuantified Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.IQuantifiedParameter
         * @see model.data.impl.DataPackageImpl#getIQuantifiedParameter()
         * @generated
         */
        int IQUANTIFIED_PARAMETER = 5;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER__NAME = IPARAMETER__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER__ID = IPARAMETER__ID;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER__VALUE = IPARAMETER_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Unit</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER__UNIT = IPARAMETER_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Quantity</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER__QUANTITY = IPARAMETER_FEATURE_COUNT + 2;

        /**
         * The number of structural features of the '<em>IQuantified Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER_FEATURE_COUNT = IPARAMETER_FEATURE_COUNT + 3;

        /**
         * The number of operations of the '<em>IQuantified Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER_OPERATION_COUNT = IPARAMETER_OPERATION_COUNT + 0;


        /**
         * Returns the meta object for class '{@link model.data.QuantitySet <em>Quantity Set</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Quantity Set</em>'.
         * @see model.data.QuantitySet
         * @generated
         */
        EClass getQuantitySet();

        /**
         * Returns the meta object for the containment reference list '{@link model.data.QuantitySet#getQuantityKinds <em>Quantity Kinds</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Quantity Kinds</em>'.
         * @see model.data.QuantitySet#getQuantityKinds()
         * @see #getQuantitySet()
         * @generated
         */
        EReference getQuantitySet_QuantityKinds();

        /**
         * Returns the meta object for class '{@link model.data.QuantityKind <em>Quantity Kind</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Quantity Kind</em>'.
         * @see model.data.QuantityKind
         * @generated
         */
        EClass getQuantityKind();

        /**
         * Returns the meta object for the containment reference list '{@link model.data.QuantityKind#getUnits <em>Units</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Units</em>'.
         * @see model.data.QuantityKind#getUnits()
         * @see #getQuantityKind()
         * @generated
         */
        EReference getQuantityKind_Units();

        /**
         * Returns the meta object for class '{@link model.data.Unit <em>Unit</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Unit</em>'.
         * @see model.data.Unit
         * @generated
         */
        EClass getUnit();

        /**
         * Returns the meta object for the attribute '{@link model.data.Unit#getSymbol <em>Symbol</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Symbol</em>'.
         * @see model.data.Unit#getSymbol()
         * @see #getUnit()
         * @generated
         */
        EAttribute getUnit_Symbol();

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
         * Returns the meta object for class '{@link model.data.IParameter <em>IParameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>IParameter</em>'.
         * @see model.data.IParameter
         * @generated
         */
        EClass getIParameter();

        /**
         * Returns the meta object for class '{@link model.data.IQuantifiedParameter <em>IQuantified Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>IQuantified Parameter</em>'.
         * @see model.data.IQuantifiedParameter
         * @generated
         */
        EClass getIQuantifiedParameter();

        /**
         * Returns the meta object for the attribute '{@link model.data.IQuantifiedParameter#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Value</em>'.
         * @see model.data.IQuantifiedParameter#getValue()
         * @see #getIQuantifiedParameter()
         * @generated
         */
        EAttribute getIQuantifiedParameter_Value();

        /**
         * Returns the meta object for the reference '{@link model.data.IQuantifiedParameter#getUnit <em>Unit</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Unit</em>'.
         * @see model.data.IQuantifiedParameter#getUnit()
         * @see #getIQuantifiedParameter()
         * @generated
         */
        EReference getIQuantifiedParameter_Unit();

        /**
         * Returns the meta object for the reference '{@link model.data.IQuantifiedParameter#getQuantity <em>Quantity</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Quantity</em>'.
         * @see model.data.IQuantifiedParameter#getQuantity()
         * @see #getIQuantifiedParameter()
         * @generated
         */
        EReference getIQuantifiedParameter_Quantity();

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
                 * The meta object literal for the '{@link model.data.impl.QuantitySetImpl <em>Quantity Set</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.impl.QuantitySetImpl
                 * @see model.data.impl.DataPackageImpl#getQuantitySet()
                 * @generated
                 */
                EClass QUANTITY_SET = eINSTANCE.getQuantitySet();

                /**
                 * The meta object literal for the '<em><b>Quantity Kinds</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference QUANTITY_SET__QUANTITY_KINDS = eINSTANCE.getQuantitySet_QuantityKinds();

                /**
                 * The meta object literal for the '{@link model.data.impl.QuantityKindImpl <em>Quantity Kind</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.impl.QuantityKindImpl
                 * @see model.data.impl.DataPackageImpl#getQuantityKind()
                 * @generated
                 */
                EClass QUANTITY_KIND = eINSTANCE.getQuantityKind();

                /**
                 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference QUANTITY_KIND__UNITS = eINSTANCE.getQuantityKind_Units();

                /**
                 * The meta object literal for the '{@link model.data.impl.UnitImpl <em>Unit</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.impl.UnitImpl
                 * @see model.data.impl.DataPackageImpl#getUnit()
                 * @generated
                 */
                EClass UNIT = eINSTANCE.getUnit();

                /**
                 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute UNIT__SYMBOL = eINSTANCE.getUnit_Symbol();

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
                 * The meta object literal for the '{@link model.data.IParameter <em>IParameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.IParameter
                 * @see model.data.impl.DataPackageImpl#getIParameter()
                 * @generated
                 */
                EClass IPARAMETER = eINSTANCE.getIParameter();

                /**
                 * The meta object literal for the '{@link model.data.IQuantifiedParameter <em>IQuantified Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.IQuantifiedParameter
                 * @see model.data.impl.DataPackageImpl#getIQuantifiedParameter()
                 * @generated
                 */
                EClass IQUANTIFIED_PARAMETER = eINSTANCE.getIQuantifiedParameter();

                /**
                 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute IQUANTIFIED_PARAMETER__VALUE = eINSTANCE.getIQuantifiedParameter_Value();

                /**
                 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference IQUANTIFIED_PARAMETER__UNIT = eINSTANCE.getIQuantifiedParameter_Unit();

                /**
                 * The meta object literal for the '<em><b>Quantity</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference IQUANTIFIED_PARAMETER__QUANTITY = eINSTANCE.getIQuantifiedParameter_Quantity();

        }

} //DataPackage
