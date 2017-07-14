/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.process.selection.strategies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.selection.HighestValueCriterion;
import net.bhl.cdt.model.process.selection.NameCriterion;
import net.bhl.cdt.model.process.selection.SelectedMeasuredValue;
import net.bhl.cdt.model.process.selection.SelectedValue;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.ValueSelectionCriterion;
import net.bhl.cdt.model.system.MeasuredValue;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.emf.ecore.EClass;

/**
 * This strategy selects a measured value applying Criteria.
 * 
 * @author martin.glas
 */
public class SelectedMeasuredValueStrategy implements OperationStrategy {

	@Override
	public void start(ProcessElement processElement) {
		// cast process element to MeasuredValueSelection
		if (processElement instanceof SelectedMeasuredValue) {
			SelectedMeasuredValue selectedMeasuredValue = (SelectedMeasuredValue) processElement;

			// get all Values of the project
			List<MeasuredValue> measuredValues = new ArrayList<MeasuredValue>(ModelHelper.getContainingProject(
				selectedMeasuredValue).getAllModelElementsByClass(MeasuredValue.class));

			// remove selected Values
			List<SelectedValue> valuesToRemove = new ArrayList<SelectedValue>();
			for (MeasuredValue measuredValue : measuredValues) {
				if (measuredValue instanceof SelectedValue) {
					valuesToRemove.add((SelectedValue) measuredValue);
				}
			}

			measuredValues.removeAll(valuesToRemove);

			if (!measuredValues.isEmpty()) {

				// put them in a Map with scores
				HashMap<MeasuredValue, Double> scoredMeasuredValues = new HashMap<MeasuredValue, Double>();
				for (MeasuredValue measuredValue : measuredValues) {
					scoredMeasuredValues.put(measuredValue, 0.0);
				}

				// evaluate Criteria
				for (ValueSelectionCriterion valueSelectionCriterion : selectedMeasuredValue.getAppliedCriteria()) {

					if (valueSelectionCriterion instanceof NameCriterion) {
						NameCriterion nameCriterion = (NameCriterion) valueSelectionCriterion;
						evaluateNameCriterion(nameCriterion, scoredMeasuredValues);

					}

					if (valueSelectionCriterion instanceof HighestValueCriterion) {
						HighestValueCriterion highestValueCriterion = (HighestValueCriterion) valueSelectionCriterion;
						evaluateHighestValueCriterion(highestValueCriterion, measuredValues, scoredMeasuredValues);

					}

				}

				List<MeasuredValue> topScoringMeasuredValues = new ArrayList<MeasuredValue>();
				topScoringMeasuredValues.add(measuredValues.get(0));
				for (Map.Entry<MeasuredValue, Double> scoredMeasuredValue : scoredMeasuredValues.entrySet()) {
					int comparatorResult = scoredMeasuredValue.getValue().compareTo(
						scoredMeasuredValues.get(topScoringMeasuredValues.get(0)));
					if (comparatorResult > 0) {
						topScoringMeasuredValues.clear();
						topScoringMeasuredValues.add(scoredMeasuredValue.getKey());

					} else if (comparatorResult == 0) {
						topScoringMeasuredValues.add(scoredMeasuredValue.getKey());
					}

				}

				// evaluate Argument

				// link to measured value
				selectedMeasuredValue.getSelectedValues().clear();
				selectedMeasuredValue.getSelectedValues().addAll(topScoringMeasuredValues);
				// copy measured value
				selectedMeasuredValue.setValue(((MeasuredValue) selectedMeasuredValue.getSelectedValues().get(0))
					.getValue());
				selectedMeasuredValue.setUnit(((MeasuredValue) selectedMeasuredValue.getSelectedValues().get(0))
					.getUnit());
				selectedMeasuredValue.setName(((MeasuredValue) selectedMeasuredValue.getSelectedValues().get(0))
					.getName());
			}
		}

	}

	private void evaluateHighestValueCriterion(HighestValueCriterion highestValueCriterion,
		List<MeasuredValue> measuredValues, HashMap<MeasuredValue, Double> scoredMeasuredValues) {
		for (Map.Entry<MeasuredValue, Double> scoredMeasuredValue : scoredMeasuredValues.entrySet()) {

			if (hasHigestValue(measuredValues.indexOf(scoredMeasuredValue.getKey()), measuredValues)) {
				scoredMeasuredValue.setValue(scoredMeasuredValue.getValue() + 1.0);

			}
		}

	}

	private void evaluateNameCriterion(NameCriterion nameCriterion, HashMap<MeasuredValue, Double> scoredMeasuredValues) {
		for (Map.Entry<MeasuredValue, Double> scoredMeasuredValue : scoredMeasuredValues.entrySet()) {
			if (scoredMeasuredValue.getKey().getName().equals(nameCriterion.getValueName())) {
				scoredMeasuredValue.setValue(scoredMeasuredValue.getValue() + 1.0);
			} else if (!scoredMeasuredValue.getKey().getName().contains((nameCriterion.getValueName()))) {
				scoredMeasuredValue.setValue(scoredMeasuredValue.getValue() - 1.0);
			}
		}

	}

	private boolean hasHigestValue(int index, List<MeasuredValue> measuredValues) {
		MeasuredValue candidateMeasuredValue = measuredValues.get(index);
		for (MeasuredValue measuredValue : measuredValues) {
			if (candidateMeasuredValue.getValue().compareTo(measuredValue.getValue()) < 0) {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean isStartable(ProcessElement processElement) {

		return true;
	}

	@Override
	public EClass getEClass() {
		return SelectionPackage.Literals.SELECTED_MEASURED_VALUE;
	}

}
