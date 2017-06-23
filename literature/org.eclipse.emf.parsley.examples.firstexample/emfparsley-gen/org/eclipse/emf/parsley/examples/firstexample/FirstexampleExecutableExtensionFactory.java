package org.eclipse.emf.parsley.examples.firstexample;

import com.google.inject.Injector;
import org.eclipse.emf.parsley.examples.firstexample.FirstexampleInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class FirstexampleExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return FirstexampleInjectorProvider.getInjector();
  }
}
