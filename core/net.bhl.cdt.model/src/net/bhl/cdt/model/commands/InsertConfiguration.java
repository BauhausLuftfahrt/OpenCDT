/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.commands;

import java.util.List;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Model;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.datatypes.CompositeValues;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;
import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;

import org.eclipse.emf.common.util.EList;

/**
 * @author Martin Glas <martin.glas@bauhaus-luftfahrt.net>
 * @version 2010.0611
 * @since 1.6
 */
public class InsertConfiguration extends CDTCommand {
	/**
	 * This variable is a reference to the target model.
	 */
	private Model model;
	/**
	 * This variable contains the labeling name of the Configuration which will be inserted.
	 */
	private String name;
	/**
	 * This variable contains the Parameters which will be generated in the Configuration.
	 */
	private EList<ExchangeElement> exchangeElements;

	/**
	 * @param targetModel The Model in which the Configuration will be inserted in
	 * @param configurationName The name of the new Configuration
	 * @param importedModelElements A list of Elements which will should be imported as new Configuration
	 */

	public InsertConfiguration(final Model targetModel, String configurationName,
		EList<ExchangeElement> importedModelElements) {
		super();
		this.model = targetModel;
		this.name = configurationName;
		this.exchangeElements = importedModelElements;
	}

	/**
	 * This method is the executes the command.
	 */
	@Override
	protected void doRun() {
		// TODO If Configuration with that name already exists do not crate a new one

		Configuration newConfiguration = ModelFactory.eINSTANCE.createConfiguration();

		// Set the name of the Configuration
		newConfiguration.setName(name);

		// attach the new Configuration to the model
		model.getConfigurations().add(newConfiguration);

		for (ExchangeElement exchangeElement : exchangeElements) {
			if (exchangeElement instanceof CompositeValues) {
				Component newComponent = ModelHelper.mapToComponent((CompositeValues) exchangeElement);

				newConfiguration.getComponents().add(newComponent);
			} else if (exchangeElement instanceof MeasuredValue) {
				// Value cannot stand alone and is therefore attached to the default Component "Aircraft".
				// Create the Component "Aircraft" if it does not exist and attach it to the new configuration
				Component targetComponent = ModelFactory.eINSTANCE.createComponent();

				targetComponent.setName("Aircraft");

				List<Component> candidateTargetComponents = ModelHelper.getChildrenByClassAndName(newConfiguration,
					Component.class, targetComponent.getName());
				// Component targetComponent = ModelHelper.findComponentInConfiguration(newConfiguration,
				// searchComponent);
				if (candidateTargetComponents.isEmpty()) {

					newConfiguration.getComponents().add(targetComponent);
				} else {
					targetComponent = candidateTargetComponents.get(0);
				}
				// Copy exParameter to the default "Aircraft" Component
				Parameter newParameter = ModelHelper.mapToParameter((MeasuredValue) exchangeElement);
				// Attach the newly created Parameter to the default "Aircraft" Component.
				targetComponent.getParameters().add(newParameter);

			}
		}
	}
}
