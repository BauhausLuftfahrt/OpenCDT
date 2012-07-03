/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.impl;

import java.util.Collection;

import net.bhl.cdt.model.DisciplineView;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.StructuralElement;
import net.bhl.cdt.model.View;
import net.bhl.cdt.model.ViewLink;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Discipline View</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.impl.DisciplineViewImpl#getSubviews <em>Subviews</em>}</li>
 * <li>{@link net.bhl.cdt.model.impl.DisciplineViewImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DisciplineViewImpl extends ViewImpl implements DisciplineView {
	/**
	 * The cached value of the '{@link #getSubviews() <em>Subviews</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubviews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> subviews;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralElement> elements;

	/**
	 * The cached value of the '{@link #getInterfaceTypes() <em>Interface Types</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInterfaceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> interfaceTypes;

	/**
	 * The cached value of the '{@link #getViewLinks() <em>View Links</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getViewLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewLink> viewLinks;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DisciplineViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DISCIPLINE_VIEW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList.Resolving<StructuralElement>(StructuralElement.class, this, ModelPackage.DISCIPLINE_VIEW__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getInterfaceTypes() {
		if (interfaceTypes == null) {
			interfaceTypes = new EObjectResolvingEList<EClass>(EClass.class, this, ModelPackage.DISCIPLINE_VIEW__INTERFACE_TYPES);
		}
		return interfaceTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewLink> getViewLinks() {
		if (viewLinks == null) {
			viewLinks = new EObjectContainmentEList.Resolving<ViewLink>(ViewLink.class, this, ModelPackage.DISCIPLINE_VIEW__VIEW_LINKS);
		}
		return viewLinks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getSubviews() {
		if (subviews == null) {
			subviews = new EObjectContainmentEList.Resolving<View>(View.class, this, ModelPackage.DISCIPLINE_VIEW__SUBVIEWS);
		}
		return subviews;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DISCIPLINE_VIEW__SUBVIEWS:
				return ((InternalEList<?>)getSubviews()).basicRemove(otherEnd, msgs);
			case ModelPackage.DISCIPLINE_VIEW__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ModelPackage.DISCIPLINE_VIEW__VIEW_LINKS:
				return ((InternalEList<?>)getViewLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DISCIPLINE_VIEW__SUBVIEWS:
				return getSubviews();
			case ModelPackage.DISCIPLINE_VIEW__ELEMENTS:
				return getElements();
			case ModelPackage.DISCIPLINE_VIEW__INTERFACE_TYPES:
				return getInterfaceTypes();
			case ModelPackage.DISCIPLINE_VIEW__VIEW_LINKS:
				return getViewLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.DISCIPLINE_VIEW__SUBVIEWS:
				getSubviews().clear();
				getSubviews().addAll((Collection<? extends View>)newValue);
				return;
			case ModelPackage.DISCIPLINE_VIEW__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends StructuralElement>)newValue);
				return;
			case ModelPackage.DISCIPLINE_VIEW__INTERFACE_TYPES:
				getInterfaceTypes().clear();
				getInterfaceTypes().addAll((Collection<? extends EClass>)newValue);
				return;
			case ModelPackage.DISCIPLINE_VIEW__VIEW_LINKS:
				getViewLinks().clear();
				getViewLinks().addAll((Collection<? extends ViewLink>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.DISCIPLINE_VIEW__SUBVIEWS:
				getSubviews().clear();
				return;
			case ModelPackage.DISCIPLINE_VIEW__ELEMENTS:
				getElements().clear();
				return;
			case ModelPackage.DISCIPLINE_VIEW__INTERFACE_TYPES:
				getInterfaceTypes().clear();
				return;
			case ModelPackage.DISCIPLINE_VIEW__VIEW_LINKS:
				getViewLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.DISCIPLINE_VIEW__SUBVIEWS:
				return subviews != null && !subviews.isEmpty();
			case ModelPackage.DISCIPLINE_VIEW__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ModelPackage.DISCIPLINE_VIEW__INTERFACE_TYPES:
				return interfaceTypes != null && !interfaceTypes.isEmpty();
			case ModelPackage.DISCIPLINE_VIEW__VIEW_LINKS:
				return viewLinks != null && !viewLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DisciplineViewImpl
