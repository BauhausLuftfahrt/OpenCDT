/**
 */
package model.engineering;

import model.base.BasePackage;

import model.science.SciencePackage;

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
 * @see model.engineering.EngineeringFactory
 * @model kind="package"
 * @generated
 */
public interface EngineeringPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "engineering";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/engineering";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "net.bhl.cdt.model";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EngineeringPackage eINSTANCE = model.engineering.impl.EngineeringPackageImpl.init();

        /**
         * The meta object id for the '{@link model.engineering.impl.SystemImpl <em>System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.engineering.impl.SystemImpl
         * @see model.engineering.impl.EngineeringPackageImpl#getSystem()
         * @generated
         */
        int SYSTEM = 0;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM__ID = BasePackage.AMODEL_CONTAINER_ITEM__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM__NAME = BasePackage.AMODEL_CONTAINER_ITEM__NAME;

        /**
         * The feature id for the '<em><b>Container</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM__CONTAINER = BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER;

        /**
         * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM__PARAMETERS = BasePackage.AMODEL_CONTAINER_ITEM_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Components</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM__COMPONENTS = BasePackage.AMODEL_CONTAINER_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>System</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM_FEATURE_COUNT = BasePackage.AMODEL_CONTAINER_ITEM_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>System</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM_OPERATION_COUNT = BasePackage.AMODEL_CONTAINER_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.engineering.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.engineering.impl.ComponentImpl
         * @see model.engineering.impl.EngineeringPackageImpl#getComponent()
         * @generated
         */
        int COMPONENT = 1;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT__ID = SciencePackage.IDATA_ENTITY__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT__NAME = SciencePackage.IDATA_ENTITY__NAME;

        /**
         * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT__PARAMETERS = SciencePackage.IDATA_ENTITY__PARAMETERS;

        /**
         * The feature id for the '<em><b>Containing Component</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT__CONTAINING_COMPONENT = SciencePackage.IDATA_ENTITY_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Sub Components</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT__SUB_COMPONENTS = SciencePackage.IDATA_ENTITY_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Component</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT_FEATURE_COUNT = SciencePackage.IDATA_ENTITY_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>Component</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT_OPERATION_COUNT = SciencePackage.IDATA_ENTITY_OPERATION_COUNT + 0;


        /**
         * Returns the meta object for class '{@link model.engineering.System <em>System</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>System</em>'.
         * @see model.engineering.System
         * @generated
         */
        EClass getSystem();

        /**
         * Returns the meta object for the containment reference list '{@link model.engineering.System#getComponents <em>Components</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Components</em>'.
         * @see model.engineering.System#getComponents()
         * @see #getSystem()
         * @generated
         */
        EReference getSystem_Components();

        /**
         * Returns the meta object for class '{@link model.engineering.Component <em>Component</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Component</em>'.
         * @see model.engineering.Component
         * @generated
         */
        EClass getComponent();

        /**
         * Returns the meta object for the container reference '{@link model.engineering.Component#getContainingComponent <em>Containing Component</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the container reference '<em>Containing Component</em>'.
         * @see model.engineering.Component#getContainingComponent()
         * @see #getComponent()
         * @generated
         */
        EReference getComponent_ContainingComponent();

        /**
         * Returns the meta object for the containment reference list '{@link model.engineering.Component#getSubComponents <em>Sub Components</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Sub Components</em>'.
         * @see model.engineering.Component#getSubComponents()
         * @see #getComponent()
         * @generated
         */
        EReference getComponent_SubComponents();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        EngineeringFactory getEngineeringFactory();

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
                 * The meta object literal for the '{@link model.engineering.impl.SystemImpl <em>System</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.engineering.impl.SystemImpl
                 * @see model.engineering.impl.EngineeringPackageImpl#getSystem()
                 * @generated
                 */
                EClass SYSTEM = eINSTANCE.getSystem();

                /**
                 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference SYSTEM__COMPONENTS = eINSTANCE.getSystem_Components();

                /**
                 * The meta object literal for the '{@link model.engineering.impl.ComponentImpl <em>Component</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.engineering.impl.ComponentImpl
                 * @see model.engineering.impl.EngineeringPackageImpl#getComponent()
                 * @generated
                 */
                EClass COMPONENT = eINSTANCE.getComponent();

                /**
                 * The meta object literal for the '<em><b>Containing Component</b></em>' container reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference COMPONENT__CONTAINING_COMPONENT = eINSTANCE.getComponent_ContainingComponent();

                /**
                 * The meta object literal for the '<em><b>Sub Components</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference COMPONENT__SUB_COMPONENTS = eINSTANCE.getComponent_SubComponents();

        }

} //EngineeringPackage
