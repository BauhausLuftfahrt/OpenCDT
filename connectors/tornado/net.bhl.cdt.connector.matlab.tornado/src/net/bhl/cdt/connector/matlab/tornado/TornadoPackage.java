/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.matlab.tornado;

import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.connector.matlab.tornado.TornadoFactory
 * @model kind="package"
 * @generated
 */
public interface TornadoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tornado";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/connector/matlab/tornado";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.connector.matlab";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TornadoPackage eINSTANCE = net.bhl.cdt.connector.matlab.tornado.impl.TornadoPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoImpl <em>Tornado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoImpl
	 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoPackageImpl#getTornado()
	 * @generated
	 */
	int TORNADO = 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoGeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoGeometryImpl
	 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoPackageImpl#getTornadoGeometry()
	 * @generated
	 */
	int TORNADO_GEOMETRY = 0;

	/**
	 * The feature id for the '<em><b>Sweep Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_GEOMETRY__SWEEP_ANGLE = 0;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_GEOMETRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_GEOMETRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoStateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoStateImpl
	 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoPackageImpl#getTornadoState()
	 * @generated
	 */
	int TORNADO_STATE = 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_STATE__ALTITUDE = 0;

	/**
	 * The feature id for the '<em><b>Rho</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_STATE__RHO = 1;

	/**
	 * The feature id for the '<em><b>Air Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_STATE__AIR_SPEED = 2;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_STATE__ALPHA = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_STATE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO__NAME = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO__BUSY = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO__TIME_STAMP = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Design Process Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO__DESIGN_PROCESS_ELEMENTS = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__DESIGN_PROCESS_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO__SERVICE_URL = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__SERVICE_URL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int TORNADO__PORT = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE__SERVICE_URL;

	/**
	 * The feature id for the '<em><b>Generated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO__GENERATED_ELEMENTS = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tornado Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO__TORNADO_GEOMETRY = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tornado State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO__TORNADO_STATE = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tornado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_FEATURE_COUNT = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO___START = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO___IS_STARTABLE = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO___GET_STRATEGY__ECLASS = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Tornado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORNADO_OPERATION_COUNT = DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.matlab.tornado.Tornado <em>Tornado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tornado</em>'.
	 * @see net.bhl.cdt.connector.matlab.tornado.Tornado
	 * @generated
	 */
	EClass getTornado();

	/**
	 * Returns the meta object for the containment reference '{@link net.bhl.cdt.connector.matlab.tornado.Tornado#getTornadoGeometry <em>Tornado Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tornado Geometry</em>'.
	 * @see net.bhl.cdt.connector.matlab.tornado.Tornado#getTornadoGeometry()
	 * @see #getTornado()
	 * @generated
	 */
	EReference getTornado_TornadoGeometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.bhl.cdt.connector.matlab.tornado.Tornado#getTornadoState <em>Tornado State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tornado State</em>'.
	 * @see net.bhl.cdt.connector.matlab.tornado.Tornado#getTornadoState()
	 * @see #getTornado()
	 * @generated
	 */
	EReference getTornado_TornadoState();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.matlab.tornado.TornadoGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoGeometry
	 * @generated
	 */
	EClass getTornadoGeometry();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.matlab.tornado.TornadoGeometry#getSweepAngle <em>Sweep Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sweep Angle</em>'.
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoGeometry#getSweepAngle()
	 * @see #getTornadoGeometry()
	 * @generated
	 */
	EReference getTornadoGeometry_SweepAngle();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.matlab.tornado.TornadoState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoState
	 * @generated
	 */
	EClass getTornadoState();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Altitude</em>'.
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoState#getAltitude()
	 * @see #getTornadoState()
	 * @generated
	 */
	EReference getTornadoState_Altitude();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getRho <em>Rho</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rho</em>'.
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoState#getRho()
	 * @see #getTornadoState()
	 * @generated
	 */
	EReference getTornadoState_Rho();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getAirSpeed <em>Air Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Air Speed</em>'.
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoState#getAirSpeed()
	 * @see #getTornadoState()
	 * @generated
	 */
	EReference getTornadoState_AirSpeed();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alpha</em>'.
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoState#getAlpha()
	 * @see #getTornadoState()
	 * @generated
	 */
	EReference getTornadoState_Alpha();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TornadoFactory getTornadoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoImpl <em>Tornado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoImpl
		 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoPackageImpl#getTornado()
		 * @generated
		 */
		EClass TORNADO = eINSTANCE.getTornado();
		/**
		 * The meta object literal for the '<em><b>Tornado Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TORNADO__TORNADO_GEOMETRY = eINSTANCE.getTornado_TornadoGeometry();
		/**
		 * The meta object literal for the '<em><b>Tornado State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TORNADO__TORNADO_STATE = eINSTANCE.getTornado_TornadoState();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoGeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoGeometryImpl
		 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoPackageImpl#getTornadoGeometry()
		 * @generated
		 */
		EClass TORNADO_GEOMETRY = eINSTANCE.getTornadoGeometry();
		/**
		 * The meta object literal for the '<em><b>Sweep Angle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TORNADO_GEOMETRY__SWEEP_ANGLE = eINSTANCE.getTornadoGeometry_SweepAngle();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoStateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoStateImpl
		 * @see net.bhl.cdt.connector.matlab.tornado.impl.TornadoPackageImpl#getTornadoState()
		 * @generated
		 */
		EClass TORNADO_STATE = eINSTANCE.getTornadoState();
		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TORNADO_STATE__ALTITUDE = eINSTANCE.getTornadoState_Altitude();
		/**
		 * The meta object literal for the '<em><b>Rho</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TORNADO_STATE__RHO = eINSTANCE.getTornadoState_Rho();
		/**
		 * The meta object literal for the '<em><b>Air Speed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TORNADO_STATE__AIR_SPEED = eINSTANCE.getTornadoState_AirSpeed();
		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TORNADO_STATE__ALPHA = eINSTANCE.getTornadoState_Alpha();

	}

} //TornadoPackage
