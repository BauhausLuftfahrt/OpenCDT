package net.bhl.cdt.ui.view.modelelementeditorview.edit.ui.provider;

import com.google.inject.Inject;
import model.science.IDataEntity;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;

@SuppressWarnings("all")
public class ModelelementeditorviewTableViewerContentProvider extends TableViewerContentProvider {
  @Inject
  public ModelelementeditorviewTableViewerContentProvider(final AdapterFactory adapterFactory) {
    super(adapterFactory);
  }
  
  public Object elements(final IDataEntity c) {
    return c.getParameters();
  }
}
