/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools;

import javax.units.Unit;

import net.bhl.cdt.architecturetools.model.architecturetools.ArchitecturetoolsFactory;
import net.bhl.cdt.architecturetools.model.architecturetools.PowerConsumer;
import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Model;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.utilities.units.Quantity;

import org.eclipse.emf.ecore.EObject;

public class PowerConsumerHelper {

	public static Component createPowerConsumerComponent(Component container,
			String powerType, String compName, Unit unit, double inputValue) {
		Component parentComponent = ModelFactory.eINSTANCE.createComponent();
		parentComponent.setName(compName);
		PowerConsumer powerConsumer = ArchitecturetoolsFactory.eINSTANCE
				.createPowerConsumer();
		powerConsumer.setParentComponent(parentComponent);
		powerConsumer.setType(powerType);

		if (unit != null) {
			Parameter parameter = ModelFactory.eINSTANCE.createParameter();
			parameter.setName("power consumption");
			parameter.setQuantity(Quantity.COEFFICIENT);

			Value value = ModelFactory.eINSTANCE.createValue();
			value.setName("default");
			value.setUnit(unit);
			value.setValue(inputValue);
			parameter.getValues().add(value);

			parentComponent.getParameters().add(parameter);
			powerConsumer.setPowerParameter(parameter);
		}

		if (container != null) {
			container.getSubComponents().add(parentComponent);
		}
		return parentComponent;
	}

	public static void createDemoModel(Configuration config) {
		config.setName("Concept 000");
		Component aircraft = createComponent(config, "Aircraft");

		createParameter(aircraft, "Zero Lift Drag");
		createParameter(aircraft, "Wetted Area");
		createParameter(aircraft, "Mass");

		Component fuselage = createComponent(aircraft, "Fuselage");
		createParameter(fuselage, "Mass");
		createParameter(fuselage, "Wetted Area");
		createParameter(fuselage, "Length");
		Component cabin = createComponent(fuselage, "Cabin");
		Component avionics = createPowerConsumerComponent(cabin,
				"Electrical Systems", "Avionics", Unit.valueOf("kW"), 8.2);
		createParameter(avionics, "Mass");
		createParameter(cabin, "Mass");

		createPowerConsumerComponent(cabin, "Electrical Systems", "Galleys",
				Unit.valueOf("kW"), 0.0);
		Component mass = createPowerConsumerComponent(cabin, "Air System",
				"ECS", Unit.valueOf("kW"), 120);
		createParameter(mass, "Mass");
		createParameter(mass, "Air Distribution Ratio");
		createParameter(mass, "Pressurization");
		createParameter(mass, "Humidity");
		createPowerConsumerComponent(fuselage, "Electrical Systems",
				"Ventilation", Unit.valueOf("kW"), 2.7);
		createComponent(fuselage, "Fuselage Lighting");

		Component wing = createComponent(aircraft, "Wing");
		createParameter(wing, "Span");
		createParameter(wing, "Wetted Area");
		createParameter(wing, "Mass");
		createComponent(wing, "Tank");
		createPowerConsumerComponent(wing, "Electrical Systems", "Fuel Pumps",
				Unit.valueOf("kW"), 13.6);
		createComponent(wing, "Wing Lighting");
		createPowerConsumerComponent(wing, "Actuation", "Aileron",
				Unit.valueOf("kW"), 7);
		createPowerConsumerComponent(wing, "Actuation", "Spoiler",
				Unit.valueOf("kW"), 9.6);

		Component empennage = createComponent(aircraft, "Empennage");
		createPowerConsumerComponent(empennage, "Actuation", "Elevator",
				Unit.valueOf("kW"), 3.4);
		Component fin = createComponent(empennage, "Vertical Fin");
		createPowerConsumerComponent(fin, "Actuation", "Rudder",
				Unit.valueOf("kW"), 5);

		Component portside = createComponent(aircraft, "Portside Engine");
		createParameter(portside, "SFC");
		createParameter(portside, "Thrust");

		Component starboard = createComponent(aircraft, "Starboard Engine");
		createParameter(starboard, "SFC");
		createParameter(starboard, "Thrust");

		createComponent(aircraft, "Main Landing Gear");

		// Component component = createComponent(aircraft, "Component");
		// Parameter parameter = createParameter(component, "Parameter");
		// parameter.getValues().add(ModelFactory.eINSTANCE.createValue());
		//

		createPowerConsumerComponent(aircraft, "Air System", "Deicing",
				Unit.valueOf("kW"), 19.5);
	}

