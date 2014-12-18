/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.strategies;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter;
import net.bhl.cdt.connector.avl.avlprocess.AvlprocessFactory;
import net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage;
import net.bhl.cdt.connector.avl.avlprocess.VariableSweep;
import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.designoperations.util.FileGeneratorHelper;
import net.bhl.cdt.model.util.FileUtils;
import net.bhl.cdt.ui.Activator;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EClass;

/**
 * This strategy generates a AVL process file.
 * 
 * @author martin.glas
 */
public class AVLProcessGeneratorStrategy implements OperationStrategy {

	@Override
	public void start(ProcessElement processElement) {
		if (processElement instanceof AVLProcessGenerator) {
			AVLProcessGenerator avlProcessGenerator = (AVLProcessGenerator) processElement;
			avlProcessGenerator.setRuncaseCounter(1);
			avlProcessGenerator.getAvlResultImporters().clear();
			FileWriter processFileWriter = null;
			FileWriter commandFileWriter = null;
			try {
				File avlEngine = new File(Activator.getDefault().getPreferenceStore().getString("AVLPATH"));
				String avlProcessPath = avlEngine.getParent() + File.separator + avlProcessGenerator.getFileName();
				File file = new File(avlProcessPath);
				processFileWriter = new FileWriter(file, false);
				generateRunCases(avlProcessGenerator, processFileWriter);

				File commandFile = new File(avlEngine.getParent() + File.separator
					+ avlProcessGenerator.getCommandFileName().toString());
				commandFileWriter = new FileWriter(commandFile, false);
				generateCommandFile(avlProcessGenerator, commandFileWriter);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					processFileWriter.flush();
					processFileWriter.close();
					commandFileWriter.flush();
					commandFileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	private void generateCommandFile(AVLProcessGenerator avlProcessGenerator, FileWriter fileWriter) throws IOException {
		File avlProcessFile = new File(avlProcessGenerator.getCommandFileName());
		int fileSeperatorIndex = avlProcessFile.getName().indexOf(".");
		String processFileName = "avl" + avlProcessFile.getName().subSequence(0, fileSeperatorIndex);
		if (avlProcessGenerator.getRuncaseCounter() > 1) {
			FileGeneratorHelper.writeLine("OPER", fileWriter);
			for (int i = 1; i < avlProcessGenerator.getRuncaseCounter(); i++) {
				FileGeneratorHelper.writeLine(String.valueOf(i), fileWriter);
				FileGeneratorHelper.writeLine("X", fileWriter);
				FileGeneratorHelper.writeLine("W", fileWriter);
				String fullResultFileName = processFileName + String.valueOf(i) + ".out";
				FileGeneratorHelper.writeLine(fullResultFileName, fileWriter);
				// AVLResultImporter avlResultImporter = AvlFactory.eINSTANCE.createAVLResultImporter();
				// avlResultImporter.setFileURL(avlFolder + "/" + fullResultFileName);
				// avlResultImporter.setName(fullResultFileName);
				// avlSubProcess.getDesignProcessElements().add(avlResultImporter);
			}

		}
	}

	private void generateRunCases(AVLProcessGenerator avlProcessGenerator, FileWriter fileWriter) throws IOException {
		if (!avlProcessGenerator.getVariableSweeps().isEmpty()) {

			// Iterator<VariableSweep> variableSweepIterator = avlProcessGenerator.getVariableSweeps().iterator();
			List<String> sweppedDimensions = new ArrayList<String>();
			HashMap<String, BigDecimal> dimensionValues = new HashMap<String, BigDecimal>();
			sweepDimension(avlProcessGenerator, 0, sweppedDimensions, dimensionValues, fileWriter);

		}
	}

	private void sweepDimension(AVLProcessGenerator avlProcessGenerator, int dimension, List<String> sweppedDimensions,
		HashMap<String, BigDecimal> dimensionValues, FileWriter fileWriter) throws IOException {
		VariableSweep variableSweep = avlProcessGenerator.getVariableSweeps().get(dimension);
		if (variableSweep.getVariableDelta().getValue().compareTo(BigDecimal.ZERO) == 0) {
			dimensionValues.put(variableSweep.getName(), variableSweep.getVariableStart().getValue());
			if (avlProcessGenerator.getVariableSweeps().size() > dimension + 1) {
				sweepDimension(avlProcessGenerator, dimension + 1, sweppedDimensions, dimensionValues, fileWriter);

			} else {
				writeRunCase(avlProcessGenerator, dimensionValues, sweppedDimensions, fileWriter);

			}
		} else {
			if (!sweppedDimensions.contains(variableSweep.getName())) {
				sweppedDimensions.add(variableSweep.getName());
			}

			for (BigDecimal sweppedvalue = variableSweep.getVariableStart().getValue(); !(sweppedvalue

			.compareTo(variableSweep.getVariableEnd().getValue()) == 1); sweppedvalue = sweppedvalue.add(variableSweep
				.getVariableDelta().getValue())) {
				dimensionValues.put(variableSweep.getName(), sweppedvalue);
				if (avlProcessGenerator.getVariableSweeps().size() > dimension + 1) {
					sweepDimension(avlProcessGenerator, dimension + 1, sweppedDimensions, dimensionValues, fileWriter);

				} else {
					writeRunCase(avlProcessGenerator, dimensionValues, sweppedDimensions, fileWriter);

				}

			}
		}

	}

	private void writeRunCase(AVLProcessGenerator avlProcessGenerator, HashMap<String, BigDecimal> dimensionValues,
		List<String> sweppedDimensions, FileWriter fileWriter) throws IOException {
		if (avlProcessGenerator.getRuncaseCounter() > 1) {
			FileGeneratorHelper.writeLine("", fileWriter);
			FileGeneratorHelper.writeLine("", fileWriter);
		}

		FileGeneratorHelper.writeLine("---------------------------------------------", fileWriter);
		FileGeneratorHelper.write("Run case  " + avlProcessGenerator.getRuncaseCounter() + ":", fileWriter);
		for (Map.Entry<String, BigDecimal> entry : dimensionValues.entrySet()) {
			if (sweppedDimensions.contains(entry.getKey())) {
				String string = "  " + entry.getKey() + " " + entry.getValue().toString();
				FileGeneratorHelper.write(string, fileWriter);
			}

		}
		FileGeneratorHelper.writeLine("", fileWriter);
		FileGeneratorHelper.writeLine("", fileWriter);
		for (VariableSweep varirableSweep : avlProcessGenerator.getVariableSweeps()) {
			String entryName = varirableSweep.getName();
			BigDecimal entryValue = dimensionValues.get(entryName);
			FileGeneratorHelper.writeLine(
				" " + StringUtils.rightPad(entryName, 13) + "->  " + StringUtils.rightPad(entryName, 13) + "=   "
					+ entryValue, fileWriter);

		}
		avlProcessGenerator.setRuncaseCounter(avlProcessGenerator.getRuncaseCounter() + 1);
		File avlProcessFile = new File(avlProcessGenerator.getCommandFileName());
		int fileSeperatorIndex = avlProcessFile.getName().indexOf(".");
		String processFileName = "avl" + avlProcessFile.getName().subSequence(0, fileSeperatorIndex);
		if (avlProcessGenerator.getRuncaseCounter() > 1) {

			String fullResultFileName = processFileName + String.valueOf(avlProcessGenerator.getRuncaseCounter() - 1)
				+ ".out";
			AVLResultImporter avlResultImporter = AvlprocessFactory.eINSTANCE.createAVLResultImporter();
			avlResultImporter.setFileName(fullResultFileName);
			avlResultImporter.setName(fullResultFileName);
			avlProcessGenerator.getAvlResultImporters().add(avlResultImporter);
		}
	}

	@Override
	public boolean isStartable(ProcessElement processElement) {
		if (processElement instanceof AVLProcessGenerator) {
			AVLProcessGenerator avlProcessGenerator = (AVLProcessGenerator) processElement;

			if ((avlProcessGenerator.getFileName().endsWith(".run"))
				&& FileUtils.exists(Activator.getDefault().getPreferenceStore().getString("AVLPATH"))) {
				for (VariableSweep variableSweep : avlProcessGenerator.getVariableSweeps()) {
					if (variableSweep.getName().isEmpty()) {
						return false;
					}

					if ((variableSweep.getVariableStart() == null) || (variableSweep.getVariableEnd() == null)
						|| (variableSweep.getVariableDelta() == null)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public EClass getEClass() {
		return AvlprocessPackage.Literals.AVL_PROCESS_GENERATOR;
	}
}
