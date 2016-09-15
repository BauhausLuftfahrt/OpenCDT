/*******************************************************************************
 * Copyright (c) 2014 TwelveTone LLC and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Steven Spungin <steven@spungin.tv> - initial API and implementation
 *******************************************************************************/
package net.bhl.cdt.client.e4;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.e4.ui.workbench.lifecycle.PreSave;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessAdditions;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessRemovals;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.osgi.framework.ServiceReference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import net.bhl.cdt.client.ui.CDTUIManager;
import net.bhl.cdt.log.service.CDTLogService;

/**
 * This is a stub implementation containing e4 LifeCycle annotated methods.
 * <br />
 * There is a corresponding entry in <em>plugin.xml</em> (under the
 * <em>org.eclipse.core.runtime.products' extension point</em>) that references
 * this class.
 **/
@SuppressWarnings("restriction")
public class E4LifeCycle {

	@PostContextCreate
	void postContextCreate(IEclipseContext workbenchContext, final IEventBroker eventBroker) {
		@SuppressWarnings("rawtypes")
		ServiceReference ref = Activator.getContext().getServiceReference(CDTLogService.class.getName());
		if (ref != null) {
			@SuppressWarnings("unchecked")
			CDTLogService logService = (CDTLogService)Activator.getContext().getService(ref);
			workbenchContext.set(CDTLogService.class, logService);
		}

		// register for startup completed event and close the shell
		eventBroker.subscribe(UIEvents.UILifeCycle.APP_STARTUP_COMPLETE, new EventHandler() {
			@Override
			public void handleEvent(Event event) {
				workbenchContext.set(CDTUIManager.class, new CDTUIManager((MApplication)workbenchContext.get(MApplication.class.getName()), (EModelService)workbenchContext.get(EModelService.class.getName())));
			}
		});
	}

	@PreSave
	void preSave(IEclipseContext workbenchContext) {
	}

	@ProcessAdditions
	void processAdditions(IEclipseContext workbenchContext) {
	}

	@ProcessRemovals
	void processRemovals(IEclipseContext workbenchContext) {
	}
}
