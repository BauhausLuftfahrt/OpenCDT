/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.cheat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.bhl.cdt.connector.avl.AVL;
import net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface;
import net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator;
import net.bhl.cdt.connector.avl.avlmodel.AVLSection;
import net.bhl.cdt.connector.avl.avlmodel.AVLSurface;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelFactory;
import net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection;
import net.bhl.cdt.connector.avl.avlmodel.SymmetryType;
import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.avlprocess.AvlprocessFactory;
import net.bhl.cdt.connector.avl.avlprocess.VariableSweep;
import net.bhl.cdt.model.geometry.SpaceVector;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.designoperations.Assumption;
import net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber;
import net.bhl.cdt.model.process.designoperations.Calculations;
import net.bhl.cdt.model.process.designoperations.DesignoperationsFactory;
import net.bhl.cdt.model.process.util.ProcessHelper;
import net.bhl.cdt.model.system.Component;
import net.bhl.cdt.model.system.Value;
import net.bhl.cdt.model.system.util.SystemHelper;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.ESLocalProject;

/**
 * This is helper class for configuring the AVL connector.
 * 
 * @author martin.glas
 */
public final class CheatHelper {

	private CheatHelper() {

	}

	/**
	 * This method automatically configures a given avl Process generator in a given project.
	 * 
	 * @param project the project containing the AVLProcessGenerator
	 * @param avlProcessGenerator the AVLProcessGenerator which should be configured
	 */
	public static void replicateProcessGeneratorUserConfig(ESLocalProject project,
		AVLProcessGenerator avlProcessGenerator) {

		// create parameter sweep over alpha
		VariableSweep alphaVariableSweep = net.bhl.cdt.connector.avl.avlprocess.AvlprocessFactory.eINSTANCE
			.createVariableSweep();
		alphaVariableSweep.setName("alpha");
		alphaVariableSweep.setVariableStart(SystemHelper.findDecimalNumberByName("alphastart", project));
		alphaVariableSweep.setVariableEnd(SystemHelper.findDecimalNumberByName("alphaend", project));
		alphaVariableSweep.setVariableDelta(SystemHelper.findDecimalNumberByName("alphadelta", project));
		avlProcessGenerator.getVariableSweeps().add(alphaVariableSweep);

		//
		// create parameter sweep over beta
		VariableSweep betaVariableSweep = net.bhl.cdt.connector.avl.avlprocess.AvlprocessFactory.eINSTANCE
			.createVariableSweep();
		betaVariableSweep.setName("beta");
		betaVariableSweep.setVariableStart(SystemHelper.findDecimalNumberByName("betastart", project));
		betaVariableSweep.setVariableEnd(SystemHelper.findDecimalNumberByName("betaend", project));
		betaVariableSweep.setVariableDelta(SystemHelper.findDecimalNumberByName("betadelta", project));
		avlProcessGenerator.getVariableSweeps().add(betaVariableSweep);

		// create rollRate constraint
		VariableSweep rollRateVariableSweep = net.bhl.cdt.connector.avl.avlprocess.AvlprocessFactory.eINSTANCE
			.createVariableSweep();
		rollRateVariableSweep.setName("pb/2V");
		rollRateVariableSweep.setVariableStart(SystemHelper.findDecimalNumberByName("rollRateStart", project));
		rollRateVariableSweep.setVariableEnd(SystemHelper.findDecimalNumberByName("rollRateEnd", project));
		rollRateVariableSweep.setVariableDelta(SystemHelper.findDecimalNumberByName("rollRateDelta", project));
		avlProcessGenerator.getVariableSweeps().add(rollRateVariableSweep);

		// create pitchRate constraint
		VariableSweep pitchRateVariableSweep = AvlprocessFactory.eINSTANCE.createVariableSweep();
		pitchRateVariableSweep.setName("qc/2V");
		pitchRateVariableSweep.setVariableStart(SystemHelper.findDecimalNumberByName("pitchRateStart", project));
		pitchRateVariableSweep.setVariableEnd(SystemHelper.findDecimalNumberByName("pitchRateEnd", project));
		pitchRateVariableSweep.setVariableDelta(SystemHelper.findDecimalNumberByName("pitchRateDelta", project));
		avlProcessGenerator.getVariableSweeps().add(pitchRateVariableSweep);

		// create yawRate constraint
		VariableSweep yawRateVariableSweep = AvlprocessFactory.eINSTANCE.createVariableSweep();
		yawRateVariableSweep.setName("rb/2V");
		yawRateVariableSweep.setVariableStart(SystemHelper.findDecimalNumberByName("yawRateStart", project));
		yawRateVariableSweep.setVariableEnd(SystemHelper.findDecimalNumberByName("yawRateEnd", project));
		yawRateVariableSweep.setVariableDelta(SystemHelper.findDecimalNumberByName("yawRateDelta", project));
		avlProcessGenerator.getVariableSweeps().add(yawRateVariableSweep);

		// create parameter sweep over aileron1
		VariableSweep aileron1VariableSweep = AvlprocessFactory.eINSTANCE.createVariableSweep();
		aileron1VariableSweep.setName("aileron");
		aileron1VariableSweep.setVariableStart(SystemHelper.findDecimalNumberByName("aileronstart2", project));
		aileron1VariableSweep.setVariableEnd(SystemHelper.findDecimalNumberByName("aileronendend2", project));
		aileron1VariableSweep.setVariableDelta(SystemHelper.findDecimalNumberByName("ailerondelta2", project));
		avlProcessGenerator.getVariableSweeps().add(aileron1VariableSweep);

		// // create parameter sweep1 over aileron1
		// VariableSweep aileron2VariableSweep = net.bhl.cdt.coda.avl.process.AvlprocessFactory.eINSTANCE
		// .createVariableSweep();
		// aileron2VariableSweep.setName("aileron2");
		// aileron2VariableSweep.setVariableStart(SystemHelper.findDecimalNumberByName("aileronstart2", testProject));
		// aileron2VariableSweep.setVariableEnd(SystemHelper.findDecimalNumberByName("aileronendend2", testProject));
		// aileron2VariableSweep.setVariableDelta(SystemHelper.findDecimalNumberByName("ailerondelta2", testProject));
		// avlProcessGenerator.getVariableSweeps().add(aileron2VariableSweep);

	}

