package net.bhl.cdt.editor;

import com.google.inject.Injector;
import net.bhl.cdt.editor.EditorInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class EditorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return EditorInjectorProvider.getInjector();
  }
}
