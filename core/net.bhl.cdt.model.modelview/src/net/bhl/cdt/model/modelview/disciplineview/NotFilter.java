/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.modelview.disciplineview;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Parameter;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class NotFilter extends ViewerFilter {

	ViewerFilter filter;
	private DisciplineContenProvider contentProvider;

	public NotFilter(IContentProvider iContentProvider, ViewerFilter filter) {
		this.filter = filter;
		contentProvider = (DisciplineContenProvider) iContentProvider;
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		boolean result;

		if (element instanceof Component) {
			result = false;
			for (Object object : contentProvider.getChildren(element)) {
				if (!filter.select(viewer, element, object)) {
					result = true;
					break;
				}
			}

		} else if (element instanceof Parameter) {
			result = !filter.select(viewer, parentElement, element);
		} else {

			result = filter.select(viewer, parentElement, element);
		}
		return result;
	}
}
