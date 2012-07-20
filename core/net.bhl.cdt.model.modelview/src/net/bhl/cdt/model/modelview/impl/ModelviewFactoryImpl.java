/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview.impl;

import net.bhl.cdt.model.modelview.*;
import net.bhl.cdt.model.modelview.DisciplineView;
import net.bhl.cdt.model.modelview.ModelviewFactory;
import net.bhl.cdt.model.modelview.ModelviewPackage;
import net.bhl.cdt.model.modelview.ViewLink;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelviewFactoryImpl extends EFactoryImpl implements ModelviewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelviewFactory init() {
		try {
			ModelviewFactory theModelviewFactory = (ModelviewFactory)EPackage.Registry.INSTANCE.getEFactory("http://bhl.net/cdt/model/modelview"); 
			if (theModelviewFactory != null) {
				return theModelviewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelviewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelviewFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelviewPackage.DISCIPLINE_VIEW: return createDisciplineView();
			case ModelviewPackage.VIEW_LINK: return createViewLink();
			case ModelviewPackage.FILTER: return createFilter();
			case ModelviewPackage.SET_OPERATOR: return createSetOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelviewPackage.SET_OPERATORS:
				return createSetOperatorsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelviewPackage.SET_OPERATORS:
				return convertSetOperatorsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplineView createDisciplineView() {
		DisciplineViewImpl disciplineView = new DisciplineViewImpl();
		return disciplineView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewLink createViewLink() {
		ViewLinkImpl viewLink = new ViewLinkImpl();
		return viewLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOperator createSetOperator() {
		SetOperatorImpl setOperator = new SetOperatorImpl();
		return setOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOperators createSetOperatorsFromString(EDataType eDataType, String initialValue) {
		SetOperators result = SetOperators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetOperatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelviewPackage getModelviewPackage() {
		return (ModelviewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelviewPackage getPackage() {
		return ModelviewPackage.eINSTANCE;
	}

} //ModelviewFactoryImpl
