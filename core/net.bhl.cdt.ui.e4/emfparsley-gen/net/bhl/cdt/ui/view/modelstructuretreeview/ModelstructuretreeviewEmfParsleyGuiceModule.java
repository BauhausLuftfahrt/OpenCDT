package net.bhl.cdt.ui.view.modelstructuretreeview;

import net.bhl.cdt.ui.view.modelstructuretreeview.edit.action.ModelstructuretreeviewMenuBuilder;
import net.bhl.cdt.ui.view.modelstructuretreeview.edit.ui.provider.ModelstructuretreeviewViewerContentProvider;
import net.bhl.cdt.ui.view.modelstructuretreeview.ui.provider.ModelstructuretreeviewLabelProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

@SuppressWarnings("all")
public class ModelstructuretreeviewEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public ModelstructuretreeviewEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends ILabelProvider> bindILabelProvider() {
    return ModelstructuretreeviewLabelProvider.class;
  }
  
  @Override
  public Class<? extends IContentProvider> bindIContentProvider() {
    return ModelstructuretreeviewViewerContentProvider.class;
  }
  
  @Override
  public Class<? extends EditingMenuBuilder> bindEditingMenuBuilder() {
    return ModelstructuretreeviewMenuBuilder.class;
  }
}
