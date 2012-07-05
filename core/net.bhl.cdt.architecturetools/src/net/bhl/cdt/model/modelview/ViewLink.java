/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview;

import net.bhl.cdt.model.Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.modelview.ViewLink#getVirtualParent <em>Virtual Parent</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.ViewLink#getVirtualChild <em>Virtual Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getViewLink()
 * @model
 * @generated
 */
public interface ViewLink extends Element {
	/**
	 * Returns the value of the '<em><b>Virtual Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Parent</em>' reference.
	 * @see #setVirtualParent(EObject)
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getViewLink_VirtualParent()
	 * @model
	 * @generated
	 */
	EObject getVirtualParent();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.modelview.ViewLink#getVirtualParent <em>Virtual Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Parent</em>' reference.
	 * @see #getVirtualParent()
	 * @generated
	 */
	void setVirtualParent(EObject value);

	/**
	 * Returns the value of the '<em><b>Virtual Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Child</em>' reference.
	 * @see #setVirtualChild(EObject)
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getViewLink_VirtualChild()
	 * @model
	 * @generated
	 */
	EObject getVirtualChild();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.modelview.ViewLink#getVirtualChild <em>Virtual Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Child</em>' reference.
	 * @see #getVirtualChild()
	 * @generated
	 */
	void setVirtualChild(EObject value);

} // ViewLink
