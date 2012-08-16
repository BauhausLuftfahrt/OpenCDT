/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.architecturetools.impl;

import java.util.Collection;

import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage;
import net.bhl.cdt.model.architecturetools.PowerDemandView;
import net.bhl.cdt.model.impl.ViewImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Power Demand View</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.architecturetools.impl.PowerDemandViewImpl#getReferencedConfigurations <em>Referenced
 * Configurations</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PowerDemandViewImpl extends ViewImpl implements PowerDemandView {
	/**
	 * The cached value of the '{@link #getReferencedConfigurations() <em>Referenced Configurations</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReferencedConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> referencedConfigurations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerDemandViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolsPackage.Literals.POWER_DEMAND_VIEW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getReferencedConfigurations() {
		if (referencedConfigurations == null) {
			referencedConfigurations = new EObjectResolvingEList<Configuration>(Configuration.class, this, ArchitecturetoolsPackage.POWER_DEMAND_VIEW__REFERENCED_CONFIGURATIONS);
		}
		return referencedConfigurations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturetoolsPackage.POWER_DEMAND_VIEW__REFERENCED_CONFIGURATIONS:
				return getReferencedConfigurations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturetoolsPackage.POWER_DEMAND_VIEW__REFERENCED_CONFIGURATIONS:
				getReferencedConfigurations().clear();
				getReferencedConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArchitecturetoolsPackage.POWER_DEMAND_VIEW__REFERENCED_CONFIGURATIONS:
				getReferencedConfigurations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArchitecturetoolsPackage.POWER_DEMAND_VIEW__REFERENCED_CONFIGURATIONS:
				return referencedConfigurations != null && !referencedConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PowerDemandViewImpl
