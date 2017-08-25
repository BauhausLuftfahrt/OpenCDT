package net.bhl.cdt.reconsruct.parsley.e4;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Injector;

import net.bhl.cdt.reconstruct.cdtmodel.CdtmodelInjectorProvider;

public class CDTModelEditor {
	

	private FormDetailComposite formComposite;
	public static final java.lang.String INPUT = "ecpEditorInput";	
	
	@PostConstruct
	public void postConstruct(Composite parent) {	

    	Injector injector = CdtmodelInjectorProvider.getInjector();
    	FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);		
	}
	
    @Inject
	public void setInput(@Optional @Named(INPUT) EObject modelElement, @Optional ECPProject ecpProject, MPart part) {
    	if (modelElement == null || ecpProject == null) {
			return;
		}
    	
    	final int width = formComposite.getBounds().width;
		final int height = formComposite.getBounds().height+1;
		formComposite.init(modelElement);
		part.setLabel(""+ modelElement.eClass().getName() +"");
		formComposite.setSize(width, height);
	
    }	
	
}
