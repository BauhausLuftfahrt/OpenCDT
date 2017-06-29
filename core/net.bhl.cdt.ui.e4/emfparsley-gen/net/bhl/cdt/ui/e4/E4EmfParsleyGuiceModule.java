package net.bhl.cdt.ui.e4;

import net.bhl.cdt.ui.e4.config.E4Configurator;
import net.bhl.cdt.ui.e4.resource.E4ResourceManager;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * net.bhl.cdt.ui.e4 EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class E4EmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public E4EmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return E4Configurator.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return E4ResourceManager.class;
  }
}
