/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.matlab.tornado.impl;

import net.bhl.cdt.connector.matlab.tornado.Tornado;
import net.bhl.cdt.connector.matlab.tornado.TornadoFactory;
import net.bhl.cdt.connector.matlab.tornado.TornadoGeometry;
import net.bhl.cdt.connector.matlab.tornado.TornadoPackage;
import net.bhl.cdt.connector.matlab.tornado.TornadoState;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class TornadoFactoryImpl extends EFactoryImpl implements TornadoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static TornadoFactory init() {
		try {
			TornadoFactory theTornadoFactory = (TornadoFactory)EPackage.Registry.INSTANCE.getEFactory(TornadoPackage.eNS_URI);
			if (theTornadoFactory != null) {
				return theTornadoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TornadoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TornadoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TornadoPackage.TORNADO_GEOMETRY: return createTornadoGeometry();
			case TornadoPackage.TORNADO_STATE: return createTornadoState();
			case TornadoPackage.TORNADO: return createTornado();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Tornado createTornado() {
		TornadoImpl tornado = new TornadoImpl();
		return tornado;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TornadoGeometry createTornadoGeometry() {
		TornadoGeometryImpl tornadoGeometry = new TornadoGeometryImpl();
		return tornadoGeometry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TornadoState createTornadoState() {
		TornadoStateImpl tornadoState = new TornadoStateImpl();
		return tornadoState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TornadoPackage getTornadoPackage() {
		return (TornadoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TornadoPackage getPackage() {
		return TornadoPackage.eINSTANCE;
	}

} // TornadoFactoryImpl
