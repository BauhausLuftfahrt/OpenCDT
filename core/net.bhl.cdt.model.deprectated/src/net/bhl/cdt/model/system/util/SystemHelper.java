/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.system.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.measure.unit.Unit;

import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.OperationWithOutput;
import net.bhl.cdt.model.geometry.GeometryFactory;
import net.bhl.cdt.model.geometry.SpaceVector;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber;
import net.bhl.cdt.model.process.designoperations.impl.DesignoperationsFactoryImpl;
import net.bhl.cdt.model.system.Component;
import net.bhl.cdt.model.system.Counter;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.MeasuredParameter;
import net.bhl.cdt.model.system.MeasuredValue;
import net.bhl.cdt.model.system.Parameter;
import net.bhl.cdt.model.system.State;
import net.bhl.cdt.model.system.StringValue;
import net.bhl.cdt.model.system.SystemModelElement;
import net.bhl.cdt.model.system.Value;
import net.bhl.cdt.model.system.impl.SystemFactoryImpl;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.ESLocalProject;

/**
 * This helper class contains methods for creating and changing system model elements.
 * 
 * @author martin.glas
 */
public final class SystemHelper {
	private SystemHelper() {
	};

	/**
	 * This method creates a Parameter and a DecimalValue number from a given Parameter name, a BigDecimal value, its
	 * container Component and its creating operation.
	 * 
	 * @param parameterName the name of the Parameter
	 * @param value the value of the Parameter as BigDecimal
	 * @param component the containing Component
	 * @param operationWithOutput the operation which creates the Parameter
	 * @return the newly created Parameter containing the BigDecimal value
	 */
	public static Parameter createParameter(String parameterName, BigDecimal value, Component component,
		OperationWithOutput operationWithOutput) {
		Parameter parameter = createParameter(parameterName);
		DecimalNumber decimalNumber = createValue(parameterName, value);
		parameter.getValues().add(decimalNumber);
		operationWithOutput.getGeneratedElements().add(decimalNumber);
		component.getParameters().add(parameter);
		parameter.setSourceOperation(operationWithOutput);
		return parameter;
	}

	/**
	 * This method creates a Parameter having integer values from a given Parameter name, an integer value, its
	 * containing component, and the operation which created it.
	 * 
	 * @param parameterName the name of the Parameter
	 * @param value the integer value of the Parameter
	 * @param component the component Containing the Parameter
	 * @param operationWithOutput the Operation creating the Parameter
	 * @return the newly created Parameter containing the integer value
	 */
	public static Parameter createParameter(String parameterName, int value, Component component,
		OperationWithOutput operationWithOutput) {
		Parameter parameter = createParameter(parameterName);
		Counter counter = createCounter(parameterName, value);
		parameter.getValues().add(counter);
		operationWithOutput.getGeneratedElements().add(counter);
		component.getParameters().add(parameter);
		return parameter;
	}

	/**
	 * This method creates a MeasuredParameter with a given name, default Unit, and it's containing Component.
	 * 
	 * @param parameterName the name of the MeasuredParameter
	 * @param unit the default unit of the MeasuredParameter
	 * @param component the containing Component of the MeasuredParameter
	 * @return the newly created MeasuredParameter
	 */
	public static MeasuredParameter createMeasuredParameter(String parameterName, Unit<?> unit, Component component) {
		MeasuredParameter measuredParameter = createMeasuredParameter(parameterName, unit);
		component.getParameters().add(measuredParameter);
		return measuredParameter;
	}

	/**
	 * This method creates a Counter with a name and integer value.
	 * 
	 * @param parameterName the name of the Counter
	 * @param value the integer value of the counter
	 * @return the newly created counter
	 */
	private static Counter createCounter(String parameterName, int value) {
		Counter counter = SystemFactoryImpl.eINSTANCE.createCounter();
		counter.setName(parameterName);
		counter.setValue(value);
		return counter;
	}

