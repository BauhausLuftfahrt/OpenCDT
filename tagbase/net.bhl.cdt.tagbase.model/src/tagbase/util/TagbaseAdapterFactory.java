/**
 */
package tagbase.util;

import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tagbase.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tagbase.TagbasePackage
 * @generated
 */
public class TagbaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TagbasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagbaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TagbasePackage.eINSTANCE;
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
	protected TagbaseSwitch<Adapter> modelSwitch =
		new TagbaseSwitch<Adapter>() {
			@Override
			public Adapter caseTagBase(TagBase object) {
				return createTagBaseAdapter();
			}
			@Override
			public Adapter caseITagable(ITagable object) {
				return createITagableAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseNamedTag(NamedTag object) {
				return createNamedTagAdapter();
			}
			@Override
			public Adapter caseAbstractLoggedItem(AbstractLoggedItem object) {
				return createAbstractLoggedItemAdapter();
			}
			@Override
			public Adapter caseNamedTagDefinition(NamedTagDefinition object) {
				return createNamedTagDefinitionAdapter();
			}
			@Override
			public Adapter caseTagSet(TagSet object) {
				return createTagSetAdapter();
			}
			@Override
			public Adapter caseTagDefinitionSet(TagDefinitionSet object) {
				return createTagDefinitionSetAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link tagbase.TagBase <em>Tag Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tagbase.TagBase
	 * @generated
	 */
	public Adapter createTagBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tagbase.ITagable <em>ITagable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tagbase.ITagable
	 * @generated
	 */
	public Adapter createITagableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tagbase.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tagbase.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tagbase.NamedTag <em>Named Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tagbase.NamedTag
	 * @generated
	 */
	public Adapter createNamedTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tagbase.AbstractLoggedItem <em>Abstract Logged Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tagbase.AbstractLoggedItem
	 * @generated
	 */
	public Adapter createAbstractLoggedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tagbase.NamedTagDefinition <em>Named Tag Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tagbase.NamedTagDefinition
	 * @generated
	 */
	public Adapter createNamedTagDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tagbase.TagSet <em>Tag Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tagbase.TagSet
	 * @generated
	 */
	public Adapter createTagSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tagbase.TagDefinitionSet <em>Tag Definition Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tagbase.TagDefinitionSet
	 * @generated
	 */
	public Adapter createTagDefinitionSetAdapter() {
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

} //TagbaseAdapterFactory
