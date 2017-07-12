package net.bhl.cdt.ui.view.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

@SuppressWarnings("all")
public class ViewFeaturesProvider extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("model.base.ModelContainer",
      "name");
    stringMap.mapTo("model.base.System",
      "name", "parameters");
    stringMap.mapTo("model.base.Component",
      "name", "parameters", "id");
  }
}
