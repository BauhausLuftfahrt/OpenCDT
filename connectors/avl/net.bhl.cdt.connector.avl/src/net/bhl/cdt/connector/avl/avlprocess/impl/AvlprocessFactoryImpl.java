/**
 */
package net.bhl.cdt.connector.avl.avlprocess.impl;

import net.bhl.cdt.connector.avl.avlprocess.*;

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
public class AvlprocessFactoryImpl extends EFactoryImpl implements AvlprocessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AvlprocessFactory init() {
		try {
			AvlprocessFactory theAvlprocessFactory = (AvlprocessFactory)EPackage.Registry.INSTANCE.getEFactory(AvlprocessPackage.eNS_URI);
			if (theAvlprocessFactory != null) {
				return theAvlprocessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AvlprocessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvlprocessFactoryImpl() {
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
			case AvlprocessPackage.AVL_PROCESS_GENERATOR: return createAVLProcessGenerator();
			case AvlprocessPackage.VARIABLE_SWEEP: return createVariableSweep();
			case AvlprocessPackage.AVL_RESULT_IMPORTER: return createAVLResultImporter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVLProcessGenerator createAVLProcessGenerator() {
		AVLProcessGeneratorImpl avlProcessGenerator = new AVLProcessGeneratorImpl();
		return avlProcessGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableSweep createVariableSweep() {
		VariableSweepImpl variableSweep = new VariableSweepImpl();
		return variableSweep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVLResultImporter createAVLResultImporter() {
		AVLResultImporterImpl avlResultImporter = new AVLResultImporterImpl();
		return avlResultImporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvlprocessPackage getAvlprocessPackage() {
		return (AvlprocessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AvlprocessPackage getPackage() {
		return AvlprocessPackage.eINSTANCE;
	}

} //AvlprocessFactoryImpl
