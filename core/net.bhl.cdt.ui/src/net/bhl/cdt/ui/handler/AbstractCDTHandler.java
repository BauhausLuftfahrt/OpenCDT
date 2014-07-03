/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.handler;

import net.bhl.cdt.exceptions.CDTRuntimeException;
import net.bhl.cdt.ui.Activator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Abstract handler class for CDT handler.
 * 
 * @author Otto von Wesendonk
 * @author Michael Kagel
 */
public abstract class AbstractCDTHandler extends AbstractHandler implements
		IHandler {
	/**
	 * Returns the selected EObject on which the handler is called.
	 * 
	 * @param event
	 *            The ExecutionEvent
	 * @return The selected EObject
	 */
	protected static EObject getSelection(ExecutionEvent event) {
		EObject result = null;
		ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (!(sel instanceof IStructuredSelection)) {
			return null;
		}
		IStructuredSelection ssel = (IStructuredSelection) sel;
		if (ssel.isEmpty()) {
			return null;
		}
		Object obj = ssel.getFirstElement();
		if (obj instanceof EObject) {
			result = (EObject) obj;
		}
		return result;
	}

	/**
	 * Returns the shell of the active workbench.
	 * 
	 * @return The active workbench shell
	 */
	protected Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			return doExecute(event);
		} catch (CDTRuntimeException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					e.getMessage(), e);
			ErrorDialog.openError(getShell(), "Runtime Exception",
					"An error has occurred", status);
		}
		return null;
	}

	/**
	 * This method contains the logic and has to be implemented by classes which
	 * extend AbstractCDTHandler.
	 * 
	 * @param event
	 *            The ExecutionEvent from eclipse
	 * @return A return value if necessary
	 * @throws ExecutionException
	 *             A standard eclipse exception
	 */
	public abstract Object doExecute(ExecutionEvent event)
			throws ExecutionException;
}