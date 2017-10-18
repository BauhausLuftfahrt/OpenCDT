package net.bhl.cdt.reconstruct.cdtliteratureeditor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.bhl.cdt.reconstruct.cdtliteratureeditor.CdtliteratureeditorEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class CdtliteratureeditorInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new CdtliteratureeditorEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(CdtliteratureeditorInjectorProvider.class))));
    }
    return injector;
  }
}
