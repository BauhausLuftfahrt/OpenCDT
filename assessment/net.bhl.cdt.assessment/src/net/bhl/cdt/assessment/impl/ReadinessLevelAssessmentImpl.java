/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment.impl;

import net.bhl.cdt.assessment.AssessmentPackage;
import net.bhl.cdt.assessment.ReadinessLevelAssessment;
import net.bhl.cdt.assessment.Technology;
import net.bhl.cdt.assessment.TechnologyReadinessLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Readiness Level Assessment</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.assessment.impl.ReadinessLevelAssessmentImpl#getReadinessLevel <em>Readiness Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReadinessLevelAssessmentImpl extends MinimalEObjectImpl.Container implements
	ReadinessLevelAssessment {
	/**
	 * The default value of the '{@link #getReadinessLevel() <em>Readiness Level</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getReadinessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final TechnologyReadinessLevel READINESS_LEVEL_EDEFAULT = TechnologyReadinessLevel.TRL1;

	/**
	 * The cached value of the '{@link #getReadinessLevel() <em>Readiness Level</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getReadinessLevel()
	 * @generated
	 * @ordered
	 */
	protected TechnologyReadinessLevel readinessLevel = READINESS_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected ReadinessLevelAssessmentImpl() {
		super();

		this.eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {

				if (notification.getFeature() instanceof EAttribute) {
					if (notification.getNotifier() instanceof ReadinessLevelAssessment) {
						EAttribute feature = (EAttribute) notification.getFeature();

						ReadinessLevelAssessment readinessLevelAssessment = (ReadinessLevelAssessment) notification
							.getNotifier();
						if ((feature.getFeatureID() == (AssessmentPackageImpl.READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL) && (readinessLevelAssessment
							.eContainer() != null))) {

							((Technology) readinessLevelAssessment.eContainer())
								.updateCriticalTechnologyReadynessAssessments();

						}
					}
				}
			}
		});
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.READINESS_LEVEL_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TechnologyReadinessLevel getReadinessLevel() {
		return readinessLevel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReadinessLevel(TechnologyReadinessLevel newReadinessLevel) {
		TechnologyReadinessLevel oldReadinessLevel = readinessLevel;
		readinessLevel = newReadinessLevel == null ? READINESS_LEVEL_EDEFAULT : newReadinessLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				AssessmentPackage.READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL, oldReadinessLevel, readinessLevel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AssessmentPackage.READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL:
			return getReadinessLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AssessmentPackage.READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL:
			setReadinessLevel((TechnologyReadinessLevel) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AssessmentPackage.READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL:
			setReadinessLevel(READINESS_LEVEL_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AssessmentPackage.READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL:
			return readinessLevel != READINESS_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (readinessLevel: ");
		result.append(readinessLevel);
		result.append(')');
		return result.toString();
	}

} // ReadinessLevelAssessmentImpl
