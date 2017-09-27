package net.bhl.cdt.reconstruct.cdtliteraturetable.resource;

import java.io.IOException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.resource.ResourceManager;

@SuppressWarnings("all")
public class CdtliteraturetableResourceManager extends ResourceManager {
  @Override
  public void initialize(final Resource it) {
  }
  
  @Override
  public boolean save(final Resource it) throws IOException {
    return true;
  }
}
