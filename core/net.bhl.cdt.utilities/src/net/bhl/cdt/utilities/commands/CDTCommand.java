/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.utilities.commands;

import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;

/**
 * TODO: When we use new EMFStore version, replace this command with UnicaseCommand.
 * 
 * @see UnicaseCommand
 * @author Otto von Wesendonk
 */
public abstract class CDTCommand extends EMFStoreCommand {

	/**
	 * Checks objects for null and throws {@link CDTRuntimeException} in case of null.
	 * 
	 * @param objects objects to check
	 */
	protected void nullCheck(Object... objects) {
		nullCheck("Input was null.", objects);
	}

	/**
	 * Checks objects for null and throws {@link CDTRuntimeException} in case of null.
	 * 
	 * @param errorMessage which will be displayed in the exception
	 * @param objects to check
	 */
	protected void nullCheck(String errorMessage, Object... objects) {
		for (Object obj : objects) {
			if (obj == null) {
				throw new CDTRuntimeException(errorMessage);
			}
		}
	}
}
