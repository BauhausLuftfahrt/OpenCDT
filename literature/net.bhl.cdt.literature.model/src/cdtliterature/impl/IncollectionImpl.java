/**
 */
package cdtliterature.impl;

import cdtliterature.Book;
import cdtliterature.CdtliteraturePackage;
import cdtliterature.Incollection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incollection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdtliterature.impl.IncollectionImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link cdtliterature.impl.IncollectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link cdtliterature.impl.IncollectionImpl#getBooktitle <em>Booktitle</em>}</li>
 *   <li>{@link cdtliterature.impl.IncollectionImpl#getYear <em>Year</em>}</li>
 *   <li>{@link cdtliterature.impl.IncollectionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link cdtliterature.impl.IncollectionImpl#getBooks <em>Books</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncollectionImpl extends MinimalEObjectImpl.Container implements Incollection {
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
	 * The default value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected String publisher = PUBLISHER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooks() <em>Books</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooks()
	 * @generated
	 * @ordered
	 */
	protected Book books;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdtliteraturePackage.Literals.INCOLLECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INCOLLECTION__AUTHOR, oldAuthor, author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INCOLLECTION__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INCOLLECTION__BOOKTITLE, oldBooktitle, booktitle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INCOLLECTION__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(String newPublisher) {
		String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INCOLLECTION__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book getBooks() {
		if (books != null && books.eIsProxy()) {
			InternalEObject oldBooks = (InternalEObject)books;
			books = (Book)eResolveProxy(oldBooks);
			if (books != oldBooks) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CdtliteraturePackage.INCOLLECTION__BOOKS, oldBooks, books));
			}
		}
		return books;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book basicGetBooks() {
		return books;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooks(Book newBooks) {
		Book oldBooks = books;
		books = newBooks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.INCOLLECTION__BOOKS, oldBooks, books));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdtliteraturePackage.INCOLLECTION__AUTHOR:
				return getAuthor();
			case CdtliteraturePackage.INCOLLECTION__TITLE:
				return getTitle();
			case CdtliteraturePackage.INCOLLECTION__BOOKTITLE:
				return getBooktitle();
			case CdtliteraturePackage.INCOLLECTION__YEAR:
				return getYear();
			case CdtliteraturePackage.INCOLLECTION__PUBLISHER:
				return getPublisher();
			case CdtliteraturePackage.INCOLLECTION__BOOKS:
				if (resolve) return getBooks();
				return basicGetBooks();
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
			case CdtliteraturePackage.INCOLLECTION__AUTHOR:
				setAuthor((String)newValue);
				return;
			case CdtliteraturePackage.INCOLLECTION__TITLE:
				setTitle((String)newValue);
				return;
			case CdtliteraturePackage.INCOLLECTION__BOOKTITLE:
				setBooktitle((String)newValue);
				return;
			case CdtliteraturePackage.INCOLLECTION__YEAR:
				setYear((Integer)newValue);
				return;
			case CdtliteraturePackage.INCOLLECTION__PUBLISHER:
				setPublisher((String)newValue);
				return;
			case CdtliteraturePackage.INCOLLECTION__BOOKS:
				setBooks((Book)newValue);
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
			case CdtliteraturePackage.INCOLLECTION__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CdtliteraturePackage.INCOLLECTION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CdtliteraturePackage.INCOLLECTION__BOOKTITLE:
				setBooktitle(BOOKTITLE_EDEFAULT);
				return;
			case CdtliteraturePackage.INCOLLECTION__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case CdtliteraturePackage.INCOLLECTION__PUBLISHER:
				setPublisher(PUBLISHER_EDEFAULT);
				return;
			case CdtliteraturePackage.INCOLLECTION__BOOKS:
				setBooks((Book)null);
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
			case CdtliteraturePackage.INCOLLECTION__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CdtliteraturePackage.INCOLLECTION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CdtliteraturePackage.INCOLLECTION__BOOKTITLE:
				return BOOKTITLE_EDEFAULT == null ? booktitle != null : !BOOKTITLE_EDEFAULT.equals(booktitle);
			case CdtliteraturePackage.INCOLLECTION__YEAR:
				return year != YEAR_EDEFAULT;
			case CdtliteraturePackage.INCOLLECTION__PUBLISHER:
				return PUBLISHER_EDEFAULT == null ? publisher != null : !PUBLISHER_EDEFAULT.equals(publisher);
			case CdtliteraturePackage.INCOLLECTION__BOOKS:
				return books != null;
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
		result.append(", publisher: ");
		result.append(publisher);
		result.append(')');
		return result.toString();
	}

} //IncollectionImpl
