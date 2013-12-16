/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.units.ConversionException;
import javax.units.Converter;
import javax.units.Unit;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.utilities.datatypes.CompositeValues;
import net.bhl.cdt.utilities.datatypes.DataType;
import net.bhl.cdt.utilities.datatypes.DatatypesFactory;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;
import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;
import net.bhl.cdt.utilities.units.Quantity;
import net.bhl.cdt.utilities.units.util.UnitsHelper;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.ESProject;

/**
 * This is a helper class for the Model package.
 * 
 * @author Martin Glas
 * @author Otto von Wesendonk
 */
public final class ModelHelper {

	private ModelHelper() {

	}

	/**
	 * This method determines the parent Configuration of a given Value.
	 * 
	 * @param value The Value to which a Configuration will be determined.
	 * @return The appropriate Configuration of a given Value
	 */
	public static Configuration getConfigurationOf(Value value) {

		return getParentOf(getParentOf(getParentOf(value)));
	}

	/**
	 * This Method determines the parent Parameter of a given Value.
	 * 
	 * @param value The Value to which parent Parameter will be determined.
	 * @return The parent Parameter of a Value
	 */
	public static Parameter getParentOf(Value value) {
		if (value.eContainer() instanceof Parameter) {
			return (Parameter) value.eContainer();
		}
		return null;
	}

	/**
	 * This Method determines the parent Component of a given Parameter.
	 * 
	 * @param parameter The Parameter to which parent Parameter will be determined.
	 * @return The parent Component of a Parameter
	 */
	public static Component getParentOf(Parameter parameter) {
		if (parameter.eContainer() instanceof Component) {
			return (Component) parameter.eContainer();
		}
		return null;

	}

	/**
	 * This Method determines the parent Configuration of a given Component.
	 * 
	 * @param component The Component whose parent Configuration will be determined
	 * @return The parent Configuration of a given Component
	 */
	public static Configuration getParentOf(Component component) {
		if (component.eContainer() instanceof Component) {
			return getParentOf((Component) component.eContainer());
		} else if (component.eContainer() instanceof Configuration) {
			return (Configuration) component.eContainer();
		}
		return null;
	}

	/**
	 * This method returns all child Objects of a given Element having a specific type.
	 * 
	 * @param <T> The Type parameter which should match clazz
	 * @param parent The methods looks in the child objects of this parent Element
	 * @param clazz The type of Element the method looks for
	 * @return The list of Elements which are found among the child objects of the parent Element
	 */

	@SuppressWarnings("unchecked")
	public static <T extends Element> List<T> getChildrenByClass(Element parent, Class<T> clazz) {
		List<T> result = new ArrayList<T>();

		TreeIterator<EObject> iterator = parent.eAllContents();
		while (iterator.hasNext()) {
			EObject ob = iterator.next();
			if (clazz.isInstance(ob)) {
				result.add((T) ob);
			}
		}
		return result;
	}

	/**
	 * This method gives back all child Values of a given Element having a specific Quantity.
	 * 
	 * @param parent The methods looks in the child objects of this parent Element
	 * @param quantity The Quantity of Value the method looks for
	 * @return The list of Elements which are found among the child objects of the parent Element
	 */
	public static List<Value> getValuesByQuantity(Element parent, Quantity quantity) {
		List<Value> resultList = new ArrayList<Value>();

		for (Value value : getChildrenByClass(parent, Value.class)) {
			if (getParentOf(value) != null) {
				if (getParentOf(value).getQuantity().equals(quantity)) {
					resultList.add(value);
				}
			}
		}
		return resultList;
	}

	/**
	 * This method returns all child Objects of a given Element having a specific type and name.
	 * 
	 * @param <T> The Type parameter which should match clazz
	 * @param parent The methods looks in the child objects of this parent Element
	 * @param clazz The type of Elements the method looks for
	 * @param name The name of Elements the method looks for
	 * @return The list of Elements which are found among the child objects of the parent Element
	 */
	public static <T extends Element> List<T> getChildrenByClassAndName(Element parent, Class<T> clazz, String name) {

		return UtilitiesHelper.getChildrenByClassAndName(parent, clazz, name);
	}

