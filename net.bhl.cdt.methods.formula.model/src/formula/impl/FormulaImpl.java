/**
 */
package formula.impl;

import cdtliterature.ALiteratureBase;
import formula.Formula;
import formula.FormulaPackage;
import formula.FormulaRepository;
import formula.Quantity;

import formula.util.FormulaValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link formula.impl.FormulaImpl#getName <em>Name</em>}</li>
 *   <li>{@link formula.impl.FormulaImpl#getLatexString <em>Latex String</em>}</li>
 *   <li>{@link formula.impl.FormulaImpl#getInputParameter <em>Input Parameter</em>}</li>
 *   <li>{@link formula.impl.FormulaImpl#getOutputParameter <em>Output Parameter</em>}</li>
 *   <li>{@link formula.impl.FormulaImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link formula.impl.FormulaImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaImpl extends MinimalEObjectImpl.Container implements Formula {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatexString() <em>Latex String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatexString()
	 * @generated
	 * @ordered
	 */
	protected static final String LATEX_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatexString() <em>Latex String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatexString()
	 * @generated
	 * @ordered
	 */
	protected String latexString = LATEX_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputParameter() <em>Input Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> inputParameter;

	/**
	 * The cached value of the '{@link #getOutputParameter() <em>Output Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameter()
	 * @generated
	 * @ordered
	 */
	protected Quantity outputParameter;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ALiteratureBase reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormulaPackage.Literals.FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulaPackage.FORMULA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLatexString() {
		return latexString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatexString(String newLatexString) {
		String oldLatexString = latexString;
		latexString = newLatexString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulaPackage.FORMULA__LATEX_STRING, oldLatexString, latexString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantity> getInputParameter() {
		if (inputParameter == null) {
			inputParameter = new EObjectResolvingEList<Quantity>(Quantity.class, this, FormulaPackage.FORMULA__INPUT_PARAMETER);
		}
		return inputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getOutputParameter() {
		if (outputParameter != null && outputParameter.eIsProxy()) {
			InternalEObject oldOutputParameter = (InternalEObject)outputParameter;
			outputParameter = (Quantity)eResolveProxy(oldOutputParameter);
			if (outputParameter != oldOutputParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormulaPackage.FORMULA__OUTPUT_PARAMETER, oldOutputParameter, outputParameter));
			}
		}
		return outputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity basicGetOutputParameter() {
		return outputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParameter(Quantity newOutputParameter) {
		Quantity oldOutputParameter = outputParameter;
		outputParameter = newOutputParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulaPackage.FORMULA__OUTPUT_PARAMETER, oldOutputParameter, outputParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaRepository getRepository() {
		if (eContainerFeatureID() != FormulaPackage.FORMULA__REPOSITORY) return null;
		return (FormulaRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(FormulaRepository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, FormulaPackage.FORMULA__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(FormulaRepository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != FormulaPackage.FORMULA__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, FormulaPackage.FORMULA_REPOSITORY__FORMULAS, FormulaRepository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulaPackage.FORMULA__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALiteratureBase getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ALiteratureBase newReference, NotificationChain msgs) {
		ALiteratureBase oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormulaPackage.FORMULA__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ALiteratureBase newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormulaPackage.FORMULA__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormulaPackage.FORMULA__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulaPackage.FORMULA__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 *//*
	public boolean hasName(DiagnosticChain chain, Map<?, ?> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FormulaValidator.DIAGNOSTIC_SOURCE,
						 FormulaValidator.FORMULA__HAS_NAME,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasName", EObjectValidator.getObjectLabel(this, (Map<Object, Object>) context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}*/

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormulaPackage.FORMULA__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((FormulaRepository)otherEnd, msgs);
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
			case FormulaPackage.FORMULA__REPOSITORY:
				return basicSetRepository(null, msgs);
			case FormulaPackage.FORMULA__REFERENCE:
				return basicSetReference(null, msgs);
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
			case FormulaPackage.FORMULA__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, FormulaPackage.FORMULA_REPOSITORY__FORMULAS, FormulaRepository.class, msgs);
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
			case FormulaPackage.FORMULA__NAME:
				return getName();
			case FormulaPackage.FORMULA__LATEX_STRING:
				return getLatexString();
			case FormulaPackage.FORMULA__INPUT_PARAMETER:
				return getInputParameter();
			case FormulaPackage.FORMULA__OUTPUT_PARAMETER:
				if (resolve) return getOutputParameter();
				return basicGetOutputParameter();
			case FormulaPackage.FORMULA__REPOSITORY:
				return getRepository();
			case FormulaPackage.FORMULA__REFERENCE:
				return getReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormulaPackage.FORMULA__NAME:
				setName((String)newValue);
				return;
			case FormulaPackage.FORMULA__LATEX_STRING:
				setLatexString((String)newValue);
				return;
			case FormulaPackage.FORMULA__INPUT_PARAMETER:
				getInputParameter().clear();
				getInputParameter().addAll((Collection<? extends Quantity>)newValue);
				return;
			case FormulaPackage.FORMULA__OUTPUT_PARAMETER:
				setOutputParameter((Quantity)newValue);
				return;
			case FormulaPackage.FORMULA__REPOSITORY:
				setRepository((FormulaRepository)newValue);
				return;
			case FormulaPackage.FORMULA__REFERENCE:
				setReference((ALiteratureBase)newValue);
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
			case FormulaPackage.FORMULA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormulaPackage.FORMULA__LATEX_STRING:
				setLatexString(LATEX_STRING_EDEFAULT);
				return;
			case FormulaPackage.FORMULA__INPUT_PARAMETER:
				getInputParameter().clear();
				return;
			case FormulaPackage.FORMULA__OUTPUT_PARAMETER:
				setOutputParameter((Quantity)null);
				return;
			case FormulaPackage.FORMULA__REPOSITORY:
				setRepository((FormulaRepository)null);
				return;
			case FormulaPackage.FORMULA__REFERENCE:
				setReference((ALiteratureBase)null);
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
			case FormulaPackage.FORMULA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormulaPackage.FORMULA__LATEX_STRING:
				return LATEX_STRING_EDEFAULT == null ? latexString != null : !LATEX_STRING_EDEFAULT.equals(latexString);
			case FormulaPackage.FORMULA__INPUT_PARAMETER:
				return inputParameter != null && !inputParameter.isEmpty();
			case FormulaPackage.FORMULA__OUTPUT_PARAMETER:
				return outputParameter != null;
			case FormulaPackage.FORMULA__REPOSITORY:
				return getRepository() != null;
			case FormulaPackage.FORMULA__REFERENCE:
				return reference != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FormulaPackage.FORMULA___HAS_NAME__DIAGNOSTICCHAIN_MAP:
				return hasName((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", latexString: ");
		result.append(latexString);
		result.append(')');
		return result.toString();
	}
	
	/**
	* 
	 * 
	 * @generated NOT
	 */
	public boolean hasName(DiagnosticChain chain, Map<?, ?> context) {
		if (getName() == null|| 
				getName().equals("")) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FormulaValidator.DIAGNOSTIC_SOURCE,
						 FormulaValidator.FORMULA__HAS_NAME,
						 "Task needs to have a name",
						 new Object [] { this, FormulaPackage.eINSTANCE.getFormula_Name() }));
			}
			return false;
		}
		return true;
	}

	@Override
	public boolean hasLatexString(DiagnosticChain chain, Map<?, ?> context) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	* 
	 * 
	 * @generated NOT
	 */
	/*public boolean hasLatexString(DiagnosticChain chain, Map<?, ?> context) {
		if (getLatexString() == null|| 
				getLatexString().equals("")) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FormulaValidator.DIAGNOSTIC_SOURCE,
						 FormulaValidator.FORMULA__HAS_NAME,
						 "Task needs to have a name",
						 new Object [] { this, FormulaPackage.eINSTANCE.getFormula_LatexString() }));
			}
			return false;
		}
		return true;
	}*/

	

} //FormulaImpl
