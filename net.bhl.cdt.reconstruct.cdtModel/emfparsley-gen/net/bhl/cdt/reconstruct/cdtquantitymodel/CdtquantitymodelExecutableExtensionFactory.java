package net.bhl.cdt.reconstruct.cdtquantitymodel;

import com.google.inject.Injector;
import net.bhl.cdt.reconstruct.cdtquantitymodel.CdtquantitymodelInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class CdtquantitymodelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return CdtquantitymodelInjectorProvider.getInjector();
  }
}
