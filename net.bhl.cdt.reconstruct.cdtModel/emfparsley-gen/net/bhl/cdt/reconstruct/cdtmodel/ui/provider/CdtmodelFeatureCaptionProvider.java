package net.bhl.cdt.reconstruct.cdtmodel.ui.provider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.ui.provider.FeatureCaptionProvider;

@SuppressWarnings("all")
public class CdtmodelFeatureCaptionProvider extends FeatureCaptionProvider {
  public String text_Formula_reference(final EStructuralFeature it) {
    return "Reference";
  }
}
