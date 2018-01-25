package net.bhl.cdt.reconsruct.parsley.e4;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Injector;

import net.bhl.cdt.reconstruct.cdtliteratureeditor.CdtliteratureeditorInjectorProvider;

/**
 * This class is called for creating dialog by click to set-button of reference-composite.
 * */
public class CDTLibraryRefernceModelViewer {
	
	private FormDetailComposite formComposite;
	private EObject eObject;
	
	@PostConstruct
	public void postConstruct(Composite parent) {	
		
		Injector injector = CdtliteratureeditorInjectorProvider.getInjector();
		FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);
		
		/**
		 * The model of hyperlink will be initialized and showed on the dialog-window.
		 * */
		formComposite.init(eObject);
		
	}
	 @Inject
	 public void initPart(MPart part, EModelService modelService, MApplication application, EPartService partService,@Optional ECPProject ecpProject){		 	

		 eObject = (EObject)part.getObject();
		 
		 /**
		  * All parts are retrieved.
		  * */
		 List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
		 stacks.get(1).getChildren().add(part);
		 	 
	 }
	
}
