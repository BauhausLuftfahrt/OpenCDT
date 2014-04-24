/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.units;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Quantity</b></em>', and utility
 * methods for working with them. <!-- end-user-doc -->
 * @see net.bhl.cdt.model.units.UnitsPackage#getQuantity()
 * @model
 * @generated
 */
public enum Quantity implements Enumerator {
	/**
	 * The '<em><b>LENGTH</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH(0, "LENGTH", "LENGTH"),

	/**
	 * The '<em><b>WEIGHT</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #WEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT(0, "WEIGHT", "WEIGHT"),

	/**
	 * The '<em><b>MASS</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #MASS_VALUE
	 * @generated
	 * @ordered
	 */
	MASS(0, "MASS", "MASS"), /**
	 * The '<em><b>ACCELERATION</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #ACCELERATION_VALUE
	 * @generated
	 * @ordered
	 */
	ACCELERATION(0, "ACCELERATION", "ACCELERATION"), /**
	 * The '<em><b>COEFFICIENT</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #COEFFICIENT_VALUE
	 * @generated
	 * @ordered
	 */
	COEFFICIENT(0, "COEFFICIENT", "COEFFICIENT"), /**
	 * The '<em><b>TEMPERATURE</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(0, "TEMPERATURE", "TEMPERATURE"), /**
	 * The '<em><b>VELOCITY</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #VELOCITY_VALUE
	 * @generated
	 * @ordered
	 */
	VELOCITY(0, "VELOCITY", "VELOCITY"), /**
	 * The '<em><b>DENSITY</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #DENSITY_VALUE
	 * @generated
	 * @ordered
	 */
	DENSITY(0, "DENSITY", "DENSITY"), /**
	 * The '<em><b>SPECIFICFUELCONSUMPTION</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #SPECIFICFUELCONSUMPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIFICFUELCONSUMPTION(0, "SPECIFICFUELCONSUMPTION", "SPECIFICFUELCONSUMPTION"), /**
	 * The '<em><b>AREA</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #AREA_VALUE
	 * @generated
	 * @ordered
	 */
	AREA(0, "AREA", "AREA"), /**
	 * The '<em><b>ANGLE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #ANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	ANGLE(0, "ANGLE", "ANGLE"), /**
	 * The '<em><b>CURRENCY</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #CURRENCY_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENCY(0, "CURRENCY", "CURRENCY"), /**
	 * The '<em><b>LABORCOST</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #LABORCOST_VALUE
	 * @generated
	 * @ordered
	 */
	LABORCOST(0, "LABORCOST", "LABORCOST"), /**
	 * The '<em><b>COUNT</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT(0, "COUNT", "COUNT"), /**
	 * The '<em><b>FUELCOST</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #FUELCOST_VALUE
	 * @generated
	 * @ordered
	 */
	FUELCOST(0, "FUELCOST", "FUELCOST");

	/**
	 * The '<em><b>LENGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LENGTH</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LENGTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_VALUE = 0;

	/**
	 * The '<em><b>WEIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEIGHT</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_VALUE = 0;

	/**
	 * The '<em><b>MASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MASS</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASS_VALUE = 0;

	/**
	 * The '<em><b>ACCELERATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCELERATION</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCELERATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCELERATION_VALUE = 0;

	/**
	 * The '<em><b>COEFFICIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COEFFICIENT</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COEFFICIENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COEFFICIENT_VALUE = 0;

	/**
	 * The '<em><b>TEMPERATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPERATURE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 0;

	/**
	 * The '<em><b>VELOCITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VELOCITY</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VELOCITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VELOCITY_VALUE = 0;

	/**
	 * The '<em><b>DENSITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DENSITY</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENSITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DENSITY_VALUE = 0;

	/**
	 * The '<em><b>SPECIFICFUELCONSUMPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPECIFICFUELCONSUMPTION</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIFICFUELCONSUMPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICFUELCONSUMPTION_VALUE = 0;

	/**
	 * The '<em><b>AREA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AREA</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AREA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AREA_VALUE = 0;

	/**
	 * The '<em><b>ANGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANGLE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANGLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANGLE_VALUE = 0;

	/**
	 * The '<em><b>CURRENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURRENCY</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURRENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURRENCY_VALUE = 0;

	/**
	 * The '<em><b>LABORCOST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LABORCOST</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABORCOST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LABORCOST_VALUE = 0;

	/**
	 * The '<em><b>COUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COUNT</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_VALUE = 0;

	/**
	 * The '<em><b>FUELCOST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUELCOST</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUELCOST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUELCOST_VALUE = 0;

	/**
	 * An array of all the '<em><b>Quantity</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final Quantity[] VALUES_ARRAY = new Quantity[] {
			LENGTH,
			WEIGHT,
			MASS,
			ACCELERATION,
			COEFFICIENT,
			TEMPERATURE,
			VELOCITY,
			DENSITY,
			SPECIFICFUELCONSUMPTION,
			AREA,
			ANGLE,
			CURRENCY,
			LABORCOST,
			COUNT,
			FUELCOST,
		};

	/**
	 * A public read-only list of all the '<em><b>Quantity</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List<Quantity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Quantity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static Quantity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Quantity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quantity</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static Quantity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Quantity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quantity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static Quantity get(int value) {
		switch (value) {
			case LENGTH_VALUE: return LENGTH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private Quantity(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // Quantity
