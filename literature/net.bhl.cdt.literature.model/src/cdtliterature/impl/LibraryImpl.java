/**
 */
package cdtliterature.impl;

import cdtliterature.Article;
import cdtliterature.Book;
import cdtliterature.CdtliteraturePackage;
import cdtliterature.Conference;
import cdtliterature.Inbook;
import cdtliterature.Incollection;
import cdtliterature.Inproceedings;
import cdtliterature.Library;
import cdtliterature.Masterthesis;
import cdtliterature.Phdthesis;
import cdtliterature.Proceedings;
import cdtliterature.Techreport;
import cdtliterature.Unpublished;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getArticle <em>Article</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getBook <em>Book</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getInbook <em>Inbook</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getConference <em>Conference</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getIncollection <em>Incollection</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getInproceedings <em>Inproceedings</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getProceedings <em>Proceedings</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getTechreport <em>Techreport</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getPhdthesis <em>Phdthesis</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getMasterthesis <em>Masterthesis</em>}</li>
 *   <li>{@link cdtliterature.impl.LibraryImpl#getUnpublished <em>Unpublished</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends MinimalEObjectImpl.Container implements Library {
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
	 * The cached value of the '{@link #getArticle() <em>Article</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticle()
	 * @generated
	 * @ordered
	 */
	protected EList<Article> article;

	/**
	 * The cached value of the '{@link #getBook() <em>Book</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBook()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> book;

	/**
	 * The cached value of the '{@link #getInbook() <em>Inbook</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInbook()
	 * @generated
	 * @ordered
	 */
	protected EList<Inbook> inbook;

	/**
	 * The cached value of the '{@link #getConference() <em>Conference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConference()
	 * @generated
	 * @ordered
	 */
	protected EList<Conference> conference;

	/**
	 * The cached value of the '{@link #getIncollection() <em>Incollection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncollection()
	 * @generated
	 * @ordered
	 */
	protected EList<Incollection> incollection;

	/**
	 * The cached value of the '{@link #getInproceedings() <em>Inproceedings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInproceedings()
	 * @generated
	 * @ordered
	 */
	protected EList<Inproceedings> inproceedings;

	/**
	 * The cached value of the '{@link #getProceedings() <em>Proceedings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedings()
	 * @generated
	 * @ordered
	 */
	protected EList<Proceedings> proceedings;

	/**
	 * The cached value of the '{@link #getTechreport() <em>Techreport</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechreport()
	 * @generated
	 * @ordered
	 */
	protected EList<Techreport> techreport;

	/**
	 * The cached value of the '{@link #getPhdthesis() <em>Phdthesis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhdthesis()
	 * @generated
	 * @ordered
	 */
	protected EList<Phdthesis> phdthesis;

	/**
	 * The cached value of the '{@link #getMasterthesis() <em>Masterthesis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterthesis()
	 * @generated
	 * @ordered
	 */
	protected EList<Masterthesis> masterthesis;

	/**
	 * The cached value of the '{@link #getUnpublished() <em>Unpublished</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnpublished()
	 * @generated
	 * @ordered
	 */
	protected EList<Unpublished> unpublished;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdtliteraturePackage.Literals.LIBRARY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdtliteraturePackage.LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Article> getArticle() {
		if (article == null) {
			article = new EObjectContainmentEList<Article>(Article.class, this, CdtliteraturePackage.LIBRARY__ARTICLE);
		}
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBook() {
		if (book == null) {
			book = new EObjectContainmentEList<Book>(Book.class, this, CdtliteraturePackage.LIBRARY__BOOK);
		}
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inbook> getInbook() {
		if (inbook == null) {
			inbook = new EObjectContainmentEList<Inbook>(Inbook.class, this, CdtliteraturePackage.LIBRARY__INBOOK);
		}
		return inbook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conference> getConference() {
		if (conference == null) {
			conference = new EObjectResolvingEList<Conference>(Conference.class, this, CdtliteraturePackage.LIBRARY__CONFERENCE);
		}
		return conference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Incollection> getIncollection() {
		if (incollection == null) {
			incollection = new EObjectResolvingEList<Incollection>(Incollection.class, this, CdtliteraturePackage.LIBRARY__INCOLLECTION);
		}
		return incollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inproceedings> getInproceedings() {
		if (inproceedings == null) {
			inproceedings = new EObjectResolvingEList<Inproceedings>(Inproceedings.class, this, CdtliteraturePackage.LIBRARY__INPROCEEDINGS);
		}
		return inproceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Proceedings> getProceedings() {
		if (proceedings == null) {
			proceedings = new EObjectResolvingEList<Proceedings>(Proceedings.class, this, CdtliteraturePackage.LIBRARY__PROCEEDINGS);
		}
		return proceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Techreport> getTechreport() {
		if (techreport == null) {
			techreport = new EObjectResolvingEList<Techreport>(Techreport.class, this, CdtliteraturePackage.LIBRARY__TECHREPORT);
		}
		return techreport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phdthesis> getPhdthesis() {
		if (phdthesis == null) {
			phdthesis = new EObjectResolvingEList<Phdthesis>(Phdthesis.class, this, CdtliteraturePackage.LIBRARY__PHDTHESIS);
		}
		return phdthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Masterthesis> getMasterthesis() {
		if (masterthesis == null) {
			masterthesis = new EObjectResolvingEList<Masterthesis>(Masterthesis.class, this, CdtliteraturePackage.LIBRARY__MASTERTHESIS);
		}
		return masterthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unpublished> getUnpublished() {
		if (unpublished == null) {
			unpublished = new EObjectResolvingEList<Unpublished>(Unpublished.class, this, CdtliteraturePackage.LIBRARY__UNPUBLISHED);
		}
		return unpublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CdtliteraturePackage.LIBRARY__ARTICLE:
				return ((InternalEList<?>)getArticle()).basicRemove(otherEnd, msgs);
			case CdtliteraturePackage.LIBRARY__BOOK:
				return ((InternalEList<?>)getBook()).basicRemove(otherEnd, msgs);
			case CdtliteraturePackage.LIBRARY__INBOOK:
				return ((InternalEList<?>)getInbook()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdtliteraturePackage.LIBRARY__NAME:
				return getName();
			case CdtliteraturePackage.LIBRARY__ARTICLE:
				return getArticle();
			case CdtliteraturePackage.LIBRARY__BOOK:
				return getBook();
			case CdtliteraturePackage.LIBRARY__INBOOK:
				return getInbook();
			case CdtliteraturePackage.LIBRARY__CONFERENCE:
				return getConference();
			case CdtliteraturePackage.LIBRARY__INCOLLECTION:
				return getIncollection();
			case CdtliteraturePackage.LIBRARY__INPROCEEDINGS:
				return getInproceedings();
			case CdtliteraturePackage.LIBRARY__PROCEEDINGS:
				return getProceedings();
			case CdtliteraturePackage.LIBRARY__TECHREPORT:
				return getTechreport();
			case CdtliteraturePackage.LIBRARY__PHDTHESIS:
				return getPhdthesis();
			case CdtliteraturePackage.LIBRARY__MASTERTHESIS:
				return getMasterthesis();
			case CdtliteraturePackage.LIBRARY__UNPUBLISHED:
				return getUnpublished();
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
			case CdtliteraturePackage.LIBRARY__NAME:
				setName((String)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__ARTICLE:
				getArticle().clear();
				getArticle().addAll((Collection<? extends Article>)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__BOOK:
				getBook().clear();
				getBook().addAll((Collection<? extends Book>)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__INBOOK:
				getInbook().clear();
				getInbook().addAll((Collection<? extends Inbook>)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__CONFERENCE:
				getConference().clear();
				getConference().addAll((Collection<? extends Conference>)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__INCOLLECTION:
				getIncollection().clear();
				getIncollection().addAll((Collection<? extends Incollection>)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__INPROCEEDINGS:
				getInproceedings().clear();
				getInproceedings().addAll((Collection<? extends Inproceedings>)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__PROCEEDINGS:
				getProceedings().clear();
				getProceedings().addAll((Collection<? extends Proceedings>)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__TECHREPORT:
				getTechreport().clear();
				getTechreport().addAll((Collection<? extends Techreport>)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__PHDTHESIS:
				getPhdthesis().clear();
				getPhdthesis().addAll((Collection<? extends Phdthesis>)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__MASTERTHESIS:
				getMasterthesis().clear();
				getMasterthesis().addAll((Collection<? extends Masterthesis>)newValue);
				return;
			case CdtliteraturePackage.LIBRARY__UNPUBLISHED:
				getUnpublished().clear();
				getUnpublished().addAll((Collection<? extends Unpublished>)newValue);
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
			case CdtliteraturePackage.LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CdtliteraturePackage.LIBRARY__ARTICLE:
				getArticle().clear();
				return;
			case CdtliteraturePackage.LIBRARY__BOOK:
				getBook().clear();
				return;
			case CdtliteraturePackage.LIBRARY__INBOOK:
				getInbook().clear();
				return;
			case CdtliteraturePackage.LIBRARY__CONFERENCE:
				getConference().clear();
				return;
			case CdtliteraturePackage.LIBRARY__INCOLLECTION:
				getIncollection().clear();
				return;
			case CdtliteraturePackage.LIBRARY__INPROCEEDINGS:
				getInproceedings().clear();
				return;
			case CdtliteraturePackage.LIBRARY__PROCEEDINGS:
				getProceedings().clear();
				return;
			case CdtliteraturePackage.LIBRARY__TECHREPORT:
				getTechreport().clear();
				return;
			case CdtliteraturePackage.LIBRARY__PHDTHESIS:
				getPhdthesis().clear();
				return;
			case CdtliteraturePackage.LIBRARY__MASTERTHESIS:
				getMasterthesis().clear();
				return;
			case CdtliteraturePackage.LIBRARY__UNPUBLISHED:
				getUnpublished().clear();
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
			case CdtliteraturePackage.LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CdtliteraturePackage.LIBRARY__ARTICLE:
				return article != null && !article.isEmpty();
			case CdtliteraturePackage.LIBRARY__BOOK:
				return book != null && !book.isEmpty();
			case CdtliteraturePackage.LIBRARY__INBOOK:
				return inbook != null && !inbook.isEmpty();
			case CdtliteraturePackage.LIBRARY__CONFERENCE:
				return conference != null && !conference.isEmpty();
			case CdtliteraturePackage.LIBRARY__INCOLLECTION:
				return incollection != null && !incollection.isEmpty();
			case CdtliteraturePackage.LIBRARY__INPROCEEDINGS:
				return inproceedings != null && !inproceedings.isEmpty();
			case CdtliteraturePackage.LIBRARY__PROCEEDINGS:
				return proceedings != null && !proceedings.isEmpty();
			case CdtliteraturePackage.LIBRARY__TECHREPORT:
				return techreport != null && !techreport.isEmpty();
			case CdtliteraturePackage.LIBRARY__PHDTHESIS:
				return phdthesis != null && !phdthesis.isEmpty();
			case CdtliteraturePackage.LIBRARY__MASTERTHESIS:
				return masterthesis != null && !masterthesis.isEmpty();
			case CdtliteraturePackage.LIBRARY__UNPUBLISHED:
				return unpublished != null && !unpublished.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LibraryImpl
