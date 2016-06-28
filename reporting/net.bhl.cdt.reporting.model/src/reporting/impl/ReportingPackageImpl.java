/**
 */
package reporting.impl;

import net.bhl.cdt.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import reporting.Axis;
import reporting.BarChart;
import reporting.Chart;
import reporting.Chart2D;
import reporting.Chart3D;
import reporting.DataDimension;
import reporting.DataSource;
import reporting.DataSourceDefinition;
import reporting.DateAxis;
import reporting.FontPropertyElement;
import reporting.GanttChart;
import reporting.GanttChartDataSource;
import reporting.IntegerAxis;
import reporting.Label;
import reporting.Report;
import reporting.ReportElement;
import reporting.ReportMap;
import reporting.ReportingFactory;
import reporting.ReportingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportingPackageImpl extends EPackageImpl implements ReportingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chart2DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chart3DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontPropertyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ganttChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ganttChartDataSourceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see reporting.ReportingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReportingPackageImpl() {
		super(eNS_URI, ReportingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ReportingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReportingPackage init() {
		if (isInited) return (ReportingPackage)EPackage.Registry.INSTANCE.getEPackage(ReportingPackage.eNS_URI);

		// Obtain or create and register package
		ReportingPackageImpl theReportingPackage = (ReportingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReportingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReportingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReportingPackage.createPackageContents();

		// Initialize created meta-data
		theReportingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReportingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReportingPackage.eNS_URI, theReportingPackage);
		return theReportingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReport() {
		return reportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReport_Map() {
		return (EReference)reportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReport_Charts() {
		return (EReference)reportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReport_DataSources() {
		return (EReference)reportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportMap() {
		return reportMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportMap_Reports() {
		return (EReference)reportMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportElement() {
		return reportElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChart() {
		return chartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChart_Title() {
		return (EReference)chartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChart_Report() {
		return (EReference)chartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChart_ShowLegend() {
		return (EAttribute)chartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChart_DataSource() {
		return (EReference)chartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChart2D() {
		return chart2DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChart2D_XAxis() {
		return (EReference)chart2DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChart2D_YAxis() {
		return (EReference)chart2DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChart3D() {
		return chart3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBarChart() {
		return barChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxis() {
		return axisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxis_Label() {
		return (EReference)axisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateAxis() {
		return dateAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateAxis_FormatString() {
		return (EAttribute)dateAxisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateAxis_MinDate() {
		return (EAttribute)dateAxisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateAxis_MaxDate() {
		return (EAttribute)dateAxisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerAxis() {
		return integerAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerAxis_MinValue() {
		return (EAttribute)integerAxisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerAxis_MaxValue() {
		return (EAttribute)integerAxisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontPropertyElement() {
		return fontPropertyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontPropertyElement_Family() {
		return (EAttribute)fontPropertyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontPropertyElement_Size() {
		return (EAttribute)fontPropertyElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontPropertyElement_Bold() {
		return (EAttribute)fontPropertyElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontPropertyElement_Italic() {
		return (EAttribute)fontPropertyElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Text() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGanttChart() {
		return ganttChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDimension() {
		return dataDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDimension_Field() {
		return (EReference)dataDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDimension_Type() {
		return (EAttribute)dataDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDimension_DataSource() {
		return (EReference)dataDimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_Definition() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_SourceObject() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_Chart() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceDefinition() {
		return dataSourceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceDefinition_Source() {
		return (EReference)dataSourceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceDefinition_Member() {
		return (EReference)dataSourceDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGanttChartDataSource() {
		return ganttChartDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGanttChartDataSource_ProjectPhaseField() {
		return (EReference)ganttChartDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGanttChartDataSource_TaskNameField() {
		return (EReference)ganttChartDataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGanttChartDataSource_StartDateField() {
		return (EReference)ganttChartDataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGanttChartDataSource_EndDateField() {
		return (EReference)ganttChartDataSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingFactory getReportingFactory() {
		return (ReportingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		reportEClass = createEClass(REPORT);
		createEReference(reportEClass, REPORT__MAP);
		createEReference(reportEClass, REPORT__CHARTS);
		createEReference(reportEClass, REPORT__DATA_SOURCES);

		reportMapEClass = createEClass(REPORT_MAP);
		createEReference(reportMapEClass, REPORT_MAP__REPORTS);

		reportElementEClass = createEClass(REPORT_ELEMENT);

		chartEClass = createEClass(CHART);
		createEReference(chartEClass, CHART__TITLE);
		createEReference(chartEClass, CHART__REPORT);
		createEAttribute(chartEClass, CHART__SHOW_LEGEND);
		createEReference(chartEClass, CHART__DATA_SOURCE);

		chart2DEClass = createEClass(CHART2_D);
		createEReference(chart2DEClass, CHART2_D__XAXIS);
		createEReference(chart2DEClass, CHART2_D__YAXIS);

		chart3DEClass = createEClass(CHART3_D);

		barChartEClass = createEClass(BAR_CHART);

		axisEClass = createEClass(AXIS);
		createEReference(axisEClass, AXIS__LABEL);

		dateAxisEClass = createEClass(DATE_AXIS);
		createEAttribute(dateAxisEClass, DATE_AXIS__FORMAT_STRING);
		createEAttribute(dateAxisEClass, DATE_AXIS__MIN_DATE);
		createEAttribute(dateAxisEClass, DATE_AXIS__MAX_DATE);

		integerAxisEClass = createEClass(INTEGER_AXIS);
		createEAttribute(integerAxisEClass, INTEGER_AXIS__MIN_VALUE);
		createEAttribute(integerAxisEClass, INTEGER_AXIS__MAX_VALUE);

		fontPropertyElementEClass = createEClass(FONT_PROPERTY_ELEMENT);
		createEAttribute(fontPropertyElementEClass, FONT_PROPERTY_ELEMENT__FAMILY);
		createEAttribute(fontPropertyElementEClass, FONT_PROPERTY_ELEMENT__SIZE);
		createEAttribute(fontPropertyElementEClass, FONT_PROPERTY_ELEMENT__BOLD);
		createEAttribute(fontPropertyElementEClass, FONT_PROPERTY_ELEMENT__ITALIC);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__TEXT);

		ganttChartEClass = createEClass(GANTT_CHART);

		dataDimensionEClass = createEClass(DATA_DIMENSION);
		createEReference(dataDimensionEClass, DATA_DIMENSION__FIELD);
		createEAttribute(dataDimensionEClass, DATA_DIMENSION__TYPE);
		createEReference(dataDimensionEClass, DATA_DIMENSION__DATA_SOURCE);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEReference(dataSourceEClass, DATA_SOURCE__DEFINITION);
		createEReference(dataSourceEClass, DATA_SOURCE__SOURCE_OBJECT);
		createEReference(dataSourceEClass, DATA_SOURCE__CHART);

		dataSourceDefinitionEClass = createEClass(DATA_SOURCE_DEFINITION);
		createEReference(dataSourceDefinitionEClass, DATA_SOURCE_DEFINITION__SOURCE);
		createEReference(dataSourceDefinitionEClass, DATA_SOURCE_DEFINITION__MEMBER);

		ganttChartDataSourceEClass = createEClass(GANTT_CHART_DATA_SOURCE);
		createEReference(ganttChartDataSourceEClass, GANTT_CHART_DATA_SOURCE__PROJECT_PHASE_FIELD);
		createEReference(ganttChartDataSourceEClass, GANTT_CHART_DATA_SOURCE__TASK_NAME_FIELD);
		createEReference(ganttChartDataSourceEClass, GANTT_CHART_DATA_SOURCE__START_DATE_FIELD);
		createEReference(ganttChartDataSourceEClass, GANTT_CHART_DATA_SOURCE__END_DATE_FIELD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reportEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		reportElementEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		chartEClass.getESuperTypes().add(this.getReportElement());
		chart2DEClass.getESuperTypes().add(this.getChart());
		chart3DEClass.getESuperTypes().add(this.getChart());
		barChartEClass.getESuperTypes().add(this.getChart2D());
		axisEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		axisEClass.getESuperTypes().add(this.getFontPropertyElement());
		dateAxisEClass.getESuperTypes().add(this.getAxis());
		integerAxisEClass.getESuperTypes().add(this.getAxis());
		labelEClass.getESuperTypes().add(this.getFontPropertyElement());
		ganttChartEClass.getESuperTypes().add(this.getChart2D());
		dataDimensionEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		dataSourceEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		dataSourceDefinitionEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		ganttChartDataSourceEClass.getESuperTypes().add(this.getDataSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(reportEClass, Report.class, "Report", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReport_Map(), this.getReportMap(), this.getReportMap_Reports(), "Map", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReport_Charts(), this.getChart(), this.getChart_Report(), "Charts", null, 0, -1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReport_Charts().getEKeys().add(theModelPackage.getNamedElement_Name());
		initEReference(getReport_DataSources(), this.getDataSource(), null, "DataSources", null, 0, -1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReport_DataSources().getEKeys().add(theModelPackage.getNamedElement_Name());

		initEClass(reportMapEClass, ReportMap.class, "ReportMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReportMap_Reports(), this.getReport(), this.getReport_Map(), "Reports", null, 0, -1, ReportMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReportMap_Reports().getEKeys().add(theModelPackage.getNamedElement_Name());

		initEClass(reportElementEClass, ReportElement.class, "ReportElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chartEClass, Chart.class, "Chart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChart_Title(), this.getLabel(), null, "Title", null, 1, 1, Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChart_Report(), this.getReport(), this.getReport_Charts(), "Report", null, 0, 1, Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChart_ShowLegend(), ecorePackage.getEBoolean(), "ShowLegend", null, 0, 1, Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChart_DataSource(), this.getDataSource(), this.getDataSource_Chart(), "DataSource", null, 0, 1, Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getChart_DataSource().getEKeys().add(theModelPackage.getNamedElement_Name());

		initEClass(chart2DEClass, Chart2D.class, "Chart2D", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChart2D_XAxis(), this.getAxis(), null, "XAxis", null, 1, 1, Chart2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChart2D_YAxis(), this.getAxis(), null, "YAxis", null, 1, 1, Chart2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chart3DEClass, Chart3D.class, "Chart3D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(barChartEClass, BarChart.class, "BarChart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(axisEClass, Axis.class, "Axis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxis_Label(), this.getLabel(), null, "Label", null, 1, 1, Axis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateAxisEClass, DateAxis.class, "DateAxis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateAxis_FormatString(), ecorePackage.getEString(), "FormatString", null, 0, 1, DateAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateAxis_MinDate(), ecorePackage.getEDate(), "MinDate", null, 0, 1, DateAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateAxis_MaxDate(), ecorePackage.getEDate(), "MaxDate", null, 0, 1, DateAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerAxisEClass, IntegerAxis.class, "IntegerAxis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerAxis_MinValue(), ecorePackage.getEInt(), "MinValue", null, 0, 1, IntegerAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerAxis_MaxValue(), ecorePackage.getEInt(), "MaxValue", null, 0, 1, IntegerAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontPropertyElementEClass, FontPropertyElement.class, "FontPropertyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFontPropertyElement_Family(), ecorePackage.getEString(), "Family", null, 0, 1, FontPropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontPropertyElement_Size(), ecorePackage.getEFloat(), "Size", null, 0, 1, FontPropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontPropertyElement_Bold(), ecorePackage.getEBoolean(), "Bold", null, 0, 1, FontPropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontPropertyElement_Italic(), ecorePackage.getEBoolean(), "Italic", null, 0, 1, FontPropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Text(), ecorePackage.getEString(), "Text", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ganttChartEClass, GanttChart.class, "GanttChart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataDimensionEClass, DataDimension.class, "DataDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataDimension_Field(), ecorePackage.getEAttribute(), null, "Field", null, 0, 1, DataDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataDimension_Type(), ecorePackage.getEString(), "Type", null, 0, 1, DataDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataDimension_DataSource(), this.getDataSource(), null, "DataSource", null, 0, 1, DataDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSource_Definition(), this.getDataSourceDefinition(), null, "Definition", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_SourceObject(), ecorePackage.getEObject(), null, "SourceObject", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_Chart(), this.getChart(), this.getChart_DataSource(), "Chart", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceDefinitionEClass, DataSourceDefinition.class, "DataSourceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSourceDefinition_Source(), ecorePackage.getEClass(), null, "Source", null, 0, 1, DataSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSourceDefinition_Member(), ecorePackage.getEReference(), null, "Member", null, 0, 1, DataSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ganttChartDataSourceEClass, GanttChartDataSource.class, "GanttChartDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGanttChartDataSource_ProjectPhaseField(), this.getDataDimension(), null, "ProjectPhaseField", null, 0, 1, GanttChartDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGanttChartDataSource_TaskNameField(), this.getDataDimension(), null, "TaskNameField", null, 0, 1, GanttChartDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGanttChartDataSource_StartDateField(), this.getDataDimension(), null, "StartDateField", null, 0, 1, GanttChartDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGanttChartDataSource_EndDateField(), this.getDataDimension(), null, "EndDateField", null, 0, 1, GanttChartDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ReportingPackageImpl
