package net.bhl.cdt.ui.view.modelelementeditorview.ui.provider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.ui.provider.FeatureCaptionProvider;

@SuppressWarnings("all")
public class ModelelementeditorviewFeatureCaptionProvider extends FeatureCaptionProvider {
  public String text_IQuantifiedParameter_name(final EStructuralFeature it) {
    return "Parameter";
  }
  
  public String text_IQuantifiedParameter_value(final EStructuralFeature it) {
    return "Value";
  }
  
  public String text_IQuantifiedParameter_unit(final EStructuralFeature it) {
    return "Unit";
  }
}
