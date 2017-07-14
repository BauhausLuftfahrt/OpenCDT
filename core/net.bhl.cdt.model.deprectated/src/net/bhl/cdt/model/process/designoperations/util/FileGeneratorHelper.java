/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.process.designoperations.util;

import java.io.FileWriter;
import java.io.IOException;

public final class FileGeneratorHelper {

	public static void writeLine(String string, FileWriter fileWriter) throws IOException {
		fileWriter.write(string);
		fileWriter.write(System.getProperty("line.separator"));

	}

	public static void write(String string, FileWriter fileWriter) throws IOException {
		fileWriter.write(string);
	}
}
