/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * 
 */
package net.bhl.cdt.utilities.ui;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * A ItemPropertyDescriptor which overrides the getChoiceOfValues method to collect only the model elements from the
 * project and not from the whole workspace like the original ItemPropertyDescriptor.
 * 
 * @author Michael Kagel
 */
public class ProjectSpacedItemPropertyDescriptor extends ItemPropertyDescriptor {

	/**
	 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#ItemPropertyDescriptor(AdapterFactory, ResourceLocator,
	 *      String, String, EStructuralFeature, boolean, boolean, boolean, Object, String, String[]) {@inheritDoc}
	 */
	// BEGIN COMPLEX CODE
	public ProjectSpacedItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
		String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine,
		boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices,
			staticImage, category, filterFlags);
	}

	// END COMPLEX CODE

	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		return ProviderHelper.getChoiceOfValues(object, parentReferences, feature);
	}
}