	/**
	 * This method looks up a list of Values and copies them to a List of ExValues.
	 * 
	 * @param values The list of Values which should be copied to ExValues
	 * @return The list of EeValues which contain copies of the given list of Values
	 */
	public static List<MeasuredValue> copyToExValues(List<Value> values) {
		List<MeasuredValue> exValues = new LinkedList<MeasuredValue>();
		for (Value value : values) {
			exValues.add(valueToEx(value));
		}

		return exValues;

	}

	/**
	 * This class converts a Value to an Measured value. The unit is not set
	 * 
	 * @param value the Value
	 * @return the MeasuredValue without Unit
	 */

	public static MeasuredValue valueToEx(Value value) {
		if (value == null) {
			return null;
		}

		DataType dataType = value.getDatatypes().get(0);

		if (!(dataType instanceof MeasuredValue)) {
			throw new RuntimeException("Not supported datatype: " + dataType.getClass());
		}

		MeasuredValue exValue = DatatypesFactory.eINSTANCE.createMeasuredValue();
		exValue.setUnit(value.getUnit());
		exValue.setValue(((MeasuredValue) dataType).getValue());
		return exValue;
	}

	/**
	 * This class converts MeasuredValue to Value omitting the Unit .
	 * 
	 * @param measuredValue the MeasuredValue
	 * @return the Value without unit
	 */

	public static Value exToValue(MeasuredValue measuredValue) {
		if (measuredValue == null) {
			return null;
		}
		Value value = ModelFactory.eINSTANCE.createValue();
		value.setUnit(measuredValue.getUnit());
		value.getDatatypes().add(measuredValue);
		return value;
	}

	/**
	 * This method merges the attributes of two Value objects by overwriting the attributes of the target with the
	 * values of the source Value.
	 * 
	 * @param sourceValue The Value object which is the source of the merging
	 * @param targetValue The Value object which is the target of the merging
	 */

	public static void merge(Value sourceValue, Value targetValue) {
		targetValue.setUnit(sourceValue.getUnit());

		targetValue.setDescription(sourceValue.getDescription());
		targetValue.setSource(sourceValue.getSource());
		targetValue.setUnit(sourceValue.getUnit());
		targetValue.setValue(sourceValue.getValue());
	}

	/**
	 * This method merges a MeasuredValue object with a Value object.
	 * 
	 * @param sourceMeasuredValue the source MeasuredValue object
	 * @param targetValue the target Value object
	 */
	public static void merge(MeasuredValue sourceMeasuredValue, Value targetValue) {

		if (!sourceMeasuredValue.getUnit().isCompatible(targetValue.getUnit())) {
			throw new RuntimeException("units of Source Exchange Value and Target Exchange Value are incompatible");
		}
		Converter converter = sourceMeasuredValue.getUnit().getConverterTo(targetValue.getUnit());
		targetValue.setValue(converter.convert(sourceMeasuredValue.getValue()));
	}

	/**
	 * This method returns a copy a given Parameter object.
	 * 
	 * @param sourceParameter The source Parameter object of the copy
	 * @return The new Parameter which is a copy of a given Parameter
	 */
	public static Parameter copy(Parameter sourceParameter) {

		Parameter newParameter = ModelFactory.eINSTANCE.createParameter();
		newParameter.setName(sourceParameter.getName());
		newParameter.setQuantity(sourceParameter.getQuantity());
		return newParameter;
	}

	/**
	 * This method returns a copy a given Parameter object.
	 * 
	 * @param sourceComponent The source Parameter object of the copy
	 * @return The new Component which is a copy of a given Parameter
	 */
	public static Component copy(Component sourceComponent) {
		Component newComponent = ModelFactory.eINSTANCE.createComponent();
		newComponent.setName(sourceComponent.getName());

		return newComponent;

	}

	/**
	 * This method copies a given Value object.
	 * 
	 * @param sourceValue The source Value object of the copy
	 * @return The new Value which is a copy of a given Value
	 */
	public static Value copy(Value sourceValue) {
		Value newValue = ModelFactory.eINSTANCE.createValue();
		newValue.setUnit(sourceValue.getUnit());
		newValue.setDescription(sourceValue.getDescription());
		newValue.setSource(sourceValue.getSource());
		newValue.setUnit(sourceValue.getUnit());
		newValue.setValue(sourceValue.getValue());
		return newValue;
	}

