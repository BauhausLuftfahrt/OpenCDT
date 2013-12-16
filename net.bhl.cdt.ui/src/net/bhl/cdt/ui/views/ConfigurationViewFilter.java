/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.views;

import net.bhl.cdt.model.Configuration;

import org.eclipse.emf.ecore.EObject;

public interface ConfigurationViewFilter {

	boolean configureFilter(Configuration config);

	boolean filter(EObject obj);

}
