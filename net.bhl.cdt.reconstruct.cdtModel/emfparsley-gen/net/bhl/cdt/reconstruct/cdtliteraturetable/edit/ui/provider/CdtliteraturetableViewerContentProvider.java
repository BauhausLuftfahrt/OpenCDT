package net.bhl.cdt.reconstruct.cdtliteraturetable.edit.ui.provider;

import cdtliterature.ALiteratureBase;
import cdtliterature.Article;
import cdtliterature.Book;
import cdtliterature.Conference;
import cdtliterature.Inbook;
import cdtliterature.Incollection;
import cdtliterature.Inproceedings;
import cdtliterature.Library;
import cdtliterature.Masterthesis;
import cdtliterature.Phdthesis;
import cdtliterature.Proceedings;
import cdtliterature.Techreport;
import cdtliterature.Unpublished;
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
    EList<Article> _article = it.getArticle();
    EList<Book> _book = it.getBook();
    Iterable<ALiteratureBase> _plus = Iterables.<ALiteratureBase>concat(_article, _book);
    EList<Inbook> _inbook = it.getInbook();
    Iterable<ALiteratureBase> _plus_1 = Iterables.<ALiteratureBase>concat(_plus, _inbook);
    EList<Conference> _conference = it.getConference();
    Iterable<ALiteratureBase> _plus_2 = Iterables.<ALiteratureBase>concat(_plus_1, _conference);
    EList<Incollection> _incollection = it.getIncollection();
    Iterable<ALiteratureBase> _plus_3 = Iterables.<ALiteratureBase>concat(_plus_2, _incollection);
    EList<Inproceedings> _inproceedings = it.getInproceedings();
    Iterable<ALiteratureBase> _plus_4 = Iterables.<ALiteratureBase>concat(_plus_3, _inproceedings);
    EList<Proceedings> _proceedings = it.getProceedings();
    Iterable<ALiteratureBase> _plus_5 = Iterables.<ALiteratureBase>concat(_plus_4, _proceedings);
    EList<Techreport> _techreport = it.getTechreport();
    Iterable<ALiteratureBase> _plus_6 = Iterables.<ALiteratureBase>concat(_plus_5, _techreport);
    EList<Phdthesis> _phdthesis = it.getPhdthesis();
    Iterable<ALiteratureBase> _plus_7 = Iterables.<ALiteratureBase>concat(_plus_6, _phdthesis);
    EList<Masterthesis> _masterthesis = it.getMasterthesis();
    Iterable<ALiteratureBase> _plus_8 = Iterables.<ALiteratureBase>concat(_plus_7, _masterthesis);
    EList<Unpublished> _unpublished = it.getUnpublished();
    return Iterables.<ALiteratureBase>concat(_plus_8, _unpublished);
  }
}
