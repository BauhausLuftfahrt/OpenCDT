/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import net.bhl.cdt.model.provider.MetaModelInstancesProvider;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-14
 *
 */
public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
	MetaModelInstancesProvider.getInstance();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
	// TODO Auto-generated method stub
    }
}