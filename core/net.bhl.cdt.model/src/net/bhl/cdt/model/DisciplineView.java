/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Discipline View</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.DisciplineView#getSubviews <em>Subviews</em>}</li>
 *   <li>{@link net.bhl.cdt.model.DisciplineView#getElements <em>Elements</em>}</li>
 *   <li>{@link net.bhl.cdt.model.DisciplineView#getInterfaceTypes <em>Interface Types</em>}</li>
 *   <li>{@link net.bhl.cdt.model.DisciplineView#getViewLinks <em>View Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.ModelPackage#getDisciplineView()
 * @model
 * @generated
 */
public interface DisciplineView extends View {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.StructuralElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getDisciplineView_Elements()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<StructuralElement> getElements();

	/**
	 * Returns the value of the '<em><b>Interface Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Types</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Types</em>' reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getDisciplineView_InterfaceTypes()
	 * @model
	 * @generated
	 */
	EList<EClass> getInterfaceTypes();

	/**
	 * Returns the value of the '<em><b>View Links</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.ViewLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Links</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Links</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getDisciplineView_ViewLinks()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ViewLink> getViewLinks();

	/**
	 * Returns the value of the '<em><b>Subviews</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subviews</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subviews</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getDisciplineView_Subviews()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<View> getSubviews();

} // DisciplineView