	/**
	 * This methods replicates the calculations necessary to configure a given AVL connector.
	 * 
	 * @param avl the AVL process node.
	 */
	public static void replicateUserCalculations(AVL avl) {

		Calculations avlCalculations = DesignoperationsFactory.eINSTANCE.createCalculations();
		avlCalculations.setName("AVL Calculations");
		avl.getDesignProcessElements().add(avlCalculations);

		// Calculate chord3

		performCalucation("chord3=taper2*chord2", "taper2, chord2", avl);

		// Calculate cref

		performCalucation(
			"cref=((2/3*chord1*(1+taper1+taper2^2)/(1+taper1))*((span1/2)*chord1*(1+taper1))+(2/3*chord2*(1+taper2+taper2^2)/(1+taper2))*((span2/2)*chord2*(1+taper2)))/(((span1/2)*chord1*(1+taper1))+((span2/2)*chord2*(1+taper2)))",
			"chord1,span1,taper1,taper2,span2,chord2", avl);

		// calculate SRef

		performCalucation("sref=(((span1/2)*chord1*(1+taper1))+((span2/2)*chord2*(1+taper2)))*2",
			"span1, chord1, span2, chord2, taper1, taper2", avl);

		// calculate xle2

		performCalucation("xle2=tan(leangle1*pi/180)*span1", "leangle1,pi,span1", avl);

		// calculate xle3

		performCalucation("xle3=xle2+tan(leangle2*pi/180)*span2", "xle2,leangle2,pi,span2", avl);

		// calculate yle1
		performCalucation("yle1=yref", "yref", avl);

		// calculate yle2

		performCalucation("yle2=yle1+span1", "yle1, span1", avl);

		// Calculate yle3

		performCalucation("yle3=yle2+span2", "yle2,span2", avl);
	}

	private static List<Value> collectFormulaValues(String valueListString, DesignProcess avlProcess) {
		ESLocalProject project = ModelHelper.getContainingProject(avlProcess);
		List<Value> resultValues = new ArrayList<Value>();
		String[] namesArray = valueListString.split(",");
		List<String> names = Arrays.asList(namesArray);
		for (String valueName : names) {
			Value value = SystemHelper.findValueByName(valueName.trim(), project);
			resultValues.add(value);
		}
		return resultValues;
	}

