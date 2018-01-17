package net.bhl.cdt.ui.view.modelelementeditorview.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;

@SuppressWarnings("all")
public class ModelelementeditorviewTableFeaturesProvider extends TableFeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("model.science.IQuantifiedParameter",
      "name", "value", "unit");
  }
}
