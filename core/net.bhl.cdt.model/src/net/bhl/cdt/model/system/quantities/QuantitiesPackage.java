/**
 */
package net.bhl.cdt.model.system.quantities;

import net.bhl.cdt.model.system.SystemPackage;

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
 * @see net.bhl.cdt.model.system.quantities.QuantitiesFactory
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
	String eNS_URI = "http://bhl.net/cdt/model/system/quantities";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.model.system";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuantitiesPackage eINSTANCE = net.bhl.cdt.model.system.quantities.impl.QuantitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.system.quantities.impl.LengthValueImpl <em>Length Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.system.quantities.impl.LengthValueImpl
	 * @see net.bhl.cdt.model.system.quantities.impl.QuantitiesPackageImpl#getLengthValue()
	 * @generated
	 */
	int LENGTH_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_VALUE__SOURCE_OPERATION = SystemPackage.VALUE__SOURCE_OPERATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_VALUE__NAME = SystemPackage.VALUE__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_VALUE__STATES = SystemPackage.VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_VALUE__PARAMETER = SystemPackage.VALUE__PARAMETER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_VALUE__VALUE = SystemPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Length Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_VALUE_FEATURE_COUNT = SystemPackage.VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Length Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_VALUE_OPERATION_COUNT = SystemPackage.VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.quantity.Length
	 * @see net.bhl.cdt.model.system.quantities.impl.QuantitiesPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 1;

	/**
	 * The meta object id for the '<em>Amount</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jscience.physics.amount.Amount
	 * @see net.bhl.cdt.model.system.quantities.impl.QuantitiesPackageImpl#getAmount()
	 * @generated
	 */
	int AMOUNT = 2;


	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.system.quantities.LengthValue <em>Length Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Value</em>'.
	 * @see net.bhl.cdt.model.system.quantities.LengthValue
	 * @generated
	 */
	EClass getLengthValue();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.system.quantities.LengthValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.bhl.cdt.model.system.quantities.LengthValue#getValue()
	 * @see #getLengthValue()
	 * @generated
	 */
	EAttribute getLengthValue_Value();

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
	 * Returns the meta object for data type '{@link org.jscience.physics.amount.Amount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Amount</em>'.
	 * @see org.jscience.physics.amount.Amount
	 * @model instanceClass="org.jscience.physics.amount.Amount" typeParameters="Q" QBounds="net.bhl.cdt.model.units.Quantity"
	 * @generated
	 */
	EDataType getAmount();

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
		 * The meta object literal for the '{@link net.bhl.cdt.model.system.quantities.impl.LengthValueImpl <em>Length Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.system.quantities.impl.LengthValueImpl
		 * @see net.bhl.cdt.model.system.quantities.impl.QuantitiesPackageImpl#getLengthValue()
		 * @generated
		 */
		EClass LENGTH_VALUE = eINSTANCE.getLengthValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH_VALUE__VALUE = eINSTANCE.getLengthValue_Value();

		/**
		 * The meta object literal for the '<em>Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.quantity.Length
		 * @see net.bhl.cdt.model.system.quantities.impl.QuantitiesPackageImpl#getLength()
		 * @generated
		 */
		EDataType LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em>Amount</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jscience.physics.amount.Amount
		 * @see net.bhl.cdt.model.system.quantities.impl.QuantitiesPackageImpl#getAmount()
		 * @generated
		 */
		EDataType AMOUNT = eINSTANCE.getAmount();

	}

} //QuantitiesPackage
