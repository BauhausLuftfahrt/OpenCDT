/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.generator.matlab.command;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * Help methods for the Converter.
 * 
 * @author David Otter
 * 
 */
public final class WriteHelper {

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
	
	/**
	 * Get the value of the name Attribute or otherwise the toString ID of the
	 * EObject.
	 * 
	 * @param eObject
	 * @return
	 */
	public static String getName(EObject eObject) {
		Object nameObject = null;
		for (EAttribute attribute : eObject.eClass().getEAllAttributes()) {
			if (attribute.getName().toLowerCase().equals("name")) {
				nameObject = eObject.eGet(attribute);
			}
		}
		String name;
		if (nameObject == null || ((String) nameObject).isEmpty()) {
			name = (String) eObject.toString().subSequence(0,
					(eObject.toString() + ' ').indexOf(' '));
		} else {
			name = (String) nameObject;
		}
		name = name.replace(".", "_");
		name = name.replace("@", "_");
		return name;
	}

	
}
