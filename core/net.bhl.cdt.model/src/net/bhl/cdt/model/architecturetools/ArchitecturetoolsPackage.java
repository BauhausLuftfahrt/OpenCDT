/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.architecturetools;

import net.bhl.cdt.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturetoolsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architecturetools";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model/architecturetools";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.architecturetools";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturetoolsPackage eINSTANCE = net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.PowerConsumerImpl <em>Power Consumer</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.PowerConsumerImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getPowerConsumer()
	 * @generated
	 */
	int POWER_CONSUMER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMER__NAME = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMER__PARENT_COMPONENT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMER__SOURCE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMER__DISCIPLINE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMER__ANNOTATION = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Design Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMER__DESIGN_PHASE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DESIGN_PHASE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMER__OWNER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Power Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMER__POWER_PARAMETER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMER__TYPE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Power Consumer</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMER_FEATURE_COUNT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.PowerDemandViewImpl <em>Power Demand View</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.PowerDemandViewImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getPowerDemandView()
	 * @generated
	 */
	int POWER_DEMAND_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DEMAND_VIEW__NAME = ModelPackage.VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Referenced Configurations</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DEMAND_VIEW__REFERENCED_CONFIGURATIONS = ModelPackage.VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Demand View</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DEMAND_VIEW_FEATURE_COUNT = ModelPackage.VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.MassiveImpl <em>Massive</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.MassiveImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getMassive()
	 * @generated
	 */
	int MASSIVE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSIVE__NAME = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSIVE__PARENT_COMPONENT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSIVE__SOURCE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSIVE__DISCIPLINE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSIVE__ANNOTATION = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Design Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSIVE__DESIGN_PHASE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DESIGN_PHASE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSIVE__OWNER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Mass Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSIVE__MASS_PARAMETER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Massive</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSIVE_FEATURE_COUNT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.CoefficientInterfaceImpl <em>Coefficient Interface</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.CoefficientInterfaceImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getCoefficientInterface()
	 * @generated
	 */
	int COEFFICIENT_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENT_INTERFACE__NAME = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENT_INTERFACE__PARENT_COMPONENT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENT_INTERFACE__SOURCE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENT_INTERFACE__DISCIPLINE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENT_INTERFACE__ANNOTATION = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Design Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENT_INTERFACE__DESIGN_PHASE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DESIGN_PHASE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENT_INTERFACE__OWNER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENT_INTERFACE__TYPE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coefficient Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENT_INTERFACE__COEFFICIENT_PARAMETER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coefficient Interface</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENT_INTERFACE_FEATURE_COUNT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.WettedAreaInterfaceImpl <em>Wetted Area Interface</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.WettedAreaInterfaceImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getWettedAreaInterface()
	 * @generated
	 */
	int WETTED_AREA_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WETTED_AREA_INTERFACE__NAME = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WETTED_AREA_INTERFACE__PARENT_COMPONENT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WETTED_AREA_INTERFACE__SOURCE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WETTED_AREA_INTERFACE__DISCIPLINE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WETTED_AREA_INTERFACE__ANNOTATION = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Design Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WETTED_AREA_INTERFACE__DESIGN_PHASE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DESIGN_PHASE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WETTED_AREA_INTERFACE__OWNER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Wetted Area Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WETTED_AREA_INTERFACE__WETTED_AREA_PARAMETER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wetted Area Interface</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WETTED_AREA_INTERFACE_FEATURE_COUNT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.ReferenceAreaInterfaceImpl <em>Reference Area Interface</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.ReferenceAreaInterfaceImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getReferenceAreaInterface()
	 * @generated
	 */
	int REFERENCE_AREA_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_INTERFACE__NAME = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_INTERFACE__PARENT_COMPONENT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_INTERFACE__SOURCE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_INTERFACE__DISCIPLINE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_INTERFACE__ANNOTATION = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Design Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_INTERFACE__DESIGN_PHASE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DESIGN_PHASE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_INTERFACE__OWNER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Reference Area Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_INTERFACE__REFERENCE_AREA_PARAMETER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Area Interface</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_INTERFACE_FEATURE_COUNT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.AltitudeInterfaceImpl <em>Altitude Interface</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.AltitudeInterfaceImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getAltitudeInterface()
	 * @generated
	 */
	int ALTITUDE_INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_INTERFACE__NAME = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_INTERFACE__PARENT_COMPONENT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_INTERFACE__SOURCE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_INTERFACE__DISCIPLINE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_INTERFACE__ANNOTATION = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Design Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_INTERFACE__DESIGN_PHASE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DESIGN_PHASE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_INTERFACE__OWNER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Altitude Parameter</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_INTERFACE__ALTITUDE_PARAMETER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Altitude Interface</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_INTERFACE_FEATURE_COUNT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.RangeInterfaceImpl <em>Range Interface</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.RangeInterfaceImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getRangeInterface()
	 * @generated
	 */
	int RANGE_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INTERFACE__NAME = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INTERFACE__PARENT_COMPONENT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INTERFACE__SOURCE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INTERFACE__DISCIPLINE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INTERFACE__ANNOTATION = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Design Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INTERFACE__DESIGN_PHASE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DESIGN_PHASE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INTERFACE__OWNER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Range Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INTERFACE__RANGE_PARAMETER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range Interface</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INTERFACE_FEATURE_COUNT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.SFCInterfaceImpl <em>SFC Interface</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.SFCInterfaceImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getSFCInterface()
	 * @generated
	 */
	int SFC_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_INTERFACE__NAME = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_INTERFACE__PARENT_COMPONENT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_INTERFACE__SOURCE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_INTERFACE__DISCIPLINE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_INTERFACE__ANNOTATION = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Design Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_INTERFACE__DESIGN_PHASE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DESIGN_PHASE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_INTERFACE__OWNER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Sfc Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_INTERFACE__SFC_PARAMETER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SFC Interface</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_INTERFACE_FEATURE_COUNT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.DensityInterfaceImpl <em>Density Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.DensityInterfaceImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getDensityInterface()
	 * @generated
	 */
	int DENSITY_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSITY_INTERFACE__NAME = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSITY_INTERFACE__PARENT_COMPONENT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSITY_INTERFACE__SOURCE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSITY_INTERFACE__DISCIPLINE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSITY_INTERFACE__ANNOTATION = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Design Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSITY_INTERFACE__DESIGN_PHASE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DESIGN_PHASE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSITY_INTERFACE__OWNER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Density Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSITY_INTERFACE__DENSITY_PARAMETER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Density Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSITY_INTERFACE_FEATURE_COUNT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.architecturetools.impl.VelocityInterfaceImpl <em>Velocity Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.architecturetools.impl.VelocityInterfaceImpl
	 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getVelocityInterface()
	 * @generated
	 */
	int VELOCITY_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_INTERFACE__NAME = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_INTERFACE__PARENT_COMPONENT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_INTERFACE__SOURCE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_INTERFACE__DISCIPLINE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_INTERFACE__ANNOTATION = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Design Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_INTERFACE__DESIGN_PHASE = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__DESIGN_PHASE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_INTERFACE__OWNER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Velocity Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_INTERFACE__VELOCITY_PARAMETER = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Velocity Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_INTERFACE_FEATURE_COUNT = ModelPackage.MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.PowerConsumer <em>Power Consumer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Consumer</em>'.
	 * @see net.bhl.cdt.model.architecturetools.PowerConsumer
	 * @generated
	 */
	EClass getPowerConsumer();

	/**
	 * Returns the meta object for the reference '
	 * {@link net.bhl.cdt.model.architecturetools.PowerConsumer#getPowerParameter <em>Power Parameter</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Power Parameter</em>'.
	 * @see net.bhl.cdt.model.architecturetools.PowerConsumer#getPowerParameter()
	 * @see #getPowerConsumer()
	 * @generated
	 */
	EReference getPowerConsumer_PowerParameter();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.architecturetools.PowerConsumer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.bhl.cdt.model.architecturetools.PowerConsumer#getType()
	 * @see #getPowerConsumer()
	 * @generated
	 */
	EAttribute getPowerConsumer_Type();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.PowerDemandView <em>Power Demand View</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Demand View</em>'.
	 * @see net.bhl.cdt.model.architecturetools.PowerDemandView
	 * @generated
	 */
	EClass getPowerDemandView();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.architecturetools.PowerDemandView#getReferencedConfigurations <em>Referenced Configurations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Configurations</em>'.
	 * @see net.bhl.cdt.model.architecturetools.PowerDemandView#getReferencedConfigurations()
	 * @see #getPowerDemandView()
	 * @generated
	 */
	EReference getPowerDemandView_ReferencedConfigurations();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.Massive <em>Massive</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Massive</em>'.
	 * @see net.bhl.cdt.model.architecturetools.Massive
	 * @generated
	 */
	EClass getMassive();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.architecturetools.Massive#getMassParameter <em>Mass Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mass Parameter</em>'.
	 * @see net.bhl.cdt.model.architecturetools.Massive#getMassParameter()
	 * @see #getMassive()
	 * @generated
	 */
	EReference getMassive_MassParameter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.CoefficientInterface <em>Coefficient Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coefficient Interface</em>'.
	 * @see net.bhl.cdt.model.architecturetools.CoefficientInterface
	 * @generated
	 */
	EClass getCoefficientInterface();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.architecturetools.CoefficientInterface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.bhl.cdt.model.architecturetools.CoefficientInterface#getType()
	 * @see #getCoefficientInterface()
	 * @generated
	 */
	EAttribute getCoefficientInterface_Type();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.architecturetools.CoefficientInterface#getCoefficientParameter <em>Coefficient Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coefficient Parameter</em>'.
	 * @see net.bhl.cdt.model.architecturetools.CoefficientInterface#getCoefficientParameter()
	 * @see #getCoefficientInterface()
	 * @generated
	 */
	EReference getCoefficientInterface_CoefficientParameter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.WettedAreaInterface <em>Wetted Area Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wetted Area Interface</em>'.
	 * @see net.bhl.cdt.model.architecturetools.WettedAreaInterface
	 * @generated
	 */
	EClass getWettedAreaInterface();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.architecturetools.WettedAreaInterface#getWettedAreaParameter <em>Wetted Area Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wetted Area Parameter</em>'.
	 * @see net.bhl.cdt.model.architecturetools.WettedAreaInterface#getWettedAreaParameter()
	 * @see #getWettedAreaInterface()
	 * @generated
	 */
	EReference getWettedAreaInterface_WettedAreaParameter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.ReferenceAreaInterface <em>Reference Area Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Area Interface</em>'.
	 * @see net.bhl.cdt.model.architecturetools.ReferenceAreaInterface
	 * @generated
	 */
	EClass getReferenceAreaInterface();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.architecturetools.ReferenceAreaInterface#getReferenceAreaParameter <em>Reference Area Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Area Parameter</em>'.
	 * @see net.bhl.cdt.model.architecturetools.ReferenceAreaInterface#getReferenceAreaParameter()
	 * @see #getReferenceAreaInterface()
	 * @generated
	 */
	EReference getReferenceAreaInterface_ReferenceAreaParameter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.AltitudeInterface <em>Altitude Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Altitude Interface</em>'.
	 * @see net.bhl.cdt.model.architecturetools.AltitudeInterface
	 * @generated
	 */
	EClass getAltitudeInterface();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.architecturetools.AltitudeInterface#getAltitudeParameter <em>Altitude Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Altitude Parameter</em>'.
	 * @see net.bhl.cdt.model.architecturetools.AltitudeInterface#getAltitudeParameter()
	 * @see #getAltitudeInterface()
	 * @generated
	 */
	EReference getAltitudeInterface_AltitudeParameter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.RangeInterface <em>Range Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Interface</em>'.
	 * @see net.bhl.cdt.model.architecturetools.RangeInterface
	 * @generated
	 */
	EClass getRangeInterface();

	/**
	 * Returns the meta object for the reference '
	 * {@link net.bhl.cdt.model.architecturetools.RangeInterface#getRangeParameter <em>Range Parameter</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Range Parameter</em>'.
	 * @see net.bhl.cdt.model.architecturetools.RangeInterface#getRangeParameter()
	 * @see #getRangeInterface()
	 * @generated
	 */
	EReference getRangeInterface_RangeParameter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.SFCInterface <em>SFC Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFC Interface</em>'.
	 * @see net.bhl.cdt.model.architecturetools.SFCInterface
	 * @generated
	 */
	EClass getSFCInterface();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.architecturetools.SFCInterface#getSfcParameter <em>Sfc Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sfc Parameter</em>'.
	 * @see net.bhl.cdt.model.architecturetools.SFCInterface#getSfcParameter()
	 * @see #getSFCInterface()
	 * @generated
	 */
	EReference getSFCInterface_SfcParameter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.DensityInterface <em>Density Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Density Interface</em>'.
	 * @see net.bhl.cdt.model.architecturetools.DensityInterface
	 * @generated
	 */
	EClass getDensityInterface();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.architecturetools.DensityInterface#getDensityParameter <em>Density Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Density Parameter</em>'.
	 * @see net.bhl.cdt.model.architecturetools.DensityInterface#getDensityParameter()
	 * @see #getDensityInterface()
	 * @generated
	 */
	EReference getDensityInterface_DensityParameter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.architecturetools.VelocityInterface <em>Velocity Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Velocity Interface</em>'.
	 * @see net.bhl.cdt.model.architecturetools.VelocityInterface
	 * @generated
	 */
	EClass getVelocityInterface();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.architecturetools.VelocityInterface#getVelocityParameter <em>Velocity Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Velocity Parameter</em>'.
	 * @see net.bhl.cdt.model.architecturetools.VelocityInterface#getVelocityParameter()
	 * @see #getVelocityInterface()
	 * @generated
	 */
	EReference getVelocityInterface_VelocityParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitecturetoolsFactory getArchitecturetoolsFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.PowerConsumerImpl <em>Power Consumer</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.PowerConsumerImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getPowerConsumer()
		 * @generated
		 */
		EClass POWER_CONSUMER = eINSTANCE.getPowerConsumer();

		/**
		 * The meta object literal for the '<em><b>Power Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONSUMER__POWER_PARAMETER = eINSTANCE.getPowerConsumer_PowerParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_CONSUMER__TYPE = eINSTANCE.getPowerConsumer_Type();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.PowerDemandViewImpl <em>Power Demand View</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.PowerDemandViewImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getPowerDemandView()
		 * @generated
		 */
		EClass POWER_DEMAND_VIEW = eINSTANCE.getPowerDemandView();

		/**
		 * The meta object literal for the '<em><b>Referenced Configurations</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference POWER_DEMAND_VIEW__REFERENCED_CONFIGURATIONS = eINSTANCE.getPowerDemandView_ReferencedConfigurations();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.MassiveImpl <em>Massive</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.MassiveImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getMassive()
		 * @generated
		 */
		EClass MASSIVE = eINSTANCE.getMassive();

		/**
		 * The meta object literal for the '<em><b>Mass Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASSIVE__MASS_PARAMETER = eINSTANCE.getMassive_MassParameter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.CoefficientInterfaceImpl <em>Coefficient Interface</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.CoefficientInterfaceImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getCoefficientInterface()
		 * @generated
		 */
		EClass COEFFICIENT_INTERFACE = eINSTANCE.getCoefficientInterface();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute COEFFICIENT_INTERFACE__TYPE = eINSTANCE.getCoefficientInterface_Type();

		/**
		 * The meta object literal for the ' <em><b>Coefficient Parameter</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COEFFICIENT_INTERFACE__COEFFICIENT_PARAMETER = eINSTANCE.getCoefficientInterface_CoefficientParameter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.WettedAreaInterfaceImpl <em>Wetted Area Interface</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.WettedAreaInterfaceImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getWettedAreaInterface()
		 * @generated
		 */
		EClass WETTED_AREA_INTERFACE = eINSTANCE.getWettedAreaInterface();

		/**
		 * The meta object literal for the ' <em><b>Wetted Area Parameter</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WETTED_AREA_INTERFACE__WETTED_AREA_PARAMETER = eINSTANCE.getWettedAreaInterface_WettedAreaParameter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.ReferenceAreaInterfaceImpl <em>Reference Area Interface</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.ReferenceAreaInterfaceImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getReferenceAreaInterface()
		 * @generated
		 */
		EClass REFERENCE_AREA_INTERFACE = eINSTANCE.getReferenceAreaInterface();

		/**
		 * The meta object literal for the ' <em><b>Reference Area Parameter</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REFERENCE_AREA_INTERFACE__REFERENCE_AREA_PARAMETER = eINSTANCE.getReferenceAreaInterface_ReferenceAreaParameter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.AltitudeInterfaceImpl <em>Altitude Interface</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.AltitudeInterfaceImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getAltitudeInterface()
		 * @generated
		 */
		EClass ALTITUDE_INTERFACE = eINSTANCE.getAltitudeInterface();

		/**
		 * The meta object literal for the '<em><b>Altitude Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTITUDE_INTERFACE__ALTITUDE_PARAMETER = eINSTANCE.getAltitudeInterface_AltitudeParameter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.RangeInterfaceImpl <em>Range Interface</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.RangeInterfaceImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getRangeInterface()
		 * @generated
		 */
		EClass RANGE_INTERFACE = eINSTANCE.getRangeInterface();

		/**
		 * The meta object literal for the '<em><b>Range Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_INTERFACE__RANGE_PARAMETER = eINSTANCE.getRangeInterface_RangeParameter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.SFCInterfaceImpl <em>SFC Interface</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.SFCInterfaceImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getSFCInterface()
		 * @generated
		 */
		EClass SFC_INTERFACE = eINSTANCE.getSFCInterface();

		/**
		 * The meta object literal for the '<em><b>Sfc Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SFC_INTERFACE__SFC_PARAMETER = eINSTANCE.getSFCInterface_SfcParameter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.DensityInterfaceImpl <em>Density Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.DensityInterfaceImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getDensityInterface()
		 * @generated
		 */
		EClass DENSITY_INTERFACE = eINSTANCE.getDensityInterface();

		/**
		 * The meta object literal for the '<em><b>Density Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENSITY_INTERFACE__DENSITY_PARAMETER = eINSTANCE.getDensityInterface_DensityParameter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.architecturetools.impl.VelocityInterfaceImpl <em>Velocity Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.architecturetools.impl.VelocityInterfaceImpl
		 * @see net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsPackageImpl#getVelocityInterface()
		 * @generated
		 */
		EClass VELOCITY_INTERFACE = eINSTANCE.getVelocityInterface();

		/**
		 * The meta object literal for the '<em><b>Velocity Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VELOCITY_INTERFACE__VELOCITY_PARAMETER = eINSTANCE.getVelocityInterface_VelocityParameter();

	}

} // ArchitecturetoolsPackage
