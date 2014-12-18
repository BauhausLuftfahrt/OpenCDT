/**
 */
package net.bhl.cdt.connector.avl.avlmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage
 * @generated
 */
public interface AvlmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AvlmodelFactory eINSTANCE = net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AVL Model Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVL Model Generator</em>'.
	 * @generated
	 */
	AVLModelGenerator createAVLModelGenerator();

	/**
	 * Returns a new object of class '<em>YDuplicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDuplicate</em>'.
	 * @generated
	 */
	YDuplicate createYDuplicate();

	/**
	 * Returns a new object of class '<em>AVL Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVL Surface</em>'.
	 * @generated
	 */
	AVLSurface createAVLSurface();

	/**
	 * Returns a new object of class '<em>AVL Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVL Section</em>'.
	 * @generated
	 */
	AVLSection createAVLSection();

	/**
	 * Returns a new object of class '<em>AVL Control Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVL Control Surface</em>'.
	 * @generated
	 */
	AVLControlSurface createAVLControlSurface();

	/**
	 * Returns a new object of class '<em>Suface Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suface Angle</em>'.
	 * @generated
	 */
	SufaceAngle createSufaceAngle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AvlmodelPackage getAvlmodelPackage();

} //AvlmodelFactory
