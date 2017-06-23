package org.eclipse.emf.parsley.examples.firstexample.edit.ui.provider;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.Employee;
import org.eclipse.emf.examples.extlibrary.Library;
import org.eclipse.emf.examples.extlibrary.Writer;
import org.eclipse.emf.parsley.edit.ui.provider.ViewerContentProvider;

@SuppressWarnings("all")
public class FirstexampleViewerContentProvider extends ViewerContentProvider {
  @Inject
  public FirstexampleViewerContentProvider(final AdapterFactory adapterFactory) {
    super(adapterFactory);
  }
  
  public Object elements(final Writer it) {
    String _name = it.getName();
    String _lastName = it.getLastName();
    String _plus = (_name + _lastName);
    String _firstName = it.getFirstName();
    return (_plus + _firstName);
  }
  
  public Object children(final Library it) {
    EList<Writer> _writers = it.getWriters();
    EList<Book> _books = it.getBooks();
    Iterable<EObject> _plus = Iterables.<EObject>concat(_writers, _books);
    EList<Employee> _employees = it.getEmployees();
    return Iterables.<EObject>concat(_plus, _employees);
  }
}
