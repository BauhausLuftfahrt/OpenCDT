/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools;

import java.util.Iterator;
import java.util.List;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.architecturetools.exceptions.NoValueFoundException;
import net.bhl.cdt.model.architecturetools.impl.PowerConsumerImpl;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.datatypes.DatatypesFactory;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;
import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

/**
 * Traverses the Component tree and sums up power consumption.
 * 
 * @author Sven Ziemer
 */

public class TreeTraversionCommand extends CDTCommand {
	private PowerConsumerImpl powerConsumerInterface;
	private MappableComponentInterface mappableComponentInterface;
	private Double sum;

	public TreeTraversionCommand(PowerConsumerImpl powerConsumerInterface) {
		this.powerConsumerInterface = powerConsumerInterface;
	};

	public TreeTraversionCommand(MappableComponentInterface selection) {
		this.mappableComponentInterface = selection;
	};

	@Override
	protected void doRun() {
		Component component;
		if (mappableComponentInterface != null) {
			component = mappableComponentInterface.getParentComponent();
		} else if (powerConsumerInterface != null) {
			component = powerConsumerInterface.basicGetParentComponent();
		} else {
			throw new CDTRuntimeException(
					"Parent component for Sum operation could not be identified");
		}
		sum = 0.0;
		TreeTraverse(component);

		Value value = ModelFactory.eINSTANCE.createValue();
		value.setName("Sum");
		// TODO: set unit
		// value.setUnit(unit);
		MeasuredValue measuredValue = DatatypesFactory.eINSTANCE
				.createMeasuredValue();
		measuredValue.setValue(sum);
		value.getDatatypes().add(measuredValue);
		// Assign sum to interface
		// powerConsumerInterface.setValue(value) ;
		mappableComponentInterface.setValue(value);

	}

	public void TreeTraverse(Component component) {

		List<Component> listComponent = component.getSubComponents();
		Iterator<Component> listComponentIterator = listComponent.iterator();
		while (listComponentIterator.hasNext()) {
			TreeTraverse(listComponentIterator.next());
		}
		if ((component.getInterfaceByClass(mappableComponentInterface
				.getClass())) != null) { // powerConsumerInterface
			try {
				// Value value =
				// component.getInterfaceByClass(powerConsumerInterface.getClass()).getPowerConsumption();
				Value value = component.getInterfaceByClass(
						mappableComponentInterface.getClass()).getValue();
				if (!value.getDatatypes().isEmpty()) {
					MeasuredValue measuredValue = (MeasuredValue) value
							.getDatatypes().get(0);
					Double tmp = measuredValue.getValue();
					sum = sum + tmp;
				}
			} catch (NoValueFoundException noValueFoundException) {
				// do nothing -- component has no powerconsumption interface
				// defined.
			} catch (Exception e) {
				// TODO: handle exception -- perform rollback
				throw new CDTRuntimeException(e.getMessage());
			}
		}

		return;
	}

}
