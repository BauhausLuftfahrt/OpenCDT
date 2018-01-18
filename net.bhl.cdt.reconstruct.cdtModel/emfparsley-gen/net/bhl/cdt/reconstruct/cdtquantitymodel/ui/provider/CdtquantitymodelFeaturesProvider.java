package net.bhl.cdt.reconstruct.cdtquantitymodel.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

@SuppressWarnings("all")
public class CdtquantitymodelFeaturesProvider extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("formula.FormulaRepository",
      "name");
    stringMap.mapTo("formula.Formula",
      "name", "latexString", "reference", "inputParameter", "outputParameter");
    stringMap.mapTo("formula.Quantity",
      "name", "description", "unit");
  }
}
