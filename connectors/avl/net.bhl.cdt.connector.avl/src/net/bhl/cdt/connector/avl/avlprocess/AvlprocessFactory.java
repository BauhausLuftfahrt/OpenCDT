/**
 */
package net.bhl.cdt.connector.avl.avlprocess;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage
 * @generated
 */
public interface AvlprocessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AvlprocessFactory eINSTANCE = net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AVL Process Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVL Process Generator</em>'.
	 * @generated
	 */
	AVLProcessGenerator createAVLProcessGenerator();

	/**
	 * Returns a new object of class '<em>Variable Sweep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Sweep</em>'.
	 * @generated
	 */
	VariableSweep createVariableSweep();

	/**
	 * Returns a new object of class '<em>AVL Result Importer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVL Result Importer</em>'.
	 * @generated
	 */
	AVLResultImporter createAVLResultImporter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AvlprocessPackage getAvlprocessPackage();

} //AvlprocessFactory
