package net.bhl.cdt.ui.view;

import net.bhl.cdt.ui.view.config.ViewConfigurator;
import net.bhl.cdt.ui.view.edit.ui.provider.ViewViewerContentProvider;
import net.bhl.cdt.ui.view.ui.provider.ViewFeaturesProvider;
import net.bhl.cdt.ui.view.ui.provider.ViewLabelProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.edit.UndoableEditingStrategy;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * net.bhl.cdt.ui.e4 EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class ViewEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public ViewEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends IEditingStrategy> bindIEditingStrategy() {
    return UndoableEditingStrategy.class;
  }
  
  @Override
  public int valueTreeFormSashStyle() {
    return SWT.HORIZONTAL;
  }
  
  @Override
  public Class<? extends ILabelProvider> bindILabelProvider() {
    return ViewLabelProvider.class;
  }
  
  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return ViewFeaturesProvider.class;
  }
  
  @Override
  public Class<? extends IContentProvider> bindIContentProvider() {
    return ViewViewerContentProvider.class;
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return ViewConfigurator.class;
  }
}
