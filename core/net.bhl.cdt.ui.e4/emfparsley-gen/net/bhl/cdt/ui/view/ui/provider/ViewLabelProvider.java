package net.bhl.cdt.ui.view.ui.provider;

import com.google.inject.Inject;
import model.base.Component;
import model.base.ModelContainer;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

@SuppressWarnings("all")
public class ViewLabelProvider extends ViewerLabelProvider {
  @Inject
  public ViewLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final ModelContainer it) {
    String _name = it.getName();
    return _name;
  }
  
  public String text(final model.base.System it) {
    String _name = it.getName();
    return _name;
  }
  
  public String text(final Component it) {
    String _name = it.getName();
    return _name;
  }
}