	public static void createDemoStructure(Model model) {
		Configuration config = getConfig("Concept 000", model);
		if (config == null) {
			config = ModelFactory.eINSTANCE.createConfiguration();

			createDemoModel(config);

			// Component component = ModelFactory.eINSTANCE.createComponent();
			// config.getComponents().add(component);
			// component.setName("Electrical Systems");
			//
			// createPowerConsumerComponent(component, "Avionics",
			// Unit.valueOf("kW"), 8.2);
			// component.getSubComponents().add(createPowerConsumerComponent("Ventilation",
			// Unit.valueOf("kW"), 2.7));
			// component.getSubComponents().add(createPowerConsumerComponent("Galleys",
			// Unit.valueOf("kW"), 0));
			// component.getSubComponents().add(createPowerConsumerComponent("Fuel Pumps",
			// Unit.valueOf("kW"), 13.6));
			// component.getSubComponents().add(createPowerConsumerComponent("Lighting",
			// Unit.valueOf("kW"), 5.5));
			//
			// component = ModelFactory.eINSTANCE.createComponent();
			// config.getComponents().add(component);
			// component.setName("Air System");
			//
			// component.getSubComponents().add(createPowerConsumerComponent("ECS",
			// Unit.valueOf("kW"), 120));
			// component.getSubComponents().add(createPowerConsumerComponent("Deicing",
			// Unit.valueOf("kW"), 19.5));
			//
			// component = ModelFactory.eINSTANCE.createComponent();
			// config.getComponents().add(component);
			// component.setName("Actuation");
			//
			// component.getSubComponents().add(createPowerConsumerComponent("Elevator",
			// Unit.valueOf("kW"), 3.4));
			// component.getSubComponents().add(createPowerConsumerComponent("Aileron",
			// Unit.valueOf("kW"), 7));
			// component.getSubComponents().add(createPowerConsumerComponent("Rudder",
			// Unit.valueOf("kW"), 5));
			// component.getSubComponents().add(createPowerConsumerComponent("Spoiler",
			// Unit.valueOf("kW"), 9.6));
			//
			model.getConfigurations().add(config);
		}
		config = getConfig("A340-500", model);
		if (config == null) {
			config = ModelFactory.eINSTANCE.createConfiguration();
			config.setName("A340-500");

			Component component = ModelFactory.eINSTANCE.createComponent();
			config.getComponents().add(component);
			component.setName("Electrical Systems");

			createPowerConsumerComponent(component, "Electrical Systems",
					"Avionics", Unit.valueOf("kW"), 30);
			createPowerConsumerComponent(component, "Electrical Systems",
					"Ventilation", Unit.valueOf("kW"), 10);
			createPowerConsumerComponent(component, "Electrical Systems",
					"Galleys", Unit.valueOf("kW"), 110);
			createPowerConsumerComponent(component, "Electrical Systems",
					"Fuel Pumps", Unit.valueOf("kW"), 50);
			createPowerConsumerComponent(component, "Electrical Systems",
					"Lighting", Unit.valueOf("kW"), 20);

			component = ModelFactory.eINSTANCE.createComponent();
			config.getComponents().add(component);
			component.setName("Air System");

			createPowerConsumerComponent(component, "Air System", "ECS",
					Unit.valueOf("kW"), 600);
			createPowerConsumerComponent(component, "Air System", "Deicing",
					null, 0);

			component = ModelFactory.eINSTANCE.createComponent();
			config.getComponents().add(component);
			component.setName("Actuation");

			createPowerConsumerComponent(component, "Actuation", "Elevator",
					Unit.valueOf("kW"), 34);
			createPowerConsumerComponent(component, "Actuation", "Aileron",
					Unit.valueOf("kW"), 70);
			createPowerConsumerComponent(component, "Actuation", "Rudder",
					Unit.valueOf("kW"), 50);
			createPowerConsumerComponent(component, "Actuation", "Spoiler",
					Unit.valueOf("kW"), 96);

			model.getConfigurations().add(config);
		}
		config = getConfig("FD 728-200", model);
		if (config == null) {
			config = ModelFactory.eINSTANCE.createConfiguration();
			config.setName("FD 728-200");

			Component component = ModelFactory.eINSTANCE.createComponent();
			config.getComponents().add(component);
			component.setName("Electrical Systems");

			createPowerConsumerComponent(component, "Electrical Systems",
					"Avionics", Unit.valueOf("kW"), 8.2);
			createPowerConsumerComponent(component, "Electrical Systems",
					"Ventilation", Unit.valueOf("kW"), 2.7);
			createPowerConsumerComponent(component, "Electrical Systems",
					"Galleys", Unit.valueOf("kW"), 30);
			createPowerConsumerComponent(component, "Electrical Systems",
					"Fuel Pumps", Unit.valueOf("kW"), 13.6);
			createPowerConsumerComponent(component, "Electrical Systems",
					"Lighting", Unit.valueOf("kW"), 5.5);

			component = ModelFactory.eINSTANCE.createComponent();
			config.getComponents().add(component);
			component.setName("Air System");

			createPowerConsumerComponent(component, "Air System", "ECS",
					Unit.valueOf("kW"), 120);
			createPowerConsumerComponent(component, "Air System", "Deicing",
					Unit.valueOf("kW"), 23.1);

			component = ModelFactory.eINSTANCE.createComponent();
			config.getComponents().add(component);
			component.setName("Actuation");

			createPowerConsumerComponent(component, "Actuation", "Elevator",
					Unit.valueOf("kW"), 3.4);
			createPowerConsumerComponent(component, "Actuation", "Aileron",
					Unit.valueOf("kW"), 7);
			createPowerConsumerComponent(component, "Actuation", "Rudder",
					Unit.valueOf("kW"), 5);
			createPowerConsumerComponent(component, "Actuation", "Spoiler",
					Unit.valueOf("kW"), 9.6);

			model.getConfigurations().add(config);
		}
	}

	private static Component createComponent(EObject parent, String name) {
		Component component = ModelFactory.eINSTANCE.createComponent();
		component.setName(name);
		if (parent instanceof Configuration) {
			((Configuration) parent).getComponents().add(component);
		} else if (parent instanceof Component) {
			((Component) parent).getSubComponents().add(component);
		}
		return component;
	}

	private static Parameter createParameter(Component component, String name) {
		Parameter parameter = ModelFactory.eINSTANCE.createParameter();
		component.getParameters().add(parameter);
		parameter.setName(name);
		return parameter;
	}

	public static Configuration getConfig(String name, Model model) {
		for (Configuration config : model.getConfigurations()) {
			if (name.equals(config.getName())) {
				return config;
			}
		}
		return null;
	}
}
