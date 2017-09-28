/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.provider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import model.data.DataPackage;
import model.data.Unit;
import model.data.parameter.ParameterPackage;
import model.data.quantities.Distance;
import model.data.quantities.Force;
import model.data.quantities.Mass;
import model.data.quantities.QuantitiesFactory;
import model.data.quantities.Time;
import model.data.quantities.Velocity;
import model.data.unit.UnitFactory;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-14
 *
 */
public class MetaModelInstancesProvider {
    private Resource modelResource;
    
    private Distance distanceQuantity;
    private Time timeQuantity;
    private Velocity velocityQuantity;
    private Mass massQuantity;
    private Force forceQuantity;

    public Resource getModelResource() {
	return modelResource;
    }
    
    public Distance getDistanceQuantity() {
        return distanceQuantity;
    }

    public Time getTimeQuantity() {
        return timeQuantity;
    }

    public Velocity getVelocityQuantity() {
        return velocityQuantity;
    }

    public Mass getMassQuantity() {
        return massQuantity;
    }

    public Force getForceQuantity() {
        return forceQuantity;
    }

    
    private static MetaModelInstancesProvider INSTANCE;

    public static MetaModelInstancesProvider getInstance() {
	if (INSTANCE == null)
	    INSTANCE = new MetaModelInstancesProvider();

	return INSTANCE;
    }

    private MetaModelInstancesProvider() {
	initialize();
    }

    private void initialize() {
	modelResource = new ResourceImpl();

	distanceQuantity = initializeDistanceQuantity();
	timeQuantity = initializeTimeQuantity();
	velocityQuantity = initializeVelocityQuantity();
	massQuantity = initializeMassQuantity();
	forceQuantity = initializeForceQuantity();
	
	EClass forceParameter = EcoreFactory.eINSTANCE.createEClass();
	forceParameter.setName("ForceParameter");
	
	EGenericType forceParameterSuperType = EcoreFactory.eINSTANCE.createEGenericType();
	ETypeParameter forceParameterSuperTypeParameter = EcoreFactory.eINSTANCE.createETypeParameter();
	
	forceParameterSuperType.setEClassifier(DataPackage.eINSTANCE.getIQuantifiedParameter());
	
	forceParameterSuperType.setETypeParameter(forceParameterSuperTypeParameter);
	
	EGenericType forceGenericType = EcoreFactory.eINSTANCE.createEGenericType();
	forceGenericType.setEClassifier(forceQuantity.eClass());
	
	forceParameterSuperTypeParameter.getEBounds().add(forceGenericType);
	
	forceParameter.getEGenericSuperTypes().add(forceParameterSuperType);
	
	ParameterPackage.eINSTANCE.getEClassifiers().add(forceParameter);
    }

    private Distance initializeDistanceQuantity() {
	Distance distance = QuantitiesFactory.eINSTANCE.createDistance();

	Unit<Distance> meter = UnitFactory.eINSTANCE.createDistanceUnit();
	meter.setName("Meter");
	meter.setSymbol("m");
	distance.getUnits().add(meter);
	
	Unit<Distance> foot = UnitFactory.eINSTANCE.createDistanceUnit();
	foot.setName("Foot");
	foot.setSymbol("ft");
	distance.getUnits().add(foot);
	
	Unit<Distance> nauticalMile = UnitFactory.eINSTANCE.createDistanceUnit();
	nauticalMile.setName("Nautical Mile");
	nauticalMile.setSymbol("NM");
	distance.getUnits().add(nauticalMile);
	
	return distance;
    }
    
    private Time initializeTimeQuantity() {
	Time time = QuantitiesFactory.eINSTANCE.createTime();

	Unit<Time> second = UnitFactory.eINSTANCE.createTimeUnit();
	second.setName("Second");
	second.setSymbol("s");
	time.getUnits().add(second);
	
	return time;
    }
    
    private Velocity initializeVelocityQuantity() {
	Velocity velocity = QuantitiesFactory.eINSTANCE.createVelocity();
	
	return velocity;
    }

    private Mass initializeMassQuantity() {
	Mass mass = QuantitiesFactory.eINSTANCE.createMass();
	
	return mass;
    }

    private Force initializeForceQuantity() {
	Force force = QuantitiesFactory.eINSTANCE.createForce();
	
	return force;
    }
}
