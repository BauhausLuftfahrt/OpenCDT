package net.bhl.cdt.client.e4;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.e4.ui.workbench.lifecycle.PreSave;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessAdditions;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessRemovals;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StructuredSelection;
import org.osgi.framework.ServiceReference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import net.bhl.cdt.client.e4.auth.CDTAuthService;
import net.bhl.cdt.client.ui.CDTUIManager;
import net.bhl.cdt.log.service.CDTLogService;
import oida.bridge.service.IOIDABridge;

@SuppressWarnings("restriction")
public class E4LifeCycle {
	private static final String UIMGR_EXTPOINT_ID = "net.bhl.cdt.client.e4.uimanager";
	
	@PostContextCreate
	void postContextCreate(IEclipseContext workbenchContext, @Optional final IEventBroker eventBroker) {
		@SuppressWarnings("rawtypes")
		ServiceReference ref = Activator.getContext().getServiceReference(CDTLogService.class.getName());
		if (ref != null) {
			@SuppressWarnings("unchecked")
			CDTLogService logService = (CDTLogService)Activator.getContext().getService(ref);
			workbenchContext.set(CDTLogService.class, logService);
		}
		
		CDTAuthService authService = new CDTAuthService();
		authService.loginUser(System.getProperty("user.name"));
		
		workbenchContext.set(CDTAuthService.class, authService);

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
	void processRemovals(IEclipseContext workbenchContext, IExtensionRegistry registry) {
		IConfigurationElement[] config = registry.getConfigurationElementsFor(UIMGR_EXTPOINT_ID);
		try {
			for (IConfigurationElement e : config) {
				System.out.println("Evaluating extension");
				final Object o = e.createExecutableExtension("class");
				if (o instanceof CDTUIManager) {
					((CDTUIManager)o).Initialize((MApplication)workbenchContext.get(MApplication.class.getName()), (EModelService)workbenchContext.get(EModelService.class.getName()));
					((CDTUIManager)o).AdaptUI();
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
}
