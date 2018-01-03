package net.bhl.cdt.ui.views.explorer;

import net.bhl.cdt.ui.views.explorer.config.ExplorerConfigurator;
import net.bhl.cdt.ui.views.explorer.resource.ExplorerResourceManager;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * net.bhl.cdt.editor EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class ExplorerEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public ExplorerEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return ExplorerConfigurator.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return ExplorerResourceManager.class;
  }
}
