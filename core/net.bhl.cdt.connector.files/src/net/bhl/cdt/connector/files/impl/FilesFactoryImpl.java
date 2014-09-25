/**
 */
package net.bhl.cdt.connector.files.impl;

import net.bhl.cdt.connector.files.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilesFactoryImpl extends EFactoryImpl implements FilesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FilesFactory init() {
		try {
			FilesFactory theFilesFactory = (FilesFactory)EPackage.Registry.INSTANCE.getEFactory(FilesPackage.eNS_URI);
			if (theFilesFactory != null) {
				return theFilesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FilesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FilesPackage.REQUIREMENTS_IMPORTER: return createRequirementsImporter();
			case FilesPackage.GEOMETRY_IMPORTER: return createGeometryImporter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsImporter createRequirementsImporter() {
		RequirementsImporterImpl requirementsImporter = new RequirementsImporterImpl();
		return requirementsImporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryImporter createGeometryImporter() {
		GeometryImporterImpl geometryImporter = new GeometryImporterImpl();
		return geometryImporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesPackage getFilesPackage() {
		return (FilesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FilesPackage getPackage() {
		return FilesPackage.eINSTANCE;
	}

} //FilesFactoryImpl
