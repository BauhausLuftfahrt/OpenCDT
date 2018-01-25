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

import com.google.inject.Injector;

import net.bhl.cdt.reconstruct.cdtquantitymodel.CdtquantitymodelInjectorProvider;


/**
 * This class is called for creating part by click to hyperlink of quantity.
 * */
public class CDTQuantityModelViewer {
	
	private FormDetailComposite formComposite;
	private EObject eObject;
	private MPart part;
	
	@PostConstruct
	public void postConstruct(Composite parent) {	
	
		Injector injector = CdtquantitymodelInjectorProvider.getInjector();
    	FormFactory formFactory = injector.getInstance(FormFactory.class);
		formComposite = formFactory.createFormDetailComposite(parent, SWT.BORDER);	
		
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
	 public void initPart(MPart thePart, EModelService modelService, MApplication application, EPartService partService, Shell shell){		 	

			
		this.part = thePart;
		eObject = (EObject) part.getObject();
		
		/**
		 * *All parts are retrieved
		 */
		List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
		stacks.get(1).getChildren().add(part);
		
	 }
	 

}
