/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation;

import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.MappableComponentInterface;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Condition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.calculation.Condition#getMappableComponentOfInterest <em>Mappable Component Of Interest
 * </em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.Condition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Element {
	/**
	 * Returns the value of the '<em><b>Mappable Component Of Interest</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappable Component Of Interest</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mappable Component Of Interest</em>' reference.
	 * @see #setMappableComponentOfInterest(MappableComponentInterface)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCondition_MappableComponentOfInterest()
	 * @model
	 * @generated
	 */
	MappableComponentInterface getMappableComponentOfInterest();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.Condition#getMappableComponentOfInterest
	 * <em>Mappable Component Of Interest</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Mappable Component Of Interest</em>' reference.
	 * @see #getMappableComponentOfInterest()
	 * @generated
	 */
	void setMappableComponentOfInterest(MappableComponentInterface value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCondition_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.Condition#getValue <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Condition
