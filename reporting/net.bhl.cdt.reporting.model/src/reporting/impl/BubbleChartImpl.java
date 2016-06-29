/**
 */
package reporting.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reporting.BubbleChart;
import reporting.DataField;
import reporting.ReportingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bubble Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reporting.impl.BubbleChartImpl#getXCoordinateField <em>XCoordinate Field</em>}</li>
 *   <li>{@link reporting.impl.BubbleChartImpl#getYCoordinateField <em>YCoordinate Field</em>}</li>
 *   <li>{@link reporting.impl.BubbleChartImpl#getBubbleSizeField <em>Bubble Size Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BubbleChartImpl extends Chart2DImpl implements BubbleChart {
	/**
	 * The cached value of the '{@link #getXCoordinateField() <em>XCoordinate Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinateField()
	 * @generated
	 * @ordered
	 */
	protected DataField xCoordinateField;

	/**
	 * The cached value of the '{@link #getYCoordinateField() <em>YCoordinate Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinateField()
	 * @generated
	 * @ordered
	 */
	protected DataField yCoordinateField;

	/**
	 * The cached value of the '{@link #getBubbleSizeField() <em>Bubble Size Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBubbleSizeField()
	 * @generated
	 * @ordered
	 */
	protected DataField bubbleSizeField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BubbleChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingPackage.Literals.BUBBLE_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataField getXCoordinateField() {
		return xCoordinateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXCoordinateField(DataField newXCoordinateField, NotificationChain msgs) {
		DataField oldXCoordinateField = xCoordinateField;
		xCoordinateField = newXCoordinateField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.BUBBLE_CHART__XCOORDINATE_FIELD, oldXCoordinateField, newXCoordinateField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXCoordinateField(DataField newXCoordinateField) {
		if (newXCoordinateField != xCoordinateField) {
			NotificationChain msgs = null;
			if (xCoordinateField != null)
				msgs = ((InternalEObject)xCoordinateField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.BUBBLE_CHART__XCOORDINATE_FIELD, null, msgs);
			if (newXCoordinateField != null)
				msgs = ((InternalEObject)newXCoordinateField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.BUBBLE_CHART__XCOORDINATE_FIELD, null, msgs);
			msgs = basicSetXCoordinateField(newXCoordinateField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.BUBBLE_CHART__XCOORDINATE_FIELD, newXCoordinateField, newXCoordinateField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataField getYCoordinateField() {
		return yCoordinateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYCoordinateField(DataField newYCoordinateField, NotificationChain msgs) {
		DataField oldYCoordinateField = yCoordinateField;
		yCoordinateField = newYCoordinateField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.BUBBLE_CHART__YCOORDINATE_FIELD, oldYCoordinateField, newYCoordinateField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCoordinateField(DataField newYCoordinateField) {
		if (newYCoordinateField != yCoordinateField) {
			NotificationChain msgs = null;
			if (yCoordinateField != null)
				msgs = ((InternalEObject)yCoordinateField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.BUBBLE_CHART__YCOORDINATE_FIELD, null, msgs);
			if (newYCoordinateField != null)
				msgs = ((InternalEObject)newYCoordinateField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.BUBBLE_CHART__YCOORDINATE_FIELD, null, msgs);
			msgs = basicSetYCoordinateField(newYCoordinateField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.BUBBLE_CHART__YCOORDINATE_FIELD, newYCoordinateField, newYCoordinateField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataField getBubbleSizeField() {
		return bubbleSizeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBubbleSizeField(DataField newBubbleSizeField, NotificationChain msgs) {
		DataField oldBubbleSizeField = bubbleSizeField;
		bubbleSizeField = newBubbleSizeField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.BUBBLE_CHART__BUBBLE_SIZE_FIELD, oldBubbleSizeField, newBubbleSizeField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBubbleSizeField(DataField newBubbleSizeField) {
		if (newBubbleSizeField != bubbleSizeField) {
			NotificationChain msgs = null;
			if (bubbleSizeField != null)
				msgs = ((InternalEObject)bubbleSizeField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.BUBBLE_CHART__BUBBLE_SIZE_FIELD, null, msgs);
			if (newBubbleSizeField != null)
				msgs = ((InternalEObject)newBubbleSizeField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.BUBBLE_CHART__BUBBLE_SIZE_FIELD, null, msgs);
			msgs = basicSetBubbleSizeField(newBubbleSizeField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.BUBBLE_CHART__BUBBLE_SIZE_FIELD, newBubbleSizeField, newBubbleSizeField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingPackage.BUBBLE_CHART__XCOORDINATE_FIELD:
				return basicSetXCoordinateField(null, msgs);
			case ReportingPackage.BUBBLE_CHART__YCOORDINATE_FIELD:
				return basicSetYCoordinateField(null, msgs);
			case ReportingPackage.BUBBLE_CHART__BUBBLE_SIZE_FIELD:
				return basicSetBubbleSizeField(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingPackage.BUBBLE_CHART__XCOORDINATE_FIELD:
				return getXCoordinateField();
			case ReportingPackage.BUBBLE_CHART__YCOORDINATE_FIELD:
				return getYCoordinateField();
			case ReportingPackage.BUBBLE_CHART__BUBBLE_SIZE_FIELD:
				return getBubbleSizeField();
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
			case ReportingPackage.BUBBLE_CHART__XCOORDINATE_FIELD:
				setXCoordinateField((DataField)newValue);
				return;
			case ReportingPackage.BUBBLE_CHART__YCOORDINATE_FIELD:
				setYCoordinateField((DataField)newValue);
				return;
			case ReportingPackage.BUBBLE_CHART__BUBBLE_SIZE_FIELD:
				setBubbleSizeField((DataField)newValue);
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
			case ReportingPackage.BUBBLE_CHART__XCOORDINATE_FIELD:
				setXCoordinateField((DataField)null);
				return;
			case ReportingPackage.BUBBLE_CHART__YCOORDINATE_FIELD:
				setYCoordinateField((DataField)null);
				return;
			case ReportingPackage.BUBBLE_CHART__BUBBLE_SIZE_FIELD:
				setBubbleSizeField((DataField)null);
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
			case ReportingPackage.BUBBLE_CHART__XCOORDINATE_FIELD:
				return xCoordinateField != null;
			case ReportingPackage.BUBBLE_CHART__YCOORDINATE_FIELD:
				return yCoordinateField != null;
			case ReportingPackage.BUBBLE_CHART__BUBBLE_SIZE_FIELD:
				return bubbleSizeField != null;
		}
		return super.eIsSet(featureID);
	}

} //BubbleChartImpl
