/**
 */
package model.quantities.impl;

import javax.measure.quantity.Length;

import javax.measure.unit.Unit;

import model.base.AIdentifiableItem;
import model.base.BasePackage;

import model.base.impl.ANamedItemImpl;

import model.quantities.LengthParamenter;
import model.quantities.QuantitiesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length Paramenter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.quantities.impl.LengthParamenterImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.quantities.impl.LengthParamenterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link model.quantities.impl.LengthParamenterImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LengthParamenterImpl extends ANamedItemImpl implements LengthParamenter {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Amount<Length> value;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit<Length> unit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LengthParamenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuantitiesPackage.Literals.LENGTH_PARAMENTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuantitiesPackage.LENGTH_PARAMENTER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amount<Length> getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Amount<Length> newValue) {
		Amount<Length> oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuantitiesPackage.LENGTH_PARAMENTER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit<Length> getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit<Length> newUnit) {
		Unit<Length> oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuantitiesPackage.LENGTH_PARAMENTER__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuantitiesPackage.LENGTH_PARAMENTER__ID:
				return getId();
			case QuantitiesPackage.LENGTH_PARAMENTER__VALUE:
				return getValue();
			case QuantitiesPackage.LENGTH_PARAMENTER__UNIT:
				return getUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuantitiesPackage.LENGTH_PARAMENTER__ID:
				setId((String)newValue);
				return;
			case QuantitiesPackage.LENGTH_PARAMENTER__VALUE:
				setValue((Amount<Length>)newValue);
				return;
			case QuantitiesPackage.LENGTH_PARAMENTER__UNIT:
				setUnit((Unit<Length>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QuantitiesPackage.LENGTH_PARAMENTER__ID:
				setId(ID_EDEFAULT);
				return;
			case QuantitiesPackage.LENGTH_PARAMENTER__VALUE:
				setValue((Amount<Length>)null);
				return;
			case QuantitiesPackage.LENGTH_PARAMENTER__UNIT:
				setUnit((Unit<Length>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QuantitiesPackage.LENGTH_PARAMENTER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case QuantitiesPackage.LENGTH_PARAMENTER__VALUE:
				return value != null;
			case QuantitiesPackage.LENGTH_PARAMENTER__UNIT:
				return unit != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AIdentifiableItem.class) {
			switch (derivedFeatureID) {
				case QuantitiesPackage.LENGTH_PARAMENTER__ID: return BasePackage.AIDENTIFIABLE_ITEM__ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AIdentifiableItem.class) {
			switch (baseFeatureID) {
				case BasePackage.AIDENTIFIABLE_ITEM__ID: return QuantitiesPackage.LENGTH_PARAMENTER__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //LengthParamenterImpl
