/**
 */
package model.data.measure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.data.measure.Meter#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see model.data.measure.MeasurePackage#getMeter()
 * @model
 * @generated
 */
public interface Meter extends AUnit<Length> {
        /**
         * Returns the value of the '<em><b>Symbol</b></em>' attribute.
         * The default value is <code>"m"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Symbol</em>' attribute.
         * @see model.data.measure.MeasurePackage#getMeter_Symbol()
         * @model default="m" changeable="false"
         * @generated
         */
        String getSymbol();

} // Meter
