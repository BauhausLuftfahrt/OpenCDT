/**
 */
package model.base;

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
 * @see model.base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/base";

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
	BasePackage eINSTANCE = model.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link model.base.impl.ANamedItemImpl <em>ANamed Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.base.impl.ANamedItemImpl
	 * @see model.base.impl.BasePackageImpl#getANamedItem()
	 * @generated
	 */
	int ANAMED_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAMED_ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>ANamed Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAMED_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ANamed Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAMED_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.base.impl.AIdentifiableItemImpl <em>AIdentifiable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.base.impl.AIdentifiableItemImpl
	 * @see model.base.impl.BasePackageImpl#getAIdentifiableItem()
	 * @generated
	 */
	int AIDENTIFIABLE_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIDENTIFIABLE_ITEM__ID = 0;

	/**
	 * The number of structural features of the '<em>AIdentifiable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIDENTIFIABLE_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>AIdentifiable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIDENTIFIABLE_ITEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.base.ANamedItem <em>ANamed Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANamed Item</em>'.
	 * @see model.base.ANamedItem
	 * @generated
	 */
	EClass getANamedItem();

	/**
	 * Returns the meta object for the attribute '{@link model.base.ANamedItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.base.ANamedItem#getName()
	 * @see #getANamedItem()
	 * @generated
	 */
	EAttribute getANamedItem_Name();

	/**
	 * Returns the meta object for class '{@link model.base.AIdentifiableItem <em>AIdentifiable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AIdentifiable Item</em>'.
	 * @see model.base.AIdentifiableItem
	 * @generated
	 */
	EClass getAIdentifiableItem();

	/**
	 * Returns the meta object for the attribute '{@link model.base.AIdentifiableItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.base.AIdentifiableItem#getId()
	 * @see #getAIdentifiableItem()
	 * @generated
	 */
	EAttribute getAIdentifiableItem_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link model.base.impl.ANamedItemImpl <em>ANamed Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.base.impl.ANamedItemImpl
		 * @see model.base.impl.BasePackageImpl#getANamedItem()
		 * @generated
		 */
		EClass ANAMED_ITEM = eINSTANCE.getANamedItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANAMED_ITEM__NAME = eINSTANCE.getANamedItem_Name();

		/**
		 * The meta object literal for the '{@link model.base.impl.AIdentifiableItemImpl <em>AIdentifiable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.base.impl.AIdentifiableItemImpl
		 * @see model.base.impl.BasePackageImpl#getAIdentifiableItem()
		 * @generated
		 */
		EClass AIDENTIFIABLE_ITEM = eINSTANCE.getAIdentifiableItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIDENTIFIABLE_ITEM__ID = eINSTANCE.getAIdentifiableItem_Id();

	}

} //BasePackage
