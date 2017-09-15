package net.bhl.cdt.reconsruct.parsley.e4;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Injector;

import cdtliterature.Library;
import net.bhl.cdt.literature.model.parsley.ParsleyInjectorProvider;
import net.bhl.cdt.reconstruct.cdtmodel.CdtmodelInjectorProvider;

public class CDTModelEditor {
	

	private FormDetailComposite formComposite;
	public static final java.lang.String INPUT = "ecpEditorInput";	
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	//private Library libraryPre;
	
	@PostConstruct
	public void postConstruct(Composite parent) {	

    	Injector injector = CdtmodelInjectorProvider.getInjector();
    	FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);	
		
	}
	
    @Inject
	public void setInput(@Optional @Named(INPUT) EObject modelElement, @Optional ECPProject ecpProject, MPart part) {
    	if (modelElement == null || ecpProject == null ) {
			return;
		}
    	
    	final int width = formComposite.getBounds().width;
		final int height = formComposite.getBounds().height+1;
		formComposite.init(modelElement);
		part.setLabel(""+ modelElement.eClass().getName() + " ");
		formComposite.setSize(width, height);
		
	
		Injector injector = ParsleyInjectorProvider.getInjector();

		/**
		 * The EditingDomain is needed for context menu and drag and drop.*/
		ResourceLoader resourceLoader = injector.getInstance(ResourceLoader.class);
		EditingDomain editingDomain = injector.getInstance(EditingDomain.class);
		/**
		 * load the resource*/
		Resource resources = resourceLoader.getResource(editingDomain, uri).getResource();
		//Library library = (Library) resource.getContents().get(0);
		//Resource resource = resourceLoader.getResource(editingDomain, uri).getResource();
		Library library = (Library) resources.getContents().get(0);
		Resource resource  = modelElement.eResource();
		resource.getContents().add(library);
		
		
		//resource.getContents().size()
		//ecpProject.getEditingDomain().getResourceSet().
		//if(ecpProject == null){
		//library.getArticle()	
		
		//ecpProject.getContents().add(library.getArticle().get(0));
		
		//ecpProject.getContents().size()
		
		//System.out.println("add library on the openCDT: " + resource.isModified());
		//}
    }	
	
}
