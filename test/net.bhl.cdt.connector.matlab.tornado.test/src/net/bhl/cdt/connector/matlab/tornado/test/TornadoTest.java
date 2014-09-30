/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.matlab.tornado.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import javax.measure.unit.NonSI;
import javax.measure.unit.Unit;

import net.bhl.cdt.coda.tornado.ui.commands.CreateTornadoProcessCommand;
import net.bhl.cdt.connector.matlab.tornado.Tornado;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.designoperations.Assumption;
import net.bhl.cdt.model.process.designoperations.DesignoperationsFactory;
import net.bhl.cdt.model.process.impl.ProcessFactoryImpl;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.MeasuredValue;
import net.bhl.cdt.model.system.util.SystemHelper;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.junit.Test;


/**
 * The unit test for the Tornado connector.
 * @author vasantha.kumari
 *
 */
public class TornadoTest{

	/**
	 * This method tests the CreateTornado Command and the execution of the service.
	 */
	@Test
	public void testCreateTornadoCommand() {
		ESLocalProject testProject = createTestproject();
		DesignProcess testProcess = ProcessFactoryImpl.eINSTANCE.createDesignProcess();
		testProcess.setName("Test Process");
		testProject.getModelElements().add(testProcess);
		
		CreateTornadoProcessCommand createTornadoProcessCommand = new CreateTornadoProcessCommand(testProcess);
		createTornadoProcessCommand.execute();
		
		Tornado tornado=ModelHelper.getChildrenByClass(testProcess, Tornado.class).get(0);
		//Create assumptions and add them to the Tornado Process
		Assumption testAssumption = DesignoperationsFactory.eINSTANCE.createAssumption();
		testAssumption.setName("TestAssumption");
		tornado.getDesignProcessElements().add(testAssumption);
         //Create the Values and add them to 
		MeasuredValue altitude=SystemHelper.createMeasuredValue("altitude", BigDecimal.valueOf(10000), NonSI.FOOT);
		MeasuredValue speed=SystemHelper.createMeasuredValue("mach", BigDecimal.valueOf(0.3), Unit.ONE);
		MeasuredValue sweepangle=SystemHelper.createMeasuredValue("sweep angle", BigDecimal.valueOf(5), NonSI.DEGREE_ANGLE);
		MeasuredValue alphaend=SystemHelper.createMeasuredValue("alphaend", BigDecimal.valueOf(5), NonSI.DEGREE_ANGLE);
		MeasuredValue rho =SystemHelper.createMeasuredValue("rho", BigDecimal.valueOf(0.8), NonSI.KILOGRAM_FORCE);
//		tornado.getGeneratedElements().add(sweepangle);
		//Connect assumed values with the Tornado connector
		tornado.getTornadoGeometry().setSweepAngle(sweepangle);
		tornado.getTornadoState().setAirSpeed(speed);
		tornado.getTornadoState().setAlpha(alphaend);
		tornado.getTornadoState().setRho(rho);
		tornado.getTornadoState().setAltitude(altitude);
		
		tornado.start();
		
		assertEquals(new BigDecimal("4,5277025580903185"),
				((DecimalNumber) SystemHelper.findValueByName("CZ_a", testProject)).getValue());
		
		assertEquals(new BigDecimal("-0,0857202368901687"),
				((DecimalNumber) SystemHelper.findValueByName("Cn_P", testProject)).getValue());
		
		assertEquals(new BigDecimal("8,531500215118726"),
				((DecimalNumber) SystemHelper.findValueByName("CZ_Q", testProject)).getValue());
		
		assertEquals(new BigDecimal("4,830236184279169"),
				((DecimalNumber) SystemHelper.findValueByName("dwcond", testProject)).getValue());
		
		assertEquals(new BigDecimal("0,010148429268055826"),
				((DecimalNumber) SystemHelper.findValueByName("CDwing", testProject)).getValue());
		
		assertEquals(new BigDecimal("0,00213831472259321"),
				((DecimalNumber) SystemHelper.findValueByName("CYwing", testProject)).getValue());
		
		assertEquals(new BigDecimal("-4,518555149248994"),
				((DecimalNumber) SystemHelper.findValueByName("CL_P", testProject)).getValue());
		
		assertEquals(new BigDecimal("-0,024441049119005"),
				((DecimalNumber) SystemHelper.findValueByName("CX", testProject)).getValue());
	
		assertEquals(new BigDecimal("0"),
				((DecimalNumber) SystemHelper.findValueByName("CZ_R", testProject)).getValue());
		
		assertEquals(new BigDecimal("245,32164417364064"),
				((DecimalNumber) SystemHelper.findValueByName("L", testProject)).getValue());
		
		assertEquals(new BigDecimal("1,3232583174865429"),
				((DecimalNumber) SystemHelper.findValueByName("C", testProject)).getValue());
		
		assertEquals(new BigDecimal("0"),
				((DecimalNumber) SystemHelper.findValueByName("sonicWarning", testProject)).getValue());
		
	}
        
        /**
         * Creates the testproject.
         *
         * @return the ES local project
         */
        private ESLocalProject createTestproject() {
		
		ESWorkspace workspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
		return workspace.createLocalProject("TestProject");

	}





	
}