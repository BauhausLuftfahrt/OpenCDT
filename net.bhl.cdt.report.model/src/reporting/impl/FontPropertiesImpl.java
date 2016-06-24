/**
 */
package reporting.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import reporting.FontProperties;
import reporting.ReportingPackage;
import reporting.TextElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reporting.impl.FontPropertiesImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link reporting.impl.FontPropertiesImpl#getSize <em>Size</em>}</li>
 *   <li>{@link reporting.impl.FontPropertiesImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link reporting.impl.FontPropertiesImpl#isItalic <em>Italic</em>}</li>
 *   <li>{@link reporting.impl.FontPropertiesImpl#getTextElement <em>Text Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FontPropertiesImpl extends MinimalEObjectImpl.Container implements FontProperties {
	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected float size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected boolean bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean italic = ITALIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingPackage.Literals.FONT_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(String newFamily) {
		String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.FONT_PROPERTIES__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(float newSize) {
		float oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.FONT_PROPERTIES__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(boolean newBold) {
		boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.FONT_PROPERTIES__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(boolean newItalic) {
		boolean oldItalic = italic;
		italic = newItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.FONT_PROPERTIES__ITALIC, oldItalic, italic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextElement getTextElement() {
		if (eContainerFeatureID() != ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT) return null;
		return (TextElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextElement(TextElement newTextElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTextElement, ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextElement(TextElement newTextElement) {
		if (newTextElement != eInternalContainer() || (eContainerFeatureID() != ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT && newTextElement != null)) {
			if (EcoreUtil.isAncestor(this, newTextElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTextElement != null)
				msgs = ((InternalEObject)newTextElement).eInverseAdd(this, ReportingPackage.TEXT_ELEMENT__PROPERTIES, TextElement.class, msgs);
			msgs = basicSetTextElement(newTextElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT, newTextElement, newTextElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTextElement((TextElement)otherEnd, msgs);
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
			case ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT:
				return basicSetTextElement(null, msgs);
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
			case ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ReportingPackage.TEXT_ELEMENT__PROPERTIES, TextElement.class, msgs);
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
			case ReportingPackage.FONT_PROPERTIES__FAMILY:
				return getFamily();
			case ReportingPackage.FONT_PROPERTIES__SIZE:
				return getSize();
			case ReportingPackage.FONT_PROPERTIES__BOLD:
				return isBold();
			case ReportingPackage.FONT_PROPERTIES__ITALIC:
				return isItalic();
			case ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT:
				return getTextElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportingPackage.FONT_PROPERTIES__FAMILY:
				setFamily((String)newValue);
				return;
			case ReportingPackage.FONT_PROPERTIES__SIZE:
				setSize((Float)newValue);
				return;
			case ReportingPackage.FONT_PROPERTIES__BOLD:
				setBold((Boolean)newValue);
				return;
			case ReportingPackage.FONT_PROPERTIES__ITALIC:
				setItalic((Boolean)newValue);
				return;
			case ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT:
				setTextElement((TextElement)newValue);
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
			case ReportingPackage.FONT_PROPERTIES__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case ReportingPackage.FONT_PROPERTIES__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case ReportingPackage.FONT_PROPERTIES__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case ReportingPackage.FONT_PROPERTIES__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
			case ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT:
				setTextElement((TextElement)null);
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
			case ReportingPackage.FONT_PROPERTIES__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case ReportingPackage.FONT_PROPERTIES__SIZE:
				return size != SIZE_EDEFAULT;
			case ReportingPackage.FONT_PROPERTIES__BOLD:
				return bold != BOLD_EDEFAULT;
			case ReportingPackage.FONT_PROPERTIES__ITALIC:
				return italic != ITALIC_EDEFAULT;
			case ReportingPackage.FONT_PROPERTIES__TEXT_ELEMENT:
				return getTextElement() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (Family: ");
		result.append(family);
		result.append(", Size: ");
		result.append(size);
		result.append(", Bold: ");
		result.append(bold);
		result.append(", Italic: ");
		result.append(italic);
		result.append(')');
		return result.toString();
	}

} //FontPropertiesImpl
