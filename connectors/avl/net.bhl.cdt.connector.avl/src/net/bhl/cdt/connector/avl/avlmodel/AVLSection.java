/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel;

import net.bhl.cdt.model.system.DecimalNumber;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVL Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getControlSurfaces <em>Control Surfaces</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getXle <em>Xle</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getYle <em>Yle</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getZle <em>Zle</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getChord <em>Chord</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getAinc <em>Ainc</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getNspanwise <em>Nspanwise</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getSspace <em>Sspace</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSection()
 * @model
 * @generated
 */
public interface AVLSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Control Surfaces</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Surfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surfaces</em>' containment reference list.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSection_ControlSurfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<AVLControlSurface> getControlSurfaces();

	/**
	 * Returns the value of the '<em><b>Xle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xle</em>' reference.
	 * @see #setXle(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSection_Xle()
	 * @model
	 * @generated
	 */
	DecimalNumber getXle();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getXle <em>Xle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xle</em>' reference.
	 * @see #getXle()
	 * @generated
	 */
	void setXle(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Yle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yle</em>' reference.
	 * @see #setYle(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSection_Yle()
	 * @model
	 * @generated
	 */
	DecimalNumber getYle();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getYle <em>Yle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yle</em>' reference.
	 * @see #getYle()
	 * @generated
	 */
	void setYle(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Zle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zle</em>' reference.
	 * @see #setZle(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSection_Zle()
	 * @model
	 * @generated
	 */
	DecimalNumber getZle();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getZle <em>Zle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zle</em>' reference.
	 * @see #getZle()
	 * @generated
	 */
	void setZle(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Chord</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chord</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chord</em>' reference.
	 * @see #setChord(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSection_Chord()
	 * @model
	 * @generated
	 */
	DecimalNumber getChord();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getChord <em>Chord</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chord</em>' reference.
	 * @see #getChord()
	 * @generated
	 */
	void setChord(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Ainc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ainc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ainc</em>' reference.
	 * @see #setAinc(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSection_Ainc()
	 * @model
	 * @generated
	 */
	DecimalNumber getAinc();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getAinc <em>Ainc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ainc</em>' reference.
	 * @see #getAinc()
	 * @generated
	 */
	void setAinc(DecimalNumber value);

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
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSection_Nspanwise()
	 * @model
	 * @generated
	 */
	int getNspanwise();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getNspanwise <em>Nspanwise</em>}' attribute.
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
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLSection_Sspace()
	 * @model
	 * @generated
	 */
	double getSspace();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getSspace <em>Sspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sspace</em>' attribute.
	 * @see #getSspace()
	 * @generated
	 */
	void setSspace(double value);

} // AVLSection
