package net.bhl.cdt.reconstruct.cdtmodel;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

public class GeneratingQuantity {

	public static final java.lang.String INPUT = "ecpEditorInput";	
	private ECPProject ecpProject;
	
	@Inject
	public void setInput(@Optional @Named(INPUT) EObject modelElement, @Optional ECPProject ecpProject, MPart part) {
    	if (modelElement == null || ecpProject == null ) { 		
			return;
		}
    	
    	this.ecpProject = ecpProject;
    	/*
    	final int width = formComposite.getBounds().width;
		final int height = formComposite.getBounds().height+1;
		formComposite.init(modelElement);
		
		final IItemLabelProvider itemLabelProvider = (IItemLabelProvider) InternalProvider.EMF_ADAPTER_FACTORY.adapt(
				modelElement, IItemLabelProvider.class);

		part.setLabel(itemLabelProvider.getText(modelElement));
		//part.setLabel(""+ modelElement.eClass().getName() + "");
		
		formComposite.setSize(width, height);*/
    	//System.out.println("generating!!");
	
	
    }
	@Inject
	public void generate(@Optional ECPProject ecpProject){
		
		String name = ecpProject.toString();
		System.out.println("generating!! " + name);
		
	}
	
	
}
