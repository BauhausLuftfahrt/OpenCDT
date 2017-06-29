package net.bhl.cdt.core.pref;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.osgi.service.component.annotations.Component;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-29
 *
 */
@Component(name = "CDTPreferencesServiceContextFunction", service = IContextFunction.class, property = "service.context.key=net.bhl.cdt.core.pref.CDTPreferencesService")
public class CDTPreferencesServiceContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		CDTPreferencesService prevService = ContextInjectionFactory.make(CDTPreferencesService.class, context);
		prevService.initialize();

		MApplication app = context.get(MApplication.class);
		IEclipseContext appCtx = app.getContext();
		appCtx.set(CDTPreferencesService.class, prevService);

		return prevService;
	}
}
