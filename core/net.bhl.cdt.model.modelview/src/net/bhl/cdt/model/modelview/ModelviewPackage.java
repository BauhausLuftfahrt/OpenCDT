/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview;

import net.bhl.cdt.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_VIEW__ELEMENTS = ModelPackage.VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_VIEW__INTERFACE_TYPES = ModelPackage.VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_VIEW__VIEW_LINKS = ModelPackage.VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_VIEW__FILTER = ModelPackage.VIEW_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.modelview.impl.SetExpressionImpl <em>Set Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.modelview.impl.SetExpressionImpl
	 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getSetExpression()
	 * @generated
	 */
	int SET_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Set Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.modelview.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.modelview.impl.FilterImpl
	 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NAME = SET_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__INTERFACE = SET_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__COMPONENT = SET_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__SOURCE = SET_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__DISCIPLINE = SET_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__TEXT = SET_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Complement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__COMPLEMENT = SET_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = SET_EXPRESSION_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.modelview.impl.SetOperatorImpl <em>Set Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.modelview.impl.SetOperatorImpl
	 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getSetOperator()
	 * @generated
	 */
	int SET_OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR__NAME = SET_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR__OPERATOR = SET_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR__OPERANDS = SET_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR_FEATURE_COUNT = SET_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.modelview.SetOperators <em>Set Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.modelview.SetOperators
	 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getSetOperators()
	 * @generated
	 */
	int SET_OPERATORS = 5;


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
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.modelview.DisciplineView#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see net.bhl.cdt.model.modelview.DisciplineView#getFilter()
	 * @see #getDisciplineView()
	 * @generated
	 */
	EReference getDisciplineView_Filter();

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
	 * Returns the meta object for class '{@link net.bhl.cdt.model.modelview.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see net.bhl.cdt.model.modelview.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.modelview.Filter#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see net.bhl.cdt.model.modelview.Filter#getInterface()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Interface();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.modelview.Filter#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see net.bhl.cdt.model.modelview.Filter#getComponent()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Component();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.modelview.Filter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see net.bhl.cdt.model.modelview.Filter#getSource()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Source();

	/**
	 * Returns the meta object for the attribute list '{@link net.bhl.cdt.model.modelview.Filter#getDiscipline <em>Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Discipline</em>'.
	 * @see net.bhl.cdt.model.modelview.Filter#getDiscipline()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Discipline();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.modelview.Filter#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.bhl.cdt.model.modelview.Filter#getText()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.modelview.Filter#getComplement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complement</em>'.
	 * @see net.bhl.cdt.model.modelview.Filter#getComplement()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Complement();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.modelview.SetExpression <em>Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Expression</em>'.
	 * @see net.bhl.cdt.model.modelview.SetExpression
	 * @generated
	 */
	EClass getSetExpression();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.modelview.SetOperator <em>Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Operator</em>'.
	 * @see net.bhl.cdt.model.modelview.SetOperator
	 * @generated
	 */
	EClass getSetOperator();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.modelview.SetOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see net.bhl.cdt.model.modelview.SetOperator#getOperator()
	 * @see #getSetOperator()
	 * @generated
	 */
	EAttribute getSetOperator_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.modelview.SetOperator#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see net.bhl.cdt.model.modelview.SetOperator#getOperands()
	 * @see #getSetOperator()
	 * @generated
	 */
	EReference getSetOperator_Operands();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.modelview.SetOperators <em>Set Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Set Operators</em>'.
	 * @see net.bhl.cdt.model.modelview.SetOperators
	 * @generated
	 */
	EEnum getSetOperators();

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
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCIPLINE_VIEW__FILTER = eINSTANCE.getDisciplineView_Filter();

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

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.modelview.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.modelview.impl.FilterImpl
		 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__INTERFACE = eINSTANCE.getFilter_Interface();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__COMPONENT = eINSTANCE.getFilter_Component();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__SOURCE = eINSTANCE.getFilter_Source();

		/**
		 * The meta object literal for the '<em><b>Discipline</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__DISCIPLINE = eINSTANCE.getFilter_Discipline();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__TEXT = eINSTANCE.getFilter_Text();

		/**
		 * The meta object literal for the '<em><b>Complement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__COMPLEMENT = eINSTANCE.getFilter_Complement();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.modelview.impl.SetExpressionImpl <em>Set Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.modelview.impl.SetExpressionImpl
		 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getSetExpression()
		 * @generated
		 */
		EClass SET_EXPRESSION = eINSTANCE.getSetExpression();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.modelview.impl.SetOperatorImpl <em>Set Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.modelview.impl.SetOperatorImpl
		 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getSetOperator()
		 * @generated
		 */
		EClass SET_OPERATOR = eINSTANCE.getSetOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPERATOR__OPERATOR = eINSTANCE.getSetOperator_Operator();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_OPERATOR__OPERANDS = eINSTANCE.getSetOperator_Operands();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.modelview.SetOperators <em>Set Operators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.modelview.SetOperators
		 * @see net.bhl.cdt.model.modelview.impl.ModelviewPackageImpl#getSetOperators()
		 * @generated
		 */
		EEnum SET_OPERATORS = eINSTANCE.getSetOperators();

	}

} //ModelviewPackage
