package org.eclipse.emf.parsley.examples.firstexample.config;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.examples.firstexample.FirstexampleSaveableTreeFormView;

@SuppressWarnings("all")
public class FirstexampleConfigurator extends Configurator {
  public URI resourceURI(final FirstexampleSaveableTreeFormView it) {
    String _property = System.getProperty("user.home");
    String _plus = (_property + "/MyLibrary.library");
    return URI.createFileURI(_plus);
  }
}
