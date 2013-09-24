/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors.function;

import javax.units.Unit;

import net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelFactory;
import net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.datatypes.DatatypesPackage;
import net.bhl.cdt.utilities.units.Quantity;
import net.bhl.cdt.utilities.units.UnitsPackage;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.internal.client.model.ESWorkspaceProviderImpl;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;

/**
 * This class has several functions which can connect properties of a Function to SWT controls by using Databinding.
 * 
 * @author Sebastian Höcht
 */
public final class DataBindingHelper {

	private DataBindingHelper() {
	}

	/**
	 * @param quantity the SWT Control of the Function Parameter's quantity
	 * @param descriptor the descriptor of the Function's Parameter
	 */
	public static void bindQuantity(Combo quantity, ParameterDescriptor descriptor) {
		EStructuralFeature nameFeature = descriptor.eClass().getEStructuralFeature("quantity");

		IObservableValue model = EMFEditObservables.observeValue(ESWorkspaceProviderImpl.getInstance()
			.getEditingDomain(), descriptor, nameFeature);

		EMFDataBindingContext quantityDBC = new EMFDataBindingContext();
		UpdateValueStrategy toModel = new UpdateValueStrategy() {
			@Override
			public Object convert(Object value) {
				EEnumLiteral literal = UnitsPackage.Literals.QUANTITY.getEEnumLiteralByLiteral(value.toString());
				Quantity quantity = Quantity.get(literal.toString());
				return quantity;
			}
		};
		UpdateValueStrategy toSWT = new UpdateValueStrategy() {
			@Override
			public Object convert(Object value) {
				return (((Quantity) value).getLiteral());
			}
		};
		quantityDBC.bindValue(SWTObservables.observeSelection(quantity), model, toModel, toSWT);
	}

	/**
	 * @param unit the SWT Control of the unit of a Function Parameter
	 * @param descriptor the descriptor of a Parameter
	 */
	public static void bindUnit(Text unit, ParameterDescriptor descriptor) {
		EStructuralFeature nameFeature = descriptor.eClass().getEStructuralFeature("unit");

		IObservableValue model = EMFEditObservables.observeValue(ESWorkspaceProviderImpl.getInstance()
			.getEditingDomain(), descriptor, nameFeature);

		EMFDataBindingContext unitDBC = new EMFDataBindingContext();
		UpdateValueStrategy toModel = new UpdateValueStrategy() {
			@Override
			public Object convert(Object value) {
				return Unit.valueOf(value.toString());
			}
		};
		UpdateValueStrategy toSWT = new UpdateValueStrategy() {
			@Override
			public Object convert(Object value) {
				if (value != null) {
					return ((Unit) value).toString();
				}
				return value;
			}
		};
		unitDBC.bindValue(SWTObservables.observeText(unit), model, toModel, toSWT);
	}

	/**
	 * @param swtObservable .
	 * @param modelElement the modelElement where the feature shall be bound to
	 * @param featureName the name of the feature of the modelElement
	 */
	public static void bindValue(ISWTObservableValue swtObservable, EObject modelElement, String featureName) {
		EStructuralFeature nameFeature = modelElement.eClass().getEStructuralFeature(featureName);

		IObservableValue model = EMFEditObservables.observeValue(ESWorkspaceProviderImpl.getInstance()
			.getEditingDomain(), modelElement, nameFeature);

		EMFDataBindingContext dbc = new EMFDataBindingContext();
		dbc.bindValue(swtObservable, model);
	}

	/**
	 * Binds combo and descriptor for data type feature.
	 * 
	 * @param combo -- The target element for binding (gui)
	 * @param descriptor -- The model element for binding
	 */
	public static void bindDataType(Combo combo, ParameterDescriptor descriptor) {
		EStructuralFeature nameFeature = BasecalculationmodelPackage.Literals.PARAMETER_DESCRIPTOR__DATA_TYPE;

		IObservableValue model = EMFEditObservables.observeValue(ESWorkspaceProviderImpl.getInstance()
			.getEditingDomain(), descriptor, nameFeature);

		EMFDataBindingContext quantityDBC = new EMFDataBindingContext();
		UpdateValueStrategy toModel = new UpdateValueStrategy() {
			@Override
			public Object convert(Object value) {
				return DatatypesPackage.eINSTANCE.getEClassifier((String) value);
			}
		};
		UpdateValueStrategy toSWT = new UpdateValueStrategy() {
			@Override
			public Object convert(Object value) {
				if (value instanceof EClassifier) {
					return ((EClassifier) value).getName();
				}
				return value;
			}
		};
		quantityDBC.bindValue(SWTObservables.observeSelection(combo), model, toModel, toSWT);
	}

	/**
	 * @param descriptors the list of descriptors where a parameter shall be added
	 * @return the selectionListener adding a description on a Selection
	 */
	public static SelectionListener addParameterListener(final EList<ParameterDescriptor> descriptors) {
		SelectionListener listener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CDTCommand command = new CDTCommand() {

					@Override
					protected void doRun() {
						ParameterDescriptor parameterDescriptor = BasecalculationmodelFactory.eINSTANCE
							.createParameterDescriptor();
						parameterDescriptor.setLabel("new parameter");
						descriptors.add(parameterDescriptor);
					}
				};
				command.execute();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		};
		return listener;
	}

	/**
	 * @param descriptors the list of Parameter Descriptions a descriptor shall be removed
	 * @param descriptor the parameter descriptor, that shall be removed
	 * @return the SelectionListener removing a descriptor from the list.
	 */
	public static SelectionListener removeParameterListener(final EList<ParameterDescriptor> descriptors,
		final ParameterDescriptor descriptor) {
		SelectionListener listener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CDTCommand command = new CDTCommand() {

					@Override
					protected void doRun() {
						descriptors.remove(descriptor);
					}
				};
				command.execute();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		};
		return listener;
	}
}
