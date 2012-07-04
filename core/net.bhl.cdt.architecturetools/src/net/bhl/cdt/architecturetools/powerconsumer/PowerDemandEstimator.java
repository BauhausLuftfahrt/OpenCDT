/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools.powerconsumer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import net.bhl.cdt.architecturetools.ConfigurationInput;
import net.bhl.cdt.architecturetools.comparator.TableComparator;
import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsFactory;
import net.bhl.cdt.model.architecturetools.PowerConsumer;
import net.bhl.cdt.model.architecturetools.PowerDemandView;
import net.bhl.cdt.model.architecturetools.exceptions.NoValueFoundException;
import net.bhl.cdt.model.util.ComponentInterfaceUtil;
import net.bhl.cdt.utilities.commands.CDTCommand;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

public class PowerDemandEstimator extends EditorPart implements
		IEditorMatchingStrategy {

	public static final String ID = "net.bhl.cdt.architecturetools.powerdemandestimator"; //$NON-NLS-1$

	private TableComparator<PowerConsumer> tableComparator;

	private Configuration targetConfig;

	private PowerDemandView view;

	public PowerDemandEstimator() {
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		if (input instanceof ConfigurationInput) {
			this.targetConfig = ((ConfigurationInput) input).getConfiguration();
			this.view = (PowerDemandView) ((ConfigurationInput) input)
					.getView();
			if (view == null) {
				view = ArchitecturetoolsFactory.eINSTANCE
						.createPowerDemandView();
				view.setName("(generated)");
				new CDTCommand() {
					protected void doRun() {
						targetConfig.getViews().add(view);
					}
				}.run();
			}
			setPartName("Estimator: " + view.getName());
		}
		setInput(input);
		setSite(site);
	}

	@Override
	public void createPartControl(Composite parent) {
		tableComparator = new TableComparator<PowerConsumer>(parent, SWT.NONE,
				targetConfig, PowerConsumer.class) {
			@Override
			protected String getCellValue(Component c) {
				PowerConsumer consumer = c
						.getInterfaceByClass(PowerConsumer.class);
				if (consumer != null) {
					try {
						Value value = consumer.getPowerConsumption();
						return value.getValue() + " " + value.getUnit();
					} catch (NoValueFoundException e) {
					}
				}
				return "na";
			}

			@Override
			protected String getGroupCellValue(List<Component> cs) {
				double sum = 0;
				String lastUnit = "kW";
				for (Component c : cs) {
					PowerConsumer consumer = c
							.getInterfaceByClass(PowerConsumer.class);
					if (consumer != null) {
						try {
							Value consumption = consumer.getPowerConsumption();
							sum += consumption.getValue();
							lastUnit = consumption.getUnit().toString();
						} catch (NoValueFoundException e) {
						}
					}
				}
				return sum + " " + lastUnit;
			}

			@Override
			protected Object getInput() {
				List<PowerConsumer> interfaces = ComponentInterfaceUtil
						.getComponentInterfaces(targetConfig,
								PowerConsumer.class);
				HashSet<String> types = new HashSet<String>();
				for (PowerConsumer consumer : interfaces) {
					types.add(consumer.getType());
				}
				ArrayList<Object> result = new ArrayList<Object>();
				for (String type : types) {
					@SuppressWarnings({ "unchecked", "rawtypes" })
					Group group = new TableComparator.Group(type);
					for (PowerConsumer consumer : interfaces) {
						if (type.equals(consumer.getType())) {
							result.add(consumer.getParentComponent());
							group.children.add(consumer.getParentComponent());
						}
					}
					result.add(group);
				}

				return result;
			}

			@Override
			protected void referenceAdded(final Configuration reference) {
				if (!view.getReferencedConfigurations().contains(reference)) {
					new CDTCommand() {
						protected void doRun() {
							view.getReferencedConfigurations().add(reference);
						}
					}.run();
				}
			}
		};

		initReferences();
	}

	private void initReferences() {
		for (Configuration configuration : view.getReferencedConfigurations()) {
			tableComparator.addReference(configuration);
		}
	}

	@Override
	public void setFocus() {
		tableComparator.setFocus();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public boolean matches(IEditorReference editorRef, IEditorInput theInput) {
		try {
			if (editorRef.getEditorInput() instanceof ConfigurationInput
					&& theInput instanceof ConfigurationInput) {
				ConfigurationInput editor = (ConfigurationInput) editorRef
						.getEditorInput();
				ConfigurationInput input = (ConfigurationInput) theInput;
				return editor.getConfiguration() == input.getConfiguration()
						&& editor.getView() == input.getView();
			}

		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return false;
	}

}
