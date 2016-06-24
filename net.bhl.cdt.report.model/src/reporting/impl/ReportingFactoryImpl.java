/**
 */
package reporting.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import reporting.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportingFactoryImpl extends EFactoryImpl implements ReportingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReportingFactory init() {
		try {
			ReportingFactory theReportingFactory = (ReportingFactory)EPackage.Registry.INSTANCE.getEFactory(ReportingPackage.eNS_URI);
			if (theReportingFactory != null) {
				return theReportingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReportingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingFactoryImpl() {
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
			case ReportingPackage.REPORT: return createReport();
			case ReportingPackage.REPORT_MAP: return createReportMap();
			case ReportingPackage.CHART_WITH_AXIS2_D: return createChartWithAxis2D();
			case ReportingPackage.BAR_CHART: return createBarChart();
			case ReportingPackage.AXIS: return createAxis();
			case ReportingPackage.FONT_PROPERTIES: return createFontProperties();
			case ReportingPackage.TEXT_ELEMENT: return createTextElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report createReport() {
		ReportImpl report = new ReportImpl();
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportMap createReportMap() {
		ReportMapImpl reportMap = new ReportMapImpl();
		return reportMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartWithAxis2D createChartWithAxis2D() {
		ChartWithAxis2DImpl chartWithAxis2D = new ChartWithAxis2DImpl();
		return chartWithAxis2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarChart createBarChart() {
		BarChartImpl barChart = new BarChartImpl();
		return barChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis createAxis() {
		AxisImpl axis = new AxisImpl();
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontProperties createFontProperties() {
		FontPropertiesImpl fontProperties = new FontPropertiesImpl();
		return fontProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextElement createTextElement() {
		TextElementImpl textElement = new TextElementImpl();
		return textElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingPackage getReportingPackage() {
		return (ReportingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReportingPackage getPackage() {
		return ReportingPackage.eINSTANCE;
	}

} //ReportingFactoryImpl
