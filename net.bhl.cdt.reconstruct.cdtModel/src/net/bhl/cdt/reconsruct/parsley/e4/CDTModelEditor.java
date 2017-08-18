package net.bhl.cdt.reconsruct.parsley.e4;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.emf.ecp.ui.common.ECPCompositeFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.emf.parsley.edit.ui.dnd.ViewerDragAndDropHelper;
import org.eclipse.emf.parsley.menus.ViewerContextMenuHelper;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.emf.parsley.viewers.ViewerFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import com.google.inject.Injector;

import formula.FormulaFactory;
import formula.FormulaRepository;
import net.bhl.cdt.reconstruct.cdtmodel.CdtmodelInjectorProvider;

public class CDTModelEditor {
	

	private EditingDomain editingDomain;
	private Resource resource;
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyCDTmodel.CDTmodel");
	private FormDetailComposite formComposite;
	private FormulaRepository repository;
	private EObject modelElement;
	public static final java.lang.String INPUT = "ecpEditorInput";	
	private MPart part;
	
	
	
	@PostConstruct
	public void postConstruct(Composite parent) {	
    	
		
    	System.out.println("post construct");
    	Injector injector = CdtmodelInjectorProvider.getInjector();
    	editingDomain = injector.getInstance(EditingDomain.class);
    	ResourceLoader resourceLoader = injector.getInstance(ResourceLoader.class);
    	
    	FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);
		resource = resourceLoader.getResource(editingDomain, uri).getResource();
		//formComposite.init(modelElement,editingDomain);
		
		
		
		
	}
	
	public void doubleClick(DoubleClickEvent event) {
		System.out.println("double click");
	}

	
   @Inject
	public void setInput(@Optional @Named(INPUT) EObject modelElement, @Optional ECPProject ecpProject, MPart part) {
    	if (modelElement == null || ecpProject == null) {
			return;
		}
    	//this.part = part;
		//this.modelElement = modelElement;
    	
		formComposite.init(modelElement);
		//part.setVisible(false);
		//part.setVisible(true);
		part.setLabel("");
		
		//formComposite.layout(true);
		
		//formComposite.init(modelElement,editingDomain);
		//formComposite.setSize(1000,1000);
		
		formComposite.setSize(1000 , 1000);
		System.out.println("inject");
		
    
    }

    
	
	/*@PostConstruct
	public void postConstruct(Composite parent) {	
		*//**
		* Guice injector*//*
		Injector injector = CdtmodelInjectorProvider.getInjector();
		*//**
		 * The EditingDomain is needed for context menu and drag and drop.*//*
		editingDomain = injector.getInstance(EditingDomain.class);
		
		ResourceLoader resourceLoader = injector.getInstance(ResourceLoader.class);
		*//**
		 * load the resource*//*
		resource = resourceLoader.getResource(editingDomain, uri).getResource();
		FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);
	
		*//**
		 * Guice injected viewer context menu helper*//*
		ViewerContextMenuHelper contextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
		*//**
		 * Guice injected viewer drag and drop helper*//*
		ViewerDragAndDropHelper dragAndDropHelper = injector.getInstance(ViewerDragAndDropHelper.class);
		
		//eObject = injector.getInstance(EObject.class);

		*//**
		 * set context menu and drag and drop*//*
		//contextMenuHelper.addViewerContextMenu(formComposite.getViewer(), editingDomain);
		//dragAndDropHelper.addDragAndDrop(formComposite.getViewer(), editingDomain);
		repository = FormulaFactory.eINSTANCE.createFormulaRepository();
		//formComposite.init(repository);
		//formComposite.init(eObject);
		
		//ECPHandlerHelper.addModelElement(ecpProject, shell, true);
		
		System.out.println("post construct");
		
		
		
	}*/
	

	
	
	
	
}
