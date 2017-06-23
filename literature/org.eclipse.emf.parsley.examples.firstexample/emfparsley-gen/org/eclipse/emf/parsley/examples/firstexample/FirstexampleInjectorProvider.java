package org.eclipse.emf.parsley.examples.firstexample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.parsley.examples.firstexample.FirstexampleEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class FirstexampleInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new FirstexampleEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(FirstexampleInjectorProvider.class))));
    }
    return injector;
  }
}
