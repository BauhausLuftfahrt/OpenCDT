/**
 */
package net.bhl.cdt.connector.files;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.connector.files.FilesPackage
 * @generated
 */
public interface FilesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilesFactory eINSTANCE = net.bhl.cdt.connector.files.impl.FilesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirements Importer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Importer</em>'.
	 * @generated
	 */
	RequirementsImporter createRequirementsImporter();

	/**
	 * Returns a new object of class '<em>Geometry Importer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometry Importer</em>'.
	 * @generated
	 */
	GeometryImporter createGeometryImporter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FilesPackage getFilesPackage();

} //FilesFactory
