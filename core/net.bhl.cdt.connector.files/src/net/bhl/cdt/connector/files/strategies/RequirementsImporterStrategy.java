/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.files.strategies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.measure.unit.NonSI;
import javax.measure.unit.Unit;
import javax.measure.unit.UnitFormat;

import net.bhl.cdt.connector.files.FilesPackage;
import net.bhl.cdt.connector.files.RequirementsImporter;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.system.Component;
import net.bhl.cdt.model.system.Parameter;
import net.bhl.cdt.model.system.Value;
import net.bhl.cdt.model.system.util.SystemHelper;
import net.bhl.cdt.model.util.FileUtils;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.ui.Activator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.emfstore.client.ESLocalProject;

/**
 * This strategy imports a Requirements.ini file.
 * 
 * @author martin.glas
 */
public class RequirementsImporterStrategy extends FileParserStrategy {

	@Override
	public void start(ProcessElement processElement) {

		if (processElement instanceof RequirementsImporter) {
			RequirementsImporter requirementsImporter = (RequirementsImporter) processElement;
			importRequirements(requirementsImporter);

		}

	}

	private void importRequirements(RequirementsImporter requirementsImporter) {
		ESLocalProject project = ModelHelper.getContainingProject(requirementsImporter);
		BufferedReader bufferedReader = null;

		String CDTPATH = Activator.getDefault().getPreferenceStore().getString("CDTPATH") + File.separator;

		try {
			bufferedReader = new BufferedReader(
				new FileReader(CDTPATH + requirementsImporter.getFileName().toString()));
			String lastLine = "";
			String line = bufferedReader.readLine();
			Component containerComponent = SystemHelper.getProjectMainComponent(project);
			if (line.startsWith("[Requirements]")) {
				UnitFormat.getInstance().alias(NonSI.DEGREE_ANGLE, "deg");
				UnitFormat.getInstance().alias(NonSI.FOOT, "feet");
				UnitFormat.getInstance().alias(NonSI.INCH, "inches");
				line = bufferedReader.readLine();
				Parameter newParameter = null;
				Component newComponent = null;
				Unit<?> newUnit = null;
				while (line != null) {
					// Check if a Parameter is declared
					if (line.startsWith(";")) {
						int unitindex = line.indexOf(" in ");
						String unitName = "";
						String parameterName = "";
						if (unitindex == -1) {
							newUnit = null;
							parameterName = line.substring(2);
						} else {
							unitName = line.substring(unitindex + 4);
							parameterName = line.substring(2, unitindex - 1);
						}
						newParameter = SystemHelper.generateParameter(parameterName, requirementsImporter,
							containerComponent);

						if (unitName != "") {
							newUnit = Unit.valueOf(unitName);
						} else {
							newUnit = Unit.ONE;
						}

					} else if (isComponentLine(line)) {
						if (isComponentLine(lastLine)) {
							containerComponent = newComponent;
						}
						String componentName = line.replace("[", "").replace("]", "");

						newComponent = SystemHelper.generateComponent(componentName, requirementsImporter,
							containerComponent);
					}

					else {
						int equalsIndex = line.indexOf("=");

						String valueName = line.substring(0, equalsIndex).trim();
						String valueString = line.substring(equalsIndex + 1);

						Value newValue = null;
						if (newUnit != null) {
							newValue = SystemHelper.generateUniqueMeasuredValue(valueName, valueString, newUnit,
								requirementsImporter);

						}

						else {
							newValue = SystemHelper
								.generateValue(valueName, valueString, requirementsImporter, project);
						}

						if (newParameter != null) {
							newValue.setParameter(newParameter);
							SystemHelper.wireParameterAndValue(newParameter, newValue);
						}
					}
					lastLine = line;
					line = bufferedReader.readLine();

				}
			}
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private boolean isComponentLine(String line) {

		return line.startsWith("[");
	}

	@Override
	public boolean isStartable(ProcessElement processElement) {
		if (processElement instanceof RequirementsImporter) {
			RequirementsImporter requirementsImporter = (RequirementsImporter) processElement;

			String CDTPATH = Activator.getDefault().getPreferenceStore().getString("CDTPATH");

			if ((requirementsImporter.getFileName() != null)
				&& (requirementsImporter.getFileName().equals("Requirements.ini")) && (CDTPATH != "")) {
				return FileUtils.exists(CDTPATH + File.separator + requirementsImporter.getFileName().toString());

			}
		}
		return false;
	}

	@Override
	public EClass getEClass() {
		return FilesPackage.Literals.REQUIREMENTS_IMPORTER;
	}
}
