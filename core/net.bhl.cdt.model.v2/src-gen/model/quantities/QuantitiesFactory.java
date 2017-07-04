/**
 */
package model.quantities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.quantities.QuantitiesPackage
 * @generated
 */
public interface QuantitiesFactory extends EFactory {
	/**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	QuantitiesFactory eINSTANCE = model.quantities.impl.QuantitiesFactoryImpl.init();

	/**
         * Returns a new object of class '<em>String Parameter</em>'.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @return a new object of class '<em>String Parameter</em>'.
         * @generated
         */
	StringParameter createStringParameter();

	/**
         * Returns a new object of class '<em>Length Paramenter</em>'.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @return a new object of class '<em>Length Paramenter</em>'.
         * @generated
         */
	LengthParamenter createLengthParamenter();

	/**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
	QuantitiesPackage getQuantitiesPackage();

} //QuantitiesFactory
