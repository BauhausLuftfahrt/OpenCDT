/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors.calculationset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * Input for the calculation editor.
 * 
 * @author Stephan Leutenmayr
 */
public class CalculationSetEditorInput implements IEditorInput {

	private CalculationSet calculationSet;


	/**
	 * moo.
	 * @param modelElement Calculation
	 */
	public CalculationSetEditorInput(CalculationSet modelElement) {
		this.setCalculationSet(modelElement);
	}

	/**
	 * 
	 * @param modelElement calculation
	 */
	public void setCalculationSet(CalculationSet modelElement) {
		this.calculationSet = modelElement;
	}

	/**
	 * 
	 * @return the calculation
	 */
	public CalculationSet getCalculationSet() {
		return calculationSet;
	}
		
	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Parameter mapper";
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return "An Editor for mapping parameters";
	}

}