	/**
	 * This method creates a DecimalNumber with a given name and BigDecimal value.
	 * 
	 * @param parameterName the name of the DecimalNumber
	 * @param value the BigDecimal value of the DecimalNumber
	 * @return the newly created DecimalNumber
	 */
	private static DecimalNumber createValue(String parameterName, BigDecimal value) {
		DecimalNumber decimalNumber = SystemFactoryImpl.eINSTANCE.createDecimalNumber();
		decimalNumber.setName(parameterName);
		decimalNumber.setValue(value);
		return decimalNumber;
	}

	/**
	 * This method creates a Parameter with a given name.
	 * 
	 * @param parameterName the name of the Parameter
	 * @return the newly created Parameter
	 */
	public static Parameter createParameter(String parameterName) {
		Parameter parameter = SystemFactoryImpl.eINSTANCE.createParameter();
		parameter.setName(parameterName);
		return parameter;
	}

	/**
	 * This method creates a MeasuredParameter with a given name and default Unit.
	 * 
	 * @param parameterName the name of the MeasuredParameter
	 * @param defaultUnit the default unit of the MeasuredParameter
	 * @return the newly created MeasuredParameter
	 */
	public static MeasuredParameter createMeasuredParameter(String parameterName, Unit<?> defaultUnit) {
		MeasuredParameter measuredParameter = SystemFactoryImpl.eINSTANCE.createMeasuredParameter();
		measuredParameter.setName(parameterName);
		measuredParameter.setDefaultUnit(defaultUnit);
		return measuredParameter;
	}

