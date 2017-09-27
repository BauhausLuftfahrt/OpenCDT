package net.bhl.cdt.reconstruct.cdtliteraturetable;

import com.google.inject.Injector;
import net.bhl.cdt.reconstruct.cdtliteraturetable.CdtliteraturetableInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class CdtliteraturetableExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return CdtliteraturetableInjectorProvider.getInjector();
  }
}
