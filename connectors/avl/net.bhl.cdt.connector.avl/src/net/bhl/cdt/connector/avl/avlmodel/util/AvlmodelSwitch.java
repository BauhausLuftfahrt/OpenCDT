/**
 */
package net.bhl.cdt.connector.avl.avlmodel.util;

import net.bhl.cdt.connector.avl.avlmodel.*;
import net.bhl.cdt.connector.files.FileGenerator;
import net.bhl.cdt.connector.files.FileOperation;
import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.process.DesignOperation;
import net.bhl.cdt.model.process.ProcessElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage
 * @generated
 */
public class AvlmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AvlmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvlmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = AvlmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AvlmodelPackage.AVL_MODEL_GENERATOR: {
				AVLModelGenerator avlModelGenerator = (AVLModelGenerator)theEObject;
				T result = caseAVLModelGenerator(avlModelGenerator);
				if (result == null) result = caseFileGenerator(avlModelGenerator);
				if (result == null) result = caseFileOperation(avlModelGenerator);
				if (result == null) result = caseOperationWithInput(avlModelGenerator);
				if (result == null) result = caseDesignOperation(avlModelGenerator);
				if (result == null) result = caseProcessElement(avlModelGenerator);
				if (result == null) result = caseNamedElement(avlModelGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvlmodelPackage.YDUPLICATE: {
				YDuplicate yDuplicate = (YDuplicate)theEObject;
				T result = caseYDuplicate(yDuplicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvlmodelPackage.AVL_SURFACE: {
				AVLSurface avlSurface = (AVLSurface)theEObject;
				T result = caseAVLSurface(avlSurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvlmodelPackage.AVL_SECTION: {
				AVLSection avlSection = (AVLSection)theEObject;
				T result = caseAVLSection(avlSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvlmodelPackage.AVL_CONTROL_SURFACE: {
				AVLControlSurface avlControlSurface = (AVLControlSurface)theEObject;
				T result = caseAVLControlSurface(avlControlSurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvlmodelPackage.SUFACE_ANGLE: {
				SufaceAngle sufaceAngle = (SufaceAngle)theEObject;
				T result = caseSufaceAngle(sufaceAngle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVL Model Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVL Model Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVLModelGenerator(AVLModelGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDuplicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDuplicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDuplicate(YDuplicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVL Surface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVL Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVLSurface(AVLSurface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVL Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVL Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVLSection(AVLSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVL Control Surface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVL Control Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVLControlSurface(AVLControlSurface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suface Angle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suface Angle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSufaceAngle(SufaceAngle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignOperation(DesignOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileOperation(FileOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation With Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation With Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationWithInput(OperationWithInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileGenerator(FileGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AvlmodelSwitch
