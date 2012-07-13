/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.architecturetools;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Velocity Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.architecturetools.VelocityInterface#getVelocityParameter <em>Velocity Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getVelocityInterface()
 * @model
 * @generated
 */
public interface VelocityInterface extends MappableComponentInterface {
	/**
	 * Returns the value of the '<em><b>Velocity Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity Parameter</em>' reference.
	 * @see #setVelocityParameter(Parameter)
	 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getVelocityInterface_VelocityParameter()
	 * @model
	 * @generated
	 */
	Parameter getVelocityParameter();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.architecturetools.VelocityInterface#getVelocityParameter <em>Velocity Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity Parameter</em>' reference.
	 * @see #getVelocityParameter()
	 * @generated
	 */
	void setVelocityParameter(Parameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Value getVelocity();

} // VelocityInterface
