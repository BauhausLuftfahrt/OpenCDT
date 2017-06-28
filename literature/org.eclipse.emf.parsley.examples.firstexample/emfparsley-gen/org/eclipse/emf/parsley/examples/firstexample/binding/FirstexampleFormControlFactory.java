package org.eclipse.emf.parsley.examples.firstexample.binding;

import java.util.List;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.Writer;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.examples.firstexample.AddButton;
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class FirstexampleFormControlFactory extends FormControlFactory {
  public Control control_Writer_books(final Writer it) {
    EList<Book> _books = it.getBooks();
    final Function1<Book, String> _function = new Function1<Book, String>() {
      @Override
      public String apply(final Book it) {
        return it.getTitle();
      }
    };
    List<String> _map = ListExtensions.<Book, String>map(_books, _function);
    String _join = IterableExtensions.join(_map, ", ");
    Label _createLabel = this.createLabel(_join);
    return _createLabel;
  }
  
  public Control control_Writer_firstName(final Writer it) {
    FormToolkit _toolkit = this.getToolkit();
    Composite _parent = this.getParent();
    String _name = it.getName();
    return _toolkit.createHyperlink(_parent, _name, SWT.NONE);
  }
  
  public Control control_Writer_lastName(final Writer it) {
    Composite _xblockexpression = null;
    {
      FormToolkit _toolkit = this.getToolkit();
      Composite _parent = this.getParent();
      final Composite v = _toolkit.createComposite(_parent, SWT.NONE);
      GridLayout _gridLayout = new GridLayout(3, false);
      v.setLayout(_gridLayout);
      FormToolkit _toolkit_1 = this.getToolkit();
      String _name = it.getName();
      final Text t = _toolkit_1.createText(v, _name, SWT.SINGLE);
      FormToolkit _toolkit_2 = this.getToolkit();
      final Button b = _toolkit_2.createButton(v, "open", SWT.PUSH);
      FormToolkit _toolkit_3 = this.getToolkit();
      final Button s = _toolkit_3.createButton(v, "set", SWT.PUSH);
      String _name_1 = it.getName();
      final AddButton k = new AddButton(b, s, _name_1, t);
      FormToolkit _toolkit_4 = this.getToolkit();
      Composite _parent_1 = this.getParent();
      _xblockexpression = _toolkit_4.createComposite(_parent_1, SWT.NONE);
    }
    return _xblockexpression;
  }
  
  public Control control_Employee_manager(final IObservableValue observableValue, final EStructuralFeature feature) {
    Control control = createControl_Employee_manager();
    bindValue(
    	feature,
    	createTarget_Employee_manager(control),
    	observableValue);
    return control;
  }
  
  protected Control createControl_Employee_manager() {
    return this.createText("", SWT.TOGGLE);
  }
  
  protected IObservableValue createTarget_Employee_manager(final Control it) {
    ISWTObservableValue _observeText = DatabindingUtil.observeText(it, SWT.Modify);
    return _observeText;
  }
}
