/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.modelview.disciplineview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.bhl.cdt.model.modelview.DisciplineView;
import net.bhl.cdt.model.modelview.ViewLink;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

public class DisciplineContenProvider extends AdapterFactoryContentProvider {

	private final DisciplineView view;

	public DisciplineContenProvider(DisciplineView view) {
		super(new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
		this.view = view;
	}

	@Override
	public boolean hasChildren(Object object) {
		return super.hasChildren(object);
	}

	@Override
	public Object[] getChildren(Object object) {
		List<Object> result = new ArrayList(Arrays.asList(super
				.getChildren(object)));
		for (ViewLink link : view.getViewLinks()) {
			if (link.getVirtualParent() == object) {
				result.add(link.getVirtualChild());
			}
		}
		return result.toArray();
	}

}
