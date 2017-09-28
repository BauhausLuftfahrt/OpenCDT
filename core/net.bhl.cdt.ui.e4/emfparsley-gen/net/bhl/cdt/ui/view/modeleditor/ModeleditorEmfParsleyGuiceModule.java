package net.bhl.cdt.ui.view.modeleditor;

import java.util.Collections;
import java.util.List;
import net.bhl.cdt.ui.view.modeleditor.edit.ui.provider.ModeleditorTableViewerContentProvider;
import net.bhl.cdt.ui.view.modeleditor.ui.provider.ModeleditorTableFeaturesProvider;
import net.bhl.cdt.ui.view.modeleditor.ui.provider.ModeleditorTableLabelProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.edit.UndoableEditingStrategy;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;
import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * net.bhl.cdt.ui.e4 EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class ModeleditorEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public ModeleditorEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends IEditingStrategy> bindIEditingStrategy() {
    return UndoableEditingStrategy.class;
  }
  
  @Override
  public List<Integer> valueTableColumnWeights() {
    return Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(100), Integer.valueOf(200)));
  }
  
  @Override
  public Class<? extends TableColumnLabelProvider> bindTableColumnLabelProvider() {
    return ModeleditorTableLabelProvider.class;
  }
  
  @Override
  public Class<? extends TableFeaturesProvider> bindTableFeaturesProvider() {
    return ModeleditorTableFeaturesProvider.class;
  }
  
  @Override
  public Class<? extends TableViewerContentProvider> bindTableViewerContentProvider() {
    return ModeleditorTableViewerContentProvider.class;
  }
}
