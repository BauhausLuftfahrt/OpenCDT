package partParsley;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.parsley.composite.TreeFormComposite;
import org.eclipse.emf.parsley.composite.TreeFormFactory;
import org.eclipse.emf.parsley.edit.ui.dnd.ViewerDragAndDropHelper;
import org.eclipse.emf.parsley.examples.firstexample.FirstexampleInjectorProvider;
import org.eclipse.emf.parsley.menus.ViewerContextMenuHelper;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.google.inject.Injector;


public class MyParts {
	
	
	public static final String ID = "MyPartsObject";

	private TreeFormComposite treeFormComposite;
	private Resource resource;
	//private URI uri = URI.createFileURI(System.getProperty("user.home") + "/workspace/reference" + "/MyLibrary.library");
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/workspace/reference" + "/MyLibrary.xmi");
	private boolean post = true;
	private EObject library;
	private Composite composite;	
	private EditingDomain editingDomain;

	
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		
		this.composite = parent;
		
		// Guice injector
		Injector injector = FirstexampleInjectorProvider.getInjector();

		// The EditingDomain is needed for context menu and drag and drop
		editingDomain = injector.getInstance(EditingDomain.class);

		ResourceLoader resourceLoader = injector.getInstance(ResourceLoader.class);
		
		
		// load the resource
		resource = resourceLoader.getResource(editingDomain, uri).getResource();
		
		//resource.getContents().add(EXTLibraryFactory.eINSTANCE.createLibrary());

		TreeFormFactory treeFormFactory = injector.getInstance(TreeFormFactory.class);
		// create the tree-form composite

		treeFormComposite = treeFormFactory.createTreeFormComposite(parent, SWT.BORDER);
		
		// Guice injected viewer context menu helper
		ViewerContextMenuHelper contextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
		// Guice injected viewer drag and drop helper
		ViewerDragAndDropHelper dragAndDropHelper = injector.getInstance(ViewerDragAndDropHelper.class);
		

		// set context menu and drag and drop
		contextMenuHelper.addViewerContextMenu(treeFormComposite.getViewer(), editingDomain);
		dragAndDropHelper.addDragAndDrop(treeFormComposite.getViewer(), editingDomain);
		
		
		
		System.out.println("postConstruct");
		
		
		makeReferenceFolder();
		
		addButton();

		
		// update the composite
		treeFormComposite.update(resource);
		
		
	}
	
	//@Execute
	public void addLibrary(){
		
		System.out.println("add library");
		
		library = EXTLibraryFactory.eINSTANCE.createLibrary();
		//resource.getContents().add(EXTLibraryFactory.eINSTANCE.createLibrary());
		
		/*Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("reference", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        
        Resource resource = resSet.createResource(
        		URI.createURI("reference/MyLibrary.library"));
		*/
		
		
		
		resource.getContents().add(library);
		
		/* try {
	            resource.save(Collections.EMPTY_MAP);
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        */
	        System.out.println("save reference");
		
		
	}
	
	public void openReference(){
		
		System.out.println("open reference");
	}
	private void makeReferenceFolder(){
		
		//IWorkspace workspace = ResourcesPlugin.getWorkspace();
		
		
		File theDir = new File(System.getProperty("user.home") + "/workspace/reference");
		//File theDir = new File( ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/reference");
		
		
		// if the directory does not exist, create it
		if (!theDir.exists()) {
		    System.out.println("creating directory: " + theDir.getName());
		    boolean result = false;

		    try{
		        theDir.mkdir();
		        result = true;
		    } 
		    catch(SecurityException se){
		        //handle it
		    }        
		    if(result) {    
		        System.out.println("DIR created");  
		    }
		}
			
	}
	public void saveReference(){
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("reference", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        
        //Resource res = resSet.createResource(URI.createURI("reference/MyLibrary.library"));
        
       // Resource res = resSet.createResource(URI.createURI(System.getProperty("user.home") +"/workspace/reference" + "/MyLibrary.library"));
        

       // resource.getContents().add(library);
        
        
       try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("save reference");

	}
	
	
	public void  addButton(){
		
		Control [] control = this.composite.getChildren();
		 
		
		System.out.println("Control : " + control[0].toString());
				System.out.println("editingDomain : " + editingDomain.getChildren(treeFormComposite));
			
		//Button button = new Button(control[0], SWT.PUSH);
		
		//System.out.println("nameID : " );
			
			
	}
	

}
