/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.log;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import net.bhl.cdt.log.service.CDTLogReaderService;
import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.log.service.internal.CDTLogReaderServiceFactory;
import net.bhl.cdt.log.service.internal.CDTLogServiceFactory;

/**
 * 
 * @author Michael Shamiyeh
 *
 */
public class Activator implements BundleActivator {

	private CDTLog log;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		log = new CDTLog();

        context.addBundleListener(log);
        context.addFrameworkListener(log);
        context.addServiceListener(log);

        // register the services with the framework
        context.registerService(CDTLogService.class.getName(), new CDTLogServiceFactory(log), null);
        context.registerService(CDTLogReaderService.class.getName(), new CDTLogReaderServiceFactory(log), null);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		log.close();
	}
}
