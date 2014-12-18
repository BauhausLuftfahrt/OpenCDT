/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import javax.measure.unit.Unit;

import net.bhl.cdt.connector.avl.AVL;
import net.bhl.cdt.connector.avl.AvlFactory;
import net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelFactory;
import net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelFactoryImpl;
import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter;
import net.bhl.cdt.connector.avl.avlprocess.AvlprocessFactory;
import net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessFactoryImpl;
import net.bhl.cdt.connector.avl.ui.cheat.CheatHelper;
import net.bhl.cdt.connector.files.GeometryImporter;
import net.bhl.cdt.connector.files.RequirementsImporter;
import net.bhl.cdt.connector.files.impl.FilesFactoryImpl;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.designoperations.Assumption;
import net.bhl.cdt.model.process.designoperations.DesignoperationsFactory;
import net.bhl.cdt.model.process.impl.ProcessFactoryImpl;
import net.bhl.cdt.model.process.selection.HighestValueCriterion;
import net.bhl.cdt.model.process.selection.NameCriterion;
import net.bhl.cdt.model.process.selection.SelectedMeasuredValue;
import net.bhl.cdt.model.process.selection.SelectionFactory;
import net.bhl.cdt.model.process.selection.ValueSelection;
import net.bhl.cdt.model.system.Component;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.MeasuredParameter;
import net.bhl.cdt.model.system.SystemFactory;
import net.bhl.cdt.model.system.util.SystemHelper;
import net.bhl.cdt.ui.Activator;

import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.junit.Test;

/**
 * This collection of tests checks the functionality of OpenCDT components and a basic use case.
 * 
 * @author martin.glas
 */
public class CodaDemoTest {
	/**
	 * This method test the RequirementsParser.
	 */
	@Test
	public void testRequirementsParser() {

		ESLocalProject testProject = createTestproject();
		DesignProcess testProcess = ProcessFactoryImpl.eINSTANCE.createDesignProcess();
		testProcess.setName("Test Process");
		testProject.getModelElements().add(testProcess);
		Assumption testAssumption = DesignoperationsFactory.eINSTANCE.createAssumption();
		testAssumption.setName("TestAssumption");
		SystemHelper.getProjectMainProcess(testProject).getDesignProcessElements().add(testAssumption);
		Component component = SystemFactory.eINSTANCE.createComponent();
		component.setName("TestComponent");
		component.setSourceOperation(testAssumption);
		testProject.getModelElements().add(component);

		RequirementsImporter requirementsImporter = FilesFactoryImpl.eINSTANCE.createRequirementsImporter();

		requirementsImporter.setFileName("Requirements.ini");
		testProcess.getDesignProcessElements().add(requirementsImporter);
		assertEquals("Requirements.ini", requirementsImporter.getFileName().toString());

		requirementsImporter.start();

		// Mach 0.0
		assertEquals(BigDecimal.valueOf(0.3),
			((DecimalNumber) SystemHelper.findValueByName("mach", testProject)).getValue());
		// Xref 0.50
		assertEquals(BigDecimal.valueOf(0.50),
			((DecimalNumber) SystemHelper.findValueByName("xref", testProject)).getValue());
		// Yref 0.0
		assertEquals(BigDecimal.valueOf(0.0),
			((DecimalNumber) SystemHelper.findValueByName("yref", testProject)).getValue());
		// Zref 0.0
		assertEquals(BigDecimal.valueOf(0.0),
			((DecimalNumber) SystemHelper.findValueByName("zref", testProject)).getValue());
		// alpha 0.00000
		assertEquals(BigDecimal.valueOf(0.0),
			((DecimalNumber) SystemHelper.findValueByName("alphastart", testProject)).getValue());
		// beta 0.00000
		assertEquals(BigDecimal.valueOf(0.0),
			((DecimalNumber) SystemHelper.findValueByName("betastart", testProject)).getValue());

		// aileron 0.00000
		assertEquals(BigDecimal.valueOf(0.0),
			((DecimalNumber) SystemHelper.findValueByName("aileronstart1", testProject)).getValue());

	}

