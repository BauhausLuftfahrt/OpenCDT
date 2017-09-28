package net.bhl.cdt.editor;

import net.bhl.cdt.editor.config.EditorConfigurator;
import net.bhl.cdt.editor.resource.EditorResourceManager;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * net.bhl.cdt.editor EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class EditorEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public EditorEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return EditorConfigurator.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return EditorResourceManager.class;
  }
}
