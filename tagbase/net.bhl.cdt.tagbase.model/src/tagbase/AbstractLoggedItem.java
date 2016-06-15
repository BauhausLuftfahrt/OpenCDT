/**
 */
package tagbase;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Logged Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tagbase.AbstractLoggedItem#getCreator <em>Creator</em>}</li>
 *   <li>{@link tagbase.AbstractLoggedItem#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link tagbase.AbstractLoggedItem#getLastChanger <em>Last Changer</em>}</li>
 *   <li>{@link tagbase.AbstractLoggedItem#getLastChangeDate <em>Last Change Date</em>}</li>
 * </ul>
 *
 * @see tagbase.TagbasePackage#getAbstractLoggedItem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractLoggedItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' attribute.
	 * @see #setCreator(String)
	 * @see tagbase.TagbasePackage#getAbstractLoggedItem_Creator()
	 * @model
	 * @generated
	 */
	String getCreator();

	/**
	 * Sets the value of the '{@link tagbase.AbstractLoggedItem#getCreator <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' attribute.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see tagbase.TagbasePackage#getAbstractLoggedItem_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link tagbase.AbstractLoggedItem#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Changer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Changer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Changer</em>' attribute.
	 * @see #setLastChanger(String)
	 * @see tagbase.TagbasePackage#getAbstractLoggedItem_LastChanger()
	 * @model
	 * @generated
	 */
	String getLastChanger();

	/**
	 * Sets the value of the '{@link tagbase.AbstractLoggedItem#getLastChanger <em>Last Changer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Changer</em>' attribute.
	 * @see #getLastChanger()
	 * @generated
	 */
	void setLastChanger(String value);

	/**
	 * Returns the value of the '<em><b>Last Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Change Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Change Date</em>' attribute.
	 * @see #setLastChangeDate(Date)
	 * @see tagbase.TagbasePackage#getAbstractLoggedItem_LastChangeDate()
	 * @model
	 * @generated
	 */
	Date getLastChangeDate();

	/**
	 * Sets the value of the '{@link tagbase.AbstractLoggedItem#getLastChangeDate <em>Last Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Change Date</em>' attribute.
	 * @see #getLastChangeDate()
	 * @generated
	 */
	void setLastChangeDate(Date value);

} // AbstractLoggedItem
