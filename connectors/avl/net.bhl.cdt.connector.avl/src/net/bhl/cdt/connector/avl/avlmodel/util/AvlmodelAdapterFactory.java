/**
 */
package net.bhl.cdt.connector.avl.avlmodel.util;

import net.bhl.cdt.connector.avl.avlmodel.*;
import net.bhl.cdt.connector.files.FileGenerator;
import net.bhl.cdt.connector.files.FileOperation;
import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.process.DesignOperation;
import net.bhl.cdt.model.process.ProcessElement;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage
 * @generated
 */
public class AvlmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AvlmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvlmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AvlmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvlmodelSwitch<Adapter> modelSwitch =
		new AvlmodelSwitch<Adapter>() {
			@Override
			public Adapter caseAVLModelGenerator(AVLModelGenerator object) {
				return createAVLModelGeneratorAdapter();
			}
			@Override
			public Adapter caseYDuplicate(YDuplicate object) {
				return createYDuplicateAdapter();
			}
			@Override
			public Adapter caseAVLSurface(AVLSurface object) {
				return createAVLSurfaceAdapter();
			}
			@Override
			public Adapter caseAVLSection(AVLSection object) {
				return createAVLSectionAdapter();
			}
			@Override
			public Adapter caseAVLControlSurface(AVLControlSurface object) {
				return createAVLControlSurfaceAdapter();
			}
			@Override
			public Adapter caseSufaceAngle(SufaceAngle object) {
				return createSufaceAngleAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseProcessElement(ProcessElement object) {
				return createProcessElementAdapter();
			}
			@Override
			public Adapter caseDesignOperation(DesignOperation object) {
				return createDesignOperationAdapter();
			}
			@Override
			public Adapter caseFileOperation(FileOperation object) {
				return createFileOperationAdapter();
			}
			@Override
			public Adapter caseOperationWithInput(OperationWithInput object) {
				return createOperationWithInputAdapter();
			}
			@Override
			public Adapter caseFileGenerator(FileGenerator object) {
				return createFileGeneratorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator <em>AVL Model Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator
	 * @generated
	 */
	public Adapter createAVLModelGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.connector.avl.avlmodel.YDuplicate <em>YDuplicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.connector.avl.avlmodel.YDuplicate
	 * @generated
	 */
	public Adapter createYDuplicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface <em>AVL Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSurface
	 * @generated
	 */
	public Adapter createAVLSurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection <em>AVL Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSection
	 * @generated
	 */
	public Adapter createAVLSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface <em>AVL Control Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface
	 * @generated
	 */
	public Adapter createAVLControlSurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.connector.avl.avlmodel.SufaceAngle <em>Suface Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SufaceAngle
	 * @generated
	 */
	public Adapter createSufaceAngleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.ProcessElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.ProcessElement
	 * @generated
	 */
	public Adapter createProcessElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.DesignOperation <em>Design Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.DesignOperation
	 * @generated
	 */
	public Adapter createDesignOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.connector.files.FileOperation <em>File Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.connector.files.FileOperation
	 * @generated
	 */
	public Adapter createFileOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.OperationWithInput <em>Operation With Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.OperationWithInput
	 * @generated
	 */
	public Adapter createOperationWithInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.connector.files.FileGenerator <em>File Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.connector.files.FileGenerator
	 * @generated
	 */
	public Adapter createFileGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AvlmodelAdapterFactory
