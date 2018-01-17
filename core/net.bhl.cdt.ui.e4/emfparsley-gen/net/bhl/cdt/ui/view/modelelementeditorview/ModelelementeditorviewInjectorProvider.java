package net.bhl.cdt.ui.view.modelelementeditorview;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.bhl.cdt.ui.view.modelelementeditorview.ModelelementeditorviewEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class ModelelementeditorviewInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new ModelelementeditorviewEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(ModelelementeditorviewInjectorProvider.class))));
    }
    return injector;
  }
}
