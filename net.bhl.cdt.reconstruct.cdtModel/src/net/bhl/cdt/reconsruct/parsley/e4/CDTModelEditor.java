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
import formula.Formula;
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
	//private String formulaID = "";
	
	
	@PostConstruct
	public void postConstruct(Composite parent) {	

		this.parent = parent;
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
		
		final IItemLabelProvider itemLabelProvider = (IItemLabelProvider) InternalProvider.EMF_ADAPTER_FACTORY.adapt(
				modelElement, IItemLabelProvider.class);

		part.setLabel(itemLabelProvider.getText(modelElement));
		formComposite.setSize(width, height);
	
		/*if(modelElement instanceof Formula)
			formulaID = modelElement.toString();*/
		
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
	/*public String getFormulaID(){
		return formulaID;
	}*/

	
	
 }
