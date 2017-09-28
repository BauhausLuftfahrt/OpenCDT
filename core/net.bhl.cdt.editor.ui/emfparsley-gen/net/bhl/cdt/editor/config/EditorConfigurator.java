package net.bhl.cdt.editor.config;

import net.bhl.cdt.editor.EditorSaveableTableView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.config.Configurator;

@SuppressWarnings("all")
public class EditorConfigurator extends Configurator {
  public URI resourceURI(final EditorSaveableTableView it) {
    return null;
  }
  
  public EClass eClass(final EditorSaveableTableView it) {
    return null;
  }
}
