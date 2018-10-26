package net.bhl.cdt.ui.views.modeleditor;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

import com.google.inject.Inject;

import model.base.ModelContainer;
import model.engineering.Component;
import model.science.IParameter;
import net.bhl.oida.bridge.service.OIDABridge;

public class ModelStructureEditorLabelProvider extends ViewerLabelProvider {

    private OIDABridge oidaBridge;
    public void setOIDABridge(OIDABridge bridge) {
	oidaBridge = bridge;
    }
    
    @Inject
    public ModelStructureEditorLabelProvider(AdapterFactoryLabelProvider delegate) {
	super(delegate);
    }

    public String text(ModelContainer container) {
	return container.getName();
    }
    
    public String text(IParameter parameter) {
	return parameter.getName();
    }
    
    public String text(Component comp) {
	return comp.getName();
    }
    
    public String text(model.engineering.System system) {
	return system.getName();
    }

    public String image(Component comp) {
	if (oidaBridge != null) {
	    try {
	    if (oidaBridge.getMapping(oidaBridge.getModelChangeHandler(EcoreUtil.getRootContainer(comp)).getOntologyIndividualForModelElement(comp).get()).isPresent())
		return "component_mapped_16x16.png";
	    else
		return "component_16x16.png";
	    } catch(Exception e) {
		return "component_16x16.png";
	    }
	}
	else
	    return "component_16x16.png";
    }
    
    public String image(model.engineering.System system) {
	return "component_16x16.png";
    }
}
