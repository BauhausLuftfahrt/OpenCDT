package net.bhl.cdt.ui.view.modeleditor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.bhl.cdt.ui.view.modeleditor.ModeleditorEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class ModeleditorInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new ModeleditorEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(ModeleditorInjectorProvider.class))));
    }
    return injector;
  }
}
