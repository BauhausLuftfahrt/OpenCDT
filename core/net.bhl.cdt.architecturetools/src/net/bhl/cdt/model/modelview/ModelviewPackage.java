/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview;

import net.bhl.cdt.model.ModelPackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.modelview.ModelviewFactory
 * @model kind="package"
 * @generated
 */
public interface ModelviewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelview";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model/modelview";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.model.modelview";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelviewPackage eINSTANCE = net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.modelview.impl.DisciplineViewImpl <em>Discipline View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.modelview.impl.DisciplineViewImpl
	 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getDisciplineView()
	 * @generated
	 */
	int DISCIPLINE_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_VIEW__NAME = ModelPackage.VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Subviews</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_VIEW__SUBVIEWS = ModelPackage.VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_VIEW__ELEMENTS = ModelPackage.VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_VIEW__INTERFACE_TYPES = ModelPackage.VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_VIEW__VIEW_LINKS = ModelPackage.VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Discipline View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_VIEW_FEATURE_COUNT = ModelPackage.VIEW_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.modelview.impl.ViewLinkImpl <em>View Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.modelview.impl.ViewLinkImpl
	 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getViewLink()
	 * @generated
	 */
	int VIEW_LINK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_LINK__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Virtual Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_LINK__VIRTUAL_PARENT = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Virtual Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_LINK__VIRTUAL_CHILD = ModelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_LINK_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.modelview.DisciplineView <em>Discipline View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discipline View</em>'.
	 * @see net.bhl.cdt.model.modelview.DisciplineView
	 * @generated
	 */
	EClass getDisciplineView();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.modelview.DisciplineView#getSubviews <em>Subviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subviews</em>'.
	 * @see net.bhl.cdt.model.modelview.DisciplineView#getSubviews()
	 * @see #getDisciplineView()
	 * @generated
	 */
	EReference getDisciplineView_Subviews();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.modelview.DisciplineView#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see net.bhl.cdt.model.modelview.DisciplineView#getElements()
	 * @see #getDisciplineView()
	 * @generated
	 */
	EReference getDisciplineView_Elements();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.modelview.DisciplineView#getInterfaceTypes <em>Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface Types</em>'.
	 * @see net.bhl.cdt.model.modelview.DisciplineView#getInterfaceTypes()
	 * @see #getDisciplineView()
	 * @generated
	 */
	EReference getDisciplineView_InterfaceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.modelview.DisciplineView#getViewLinks <em>View Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Links</em>'.
	 * @see net.bhl.cdt.model.modelview.DisciplineView#getViewLinks()
	 * @see #getDisciplineView()
	 * @generated
	 */
	EReference getDisciplineView_ViewLinks();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.modelview.ViewLink <em>View Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Link</em>'.
	 * @see net.bhl.cdt.model.modelview.ViewLink
	 * @generated
	 */
	EClass getViewLink();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.modelview.ViewLink#getVirtualParent <em>Virtual Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtual Parent</em>'.
	 * @see net.bhl.cdt.model.modelview.ViewLink#getVirtualParent()
	 * @see #getViewLink()
	 * @generated
	 */
	EReference getViewLink_VirtualParent();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.modelview.ViewLink#getVirtualChild <em>Virtual Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtual Child</em>'.
	 * @see net.bhl.cdt.model.modelview.ViewLink#getVirtualChild()
	 * @see #getViewLink()
	 * @generated
	 */
	EReference getViewLink_VirtualChild();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelviewFactory getModelviewFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.modelview.impl.DisciplineViewImpl <em>Discipline View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.modelview.impl.DisciplineViewImpl
		 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getDisciplineView()
		 * @generated
		 */
		EClass DISCIPLINE_VIEW = eINSTANCE.getDisciplineView();

		/**
		 * The meta object literal for the '<em><b>Subviews</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCIPLINE_VIEW__SUBVIEWS = eINSTANCE.getDisciplineView_Subviews();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCIPLINE_VIEW__ELEMENTS = eINSTANCE.getDisciplineView_Elements();

		/**
		 * The meta object literal for the '<em><b>Interface Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCIPLINE_VIEW__INTERFACE_TYPES = eINSTANCE.getDisciplineView_InterfaceTypes();

		/**
		 * The meta object literal for the '<em><b>View Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCIPLINE_VIEW__VIEW_LINKS = eINSTANCE.getDisciplineView_ViewLinks();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.modelview.impl.ViewLinkImpl <em>View Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.modelview.impl.ViewLinkImpl
		 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getViewLink()
		 * @generated
		 */
		EClass VIEW_LINK = eINSTANCE.getViewLink();

		/**
		 * The meta object literal for the '<em><b>Virtual Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_LINK__VIRTUAL_PARENT = eINSTANCE.getViewLink_VirtualParent();

		/**
		 * The meta object literal for the '<em><b>Virtual Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_LINK__VIRTUAL_CHILD = eINSTANCE.getViewLink_VirtualChild();

	}

} //ModelviewPackage
