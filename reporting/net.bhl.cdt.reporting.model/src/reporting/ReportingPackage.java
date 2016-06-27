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
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SHOW_LEGEND = REPORT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = REPORT_ELEMENT_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link reporting.impl.FontPropertyElementImpl <em>Font Property Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.FontPropertyElementImpl
	 * @see reporting.impl.ReportingPackageImpl#getFontPropertyElement()
	 * @generated
	 */
	int FONT_PROPERTY_ELEMENT = 8;

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
	int LABEL = 9;

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
	int GANTT_CHART = 10;

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
	int DATA_DIMENSION = 11;

	/**
	 * The number of structural features of the '<em>Data Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIMENSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reporting.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reporting.impl.DataSourceImpl
	 * @see reporting.impl.ReportingPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__SOURCE_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__MEMBER = 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DIMENSIONS = 2;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for class '{@link reporting.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see reporting.DataSource
	 * @generated
	 */
	EClass getDataSource();

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
	 * Returns the meta object for the reference '{@link reporting.DataSource#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see reporting.DataSource#getMember()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Member();

	/**
	 * Returns the meta object for the reference list '{@link reporting.DataSource#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimensions</em>'.
	 * @see reporting.DataSource#getDimensions()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Dimensions();

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
		 * The meta object literal for the '<em><b>Show Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__SHOW_LEGEND = eINSTANCE.getChart_ShowLegend();

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
		 * The meta object literal for the '{@link reporting.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reporting.impl.DataSourceImpl
		 * @see reporting.impl.ReportingPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Source Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__SOURCE_OBJECT = eINSTANCE.getDataSource_SourceObject();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__MEMBER = eINSTANCE.getDataSource_Member();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__DIMENSIONS = eINSTANCE.getDataSource_Dimensions();

	}

} //ReportingPackage
