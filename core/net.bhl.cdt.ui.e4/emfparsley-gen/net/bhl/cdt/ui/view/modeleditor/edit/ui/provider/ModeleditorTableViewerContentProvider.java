package net.bhl.cdt.ui.view.modeleditor.edit.ui.provider;

import com.google.inject.Inject;
import model.base.Component;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;

@SuppressWarnings("all")
public class ModeleditorTableViewerContentProvider extends TableViewerContentProvider {
  @Inject
  public ModeleditorTableViewerContentProvider(final AdapterFactory adapterFactory) {
    super(adapterFactory);
  }
  
  public Object elements(final Component c) {
    return c.getParameters();
  }
}