	/**
	 * This method creates a single calculation and performs it.
	 * 
	 * @param formulaString the formula to be calculated
	 * @param parameterNamesString the names of the parameters separated by commas
	 * @param avl the AVL connector
	 */
	public static void performCalucation(String formulaString, String parameterNamesString, AVL avl) {

		CalculatedDecimalNumber newformula = SystemHelper.createCalculation(formulaString, avl);

		EList<ProcessElement> list = avl.getDesignProcessElements();

		for (ProcessElement processElement : list) {
			if (processElement instanceof Calculations) {
				((Calculations) processElement).getDesignProcessElements().add(newformula);
			}
		}

		SystemHelper.wireCalculatedDecimalNumber(newformula, collectFormulaValues(parameterNamesString, avl));
		newformula.start();
	}

	/**
	 * This method replicates the configuration of the AVL Model Generator.
	 * 
	 * @param project the project where the Values have to be found
	 * @param avlModelGenerator the AVLModelGenerator
	 */
	public static void replicateModelGeneratorUserConfig(ESLocalProject project, AVLModelGenerator avlModelGenerator) {
		avlModelGenerator.setName("Simple Testwing");
		avlModelGenerator.setIYsym(SymmetryType.NO_SYMMETRY);
		avlModelGenerator.setIZSym(SymmetryType.NO_SYMMETRY);

		ProcessHelper.wireReferences(avlModelGenerator, project);
		avlModelGenerator.setBref(SystemHelper.findDecimalNumberByName("span", project));
		avlModelGenerator.setCref(SystemHelper.findDecimalNumberByName("cref", project));
		avlModelGenerator.setSref(SystemHelper.findDecimalNumberByName("sref", project));

		AVLSurface newSurface = AvlmodelFactory.eINSTANCE.createAVLSurface();
		newSurface.setName("Wing");
		ProcessHelper.wireReferences(newSurface, project);
		newSurface.setNchordwise(8);
		newSurface.setNspanwise(12);
		newSurface.setSspace(0);
		newSurface.setCspace(2);
		newSurface.setYDuplicate(AvlmodelFactory.eINSTANCE.createYDuplicate());
		newSurface.getYDuplicate().setYDupl(SystemHelper.findDecimalNumberByName("YDublicate", project));
		newSurface.setAngle(AvlmodelFactory.eINSTANCE.createSufaceAngle());
		newSurface.getAngle().setAngle(SystemHelper.findDecimalNumberByName("alphastart", project));

		avlModelGenerator.getSurfaces().add(newSurface);

		AVLSection firstSection = AvlmodelFactory.eINSTANCE.createAVLSection();
		ProcessHelper.wireReferences(firstSection, project);
		newSurface.getSections().add(firstSection);
		firstSection.setNspanwise(0);
		firstSection.setSspace(0);
		firstSection.setXle(SystemHelper.findDecimalNumberByName("xref", project));
		firstSection.setYle(SystemHelper.findDecimalNumberByName("yref", project));
		firstSection.setZle(SystemHelper.findDecimalNumberByName("zref", project));
		firstSection.setChord(SystemHelper.findDecimalNumberByName("chord1", project));
		firstSection.setAinc(SystemHelper.findDecimalNumberByName("ainc1", project));

		AVLSection secondSection = AvlmodelFactory.eINSTANCE.createAVLSection();
		ProcessHelper.wireReferences(secondSection, project);
		newSurface.getSections().add(secondSection);
		AVLControlSurface firstAvlControlSurface = AvlmodelFactory.eINSTANCE.createAVLControlSurface();
		firstAvlControlSurface.setName("aileron");
		ProcessHelper.wireReferences(firstAvlControlSurface, project);

		firstAvlControlSurface.setHingeVector(SystemHelper.findVectorByName("hingeVector", project));
		firstAvlControlSurface.setSgnDup(SignOfDeflection.AILERON);
		firstAvlControlSurface.setCgain(SystemHelper.findDecimalNumberByName("cgain1", project));
		firstAvlControlSurface.setXhinge(SystemHelper.findDecimalNumberByName("hingxc2", project));
		secondSection.getControlSurfaces().add(firstAvlControlSurface);
		secondSection.setNspanwise(0);
		secondSection.setSspace(0);
		secondSection.setXle(SystemHelper.findDecimalNumberByName("xle2", project));
		secondSection.setYle(SystemHelper.findDecimalNumberByName("yle2", project));

		secondSection.setZle(SystemHelper.findDecimalNumberByName("defaultLeadingEdgeLocation", project));
		secondSection.setChord(SystemHelper.findDecimalNumberByName("chord2", project));
		secondSection.setAinc(SystemHelper.findDecimalNumberByName("ainc2", project));

		AVLSection thirdSection = AvlmodelFactory.eINSTANCE.createAVLSection();
		ProcessHelper.wireReferences(thirdSection, project);
		newSurface.getSections().add(thirdSection);
		AVLControlSurface secondAvlControlSurface = AvlmodelFactory.eINSTANCE.createAVLControlSurface();
		secondAvlControlSurface.setName("aileron");
		secondAvlControlSurface.setSgnDup(SignOfDeflection.AILERON);
		secondAvlControlSurface.setHingeVector(SystemHelper.findVectorByName("hingeVector", project));
		secondAvlControlSurface.setCgain(SystemHelper.findDecimalNumberByName("cgain2", project));
		secondAvlControlSurface.setXhinge(SystemHelper.findDecimalNumberByName("hingxc2", project));
		ProcessHelper.wireReferences(secondAvlControlSurface, project);
		thirdSection.getControlSurfaces().add(secondAvlControlSurface);
		thirdSection.setNspanwise(0);
		thirdSection.setSspace(0);
		thirdSection.setZle(SystemHelper.findDecimalNumberByName("defaultLeadingEdgeLocation", project));
		thirdSection.setChord(SystemHelper.findDecimalNumberByName("chord3", project));
		thirdSection.setXle(SystemHelper.findDecimalNumberByName("xle3", project));
		thirdSection.setYle(SystemHelper.findDecimalNumberByName("yle3", project));
		thirdSection.setAinc(SystemHelper.findDecimalNumberByName("ainc3", project));

	}

