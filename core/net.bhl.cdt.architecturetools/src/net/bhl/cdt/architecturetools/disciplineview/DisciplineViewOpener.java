/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools.disciplineview;

import net.bhl.cdt.architecturetools.ConfigurationInput;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.DisciplineView;
import net.bhl.cdt.model.View;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.util.ModelElementOpener;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class DisciplineViewOpener implements ModelElementOpener {

	public DisciplineViewOpener() {
	}

	@Override
	public int canOpen(EObject obj) {
		if (obj instanceof DisciplineView) {
			return 10;
		}
		return -1;
	}

	@Override
	public void openModelElement(EObject view) {
		if (view instanceof DisciplineView) {
			Configuration config = (Configuration) ModelUtil.getParent(
					Configuration.class, view);
			if (config != null) {
				try {
					openEditor(config, (DisciplineView) view);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void openEditor(Configuration configuration, View view)
			throws PartInitException {
		PlatformUI
				.getWorkbench()
				.getActiveWorkbenchWindow()
				.getActivePage()
				.openEditor(new ConfigurationInput(configuration, view),
						DisciplineViewer.ID, true);
	}

}
