/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools.powerconsumer;

import net.bhl.cdt.architecturetools.ConfigurationInput;
import net.bhl.cdt.architecturetools.model.architecturetools.PowerDemandView;
import net.bhl.cdt.calculation.handlers.AbstractCDTHandler;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.View;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.util.ModelElementOpener;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class PDEOpener extends AbstractCDTHandler implements IHandler,
		ModelElementOpener {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		try {
			EObject selection = getSelection(event);
			if (selection instanceof Configuration) {
				PowerDemandView view = null;
				for (View v : ((Configuration) selection).getViews()) {
					if (v instanceof PowerDemandView) {
						view = (PowerDemandView) v;
						break;
					}
				}

				openEditor((Configuration) selection, view);
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void openEditor(Configuration configuration, PowerDemandView view)
			throws PartInitException {
		PlatformUI
				.getWorkbench()
				.getActiveWorkbenchWindow()
				.getActivePage()
				.openEditor(new ConfigurationInput(configuration, view),
						PowerDemandEstimator.ID, true);
	}

	@Override
	public int canOpen(EObject arg0) {
		if (arg0 instanceof PowerDemandView) {
			return 10;
		}
		return -1;
	}

	@Override
	public void openModelElement(EObject view) {
		if (view instanceof PowerDemandView) {
			Configuration config = (Configuration) ModelUtil.getParent(
					Configuration.class, view);
			if (config != null) {
				try {
					openEditor(config, (PowerDemandView) view);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
