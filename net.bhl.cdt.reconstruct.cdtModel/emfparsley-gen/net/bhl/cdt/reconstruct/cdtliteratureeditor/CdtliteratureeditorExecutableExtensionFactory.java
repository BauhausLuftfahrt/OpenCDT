package net.bhl.cdt.reconstruct.cdtliteratureeditor;

import com.google.inject.Injector;
import net.bhl.cdt.reconstruct.cdtliteratureeditor.CdtliteratureeditorInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class CdtliteratureeditorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return CdtliteratureeditorInjectorProvider.getInjector();
  }
}
