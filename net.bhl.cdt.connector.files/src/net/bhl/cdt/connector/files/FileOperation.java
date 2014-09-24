/**
 */
package net.bhl.cdt.connector.files;

import net.bhl.cdt.model.process.DesignOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.files.FileOperation#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.files.FilesPackage#getFileOperation()
 * @model abstract="true"
 * @generated
 */
public interface FileOperation extends DesignOperation {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see net.bhl.cdt.connector.files.FilesPackage#getFileOperation_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.files.FileOperation#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // FileOperation
