/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.adapter;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

/**
 * Adapter for PropertySheePage which will be returned by the views so that
 * views provide data for the PropertyView.
 * 
 * @author Michael Kagel
 */
public final class PropertySheetPageAdapter {

	private PropertySheetPageAdapter() {
	}

	/**
	 * PropertySheetPage which contains the information for the PropertyView.
	 * 
	 * @return PropertySheetPage
	 */
	public static IPropertySheetPage getPropertySheetPage() {
		PropertySheetPage propertySheetPage = new PropertySheetPage();
		propertySheetPage
				.setPropertySourceProvider(new AdapterFactoryContentProvider(
						new ComposedAdapterFactory(
								ComposedAdapterFactory.Descriptor.Registry.INSTANCE)));
		return propertySheetPage;
	}
}
