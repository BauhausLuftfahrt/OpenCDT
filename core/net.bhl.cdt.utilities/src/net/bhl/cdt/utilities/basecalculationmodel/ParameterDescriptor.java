/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.basecalculationmodel;

import javax.units.Unit;

import net.bhl.cdt.utilities.units.Quantity;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter Descriptor</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getLabel <em>Label</em>}</li>
 * <li>{@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getQuantity <em>Quantity</em>}</li>
 * <li>{@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getUnit <em>Unit</em>}</li>
 * <li>{@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage#getParameterDescriptor()
 * @model
 * @generated
 */
public interface ParameterDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage#getParameterDescriptor_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getLabel
	 * <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute. The literals are from the enumeration
	 * {@link net.bhl.cdt.utilities.units.Quantity}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see net.bhl.cdt.utilities.units.Quantity
	 * @see #setQuantity(Quantity)
	 * @see net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage#getParameterDescriptor_Quantity()
	 * @model
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getQuantity
	 * <em>Quantity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see net.bhl.cdt.utilities.units.Quantity
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(Unit)
	 * @see net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage#getParameterDescriptor_Unit()
	 * @model dataType="net.bhl.cdt.utilities.units.Unit"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getUnit
	 * <em>Unit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(EClass)
	 * @see net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage#getParameterDescriptor_DataType()
	 * @model dataType="net.bhl.cdt.utilities.basecalculationmodel.EClass"
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getDataType
	 * <em>Data Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(EClass value);

} // ParameterDescriptor
