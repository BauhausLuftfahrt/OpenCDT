/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.files.strategies;

import java.io.File;

import net.bhl.cdt.connector.files.FileOperation;
import net.bhl.cdt.connector.files.FileParser;
import net.bhl.cdt.connector.files.FilesPackage;
import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.util.FileUtils;
import net.bhl.cdt.ui.Activator;

import org.eclipse.emf.ecore.EClass;

public class FileParserStrategy implements OperationStrategy {

	@Override
	public boolean isStartable(ProcessElement processElement) {
		if (processElement instanceof FileOperation) {
			FileParser fileParser = (FileParser) processElement;
			String CDTPATH = Activator.getDefault().getPreferenceStore().getString("CDTPATH");
			if (fileParser.getFileName() != null) {
				return FileUtils.exists(CDTPATH + File.separator + fileParser.getFileName());

			}
		}
		return false;

	}

	@Override
	public void start(ProcessElement processElement) {
		// TODO Auto-generated method stub

	}

	@Override
	public EClass getEClass() {
		return FilesPackage.Literals.FILE_PARSER;
	}

}
