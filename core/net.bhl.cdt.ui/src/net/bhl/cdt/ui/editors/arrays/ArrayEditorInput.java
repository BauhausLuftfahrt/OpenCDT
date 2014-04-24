/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors.arrays;

import net.bhl.cdt.model.datatypes.Array;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * This  EditorInput class passes all relevant information for the initialization of the ArrayEditor.
 * @author martin.glas
 *
 */
public class ArrayEditorInput implements IEditorInput {

	private Array array;
	private ECPProject ecpProject;

	
	/**
	 * This is the constructor of the ArrayEditor.
	 * @param array the Array object which should be displayed
	 * @param ecpProject the ECPProjekct where the array is versioned
	 */
	public ArrayEditorInput(Array array, ECPProject ecpProject) {
		this.array = array;
		this.setECPProject(ecpProject);
	}

	/**
	 * This Method returns the array which has to be edited.
	 * @return the Array which has to be edited
	 */
	
	public Array getArray() {
		return array;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return "ArrayEditorInput";
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return "ArrayEditorInput";
	}

	/**
	 * Getter.
	 * @return ecpProject
	 */
	public ECPProject getECPProject() {
		return ecpProject;
	}

	/**
	 * Setter.
	 * @param ecpProject ECPProject
	 */
	public void setECPProject(ECPProject ecpProject) {
		this.ecpProject = ecpProject;
	}
	

    /**
     * Custom equals() for this class.
     *
     * @param obj the compared object.
     * @return the boolean state. {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
            if (obj instanceof ArrayEditorInput) {
            		ArrayEditorInput other = (ArrayEditorInput) obj;
                    boolean ret = array.equals(other.array);
                    return ret;
            }
            return false;
    }

}
