package net.bhl.cdt.ui.view.modelelementeditorview;

import java.util.Collections;
import java.util.List;
import net.bhl.cdt.ui.view.modelelementeditorview.edit.ui.provider.ModelelementeditorviewTableViewerContentProvider;
import net.bhl.cdt.ui.view.modelelementeditorview.ui.provider.ModelelementeditorviewFeatureCaptionProvider;
import net.bhl.cdt.ui.view.modelelementeditorview.ui.provider.ModelelementeditorviewTableFeaturesProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.edit.UndoableEditingStrategy;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;
import org.eclipse.emf.parsley.ui.provider.FeatureCaptionProvider;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * net.bhl.cdt.ui.e4 EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class ModelelementeditorviewEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public ModelelementeditorviewEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends IEditingStrategy> bindIEditingStrategy() {
    return UndoableEditingStrategy.class;
  }
  
  @Override
  public List<Integer> valueTableColumnWeights() {
    return Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(100), Integer.valueOf(50), Integer.valueOf(50)));
  }
  
  @Override
  public Class<? extends FeatureCaptionProvider> bindFeatureCaptionProvider() {
    return ModelelementeditorviewFeatureCaptionProvider.class;
  }
  
  @Override
  public Class<? extends TableFeaturesProvider> bindTableFeaturesProvider() {
    return ModelelementeditorviewTableFeaturesProvider.class;
  }
  
  @Override
  public Class<? extends TableViewerContentProvider> bindTableViewerContentProvider() {
    return ModelelementeditorviewTableViewerContentProvider.class;
  }
}
