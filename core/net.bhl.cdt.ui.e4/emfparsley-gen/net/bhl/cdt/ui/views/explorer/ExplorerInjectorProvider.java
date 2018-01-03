package net.bhl.cdt.ui.views.explorer;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.bhl.cdt.ui.views.explorer.ExplorerEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class ExplorerInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new ExplorerEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(ExplorerInjectorProvider.class))));
    }
    return injector;
  }
}
