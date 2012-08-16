/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors.calculation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * Input for the calculation editor.
 * 
 * @author Stephan Leutenmayr
 */
public class CalculationEditorInput implements IEditorInput {

	private Calculation calculation;
	private List<String> functionIDs;

	/**
	 * moo.
	 * @param modelElement Calculation
	 */
	public CalculationEditorInput(Calculation modelElement) {
		this.setCalculation(modelElement);
	}

	/**
	 * 
	 * @param modelElement calculation
	 */
	public void setCalculation(Calculation modelElement) {
		this.calculation = modelElement;
	}

	/**
	 * 
	 * @return the calculation
	 */
	public Calculation getCalculation() {
		return calculation;
	}
	
	public List<String> getFunctionIDs()
	{
		List<String> tmpList = new ArrayList<String>();
		for (Function fun : CalculationRepositoryManager.getInstance().getFunctions(UtilitiesHelper.getProjectId(getCalculation())))
		{
			tmpList.add(fun.getFunctionID());
		}
		Collections.sort(tmpList);
		return tmpList;
	}
	
	public void setFunctionIDs(List<String> ids)
	{
		//do nothing
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
