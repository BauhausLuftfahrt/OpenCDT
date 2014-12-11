/**
 */
package net.bhl.cdt.connector.avl.avlmodel.impl;

import net.bhl.cdt.connector.avl.avlmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AvlmodelFactoryImpl extends EFactoryImpl implements AvlmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AvlmodelFactory init() {
		try {
			AvlmodelFactory theAvlmodelFactory = (AvlmodelFactory)EPackage.Registry.INSTANCE.getEFactory(AvlmodelPackage.eNS_URI);
			if (theAvlmodelFactory != null) {
				return theAvlmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AvlmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvlmodelFactoryImpl() {
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
			case AvlmodelPackage.AVL_MODEL_GENERATOR: return createAVLModelGenerator();
			case AvlmodelPackage.YDUPLICATE: return createYDuplicate();
			case AvlmodelPackage.AVL_SURFACE: return createAVLSurface();
			case AvlmodelPackage.AVL_SECTION: return createAVLSection();
			case AvlmodelPackage.AVL_CONTROL_SURFACE: return createAVLControlSurface();
			case AvlmodelPackage.SUFACE_ANGLE: return createSufaceAngle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AvlmodelPackage.SYMMETRY_TYPE:
				return createSymmetryTypeFromString(eDataType, initialValue);
			case AvlmodelPackage.SIGN_OF_DEFLECTION:
				return createSignOfDeflectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AvlmodelPackage.SYMMETRY_TYPE:
				return convertSymmetryTypeToString(eDataType, instanceValue);
			case AvlmodelPackage.SIGN_OF_DEFLECTION:
				return convertSignOfDeflectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVLModelGenerator createAVLModelGenerator() {
		AVLModelGeneratorImpl avlModelGenerator = new AVLModelGeneratorImpl();
		return avlModelGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDuplicate createYDuplicate() {
		YDuplicateImpl yDuplicate = new YDuplicateImpl();
		return yDuplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVLSurface createAVLSurface() {
		AVLSurfaceImpl avlSurface = new AVLSurfaceImpl();
		return avlSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVLSection createAVLSection() {
		AVLSectionImpl avlSection = new AVLSectionImpl();
		return avlSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVLControlSurface createAVLControlSurface() {
		AVLControlSurfaceImpl avlControlSurface = new AVLControlSurfaceImpl();
		return avlControlSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SufaceAngle createSufaceAngle() {
		SufaceAngleImpl sufaceAngle = new SufaceAngleImpl();
		return sufaceAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType createSymmetryTypeFromString(EDataType eDataType, String initialValue) {
		SymmetryType result = SymmetryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignOfDeflection createSignOfDeflectionFromString(EDataType eDataType, String initialValue) {
		SignOfDeflection result = SignOfDeflection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignOfDeflectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvlmodelPackage getAvlmodelPackage() {
		return (AvlmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AvlmodelPackage getPackage() {
		return AvlmodelPackage.eINSTANCE;
	}

} //AvlmodelFactoryImpl
