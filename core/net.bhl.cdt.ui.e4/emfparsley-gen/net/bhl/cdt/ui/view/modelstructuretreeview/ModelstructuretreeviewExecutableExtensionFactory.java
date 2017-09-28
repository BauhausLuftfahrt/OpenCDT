package net.bhl.cdt.ui.view.modelstructuretreeview;

import com.google.inject.Injector;
import net.bhl.cdt.ui.view.modelstructuretreeview.ModelstructuretreeviewInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class ModelstructuretreeviewExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return ModelstructuretreeviewInjectorProvider.getInjector();
  }
}
