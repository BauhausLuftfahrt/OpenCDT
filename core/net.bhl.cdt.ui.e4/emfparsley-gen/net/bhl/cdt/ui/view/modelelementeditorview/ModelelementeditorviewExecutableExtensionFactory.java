package net.bhl.cdt.ui.view.modelelementeditorview;

import com.google.inject.Injector;
import net.bhl.cdt.ui.view.modelelementeditorview.ModelelementeditorviewInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class ModelelementeditorviewExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return ModelelementeditorviewInjectorProvider.getInjector();
  }
}
