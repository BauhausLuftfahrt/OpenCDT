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

public class CDTLibraryRefernceModelViewer {
	
	private FormDetailComposite formComposite;
	private EObject eObject;
	//private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	//private Resource resourceLibrary;
	//private int library;
	//private int literature;
	//private MPartStack stack;
	//private String id;
	//private MPart part;
	//private EPartService partService;
	//private ALiteratureBase foundLiterature;
	
	
	@PostConstruct
	public void postConstruct(Composite parent) {	
		
		Injector injector = CdtliteratureeditorInjectorProvider.getInjector();
		FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);
		
		/**The model of hyperlink will be initialized and opened by the category and title of literature.*/
		formComposite.init(eObject);
		
	}
	 @Inject
	 public void initPart(MPart part, EModelService modelService, MApplication application, EPartService partService,@Optional ECPProject ecpProject){		 	

		 eObject = (EObject)part.getObject();
		 
		 /**All parts are retrieved*/
		 List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
		 stacks.get(1).getChildren().add(part);
		 
		/*Injector injectorLib = ParsleyInjectorProvider.getInjector();
		ResourceLoader resourceLoader = injectorLib.getInstance(ResourceLoader.class);
		EditingDomain editingDomain = injectorLib.getInstance(EditingDomain.class);
		resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();*/
			
		//this.partService = partService;
		//this.part = part;
		//Boolean partVisible = false;
		
		/**The formula-part and on this part added tab-parts are retrieved*/
		/*stack = (MPartStack) modelService.find("org.eclipse.emf.ecp.e4.application.partstack.editor", application);
		stack.getChildren().size();*/
		
		/* if(!partVisible){
			 *//**stacks.get(1) is formula-part and new part is added on this formula-part*//*
			 stacks.get(1).getChildren().add(part);
			 }
		 else{
			
		 }*/
		 	 
	 }

	/* public void setUnvisible(){
		
		 for (int i = 0; i < stack.getChildren().size(); i++) {
             
			 if (stack.getChildren().get(i).isVisible()) {
 
                 if(id == ((MPart) stack.getChildren().get(i)).getElementId()){
                	 
                	 ((MPart) stack.getChildren().get(i)).setVisible(false);
                 }
    
             }
		 }
			 
		 Collection<MPart> collPart = partService.getParts();
		 collPart.size();
			
			for( Iterator<MPart> iterator = collPart.iterator(); iterator.hasNext();){
			
				MPart part = iterator.next();
				if(part.getLabel().equals(id)){
			
					part.setLabel("");
					break;
						
				}
			}
	 }*/
	
}
