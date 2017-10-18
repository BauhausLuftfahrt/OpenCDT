package net.bhl.cdt.reconstruct.cdtliteratureeditor;

import net.bhl.cdt.reconstruct.cdtliteratureeditor.config.CdtliteratureeditorConfigurator;
import net.bhl.cdt.reconstruct.cdtmodel.CustomFormControlFactory;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.edit.UndoableEditingStrategy;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * net.bhl.cdt.reconstruct.cdtmodel EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class CdtliteratureeditorEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public CdtliteratureeditorEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
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
  public Class<? extends Configurator> bindConfigurator() {
    return CdtliteratureeditorConfigurator.class;
  }
}
