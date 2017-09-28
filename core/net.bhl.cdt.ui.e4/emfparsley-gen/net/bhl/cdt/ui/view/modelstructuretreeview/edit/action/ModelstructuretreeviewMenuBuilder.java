package net.bhl.cdt.ui.view.modelstructuretreeview.edit.action;

import java.util.Collections;
import java.util.List;
import model.base.Component;
import model.data.parameter.DistanceParameter;
import model.data.parameter.ParameterFactory;
import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.emf.parsley.edit.action.IMenuContributionSpecification;
import org.eclipse.emf.parsley.runtime.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class ModelstructuretreeviewMenuBuilder extends EditingMenuBuilder {
  public List<IMenuContributionSpecification> menuContributions(final Component it) {
    IMenuContributionSpecification _actionCopy = this.actionCopy();
    IMenuContributionSpecification _actionCut = this.actionCut();
    IMenuContributionSpecification _separator = this.separator();
    IMenuContributionSpecification _actionPaste = this.actionPaste();
    IMenuContributionSpecification _submenu = this.submenu("Edit", Collections.<IMenuContributionSpecification>unmodifiableList(CollectionLiterals.<IMenuContributionSpecification>newArrayList(_actionCopy, _actionCut, _separator, _actionPaste)));
    return Collections.<IMenuContributionSpecification>unmodifiableList(CollectionLiterals.<IMenuContributionSpecification>newArrayList(_submenu));
  }
  
  public List<IMenuContributionSpecification> emfMenuContributions(final Component c) {
    final IAcceptor<DistanceParameter> _function = (DistanceParameter param) -> {
      param.setName("Distance Parameter");
    };
    IMenuContributionSpecification _actionAdd = this.<DistanceParameter>actionAdd("Add Parameter", c.getParameters(), ParameterFactory.eINSTANCE.createDistanceParameter(), _function);
    return Collections.<IMenuContributionSpecification>unmodifiableList(CollectionLiterals.<IMenuContributionSpecification>newArrayList(_actionAdd));
  }
}
