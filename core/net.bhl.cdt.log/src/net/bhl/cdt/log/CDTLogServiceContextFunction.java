/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.log;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.annotations.Component;

import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.log.service.internal.CDTLogServiceFactory;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-28
 *
 */
@Component(name = "CDTLogServiceContextFunction", service = IContextFunction.class, property = "service.context.key=net.bhl.cdt.log.service.CDTLogService")
public class CDTLogServiceContextFunction extends ContextFunction {
    @Override
    public Object compute(IEclipseContext context, String contextKey) {
	CDTLogService logService = new CDTLogService(Activator.getLog(), FrameworkUtil.getBundle(this.getClass()));

	// MApplication app = context.get(MApplication.class);
	// IEclipseContext appCtx = app.getContext();
	// appCtx.set(CDTLogService.class, logService);

	Bundle bundle = FrameworkUtil.getBundle(this.getClass());
	BundleContext bundleContext = bundle.getBundleContext();
	bundleContext.registerService(CDTLogService.class.getName(), new CDTLogServiceFactory(Activator.getLog()), null);

	return logService;
    }
}
