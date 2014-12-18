/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel;

import net.bhl.cdt.connector.files.FileGenerator;
import net.bhl.cdt.model.system.DecimalNumber;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVL Model Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getSurfaces <em>Surfaces</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getMach <em>Mach</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getZsym <em>Zsym</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getSref <em>Sref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getCref <em>Cref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getBref <em>Bref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getXref <em>Xref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getYref <em>Yref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getZref <em>Zref</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getIYsym <em>IYsym</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getIZSym <em>IZ Sym</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator()
 * @model
 * @generated
 */
public interface AVLModelGenerator extends FileGenerator {
	/**
	 * Returns the value of the '<em><b>Surfaces</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surfaces</em>' containment reference list.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_Surfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<AVLSurface> getSurfaces();

	/**
	 * Returns the value of the '<em><b>Mach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mach</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mach</em>' reference.
	 * @see #setMach(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_Mach()
	 * @model
	 * @generated
	 */
	DecimalNumber getMach();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getMach <em>Mach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach</em>' reference.
	 * @see #getMach()
	 * @generated
	 */
	void setMach(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>IYsym</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.connector.avl.avlmodel.SymmetryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IYsym</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IYsym</em>' attribute.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SymmetryType
	 * @see #setIYsym(SymmetryType)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_IYsym()
	 * @model
	 * @generated
	 */
	SymmetryType getIYsym();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getIYsym <em>IYsym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IYsym</em>' attribute.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SymmetryType
	 * @see #getIYsym()
	 * @generated
	 */
	void setIYsym(SymmetryType value);

	/**
	 * Returns the value of the '<em><b>IZ Sym</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.connector.avl.avlmodel.SymmetryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IZ Sym</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IZ Sym</em>' attribute.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SymmetryType
	 * @see #setIZSym(SymmetryType)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_IZSym()
	 * @model
	 * @generated
	 */
	SymmetryType getIZSym();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getIZSym <em>IZ Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IZ Sym</em>' attribute.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SymmetryType
	 * @see #getIZSym()
	 * @generated
	 */
	void setIZSym(SymmetryType value);

	/**
	 * Returns the value of the '<em><b>Zsym</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zsym</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zsym</em>' reference.
	 * @see #setZsym(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_Zsym()
	 * @model
	 * @generated
	 */
	DecimalNumber getZsym();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getZsym <em>Zsym</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zsym</em>' reference.
	 * @see #getZsym()
	 * @generated
	 */
	void setZsym(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Sref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sref</em>' reference.
	 * @see #setSref(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_Sref()
	 * @model
	 * @generated
	 */
	DecimalNumber getSref();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getSref <em>Sref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sref</em>' reference.
	 * @see #getSref()
	 * @generated
	 */
	void setSref(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Cref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cref</em>' reference.
	 * @see #setCref(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_Cref()
	 * @model
	 * @generated
	 */
	DecimalNumber getCref();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getCref <em>Cref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cref</em>' reference.
	 * @see #getCref()
	 * @generated
	 */
	void setCref(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Bref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bref</em>' reference.
	 * @see #setBref(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_Bref()
	 * @model
	 * @generated
	 */
	DecimalNumber getBref();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getBref <em>Bref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bref</em>' reference.
	 * @see #getBref()
	 * @generated
	 */
	void setBref(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xref</em>' reference.
	 * @see #setXref(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_Xref()
	 * @model
	 * @generated
	 */
	DecimalNumber getXref();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getXref <em>Xref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xref</em>' reference.
	 * @see #getXref()
	 * @generated
	 */
	void setXref(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Yref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yref</em>' reference.
	 * @see #setYref(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_Yref()
	 * @model
	 * @generated
	 */
	DecimalNumber getYref();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getYref <em>Yref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yref</em>' reference.
	 * @see #getYref()
	 * @generated
	 */
	void setYref(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Zref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zref</em>' reference.
	 * @see #setZref(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getAVLModelGenerator_Zref()
	 * @model
	 * @generated
	 */
	DecimalNumber getZref();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getZref <em>Zref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zref</em>' reference.
	 * @see #getZref()
	 * @generated
	 */
	void setZref(DecimalNumber value);

} // AVLModelGenerator