	/**
	 * This method tests the GeometryParser.
	 */
	@Test
	public void testGeometryParser() {
		ESLocalProject testProject = createTestproject();
		DesignProcess testProcess = ProcessFactoryImpl.eINSTANCE.createDesignProcess();
		testProcess.setName("Test Process");
		testProject.getModelElements().add(testProcess);
		Assumption testAssumption = DesignoperationsFactory.eINSTANCE.createAssumption();
		testAssumption.setName("TestAssumption");
		SystemHelper.getProjectMainProcess(testProject).getDesignProcessElements().add(testAssumption);
		Component component = SystemFactory.eINSTANCE.createComponent();
		component.setName("TestComponent");
		component.setSourceOperation(testAssumption);
		testProject.getModelElements().add(component);

		GeometryImporter geometryImporter = FilesFactoryImpl.eINSTANCE.createGeometryImporter();

		geometryImporter.setFileName("Geometry.ini");
		testProcess.getDesignProcessElements().add(geometryImporter);
		assertEquals("Geometry.ini", geometryImporter.getFileName().toString());
		assertEquals("./sample/avl.exe", Activator.getDefault().getPreferenceStore().getString("AVLPATH"));

		geometryImporter.start();

		assertEquals(BigDecimal.valueOf(1.0),
			((DecimalNumber) SystemHelper.findValueByName("chord1", testProject)).getValue());
		assertEquals(BigDecimal.valueOf(1.0),
			((DecimalNumber) SystemHelper.findValueByName("chord2", testProject)).getValue());

	}

	/**
	 * This method tests the AVLModelGenerator.
	 */
	@Test
	public void testAVLModelGenerator() {
		ESLocalProject testProject = createTestproject();
		DesignProcess testProcess = ProcessFactoryImpl.eINSTANCE.createDesignProcess();
		testProcess.setName("Test Process");
		testProject.getModelElements().add(testProcess);

		Assumption testAssumption = DesignoperationsFactory.eINSTANCE.createAssumption();
		testAssumption.setName("TestAssumption");
		SystemHelper.getProjectMainProcess(testProject).getDesignProcessElements().add(testAssumption);
		Component component = SystemFactory.eINSTANCE.createComponent();
		component.setName("TestComponent");
		component.setSourceOperation(testAssumption);
		testProject.getModelElements().add(component);

		// import Requirements
		RequirementsImporter requirementsImporter = FilesFactoryImpl.eINSTANCE.createRequirementsImporter();
		requirementsImporter.setFileName("Requirements.ini");
		testProcess.getDesignProcessElements().add(requirementsImporter);

		// import Geometry
		GeometryImporter geometryImporter = FilesFactoryImpl.eINSTANCE.createGeometryImporter();

		geometryImporter.setFileName("Geometry.ini");
		testProcess.getDesignProcessElements().add(geometryImporter);

		testProcess.start();

		AVL avl = AvlFactory.eINSTANCE.createAVL();
		avl.setName("AVLTestEngine");
		testProcess.getDesignProcessElements().add(avl);

		AVLModelGenerator avlModelGenerator = AvlmodelFactory.eINSTANCE.createAVLModelGenerator();
		avlModelGenerator.setFileName("testwing.avl");
		avl.getDesignProcessElements().add(avlModelGenerator);
		CheatHelper.replicateAVLModelUserInput(avl);
		CheatHelper.replicateUserCalculations(avl);

		CheatHelper.replicateModelGeneratorUserConfig(testProject, avlModelGenerator);
		testProcess.getDesignProcessElements().add(avlModelGenerator);

		testProcess.start();
	}

