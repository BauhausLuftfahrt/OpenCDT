package net.bhl.cdt.reconstruct.cdtliteratureeditor.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

@SuppressWarnings("all")
public class CdtliteratureeditorFeaturesProvider extends FeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("cdtliterature.Library",
      "name");
    stringMap.mapTo("cdtliterature.Article",
      "title", "author", "year", "references", "journal", "path");
    stringMap.mapTo("cdtliterature.Book",
      "title", "author", "year", "references", "publisher", "isbn", "path");
    stringMap.mapTo("cdtliterature.Inbook",
      "title", "author", "year", "references", "pages", "publisher", "path");
    stringMap.mapTo("cdtliterature.Conference",
      "title", "author", "year", "references", "booktitle", "path");
    stringMap.mapTo("cdtliterature.Incollection",
      "title", "author", "year", "references", "booktitle", "publisher", "path");
    stringMap.mapTo("cdtliterature.Inproceedings",
      "title", "author", "year", "references", "booktitle", "path");
    stringMap.mapTo("cdtliterature.Proceedings",
      "title", "author", "year", "references", "path");
    stringMap.mapTo("cdtliterature.Techreport",
      "title", "author", "year", "references", "institution", "path");
    stringMap.mapTo("cdtliterature.Phdthesis",
      "title", "author", "year", "references", "school", "path");
    stringMap.mapTo("cdtliterature.Masterthesis",
      "title", "author", "year", "references", "school", "path");
    stringMap.mapTo("cdtliterature.Unpublished",
      "title", "author", "year", "references", "note");
  }
}
