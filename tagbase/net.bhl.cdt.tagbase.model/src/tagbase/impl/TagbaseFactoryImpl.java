/**
 */
package tagbase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tagbase.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TagbaseFactoryImpl extends EFactoryImpl implements TagbaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TagbaseFactory init() {
		try {
			TagbaseFactory theTagbaseFactory = (TagbaseFactory)EPackage.Registry.INSTANCE.getEFactory(TagbasePackage.eNS_URI);
			if (theTagbaseFactory != null) {
				return theTagbaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TagbaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagbaseFactoryImpl() {
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
			case TagbasePackage.TAG_BASE: return createTagBase();
			case TagbasePackage.TAG: return createTag();
			case TagbasePackage.NAMED_TAG: return createNamedTag();
			case TagbasePackage.NAMED_TAG_DEFINITION: return createNamedTagDefinition();
			case TagbasePackage.TAG_SET: return createTagSet();
			case TagbasePackage.TAG_DEFINITION_SET: return createTagDefinitionSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagBase createTagBase() {
		TagBaseImpl tagBase = new TagBaseImpl();
		return tagBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTag createNamedTag() {
		NamedTagImpl namedTag = new NamedTagImpl();
		return namedTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTagDefinition createNamedTagDefinition() {
		NamedTagDefinitionImpl namedTagDefinition = new NamedTagDefinitionImpl();
		return namedTagDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagSet createTagSet() {
		TagSetImpl tagSet = new TagSetImpl();
		return tagSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagDefinitionSet createTagDefinitionSet() {
		TagDefinitionSetImpl tagDefinitionSet = new TagDefinitionSetImpl();
		return tagDefinitionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagbasePackage getTagbasePackage() {
		return (TagbasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TagbasePackage getPackage() {
		return TagbasePackage.eINSTANCE;
	}

} //TagbaseFactoryImpl
