/**
 */
package tagbase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tagbase.TagbasePackage
 * @generated
 */
public interface TagbaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TagbaseFactory eINSTANCE = tagbase.impl.TagbaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tag Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Base</em>'.
	 * @generated
	 */
	TagBase createTagBase();

	/**
	 * Returns a new object of class '<em>Tagable Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tagable Set</em>'.
	 * @generated
	 */
	TagableSet createTagableSet();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Named Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Tag</em>'.
	 * @generated
	 */
	NamedTag createNamedTag();

	/**
	 * Returns a new object of class '<em>Named Tag Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Tag Definition</em>'.
	 * @generated
	 */
	NamedTagDefinition createNamedTagDefinition();

	/**
	 * Returns a new object of class '<em>Tag Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Set</em>'.
	 * @generated
	 */
	TagSet createTagSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TagbasePackage getTagbasePackage();

} //TagbaseFactory