	/**
	 * This method tests the AVL process generator.
	 */
	@Test
	public void testAVLProcessGenerator() {
		ESLocalProject testProject = createTestproject();
		DesignProcess testProcess = ProcessFactoryImpl.eINSTANCE.createDesignProcess();
		testProcess.setName("Test Process");
		testProject.getModelElements().add(testProcess);
		Assumption testAssumption = DesignoperationsFactory.eINSTANCE.createAssumption();
		testAssumption.setName("TestAssumption");
		SystemHelper.getProjectMainProcess(testProject).getDesignProcessElements().add(testAssumption);
		Component component = SystemFactory.eINSTANCE.createComponent();
		component.setName("TestComponent");
		component.setSourceOperation(testAssumption);
		testProject.getModelElements().add(component);

		// import Requirements
		RequirementsImporter requirementsImporter = FilesFactoryImpl.eINSTANCE.createRequirementsImporter();
		requirementsImporter.setFileName("Requirements.ini");
		testProcess.getDesignProcessElements().add(requirementsImporter);

		// import Geometry
		GeometryImporter geometryImporter = FilesFactoryImpl.eINSTANCE.createGeometryImporter();

		geometryImporter.setFileName("Geometry.ini");
		testProcess.getDesignProcessElements().add(geometryImporter);

		AVL avl = AvlFactory.eINSTANCE.createAVL();
		testProcess.getDesignProcessElements().add(avl);

		AVLProcessGenerator avlProcessGenerator = AvlprocessFactoryImpl.eINSTANCE.createAVLProcessGenerator();
		avlProcessGenerator.setFileName("testrun.run");
		avlProcessGenerator.setCommandFileName("testrun.cmd");
		avlProcessGenerator.setName("Test Generator");
		avl.getDesignProcessElements().add(avlProcessGenerator);
		CheatHelper.replicateAVLModelUserInput(avl);
		testProcess.start();

		CheatHelper.replicateProcessGeneratorUserConfig(testProject, avlProcessGenerator);
		testProcess.getDesignProcessElements().add(avlProcessGenerator);

		testProcess.start();
	}

	/**
	 * This method tests the connector to the AVL engine.
	 */
	@Test
	public void testAVL() {
		ESLocalProject testProject = createTestproject();
		AVL avl = AvlFactory.eINSTANCE.createAVL();
		testProject.getModelElements().add(avl);

		AVLProcessGenerator avlProcessGenerator = AvlprocessFactoryImpl.eINSTANCE.createAVLProcessGenerator();
		avlProcessGenerator.setFileName("testrun.run");
		avlProcessGenerator.setCommandFileName("testrun.cmd");
		avlProcessGenerator.setName("Test Generator");
		avl.getDesignProcessElements().add(avlProcessGenerator);

		AVLModelGenerator avlModelGenerator = AvlmodelFactoryImpl.eINSTANCE.createAVLModelGenerator();
		avlModelGenerator.setFileName("testwing.avl");

		avl.getDesignProcessElements().add(avlModelGenerator);

		avl.setBusy(false);

		avl.start();

	}

	/**
	 * This method tests the AVL result parser.
	 */
	@Test
	public void testAVLResultParser() {
		ESLocalProject testProject = createTestproject();
		DesignProcess testProcess = ProcessFactoryImpl.eINSTANCE.createDesignProcess();
		testProcess.setName("Test Process");
		testProject.getModelElements().add(testProcess);

		Assumption testAssumption = DesignoperationsFactory.eINSTANCE.createAssumption();
		testAssumption.setName("TestAssumption");
		SystemHelper.getProjectMainProcess(testProject).getDesignProcessElements().add(testAssumption);
		Component component = SystemFactory.eINSTANCE.createComponent();
		component.setName("TestComponent");
		component.setSourceOperation(testAssumption);
		testProject.getModelElements().add(component);

		AVLResultImporter avlResultImporter = AvlprocessFactory.eINSTANCE.createAVLResultImporter();

		avlResultImporter.setFileName("avl_run1.out");
		testProcess.getDesignProcessElements().add(avlResultImporter);
		assertEquals("avl_run1.out", avlResultImporter.getFileName().toString());

		avlResultImporter.start();

		// GetAlpha
		assertEquals(new BigDecimal("0.0"),
			((DecimalNumber) SystemHelper.findValueByName("alpha", testProject)).getValue());

		// GetBeta
		assertEquals(new BigDecimal("0.0"),
			((DecimalNumber) SystemHelper.findValueByName("beta", testProject)).getValue());

		// Get Mach number

		// Get CLtot
		assertEquals(new BigDecimal("0.08439"),
			((DecimalNumber) SystemHelper.findValueByName("CLtot", testProject)).getValue());

		// Get CDtot
		assertEquals(new BigDecimal("0.00024"),
			((DecimalNumber) SystemHelper.findValueByName("CDtot", testProject)).getValue());

		// Get aileron deflection
		assertEquals(new BigDecimal("0.0"),
			((DecimalNumber) SystemHelper.findValueByName("Deflection of Aileron", testProject)).getValue());

	}

