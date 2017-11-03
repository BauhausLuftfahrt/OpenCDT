package net.bhl.cdt.reconsruct.parsley.e4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
import org.eclipse.emf.ecp.ui.e4.util.EPartServiceHelper;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Injector;

import cdtliterature.ALiteratureBase;
import cdtliterature.Library;
import net.bhl.cdt.literature.model.parsley.ParsleyInjectorProvider;
import net.bhl.cdt.reconstruct.cdtliteratureeditor.CdtliteratureeditorInjectorProvider;


public class CDTLibraryModelEditor {
	
	private FormDetailComposite formComposite;
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	private Resource resourceLibrary;
	private int library;
	private int literature;
	private MPartStack stack;
	private String id;
	private MPart part;
	private EPartService partService;
	
	
	@PostConstruct
	public void postConstruct(Composite parent) {	
		
		Injector injector = CdtliteratureeditorInjectorProvider.getInjector();
		FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);	
		formComposite.init(resourceLibrary.getContents().get(library).eContents().get(literature));
		
		parent.addDisposeListener(new DisposeListener() {

		    @Override
		    public void widgetDisposed(DisposeEvent e) {
		    	
		    	setUnvisible();
		    	System.out.println("Closed");

		    }
		});
		
	
	}
	 @Inject
	 public void initPart(MPart part, EModelService modelService, MApplication application, EPartService partService,@Optional ECPProject ecpProject){		 	

			Injector injectorLib = ParsleyInjectorProvider.getInjector();
			ResourceLoader resourceLoader = injectorLib.getInstance(ResourceLoader.class);
			EditingDomain editingDomain = injectorLib.getInstance(EditingDomain.class);
			//Resource resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();
			resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();
			//Library library = (Library) resourceLibrary.getContents().get(0);
			
		 this.partService = partService;
		 this.part = part;
		 Boolean partVisible = false;
		 //MPartStack stack = (MPartStack) modelService.find("org.eclipse.emf.ecp.e4.application.partstack.editor", application);
		 stack = (MPartStack) modelService.find("org.eclipse.emf.ecp.e4.application.partstack.editor", application);
		 stack.getChildren().size();
		 id = part.getElementId();
		 String[] filteredID = filteringID(id);
		 findLiterature(filteredID[0], filteredID[1]);
		
		 //Object obj = part.getObject();
		
		 
		 //this.bib = findLibrary(id);
		 //this.lit = findLiterature(id);
		 
		 for (int i = 0; i < stack.getChildren().size(); i++) {
             
			 if (stack.getChildren().get(i).isVisible()) {

                 if(id == ((MPart) stack.getChildren().get(i)).getElementId()){
                	 partVisible = true;
                	 break;
                	 
                 }
    
             }
         }
		 List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
		 if(!partVisible){
			 stacks.get(1).getChildren().add(part);}
		 else{
			 
		 }
	

		 	 
	 }
	 private String[] filteringID(String id){
		 
		 String[] array = id.split(" ", 2);
		 //array[0].toString();
		 
		 return array;
		 
	 }
	 private void findLiterature(String categoryOfLiterature, String titleOfLiterature){
		 
		 /**the number of the registered library*/
		 int sizeOfLibrary = resourceLibrary.getContents().size();
		
		 for(int i = 0; i< sizeOfLibrary; i++){
			 
			 /**the size of the literatures which are included by a library*/
			 int whole = resourceLibrary.getContents().get(i).eContents().size();
			 
			 	for(int j = 0; j< whole; j++){
			 		
			 		ALiteratureBase base = (ALiteratureBase) resourceLibrary.getContents().get(i).eContents().get(j);
			 		String titleBase = base.getTitle();
			 		String categoryBase = base.eClass().getName();
			 		
			 		if((categoryBase.equals(categoryOfLiterature)) && (titleBase.equals(titleOfLiterature)) ){
			 			
			 			this.library = i;
			 			this.literature = j;
			 			break;
			 			
			 		}
			 		
			 	}
			 }
		 
		/* System.out.println("bib2 : " + bib);
		 return bib;*/
	 }
	/* private int findLiterature(String id){
		 int size = resourceLibrary.getContents().size();
		 int lit = 0;
		 for(int i = 0; i<size; i++){
			 int whole = resourceLibrary.getContents().get(i).eContents().size();
			 
			 	for(int j = 0; j< whole; j++){
			 		ALiteratureBase base = (ALiteratureBase) resourceLibrary.getContents().get(i).eContents().get(j);
			 		String title = base.getTitle();
			 		if(title.equals(id)){
			 			lit = j;
			 			break;
			 		}
			 	}
			 }
		 
		 return lit;
	 }*/
	  
	 public void setUnvisible(){
		
		 for (int i = 0; i < stack.getChildren().size(); i++) {
             
			 if (stack.getChildren().get(i).isVisible()) {
                 
				
            	// System.out.println(" part id visiable : " + ((MPart) stack.getChildren().get(i)).getElementId());
            	 
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
					
							System.out.println("visible "+ iterator.next().isVisible());
							part.setLabel("");
							
							break;
						
						}
				}
	 }
	 
	
	
}
