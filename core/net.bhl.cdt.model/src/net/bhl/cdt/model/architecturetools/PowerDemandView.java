/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.architecturetools;

import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.View;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Power Demand View</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.architecturetools.PowerDemandView#getReferencedConfigurations <em>Referenced
 * Configurations</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getPowerDemandView()
 * @model
 * @generated
 */
public interface PowerDemandView extends View {
	/**
	 * Returns the value of the '<em><b>Referenced Configurations</b></em>' reference list. The list contents are of
	 * type {@link net.bhl.cdt.model.Configuration}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Configurations</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Referenced Configurations</em>' reference list.
	 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getPowerDemandView_ReferencedConfigurations()
	 * @model
	 * @generated
	 */
	EList<Configuration> getReferencedConfigurations();

} // PowerDemandView
