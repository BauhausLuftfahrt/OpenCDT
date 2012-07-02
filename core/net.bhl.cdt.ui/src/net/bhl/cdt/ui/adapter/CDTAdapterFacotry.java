/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * 
 */
package net.bhl.cdt.ui.adapter;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.views.properties.IPropertySheetPage;

/**
 * @author mck
 * 
 */
public class CDTAdapterFacotry implements IAdapterFactory {

	/**
	 * Returns a adapter of type adapterType for the given object o.
	 * 
	 * @param o
	 *            The object for which the adapter will be created.
	 * @param adapterType
	 *            Type of the adapter which should be created
	 * @return The created adapter
	 */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object o, Class adapterType) {
		if (adapterType.equals(IPropertySheetPage.class)) {
			return PropertySheetPageAdapter.getPropertySheetPage();
		}

		return null;
	}

	/**
	 * Array of adapters which this factory creates.
	 * 
	 * @return The adapter array
	 */
	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[] { IPropertySheetPage.class };
	}

}
