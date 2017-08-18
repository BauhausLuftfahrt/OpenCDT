package net.bhl.cdt.literature.model.parsley.parts.MyParts;

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
import org.eclipse.emf.parsley.composite.TreeFormComposite;
import org.eclipse.emf.parsley.composite.TreeFormFactory;
import org.eclipse.emf.parsley.edit.ui.dnd.ViewerDragAndDropHelper;
import org.eclipse.emf.parsley.menus.ViewerContextMenuHelper;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import com.google.inject.Injector;

import cdtliterature.Book;
import cdtliterature.CdtliteratureFactory;
import cdtliterature.Library;
import net.bhl.cdt.literature.model.parsley.ParsleyInjectorProvider;

public class MyParts {
	
	public static final String ID = "MyPartsObject";

	private TreeFormComposite treeFormComposite;
	private Resource resource;
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	//private EObject library;
	private Library library;
	private EditingDomain editingDomain;
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		
		
		/**
		 * Guice injector*/
		Injector injector = ParsleyInjectorProvider.getInjector();

		/**
		 * The EditingDomain is needed for context menu and drag and drop.*/
		editingDomain = injector.getInstance(EditingDomain.class);
		ResourceLoader resourceLoader = injector.getInstance(ResourceLoader.class);
				
		/**
		 * load the resource*/
		resource = resourceLoader.getResource(editingDomain, uri).getResource();

		TreeFormFactory treeFormFactory = injector.getInstance(TreeFormFactory.class);
		
		/**
		 * create the tree-form composite*/
		treeFormComposite = treeFormFactory.createTreeFormComposite(parent, SWT.BORDER);
		
		/**
		 * Guice injected viewer context menu helper*/
		ViewerContextMenuHelper contextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
		/**
		 * Guice injected viewer drag and drop helper*/
		ViewerDragAndDropHelper dragAndDropHelper = injector.getInstance(ViewerDragAndDropHelper.class);
		

		/**
		 * set context menu and drag and drop*/
		contextMenuHelper.addViewerContextMenu(treeFormComposite.getViewer(), editingDomain);
		dragAndDropHelper.addDragAndDrop(treeFormComposite.getViewer(), editingDomain);
		
		/**
		 * it make the directory where the xmi file is saved.*/
		makeReferenceFolder();
		
		/**
		 * update the composite*/
		treeFormComposite.update(resource);
		
		
	}
	/**
	 * the user can add another library*/
	public void addLibrary(){
	
		library = CdtliteratureFactory.eINSTANCE.createLibrary();
		
		resource.getContents().add(library);
		
		
		//book = CdtliteratureFactory.eINSTANCE.createBook();
		
		//resource.getContents().add(book);
		
		/*System.out.println(resource.getContents().size());
		resource.getContents().remove(1);
		System.out.println("remove");*/
	}
	/**
	 * it saves the all information of created objects as the xmi file.*/  
	public void saveReference(){
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("reference", new XMIResourceFactoryImpl());

        /**
         * Obtain a new resource set*/
        ResourceSet resSet = new ResourceSetImpl();
        
      try {
           
    	  resource.save(Collections.EMPTY_MAP);
    	 
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	/**
	 * it makes the directory where the xmi file is saved.*/
	private void makeReferenceFolder(){
		
		/**
		 * the path of new directory which the xmi file is saved is assigned.*/
		File theDir = new File(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference");// + "/workspace/reference"
		
		/**
		 * if the directory does not exist, create it*/
		if (!theDir.exists()) {
		    
		    boolean result = false;

		    try{
		        theDir.mkdir();
		        result = true;
		    } 
		    catch(SecurityException se){
		
		    }        
		    if(result) {    
		        System.out.println("DIR created");  
		    }
		}
			
	}

}
