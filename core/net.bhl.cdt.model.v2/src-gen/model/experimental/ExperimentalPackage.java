/**
 */
package model.experimental;

import model.data.DataPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see model.experimental.ExperimentalFactory
 * @model kind="package"
 * @generated
 */
public interface ExperimentalPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "experimental";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/experimental";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "net.bhl.cdt.model";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        ExperimentalPackage eINSTANCE = model.experimental.impl.ExperimentalPackageImpl.init();

        /**
         * The meta object id for the '{@link model.experimental.IQuantifiedParameter <em>IQuantified Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.experimental.IQuantifiedParameter
         * @see model.experimental.impl.ExperimentalPackageImpl#getIQuantifiedParameter()
         * @generated
         */
        int IQUANTIFIED_PARAMETER = 0;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER__NAME = DataPackage.IPARAMETER__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER__ID = DataPackage.IPARAMETER__ID;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER__VALUE = DataPackage.IPARAMETER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>IQuantified Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER_FEATURE_COUNT = DataPackage.IPARAMETER_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>IQuantified Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IQUANTIFIED_PARAMETER_OPERATION_COUNT = DataPackage.IPARAMETER_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.experimental.impl.LengthParameterImpl <em>Length Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.experimental.impl.LengthParameterImpl
         * @see model.experimental.impl.ExperimentalPackageImpl#getLengthParameter()
         * @generated
         */
        int LENGTH_PARAMETER = 1;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH_PARAMETER__NAME = IQUANTIFIED_PARAMETER__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH_PARAMETER__ID = IQUANTIFIED_PARAMETER__ID;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH_PARAMETER__VALUE = IQUANTIFIED_PARAMETER__VALUE;

        /**
         * The number of structural features of the '<em>Length Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH_PARAMETER_FEATURE_COUNT = IQUANTIFIED_PARAMETER_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Length Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LENGTH_PARAMETER_OPERATION_COUNT = IQUANTIFIED_PARAMETER_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.experimental.impl.MassParameterImpl <em>Mass Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.experimental.impl.MassParameterImpl
         * @see model.experimental.impl.ExperimentalPackageImpl#getMassParameter()
         * @generated
         */
        int MASS_PARAMETER = 2;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_PARAMETER__NAME = IQUANTIFIED_PARAMETER__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_PARAMETER__ID = IQUANTIFIED_PARAMETER__ID;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_PARAMETER__VALUE = IQUANTIFIED_PARAMETER__VALUE;

        /**
         * The number of structural features of the '<em>Mass Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_PARAMETER_FEATURE_COUNT = IQUANTIFIED_PARAMETER_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Mass Parameter</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_PARAMETER_OPERATION_COUNT = IQUANTIFIED_PARAMETER_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '<em>Length</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.measure.quantity.Length
         * @see model.experimental.impl.ExperimentalPackageImpl#getLength()
         * @generated
         */
        int LENGTH = 3;

        /**
         * The meta object id for the '<em>Mass</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.measure.quantity.Mass
         * @see model.experimental.impl.ExperimentalPackageImpl#getMass()
         * @generated
         */
        int MASS = 4;

        /**
         * The meta object id for the '<em>Distance</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.measure.quantity.Length
         * @see model.experimental.impl.ExperimentalPackageImpl#getDistance()
         * @generated
         */
        int DISTANCE = 5;

        /**
         * The meta object id for the '<em>Amount</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jscience.physics.amount.Amount
         * @see model.experimental.impl.ExperimentalPackageImpl#getAmount()
         * @generated
         */
        int AMOUNT = 6;

        /**
         * The meta object id for the '<em>Unit</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.measure.unit.Unit
         * @see model.experimental.impl.ExperimentalPackageImpl#getUnit()
         * @generated
         */
        int UNIT = 7;

        /**
         * The meta object id for the '<em>Quantity</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.measure.quantity.Quantity
         * @see model.experimental.impl.ExperimentalPackageImpl#getQuantity()
         * @generated
         */
        int QUANTITY = 8;


        /**
         * Returns the meta object for class '{@link model.experimental.IQuantifiedParameter <em>IQuantified Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>IQuantified Parameter</em>'.
         * @see model.experimental.IQuantifiedParameter
         * @generated
         */
        EClass getIQuantifiedParameter();

        /**
         * Returns the meta object for the attribute '{@link model.experimental.IQuantifiedParameter#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Value</em>'.
         * @see model.experimental.IQuantifiedParameter#getValue()
         * @see #getIQuantifiedParameter()
         * @generated
         */
        EAttribute getIQuantifiedParameter_Value();

        /**
         * Returns the meta object for class '{@link model.experimental.LengthParameter <em>Length Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Length Parameter</em>'.
         * @see model.experimental.LengthParameter
         * @generated
         */
        EClass getLengthParameter();

        /**
         * Returns the meta object for class '{@link model.experimental.MassParameter <em>Mass Parameter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Mass Parameter</em>'.
         * @see model.experimental.MassParameter
         * @generated
         */
        EClass getMassParameter();

        /**
         * Returns the meta object for data type '{@link javax.measure.quantity.Length <em>Length</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Length</em>'.
         * @see javax.measure.quantity.Length
         * @model instanceClass="javax.measure.quantity.Length"
         * @generated
         */
        EDataType getLength();

        /**
         * Returns the meta object for data type '{@link javax.measure.quantity.Mass <em>Mass</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Mass</em>'.
         * @see javax.measure.quantity.Mass
         * @model instanceClass="javax.measure.quantity.Mass"
         * @generated
         */
        EDataType getMass();

        /**
         * Returns the meta object for data type '{@link javax.measure.quantity.Length <em>Distance</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Distance</em>'.
         * @see javax.measure.quantity.Length
         * @model instanceClass="javax.measure.quantity.Length"
         * @generated
         */
        EDataType getDistance();

        /**
         * Returns the meta object for data type '{@link org.jscience.physics.amount.Amount <em>Amount</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Amount</em>'.
         * @see org.jscience.physics.amount.Amount
         * @model instanceClass="org.jscience.physics.amount.Amount" typeParameters="Q" QBounds="model.experimental.Quantity"
         * @generated
         */
        EDataType getAmount();

        /**
         * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>Unit</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Unit</em>'.
         * @see javax.measure.unit.Unit
         * @model instanceClass="javax.measure.unit.Unit" typeParameters="Q" QBounds="model.experimental.Quantity"
         * @generated
         */
        EDataType getUnit();

        /**
         * Returns the meta object for data type '{@link javax.measure.quantity.Quantity <em>Quantity</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Quantity</em>'.
         * @see javax.measure.quantity.Quantity
         * @model instanceClass="javax.measure.quantity.Quantity"
         * @generated
         */
        EDataType getQuantity();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        ExperimentalFactory getExperimentalFactory();

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
                 * The meta object literal for the '{@link model.experimental.IQuantifiedParameter <em>IQuantified Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.experimental.IQuantifiedParameter
                 * @see model.experimental.impl.ExperimentalPackageImpl#getIQuantifiedParameter()
                 * @generated
                 */
                EClass IQUANTIFIED_PARAMETER = eINSTANCE.getIQuantifiedParameter();

                /**
                 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute IQUANTIFIED_PARAMETER__VALUE = eINSTANCE.getIQuantifiedParameter_Value();

                /**
                 * The meta object literal for the '{@link model.experimental.impl.LengthParameterImpl <em>Length Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.experimental.impl.LengthParameterImpl
                 * @see model.experimental.impl.ExperimentalPackageImpl#getLengthParameter()
                 * @generated
                 */
                EClass LENGTH_PARAMETER = eINSTANCE.getLengthParameter();

                /**
                 * The meta object literal for the '{@link model.experimental.impl.MassParameterImpl <em>Mass Parameter</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.experimental.impl.MassParameterImpl
                 * @see model.experimental.impl.ExperimentalPackageImpl#getMassParameter()
                 * @generated
                 */
                EClass MASS_PARAMETER = eINSTANCE.getMassParameter();

                /**
                 * The meta object literal for the '<em>Length</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.measure.quantity.Length
                 * @see model.experimental.impl.ExperimentalPackageImpl#getLength()
                 * @generated
                 */
                EDataType LENGTH = eINSTANCE.getLength();

                /**
                 * The meta object literal for the '<em>Mass</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.measure.quantity.Mass
                 * @see model.experimental.impl.ExperimentalPackageImpl#getMass()
                 * @generated
                 */
                EDataType MASS = eINSTANCE.getMass();

                /**
                 * The meta object literal for the '<em>Distance</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.measure.quantity.Length
                 * @see model.experimental.impl.ExperimentalPackageImpl#getDistance()
                 * @generated
                 */
                EDataType DISTANCE = eINSTANCE.getDistance();

                /**
                 * The meta object literal for the '<em>Amount</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.jscience.physics.amount.Amount
                 * @see model.experimental.impl.ExperimentalPackageImpl#getAmount()
                 * @generated
                 */
                EDataType AMOUNT = eINSTANCE.getAmount();

                /**
                 * The meta object literal for the '<em>Unit</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.measure.unit.Unit
                 * @see model.experimental.impl.ExperimentalPackageImpl#getUnit()
                 * @generated
                 */
                EDataType UNIT = eINSTANCE.getUnit();

                /**
                 * The meta object literal for the '<em>Quantity</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.measure.quantity.Quantity
                 * @see model.experimental.impl.ExperimentalPackageImpl#getQuantity()
                 * @generated
                 */
                EDataType QUANTITY = eINSTANCE.getQuantity();

        }

} //ExperimentalPackage
