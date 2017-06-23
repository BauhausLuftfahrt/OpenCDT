package org.eclipse.emf.parsley.examples.firstexample.ui.provider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.ui.provider.FormFeatureCaptionProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

@SuppressWarnings("all")
public class FirstexampleFormFeatureCaptionProvider extends FormFeatureCaptionProvider {
  public String text_Book_author(final EStructuralFeature it) {
    return "Written by:";
  }
  
  public Label label_Writer_name(final Composite parent, final EStructuralFeature it) {
    Label _createLabel = this.createLabel(parent, "Name");
    return _createLabel;
  }
}
