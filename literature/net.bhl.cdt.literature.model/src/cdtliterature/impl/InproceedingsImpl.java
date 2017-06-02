/**
 */
package cdtliterature.impl;

import cdtliterature.Article;
import cdtliterature.CdtliteraturePackage;
import cdtliterature.Inproceedings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inproceedings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdtliterature.impl.InproceedingsImpl#getBooktitle <em>Booktitle</em>}</li>
 *   <li>{@link cdtliterature.impl.InproceedingsImpl#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InproceedingsImpl extends ALiteratureBaseImpl implements Inproceedings {
	/**
	 * The default value of the '{@link #getBooktitle() <em>Booktitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooktitle()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBooktitle() <em>Booktitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooktitle()
	 * @generated
	 * @ordered
	 */
	protected String booktitle = BOOKTITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArticles() <em>Articles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticles()
	 * @generated
	 * @ordered
	 */
	protected Article articles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InproceedingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdtliteraturePackage.Literals.INPROCEEDINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBooktitle() {
		return booktitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooktitle(String newBooktitle) {
		String oldBooktitle = booktitle;
		booktitle = newBooktitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INPROCEEDINGS__BOOKTITLE, oldBooktitle, booktitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article getArticles() {
		if (articles != null && articles.eIsProxy()) {
			InternalEObject oldArticles = (InternalEObject)articles;
			articles = (Article)eResolveProxy(oldArticles);
			if (articles != oldArticles) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CdtliteraturePackage.INPROCEEDINGS__ARTICLES, oldArticles, articles));
			}
		}
		return articles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article basicGetArticles() {
		return articles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArticles(Article newArticles) {
		Article oldArticles = articles;
		articles = newArticles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INPROCEEDINGS__ARTICLES, oldArticles, articles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdtliteraturePackage.INPROCEEDINGS__BOOKTITLE:
				return getBooktitle();
			case CdtliteraturePackage.INPROCEEDINGS__ARTICLES:
				if (resolve) return getArticles();
				return basicGetArticles();
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
			case CdtliteraturePackage.INPROCEEDINGS__BOOKTITLE:
				setBooktitle((String)newValue);
				return;
			case CdtliteraturePackage.INPROCEEDINGS__ARTICLES:
				setArticles((Article)newValue);
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
			case CdtliteraturePackage.INPROCEEDINGS__BOOKTITLE:
				setBooktitle(BOOKTITLE_EDEFAULT);
				return;
			case CdtliteraturePackage.INPROCEEDINGS__ARTICLES:
				setArticles((Article)null);
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
			case CdtliteraturePackage.INPROCEEDINGS__BOOKTITLE:
				return BOOKTITLE_EDEFAULT == null ? booktitle != null : !BOOKTITLE_EDEFAULT.equals(booktitle);
			case CdtliteraturePackage.INPROCEEDINGS__ARTICLES:
				return articles != null;
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
		result.append(" (booktitle: ");
		result.append(booktitle);
		result.append(')');
		return result.toString();
	}

} //InproceedingsImpl
