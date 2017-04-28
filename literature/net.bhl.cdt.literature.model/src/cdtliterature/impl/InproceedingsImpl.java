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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inproceedings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdtliterature.impl.InproceedingsImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link cdtliterature.impl.InproceedingsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link cdtliterature.impl.InproceedingsImpl#getBooktitle <em>Booktitle</em>}</li>
 *   <li>{@link cdtliterature.impl.InproceedingsImpl#getYear <em>Year</em>}</li>
 *   <li>{@link cdtliterature.impl.InproceedingsImpl#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InproceedingsImpl extends MinimalEObjectImpl.Container implements Inproceedings {
	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

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
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INPROCEEDINGS__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INPROCEEDINGS__TITLE, oldTitle, title));
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
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INPROCEEDINGS__YEAR, oldYear, year));
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
			case CdtliteraturePackage.INPROCEEDINGS__AUTHOR:
				return getAuthor();
			case CdtliteraturePackage.INPROCEEDINGS__TITLE:
				return getTitle();
			case CdtliteraturePackage.INPROCEEDINGS__BOOKTITLE:
				return getBooktitle();
			case CdtliteraturePackage.INPROCEEDINGS__YEAR:
				return getYear();
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
			case CdtliteraturePackage.INPROCEEDINGS__AUTHOR:
				setAuthor((String)newValue);
				return;
			case CdtliteraturePackage.INPROCEEDINGS__TITLE:
				setTitle((String)newValue);
				return;
			case CdtliteraturePackage.INPROCEEDINGS__BOOKTITLE:
				setBooktitle((String)newValue);
				return;
			case CdtliteraturePackage.INPROCEEDINGS__YEAR:
				setYear((Integer)newValue);
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
			case CdtliteraturePackage.INPROCEEDINGS__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CdtliteraturePackage.INPROCEEDINGS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CdtliteraturePackage.INPROCEEDINGS__BOOKTITLE:
				setBooktitle(BOOKTITLE_EDEFAULT);
				return;
			case CdtliteraturePackage.INPROCEEDINGS__YEAR:
				setYear(YEAR_EDEFAULT);
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
			case CdtliteraturePackage.INPROCEEDINGS__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CdtliteraturePackage.INPROCEEDINGS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CdtliteraturePackage.INPROCEEDINGS__BOOKTITLE:
				return BOOKTITLE_EDEFAULT == null ? booktitle != null : !BOOKTITLE_EDEFAULT.equals(booktitle);
			case CdtliteraturePackage.INPROCEEDINGS__YEAR:
				return year != YEAR_EDEFAULT;
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
		result.append(" (author: ");
		result.append(author);
		result.append(", title: ");
		result.append(title);
		result.append(", booktitle: ");
		result.append(booktitle);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //InproceedingsImpl
