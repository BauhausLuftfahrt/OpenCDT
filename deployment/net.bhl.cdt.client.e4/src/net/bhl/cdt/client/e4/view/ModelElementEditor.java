package net.bhl.cdt.client.e4.view;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import net.bhl.cdt.log.service.CDTLogService;

public class ModelElementEditor {
	private ScrolledComposite mainComposite;
	
	@PostConstruct
	public void createUI(Composite parent, Shell shell, CDTLogService log, MPart part, @Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection) {
//		mainComposite = new ScrolledComposite(parent, SWT.V_SCROLL
//				| SWT.H_SCROLL);
//		mainComposite.setBackground(shell.getDisplay().getSystemColor(SWT.COLOR_WHITE));
//		mainComposite.setBackgroundMode(SWT.INHERIT_FORCE);
//		
//		this.part = part;
//		this.modelElement = modelElement;
//		ECPSWTView render = null;
//		try {
//			// render = ECPSWTViewRenderer.INSTANCE.render(parent, modelElement);
//			final VView view = ViewProviderHelper.getView(modelElement, null);
//			final ViewModelContext vmc = ViewModelContextFactory.INSTANCE.createViewModelContext(view, modelElement,
//				new ECPReferenceServiceImpl(), new ECPDeleteServiceImpl());
//
//			render = ECPSWTViewRenderer.INSTANCE.render(parent, vmc);
//
//			parent.setExpandHorizontal(true);
//			parent.setExpandVertical(true);
//			parent.setContent(render.getSWTControl());
//			parent.setMinSize(render.getSWTControl().computeSize(SWT.DEFAULT, SWT.DEFAULT));
//		} catch (final ECPRendererException ex) {
//			Activator.getReportService().report(new RenderingFailedReport(ex));
//			// MessageDialog.openError(parent.getShell(), ex.getClass().getName(), ex.getMessage());
//			// logger.log(LogService.LOG_ERROR, ex.getMessage(), ex);
//		}
	}
}
