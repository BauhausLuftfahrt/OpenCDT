/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process;

import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.ProcessElement#isBusy <em>Busy</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.ProcessElement#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.process.ProcessPackage#getProcessElement()
 * @model abstract="true"
 * @generated
 */
public interface ProcessElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busy</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busy</em>' attribute.
	 * @see #setBusy(boolean)
	 * @see net.bhl.cdt.model.process.ProcessPackage#getProcessElement_Busy()
	 * @model
	 * @generated
	 */
	boolean isBusy();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.process.ProcessElement#isBusy <em>Busy</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Busy</em>' attribute.
	 * @see #isBusy()
	 * @generated
	 */
	void setBusy(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(String)
	 * @see net.bhl.cdt.model.process.ProcessPackage#getProcessElement_TimeStamp()
	 * @model
	 * @generated
	 */
	String getTimeStamp();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.process.ProcessElement#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='setBusy(true);\r\n\r\nOperationStrategy executable = null;\r\nOperationStrategy strategy = getStrategy(this.eClass());\r\nif(strategy != null){\r\n\tif (strategy.isStartable(this)){\r\n\t\texecutable = strategy;\r\n\t}\r\n}\r\nif (executable == null && !this.eClass().getEAllSuperTypes().isEmpty()) {\r\n\tfor (EClass superClass : this.eClass().getEAllSuperTypes()) {\r\n\t\tstrategy = getStrategy(superClass);\r\n\t\tif(strategy != null){\r\n\t\t\tif (strategy.isStartable(this)){\r\n\t\t\t\texecutable = strategy;\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n}\r\n\r\nif (executable == null){\r\n\tSystem.out.println(\"No Strategy found!\");\r\n\treturn;\r\n}\r\n\r\nfinal OperationStrategy execute = executable;\r\nfinal ProcessElement self = this;\r\nISafeRunnable runnable = new ISafeRunnable() {\r\n\t@Override\r\n      public void handleException(Throwable e) {\r\n        \tSystem.out.println(\"Exception in Strategy\");\r\n      }\r\n\r\n      @Override\r\n      public void run() throws Exception {\r\n        \texecute.start(self);\r\n      }\r\n};\r\nSafeRunner.run(runnable);\r\n\r\nsetBusy(false);'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='OperationStrategy strategy = getStrategy(this.eClass());\r\ntry {\r\n\tif (strategy != null) {\r\n\t\tif (strategy.isStartable(this)) {\r\n\t\t\treturn true;\r\n\t\t} else {\r\n\t\t\treturn false;\r\n\t\t}\r\n\t}\r\n\tif (!this.eClass().getEAllSuperTypes().isEmpty()) {\r\n\t\tfor (EClass superClass : this.eClass().getEAllSuperTypes()) {\r\n\t\t\tstrategy = getStrategy(superClass);\r\n\t\t\tif (strategy != null) {\r\n\t\t\t\tif (strategy.isStartable(this)) {\r\n\t\t\t\t\treturn true;\r\n\t\t\t\t} else {\r\n\t\t\t\t\treturn false;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n} catch (NullPointerException e) {\r\n\te.printStackTrace();\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isStartable();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="net.bhl.cdt.model.OperationStrategy"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='IExtensionRegistry registry = Platform.getExtensionRegistry();\r\nIConfigurationElement[] config = registry.getConfigurationElementsFor(\"net.bhl.cdt.model.design_operation_strategy\");\r\ntry {\r\n\tfor (IConfigurationElement e : config) {\r\n       \tfinal Object o = e.createExecutableExtension(\"class\");\r\n\t\tOperationStrategy strategy = ((OperationStrategy)o);\r\n       \tif(strategy.getEClass().equals(eClass)){\r\n\t\t\t//if (strategy.isStartable(this)){\r\n\t\t\t\treturn strategy;\r\n\t\t\t//} else {\r\n\t\t\t//\treturn null;\r\n\t\t\t//}\r\n\t\t}\r\n\t}\r\n} catch (CoreException ex) {\r\n\tSystem.out.println(ex.getMessage());\r\n}\r\nreturn null;'"
	 * @generated
	 */
	OperationStrategy getStrategy(EClass eClass);

} // ProcessElement
