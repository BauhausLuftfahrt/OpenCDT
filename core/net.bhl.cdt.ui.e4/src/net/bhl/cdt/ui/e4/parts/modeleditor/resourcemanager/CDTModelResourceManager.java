/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.parts.modeleditor.resourcemanager;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.resource.ResourceManager;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-07
 *
 */
public class CDTModelResourceManager extends ResourceManager {
    @Override
    public void initialize(Resource resource) {
	super.initialize(resource);
    }
}
