/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Symmetry Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getSymmetryType()
 * @model
 * @generated
 */
public enum SymmetryType implements Enumerator {
	/**
	 * The '<em><b>Symmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	SYMMETRIC(1, "symmetric", "symmetric"),

	/**
	 * The '<em><b>Antisymmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTISYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	ANTISYMMETRIC(-1, "antisymmetric", "antisymmetric"),

	/**
	 * The '<em><b>No Symmetry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SYMMETRY_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SYMMETRY(0, "noSymmetry", "noSymmetry");

	/**
	 * The '<em><b>Symmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Symmetric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYMMETRIC
	 * @model name="symmetric"
	 * @generated
	 * @ordered
	 */
	public static final int SYMMETRIC_VALUE = 1;

	/**
	 * The '<em><b>Antisymmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Antisymmetric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANTISYMMETRIC
	 * @model name="antisymmetric"
	 * @generated
	 * @ordered
	 */
	public static final int ANTISYMMETRIC_VALUE = -1;

	/**
	 * The '<em><b>No Symmetry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Symmetry</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_SYMMETRY
	 * @model name="noSymmetry"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SYMMETRY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Symmetry Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SymmetryType[] VALUES_ARRAY =
		new SymmetryType[] {
			SYMMETRIC,
			ANTISYMMETRIC,
			NO_SYMMETRY,
		};

	/**
	 * A public read-only list of all the '<em><b>Symmetry Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SymmetryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Symmetry Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymmetryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SymmetryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Symmetry Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymmetryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SymmetryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Symmetry Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymmetryType get(int value) {
		switch (value) {
			case SYMMETRIC_VALUE: return SYMMETRIC;
			case ANTISYMMETRIC_VALUE: return ANTISYMMETRIC;
			case NO_SYMMETRY_VALUE: return NO_SYMMETRY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SymmetryType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SymmetryType
