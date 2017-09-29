package net.bhl.cdt.reconstruct.cdtliteraturetable.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;

@SuppressWarnings("all")
public class CdtliteraturetableTableFeaturesProvider extends TableFeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("cdtliterature.Library",
      "name");
    stringMap.mapTo("cdtliterature.Article",
      "title", "author");
    stringMap.mapTo("cdtliterature.Book",
      "publisher", "isbn");
  }
}
