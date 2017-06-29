package net.bhl.cdt.ui.e4;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.bhl.cdt.ui.e4.E4EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class E4InjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new E4EmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(E4InjectorProvider.class))));
    }
    return injector;
  }
}
