package net.bhl.cdt.ui.view;

import com.google.inject.Injector;
import net.bhl.cdt.ui.view.ViewInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class ViewExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return ViewInjectorProvider.getInjector();
  }
}
