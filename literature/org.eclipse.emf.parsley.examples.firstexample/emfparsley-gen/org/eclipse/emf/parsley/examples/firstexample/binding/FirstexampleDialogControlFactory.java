package org.eclipse.emf.parsley.examples.firstexample.binding;

import org.eclipse.emf.examples.extlibrary.Writer;
import org.eclipse.emf.parsley.composite.DialogControlFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;

@SuppressWarnings("all")
public class FirstexampleDialogControlFactory extends DialogControlFactory {
  public Control control_Writer_lastName(final Writer it) {
    return this.createButton("set", SWT.PUSH);
  }
}
