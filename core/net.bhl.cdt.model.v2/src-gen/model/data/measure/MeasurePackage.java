/**
 */
package model.data.measure;

import model.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see model.data.measure.MeasureFactory
 * @model kind="package"
 * @generated
 */
public interface MeasurePackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "measure";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/data/measure";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "net.bhl.cdt.model.data";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        MeasurePackage eINSTANCE = model.data.measure.impl.MeasurePackageImpl.init();

        /**
         * The meta object id for the '{@link model.data.measure.impl.ADimensionImpl <em>ADimension</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.measure.impl.ADimensionImpl
         * @see model.data.measure.impl.MeasurePackageImpl#getADimension()
         * @generated
         */
        int ADIMENSION = 0;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ADIMENSION__NAME = BasePackage.ANAMED_ITEM__NAME;

        /**
         * The number of structural features of the '<em>ADimension</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ADIMENSION_FEATURE_COUNT = BasePackage.ANAMED_ITEM_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>ADimension</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ADIMENSION_OPERATION_COUNT = BasePackage.ANAMED_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.measure.impl.LengthImpl <em>Length</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.measure.impl.LengthImpl
         * @see model.data.measure.impl.MeasurePackageImpl#getLength()
         * @generated
         */
        int LENGTH = 1;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH__NAME = ADIMENSION__NAME;

        /**
         * The number of structural features of the '<em>Length</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH_FEATURE_COUNT = ADIMENSION_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Length</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH_OPERATION_COUNT = ADIMENSION_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.measure.AUnit <em>AUnit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.measure.AUnit
         * @see model.data.measure.impl.MeasurePackageImpl#getAUnit()
         * @generated
         */
        int AUNIT = 2;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AUNIT__NAME = BasePackage.ANAMED_ITEM__NAME;

        /**
         * The number of structural features of the '<em>AUnit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AUNIT_FEATURE_COUNT = BasePackage.ANAMED_ITEM_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>AUnit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AUNIT_OPERATION_COUNT = BasePackage.ANAMED_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.measure.impl.MeterImpl <em>Meter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.measure.impl.MeterImpl
         * @see model.data.measure.impl.MeasurePackageImpl#getMeter()
         * @generated
         */
        int METER = 3;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METER__NAME = AUNIT__NAME;

        /**
         * The feature id for the '<em><b>Symbol</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METER__SYMBOL = AUNIT_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Meter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METER_FEATURE_COUNT = AUNIT_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Meter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METER_OPERATION_COUNT = AUNIT_OPERATION_COUNT + 0;


        /**
         * Returns the meta object for class '{@link model.data.measure.ADimension <em>ADimension</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>ADimension</em>'.
         * @see model.data.measure.ADimension
         * @generated
         */
        EClass getADimension();

        /**
         * Returns the meta object for class '{@link model.data.measure.Length <em>Length</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Length</em>'.
         * @see model.data.measure.Length
         * @generated
         */
        EClass getLength();

        /**
         * Returns the meta object for class '{@link model.data.measure.AUnit <em>AUnit</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>AUnit</em>'.
         * @see model.data.measure.AUnit
         * @generated
         */
        EClass getAUnit();

        /**
         * Returns the meta object for class '{@link model.data.measure.Meter <em>Meter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Meter</em>'.
         * @see model.data.measure.Meter
         * @generated
         */
        EClass getMeter();

        /**
         * Returns the meta object for the attribute '{@link model.data.measure.Meter#getSymbol <em>Symbol</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Symbol</em>'.
         * @see model.data.measure.Meter#getSymbol()
         * @see #getMeter()
         * @generated
         */
        EAttribute getMeter_Symbol();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        MeasureFactory getMeasureFactory();

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
                 * The meta object literal for the '{@link model.data.measure.impl.ADimensionImpl <em>ADimension</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.measure.impl.ADimensionImpl
                 * @see model.data.measure.impl.MeasurePackageImpl#getADimension()
                 * @generated
                 */
                EClass ADIMENSION = eINSTANCE.getADimension();

                /**
                 * The meta object literal for the '{@link model.data.measure.impl.LengthImpl <em>Length</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.measure.impl.LengthImpl
                 * @see model.data.measure.impl.MeasurePackageImpl#getLength()
                 * @generated
                 */
                EClass LENGTH = eINSTANCE.getLength();

                /**
                 * The meta object literal for the '{@link model.data.measure.AUnit <em>AUnit</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.measure.AUnit
                 * @see model.data.measure.impl.MeasurePackageImpl#getAUnit()
                 * @generated
                 */
                EClass AUNIT = eINSTANCE.getAUnit();

                /**
                 * The meta object literal for the '{@link model.data.measure.impl.MeterImpl <em>Meter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.measure.impl.MeterImpl
                 * @see model.data.measure.impl.MeasurePackageImpl#getMeter()
                 * @generated
                 */
                EClass METER = eINSTANCE.getMeter();

                /**
                 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METER__SYMBOL = eINSTANCE.getMeter_Symbol();

        }

} //MeasurePackage
