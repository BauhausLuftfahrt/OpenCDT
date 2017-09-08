package net.bhl.cdt.reconstruct.cdtmodel.config;

import net.bhl.cdt.reconstruct.cdtmodel.CdtmodelOnSelectionFormView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.parsley.config.Configurator;

@SuppressWarnings("all")
public class CdtmodelConfigurator extends Configurator {
  public URI resourceURI(final CdtmodelOnSelectionFormView it) {
    String _property = System.getProperty("user.home");
    String _plus = (_property + "/runtime-net.bhl.cdt.client.e4.product/reference");
    String _plus_1 = (_plus + 
      "/MyLibrary.library");
    return URI.createFileURI(_plus_1);
  }
}
