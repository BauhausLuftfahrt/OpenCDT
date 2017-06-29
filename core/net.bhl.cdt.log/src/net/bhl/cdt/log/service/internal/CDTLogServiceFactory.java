/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.log.service.internal;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;

import net.bhl.cdt.log.CDTLog;
import net.bhl.cdt.log.service.CDTLogService;

/**
 * 
 * @author Michael Shamiyeh
 *
 */
public final class CDTLogServiceFactory  implements ServiceFactory<Object> {

	private final CDTLog log;
	
	public CDTLogServiceFactory(final CDTLog log) {
		this.log = log;
	}
	
	@Override
	public Object getService(Bundle bundle, ServiceRegistration<Object> registration) {
		return new CDTLogService(log, bundle);
	}

	@Override
	public void ungetService(Bundle bundle, ServiceRegistration<Object> registration, Object service) {
	}
}
