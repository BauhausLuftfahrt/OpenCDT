package org.eclipse.emf.parsley.examples.firstexample.ui.provider;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.Writer;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

@SuppressWarnings("all")
public class FirstexampleLabelProvider extends ViewerLabelProvider {
  @Inject
  public FirstexampleLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Book b) {
    String _title = b.getTitle();
    String _plus = ("\"" + _title);
    return (_plus + "\"");
  }
  
  public String text(final Writer w) {
    return w.getName();
  }
}
