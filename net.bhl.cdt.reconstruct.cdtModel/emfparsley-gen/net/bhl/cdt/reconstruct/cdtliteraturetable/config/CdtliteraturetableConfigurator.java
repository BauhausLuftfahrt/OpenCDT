package net.bhl.cdt.reconstruct.cdtliteraturetable.config;

import cdtliterature.CdtliteratureFactory;
import cdtliterature.CdtliteraturePackage;
import net.bhl.cdt.reconstruct.cdtmodel.CDTLiteratureTable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.parsley.config.Configurator;

@SuppressWarnings("all")
public class CdtliteraturetableConfigurator extends Configurator {
  private final CdtliteraturePackage lib = CdtliteratureFactory.eINSTANCE.getCdtliteraturePackage();
  
  public CdtliteraturePackage getLib() {
    return this.lib;
  }
  
  public URI resourceURI(final CDTLiteratureTable it) {
    String _property = System.getProperty("user.home");
    String _plus = (_property + "/runtime-net.bhl.cdt.client.e4.product/reference");
    String _plus_1 = (_plus + 
      "/MyLibrary.library");
    return URI.createFileURI(_plus_1);
  }
}
