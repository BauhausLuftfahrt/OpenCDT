/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.commands;

import net.bhl.cdt.exceptions.CDTRuntimeException;

import org.eclipse.emf.common.command.AbstractCommand;

/**
 * @see UnicaseCommandWithResult
 * @author Otto von Wesendonk
 * @param <T> result type
 */

public abstract class CDTCommandWithResult<T> extends AbstractCommand {
	private T result;

	/**
	 * Checks objects for null and throws {@link CDTRuntimeException} in case of null.
	 * 
	 * @param objects objects to check
	 */
	protected void nullCheck(Object... objects) {
		nullCheck("Input was null.", objects);
	}

	/**
	 * Execute the command. {@link #commandBody()}
	 */
	public void execute() {
		result = doRun();
		// commandBody();
	}

	/**
	 * {@link #execute()}.
	 * 
	 * @return result
	 */
	public T run() {
		this.execute();
		return result;
	}

	/**
	 * {@link #doRun()}. protected void commandBody() { doRun(); }
	 */

	/**
	 * to be implemented.
	 * 
	 * @return result
	 */
	protected abstract T doRun();

	/**
	 * Not supported.
	 */
	public void redo() {
		// do nothing
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
