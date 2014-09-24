/**
 */
package net.bhl.cdt.connector.files.util;

import net.bhl.cdt.connector.files.*;
import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.OperationWithOutput;
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
 * @see net.bhl.cdt.connector.files.FilesPackage
 * @generated
 */
public class FilesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FilesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesSwitch() {
		if (modelPackage == null) {
			modelPackage = FilesPackage.eINSTANCE;
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
			case FilesPackage.REQUIREMENTS_IMPORTER: {
				RequirementsImporter requirementsImporter = (RequirementsImporter)theEObject;
				T result = caseRequirementsImporter(requirementsImporter);
				if (result == null) result = caseFileParser(requirementsImporter);
				if (result == null) result = caseFileOperation(requirementsImporter);
				if (result == null) result = caseOperationWithOutput(requirementsImporter);
				if (result == null) result = caseDesignOperation(requirementsImporter);
				if (result == null) result = caseProcessElement(requirementsImporter);
				if (result == null) result = caseNamedElement(requirementsImporter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilesPackage.GEOMETRY_IMPORTER: {
				GeometryImporter geometryImporter = (GeometryImporter)theEObject;
				T result = caseGeometryImporter(geometryImporter);
				if (result == null) result = caseFileParser(geometryImporter);
				if (result == null) result = caseFileOperation(geometryImporter);
				if (result == null) result = caseOperationWithOutput(geometryImporter);
				if (result == null) result = caseDesignOperation(geometryImporter);
				if (result == null) result = caseProcessElement(geometryImporter);
				if (result == null) result = caseNamedElement(geometryImporter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilesPackage.FILE_OPERATION: {
				FileOperation fileOperation = (FileOperation)theEObject;
				T result = caseFileOperation(fileOperation);
				if (result == null) result = caseDesignOperation(fileOperation);
				if (result == null) result = caseProcessElement(fileOperation);
				if (result == null) result = caseNamedElement(fileOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilesPackage.FILE_GENERATOR: {
				FileGenerator fileGenerator = (FileGenerator)theEObject;
				T result = caseFileGenerator(fileGenerator);
				if (result == null) result = caseFileOperation(fileGenerator);
				if (result == null) result = caseOperationWithInput(fileGenerator);
				if (result == null) result = caseDesignOperation(fileGenerator);
				if (result == null) result = caseProcessElement(fileGenerator);
				if (result == null) result = caseNamedElement(fileGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilesPackage.FILE_PARSER: {
				FileParser fileParser = (FileParser)theEObject;
				T result = caseFileParser(fileParser);
				if (result == null) result = caseFileOperation(fileParser);
				if (result == null) result = caseOperationWithOutput(fileParser);
				if (result == null) result = caseDesignOperation(fileParser);
				if (result == null) result = caseProcessElement(fileParser);
				if (result == null) result = caseNamedElement(fileParser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Importer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Importer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsImporter(RequirementsImporter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Importer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Importer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryImporter(GeometryImporter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>File Parser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Parser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileParser(FileParser object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Operation With Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation With Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationWithOutput(OperationWithOutput object) {
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

} //FilesSwitch
