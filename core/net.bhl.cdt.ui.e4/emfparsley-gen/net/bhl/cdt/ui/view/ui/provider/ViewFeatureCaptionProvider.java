package net.bhl.cdt.ui.view.ui.provider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.ui.provider.FeatureCaptionProvider;

@SuppressWarnings("all")
public class ViewFeatureCaptionProvider extends FeatureCaptionProvider {
  public String text_Component_parameters(final EStructuralFeature it) {
    return "Parameters:";
  }
}
