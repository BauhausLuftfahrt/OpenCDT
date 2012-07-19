/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.modelview.disciplineview;

import net.bhl.cdt.model.Component;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class OrFilter extends ViewerFilter {

	ViewerFilter filter1;
	ViewerFilter filter2;
	private DisciplineContenProvider contentProvider;

	public OrFilter(IContentProvider iContentProvider, ViewerFilter filter1, ViewerFilter filter2) {
		this.filter1 = filter1;
		this.filter2 = filter2;
		contentProvider = (DisciplineContenProvider) iContentProvider;
	}
	
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		boolean result;

		if (element instanceof Component) {
			result = false;
			for (Object object : contentProvider.getChildren(element)) {
				if (filter1.select(viewer, element, object) || filter2.select(viewer, element, object)) {
					result = true;
					break;
				}
			}

		} else {
			result = filter1.select(viewer, parentElement, element) || filter2.select(viewer, parentElement, element);
		}
		return result;
	}

}