	/**
	 * This method finds NamedElements by class and name contained in a given root element.
	 * 
	 * @param parent the root element containing the search set
	 * @param clazz the class of the NamedElement
	 * @param name the name of the NamedElement
	 * @param <T> the returned class
	 * @return a list of NamedElements having the given name and class
	 */
	@SuppressWarnings("unchecked")
	public static <T extends NamedElement> List<T> getChildrenByClassAndName(EObject parent, Class<T> clazz, String name) {
		List<T> result = new ArrayList<T>();
		if (parent == null) {
			return result;
		}
		TreeIterator<EObject> iterator = parent.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			if (eObject instanceof NamedElement) {
				NamedElement namedElement = (NamedElement) eObject;
				if (clazz.isInstance(namedElement)) {
					if (namedElement.getName().equals(name)) {

						result.add((T) namedElement);
					}

				}
			}
		}
		return result;
	}

	/**
	 * This method finds NamedElements in a Project by class and name.
	 * 
	 * @param parentProject the parent Project
	 * @param clazz the class of the NamedElements
	 * @param name the name of the NamedElements
	 * @param <T> the particular subclass of NamedElements
	 * @return a list of NamedElements
	 */
	@SuppressWarnings("unchecked")
	public static <T extends NamedElement> List<T> getProjectChildrenByClassAndName(ESLocalProject parentProject,
		Class<T> clazz, String name) {
		List<T> result = new ArrayList<T>();
		if (parentProject == null) {
			return result;
		}
		for (EObject eObject : parentProject.getAllModelElementsByClass(clazz)) {
			if (eObject instanceof NamedElement) {
				NamedElement namedElement = (NamedElement) eObject;
				if (clazz.isInstance(namedElement)) {
					if (namedElement.getName().equals(name)) {

						result.add((T) namedElement);
					}

				}
			}
		}
		return result;
	}

	/**
	 * This method finds NamedElements in a given container object by class.
	 * 
	 * @param parent the parent Object
	 * @param clazz the class of the NamedElements
	 * @param <T> the particular subclass of NamedElements
	 * @return a list of NamedElements
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<T> getChildrenByClass(EObject parent, Class<T> clazz) {
		List<T> result = new ArrayList<T>();
		if (parent == null) {
			return result;
		}

		TreeIterator<EObject> iterator = parent.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();

			if (clazz.isInstance(eObject)) {

				result.add((T) eObject);
			}

		}

		return result;
	}

	/**
	 * This method finds direct children of a parent object by class.
	 * 
	 * @param parent the parent Object
	 * @param clazz the class of the NamedElements
	 * @param <T> the particular subclass of NamedElements
	 * @return a list of NamedElements
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<T> getDirectChildrenByClass(EObject parent, Class<T> clazz) {
		List<T> result = new ArrayList<T>();
		if (parent == null) {
			return result;
		}

		List<EObject> childerenEObjects = parent.eContents();
		for (EObject childEObject : childerenEObjects) {

			if (clazz.isInstance(childEObject)) {

				result.add((T) childEObject);
			}

		}

		return result;
	}

	/**
	 * This method creates a Parameter with a given name and a source operation contained in a given Component.
	 * 
	 * @param parameterName the name of the Parameter
	 * @param operationWithOutput the source operation
	 * @param component the containing Component
	 * @return the newly created Parameter
	 */
	public static Parameter generateParameter(String parameterName, OperationWithOutput operationWithOutput,
		Component component) {
		List<Parameter> parameters = findParameterByName(parameterName, component);
		Parameter parameter = null;
		if (parameters.isEmpty()) {
			parameter = SystemFactoryImpl.eINSTANCE.createParameter();
			parameter.setName(parameterName);
			component.getParameters().add(parameter);
			parameter.setSourceOperation(operationWithOutput);

		} else {
			parameter = parameters.get(0);
		}
		parameter.setSourceOperation(operationWithOutput);
		return parameter;
	}

	/**
	 * This method finds Parameters by name contained in a given Component.
	 * 
	 * @param name the name of the Parameters to be found
	 * @param component the components where the Parameters to be found a re contained
	 * @return the found Parameters
	 */
	public static List<Parameter> findParameterByName(String name, Component component) {

		return getChildrenByClassAndName(component, Parameter.class, name);
	}

	/**
	 * This method finds Values by name contained in a given Project.
	 * 
	 * @param name the name of the Parameters to be found
	 * @param project the Project where the Parameters to be found a re contained
	 * @return the found Values
	 */
	public static Value findValueByName(String name, ESLocalProject project) {
		for (SystemModelElement systemModelElement : getProjectChildrenByClassAndName(project, Value.class, name)) {
			return (Value) systemModelElement;
		}
		return null;
	}

	/**
	 * This method creates an appropriate Value from a given name, value string, a source operation, and a project.
	 * 
	 * @param valueName the name of the new Value
	 * @param valueString the value string of the new Value
	 * @param operationWithOutput the source Operation
	 * @param project the containing project
	 * @return the newly created Value
	 */
	public static Value generateValue(String valueName, String valueString, OperationWithOutput operationWithOutput,
		ESLocalProject project) {
		try {
			BigDecimal bigDecimalValue = BigDecimal.valueOf(Double.valueOf(valueString));
			System.out.println(valueName + " = " + valueString);
			if (isInteger(bigDecimalValue, valueString)) {

				Integer integerValue = bigDecimalValue.intValue();

				return generateCounter(valueName, integerValue, operationWithOutput);

			} else {
				return generateDecimalNumber(valueName, bigDecimalValue, operationWithOutput, project);
			}
		} catch (NumberFormatException e) {
			System.out.println(valueString + " is not a Number");
		}

		return generateStringValue(valueName, valueString, operationWithOutput, project);
	}

	/**
	 * This method checks whether a BigDecimal value is also an integer.
	 * 
	 * @param bigDecimalValue the BigDecimal value
	 * @param valueString the the value as string
	 * @return true if the BigDecimal value is also an integer
	 */
	public static boolean isInteger(BigDecimal bigDecimalValue, String valueString) {
		if ((bigDecimalValue.precision() - bigDecimalValue.scale() == 0) && (!valueString.contains("."))) {
			return true;
		}

		return false;

	}

	private static Value generateDecimalNumber(String valueName, BigDecimal bigDecimalValue,
		OperationWithOutput operationWithOutput, ESLocalProject project) {

		List<DecimalNumber> decimalNumbers = getProjectChildrenByClassAndName(project, DecimalNumber.class, valueName);
		if (decimalNumbers.isEmpty()) {
			DecimalNumber newdecimalNumber = SystemFactoryImpl.eINSTANCE.createDecimalNumber();
			newdecimalNumber.setName(valueName);
			newdecimalNumber.setValue(bigDecimalValue);
			newdecimalNumber.setSourceOperation(operationWithOutput);
			operationWithOutput.getGeneratedElements().add(newdecimalNumber);
			return newdecimalNumber;

		} else {
			decimalNumbers.get(0).setValue(bigDecimalValue);
			decimalNumbers.get(0).setSourceOperation(operationWithOutput);
			return decimalNumbers.get(0);
		}
	}

	private static Value generateCounter(String valueName, Integer integerValue, OperationWithOutput operationWithOutput) {

		List<Counter> counters = getChildrenByClassAndName(operationWithOutput, Counter.class, valueName);
		if (counters.isEmpty()) {
			Counter newCounter = SystemFactoryImpl.eINSTANCE.createCounter();
			newCounter.setName(valueName);
			newCounter.setSourceOperation(operationWithOutput);
			newCounter.setValue(integerValue);
			operationWithOutput.getGeneratedElements().add(newCounter);
			return newCounter;

		} else {
			counters.get(0).setValue(integerValue);
			counters.get(0).setSourceOperation(operationWithOutput);
			return counters.get(0);
		}
	}

	/**
	 * This method finds a DecimalNumber by name contained in a given Project. If there are more then two candidates it
	 * returns the one which was found first.
	 * 
	 * @param valueName the name of the DecimalNumber to be found
	 * @param project the Project where the Parameters to be found a re contained
	 * @return the found Values
	 */
	public static DecimalNumber findDecimalNumberByName(String valueName, ESLocalProject project) {
		List<DecimalNumber> decimalNumbers = getProjectChildrenByClassAndName(project, DecimalNumber.class, valueName);
		return decimalNumbers.get(0);
	}

	private static Value generateStringValue(String valueName, String valueString,
		OperationWithOutput operationWithOutput, ESLocalProject project) {

		List<StringValue> stringValues = getProjectChildrenByClassAndName(project, StringValue.class, valueName);
		if (stringValues.isEmpty()) {
			StringValue newStringValue = SystemFactoryImpl.eINSTANCE.createStringValue();
			newStringValue.setSourceOperation(operationWithOutput);
			newStringValue.setName(valueName);
			newStringValue.setValue(valueString);
			operationWithOutput.getGeneratedElements().add(newStringValue);
			return newStringValue;

		} else {
			stringValues.get(0).setValue(valueString);
			stringValues.get(0).setSourceOperation(operationWithOutput);
			return stringValues.get(0);
		}
	}

	/**
	 * This method finds a Counter by name contained in a given Project. If there are more then two candidates it
	 * returns the one which was found first.
	 * 
	 * @param counterName the name of the Counter to be found
	 * @param project the Project where the Parameters to be found a re contained
	 * @return the found Counters
	 */
	public static Counter findCounterByName(String counterName, ESLocalProject project) {
		List<Counter> counters = getProjectChildrenByClassAndName(project, Counter.class, counterName);
		return counters.get(0);
	}

	/**
	 * This method finds a State by name contained in a given Component. If there are more then two candidates it
	 * returns the one which was found first.
	 * 
	 * @param stateName the name of the State to be found
	 * @param component the Component where the Parameters to be found a re contained
	 * @return the found State
	 */
	public static List<State> findStatesByName(String stateName, Component component) {
		List<State> states = new ArrayList<State>();
		for (State state : component.getStates()) {
			if (state.getName().equals(stateName)) {
				states.add(state);
			}
		}
		// If the component does not have this state look for it in supercomponents
		// States of subcomponents are not taken into account
		if (states.isEmpty() && component.eContainer() instanceof Component) {
			return findStatesByName(stateName, (Component) component.eContainer());
		} else {
			return states;
		}

	}

	/**
	 * This method creates a State with a given name in a Component from a source operation.
	 * 
	 * @param stateName the Name of the state
	 * @param operationWithOutput the source operation
	 * @param component the containing component
	 * @return the newly created State
	 */
	public static State generateState(String stateName, OperationWithOutput operationWithOutput, Component component) {
		List<State> states = findStatesByName(stateName, component);

		if (states.isEmpty()) {
			State state = SystemFactoryImpl.eINSTANCE.createState();
			state.setName(stateName);
			component.getStates().add(state);
			return state;
		} else {
			State state = states.get(0);
			state.setSourceOperation(operationWithOutput);
			return state;
		}

	}

	/**
	 * This method creates a DecimalNumber with a given name and value given as strings from a source operation.
	 * 
	 * @param valueName the Name of the DecimalNumber value
	 * @param valueString the value as string
	 * @param operationWithOutput the source operation
	 * @return the newly created DecimalNumber
	 */
	public static DecimalNumber generateDecimalNumber(String valueName, String valueString,
		OperationWithOutput operationWithOutput) {
		BigDecimal value = new BigDecimal(valueString);
		List<DecimalNumber> decimalNumbers = getChildrenByClassAndName(operationWithOutput, DecimalNumber.class,
			valueName);
		if (decimalNumbers.isEmpty()) {
			DecimalNumber newdecimalNumber = SystemFactoryImpl.eINSTANCE.createDecimalNumber();
			newdecimalNumber.setName(valueName);
			newdecimalNumber.setValue(value);
			newdecimalNumber.setSourceOperation(operationWithOutput);
			operationWithOutput.getGeneratedElements().add(newdecimalNumber);
			return newdecimalNumber;

		} else {
			decimalNumbers.get(0).setSourceOperation(operationWithOutput);
			return decimalNumbers.get(0);
		}
	}

	/**
	 * This method connects a Value and State bi-directionally.
	 * 
	 * @param state the State to be connected
	 * @param stateValue the Value to be connected
	 */
	public static void connect(State state, Value stateValue) {
		if (!state.getValues().contains(stateValue)) {
			state.getValues().add(stateValue);
		}

		if (!stateValue.getStates().contains(state)) {
			stateValue.getStates().add(state);
		}

	}

	/**
	 * This method creates a SpaceVector with a given name, coordinates given as BigDecimals and a source operation.
	 * 
	 * @param spaceVectorName the name of the SpaceVector
	 * @param xValue the x value of the SpaceVector
	 * @param yValue the y value of the SpaceVector
	 * @param zValue the z value of the SpaceVector
	 * @param operationWithOutput the source operation
	 * @return the newly created SpaceVector
	 */
	public static SpaceVector createSpaceVector(String spaceVectorName, BigDecimal xValue, BigDecimal yValue,
		BigDecimal zValue, OperationWithOutput operationWithOutput) {
		SpaceVector spaceVector = GeometryFactory.eINSTANCE.createSpaceVector();
		spaceVector.setName(spaceVectorName);
		spaceVector.setX(xValue);
		spaceVector.setY(yValue);
		spaceVector.setZ(zValue);
		return spaceVector;
	}

	/**
	 * This method creates a CalculatedDecimalNumber form an expression string in a DesignProcess.
	 * 
	 * @param expressionString the expression given as string
	 * @param designProcess the containing DesignProcess
	 * @return the created CalculatedDecimalNumber
	 */
	public static CalculatedDecimalNumber createCalculation(String expressionString, DesignProcess designProcess) {
		int equalsIndex = expressionString.indexOf("=");
		String name = expressionString.substring(0, equalsIndex);
		CalculatedDecimalNumber newFormula = DesignoperationsFactoryImpl.eINSTANCE.createCalculatedDecimalNumber();
		newFormula.setExpression(expressionString.substring(equalsIndex));
		newFormula.setName(name);
		return newFormula;
	}

	/**
	 * This method connects a CalculatedDecimalNumber with Values by name.
	 * 
	 * @param calculatedDecimalNumber the CalculatedDecimalNumber which is to be wired
	 * @param parameterValues a list of Values which serve as parameters of the expression
	 * @param component
	 */
	public static void wireCalculatedDecimalNumber(CalculatedDecimalNumber calculatedDecimalNumber,
		List<Value> parameterValues) {

		calculatedDecimalNumber.getProcessedElements().addAll(parameterValues);

	}

	/**
	 * This method creates a MeasuredValue which does not already contained as a child element of an operation.
	 * 
	 * @param valueName the name of the Value
	 * @param valueString the value of the MeasuredValue given as a string
	 * @param unit the unit of the MeasuredValue
	 * @param operationWithOutput the source operation
	 * @return the newly created MeasuredValue
	 */
	public static MeasuredValue generateUniqueMeasuredValue(String valueName, String valueString, Unit<?> unit,
		OperationWithOutput operationWithOutput) {

		BigDecimal bigDecimalValue = BigDecimal.valueOf(Double.valueOf(valueString));

		List<MeasuredValue> measuredValues = getChildrenByClassAndName(operationWithOutput, MeasuredValue.class,
			valueName);
		if (measuredValues.isEmpty()) {
			MeasuredValue newMeasuredValue = SystemFactoryImpl.eINSTANCE.createMeasuredValue();
			newMeasuredValue.setName(valueName);
			newMeasuredValue.setValue(bigDecimalValue);
			newMeasuredValue.setUnit(unit);
			newMeasuredValue.setSourceOperation(operationWithOutput);
			operationWithOutput.getGeneratedElements().add(newMeasuredValue);
			return newMeasuredValue;

		} else {
			return measuredValues.get(0);
		}

	}

	/**
	 * This method creates a new Component with a certain name from a source operation in a given container component.
	 * 
	 * @param componentName the name of the component
	 * @param operationWithOutput the source operation
	 * @param containerComponent the containing Component
	 * @return the newly created Component
	 */
	public static Component generateComponent(String componentName, OperationWithOutput operationWithOutput,
		Component containerComponent) {
		List<Component> components = getChildrenByClassAndName(containerComponent, Component.class, componentName);
		Component component = null;
		if (components.isEmpty()) {
			component = SystemFactoryImpl.eINSTANCE.createComponent();
			component.setName(componentName);
			containerComponent.getSubcomponents().add(component);

		} else {
			component = components.get(0);
		}
		component.setSourceOperation(operationWithOutput);
		return component;

	}

	/**
	 * This method finds a SpaceVector in a project by name. If there a more than one candidate, the one which was found
	 * first is returned.
	 * 
	 * @param vectorName the name of the SpaceVector
	 * @param project the project where the method searches
	 * @return the SpaceVector which was found first
	 */
	public static SpaceVector findVectorByName(String vectorName, ESLocalProject project) {

		return getChildrenByClassAndName(getProjectMainProcess(project), SpaceVector.class, vectorName).get(0);
	}

	/**
	 * This method generates a MeasuredValue having a name and value given as strings, a unit from a source operation.
	 * 
	 * @param valueName the name of the MeasuredValue
	 * @param valueString the name of the MeasuredValue
	 * @param unit the unit of the MeasuredValue
	 * @param operationWithOutput the source operation
	 * @return the newly created MeasuredValue
	 */
	public static MeasuredValue generateMeasuredValue(String valueName, String valueString, Unit<?> unit,
		OperationWithOutput operationWithOutput) {

		BigDecimal bigDecimalValue = BigDecimal.valueOf(Double.valueOf(valueString));

		MeasuredValue newMeasuredValue = SystemFactoryImpl.eINSTANCE.createMeasuredValue();
		newMeasuredValue.setName(valueName);
		newMeasuredValue.setValue(bigDecimalValue);
		newMeasuredValue.setUnit(unit);
		newMeasuredValue.setSourceOperation(operationWithOutput);
		operationWithOutput.getGeneratedElements().add(newMeasuredValue);
		return newMeasuredValue;

	}

	/**
	 * This method returns the first root component of a project.
	 * 
	 * @param project the project
	 * @return the first root Component
	 */
	public static Component getProjectMainComponent(ESLocalProject project) {

		for (EObject containedEObject : project.getModelElements()) {
			if (containedEObject instanceof Component) {
				return (Component) containedEObject;
			}
		}
		return null;
	}

	/**
	 * This method returns the first root DesignProcess.
	 * 
	 * @param project the project
	 * @return the first root DesignProcess
	 */
	public static DesignProcess getProjectMainProcess(ESLocalProject project) {

		for (EObject containedEObject : project.getModelElements()) {
			if (containedEObject instanceof DesignProcess) {
				return (DesignProcess) containedEObject;
			}
		}
		return null;
	}

	/**
	 * This method connects a Parameter and a Value bidirectionally.
	 * 
	 * @param parameter the Parameter to be connected
	 * @param value the Value to be connected
	 */
	public static void wireParameterAndValue(Parameter parameter, Value value) {
		if (!parameter.getValues().contains(value)) {
			parameter.getValues().add(value);
		}

	}

}
