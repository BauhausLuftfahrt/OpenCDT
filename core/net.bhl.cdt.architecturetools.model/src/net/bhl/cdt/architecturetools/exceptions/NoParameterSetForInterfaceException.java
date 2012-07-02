/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools.exceptions;

/**
 * Exception class to be used when an interface does not refer to an parameter.
 * @author sven.ziemer
 *
 */
public class NoParameterSetForInterfaceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor, reusing the superclass's constructor.
	 */
	public NoParameterSetForInterfaceException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor, reusing the superclass's constructor.
	 * @param arg0 a String
	 */
	public NoParameterSetForInterfaceException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor, reusing the superclass's constructor.
	 * @param arg0 an instance of class Throwable
	 */
	public NoParameterSetForInterfaceException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor, reusing the superclass's constructor.
	 * @param arg0 a String
	 * @param arg1 an instance of class Throwable
	 */
	public NoParameterSetForInterfaceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
