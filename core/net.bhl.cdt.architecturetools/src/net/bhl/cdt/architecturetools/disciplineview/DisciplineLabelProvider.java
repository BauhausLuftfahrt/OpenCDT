/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools.disciplineview;

import net.bhl.cdt.model.DisciplineView;
import net.bhl.cdt.model.ViewLink;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class DisciplineLabelProvider extends
		AdapterFactoryLabelProvider.ColorProvider {

	private final DisciplineView view;

	public DisciplineLabelProvider(TreeViewer tree, DisciplineView view) {
		super(new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE), tree);
		this.view = view;
	}

	@Override
	public Color getForeground(Object object) {
		for (ViewLink link : view.getViewLinks()) {
			if (object == link.getVirtualChild()) {
				return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
			}
		}
		return super.getForeground(object);
	}
}
