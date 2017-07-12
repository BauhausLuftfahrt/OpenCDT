package net.bhl.cdt.ui.view.modeleditor;

import com.google.inject.Injector;
import net.bhl.cdt.ui.view.modeleditor.ModeleditorInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class ModeleditorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return ModeleditorInjectorProvider.getInjector();
  }
}
