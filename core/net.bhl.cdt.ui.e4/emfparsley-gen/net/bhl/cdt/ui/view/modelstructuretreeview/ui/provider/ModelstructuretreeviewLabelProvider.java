package net.bhl.cdt.ui.view.modelstructuretreeview.ui.provider;

import com.google.inject.Inject;
import model.base.ModelContainer;
import model.engineering.Component;
import model.science.IParameter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

@SuppressWarnings("all")
public class ModelstructuretreeviewLabelProvider extends ViewerLabelProvider {
  @Inject
  public ModelstructuretreeviewLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final ModelContainer it) {
    String _name = it.getName();
    return _name;
  }
  
  public String text(final model.engineering.System it) {
    String _name = it.getName();
    return _name;
  }
  
  public String text(final Component it) {
    String _name = it.getName();
    return _name;
  }
  
  public String text(final IParameter it) {
    String _name = it.getName();
    return _name;
  }
  
  public Object image(final ModelContainer it) {
    return "component_16x16.png";
  }
  
  public Object image(final model.engineering.System it) {
    return "component_16x16.png";
  }
  
  public Object image(final Component it) {
    return "component_16x16.png";
  }
}
