package net.bhl.cdt.editor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.bhl.cdt.editor.EditorEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class EditorInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new EditorEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(EditorInjectorProvider.class))));
    }
    return injector;
  }
}
