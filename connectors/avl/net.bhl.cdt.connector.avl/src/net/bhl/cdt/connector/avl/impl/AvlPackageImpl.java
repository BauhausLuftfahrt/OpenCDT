/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.impl;

import net.bhl.cdt.connector.avl.AvlFactory;
import net.bhl.cdt.connector.avl.AvlPackage;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;
import net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl;
import net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage;
import net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessPackageImpl;
import net.bhl.cdt.connector.files.FilesPackage;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvlPackageImpl extends EPackageImpl implements AvlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avlEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.bhl.cdt.connector.avl.AvlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AvlPackageImpl() {
		super(eNS_URI, AvlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AvlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AvlPackage init() {
		if (isInited) return (AvlPackage)EPackage.Registry.INSTANCE.getEPackage(AvlPackage.eNS_URI);

		// Obtain or create and register package
		AvlPackageImpl theAvlPackage = (AvlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AvlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AvlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AvlmodelPackageImpl theAvlmodelPackage = (AvlmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AvlmodelPackage.eNS_URI) instanceof AvlmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AvlmodelPackage.eNS_URI) : AvlmodelPackage.eINSTANCE);
		AvlprocessPackageImpl theAvlprocessPackage = (AvlprocessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AvlprocessPackage.eNS_URI) instanceof AvlprocessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AvlprocessPackage.eNS_URI) : AvlprocessPackage.eINSTANCE);

		// Create package meta-data objects
		theAvlPackage.createPackageContents();
		theAvlmodelPackage.createPackageContents();
		theAvlprocessPackage.createPackageContents();

		// Initialize created meta-data
		theAvlPackage.initializePackageContents();
		theAvlmodelPackage.initializePackageContents();
		theAvlprocessPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAvlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AvlPackage.eNS_URI, theAvlPackage);
		return theAvlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVL() {
		return avlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvlFactory getAvlFactory() {
		return (AvlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		avlEClass = createEClass(AVL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AvlmodelPackage theAvlmodelPackage = (AvlmodelPackage)EPackage.Registry.INSTANCE.getEPackage(AvlmodelPackage.eNS_URI);
		AvlprocessPackage theAvlprocessPackage = (AvlprocessPackage)EPackage.Registry.INSTANCE.getEPackage(AvlprocessPackage.eNS_URI);
		DesignoperationsPackage theDesignoperationsPackage = (DesignoperationsPackage)EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAvlmodelPackage);
		getESubpackages().add(theAvlprocessPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		avlEClass.getESuperTypes().add(theDesignoperationsPackage.getLocalDisciplineTool());

		// Initialize classes, features, and operations; add parameters
		initEClass(avlEClass, net.bhl.cdt.connector.avl.AVL.class, "AVL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AvlPackageImpl
