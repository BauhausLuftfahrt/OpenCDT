/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.ComponentInterface;
import net.bhl.cdt.model.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.modelview.Filter#getComponent <em>Component</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.Filter#getComplement <em>Complement</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.Filter#getDiscipline <em>Discipline</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.Filter#getDesignPhase <em>Design Phase</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.Filter#getSource <em>Source</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.Filter#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.Filter#getOwner <em>Owner</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.Filter#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends SetExpression {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getFilter_Component()
	 * @model
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getFilter_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.modelview.Filter#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see #setAnnotation(String)
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getFilter_Annotation()
	 * @model
	 * @generated
	 */
	String getAnnotation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.modelview.Filter#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(String value);

	/**
	 * Returns the value of the '<em><b>Discipline</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discipline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discipline</em>' attribute list.
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getFilter_Discipline()
	 * @model
	 * @generated
	 */
	EList<String> getDiscipline();

	/**
	 * Returns the value of the '<em><b>Design Phase</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Phase</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Phase</em>' attribute list.
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getFilter_DesignPhase()
	 * @model
	 * @generated
	 */
	EList<String> getDesignPhase();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getFilter_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.modelview.Filter#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.ComponentInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getFilter_Interface()
	 * @model
	 * @generated
	 */
	EList<ComponentInterface> getInterface();

	/**
	 * Returns the value of the '<em><b>Complement</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' attribute.
	 * @see #setComplement(Boolean)
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getFilter_Complement()
	 * @model default="false"
	 * @generated
	 */
	Boolean getComplement();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.modelview.Filter#getComplement <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement</em>' attribute.
	 * @see #getComplement()
	 * @generated
	 */
	void setComplement(Boolean value);

} // Filter
