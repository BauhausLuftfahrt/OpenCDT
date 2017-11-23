package net.bhl.cdt.reconsruct.parsley.e4;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
//import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import com.google.inject.Injector;

import cdtliterature.Library;
//import net.bhl.cdt.literature.model.parsley.CustomFormControlFactory;
import net.bhl.cdt.literature.model.parsley.ParsleyInjectorProvider;
import net.bhl.cdt.reconstruct.cdtmodel.CdtmodelInjectorProvider;
import net.bhl.cdt.reconstruct.cdtmodel.CustomFormControlFactory;

/**
 * The part of formula-model using parsley is generated.*/
public class CDTModelEditor {
	
	private FormDetailComposite formComposite;
	public static final java.lang.String INPUT = "ecpEditorInput";	
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	private Composite parent;
	private String projectName;
	private String formulaName;
	private String elementType;
	private Injector injector;
	
	@PostConstruct
	public void postConstruct(Composite parent) {	

		this.parent = parent;
    	//Injector injector = CdtmodelInjectorProvider.getInjector();
		injector = CdtmodelInjectorProvider.getInjector();
    	FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);	
		
		
		//System.out.println("postconstruct");
	
	}
	
    @Inject
	public void setInput(@Optional @Named(INPUT) EObject modelElement, @Optional ECPProject ecpProject, MPart part) {
    	if (modelElement == null || ecpProject == null ) { 		
			return;
		}

    	projectName = ecpProject.getName();
    	
    	
    	final int width = formComposite.getBounds().width;
		final int height = formComposite.getBounds().height+1;
		formComposite.init(modelElement);
		
		final IItemLabelProvider itemLabelProvider = (IItemLabelProvider) InternalProvider.EMF_ADAPTER_FACTORY.adapt(
				modelElement, IItemLabelProvider.class);

		part.setLabel(itemLabelProvider.getText(modelElement));
		formComposite.setSize(width, height);
		//formulaName = filteringFormulaName(itemLabelProvider.getText(modelElement));
		//filteringFormulaName(itemLabelProvider.getText(modelElement));
		//part.setLabel(""+ modelElement.eClass().getName() + "");
		
		elementType = getElementType(itemLabelProvider.getText(modelElement));
		
		/*if(elementType.equals("Formula")){
			CustomFormControlFactory formfactory = injector.getInstance(CustomFormControlFactory.class);
			filteringFormulaName(itemLabelProvider.getText(modelElement));
			
			//formfactory.setNameForGeneratingQuantity(projectName, formulaName);
		}*/

    }
    /**
	 * Sets the focus to the parent composite.
	 */
	@Focus
	void setFocus() {
		if (parent != null) {
			parent.setFocus();
		}
	}
	/*private String filteringFormulaName(String formula){
		 
		*//**formulaName-String is divided as two parts and it returns rear string*//*
		 String[] array = formula.split(" ", 2);	 
		 return array[1];
		
		
	}*/
	private void filteringFormulaName(String formula){
		 
		/**formulaName-String is divided as two parts and it returns rear string*/
		 String[] array = formula.split(" ", 2);	 
		 formulaName = array[1];
		
		
	}
	private String getElementType(String element){
		 
		/**formulaName-String is divided as two parts and it returns rear string*/
		 String[] array = element.split(" ", 2);	 
		 return array[0];
		
	}
	
	
 }
