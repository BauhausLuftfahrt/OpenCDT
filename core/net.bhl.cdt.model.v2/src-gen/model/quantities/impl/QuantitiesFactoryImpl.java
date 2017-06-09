/**
 */
package model.quantities.impl;

import javax.measure.quantity.Length;
import javax.measure.quantity.Quantity;

import javax.measure.unit.Unit;
import model.quantities.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantitiesFactoryImpl extends EFactoryImpl implements QuantitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuantitiesFactory init() {
		try {
			QuantitiesFactory theQuantitiesFactory = (QuantitiesFactory)EPackage.Registry.INSTANCE.getEFactory(QuantitiesPackage.eNS_URI);
			if (theQuantitiesFactory != null) {
				return theQuantitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuantitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitiesFactoryImpl() {
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
			case QuantitiesPackage.STRING_PARAMETER: return createStringParameter();
			case QuantitiesPackage.LENGTH_PARAMENTER: return createLengthParamenter();
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
			case QuantitiesPackage.LENGTH:
				return createLengthFromString(eDataType, initialValue);
			case QuantitiesPackage.DISTANCE:
				return createDistanceFromString(eDataType, initialValue);
			case QuantitiesPackage.AMOUNT:
				return createAmountFromString(eDataType, initialValue);
			case QuantitiesPackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
			case QuantitiesPackage.QUANTITY:
				return createQuantityFromString(eDataType, initialValue);
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
			case QuantitiesPackage.LENGTH:
				return convertLengthToString(eDataType, instanceValue);
			case QuantitiesPackage.DISTANCE:
				return convertDistanceToString(eDataType, instanceValue);
			case QuantitiesPackage.AMOUNT:
				return convertAmountToString(eDataType, instanceValue);
			case QuantitiesPackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			case QuantitiesPackage.QUANTITY:
				return convertQuantityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParameter createStringParameter() {
		StringParameterImpl stringParameter = new StringParameterImpl();
		return stringParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthParamenter createLengthParamenter() {
		LengthParamenterImpl lengthParamenter = new LengthParamenterImpl();
		return lengthParamenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLengthFromString(EDataType eDataType, String initialValue) {
		return (Length)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createDistanceFromString(EDataType eDataType, String initialValue) {
		return (Length)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistanceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amount<?> createAmountFromString(EDataType eDataType, String initialValue) {
		return (Amount<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmountToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit<?> createUnitFromString(EDataType eDataType, String initialValue) {
		return (Unit<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantityFromString(EDataType eDataType, String initialValue) {
		return (Quantity)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitiesPackage getQuantitiesPackage() {
		return (QuantitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuantitiesPackage getPackage() {
		return QuantitiesPackage.eINSTANCE;
	}

} //QuantitiesFactoryImpl