	/**
	 * This method copies a Value object to a new ExValue Object.
	 * 
	 * @param sourceValue The source Value object of the copy
	 * @return The new ExVlue which is a copy of a given Value regarding overlapping attributes.
	 */
	public static MeasuredValue copyToMeasuredValue(Value sourceValue) {
		MeasuredValue newValue = DatatypesFactory.eINSTANCE.createMeasuredValue();
		newValue.setUnit(sourceValue.getUnit());
		newValue.setUnit(sourceValue.getUnit());
		newValue.setValue(sourceValue.getValue());
		return newValue;
	}

	/**
	 * This method copies all Values specified in the Calculation object of a derived Value from the Model into
	 * ExValues.
	 * 
	 * @param derivedValue The derived Value which contains the Calculation as a child.
	 * @return The List of ExValues containing a copy of all Values specified in the Calculation object.
	 */
	// public static List<MeasuredValue> copyFunctionParametersFromModelToExValues(Value value) {
	// List<MeasuredValue> resultList = new LinkedList<MeasuredValue>();
	// if (value != null) {
	// if (value.getCalculationSpecification() != null) {
	// if (value.getCalculationSpecification().getCalculationParameterMapping() != null) {
	// resultList = copyToExValues(getConfigurationOf(value), value.getCalculationSpecification()
	// .getCalculationParameterMapping().getFunctionParameters());
	// }
	// }
	// }
	// return resultList;
	// }

	/**
	 * This method returns the value attribute of a given value converted into a given Unit. The method throws an
	 * exception if the Unit is not compatible to the unit of the Value.
	 * 
	 * @param value The Value which contains the value attribute
	 * @param unit The Unit the value attribute should be converted to
	 * @return The returned value attribute converted to0 the desired Unit
	 * @throws ConversionException This Exception is thrown if the conversion cannot be performed
	 */

	public static double getValueAttributeToUnit(Value value, Unit unit) throws ConversionException {

		return value.getUnit().getConverterTo(unit).convert(value.getValue());

	}

	/**
	 * This method maps an CompositeValues and its child ExchangeElements to a Component with subComponents and
	 * Parameters.
	 * 
	 * @param compositeElement The CompositeValues which is mapped to a Component
	 * @return the Component which is a mapping of the CompositeValues ant its content
	 */

	public static Component mapToComponent(CompositeValues compositeElement) {
		Component component = ModelFactory.eINSTANCE.createComponent();
		// copy attributes
		component.setName(compositeElement.getName());

		// copy Parameters

		if (compositeElement.getDatatypes().size() > 0) {

			for (ExchangeElement exchangeElement : compositeElement.getDatatypes()) {
				if (exchangeElement instanceof MeasuredValue) {
					component.getParameters().add(mapToParameter((MeasuredValue) exchangeElement));
				} else if (exchangeElement instanceof CompositeValues) {
					component.getSubComponents().add(mapToComponent((CompositeValues) exchangeElement));
				}

			}
		}

		return component;
	}

	/**
	 * This method maps an MeasuredValue a Parameter which has one Value.
	 * 
	 * @param exchangeValue The EchangeValue which is the source of the copy
	 * @return The Parameter which is the result of the mapping of the MeasuredValue
	 */

	public static Parameter mapToParameter(MeasuredValue exchangeValue) {
		Parameter parameter = ModelFactory.eINSTANCE.createParameter();
		// copy name and infer Quantity

		parameter.setName(exchangeValue.getName());
		parameter.setQuantity(UnitsHelper.getQuantityByUnit(exchangeValue.getUnit()));
		// copy name and value

		if (!((Double) exchangeValue.getValue()).isNaN()) {
			Value value = ModelFactory.eINSTANCE.createValue();
			value.setValue(exchangeValue.getValue());
			value.setUnit(exchangeValue.getUnit());
			parameter.getValues().add(value);
		}

		return parameter;
	}

	/**
	 * This method maps an MeasuredValue to a StaticValue.
	 * 
	 * @param exchangeValue The MeasuredValue which is the source of the copy
	 * @return The Value which is a mapping of the ExValue
	 */
	public static Value mapToValue(MeasuredValue exchangeValue) {
		Value resultValue = ModelFactory.eINSTANCE.createValue();
		// copy attributes
		resultValue.setUnit(exchangeValue.getUnit());
		resultValue.setValue(exchangeValue.getValue());
		return resultValue;
	}

