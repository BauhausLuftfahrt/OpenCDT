/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.measure.converter.ConversionException;
import javax.measure.converter.UnitConverter;
import javax.measure.unit.Unit;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.datatypes.CompositeValues;
import net.bhl.cdt.model.datatypes.DataType;
import net.bhl.cdt.model.datatypes.DatatypesFactory;
import net.bhl.cdt.model.datatypes.FloatPointValue;
import net.bhl.cdt.model.datatypes.MeasuredValue;
import net.bhl.cdt.model.datatypes.NamedElement;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESProject;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.server.model.ESGlobalProjectId;

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
	 * Get the EContainer that contains the given model element and whose EContainer is null.
	 * 
	 * @param parent the Class of the parent
	 * @param child the model element whose container should get returned
	 * @param <T> the type parameter of the generic method
	 * @return the container
	 */
	public static <T extends EObject> T getParent(Class<T> parent, EObject child) {
		Set<EObject> seenModelElements = new HashSet<EObject>();
		seenModelElements.add(child);
		return getParent(parent, child, seenModelElements);
	}

	@SuppressWarnings("unchecked")
	private static <T extends EObject> T getParent(Class<T> parent, EObject child, Set<EObject> seenModelElements) {
		if (child == null) {
			return null;
		}

		if (seenModelElements.contains(child.eContainer())) {
			throw new IllegalStateException("ModelElement is in a containment cycle");
		}

		if (parent.isInstance(child)) {
			return (T) child;
		} else {
			seenModelElements.add(child);
			return getParent(parent, child.eContainer(), seenModelElements);
		}
	}

	/**
	 * This is a method which returns the ProjectID of the ModelElement.
	 * 
	 * @param modelElement the ModelElement
	 * @return the ProjectID of the specified ModelElement
	 */
	public static ESLocalProject getContainingProject(EObject modelElement) {
		ESWorkspace workspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
		return workspace.getLocalProject(modelElement);

	}

	/**
	 * This is a method which returns the ProjectID of the ModelElement.
	 * 
	 * @param modelElement the ModelElement
	 * @return the ProjectID of the specified ModelElement
	 */
	public static ESGlobalProjectId getProjectId(EObject modelElement) {

		ESLocalProject project = getContainingProject(modelElement);
		if (project == null) {
			return null;
		}
		if (project.isShared()) {
			ESGlobalProjectId projectId = project.getGlobalProjectId();
			return projectId;
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
	public static <T extends EObject> List<T> getChildrenByClass(EObject parent, Class<T> clazz) {
		List<T> result = new ArrayList<T>();
		if (parent == null) {
			return result;
		}
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
	 * This method returns all child Objects of a given Element having a specific type and name.
	 * 
	 * @param <T> The Type parameter which should match clazz
	 * @param parent The methods looks in the child objects of this parent Element
	 * @param clazz The type of Elements the method looks for
	 * @param name The name of Elements the method looks for
	 * @return The list of Elements which are found among the child objects of the parent Element
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<T> getChildrenByClassAndName(EObject parent, Class<T> clazz, String name) {
		List<T> result = new ArrayList<T>();
		if (parent == null) {
			return result;
		}
		TreeIterator<EObject> iterator = parent.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			if (eObject instanceof NamedElement) {
				NamedElement ob = (NamedElement) eObject;
				if ((clazz.isInstance(ob) && (ob.getName().equals(name)))) {
					result.add((T) ob);
				}
			}
		}
		return result;
	}

	/**
	 * Returns all Children of type.
	 * 
	 * @param parent root element of subtree which is searched
	 * @param type needle class
	 * @param <T> The Type parameter which should match class
	 * @return The list of Elements which are found among the child objects of the parent Element
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<EObject> getChildrenOfType(EObject parent, Class<T> type) {
		ArrayList<EObject> result = new ArrayList<EObject>();
		if (parent == null) {
			return result;
		}

		TreeIterator<EObject> iterator = parent.eAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (type.isInstance(next)) {
				result.add((T) next);
			}
		}

		return result;
	}

	/**
	 * This method returns the path of the current workspace as string.
	 * 
	 * @param pluginID the ID of the plug-in
	 * @return the file path to the current workspace as string
	 */
	public static String getPluginFilePath(String pluginID) {
		String result = "";
		if (getPluginFileURL(pluginID) != null) {
			result = getPluginFileURL(pluginID).toString();
		}
		return result;
	}

	/**
	 * This method returns the path of the current workspace as string.
	 * 
	 * @param pluginID the ID of the plug-in
	 * @return the file path to the current workspace as string
	 */
	public static URL getPluginFileURL(String pluginID) {

		try {
			return FileLocator.resolve(new URL("platform:/plugin/" + pluginID + "/"));
		} catch (MalformedURLException e) {
			System.out.println("Could not form a valid URL from " + pluginID);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not locate a file folder at " + pluginID);
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * getFileURL.
	 * 
	 * @param filePath path of the file
	 * @param fileName name of the file
	 * @return new URL
	 */
	public static URL getFileURL(String filePath, String fileName) {
		try {
			return new URL(filePath + fileName);
		} catch (MalformedURLException e) {
			System.out.println("Could not form a valid URL from " + filePath + fileName);
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method determines the parent Configuration of a given Value.
	 * 
	 * @param dataType The dataType to which a Configuration will be determined.
	 * @return The appropriate Configuration of a given Value
	 */
	public static Configuration getConfigurationOf(DataType dataType) {

		return getParentOf(getParentOf(getParentOf(dataType)));
	}

	/**
	 * This Method determines the parent Parameter of a given Value.
	 * 
	 * @param value The Value to which parent Parameter will be determined.
	 * @return The parent Parameter of a Value
	 */
	public static Parameter getParentOf(DataType value) {
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
	 * This method returns all child Objects of a given NamedElement having a specific type.
	 * 
	 * @param <T> The Type parameter which should match clazz
	 * @param parent The methods looks in the child objects of this parent NamedElement
	 * @param clazz The type of NamedElement the method looks for
	 * @return The list of Elements which are found among the child objects of the parent NamedElement
	 */

	@SuppressWarnings("unchecked")
	public static <T extends NamedElement> List<T> getChildrenByClass(NamedElement parent, Class<T> clazz) {
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

	// /**
	// * This method gives back all child Values of a given NamedElement having a specific Quantity.
	// *
	// * @param parent The methods looks in the child objects of this parent NamedElement
	// * @param quantity The Quantity of Value the method looks for
	// * @return The list of Elements which are found among the child objects of the parent NamedElement
	// */
	// public static List<Value> getValuesByQuantity(NamedElement parent, Quantity quantity) {
	// List<Value> resultList = new ArrayList<Value>();
	//
	// for (Value value : getChildrenByClass(parent, Value.class)) {
	// if (getParentOf(value) != null) {
	// if (getParentOf(value).getQuantity().equals(quantity)) {
	// resultList.add(value);
	// }
	// }
	// }
	// return resultList;
	// }

	/**
	 * This method returns all child Objects of a given NamedElement having a specific type and name.
	 * 
	 * @param <T> The Type parameter which should match clazz
	 * @param parent The methods looks in the child objects of this parent NamedElement
	 * @param clazz The type of Elements the method looks for
	 * @param name The name of Elements the method looks for
	 * @return The list of Elements which are found among the child objects of the parent NamedElement
	 */
	public static <T extends NamedElement> List<T> getChildrenByClassAndName(NamedElement parent, Class<T> clazz,
		String name) {

		return getChildrenByClassAndName(parent, clazz, name);
	}

	/**
	 * This method looks up a list of Values and copies them to a List of ExValues.
	 * 
	 * @param dataTypes The list of Values which should be copied to ExValues
	 * @return The list of EeValues which contain copies of the given list of Values
	 */
	public static List<MeasuredValue> copyToNamedValues(List<DataType> dataTypes) {
		List<MeasuredValue> exValues = new LinkedList<MeasuredValue>();
		for (DataType datatype : dataTypes) {
			exValues.add(copyToMeasuredValue(datatype));
		}

		return exValues;

	}

	/**
	 * This class converts a Value to an Measured value. The unit is not set
	 * 
	 * @param dataType the dataType
	 * @return the MeasuredValue without Unit
	 */

	public static MeasuredValue copyToMeasuredValue(DataType dataType) {

		if (!(dataType instanceof MeasuredValue)) {
			throw new RuntimeException("Not supported datatype: " + dataType.getClass());
		}

		MeasuredValue measuredValue = EcoreUtil.copy((MeasuredValue) dataType);

		return measuredValue;
	}

	/**
	 * This class converts MeasuredValue to FloatPointvalue omitting the Unit .
	 * 
	 * @param measuredValue the MeasuredValue
	 * @return the FloatPointValue without unit
	 */

	public static FloatPointValue exToValue(MeasuredValue measuredValue) {
		if (measuredValue == null) {
			return null;
		}

		FloatPointValue floatPointValue = DatatypesFactory.eINSTANCE.createFloatPointValue();
		floatPointValue.setName(measuredValue.getName());
		floatPointValue.setValue(measuredValue.getValue());
		return floatPointValue;
	}

	// /**
	// * This method merges the attributes of two Value objects by overwriting the attributes of the target with the
	// * values of the source Value.
	// *
	// * @param sourceValue The Value object which is the source of the merging
	// * @param targetValue The Value object which is the target of the merging
	// */
	//
	// public static void merge(MeasuredValue sourceValue, MeasuredValue targetValue) {
	// targetValue.setUnit(sourceValue.getUnit());
	// targetValue.setUnit(sourceValue.getUnit());
	// targetValue.setValue(sourceValue.getValue());
	// }

	/**
	 * This method merges a MeasuredValue object with a Value object.
	 * 
	 * @param sourceMeasuredValue the source MeasuredValue object
	 * @param targetValue the target Value object
	 */
	public static void merge(MeasuredValue sourceMeasuredValue, MeasuredValue targetValue) {

		if (!sourceMeasuredValue.getUnit().isCompatible(targetValue.getUnit())) {
			throw new RuntimeException("units of Source Exchange Value and Target Exchange Value are incompatible");
		}

		UnitConverter unitConverter = sourceMeasuredValue.getUnit().getConverterTo(targetValue.getUnit());
		targetValue.setValue(unitConverter.convert(sourceMeasuredValue.getValue()));
	}

	/**
	 * This method returns a copy a given Parameter object.
	 * 
	 * @param sourceParameter The source Parameter object of the copy
	 * @return The new Parameter which is a copy of a given Parameter
	 */
	public static Parameter copy(Parameter sourceParameter) {

		return EcoreUtil.copy(sourceParameter);
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
	 * @param dataType The source Value object of the copy
	 * @return The new Value which is a copy of a given Value
	 */
	public static DataType copy(DataType dataType) {

		return EcoreUtil.copy(dataType);
	}

	// /**
	// * This method copies a Value object to a new ExValue Object.
	// *
	// * @param sourceValue The source Value object of the copy
	// * @return The new ExVlue which is a copy of a given Value regarding overlapping attributes.
	// */
	// public static MeasuredValue copyToMeasuredValue(Value sourceValue) {
	// MeasuredValue newValue = DatatypesFactory.eINSTANCE.createMeasuredValue();
	// newValue.setUnit(sourceValue.getUnit());
	// newValue.setUnit(sourceValue.getUnit());
	// newValue.setValue(sourceValue.getValue());
	// return newValue;
	// }

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
	 * @param measuredValue The MeasuredValue which contains the value attribute
	 * @param unit The Unit the value attribute should be converted to
	 * @return The returned value attribute converted to0 the desired Unit
	 * @throws ConversionException This Exception is thrown if the conversion cannot be performed
	 */

	public static double getMeasuredValueToUnit(MeasuredValue measuredValue, Unit unit) throws ConversionException {

		return measuredValue.getUnit().getConverterTo(unit).convert(measuredValue.getValue());

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

			for (NamedElement namedElement : compositeElement.getDatatypes()) {
				if (namedElement instanceof MeasuredValue) {
					component.getParameters().add(mapToParameter((MeasuredValue) namedElement));
				} else if (namedElement instanceof CompositeValues) {
					component.getSubComponents().add(mapToComponent((CompositeValues) namedElement));
				}

			}
		}

		return component;
	}

	/**
	 * This method maps an MeasuredValue a Parameter which has one Value.
	 * 
	 * @param measuredValue The EchangeValue which is the source of the copy
	 * @return The Parameter which is the result of the mapping of the MeasuredValue
	 */

	public static Parameter mapToParameter(MeasuredValue measuredValue) {
		Parameter parameter = ModelFactory.eINSTANCE.createParameter();
		// copy name and infer Quantity

		parameter.setName(measuredValue.getName());

		// copy name and value

		if (!((Double) measuredValue.getValue()).isNaN()) {
			parameter.getValues().add(EcoreUtil.copy(measuredValue));
		}

		return parameter;
	}

	// /**
	// * This method maps an MeasuredValue to a StaticValue.
	// *
	// * @param exchangeValue The MeasuredValue which is the source of the copy
	// * @return The Value which is a mapping of the ExValue
	// */
	// public static Value mapToValue(MeasuredValue exchangeValue) {
	// Value resultValue = ModelFactory.eINSTANCE.createValue();
	// // copy attributes
	// resultValue.setUnit(exchangeValue.getUnit());
	// resultValue.setValue(exchangeValue.getValue());
	// return resultValue;
	// }

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

		for (NamedElement namedElement : dataTypes) {
			if (namedElement instanceof CompositeValues) {
				Component newComponent = ModelHelper.mapToComponent((CompositeValues) namedElement);

				newConfiguration.getComponents().add(newComponent);
			} else if (namedElement instanceof MeasuredValue) {
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
				Parameter newParameter = ModelHelper.mapToParameter((MeasuredValue) namedElement);
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

		for (NamedElement namedElement : compositeElement.getDatatypes()) {
			if (namedElement instanceof CompositeValues) {
				Component newComponent = ModelHelper.mapToComponent((CompositeValues) namedElement);

				newRootComponent.getSubComponents().add(newComponent);
			} else if (namedElement instanceof MeasuredValue) {
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
				Parameter newParameter = ModelHelper.mapToParameter((MeasuredValue) namedElement);
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
		resultParameter.getValues().add(datatype);
		// TODO if Datatype has unit infer Quantity
		return resultParameter;
	}

	// /**
	// * This method creates a Value object from a given datatype.
	// *
	// * @param datatype the datatype of the Parameter object
	// * @return the created Value object.
	// */
	// public static Value createValue(DataType datatype) {
	// Value newValue = ModelFactory.eINSTANCE.createValue();
	// DataType newDataType = EcoreUtil.copy(datatype);
	// newValue.getDatatypes().add(newDataType);
	// if (newDataType instanceof MeasuredValue) {
	// MeasuredValue measuredValue = (MeasuredValue) newDataType;
	// if (measuredValue.getUnit() != null) {
	// newValue.setUnit(measuredValue.getUnit());
	// }
	// newValue.setValue(measuredValue.getValue());
	// }
	// return newValue;
	// }
}
