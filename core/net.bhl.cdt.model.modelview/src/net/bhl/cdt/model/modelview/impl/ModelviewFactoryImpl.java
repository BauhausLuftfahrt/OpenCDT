/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview.impl;

import net.bhl.cdt.model.modelview.DisciplineView;
import net.bhl.cdt.model.modelview.ModelviewFactory;
import net.bhl.cdt.model.modelview.ModelviewPackage;
import net.bhl.cdt.model.modelview.ViewLink;

import org.eclipse.emf.ecore.EClass;
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
