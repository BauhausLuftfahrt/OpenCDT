package net.bhl.cdt.ui.view;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.bhl.cdt.ui.view.ViewEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class ViewInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new ViewEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(ViewInjectorProvider.class))));
    }
    return injector;
  }
}
