package net.bhl.cdt.reconsruct.parsley.e4;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Injector;

import net.bhl.cdt.reconstruct.cdtliteratureeditor.CdtliteratureeditorInjectorProvider;


public class CDTLibraryModelEditor extends ViewPart {

	private FormDetailComposite formComposite;
	private MPart part;
	private EObject eObject;
	//private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	//private Resource resourceLibrary;
	//private MPartStack stack;
	//private String id;
	//private EPartService partService;

	

	@PostConstruct
	public void postConstruct(Composite parent) {	
		
		Injector injector = CdtliteratureeditorInjectorProvider.getInjector();
		FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);
		
		/**The model of hyperlink will be initialized and opened by the category and title of literature.*/
		formComposite.init(eObject);

	}
	@Inject
	public void createPartControl(Composite parent){
		parent.addDisposeListener(new DisposeListener() {

		    @Override
		    public void widgetDisposed(DisposeEvent e) {
		    	part.setVisible(false);

		    }
		});
		
	}
	 @Inject
	 public void initPart(MPart mpart, EModelService modelService, MApplication application, EPartService partService, Shell shell){		 	

		this.part = mpart;
		eObject = (EObject) part.getObject();
		 
		/**All parts are retrieved*/
		List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
		stacks.get(1).getChildren().add(part);
		
		/*Injector injectorLib = ParsleyInjectorProvider.getInjector();
		ResourceLoader resourceLoader = injectorLib.getInstance(ResourceLoader.class);
		EditingDomain editingDomain = injectorLib.getInstance(EditingDomain.class);*/
		//resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();
			
		//this.partService = partService;
		//Boolean partVisible = false;
		
		/**The formula-part and on this part added tab-parts are retrieved*/
		/*stack = (MPartStack) modelService.find("org.eclipse.emf.ecp.e4.application.partstack.editor", application);
		stack.getChildren().size();*/
		
		
		//Collection<MPart> parts = partService.getParts();
	
		
	 }
	 @Override
	 public void setFocus() {
					
	 }
	 
	 /*public EObject getEObjectCDT(){
		 
		 return eObject;
	 }*/

	 /*public void setUnvisible(){
		
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
