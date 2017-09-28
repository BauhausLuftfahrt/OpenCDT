package net.bhl.cdt.ui.view.modelstructuretreeview;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.bhl.cdt.ui.view.modelstructuretreeview.ModelstructuretreeviewEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class ModelstructuretreeviewInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new ModelstructuretreeviewEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(ModelstructuretreeviewInjectorProvider.class))));
    }
    return injector;
  }
}
