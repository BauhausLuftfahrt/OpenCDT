/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.calculationrepository.functions.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.calculationrepository.exceptions.CalculationException;
import net.bhl.cdt.calculationrepository.functions.FunctionsPackage;
import net.bhl.cdt.calculationrepository.functions.ScilabFunction;
import net.bhl.cdt.calculationrepository.kernel.scilab.ScilabKernel;
import net.bhl.cdt.utilities.datatypes.DatatypesFactory;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Scilab Function</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link net.bhl.cdt.calculationrepository.functions.impl.ScilabFunctionImpl#getFunctionDefinition <em>Function
 * Definition</em>}</li>
 * <li>
 * {@link net.bhl.cdt.calculationrepository.functions.impl.ScilabFunctionImpl#getFunctionBody <em>Function Body
 * </em>}</li>
 * <li>
 * {@link net.bhl.cdt.calculationrepository.functions.impl.ScilabFunctionImpl#getFunctionCall <em>Function Call
 * </em>}</li>
 * <li>
 * {@link net.bhl.cdt.calculationrepository.functions.impl.ScilabFunctionImpl#getFunctionReturn <em>Function Return
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ScilabFunctionImpl extends CalculationScriptImpl implements ScilabFunction {
	/**
	 * The default value of the '{@link #getFunctionDefinition() <em>Function Definition</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFunctionDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_DEFINITION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFunctionDefinition() <em>Function Definition</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFunctionDefinition()
	 * @generated
	 * @ordered
	 */
	protected String functionDefinition = FUNCTION_DEFINITION_EDEFAULT;
	/**
	 * The default value of the '{@link #getFunctionBody() <em>Function Body</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctionBody()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_BODY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFunctionBody() <em>Function Body</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctionBody()
	 * @generated
	 * @ordered
	 */
	protected String functionBody = FUNCTION_BODY_EDEFAULT;
	/**
	 * The default value of the '{@link #getFunctionCall() <em>Function Call</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctionCall()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_CALL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFunctionCall() <em>Function Call</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctionCall()
	 * @generated
	 * @ordered
	 */
	protected String functionCall = FUNCTION_CALL_EDEFAULT;
	/**
	 * The default value of the '{@link #getFunctionReturn() <em>Function Return</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getFunctionReturn()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_RETURN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFunctionReturn() <em>Function Return</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getFunctionReturn()
	 * @generated
	 * @ordered
	 */
	protected String functionReturn = FUNCTION_RETURN_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ScilabFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.SCILAB_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFunctionDefinition() {
		return functionDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFunctionDefinition(String newFunctionDefinition) {
		String oldFunctionDefinition = functionDefinition;
		functionDefinition = newFunctionDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				FunctionsPackage.SCILAB_FUNCTION__FUNCTION_DEFINITION, oldFunctionDefinition, functionDefinition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFunctionBody() {
		return functionBody;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFunctionBody(String newFunctionBody) {
		String oldFunctionBody = functionBody;
		functionBody = newFunctionBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SCILAB_FUNCTION__FUNCTION_BODY,
				oldFunctionBody, functionBody));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFunctionCall() {
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFunctionCall(String newFunctionCall) {
		String oldFunctionCall = functionCall;
		functionCall = newFunctionCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SCILAB_FUNCTION__FUNCTION_CALL,
				oldFunctionCall, functionCall));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFunctionReturn() {
		return functionReturn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFunctionReturn(String newFunctionReturn) {
		String oldFunctionReturn = functionReturn;
		functionReturn = newFunctionReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SCILAB_FUNCTION__FUNCTION_RETURN,
				oldFunctionReturn, functionReturn));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_DEFINITION:
			return getFunctionDefinition();
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_BODY:
			return getFunctionBody();
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_CALL:
			return getFunctionCall();
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_RETURN:
			return getFunctionReturn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_DEFINITION:
			setFunctionDefinition((String) newValue);
			return;
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_BODY:
			setFunctionBody((String) newValue);
			return;
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_CALL:
			setFunctionCall((String) newValue);
			return;
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_RETURN:
			setFunctionReturn((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_DEFINITION:
			setFunctionDefinition(FUNCTION_DEFINITION_EDEFAULT);
			return;
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_BODY:
			setFunctionBody(FUNCTION_BODY_EDEFAULT);
			return;
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_CALL:
			setFunctionCall(FUNCTION_CALL_EDEFAULT);
			return;
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_RETURN:
			setFunctionReturn(FUNCTION_RETURN_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_DEFINITION:
			return FUNCTION_DEFINITION_EDEFAULT == null ? functionDefinition != null : !FUNCTION_DEFINITION_EDEFAULT
				.equals(functionDefinition);
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_BODY:
			return FUNCTION_BODY_EDEFAULT == null ? functionBody != null : !FUNCTION_BODY_EDEFAULT.equals(functionBody);
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_CALL:
			return FUNCTION_CALL_EDEFAULT == null ? functionCall != null : !FUNCTION_CALL_EDEFAULT.equals(functionCall);
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_RETURN:
			return FUNCTION_RETURN_EDEFAULT == null ? functionReturn != null : !FUNCTION_RETURN_EDEFAULT
				.equals(functionReturn);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (functionDefinition: ");
		result.append(functionDefinition);
		result.append(", functionBody: ");
		result.append(functionBody);
		result.append(", functionCall: ");
		result.append(functionCall);
		result.append(", functionReturn: ");
		result.append(functionReturn);
		result.append(')');
		return result.toString();
	}

	public List<MeasuredValue> eval(List<MeasuredValue> inputValues) throws CalculationException {

		String call = mapValuesToParameters(inputValues);
		ScilabKernel sciKer = ScilabKernel.getInstance();
		List<Double> eval = sciKer.eval(getFunctionDefinition(), getFunctionBody(), call, getFunctionReturn());
		// List<Double> eval = ScilabKernel.getInstance().eval(getFunctionDefinition(), getFunctionBody(), call,
		// getFunctionReturn());

		return createResult(eval);
	}

	private ArrayList<MeasuredValue> createResult(List<Double> eval) {
		ArrayList<MeasuredValue> result = new ArrayList<MeasuredValue>();

		int i = 0;
		for (Double d : eval) {
			MeasuredValue value = DatatypesFactory.eINSTANCE.createMeasuredValue();
			value.setUnit(getOutputDescriptors().get(i++).getUnit());
			value.setValue(d);
			result.add(value);
		}

		return result;
	}

	protected String mapValuesToParameters(List<MeasuredValue> inputValues) {
		String result = getFunctionCall();
		for (int i = 0; i < inputValues.size(); i++) {
			result = result.replaceFirst("%param" + (i + 1), "" + inputValues.get(i).getValue());
		}
		return result;
	}

	public void setScriptText(String newScriptText) {
		super.setScriptText(newScriptText);
		load();
	}

	public void load() {
		load(null);
	}

	public void load(String fileName) {
		String result = "";
		if (fileName == null) {
			result = getScriptText();
		} else {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getClassLoader()
					.getResourceAsStream("net/bhl/cdt/calculationrepository/repo/" + fileName)));
				String tmp;
				while ((tmp = reader.readLine()) != null) {
					result += tmp + System.getProperty("line.separator");
				}
			} catch (IOException e) {
				e.printStackTrace();
				// fail silently
			}
		}
		parse(result);

	}

	protected void parse(String skriptString) {

		String def = "";
		String body = "";

		int i = 1;
		for (String line : skriptString.split(System.getProperty("line.separator"))) {

			// cut comments, TODO check correctness
			if (line.contains("//")) {
				line = line.substring(0, line.indexOf("//"));
			}
			// cut newline characters
			line = line.replace("\n", " ");
			line = line.replace("\r", " ");
			// trim
			// line = line.trim();

			if (line.equals("")) {
				continue;
			}

			if (i == 1) {
				line = line.replaceFirst("function", "").trim();
				def = line;
			} else {
				body += line;
			}
			i++;
		}

		setFunctionDefinition(def);
		setFunctionBody(body);

		// String answer = getNamesubstring(0, fileName.lastIndexOf("."));
		String answer = getFunctionID().substring(getFunctionID().lastIndexOf(".") + 1);

		setFunctionReturn((answer.length() > 15) ? answer.substring(0, 15) : answer + "Answer");
		setFunctionCall(getFunctionReturn() + " = " + generateFunctionCall());

	}

	/*
	 * // TODO code not safe against invalid data protected void importFile(String fileName) { try { InputStream input =
	 * getClass().getClassLoader().getResourceAsStream( "net/bhl/cdt/calculationrepository/repo/" + fileName);
	 * BufferedReader reader = new BufferedReader(new InputStreamReader(input)); String def = ""; String body = "";
	 * def.split("\n"); String line = null; int i = 1; for (String line : def.split("")) while ((line =
	 * reader.readLine()) != null) { // cut comments, TODO check correctnes if (line.contains("//")) { line =
	 * line.substring(0, line.indexOf("//")); } // cut newline characters line = line.replace("\n", " "); line =
	 * line.replace("\r", " "); // trim // line = line.trim(); if (line.equals("")) { continue; } if (i == 1) { line =
	 * line.replaceFirst("function", "").trim(); def = line; } else { body += line; } i++; } setFunctionDefinition(def);
	 * setFunctionBody(body); String answer = fileName.substring(0, fileName.lastIndexOf("."));
	 * setFunctionReturn((answer.length() > 15) ? answer.substring(0, 15) : answer + "Answer");
	 * setFunctionCall(getFunctionReturn() + " = " + generateFunctionCall()); } catch (IOException e) {
	 * e.printStackTrace(); // fail silently } }
	 */

	// TODO code not safe against invalid data
	private String generateFunctionCall() {
		String definition = getFunctionDefinition();
		definition = definition.substring(definition.indexOf("=") + 1).trim();
		String functionName = definition.substring(0, definition.indexOf("(")).trim();
		definition = definition.substring(definition.indexOf("(")).replace(")", "").trim();
		String params = "";
		int i = 1;
		for (@SuppressWarnings("unused")
		String part : definition.split(",")) {
			params += "%param" + (i++) + ",";
		}
		params = params.substring(0, params.length() - 1);

		return functionName + "(" + params + ");";
	}
} // ScilabFunctionImpl
