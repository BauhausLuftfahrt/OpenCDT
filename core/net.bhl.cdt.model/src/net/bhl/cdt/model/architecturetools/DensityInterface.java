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
 * A representation of the model object '<em><b>Density Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.architecturetools.DensityInterface#getDensityParameter <em>Density Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getDensityInterface()
 * @model
 * @generated
 */
public interface DensityInterface extends MappableComponentInterface {
	/**
	 * Returns the value of the '<em><b>Density Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Density Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Density Parameter</em>' reference.
	 * @see #setDensityParameter(Parameter)
	 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getDensityInterface_DensityParameter()
	 * @model
	 * @generated
	 */
	Parameter getDensityParameter();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.architecturetools.DensityInterface#getDensityParameter <em>Density Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Density Parameter</em>' reference.
	 * @see #getDensityParameter()
	 * @generated
	 */
	void setDensityParameter(Parameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Value getDensity();

} // DensityInterface
