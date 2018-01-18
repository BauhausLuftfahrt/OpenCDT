package net.bhl.cdt.reconstruct.cdtquantitymodel;

import net.bhl.cdt.reconstruct.cdtquantitymodel.config.CdtquantitymodelConfigurator;
import net.bhl.cdt.reconstruct.cdtquantitymodel.resource.CdtquantitymodelResourceManager;
import net.bhl.cdt.reconstruct.cdtquantitymodel.ui.provider.CdtquantitymodelFeaturesProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.edit.UndoableEditingStrategy;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;
import org.eclipse.swt.SWT;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * net.bhl.cdt.reconstruct.cdtmodel EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class CdtquantitymodelEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public CdtquantitymodelEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends IEditingStrategy> bindIEditingStrategy() {
    return UndoableEditingStrategy.class;
  }
  
  public int valueFormSashStyle() {
    return SWT.HORIZONTAL;
  }
  
  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return CdtquantitymodelFeaturesProvider.class;
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return CdtquantitymodelConfigurator.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return CdtquantitymodelResourceManager.class;
  }
}
