/**
 */
package reporting.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reporting.DateAxis;
import reporting.ReportingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reporting.impl.DateAxisImpl#getFormatString <em>Format String</em>}</li>
 *   <li>{@link reporting.impl.DateAxisImpl#getMinDate <em>Min Date</em>}</li>
 *   <li>{@link reporting.impl.DateAxisImpl#getMaxDate <em>Max Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateAxisImpl extends AxisImpl implements DateAxis {
	/**
	 * The default value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected String formatString = FORMAT_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinDate() <em>Min Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date MIN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinDate() <em>Min Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDate()
	 * @generated
	 * @ordered
	 */
	protected Date minDate = MIN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDate() <em>Max Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date MAX_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDate() <em>Max Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDate()
	 * @generated
	 * @ordered
	 */
	protected Date maxDate = MAX_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateAxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingPackage.Literals.DATE_AXIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatString() {
		return formatString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatString(String newFormatString) {
		String oldFormatString = formatString;
		formatString = newFormatString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATE_AXIS__FORMAT_STRING, oldFormatString, formatString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMinDate() {
		return minDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDate(Date newMinDate) {
		Date oldMinDate = minDate;
		minDate = newMinDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATE_AXIS__MIN_DATE, oldMinDate, minDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMaxDate() {
		return maxDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDate(Date newMaxDate) {
		Date oldMaxDate = maxDate;
		maxDate = newMaxDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.DATE_AXIS__MAX_DATE, oldMaxDate, maxDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingPackage.DATE_AXIS__FORMAT_STRING:
				return getFormatString();
			case ReportingPackage.DATE_AXIS__MIN_DATE:
				return getMinDate();
			case ReportingPackage.DATE_AXIS__MAX_DATE:
				return getMaxDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportingPackage.DATE_AXIS__FORMAT_STRING:
				setFormatString((String)newValue);
				return;
			case ReportingPackage.DATE_AXIS__MIN_DATE:
				setMinDate((Date)newValue);
				return;
			case ReportingPackage.DATE_AXIS__MAX_DATE:
				setMaxDate((Date)newValue);
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
			case ReportingPackage.DATE_AXIS__FORMAT_STRING:
				setFormatString(FORMAT_STRING_EDEFAULT);
				return;
			case ReportingPackage.DATE_AXIS__MIN_DATE:
				setMinDate(MIN_DATE_EDEFAULT);
				return;
			case ReportingPackage.DATE_AXIS__MAX_DATE:
				setMaxDate(MAX_DATE_EDEFAULT);
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
			case ReportingPackage.DATE_AXIS__FORMAT_STRING:
				return FORMAT_STRING_EDEFAULT == null ? formatString != null : !FORMAT_STRING_EDEFAULT.equals(formatString);
			case ReportingPackage.DATE_AXIS__MIN_DATE:
				return MIN_DATE_EDEFAULT == null ? minDate != null : !MIN_DATE_EDEFAULT.equals(minDate);
			case ReportingPackage.DATE_AXIS__MAX_DATE:
				return MAX_DATE_EDEFAULT == null ? maxDate != null : !MAX_DATE_EDEFAULT.equals(maxDate);
		}
		return super.eIsSet(featureID);
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
		result.append(" (FormatString: ");
		result.append(formatString);
		result.append(", MinDate: ");
		result.append(minDate);
		result.append(", MaxDate: ");
		result.append(maxDate);
		result.append(')');
		return result.toString();
	}

} //DateAxisImpl
