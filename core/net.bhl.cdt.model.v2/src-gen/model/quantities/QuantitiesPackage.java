/**
 */
package model.quantities;

import model.data.DataPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see model.quantities.QuantitiesFactory
 * @model kind="package"
 * @generated
 */
public interface QuantitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "quantities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/quantities";

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
	QuantitiesPackage eINSTANCE = model.quantities.impl.QuantitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.quantities.impl.StringParameterImpl <em>String Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.quantities.impl.StringParameterImpl
	 * @see model.quantities.impl.QuantitiesPackageImpl#getStringParameter()
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
	int STRING_PARAMETER__NAME = DataPackage.IPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER__ID = DataPackage.IPARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER__VALUE = DataPackage.IPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_FEATURE_COUNT = DataPackage.IPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAMETER_OPERATION_COUNT = DataPackage.IPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.quantities.INumberParameter <em>INumber Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.quantities.INumberParameter
	 * @see model.quantities.impl.QuantitiesPackageImpl#getINumberParameter()
	 * @generated
	 */
	int INUMBER_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INUMBER_PARAMETER__NAME = DataPackage.IPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INUMBER_PARAMETER__ID = DataPackage.IPARAMETER__ID;

	/**
	 * The number of structural features of the '<em>INumber Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INUMBER_PARAMETER_FEATURE_COUNT = DataPackage.IPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>INumber Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INUMBER_PARAMETER_OPERATION_COUNT = DataPackage.IPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.quantities.impl.LengthParamenterImpl <em>Length Paramenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.quantities.impl.LengthParamenterImpl
	 * @see model.quantities.impl.QuantitiesPackageImpl#getLengthParamenter()
	 * @generated
	 */
	int LENGTH_PARAMENTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PARAMENTER__NAME = INUMBER_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PARAMENTER__ID = INUMBER_PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PARAMENTER__VALUE = INUMBER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PARAMENTER__UNIT = INUMBER_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Paramenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PARAMENTER_FEATURE_COUNT = INUMBER_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Length Paramenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PARAMENTER_OPERATION_COUNT = INUMBER_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Length
	 * @see model.quantities.impl.QuantitiesPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 3;

	/**
	 * The meta object id for the '<em>Distance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Length
	 * @see model.quantities.impl.QuantitiesPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 4;

	/**
	 * The meta object id for the '<em>Amount</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jscience.physics.amount.Amount
	 * @see model.quantities.impl.QuantitiesPackageImpl#getAmount()
	 * @generated
	 */
	int AMOUNT = 5;

	/**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.unit.Unit
	 * @see model.quantities.impl.QuantitiesPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 6;

	/**
	 * The meta object id for the '<em>Quantity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Quantity
	 * @see model.quantities.impl.QuantitiesPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 7;


	/**
	 * Returns the meta object for class '{@link model.quantities.StringParameter <em>String Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Parameter</em>'.
	 * @see model.quantities.StringParameter
	 * @generated
	 */
	EClass getStringParameter();

	/**
	 * Returns the meta object for the attribute '{@link model.quantities.StringParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.quantities.StringParameter#getValue()
	 * @see #getStringParameter()
	 * @generated
	 */
	EAttribute getStringParameter_Value();

	/**
	 * Returns the meta object for class '{@link model.quantities.INumberParameter <em>INumber Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INumber Parameter</em>'.
	 * @see model.quantities.INumberParameter
	 * @generated
	 */
	EClass getINumberParameter();

	/**
	 * Returns the meta object for class '{@link model.quantities.LengthParamenter <em>Length Paramenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Paramenter</em>'.
	 * @see model.quantities.LengthParamenter
	 * @generated
	 */
	EClass getLengthParamenter();

	/**
	 * Returns the meta object for the attribute '{@link model.quantities.LengthParamenter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.quantities.LengthParamenter#getValue()
	 * @see #getLengthParamenter()
	 * @generated
	 */
	EAttribute getLengthParamenter_Value();

	/**
	 * Returns the meta object for the attribute '{@link model.quantities.LengthParamenter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see model.quantities.LengthParamenter#getUnit()
	 * @see #getLengthParamenter()
	 * @generated
	 */
	EAttribute getLengthParamenter_Unit();

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
	 * @model instanceClass="org.jscience.physics.amount.Amount" typeParameters="Q" QBounds="model.quantities.Quantity"
	 * @generated
	 */
	EDataType getAmount();

	/**
	 * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see javax.measure.unit.Unit
	 * @model instanceClass="javax.measure.unit.Unit" typeParameters="Q" QBounds="model.quantities.Quantity"
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
	QuantitiesFactory getQuantitiesFactory();

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
		 * The meta object literal for the '{@link model.quantities.impl.StringParameterImpl <em>String Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.quantities.impl.StringParameterImpl
		 * @see model.quantities.impl.QuantitiesPackageImpl#getStringParameter()
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
		 * The meta object literal for the '{@link model.quantities.INumberParameter <em>INumber Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.quantities.INumberParameter
		 * @see model.quantities.impl.QuantitiesPackageImpl#getINumberParameter()
		 * @generated
		 */
		EClass INUMBER_PARAMETER = eINSTANCE.getINumberParameter();

		/**
		 * The meta object literal for the '{@link model.quantities.impl.LengthParamenterImpl <em>Length Paramenter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.quantities.impl.LengthParamenterImpl
		 * @see model.quantities.impl.QuantitiesPackageImpl#getLengthParamenter()
		 * @generated
		 */
		EClass LENGTH_PARAMENTER = eINSTANCE.getLengthParamenter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH_PARAMENTER__VALUE = eINSTANCE.getLengthParamenter_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH_PARAMENTER__UNIT = eINSTANCE.getLengthParamenter_Unit();

		/**
		 * The meta object literal for the '<em>Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Length
		 * @see model.quantities.impl.QuantitiesPackageImpl#getLength()
		 * @generated
		 */
		EDataType LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em>Distance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Length
		 * @see model.quantities.impl.QuantitiesPackageImpl#getDistance()
		 * @generated
		 */
		EDataType DISTANCE = eINSTANCE.getDistance();

		/**
		 * The meta object literal for the '<em>Amount</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jscience.physics.amount.Amount
		 * @see model.quantities.impl.QuantitiesPackageImpl#getAmount()
		 * @generated
		 */
		EDataType AMOUNT = eINSTANCE.getAmount();

		/**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.unit.Unit
		 * @see model.quantities.impl.QuantitiesPackageImpl#getUnit()
		 * @generated
		 */
		EDataType UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em>Quantity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Quantity
		 * @see model.quantities.impl.QuantitiesPackageImpl#getQuantity()
		 * @generated
		 */
		EDataType QUANTITY = eINSTANCE.getQuantity();

	}

} //QuantitiesPackage
