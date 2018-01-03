package net.bhl.cdt.ui.views.explorer.config;

import net.bhl.cdt.ui.views.explorer.ExplorerSaveableTableView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.config.Configurator;

@SuppressWarnings("all")
public class ExplorerConfigurator extends Configurator {
  public URI resourceURI(final ExplorerSaveableTableView it) {
    return null;
  }
  
  public EClass eClass(final ExplorerSaveableTableView it) {
    return null;
  }
}
