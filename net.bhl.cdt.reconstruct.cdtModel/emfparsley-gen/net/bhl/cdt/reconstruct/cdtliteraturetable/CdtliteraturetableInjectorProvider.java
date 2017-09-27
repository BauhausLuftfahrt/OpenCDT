package net.bhl.cdt.reconstruct.cdtliteraturetable;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.bhl.cdt.reconstruct.cdtliteraturetable.CdtliteraturetableEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class CdtliteraturetableInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new CdtliteraturetableEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(CdtliteraturetableInjectorProvider.class))));
    }
    return injector;
  }
}