	/**
	 * This method replicates the user input required to configure the AVL engine connector.
	 * 
	 * @param avl the AVL tool connector
	 */
	public static void replicateAVLModelUserInput(AVL avl) {

		Assumption assumption = DesignoperationsFactory.eINSTANCE.createAssumption();
		assumption.setName("AVL assumptions");

		avl.getDesignProcessElements().add(assumption);
		Component defaultComponenent = SystemHelper.getProjectMainComponent(ModelHelper.getContainingProject(avl));

		SystemHelper.createParameter("YDublicate", BigDecimal.valueOf(0.0), defaultComponenent, assumption);

		SystemHelper.createParameter("defaultLeadingEdgeLocation", new BigDecimal("0"), defaultComponenent, assumption);

		SystemHelper.createParameter("pi", new BigDecimal(Math.PI), defaultComponenent, assumption);

		SystemHelper.createParameter("rollRateStart", new BigDecimal(0.0), defaultComponenent, assumption);
		SystemHelper.createParameter("rollRateEnd", new BigDecimal(0.0), defaultComponenent, assumption);
		SystemHelper.createParameter("rollRateDelta", new BigDecimal(0.0), defaultComponenent, assumption);

		SystemHelper.createParameter("pitchRateStart", new BigDecimal(0.0), defaultComponenent, assumption);
		SystemHelper.createParameter("pitchRateEnd", new BigDecimal(0.0), defaultComponenent, assumption);
		SystemHelper.createParameter("pitchRateDelta", new BigDecimal(0.0), defaultComponenent, assumption);

		SystemHelper.createParameter("yawRateStart", new BigDecimal(0.0), defaultComponenent, assumption);
		SystemHelper.createParameter("yawRateEnd", new BigDecimal(0.0), defaultComponenent, assumption);
		SystemHelper.createParameter("yawRateDelta", new BigDecimal(0.0), defaultComponenent, assumption);

		SystemHelper.createParameter("cgain1", new BigDecimal(-1.0), defaultComponenent, assumption);
		SystemHelper.createParameter("cgain2", new BigDecimal(-1.0), defaultComponenent, assumption);

		SystemHelper.createParameter("ainc1", new BigDecimal(0.0), defaultComponenent, assumption);
		SystemHelper.createParameter("ainc2", new BigDecimal(0.0), defaultComponenent, assumption);
		SystemHelper.createParameter("ainc3", new BigDecimal(0.0), defaultComponenent, assumption);

		SpaceVector hingeVector = SystemHelper.createSpaceVector("hingeVector", new BigDecimal("0"),
			new BigDecimal("0"), new BigDecimal("0"), assumption);
		assumption.getGeneratedElements().add(hingeVector);

	}

}
