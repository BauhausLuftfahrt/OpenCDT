/*package org.eclipse.emf.parsley.firstexample.application.parts;



import javax.annotation.PostConstruct;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
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

import com.google.inject.Injector;



public class MyEclipse4Part {

	// the EMF Parley composite for showing a tree and a detail form
	private TreeFormComposite treeFormComposite;
	// the EMF Resource
	private Resource resource;
	// URI for EMF Resource
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/MyLibrary.library");

	@PostConstruct
	public void postConstruct(Composite parent) {
		
		

		
		// Guice injector
		Injector injector = FirstexampleInjectorProvider.getInjector();

		// The EditingDomain is needed for context menu and drag and drop
		EditingDomain editingDomain = injector.getInstance(EditingDomain.class);

		ResourceLoader resourceLoader = injector.getInstance(ResourceLoader.class);
		// load the resource
		resource = resourceLoader.getResource(editingDomain, uri).getResource();
		
		resource.getContents().add(EXTLibraryFactory.eINSTANCE.createLibrary());

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

		// update the composite
		treeFormComposite.update(resource);
	}


}
*/