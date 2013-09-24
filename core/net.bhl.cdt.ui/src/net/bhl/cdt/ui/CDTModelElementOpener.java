/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.ui.util.ECPModelElementOpener;
/**
 * ModelOpener which does nothing so that the MEEditor does not open.
 * 
 * @author Michael Kagel
 */
public class CDTModelElementOpener implements ECPModelElementOpener{

	public int canOpen(EObject modelElement) {
		return -1;
	}

	public void openModelElement(EObject modelElement) {
		// do nothing

	}

	@Override
	public void openModelElement(Object element, ECPProject ecpProject) {
		// TODO Auto-generated method stub
		// do nothing
	}

}
