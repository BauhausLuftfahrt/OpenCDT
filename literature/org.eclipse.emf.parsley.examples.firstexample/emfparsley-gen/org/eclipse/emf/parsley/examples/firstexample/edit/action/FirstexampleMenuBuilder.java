package org.eclipse.emf.parsley.examples.firstexample.edit.action;

import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.Library;
import org.eclipse.emf.examples.extlibrary.Writer;
import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.emf.parsley.edit.action.IMenuContributionSpecification;
import org.eclipse.emf.parsley.runtime.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class FirstexampleMenuBuilder extends EditingMenuBuilder {
  private final EXTLibraryFactory factory = EXTLibraryFactory.eINSTANCE;
  
  public EXTLibraryFactory getFactory() {
    return this.factory;
  }
  
  public List<IMenuContributionSpecification> emfMenuContributions(final Writer w) {
    EObject _eContainer = w.eContainer();
    final IAcceptor<Library> _function = new IAcceptor<Library>() {
      @Override
      public void accept(final Library library) {
        final Book book = FirstexampleMenuBuilder.this.factory.createBook();
        EList<Book> _books = library.getBooks();
        _books.add(book);
        book.setTitle("A new book");
        book.setAuthor(w);
      }
    };
    IMenuContributionSpecification _actionChange = this.<Library>actionChange("New book", ((Library) _eContainer), _function);
    final IAcceptor<Writer> _function_1 = new IAcceptor<Writer>() {
      @Override
      public void accept(final Writer writer) {
        EObject _eContainer = writer.eContainer();
        final Library library = ((Library) _eContainer);
        final Book book = FirstexampleMenuBuilder.this.factory.createBook();
        EList<Book> _books = library.getBooks();
        _books.add(book);
        book.setTitle("A new book");
        book.setAuthor(w);
      }
    };
    IMenuContributionSpecification _actionChange_1 = this.<Writer>actionChange("New book (variant)", w, _function_1);
    return Collections.<IMenuContributionSpecification>unmodifiableList(CollectionLiterals.<IMenuContributionSpecification>newArrayList(_actionChange, _actionChange_1));
  }
  
  public List<IMenuContributionSpecification> emfMenuContributions(final Book b) {
    EObject _eContainer = b.eContainer();
    final IAcceptor<Library> _function = new IAcceptor<Library>() {
      @Override
      public void accept(final Library library) {
        final Writer writer = FirstexampleMenuBuilder.this.factory.createWriter();
        EList<Writer> _writers = library.getWriters();
        _writers.add(writer);
        writer.setName("A new writer");
        EList<Book> _books = writer.getBooks();
        _books.add(b);
      }
    };
    IMenuContributionSpecification _actionChange = this.<Library>actionChange("New writer", ((Library) _eContainer), _function);
    EObject _eContainer_1 = b.eContainer();
    EList<Book> _books = ((Library) _eContainer_1).getBooks();
    Book _createBook = this.factory.createBook();
    final IAcceptor<Book> _function_1 = new IAcceptor<Book>() {
      @Override
      public void accept(final Book it) {
        String _title = b.getTitle();
        it.setTitle(_title);
      }
    };
    IMenuContributionSpecification _actionAdd = this.<Book>actionAdd("New book (same title)", _books, _createBook, _function_1);
    return Collections.<IMenuContributionSpecification>unmodifiableList(CollectionLiterals.<IMenuContributionSpecification>newArrayList(_actionChange, _actionAdd));
  }
}
