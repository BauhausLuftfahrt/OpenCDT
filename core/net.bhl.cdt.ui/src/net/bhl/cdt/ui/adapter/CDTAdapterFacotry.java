/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * 
 */
package net.bhl.cdt.ui.adapter;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

/**
 * @author mck
 */
public class CDTAdapterFacotry implements IAdapterFactory {

	/**
	 * Prevent loop in second call.
	 */
	private Boolean doubble = false;
	/**
	 * use the propertySheetPage as a Singleton.
	 */
	private static IPropertySheetPage propertySheetPage;

	/**
	 * Returns a adapter of type adapterType for the given object o.
	 * 
	 * @param o The object for which the adapter will be created.
	 * @param adapterType Type of the adapter which should be created
	 * @return The created adapter
	 */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object o, Class adapterType) {
		if (adapterType == IPropertySheetPage.class) {
			if (propertySheetPage == null) {
				propertySheetPage = PropertySheetPageAdapter.getPropertySheetPage();
				return propertySheetPage;
			}
			if (doubble) {
				// Needed to update the PropertyView
				// TODO: Solution without setFocus
				((PropertySheetPage) propertySheetPage).setFocus();
				((IWorkbenchPart) o).setFocus();
			}
			doubble = !doubble;
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
