package net.bhl.cdt.ui.e4;

import com.google.inject.Injector;
import net.bhl.cdt.ui.e4.E4InjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class E4ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return E4InjectorProvider.getInjector();
  }
}
