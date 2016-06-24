/**
 */
package reporting;

import net.bhl.cdt.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see reporting.ReportingFactory
 * @model kind="package"
 * @generated
 */
public interface ReportingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reporting";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://net.bhl/cdt/reporting";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reporting";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportingPackage eINSTANCE = reporting.impl.ReportingPackageImpl.init();

	/**
	 * The meta object id for the '{@link reporting.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.ReportImpl
	 * @see reporting.impl.ReportingPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__MAP = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Charts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__CHARTS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.ReportMapImpl <em>Report Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.ReportMapImpl
	 * @see reporting.impl.ReportingPackageImpl#getReportMap()
	 * @generated
	 */
	int REPORT_MAP = 1;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_MAP__REPORTS = 0;

	/**
	 * The number of structural features of the '<em>Report Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_MAP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Report Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reporting.ReportElement <em>Report Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.ReportElement
	 * @see reporting.impl.ReportingPackageImpl#getReportElement()
	 * @generated
	 */
	int REPORT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ELEMENT__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Report Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ELEMENT_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Report Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ELEMENT_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.Chart <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.Chart
	 * @see reporting.impl.ReportingPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__NAME = REPORT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TITLE = REPORT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Report</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__REPORT = REPORT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = REPORT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = REPORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.ChartWithAxis2DImpl <em>Chart With Axis2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.ChartWithAxis2DImpl
	 * @see reporting.impl.ReportingPackageImpl#getChartWithAxis2D()
	 * @generated
	 */
	int CHART_WITH_AXIS2_D = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXIS2_D__NAME = CHART__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXIS2_D__TITLE = CHART__TITLE;

	/**
	 * The feature id for the '<em><b>Report</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXIS2_D__REPORT = CHART__REPORT;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXIS2_D__XAXIS = CHART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXIS2_D__YAXIS = CHART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chart With Axis2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXIS2_D_FEATURE_COUNT = CHART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Chart With Axis2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXIS2_D_OPERATION_COUNT = CHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.BarChartImpl <em>Bar Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.BarChartImpl
	 * @see reporting.impl.ReportingPackageImpl#getBarChart()
	 * @generated
	 */
	int BAR_CHART = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__NAME = CHART_WITH_AXIS2_D__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__TITLE = CHART_WITH_AXIS2_D__TITLE;

	/**
	 * The feature id for the '<em><b>Report</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__REPORT = CHART_WITH_AXIS2_D__REPORT;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__XAXIS = CHART_WITH_AXIS2_D__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__YAXIS = CHART_WITH_AXIS2_D__YAXIS;

	/**
	 * The number of structural features of the '<em>Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FEATURE_COUNT = CHART_WITH_AXIS2_D_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_OPERATION_COUNT = CHART_WITH_AXIS2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.AxisImpl <em>Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.AxisImpl
	 * @see reporting.impl.ReportingPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__TITLE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__CHART = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.FontPropertiesImpl <em>Font Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.FontPropertiesImpl
	 * @see reporting.impl.ReportingPackageImpl#getFontProperties()
	 * @generated
	 */
	int FONT_PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTIES__FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTIES__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTIES__BOLD = 2;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTIES__ITALIC = 3;

	/**
	 * The feature id for the '<em><b>Text Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTIES__TEXT_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Font Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTIES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Font Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reporting.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.TextElementImpl
	 * @see reporting.impl.ReportingPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link reporting.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see reporting.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for the container reference '{@link reporting.Report#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map</em>'.
	 * @see reporting.Report#getMap()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link reporting.Report#getCharts <em>Charts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Charts</em>'.
	 * @see reporting.Report#getCharts()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_Charts();

	/**
	 * Returns the meta object for class '{@link reporting.ReportMap <em>Report Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Map</em>'.
	 * @see reporting.ReportMap
	 * @generated
	 */
	EClass getReportMap();

	/**
	 * Returns the meta object for the containment reference list '{@link reporting.ReportMap#getReports <em>Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reports</em>'.
	 * @see reporting.ReportMap#getReports()
	 * @see #getReportMap()
	 * @generated
	 */
	EReference getReportMap_Reports();

	/**
	 * Returns the meta object for class '{@link reporting.ReportElement <em>Report Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Element</em>'.
	 * @see reporting.ReportElement
	 * @generated
	 */
	EClass getReportElement();

	/**
	 * Returns the meta object for class '{@link reporting.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see reporting.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the containment reference '{@link reporting.Chart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see reporting.Chart#getTitle()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Title();

	/**
	 * Returns the meta object for the container reference '{@link reporting.Chart#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Report</em>'.
	 * @see reporting.Chart#getReport()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Report();

	/**
	 * Returns the meta object for class '{@link reporting.ChartWithAxis2D <em>Chart With Axis2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart With Axis2 D</em>'.
	 * @see reporting.ChartWithAxis2D
	 * @generated
	 */
	EClass getChartWithAxis2D();

	/**
	 * Returns the meta object for the reference '{@link reporting.ChartWithAxis2D#getXAxis <em>XAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XAxis</em>'.
	 * @see reporting.ChartWithAxis2D#getXAxis()
	 * @see #getChartWithAxis2D()
	 * @generated
	 */
	EReference getChartWithAxis2D_XAxis();

	/**
	 * Returns the meta object for the reference '{@link reporting.ChartWithAxis2D#getYAxis <em>YAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>YAxis</em>'.
	 * @see reporting.ChartWithAxis2D#getYAxis()
	 * @see #getChartWithAxis2D()
	 * @generated
	 */
	EReference getChartWithAxis2D_YAxis();

	/**
	 * Returns the meta object for class '{@link reporting.BarChart <em>Bar Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Chart</em>'.
	 * @see reporting.BarChart
	 * @generated
	 */
	EClass getBarChart();

	/**
	 * Returns the meta object for class '{@link reporting.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis</em>'.
	 * @see reporting.Axis
	 * @generated
	 */
	EClass getAxis();

	/**
	 * Returns the meta object for the containment reference '{@link reporting.Axis#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see reporting.Axis#getTitle()
	 * @see #getAxis()
	 * @generated
	 */
	EReference getAxis_Title();

	/**
	 * Returns the meta object for the reference '{@link reporting.Axis#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chart</em>'.
	 * @see reporting.Axis#getChart()
	 * @see #getAxis()
	 * @generated
	 */
	EReference getAxis_Chart();

	/**
	 * Returns the meta object for class '{@link reporting.FontProperties <em>Font Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Properties</em>'.
	 * @see reporting.FontProperties
	 * @generated
	 */
	EClass getFontProperties();

	/**
	 * Returns the meta object for the attribute '{@link reporting.FontProperties#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see reporting.FontProperties#getFamily()
	 * @see #getFontProperties()
	 * @generated
	 */
	EAttribute getFontProperties_Family();

	/**
	 * Returns the meta object for the attribute '{@link reporting.FontProperties#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see reporting.FontProperties#getSize()
	 * @see #getFontProperties()
	 * @generated
	 */
	EAttribute getFontProperties_Size();

	/**
	 * Returns the meta object for the attribute '{@link reporting.FontProperties#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see reporting.FontProperties#isBold()
	 * @see #getFontProperties()
	 * @generated
	 */
	EAttribute getFontProperties_Bold();

	/**
	 * Returns the meta object for the attribute '{@link reporting.FontProperties#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see reporting.FontProperties#isItalic()
	 * @see #getFontProperties()
	 * @generated
	 */
	EAttribute getFontProperties_Italic();

	/**
	 * Returns the meta object for the container reference '{@link reporting.FontProperties#getTextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Text Element</em>'.
	 * @see reporting.FontProperties#getTextElement()
	 * @see #getFontProperties()
	 * @generated
	 */
	EReference getFontProperties_TextElement();

	/**
	 * Returns the meta object for class '{@link reporting.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see reporting.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for the attribute '{@link reporting.TextElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see reporting.TextElement#getText()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Text();

	/**
	 * Returns the meta object for the containment reference '{@link reporting.TextElement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see reporting.TextElement#getProperties()
	 * @see #getTextElement()
	 * @generated
	 */
	EReference getTextElement_Properties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReportingFactory getReportingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link reporting.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.ReportImpl
		 * @see reporting.impl.ReportingPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT__MAP = eINSTANCE.getReport_Map();

		/**
		 * The meta object literal for the '<em><b>Charts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT__CHARTS = eINSTANCE.getReport_Charts();

		/**
		 * The meta object literal for the '{@link reporting.impl.ReportMapImpl <em>Report Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.ReportMapImpl
		 * @see reporting.impl.ReportingPackageImpl#getReportMap()
		 * @generated
		 */
		EClass REPORT_MAP = eINSTANCE.getReportMap();

		/**
		 * The meta object literal for the '<em><b>Reports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_MAP__REPORTS = eINSTANCE.getReportMap_Reports();

		/**
		 * The meta object literal for the '{@link reporting.ReportElement <em>Report Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.ReportElement
		 * @see reporting.impl.ReportingPackageImpl#getReportElement()
		 * @generated
		 */
		EClass REPORT_ELEMENT = eINSTANCE.getReportElement();

		/**
		 * The meta object literal for the '{@link reporting.Chart <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.Chart
		 * @see reporting.impl.ReportingPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__TITLE = eINSTANCE.getChart_Title();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__REPORT = eINSTANCE.getChart_Report();

		/**
		 * The meta object literal for the '{@link reporting.impl.ChartWithAxis2DImpl <em>Chart With Axis2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.ChartWithAxis2DImpl
		 * @see reporting.impl.ReportingPackageImpl#getChartWithAxis2D()
		 * @generated
		 */
		EClass CHART_WITH_AXIS2_D = eINSTANCE.getChartWithAxis2D();

		/**
		 * The meta object literal for the '<em><b>XAxis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_WITH_AXIS2_D__XAXIS = eINSTANCE.getChartWithAxis2D_XAxis();

		/**
		 * The meta object literal for the '<em><b>YAxis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_WITH_AXIS2_D__YAXIS = eINSTANCE.getChartWithAxis2D_YAxis();

		/**
		 * The meta object literal for the '{@link reporting.impl.BarChartImpl <em>Bar Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.BarChartImpl
		 * @see reporting.impl.ReportingPackageImpl#getBarChart()
		 * @generated
		 */
		EClass BAR_CHART = eINSTANCE.getBarChart();

		/**
		 * The meta object literal for the '{@link reporting.impl.AxisImpl <em>Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.AxisImpl
		 * @see reporting.impl.ReportingPackageImpl#getAxis()
		 * @generated
		 */
		EClass AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS__TITLE = eINSTANCE.getAxis_Title();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS__CHART = eINSTANCE.getAxis_Chart();

		/**
		 * The meta object literal for the '{@link reporting.impl.FontPropertiesImpl <em>Font Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.FontPropertiesImpl
		 * @see reporting.impl.ReportingPackageImpl#getFontProperties()
		 * @generated
		 */
		EClass FONT_PROPERTIES = eINSTANCE.getFontProperties();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_PROPERTIES__FAMILY = eINSTANCE.getFontProperties_Family();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_PROPERTIES__SIZE = eINSTANCE.getFontProperties_Size();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_PROPERTIES__BOLD = eINSTANCE.getFontProperties_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_PROPERTIES__ITALIC = eINSTANCE.getFontProperties_Italic();

		/**
		 * The meta object literal for the '<em><b>Text Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONT_PROPERTIES__TEXT_ELEMENT = eINSTANCE.getFontProperties_TextElement();

		/**
		 * The meta object literal for the '{@link reporting.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.TextElementImpl
		 * @see reporting.impl.ReportingPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__TEXT = eINSTANCE.getTextElement_Text();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_ELEMENT__PROPERTIES = eINSTANCE.getTextElement_Properties();

	}

} //ReportingPackage
