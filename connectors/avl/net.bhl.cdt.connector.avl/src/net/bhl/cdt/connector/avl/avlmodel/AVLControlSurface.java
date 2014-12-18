/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel;

import net.bhl.cdt.model.geometry.SpaceVector;
import net.bhl.cdt.model.system.DecimalNumber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVL Control Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getCgain <em>Cgain</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getXhinge <em>Xhinge</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getHingeVector <em>Hinge Vector</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getSgnDup <em>Sgn Dup</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLControlSurface()
 * @model
 * @generated
 */
public interface AVLControlSurface extends EObject {
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
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLControlSurface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cgain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cgain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cgain</em>' reference.
	 * @see #setCgain(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLControlSurface_Cgain()
	 * @model
	 * @generated
	 */
	DecimalNumber getCgain();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getCgain <em>Cgain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cgain</em>' reference.
	 * @see #getCgain()
	 * @generated
	 */
	void setCgain(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Xhinge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xhinge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xhinge</em>' reference.
	 * @see #setXhinge(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLControlSurface_Xhinge()
	 * @model
	 * @generated
	 */
	DecimalNumber getXhinge();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getXhinge <em>Xhinge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xhinge</em>' reference.
	 * @see #getXhinge()
	 * @generated
	 */
	void setXhinge(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Hinge Vector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hinge Vector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hinge Vector</em>' reference.
	 * @see #setHingeVector(SpaceVector)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLControlSurface_HingeVector()
	 * @model
	 * @generated
	 */
	SpaceVector getHingeVector();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getHingeVector <em>Hinge Vector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinge Vector</em>' reference.
	 * @see #getHingeVector()
	 * @generated
	 */
	void setHingeVector(SpaceVector value);

	/**
	 * Returns the value of the '<em><b>Sgn Dup</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sgn Dup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgn Dup</em>' attribute.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection
	 * @see #setSgnDup(SignOfDeflection)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLControlSurface_SgnDup()
	 * @model
	 * @generated
	 */
	SignOfDeflection getSgnDup();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getSgnDup <em>Sgn Dup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgn Dup</em>' attribute.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection
	 * @see #getSgnDup()
	 * @generated
	 */
	void setSgnDup(SignOfDeflection value);

} // AVLControlSurface
