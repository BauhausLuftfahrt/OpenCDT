package net.bhl.cdt.ui.e4.config;

import net.bhl.cdt.ui.e4.FolderExplorerTreeView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.parsley.config.Configurator;

@SuppressWarnings("all")
public class E4Configurator extends Configurator {
  public URI resourceURI(final FolderExplorerTreeView it) {
    return null;
  }
}
