/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment.provider;

import java.util.Collection;
import java.util.List;

import net.bhl.cdt.assessment.AssessmentFactory;
import net.bhl.cdt.assessment.AssessmentPackage;
import net.bhl.cdt.assessment.Technology;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.assessment.Technology} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TechnologyItemProvider extends TechnologyElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TechnologyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRequiresPropertyDescriptor(object);
			addProvidesPropertyDescriptor(object);
			addCriticalReadinessLevelAssessmentsPropertyDescriptor(object);
			addCriticalTechnologyReadynessLevelPropertyDescriptor(object);
			addDrivenByPropertyDescriptor(object);
			addExcludesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Requires feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRequiresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Technology_requires_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Technology_requires_feature", "_UI_Technology_type"),
			AssessmentPackage.Literals.TECHNOLOGY__REQUIRES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Provides feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addProvidesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Technology_provides_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Technology_provides_feature", "_UI_Technology_type"),
			AssessmentPackage.Literals.TECHNOLOGY__PROVIDES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Critical Readiness Level Assessments feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCriticalReadinessLevelAssessmentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Technology_criticalReadinessLevelAssessments_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Technology_criticalReadinessLevelAssessments_feature",
				"_UI_Technology_type"), AssessmentPackage.Literals.TECHNOLOGY__CRITICAL_READINESS_LEVEL_ASSESSMENTS,
			true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Critical Technology Readyness Level feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCriticalTechnologyReadynessLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Technology_criticalTechnologyReadynessLevel_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Technology_criticalTechnologyReadynessLevel_feature",
				"_UI_Technology_type"), AssessmentPackage.Literals.TECHNOLOGY__CRITICAL_TECHNOLOGY_READYNESS_LEVEL,
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Driven By feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDrivenByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Technology_drivenBy_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Technology_drivenBy_feature", "_UI_Technology_type"),
			AssessmentPackage.Literals.TECHNOLOGY__DRIVEN_BY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Excludes feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addExcludesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Technology_excludes_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Technology_excludes_feature", "_UI_Technology_type"),
			AssessmentPackage.Literals.TECHNOLOGY__EXCLUDES, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AssessmentPackage.Literals.TECHNOLOGY__READINESS_ASSESSMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Technology.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Technology"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Technology) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Technology_type")
			: getString("_UI_Technology_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Technology.class)) {
		case AssessmentPackage.TECHNOLOGY__CRITICAL_TECHNOLOGY_READYNESS_LEVEL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AssessmentPackage.TECHNOLOGY__READINESS_ASSESSMENTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created
	 * under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(AssessmentPackage.Literals.TECHNOLOGY__READINESS_ASSESSMENTS,
			AssessmentFactory.eINSTANCE.createDerivedReadinessAssessment()));

		newChildDescriptors.add(createChildParameter(AssessmentPackage.Literals.TECHNOLOGY__READINESS_ASSESSMENTS,
			AssessmentFactory.eINSTANCE.createDefaultReadinessLevelAssessment()));

		newChildDescriptors.add(createChildParameter(AssessmentPackage.Literals.TECHNOLOGY__READINESS_ASSESSMENTS,
			AssessmentFactory.eINSTANCE.createSubstantiatedReadinessAssessement()));
	}

}
