package org.eclipse.emf.parsley.examples.firstexample.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

@SuppressWarnings("all")
public class FirstexampleFeaturesProvider extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("org.eclipse.emf.examples.extlibrary.Library",
      "name");
    stringMap.mapTo("org.eclipse.emf.examples.extlibrary.Writer",
      "name", "address", "books", "path", "firstName", "lastName");
    stringMap.mapTo("org.eclipse.emf.examples.extlibrary.Book",
      "author", "title", "category");
    stringMap.mapTo("org.eclipse.emf.examples.extlibrary.Employee",
      "manager");
  }
}
