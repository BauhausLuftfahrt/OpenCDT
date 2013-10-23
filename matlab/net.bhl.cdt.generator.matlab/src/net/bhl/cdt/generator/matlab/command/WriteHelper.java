/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.generator.matlab.command;

/**
 * Help methods for the Converter.
 * 
 * @author David Otter
 * 
 */
final class WriteHelper {

	/**
	 * Write Helper provides only static methods.
	 */
	private WriteHelper() {
	}

	private static final String COMMENT = "%\n% Generated with Bauhaus Luftfahrt Matlab Converter\n%\n";

	/**
	 * @return the head comment of the .m file
	 */
	public static String getComment() {
		return COMMENT;
	}
}
