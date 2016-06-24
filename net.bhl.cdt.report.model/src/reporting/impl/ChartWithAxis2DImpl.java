/**
 */
package reporting.impl;

import net.bhl.cdt.model.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import reporting.Axis;
import reporting.ChartWithAxis2D;
import reporting.Report;
import reporting.ReportingPackage;
import reporting.TextElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart With Axis2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reporting.impl.ChartWithAxis2DImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link reporting.impl.ChartWithAxis2DImpl#getReport <em>Report</em>}</li>
 *   <li>{@link reporting.impl.ChartWithAxis2DImpl#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link reporting.impl.ChartWithAxis2DImpl#getYAxis <em>YAxis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChartWithAxis2DImpl extends NamedElementImpl implements ChartWithAxis2D {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TextElement title;

	/**
	 * The cached value of the '{@link #getXAxis() <em>XAxis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxis()
	 * @generated
	 * @ordered
	 */
	protected Axis xAxis;

	/**
	 * The cached value of the '{@link #getYAxis() <em>YAxis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxis()
	 * @generated
	 * @ordered
	 */
	protected Axis yAxis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartWithAxis2DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingPackage.Literals.CHART_WITH_AXIS2_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextElement getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TextElement newTitle, NotificationChain msgs) {
		TextElement oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART_WITH_AXIS2_D__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TextElement newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.CHART_WITH_AXIS2_D__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.CHART_WITH_AXIS2_D__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART_WITH_AXIS2_D__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report getReport() {
		if (eContainerFeatureID() != ReportingPackage.CHART_WITH_AXIS2_D__REPORT) return null;
		return (Report)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReport(Report newReport, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReport, ReportingPackage.CHART_WITH_AXIS2_D__REPORT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReport(Report newReport) {
		if (newReport != eInternalContainer() || (eContainerFeatureID() != ReportingPackage.CHART_WITH_AXIS2_D__REPORT && newReport != null)) {
			if (EcoreUtil.isAncestor(this, newReport))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReport != null)
				msgs = ((InternalEObject)newReport).eInverseAdd(this, ReportingPackage.REPORT__CHARTS, Report.class, msgs);
			msgs = basicSetReport(newReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART_WITH_AXIS2_D__REPORT, newReport, newReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getXAxis() {
		if (xAxis != null && xAxis.eIsProxy()) {
			InternalEObject oldXAxis = (InternalEObject)xAxis;
			xAxis = (Axis)eResolveProxy(oldXAxis);
			if (xAxis != oldXAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingPackage.CHART_WITH_AXIS2_D__XAXIS, oldXAxis, xAxis));
			}
		}
		return xAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis basicGetXAxis() {
		return xAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxis(Axis newXAxis) {
		Axis oldXAxis = xAxis;
		xAxis = newXAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART_WITH_AXIS2_D__XAXIS, oldXAxis, xAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getYAxis() {
		if (yAxis != null && yAxis.eIsProxy()) {
			InternalEObject oldYAxis = (InternalEObject)yAxis;
			yAxis = (Axis)eResolveProxy(oldYAxis);
			if (yAxis != oldYAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingPackage.CHART_WITH_AXIS2_D__YAXIS, oldYAxis, yAxis));
			}
		}
		return yAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis basicGetYAxis() {
		return yAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAxis(Axis newYAxis) {
		Axis oldYAxis = yAxis;
		yAxis = newYAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART_WITH_AXIS2_D__YAXIS, oldYAxis, yAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingPackage.CHART_WITH_AXIS2_D__REPORT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReport((Report)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingPackage.CHART_WITH_AXIS2_D__TITLE:
				return basicSetTitle(null, msgs);
			case ReportingPackage.CHART_WITH_AXIS2_D__REPORT:
				return basicSetReport(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ReportingPackage.CHART_WITH_AXIS2_D__REPORT:
				return eInternalContainer().eInverseRemove(this, ReportingPackage.REPORT__CHARTS, Report.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingPackage.CHART_WITH_AXIS2_D__TITLE:
				return getTitle();
			case ReportingPackage.CHART_WITH_AXIS2_D__REPORT:
				return getReport();
			case ReportingPackage.CHART_WITH_AXIS2_D__XAXIS:
				if (resolve) return getXAxis();
				return basicGetXAxis();
			case ReportingPackage.CHART_WITH_AXIS2_D__YAXIS:
				if (resolve) return getYAxis();
				return basicGetYAxis();
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
			case ReportingPackage.CHART_WITH_AXIS2_D__TITLE:
				setTitle((TextElement)newValue);
				return;
			case ReportingPackage.CHART_WITH_AXIS2_D__REPORT:
				setReport((Report)newValue);
				return;
			case ReportingPackage.CHART_WITH_AXIS2_D__XAXIS:
				setXAxis((Axis)newValue);
				return;
			case ReportingPackage.CHART_WITH_AXIS2_D__YAXIS:
				setYAxis((Axis)newValue);
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
			case ReportingPackage.CHART_WITH_AXIS2_D__TITLE:
				setTitle((TextElement)null);
				return;
			case ReportingPackage.CHART_WITH_AXIS2_D__REPORT:
				setReport((Report)null);
				return;
			case ReportingPackage.CHART_WITH_AXIS2_D__XAXIS:
				setXAxis((Axis)null);
				return;
			case ReportingPackage.CHART_WITH_AXIS2_D__YAXIS:
				setYAxis((Axis)null);
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
			case ReportingPackage.CHART_WITH_AXIS2_D__TITLE:
				return title != null;
			case ReportingPackage.CHART_WITH_AXIS2_D__REPORT:
				return getReport() != null;
			case ReportingPackage.CHART_WITH_AXIS2_D__XAXIS:
				return xAxis != null;
			case ReportingPackage.CHART_WITH_AXIS2_D__YAXIS:
				return yAxis != null;
		}
		return super.eIsSet(featureID);
	}

} //ChartWithAxis2DImpl
