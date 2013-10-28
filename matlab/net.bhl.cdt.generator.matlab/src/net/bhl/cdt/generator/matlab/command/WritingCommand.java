/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.generator.matlab.command;

import org.eclipse.emf.ecore.EObject;

/**
 * Used to collect writing Parameters that can be executed with execute.
 * 
 * @author David Otter
 *
 */
class WritingCommand {
	
	private GenerateMatlabScriptCommand command;
	private EObject aircraftModelObject;
	private int tab;
	private Boolean isAnonymous;
	private String root;
	
	/**
	 * Constructor.
	 * 
	 * @param command .
	 * @param aircraftModelObject .
	 * @param tab .
	 * @param isAnonymous .
	 * @param root .
	 */
	WritingCommand(GenerateMatlabScriptCommand command, EObject aircraftModelObject, int tab,
			Boolean isAnonymous, String root){
		this.command = command;
		this.aircraftModelObject = aircraftModelObject;
		this.tab = tab;
		this.isAnonymous = isAnonymous;
		this.root = root;
	}

	/**
	 * execute writeElement with saved arguments.
	 */
	protected void execute() {
		command.writeElement(aircraftModelObject, tab, isAnonymous, root);
	}

}
