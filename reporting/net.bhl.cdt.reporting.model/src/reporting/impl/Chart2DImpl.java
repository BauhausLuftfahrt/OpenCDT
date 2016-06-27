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
import reporting.Chart2D;
import reporting.Label;
import reporting.Report;
import reporting.ReportingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reporting.impl.Chart2DImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link reporting.impl.Chart2DImpl#getReport <em>Report</em>}</li>
 *   <li>{@link reporting.impl.Chart2DImpl#isShowLegend <em>Show Legend</em>}</li>
 *   <li>{@link reporting.impl.Chart2DImpl#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link reporting.impl.Chart2DImpl#getYAxis <em>YAxis</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Chart2DImpl extends NamedElementImpl implements Chart2D {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Label title;

	/**
	 * The default value of the '{@link #isShowLegend() <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLegend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_LEGEND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowLegend() <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLegend()
	 * @generated
	 * @ordered
	 */
	protected boolean showLegend = SHOW_LEGEND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXAxis() <em>XAxis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxis()
	 * @generated
	 * @ordered
	 */
	protected Axis xAxis;

	/**
	 * The cached value of the '{@link #getYAxis() <em>YAxis</em>}' containment reference.
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
	protected Chart2DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingPackage.Literals.CHART2_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(Label newTitle, NotificationChain msgs) {
		Label oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART2_D__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Label newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.CHART2_D__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.CHART2_D__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART2_D__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report getReport() {
		if (eContainerFeatureID() != ReportingPackage.CHART2_D__REPORT) return null;
		return (Report)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReport(Report newReport, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReport, ReportingPackage.CHART2_D__REPORT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReport(Report newReport) {
		if (newReport != eInternalContainer() || (eContainerFeatureID() != ReportingPackage.CHART2_D__REPORT && newReport != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART2_D__REPORT, newReport, newReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowLegend() {
		return showLegend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowLegend(boolean newShowLegend) {
		boolean oldShowLegend = showLegend;
		showLegend = newShowLegend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART2_D__SHOW_LEGEND, oldShowLegend, showLegend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getXAxis() {
		return xAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAxis(Axis newXAxis, NotificationChain msgs) {
		Axis oldXAxis = xAxis;
		xAxis = newXAxis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART2_D__XAXIS, oldXAxis, newXAxis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxis(Axis newXAxis) {
		if (newXAxis != xAxis) {
			NotificationChain msgs = null;
			if (xAxis != null)
				msgs = ((InternalEObject)xAxis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.CHART2_D__XAXIS, null, msgs);
			if (newXAxis != null)
				msgs = ((InternalEObject)newXAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.CHART2_D__XAXIS, null, msgs);
			msgs = basicSetXAxis(newXAxis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART2_D__XAXIS, newXAxis, newXAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getYAxis() {
		return yAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYAxis(Axis newYAxis, NotificationChain msgs) {
		Axis oldYAxis = yAxis;
		yAxis = newYAxis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART2_D__YAXIS, oldYAxis, newYAxis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAxis(Axis newYAxis) {
		if (newYAxis != yAxis) {
			NotificationChain msgs = null;
			if (yAxis != null)
				msgs = ((InternalEObject)yAxis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.CHART2_D__YAXIS, null, msgs);
			if (newYAxis != null)
				msgs = ((InternalEObject)newYAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingPackage.CHART2_D__YAXIS, null, msgs);
			msgs = basicSetYAxis(newYAxis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.CHART2_D__YAXIS, newYAxis, newYAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingPackage.CHART2_D__REPORT:
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
			case ReportingPackage.CHART2_D__TITLE:
				return basicSetTitle(null, msgs);
			case ReportingPackage.CHART2_D__REPORT:
				return basicSetReport(null, msgs);
			case ReportingPackage.CHART2_D__XAXIS:
				return basicSetXAxis(null, msgs);
			case ReportingPackage.CHART2_D__YAXIS:
				return basicSetYAxis(null, msgs);
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
			case ReportingPackage.CHART2_D__REPORT:
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
			case ReportingPackage.CHART2_D__TITLE:
				return getTitle();
			case ReportingPackage.CHART2_D__REPORT:
				return getReport();
			case ReportingPackage.CHART2_D__SHOW_LEGEND:
				return isShowLegend();
			case ReportingPackage.CHART2_D__XAXIS:
				return getXAxis();
			case ReportingPackage.CHART2_D__YAXIS:
				return getYAxis();
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
			case ReportingPackage.CHART2_D__TITLE:
				setTitle((Label)newValue);
				return;
			case ReportingPackage.CHART2_D__REPORT:
				setReport((Report)newValue);
				return;
			case ReportingPackage.CHART2_D__SHOW_LEGEND:
				setShowLegend((Boolean)newValue);
				return;
			case ReportingPackage.CHART2_D__XAXIS:
				setXAxis((Axis)newValue);
				return;
			case ReportingPackage.CHART2_D__YAXIS:
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
			case ReportingPackage.CHART2_D__TITLE:
				setTitle((Label)null);
				return;
			case ReportingPackage.CHART2_D__REPORT:
				setReport((Report)null);
				return;
			case ReportingPackage.CHART2_D__SHOW_LEGEND:
				setShowLegend(SHOW_LEGEND_EDEFAULT);
				return;
			case ReportingPackage.CHART2_D__XAXIS:
				setXAxis((Axis)null);
				return;
			case ReportingPackage.CHART2_D__YAXIS:
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
			case ReportingPackage.CHART2_D__TITLE:
				return title != null;
			case ReportingPackage.CHART2_D__REPORT:
				return getReport() != null;
			case ReportingPackage.CHART2_D__SHOW_LEGEND:
				return showLegend != SHOW_LEGEND_EDEFAULT;
			case ReportingPackage.CHART2_D__XAXIS:
				return xAxis != null;
			case ReportingPackage.CHART2_D__YAXIS:
				return yAxis != null;
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
		result.append(" (ShowLegend: ");
		result.append(showLegend);
		result.append(')');
		return result.toString();
	}

} //Chart2DImpl
