/**
 */
package model.data;

import model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
         * The meta object id for the '{@link model.data.impl.AUnitImpl <em>AUnit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.impl.AUnitImpl
         * @see model.data.impl.DataPackageImpl#getAUnit()
         * @generated
         */
        int AUNIT = 0;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AUNIT__NAME = BasePackage.ANAMED_ITEM__NAME;

        /**
         * The feature id for the '<em><b>Parameter</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AUNIT__PARAMETER = BasePackage.ANAMED_ITEM_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Symbol</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AUNIT__SYMBOL = BasePackage.ANAMED_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>AUnit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AUNIT_FEATURE_COUNT = BasePackage.ANAMED_ITEM_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>AUnit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AUNIT_OPERATION_COUNT = BasePackage.ANAMED_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.IDimension <em>IDimension</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.IDimension
         * @see model.data.impl.DataPackageImpl#getIDimension()
         * @generated
         */
        int IDIMENSION = 1;

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
        int IPARAMETER = 2;

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
         * The meta object id for the '{@link model.data.impl.StringParameterImpl <em>String Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.impl.StringParameterImpl
         * @see model.data.impl.DataPackageImpl#getStringParameter()
         * @generated
         */
        int STRING_PARAMETER = 4;

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
        int DATE_PARAMETER = 5;

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
         * The meta object id for the '{@link model.data.impl.IQuantifiedParameterImpl <em>IQuantified Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.impl.IQuantifiedParameterImpl
         * @see model.data.impl.DataPackageImpl#getIQuantifiedParameter()
         * @generated
         */
        int IQUANTIFIED_PARAMETER = 6;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER__VALUE = 0;

        /**
         * The number of structural features of the '<em>IQuantified Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER_FEATURE_COUNT = 1;

        /**
         * The number of operations of the '<em>IQuantified Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link model.data.impl.LengthParamenterImpl <em>Length Paramenter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.impl.LengthParamenterImpl
         * @see model.data.impl.DataPackageImpl#getLengthParamenter()
         * @generated
         */
        int LENGTH_PARAMENTER = 7;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH_PARAMENTER__VALUE = IQUANTIFIED_PARAMETER__VALUE;

        /**
         * The number of structural features of the '<em>Length Paramenter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH_PARAMENTER_FEATURE_COUNT = IQUANTIFIED_PARAMETER_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Length Paramenter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH_PARAMENTER_OPERATION_COUNT = IQUANTIFIED_PARAMETER_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '<em>Length</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.measure.quantity.Length
         * @see model.data.impl.DataPackageImpl#getLength()
         * @generated
         */
        int LENGTH = 8;

        /**
         * The meta object id for the '<em>Distance</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.measure.quantity.Length
         * @see model.data.impl.DataPackageImpl#getDistance()
         * @generated
         */
        int DISTANCE = 9;

        /**
         * The meta object id for the '<em>Amount</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jscience.physics.amount.Amount
         * @see model.data.impl.DataPackageImpl#getAmount()
         * @generated
         */
        int AMOUNT = 10;

        /**
         * The meta object id for the '<em>Unit</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.measure.unit.Unit
         * @see model.data.impl.DataPackageImpl#getUnit()
         * @generated
         */
        int UNIT = 11;

        /**
         * The meta object id for the '<em>Quantity</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.measure.quantity.Quantity
         * @see model.data.impl.DataPackageImpl#getQuantity()
         * @generated
         */
        int QUANTITY = 12;


        /**
         * Returns the meta object for class '{@link model.data.AUnit <em>AUnit</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>AUnit</em>'.
         * @see model.data.AUnit
         * @generated
         */
        EClass getAUnit();

        /**
         * Returns the meta object for the reference '{@link model.data.AUnit#getParameter <em>Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Parameter</em>'.
         * @see model.data.AUnit#getParameter()
         * @see #getAUnit()
         * @generated
         */
        EReference getAUnit_Parameter();

        /**
         * Returns the meta object for the attribute '{@link model.data.AUnit#getSymbol <em>Symbol</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Symbol</em>'.
         * @see model.data.AUnit#getSymbol()
         * @see #getAUnit()
         * @generated
         */
        EAttribute getAUnit_Symbol();

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
         * Returns the meta object for class '{@link model.data.LengthParamenter <em>Length Paramenter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Length Paramenter</em>'.
         * @see model.data.LengthParamenter
         * @generated
         */
        EClass getLengthParamenter();

        /**
         * Returns the meta object for data type '{@link javax.measure.quantity.Length <em>Length</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Length</em>'.
         * @see javax.measure.quantity.Length
         * @model instanceClass="javax.measure.quantity.Length"
         * @generated
         */
        EDataType getLength();

        /**
         * Returns the meta object for data type '{@link javax.measure.quantity.Length <em>Distance</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Distance</em>'.
         * @see javax.measure.quantity.Length
         * @model instanceClass="javax.measure.quantity.Length"
         * @generated
         */
        EDataType getDistance();

        /**
         * Returns the meta object for data type '{@link org.jscience.physics.amount.Amount <em>Amount</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Amount</em>'.
         * @see org.jscience.physics.amount.Amount
         * @model instanceClass="org.jscience.physics.amount.Amount" typeParameters="Q" QBounds="model.data.Quantity"
         * @generated
         */
        EDataType getAmount();

        /**
         * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>Unit</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Unit</em>'.
         * @see javax.measure.unit.Unit
         * @model instanceClass="javax.measure.unit.Unit" typeParameters="Q" QBounds="model.data.Quantity"
         * @generated
         */
        EDataType getUnit();

        /**
         * Returns the meta object for data type '{@link javax.measure.quantity.Quantity <em>Quantity</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Quantity</em>'.
         * @see javax.measure.quantity.Quantity
         * @model instanceClass="javax.measure.quantity.Quantity"
         * @generated
         */
        EDataType getQuantity();

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
                 * The meta object literal for the '{@link model.data.impl.AUnitImpl <em>AUnit</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.impl.AUnitImpl
                 * @see model.data.impl.DataPackageImpl#getAUnit()
                 * @generated
                 */
                EClass AUNIT = eINSTANCE.getAUnit();

                /**
                 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference AUNIT__PARAMETER = eINSTANCE.getAUnit_Parameter();

                /**
                 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AUNIT__SYMBOL = eINSTANCE.getAUnit_Symbol();

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

                /**
                 * The meta object literal for the '{@link model.data.impl.IQuantifiedParameterImpl <em>IQuantified Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.impl.IQuantifiedParameterImpl
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
                 * The meta object literal for the '{@link model.data.impl.LengthParamenterImpl <em>Length Paramenter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.impl.LengthParamenterImpl
                 * @see model.data.impl.DataPackageImpl#getLengthParamenter()
                 * @generated
                 */
                EClass LENGTH_PARAMENTER = eINSTANCE.getLengthParamenter();

                /**
                 * The meta object literal for the '<em>Length</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.measure.quantity.Length
                 * @see model.data.impl.DataPackageImpl#getLength()
                 * @generated
                 */
                EDataType LENGTH = eINSTANCE.getLength();

                /**
                 * The meta object literal for the '<em>Distance</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.measure.quantity.Length
                 * @see model.data.impl.DataPackageImpl#getDistance()
                 * @generated
                 */
                EDataType DISTANCE = eINSTANCE.getDistance();

                /**
                 * The meta object literal for the '<em>Amount</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.jscience.physics.amount.Amount
                 * @see model.data.impl.DataPackageImpl#getAmount()
                 * @generated
                 */
                EDataType AMOUNT = eINSTANCE.getAmount();

                /**
                 * The meta object literal for the '<em>Unit</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.measure.unit.Unit
                 * @see model.data.impl.DataPackageImpl#getUnit()
                 * @generated
                 */
                EDataType UNIT = eINSTANCE.getUnit();

                /**
                 * The meta object literal for the '<em>Quantity</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.measure.quantity.Quantity
                 * @see model.data.impl.DataPackageImpl#getQuantity()
                 * @generated
                 */
                EDataType QUANTITY = eINSTANCE.getQuantity();

        }

} //DataPackage
