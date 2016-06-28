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
	 * The feature id for the '<em><b>Data Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__DATA_SOURCES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SHOW_LEGEND = REPORT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DATA_SOURCE = REPORT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = REPORT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = REPORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.Chart2DImpl <em>Chart2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.Chart2DImpl
	 * @see reporting.impl.ReportingPackageImpl#getChart2D()
	 * @generated
	 */
	int CHART2_D = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART2_D__NAME = CHART__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART2_D__TITLE = CHART__TITLE;

	/**
	 * The feature id for the '<em><b>Report</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART2_D__REPORT = CHART__REPORT;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART2_D__SHOW_LEGEND = CHART__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART2_D__DATA_SOURCE = CHART__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART2_D__XAXIS = CHART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART2_D__YAXIS = CHART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chart2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART2_D_FEATURE_COUNT = CHART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Chart2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART2_D_OPERATION_COUNT = CHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.Chart3DImpl <em>Chart3 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.Chart3DImpl
	 * @see reporting.impl.ReportingPackageImpl#getChart3D()
	 * @generated
	 */
	int CHART3_D = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART3_D__NAME = CHART__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART3_D__TITLE = CHART__TITLE;

	/**
	 * The feature id for the '<em><b>Report</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART3_D__REPORT = CHART__REPORT;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART3_D__SHOW_LEGEND = CHART__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART3_D__DATA_SOURCE = CHART__DATA_SOURCE;

	/**
	 * The number of structural features of the '<em>Chart3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART3_D_FEATURE_COUNT = CHART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chart3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART3_D_OPERATION_COUNT = CHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.BarChartImpl <em>Bar Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.BarChartImpl
	 * @see reporting.impl.ReportingPackageImpl#getBarChart()
	 * @generated
	 */
	int BAR_CHART = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__NAME = CHART2_D__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__TITLE = CHART2_D__TITLE;

	/**
	 * The feature id for the '<em><b>Report</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__REPORT = CHART2_D__REPORT;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__SHOW_LEGEND = CHART2_D__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__DATA_SOURCE = CHART2_D__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__XAXIS = CHART2_D__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__YAXIS = CHART2_D__YAXIS;

	/**
	 * The number of structural features of the '<em>Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FEATURE_COUNT = CHART2_D_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_OPERATION_COUNT = CHART2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.AxisImpl <em>Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.AxisImpl
	 * @see reporting.impl.ReportingPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__FAMILY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__SIZE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__BOLD = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__ITALIC = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__LABEL = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.DateAxisImpl <em>Date Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.DateAxisImpl
	 * @see reporting.impl.ReportingPackageImpl#getDateAxis()
	 * @generated
	 */
	int DATE_AXIS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS__NAME = AXIS__NAME;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS__FAMILY = AXIS__FAMILY;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS__SIZE = AXIS__SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS__BOLD = AXIS__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS__ITALIC = AXIS__ITALIC;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS__LABEL = AXIS__LABEL;

	/**
	 * The feature id for the '<em><b>Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS__FORMAT_STRING = AXIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS__MIN_DATE = AXIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS__MAX_DATE = AXIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Date Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS_FEATURE_COUNT = AXIS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Date Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AXIS_OPERATION_COUNT = AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.IntegerAxisImpl <em>Integer Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.IntegerAxisImpl
	 * @see reporting.impl.ReportingPackageImpl#getIntegerAxis()
	 * @generated
	 */
	int INTEGER_AXIS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AXIS__NAME = AXIS__NAME;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AXIS__FAMILY = AXIS__FAMILY;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AXIS__SIZE = AXIS__SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AXIS__BOLD = AXIS__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AXIS__ITALIC = AXIS__ITALIC;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AXIS__LABEL = AXIS__LABEL;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AXIS__MIN_VALUE = AXIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AXIS__MAX_VALUE = AXIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AXIS_FEATURE_COUNT = AXIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AXIS_OPERATION_COUNT = AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.FontPropertyElementImpl <em>Font Property Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.FontPropertyElementImpl
	 * @see reporting.impl.ReportingPackageImpl#getFontPropertyElement()
	 * @generated
	 */
	int FONT_PROPERTY_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTY_ELEMENT__FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTY_ELEMENT__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTY_ELEMENT__BOLD = 2;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTY_ELEMENT__ITALIC = 3;

	/**
	 * The number of structural features of the '<em>Font Property Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTY_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Font Property Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_PROPERTY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reporting.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.LabelImpl
	 * @see reporting.impl.ReportingPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 11;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FAMILY = FONT_PROPERTY_ELEMENT__FAMILY;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SIZE = FONT_PROPERTY_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BOLD = FONT_PROPERTY_ELEMENT__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ITALIC = FONT_PROPERTY_ELEMENT__ITALIC;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = FONT_PROPERTY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = FONT_PROPERTY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = FONT_PROPERTY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.GanttChartImpl <em>Gantt Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.GanttChartImpl
	 * @see reporting.impl.ReportingPackageImpl#getGanttChart()
	 * @generated
	 */
	int GANTT_CHART = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART__NAME = CHART2_D__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART__TITLE = CHART2_D__TITLE;

	/**
	 * The feature id for the '<em><b>Report</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART__REPORT = CHART2_D__REPORT;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART__SHOW_LEGEND = CHART2_D__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART__DATA_SOURCE = CHART2_D__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART__XAXIS = CHART2_D__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART__YAXIS = CHART2_D__YAXIS;

	/**
	 * The number of structural features of the '<em>Gantt Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_FEATURE_COUNT = CHART2_D_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gantt Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_OPERATION_COUNT = CHART2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.DataDimensionImpl <em>Data Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.DataDimensionImpl
	 * @see reporting.impl.ReportingPackageImpl#getDataDimension()
	 * @generated
	 */
	int DATA_DIMENSION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIMENSION__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIMENSION__FIELD = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIMENSION__TYPE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIMENSION__DATA_SOURCE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIMENSION_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIMENSION_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reporting.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.DataSourceImpl
	 * @see reporting.impl.ReportingPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DEFINITION = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__SOURCE_OBJECT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__CHART = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link reporting.impl.DataSourceDefinitionImpl <em>Data Source Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.DataSourceDefinitionImpl
	 * @see reporting.impl.ReportingPackageImpl#getDataSourceDefinition()
	 * @generated
	 */
	int DATA_SOURCE_DEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEFINITION__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEFINITION__SOURCE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEFINITION__MEMBER = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Source Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEFINITION_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Source Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEFINITION_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link reporting.impl.GanttChartDataSourceImpl <em>Gantt Chart Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.GanttChartDataSourceImpl
	 * @see reporting.impl.ReportingPackageImpl#getGanttChartDataSource()
	 * @generated
	 */
	int GANTT_CHART_DATA_SOURCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_DATA_SOURCE__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_DATA_SOURCE__DEFINITION = DATA_SOURCE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_DATA_SOURCE__SOURCE_OBJECT = DATA_SOURCE__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_DATA_SOURCE__CHART = DATA_SOURCE__CHART;

	/**
	 * The feature id for the '<em><b>Project Phase Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Name Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Date Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_DATA_SOURCE__START_DATE_FIELD = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Date Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_DATA_SOURCE__END_DATE_FIELD = DATA_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gantt Chart Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_DATA_SOURCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Gantt Chart Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANTT_CHART_DATA_SOURCE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link reporting.Report#getDataSources <em>Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Sources</em>'.
	 * @see reporting.Report#getDataSources()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_DataSources();

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
	 * Returns the meta object for the attribute '{@link reporting.Chart#isShowLegend <em>Show Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Legend</em>'.
	 * @see reporting.Chart#isShowLegend()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_ShowLegend();

	/**
	 * Returns the meta object for the containment reference '{@link reporting.Chart#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Source</em>'.
	 * @see reporting.Chart#getDataSource()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_DataSource();

	/**
	 * Returns the meta object for class '{@link reporting.Chart2D <em>Chart2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart2 D</em>'.
	 * @see reporting.Chart2D
	 * @generated
	 */
	EClass getChart2D();

	/**
	 * Returns the meta object for the containment reference '{@link reporting.Chart2D#getXAxis <em>XAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XAxis</em>'.
	 * @see reporting.Chart2D#getXAxis()
	 * @see #getChart2D()
	 * @generated
	 */
	EReference getChart2D_XAxis();

	/**
	 * Returns the meta object for the containment reference '{@link reporting.Chart2D#getYAxis <em>YAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>YAxis</em>'.
	 * @see reporting.Chart2D#getYAxis()
	 * @see #getChart2D()
	 * @generated
	 */
	EReference getChart2D_YAxis();

	/**
	 * Returns the meta object for class '{@link reporting.Chart3D <em>Chart3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart3 D</em>'.
	 * @see reporting.Chart3D
	 * @generated
	 */
	EClass getChart3D();

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
	 * Returns the meta object for the containment reference '{@link reporting.Axis#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see reporting.Axis#getLabel()
	 * @see #getAxis()
	 * @generated
	 */
	EReference getAxis_Label();

	/**
	 * Returns the meta object for class '{@link reporting.DateAxis <em>Date Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Axis</em>'.
	 * @see reporting.DateAxis
	 * @generated
	 */
	EClass getDateAxis();

	/**
	 * Returns the meta object for the attribute '{@link reporting.DateAxis#getFormatString <em>Format String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format String</em>'.
	 * @see reporting.DateAxis#getFormatString()
	 * @see #getDateAxis()
	 * @generated
	 */
	EAttribute getDateAxis_FormatString();

	/**
	 * Returns the meta object for the attribute '{@link reporting.DateAxis#getMinDate <em>Min Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Date</em>'.
	 * @see reporting.DateAxis#getMinDate()
	 * @see #getDateAxis()
	 * @generated
	 */
	EAttribute getDateAxis_MinDate();

	/**
	 * Returns the meta object for the attribute '{@link reporting.DateAxis#getMaxDate <em>Max Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Date</em>'.
	 * @see reporting.DateAxis#getMaxDate()
	 * @see #getDateAxis()
	 * @generated
	 */
	EAttribute getDateAxis_MaxDate();

	/**
	 * Returns the meta object for class '{@link reporting.IntegerAxis <em>Integer Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Axis</em>'.
	 * @see reporting.IntegerAxis
	 * @generated
	 */
	EClass getIntegerAxis();

	/**
	 * Returns the meta object for the attribute '{@link reporting.IntegerAxis#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see reporting.IntegerAxis#getMinValue()
	 * @see #getIntegerAxis()
	 * @generated
	 */
	EAttribute getIntegerAxis_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link reporting.IntegerAxis#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see reporting.IntegerAxis#getMaxValue()
	 * @see #getIntegerAxis()
	 * @generated
	 */
	EAttribute getIntegerAxis_MaxValue();

	/**
	 * Returns the meta object for class '{@link reporting.FontPropertyElement <em>Font Property Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Property Element</em>'.
	 * @see reporting.FontPropertyElement
	 * @generated
	 */
	EClass getFontPropertyElement();

	/**
	 * Returns the meta object for the attribute '{@link reporting.FontPropertyElement#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see reporting.FontPropertyElement#getFamily()
	 * @see #getFontPropertyElement()
	 * @generated
	 */
	EAttribute getFontPropertyElement_Family();

	/**
	 * Returns the meta object for the attribute '{@link reporting.FontPropertyElement#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see reporting.FontPropertyElement#getSize()
	 * @see #getFontPropertyElement()
	 * @generated
	 */
	EAttribute getFontPropertyElement_Size();

	/**
	 * Returns the meta object for the attribute '{@link reporting.FontPropertyElement#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see reporting.FontPropertyElement#isBold()
	 * @see #getFontPropertyElement()
	 * @generated
	 */
	EAttribute getFontPropertyElement_Bold();

	/**
	 * Returns the meta object for the attribute '{@link reporting.FontPropertyElement#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see reporting.FontPropertyElement#isItalic()
	 * @see #getFontPropertyElement()
	 * @generated
	 */
	EAttribute getFontPropertyElement_Italic();

	/**
	 * Returns the meta object for class '{@link reporting.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see reporting.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link reporting.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see reporting.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for class '{@link reporting.GanttChart <em>Gantt Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gantt Chart</em>'.
	 * @see reporting.GanttChart
	 * @generated
	 */
	EClass getGanttChart();

	/**
	 * Returns the meta object for class '{@link reporting.DataDimension <em>Data Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Dimension</em>'.
	 * @see reporting.DataDimension
	 * @generated
	 */
	EClass getDataDimension();

	/**
	 * Returns the meta object for the reference '{@link reporting.DataDimension#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see reporting.DataDimension#getField()
	 * @see #getDataDimension()
	 * @generated
	 */
	EReference getDataDimension_Field();

	/**
	 * Returns the meta object for the attribute '{@link reporting.DataDimension#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see reporting.DataDimension#getType()
	 * @see #getDataDimension()
	 * @generated
	 */
	EAttribute getDataDimension_Type();

	/**
	 * Returns the meta object for the reference '{@link reporting.DataDimension#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see reporting.DataDimension#getDataSource()
	 * @see #getDataDimension()
	 * @generated
	 */
	EReference getDataDimension_DataSource();

	/**
	 * Returns the meta object for class '{@link reporting.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see reporting.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the reference '{@link reporting.DataSource#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see reporting.DataSource#getDefinition()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Definition();

	/**
	 * Returns the meta object for the reference '{@link reporting.DataSource#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Object</em>'.
	 * @see reporting.DataSource#getSourceObject()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_SourceObject();

	/**
	 * Returns the meta object for the container reference '{@link reporting.DataSource#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Chart</em>'.
	 * @see reporting.DataSource#getChart()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Chart();

	/**
	 * Returns the meta object for class '{@link reporting.DataSourceDefinition <em>Data Source Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Definition</em>'.
	 * @see reporting.DataSourceDefinition
	 * @generated
	 */
	EClass getDataSourceDefinition();

	/**
	 * Returns the meta object for the reference '{@link reporting.DataSourceDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see reporting.DataSourceDefinition#getSource()
	 * @see #getDataSourceDefinition()
	 * @generated
	 */
	EReference getDataSourceDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link reporting.DataSourceDefinition#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see reporting.DataSourceDefinition#getMember()
	 * @see #getDataSourceDefinition()
	 * @generated
	 */
	EReference getDataSourceDefinition_Member();

	/**
	 * Returns the meta object for class '{@link reporting.GanttChartDataSource <em>Gantt Chart Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gantt Chart Data Source</em>'.
	 * @see reporting.GanttChartDataSource
	 * @generated
	 */
	EClass getGanttChartDataSource();

	/**
	 * Returns the meta object for the containment reference '{@link reporting.GanttChartDataSource#getProjectPhaseField <em>Project Phase Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project Phase Field</em>'.
	 * @see reporting.GanttChartDataSource#getProjectPhaseField()
	 * @see #getGanttChartDataSource()
	 * @generated
	 */
	EReference getGanttChartDataSource_ProjectPhaseField();

	/**
	 * Returns the meta object for the containment reference '{@link reporting.GanttChartDataSource#getTaskNameField <em>Task Name Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Name Field</em>'.
	 * @see reporting.GanttChartDataSource#getTaskNameField()
	 * @see #getGanttChartDataSource()
	 * @generated
	 */
	EReference getGanttChartDataSource_TaskNameField();

	/**
	 * Returns the meta object for the containment reference '{@link reporting.GanttChartDataSource#getStartDateField <em>Start Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Date Field</em>'.
	 * @see reporting.GanttChartDataSource#getStartDateField()
	 * @see #getGanttChartDataSource()
	 * @generated
	 */
	EReference getGanttChartDataSource_StartDateField();

	/**
	 * Returns the meta object for the containment reference '{@link reporting.GanttChartDataSource#getEndDateField <em>End Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Date Field</em>'.
	 * @see reporting.GanttChartDataSource#getEndDateField()
	 * @see #getGanttChartDataSource()
	 * @generated
	 */
	EReference getGanttChartDataSource_EndDateField();

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
		 * The meta object literal for the '<em><b>Data Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT__DATA_SOURCES = eINSTANCE.getReport_DataSources();

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
		 * The meta object literal for the '<em><b>Show Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__SHOW_LEGEND = eINSTANCE.getChart_ShowLegend();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__DATA_SOURCE = eINSTANCE.getChart_DataSource();

		/**
		 * The meta object literal for the '{@link reporting.impl.Chart2DImpl <em>Chart2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.Chart2DImpl
		 * @see reporting.impl.ReportingPackageImpl#getChart2D()
		 * @generated
		 */
		EClass CHART2_D = eINSTANCE.getChart2D();

		/**
		 * The meta object literal for the '<em><b>XAxis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART2_D__XAXIS = eINSTANCE.getChart2D_XAxis();

		/**
		 * The meta object literal for the '<em><b>YAxis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART2_D__YAXIS = eINSTANCE.getChart2D_YAxis();

		/**
		 * The meta object literal for the '{@link reporting.impl.Chart3DImpl <em>Chart3 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.Chart3DImpl
		 * @see reporting.impl.ReportingPackageImpl#getChart3D()
		 * @generated
		 */
		EClass CHART3_D = eINSTANCE.getChart3D();

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
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS__LABEL = eINSTANCE.getAxis_Label();

		/**
		 * The meta object literal for the '{@link reporting.impl.DateAxisImpl <em>Date Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.DateAxisImpl
		 * @see reporting.impl.ReportingPackageImpl#getDateAxis()
		 * @generated
		 */
		EClass DATE_AXIS = eINSTANCE.getDateAxis();

		/**
		 * The meta object literal for the '<em><b>Format String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_AXIS__FORMAT_STRING = eINSTANCE.getDateAxis_FormatString();

		/**
		 * The meta object literal for the '<em><b>Min Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_AXIS__MIN_DATE = eINSTANCE.getDateAxis_MinDate();

		/**
		 * The meta object literal for the '<em><b>Max Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_AXIS__MAX_DATE = eINSTANCE.getDateAxis_MaxDate();

		/**
		 * The meta object literal for the '{@link reporting.impl.IntegerAxisImpl <em>Integer Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.IntegerAxisImpl
		 * @see reporting.impl.ReportingPackageImpl#getIntegerAxis()
		 * @generated
		 */
		EClass INTEGER_AXIS = eINSTANCE.getIntegerAxis();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_AXIS__MIN_VALUE = eINSTANCE.getIntegerAxis_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_AXIS__MAX_VALUE = eINSTANCE.getIntegerAxis_MaxValue();

		/**
		 * The meta object literal for the '{@link reporting.impl.FontPropertyElementImpl <em>Font Property Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.FontPropertyElementImpl
		 * @see reporting.impl.ReportingPackageImpl#getFontPropertyElement()
		 * @generated
		 */
		EClass FONT_PROPERTY_ELEMENT = eINSTANCE.getFontPropertyElement();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_PROPERTY_ELEMENT__FAMILY = eINSTANCE.getFontPropertyElement_Family();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_PROPERTY_ELEMENT__SIZE = eINSTANCE.getFontPropertyElement_Size();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_PROPERTY_ELEMENT__BOLD = eINSTANCE.getFontPropertyElement_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_PROPERTY_ELEMENT__ITALIC = eINSTANCE.getFontPropertyElement_Italic();

		/**
		 * The meta object literal for the '{@link reporting.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.LabelImpl
		 * @see reporting.impl.ReportingPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '{@link reporting.impl.GanttChartImpl <em>Gantt Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.GanttChartImpl
		 * @see reporting.impl.ReportingPackageImpl#getGanttChart()
		 * @generated
		 */
		EClass GANTT_CHART = eINSTANCE.getGanttChart();

		/**
		 * The meta object literal for the '{@link reporting.impl.DataDimensionImpl <em>Data Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.DataDimensionImpl
		 * @see reporting.impl.ReportingPackageImpl#getDataDimension()
		 * @generated
		 */
		EClass DATA_DIMENSION = eINSTANCE.getDataDimension();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DIMENSION__FIELD = eINSTANCE.getDataDimension_Field();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DIMENSION__TYPE = eINSTANCE.getDataDimension_Type();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DIMENSION__DATA_SOURCE = eINSTANCE.getDataDimension_DataSource();

		/**
		 * The meta object literal for the '{@link reporting.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.DataSourceImpl
		 * @see reporting.impl.ReportingPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__DEFINITION = eINSTANCE.getDataSource_Definition();

		/**
		 * The meta object literal for the '<em><b>Source Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__SOURCE_OBJECT = eINSTANCE.getDataSource_SourceObject();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__CHART = eINSTANCE.getDataSource_Chart();

		/**
		 * The meta object literal for the '{@link reporting.impl.DataSourceDefinitionImpl <em>Data Source Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.DataSourceDefinitionImpl
		 * @see reporting.impl.ReportingPackageImpl#getDataSourceDefinition()
		 * @generated
		 */
		EClass DATA_SOURCE_DEFINITION = eINSTANCE.getDataSourceDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE_DEFINITION__SOURCE = eINSTANCE.getDataSourceDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE_DEFINITION__MEMBER = eINSTANCE.getDataSourceDefinition_Member();

		/**
		 * The meta object literal for the '{@link reporting.impl.GanttChartDataSourceImpl <em>Gantt Chart Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.GanttChartDataSourceImpl
		 * @see reporting.impl.ReportingPackageImpl#getGanttChartDataSource()
		 * @generated
		 */
		EClass GANTT_CHART_DATA_SOURCE = eINSTANCE.getGanttChartDataSource();

		/**
		 * The meta object literal for the '<em><b>Project Phase Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD = eINSTANCE.getGanttChartDataSource_ProjectPhaseField();

		/**
		 * The meta object literal for the '<em><b>Task Name Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD = eINSTANCE.getGanttChartDataSource_TaskNameField();

		/**
		 * The meta object literal for the '<em><b>Start Date Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GANTT_CHART_DATA_SOURCE__START_DATE_FIELD = eINSTANCE.getGanttChartDataSource_StartDateField();

		/**
		 * The meta object literal for the '<em><b>End Date Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GANTT_CHART_DATA_SOURCE__END_DATE_FIELD = eINSTANCE.getGanttChartDataSource_EndDateField();

	}

} //ReportingPackage
