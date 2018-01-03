package net.bhl.cdt.ui.views.explorer;

import com.google.inject.Injector;
import net.bhl.cdt.ui.views.explorer.ExplorerInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class ExplorerExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return ExplorerInjectorProvider.getInjector();
  }
}
