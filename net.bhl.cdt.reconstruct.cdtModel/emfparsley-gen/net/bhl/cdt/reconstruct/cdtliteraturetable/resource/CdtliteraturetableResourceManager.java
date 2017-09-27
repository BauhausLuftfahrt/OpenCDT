package net.bhl.cdt.reconstruct.cdtliteraturetable.resource;

import cdtliterature.CdtliteratureFactory;
import cdtliterature.Library;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.resource.ResourceManager;

@SuppressWarnings("all")
public class CdtliteraturetableResourceManager extends ResourceManager {
  @Override
  public void initialize(final Resource it) {
    EList<EObject> _contents = it.getContents();
    Library _createLibrary = CdtliteratureFactory.eINSTANCE.createLibrary();
    _contents.add(_createLibrary);
  }
  
  @Override
  public boolean save(final Resource it) throws IOException {
    return true;
  }
}
