/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * 
 */
package net.bhl.cdt.ui.editors.arrays;

import net.bhl.cdt.ui.editors.ArrayEditor;
import net.bhl.cdt.utilities.datatypes.Array;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.util.ModelElementOpener;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * @author sami
 * 
 */
public class ArrayEditorOpener implements ModelElementOpener {

	/**
	 * 
	 */
	public ArrayEditorOpener() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.ecp.common.util.ModelElementOpener#canOpen(org.eclipse
	 * .emf.ecore.EObject)
	 */
	@Override
	public int canOpen(EObject obj) {
		if (obj instanceof Array) {
			return 1;
		}
		return DONOTOPEN;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.ecp.common.util.ModelElementOpener#openModelElement(org
	 * .eclipse.emf.ecore.EObject)
	 */
	@Override
	public void openModelElement(EObject obj) {
		Array array = (Array) obj;

		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage()
					.openEditor(new ArrayEditorInput(array), ArrayEditor.ID);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

}
