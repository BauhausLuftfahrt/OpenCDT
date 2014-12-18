/**
 */
package net.bhl.cdt.model.system.quantities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.system.quantities.QuantitiesPackage
 * @generated
 */
public interface QuantitiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuantitiesFactory eINSTANCE = net.bhl.cdt.model.system.quantities.impl.QuantitiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Length Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Value</em>'.
	 * @generated
	 */
	LengthValue createLengthValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuantitiesPackage getQuantitiesPackage();

} //QuantitiesFactory
