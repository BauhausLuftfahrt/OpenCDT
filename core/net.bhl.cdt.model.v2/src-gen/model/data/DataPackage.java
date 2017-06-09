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
	 * The meta object id for the '{@link model.data.impl.AValueImpl <em>AValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.data.impl.AValueImpl
	 * @see model.data.impl.DataPackageImpl#getAValue()
	 * @generated
	 */
	int AVALUE = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVALUE__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>AValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>AValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVALUE_OPERATION_COUNT = 0;

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
	 * Returns the meta object for class '{@link model.data.AValue <em>AValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AValue</em>'.
	 * @see model.data.AValue
	 * @generated
	 */
	EClass getAValue();

	/**
	 * Returns the meta object for the reference '{@link model.data.AValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see model.data.AValue#getParameter()
	 * @see #getAValue()
	 * @generated
	 */
	EReference getAValue_Parameter();

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
		 * The meta object literal for the '{@link model.data.impl.AValueImpl <em>AValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.data.impl.AValueImpl
		 * @see model.data.impl.DataPackageImpl#getAValue()
		 * @generated
		 */
		EClass AVALUE = eINSTANCE.getAValue();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVALUE__PARAMETER = eINSTANCE.getAValue_Parameter();

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

	}

} //DataPackage
