/**
 */
package net.bhl.cdt.connector.files.impl;

import java.util.Collection;

import net.bhl.cdt.connector.files.FileGenerator;
import net.bhl.cdt.connector.files.FilesPackage;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.ProcessableElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.files.impl.FileGeneratorImpl#getProcessedElements <em>Processed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FileGeneratorImpl extends FileOperationImpl implements FileGenerator {
	/**
	 * The cached value of the '{@link #getProcessedElements() <em>Processed Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessableElement> processedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesPackage.Literals.FILE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessableElement> getProcessedElements() {
		if (processedElements == null) {
			processedElements = new EObjectResolvingEList<ProcessableElement>(ProcessableElement.class, this, FilesPackage.FILE_GENERATOR__PROCESSED_ELEMENTS);
		}
		return processedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilesPackage.FILE_GENERATOR__PROCESSED_ELEMENTS:
				return getProcessedElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FilesPackage.FILE_GENERATOR__PROCESSED_ELEMENTS:
				getProcessedElements().clear();
				getProcessedElements().addAll((Collection<? extends ProcessableElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FilesPackage.FILE_GENERATOR__PROCESSED_ELEMENTS:
				getProcessedElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FilesPackage.FILE_GENERATOR__PROCESSED_ELEMENTS:
				return processedElements != null && !processedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OperationWithInput.class) {
			switch (derivedFeatureID) {
				case FilesPackage.FILE_GENERATOR__PROCESSED_ELEMENTS: return ModelPackage.OPERATION_WITH_INPUT__PROCESSED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OperationWithInput.class) {
			switch (baseFeatureID) {
				case ModelPackage.OPERATION_WITH_INPUT__PROCESSED_ELEMENTS: return FilesPackage.FILE_GENERATOR__PROCESSED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FileGeneratorImpl
