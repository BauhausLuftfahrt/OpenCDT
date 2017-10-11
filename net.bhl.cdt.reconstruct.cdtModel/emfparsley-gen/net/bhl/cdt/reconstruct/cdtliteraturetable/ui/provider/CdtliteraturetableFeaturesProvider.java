package net.bhl.cdt.reconstruct.cdtliteraturetable.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

@SuppressWarnings("all")
public class CdtliteraturetableFeaturesProvider extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("cdtliterature.Library",
      "name");
    stringMap.mapTo("cdtliterature.Article",
      "title", "author", "year", "path");
    stringMap.mapTo("cdtliterature.Book",
      "publisher", "isbn");
  }
}
