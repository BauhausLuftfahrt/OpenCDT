/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter Mapping</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.calculation.ParameterMapping#getInputValues <em>Input Values</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.ParameterMapping#getOutputValues <em>Output Values</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.ParameterMapping#getInputParameters <em>Input Parameters</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.ParameterMapping#getOutputParameters <em>Output Parameters</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.calculation.CalculationPackage#getParameterMapping()
 * @model
 * @generated
 */
public interface ParameterMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Mappables</b></em>' map. The key is of type
	 * {@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor}, and the value is of type
	 * {@link net.bhl.cdt.model.MappableComponentInterface}, <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Mappables</em>' map isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Input Mappables</em>' map.
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getParameterMapping_InputMappables()
	 * @model mapType=
	 *        "net.bhl.cdt.model.calculation.ParameterDescriptorToMappableComponentInterfaceMap<net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor, net.bhl.cdt.model.MappableComponentInterface>"
	 * @generated
	 */
	EMap<ParameterDescriptor, MappableComponentInterface> getInputMappables();

	/**
	 * Returns the value of the '<em><b>Output Mappables</b></em>' map. The key is of type
	 * {@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor}, and the value is of type
	 * {@link net.bhl.cdt.model.MappableComponentInterface}, <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Mappables</em>' map isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Mappables</em>' map.
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getParameterMapping_OutputMappables()
	 * @model mapType=
	 *        "net.bhl.cdt.model.calculation.ParameterDescriptorToMappableComponentInterfaceMap<net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor, net.bhl.cdt.model.MappableComponentInterface>"
	 * @generated
	 */
	EMap<ParameterDescriptor, MappableComponentInterface> getOutputMappables();

} // ParameterMapping
