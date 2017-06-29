package net.bhl.cdt.core.auth;

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
@Component(name = "CDTAuthServiceContextFunction", service = IContextFunction.class, property = "service.context.key=net.bhl.cdt.core.auth.CDTAuthService")
public class CDTAuthServiceContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		CDTAuthService authService = ContextInjectionFactory.make(CDTAuthService.class, context);
		authService.initialize();

		MApplication app = context.get(MApplication.class);
		IEclipseContext appCtx = app.getContext();
		appCtx.set(CDTAuthService.class, authService);

		return authService;
	}
}