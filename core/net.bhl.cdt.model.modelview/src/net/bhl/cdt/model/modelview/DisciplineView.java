/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview;

import net.bhl.cdt.model.StructuralElement;
import net.bhl.cdt.model.View;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discipline View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.modelview.DisciplineView#getSubviews <em>Subviews</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.DisciplineView#getElements <em>Elements</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.DisciplineView#getInterfaceTypes <em>Interface Types</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.DisciplineView#getViewLinks <em>View Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getDisciplineView()
 * @model
 * @generated
 */
public interface DisciplineView extends View {
	/**
	 * Returns the value of the '<em><b>Subviews</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subviews</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subviews</em>' containment reference list.
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getDisciplineView_Subviews()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getSubviews();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.StructuralElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getDisciplineView_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructuralElement> getElements();

	/**
	 * Returns the value of the '<em><b>Interface Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Types</em>' reference list.
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getDisciplineView_InterfaceTypes()
	 * @model
	 * @generated
	 */
	EList<EClass> getInterfaceTypes();

	/**
	 * Returns the value of the '<em><b>View Links</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.modelview.ViewLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Links</em>' containment reference list.
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getDisciplineView_ViewLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewLink> getViewLinks();

} // DisciplineView