	/**
	 * This method tests the value selection capability.
	 */
	@Test
	public void testSelector() {
		ESLocalProject testProject = createTestproject();
		DesignProcess selectionDesignProcess = ProcessFactoryImpl.eINSTANCE.createDesignProcess();
		testProject.getModelElements().add(selectionDesignProcess);
		// Create some Values in an assumption
		Assumption assumption = DesignoperationsFactory.eINSTANCE.createAssumption();
		selectionDesignProcess.getDesignProcessElements().add(assumption);
		Component aircraft = SystemFactory.eINSTANCE.createComponent();
		aircraft.setName("Aircraft");
		testProject.getModelElements().add(aircraft);

		MeasuredParameter mtowParameter = SystemHelper.createMeasuredParameter("MTOW", Unit.valueOf("kg"), aircraft);

		mtowParameter.getValues().add(
			SystemHelper.generateMeasuredValue("MTOW", "254.3", Unit.valueOf("t"), assumption));
		mtowParameter.getValues().add(SystemHelper.generateMeasuredValue("MTOW", "255", Unit.valueOf("t"), assumption));

		// Create a value Selection
		ValueSelection valueSelection = SelectionFactory.eINSTANCE.createValueSelection();
		selectionDesignProcess.getDesignProcessElements().add(valueSelection);

		SelectedMeasuredValue selectedMeasuredValue = SelectionFactory.eINSTANCE.createSelectedMeasuredValue();
		valueSelection.getSelectedValues().add(selectedMeasuredValue);

		NameCriterion nameCriterion = SelectionFactory.eINSTANCE.createNameCriterion();
		nameCriterion.setValueName("MTOW");

		valueSelection.getCriteria().add(nameCriterion);
		selectedMeasuredValue.getAppliedCriteria().add(nameCriterion);
		selectedMeasuredValue.start();
		// Evaluate ambiguity
		assertTrue(selectedMeasuredValue.getSelectedValues().size() > 1);

		// Add Criteria
		HighestValueCriterion highestValueCriterion = SelectionFactory.eINSTANCE.createHighestValueCriterion();

		valueSelection.getCriteria().add(highestValueCriterion);
		selectedMeasuredValue.getAppliedCriteria().add(highestValueCriterion);
		selectedMeasuredValue.start();
		// Evaluate ambigutiy
		assertTrue(selectedMeasuredValue.getSelectedValues().size() == 1);
		// Add value
		Component fuselage = SystemHelper.generateComponent("fuselage", assumption, aircraft);
		MeasuredParameter fuselageMTOW = SystemHelper.createMeasuredParameter("fuselageMTOW", Unit.valueOf("kg"),
			fuselage);
		fuselageMTOW.getValues().add(SystemHelper.generateMeasuredValue("MTOW", "255", Unit.valueOf("t"), assumption));
		selectedMeasuredValue.start();
		// Evaluate ambiguity
		assertTrue(selectedMeasuredValue.getSelectedValues().size() > 1);
		// Add Argument

		// // Evaluate Ambiguity
		// assertTrue(selectedMeasuredValue.getSelectedValues().size() == 1);

	}

	private ESLocalProject createTestproject() {
		net.bhl.cdt.ui.Activator.getDefault().getPreferenceStore().setValue("AVLPATH", "./sample/avl.exe");

		Activator.getDefault().getPreferenceStore().setValue("CDTPATH", "./sample/");
		assertEquals("./sample/", Activator.getDefault().getPreferenceStore().getString("CDTPATH"));
		ESWorkspace workspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
		return workspace.createLocalProject("TestProject");

	}
}
