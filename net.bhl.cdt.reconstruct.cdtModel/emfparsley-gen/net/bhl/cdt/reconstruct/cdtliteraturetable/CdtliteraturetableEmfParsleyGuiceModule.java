package net.bhl.cdt.reconstruct.cdtliteraturetable;

import net.bhl.cdt.reconstruct.cdtliteraturetable.config.CdtliteraturetableConfigurator;
import net.bhl.cdt.reconstruct.cdtliteraturetable.edit.ui.provider.CdtliteraturetableTableViewerContentProvider;
import net.bhl.cdt.reconstruct.cdtliteraturetable.edit.ui.provider.CdtliteraturetableViewerContentProvider;
import net.bhl.cdt.reconstruct.cdtliteraturetable.resource.CdtliteraturetableResourceManager;
import net.bhl.cdt.reconstruct.cdtliteraturetable.ui.provider.CdtliteraturetableTableLabelProvider;
import net.bhl.cdt.reconstruct.cdtmodel.CustomFormControlFactory;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.edit.UndoableEditingStrategy;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * net.bhl.cdt.reconstruct.cdtmodel EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class CdtliteraturetableEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public CdtliteraturetableEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends IEditingStrategy> bindIEditingStrategy() {
    return UndoableEditingStrategy.class;
  }
  
  @Override
  public Class<? extends FormControlFactory> bindFormControlFactory() {
    return CustomFormControlFactory.class;
  }
  
  @Override
  public Class<? extends TableColumnLabelProvider> bindTableColumnLabelProvider() {
    return CdtliteraturetableTableLabelProvider.class;
  }
  
  @Override
  public Class<? extends IContentProvider> bindIContentProvider() {
    return CdtliteraturetableViewerContentProvider.class;
  }
  
  @Override
  public Class<? extends TableViewerContentProvider> bindTableViewerContentProvider() {
    return CdtliteraturetableTableViewerContentProvider.class;
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return CdtliteraturetableConfigurator.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return CdtliteraturetableResourceManager.class;
  }
}