	/**
	 * This Method formalizes a List of ExchangeElements and its contents to a model conform Configuration.
	 * 
	 * @param configurationName The name of the returned Configuration
	 * @param dataTypes the List of
	 * @return The resulting Configuration
	 */
	public static Configuration formalizeToConfiguration(String configurationName, List<DataType> dataTypes) {

		Configuration newConfiguration = ModelFactory.eINSTANCE.createConfiguration();

		// Set the name of the Configuration
		newConfiguration.setName(configurationName);

		for (ExchangeElement exchangeElement : dataTypes) {
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
		return newConfiguration;
	}

	/**
	 * This method formalizes an existing ExchangeElements data structure into a model conform data structure. Hereby,
	 * it infers Data types and substitutes missing information.
	 * 
	 * @param compositeElement The CompositeValues which contains other ExchangeElements
	 * @return The model conform data structure which is a mapping of an exchangemodel conform structure
	 */

	public static Component formalizeToComponent(CompositeValues compositeElement) {

		Component newRootComponent = mapToComponent(compositeElement);

		for (ExchangeElement exchangeElement : compositeElement.getDatatypes()) {
			if (exchangeElement instanceof CompositeValues) {
				Component newComponent = ModelHelper.mapToComponent((CompositeValues) exchangeElement);

				newRootComponent.getSubComponents().add(newComponent);
			} else if (exchangeElement instanceof MeasuredValue) {
				// Value cannot stand alone and is therefore attached to the default Component "Aircraft".
				// Create the Component "Aircraft" if it does not exist and attach it to the new configuration
				Component targetComponent = ModelFactory.eINSTANCE.createComponent();

				targetComponent.setName("Aircraft");

				List<Component> candidateTargetComponents = ModelHelper.getChildrenByClassAndName(newRootComponent,
					Component.class, targetComponent.getName());
				// Component targetComponent = ModelHelper.findComponentInConfiguration(newConfiguration,
				// searchComponent);
				if (candidateTargetComponents.isEmpty()) {

					newRootComponent.getSubComponents().add(targetComponent);
				} else {
					targetComponent = candidateTargetComponents.get(0);
				}
				// Copy exParameter to the default "Aircraft" Component
				Parameter newParameter = ModelHelper.mapToParameter((MeasuredValue) exchangeElement);
				// Attach the newly created Parameter to the default "Aircraft" Component.
				targetComponent.getParameters().add(newParameter);

			}
		}
		return newRootComponent;
	}

	/**
	 * The method tries to find the component which contains the given EObject. If there is no container component, the
	 * method returns null. If the given EObject is of type Component, the object will be returned.
	 * 
	 * @param obj -- The EObject for which the component should be found
	 * @return The container Component or null if no Component element exists.
	 */
	public static Component getComponentByEObject(EObject obj) {
		if (obj instanceof Component) {
			return (Component) obj;
		}

		if (obj instanceof ESProject) {
			return null;
		}

		return getComponentByEObject(obj.eContainer());
	}

	/**
	 * This method creates a Component object with a given name.
	 * 
	 * @param componentName the name of the Component object.
	 * @return the created Component object.
	 */
	public static Component createComponent(String componentName) {
		Component newComponent = ModelFactory.eINSTANCE.createComponent();
		if (componentName != null) {
			newComponent.setName(componentName);
		}
		return newComponent;
	}

	/**
	 * This method creates a Parameter object from a given datatype.
	 * 
	 * @param name the name of the Parameter object.
	 * @param datatype the datatype of the Parameter object
	 * @return the created Parameter object.
	 */
	public static Parameter createParameter(String name, DataType datatype) {
		Parameter resultParameter = ModelFactory.eINSTANCE.createParameter();
		resultParameter.setName(name);
		resultParameter.getValues().add(createValue(datatype));
		// TODO if Datatype has unit infer Quantity
		return resultParameter;
	}

	/**
	 * This method creates a Value object from a given datatype.
	 * 
	 * @param datatype the datatype of the Parameter object
	 * @return the created Value object.
	 */
	public static Value createValue(DataType datatype) {
		Value newValue = ModelFactory.eINSTANCE.createValue();
		DataType newDataType = EcoreUtil.copy(datatype);
		newValue.getDatatypes().add(newDataType);
		if (newDataType instanceof MeasuredValue) {
			MeasuredValue measuredValue = (MeasuredValue) newDataType;
			if (measuredValue.getUnit() != null) {
				newValue.setUnit(measuredValue.getUnit());
			}
			newValue.setValue(measuredValue.getValue());
		}
		return newValue;
	}
}
