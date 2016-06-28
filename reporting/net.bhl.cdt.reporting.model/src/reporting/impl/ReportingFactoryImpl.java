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
			case ReportingPackage.CHART3_D: return createChart3D();
			case ReportingPackage.BAR_CHART: return createBarChart();
			case ReportingPackage.AXIS: return createAxis();
			case ReportingPackage.DATE_AXIS: return createDateAxis();
			case ReportingPackage.INTEGER_AXIS: return createIntegerAxis();
			case ReportingPackage.FONT_PROPERTY_ELEMENT: return createFontPropertyElement();
			case ReportingPackage.LABEL: return createLabel();
			case ReportingPackage.GANTT_CHART: return createGanttChart();
			case ReportingPackage.DATA_DIMENSION: return createDataDimension();
			case ReportingPackage.DATA_SOURCE: return createDataSource();
			case ReportingPackage.DATA_SOURCE_DEFINITION: return createDataSourceDefinition();
			case ReportingPackage.GANTT_CHART_DATA_SOURCE: return createGanttChartDataSource();
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
	public Chart3D createChart3D() {
		Chart3DImpl chart3D = new Chart3DImpl();
		return chart3D;
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
	public DateAxis createDateAxis() {
		DateAxisImpl dateAxis = new DateAxisImpl();
		return dateAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerAxis createIntegerAxis() {
		IntegerAxisImpl integerAxis = new IntegerAxisImpl();
		return integerAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontPropertyElement createFontPropertyElement() {
		FontPropertyElementImpl fontPropertyElement = new FontPropertyElementImpl();
		return fontPropertyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GanttChart createGanttChart() {
		GanttChartImpl ganttChart = new GanttChartImpl();
		return ganttChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDimension createDataDimension() {
		DataDimensionImpl dataDimension = new DataDimensionImpl();
		return dataDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource createDataSource() {
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceDefinition createDataSourceDefinition() {
		DataSourceDefinitionImpl dataSourceDefinition = new DataSourceDefinitionImpl();
		return dataSourceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GanttChartDataSource createGanttChartDataSource() {
		GanttChartDataSourceImpl ganttChartDataSource = new GanttChartDataSourceImpl();
		return ganttChartDataSource;
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
