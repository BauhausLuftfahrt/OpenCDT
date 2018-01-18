package net.bhl.cdt.reconstruct.cdtquantitymodel;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.bhl.cdt.reconstruct.cdtquantitymodel.CdtquantitymodelEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class CdtquantitymodelInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new CdtquantitymodelEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(CdtquantitymodelInjectorProvider.class))));
    }
    return injector;
  }
}
