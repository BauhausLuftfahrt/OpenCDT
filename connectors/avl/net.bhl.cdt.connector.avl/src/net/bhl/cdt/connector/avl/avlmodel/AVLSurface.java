/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVL Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getYDuplicate <em>YDuplicate</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getSections <em>Sections</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getNchordwise <em>Nchordwise</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getNspanwise <em>Nspanwise</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getSspace <em>Sspace</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getCspace <em>Cspace</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSurface()
 * @model
 * @generated
 */
public interface AVLSurface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSurface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nchordwise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nchordwise</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nchordwise</em>' attribute.
	 * @see #setNchordwise(int)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSurface_Nchordwise()
	 * @model
	 * @generated
	 */
	int getNchordwise();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getNchordwise <em>Nchordwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nchordwise</em>' attribute.
	 * @see #getNchordwise()
	 * @generated
	 */
	void setNchordwise(int value);

	/**
	 * Returns the value of the '<em><b>Cspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cspace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cspace</em>' attribute.
	 * @see #setCspace(double)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSurface_Cspace()
	 * @model
	 * @generated
	 */
	double getCspace();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getCspace <em>Cspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cspace</em>' attribute.
	 * @see #getCspace()
	 * @generated
	 */
	void setCspace(double value);

	/**
	 * Returns the value of the '<em><b>Nspanwise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nspanwise</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nspanwise</em>' attribute.
	 * @see #setNspanwise(int)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSurface_Nspanwise()
	 * @model
	 * @generated
	 */
	int getNspanwise();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getNspanwise <em>Nspanwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nspanwise</em>' attribute.
	 * @see #getNspanwise()
	 * @generated
	 */
	void setNspanwise(int value);

	/**
	 * Returns the value of the '<em><b>Sspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sspace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sspace</em>' attribute.
	 * @see #setSspace(double)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSurface_Sspace()
	 * @model
	 * @generated
	 */
	double getSspace();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getSspace <em>Sspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sspace</em>' attribute.
	 * @see #getSspace()
	 * @generated
	 */
	void setSspace(double value);

	/**
	 * Returns the value of the '<em><b>YDuplicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDuplicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDuplicate</em>' containment reference.
	 * @see #setYDuplicate(YDuplicate)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSurface_YDuplicate()
	 * @model containment="true"
	 * @generated
	 */
	YDuplicate getYDuplicate();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getYDuplicate <em>YDuplicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDuplicate</em>' containment reference.
	 * @see #getYDuplicate()
	 * @generated
	 */
	void setYDuplicate(YDuplicate value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.connector.avl.avlmodel.AVLSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSurface_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<AVLSection> getSections();

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(SufaceAngle)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSurface_Angle()
	 * @model containment="true"
	 * @generated
	 */
	SufaceAngle getAngle();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(SufaceAngle value);

} // AVLSurface
