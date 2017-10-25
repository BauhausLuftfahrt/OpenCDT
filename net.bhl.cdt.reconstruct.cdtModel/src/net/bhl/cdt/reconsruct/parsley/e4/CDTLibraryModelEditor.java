package net.bhl.cdt.reconsruct.parsley.e4;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.google.inject.Injector;

import cdtliterature.ALiteratureBase;
import cdtliterature.Library;
import net.bhl.cdt.literature.model.parsley.ParsleyInjectorProvider;
import net.bhl.cdt.reconstruct.cdtliteratureeditor.CdtliteratureeditorInjectorProvider;


public class CDTLibraryModelEditor {
	
	private FormDetailComposite formComposite;
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	//private int number;
	private Resource resourceLibrary;
	private int bib;
	private int lit;
	
	
	@PostConstruct
	public void postConstruct(Composite parent) {	
		
		Injector injector = CdtliteratureeditorInjectorProvider.getInjector();
		FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);	
    	/*Injector injector = CdtliteratureeditorInjectorProvider.getInjector();
    	FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);	
		Injector injectorLib = ParsleyInjectorProvider.getInjector();
		ResourceLoader resourceLoader = injectorLib.getInstance(ResourceLoader.class);
		EditingDomain editingDomain = injectorLib.getInstance(EditingDomain.class);
		//Resource resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();
		resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();
		//Library library = (Library) resourceLibrary.getContents().get(0);*/	
		System.out.println("bib : " + bib);
		System.out.println("lit : " + lit);
		formComposite.init(resourceLibrary.getContents().get(bib).eContents().get(lit));
		
	}
	 @Inject
	 public void initPart(MPart part, EModelService modelService, MApplication application){		 	

			Injector injectorLib = ParsleyInjectorProvider.getInjector();
			ResourceLoader resourceLoader = injectorLib.getInstance(ResourceLoader.class);
			EditingDomain editingDomain = injectorLib.getInstance(EditingDomain.class);
			//Resource resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();
			resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();
			//Library library = (Library) resourceLibrary.getContents().get(0);
			
			
		 Boolean partVisible = false;
		 MPartStack stack = (MPartStack) modelService.find(
                 "org.eclipse.emf.ecp.e4.application.partstack.editor", application);
		 stack.getChildren().size();
		 String id = part.getElementId();
		 
		 this.bib = findLibrary(id);
		 this.lit = findLiterature(id);
		 
		 for (int i = 0; i < stack.getChildren().size(); i++) {
             if (stack.getChildren().get(i).isVisible()) {
                 System.out.println(" part id: "
                         + ((MPart) stack.getChildren().get(i)).getElementId());
                 if(id == ((MPart) stack.getChildren().get(i)).getElementId()){
                	 partVisible = true;
                	 break;
                	 
                 }
    
             }
         }
		 List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
		 if(!partVisible){
			 stacks.get(1).getChildren().add(part);}
		 //part.setLabel(featureObservable.getValue().toString());
		 	 
	 } 
	 private int findLibrary(String id){
		 int size = resourceLibrary.getContents().size();
		 int bib = 0;
		 for(int i = 0; i<size; i++){
			 int whole = resourceLibrary.getContents().get(i).eContents().size();
			 
			 	for(int j = 0; j< whole; j++){
			 		ALiteratureBase base = (ALiteratureBase) resourceLibrary.getContents().get(i).eContents().get(j);
			 		String title = base.getTitle();
			 		
			 		if(title.equals(id)){
			 			bib = i;
			 			break;
			 		}
			 	}
			 }
		 
		 System.out.println("bib2 : " + bib);
		 return bib;
	 }
	 private int findLiterature(String id){
		 int size = resourceLibrary.getContents().size();
		 int lit = 0;
		 for(int i = 0; i<size; i++){
			 int whole = resourceLibrary.getContents().get(i).eContents().size();
			 
			 	for(int j = 0; j< whole; j++){
			 		ALiteratureBase base = (ALiteratureBase) resourceLibrary.getContents().get(i).eContents().get(j);
			 		String title = base.getTitle();
			 		System.out.println("id : " + id);
			 		System.out.println("title : " + title);
			 		if(title.equals(id)){
			 			lit = j;
			 			break;
			 		}
			 	}
			 }
		 
		 System.out.println("lit2 : " + lit);
		 return lit;
	 }
	 
	 
	
	
}
