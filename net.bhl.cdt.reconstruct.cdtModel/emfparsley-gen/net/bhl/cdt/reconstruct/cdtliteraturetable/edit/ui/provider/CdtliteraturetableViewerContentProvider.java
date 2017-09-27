package net.bhl.cdt.reconstruct.cdtliteraturetable.edit.ui.provider;

import cdtliterature.ALiteratureBase;
import cdtliterature.Article;
import cdtliterature.Book;
import cdtliterature.Library;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import formula.Formula;
import formula.FormulaRepository;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.parsley.edit.ui.provider.ViewerContentProvider;

@SuppressWarnings("all")
public class CdtliteraturetableViewerContentProvider extends ViewerContentProvider {
  @Inject
  public CdtliteraturetableViewerContentProvider(final AdapterFactory adapterFactory) {
    super(adapterFactory);
  }
  
  public Object elements(final Library it) {
    EList<Article> _article = it.getArticle();
    EList<Book> _book = it.getBook();
    Iterable<ALiteratureBase> _plus = Iterables.<ALiteratureBase>concat(_article, _book);
    return _plus;
  }
  
  public Object elements(final Article it) {
    String _title = it.getTitle();
    return _title;
  }
  
  public Object children(final FormulaRepository it) {
    return Formula.class;
  }
  
  public Object children(final Library it) {
    return Article.class;
  }
}
