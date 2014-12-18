/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.bhl.cdt.assessment.AssessmentPackage;
import net.bhl.cdt.assessment.Capability;
import net.bhl.cdt.assessment.Industry;
import net.bhl.cdt.assessment.ReadinessLevelAssessment;
import net.bhl.cdt.assessment.Technology;
import net.bhl.cdt.assessment.TechnologyReadinessLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Technology</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.assessment.impl.TechnologyImpl#getRequires <em>Requires</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.impl.TechnologyImpl#getProvides <em>Provides</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.impl.TechnologyImpl#getReadinessAssessments <em>Readiness Assessments</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.impl.TechnologyImpl#getCriticalReadinessLevelAssessments <em>Critical Readiness
 * Level Assessments</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.impl.TechnologyImpl#getCriticalTechnologyReadynessLevel <em>Critical Technology
 * Readyness Level</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.impl.TechnologyImpl#getDrivenBy <em>Driven By</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.impl.TechnologyImpl#getExcludes <em>Excludes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologyImpl extends TechnologyElementImpl implements Technology {
	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> requires;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> provides;

	/**
	 * The cached value of the '{@link #getReadinessAssessments() <em>Readiness Assessments</em>}' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReadinessAssessments()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadinessLevelAssessment> readinessAssessments;

	/**
	 * The cached value of the '{@link #getCriticalReadinessLevelAssessments()
	 * <em>Critical Readiness Level Assessments</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCriticalReadinessLevelAssessments()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadinessLevelAssessment> criticalReadinessLevelAssessments;

	/**
	 * The default value of the '{@link #getCriticalTechnologyReadynessLevel()
	 * <em>Critical Technology Readyness Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCriticalTechnologyReadynessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final TechnologyReadinessLevel CRITICAL_TECHNOLOGY_READYNESS_LEVEL_EDEFAULT = TechnologyReadinessLevel.TRL1;

	/**
	 * The cached value of the '{@link #getCriticalTechnologyReadynessLevel()
	 * <em>Critical Technology Readyness Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCriticalTechnologyReadynessLevel()
	 * @generated
	 * @ordered
	 */
	protected TechnologyReadinessLevel criticalTechnologyReadynessLevel = CRITICAL_TECHNOLOGY_READYNESS_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDrivenBy() <em>Driven By</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDrivenBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Industry> drivenBy;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Technology> excludes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TechnologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.TECHNOLOGY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Capability> getProvides() {
		if (provides == null) {
			provides = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
				AssessmentPackage.TECHNOLOGY__PROVIDES, AssessmentPackage.CAPABILITY__PROVIDED_BY);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Industry> getDrivenBy() {
		if (drivenBy == null) {
			drivenBy = new EObjectWithInverseResolvingEList.ManyInverse<Industry>(Industry.class, this,
				AssessmentPackage.TECHNOLOGY__DRIVEN_BY, AssessmentPackage.INDUSTRY__DRIVES);
		}
		return drivenBy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Technology> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectResolvingEList<Technology>(Technology.class, this,
				AssessmentPackage.TECHNOLOGY__EXCLUDES);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void updateCriticalTechnologyReadynessAssessments() {
		getCriticalReadinessLevelAssessments().clear();
		List<ReadinessLevelAssessment> lowestReadinessAssessments = new ArrayList<ReadinessLevelAssessment>();
		for (Capability requiredCapability : this.getRequires()) {
			List<ReadinessLevelAssessment> highestReadinessAssessments = new ArrayList<ReadinessLevelAssessment>();
			for (Technology providingTechnology : requiredCapability.getProvidedBy()) {
				if (providingTechnology.getCriticalReadinessLevelAssessments().isEmpty()) {
					providingTechnology.updateCriticalTechnologyReadynessAssessments();
				}
				if (highestReadinessAssessments.isEmpty()) {
					highestReadinessAssessments.addAll(providingTechnology.getCriticalReadinessLevelAssessments());
				} else if (highestReadinessAssessments.get(0).getReadinessLevel().getValue() < providingTechnology
					.getCriticalReadinessLevelAssessments().get(0).getReadinessLevel().getValue()) {
					highestReadinessAssessments.clear();
					highestReadinessAssessments.addAll(providingTechnology.getCriticalReadinessLevelAssessments());
				} else if (highestReadinessAssessments.get(0).getReadinessLevel().getValue() == providingTechnology
					.getCriticalReadinessLevelAssessments().get(0).getReadinessLevel().getValue()) {
					highestReadinessAssessments.addAll(providingTechnology.getCriticalReadinessLevelAssessments());
				}
			}

			if (lowestReadinessAssessments.isEmpty()) {
				lowestReadinessAssessments.addAll(highestReadinessAssessments);
			} else if (!highestReadinessAssessments.isEmpty()) {
				if (lowestReadinessAssessments.get(0).getReadinessLevel().getValue() > highestReadinessAssessments
					.get(0).getReadinessLevel().getValue()) {
					lowestReadinessAssessments.clear();
					lowestReadinessAssessments.addAll(highestReadinessAssessments);

				} else if (lowestReadinessAssessments.get(0).getReadinessLevel().getValue() == highestReadinessAssessments
					.get(0).getReadinessLevel().getValue()) {
					lowestReadinessAssessments.addAll(highestReadinessAssessments);

				}
			}
		}

		for (ReadinessLevelAssessment readinessLevelAssessment : this.getReadinessAssessments()) {
			if (getCriticalReadinessLevelAssessments().isEmpty()) {
				getCriticalReadinessLevelAssessments().add(readinessLevelAssessment);
			} else if (getCriticalReadinessLevelAssessments().get(0).getReadinessLevel().getValue() > readinessLevelAssessment
				.getReadinessLevel().getValue()) {
				getCriticalReadinessLevelAssessments().clear();
				getCriticalReadinessLevelAssessments().add(readinessLevelAssessment);
			} else if (getCriticalReadinessLevelAssessments().get(0).getReadinessLevel().getValue() == readinessLevelAssessment
				.getReadinessLevel().getValue()) {
				getCriticalReadinessLevelAssessments().add(readinessLevelAssessment);
			}

		}

		if (getCriticalReadinessLevelAssessments().isEmpty()) {
			getCriticalReadinessLevelAssessments().addAll(lowestReadinessAssessments);
		} else {
			if (!lowestReadinessAssessments.isEmpty()) {
				if (lowestReadinessAssessments.get(0).getReadinessLevel().getValue() < getCriticalReadinessLevelAssessments()
					.get(0).getReadinessLevel().getValue()) {
					// System.out.println("Assessment warning: The calculated TRL of " + this.getName()
					// + " has a lower derived (" + criticalReadinessAssessments.get(0).getReadinessLevel().getValue()
					// + ") TRL than can be substantiated. You may need to refine the model");
					getCriticalReadinessLevelAssessments().clear();
					getCriticalReadinessLevelAssessments().addAll(lowestReadinessAssessments);
				}

				if (lowestReadinessAssessments.get(0).getReadinessLevel().getValue() == getCriticalReadinessLevelAssessments()
					.get(0).getReadinessLevel().getValue()) {
					getCriticalReadinessLevelAssessments().addAll(lowestReadinessAssessments);
				}

				if (lowestReadinessAssessments.get(0).getReadinessLevel().getValue() > getCriticalReadinessLevelAssessments()
					.get(0).getReadinessLevel().getValue()) {

				}
			}
		}

		if (!getCriticalReadinessLevelAssessments().isEmpty()) {
			this.setCriticalTechnologyReadynessLevel(getCriticalReadinessLevelAssessments().get(0).getReadinessLevel());
		}

		// }

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void updateRequiredTechnologies() {

		for (Capability requiredCapability : this.getRequires()) {
			for (Technology providingTechnology : requiredCapability.getProvidedBy()) {
				updateCriticalTechnologyReadynessAssessments();
				providingTechnology.updateRequiredTechnologies();
			}
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TechnologyReadinessLevel getCriticalTechnologyReadynessLevel() {
		return criticalTechnologyReadynessLevel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setCriticalTechnologyReadynessLevel(TechnologyReadinessLevel newCriticalTechnologyReadynessLevel) {
		TechnologyReadinessLevel oldCriticalTechnologyReadynessLevel = criticalTechnologyReadynessLevel;
		criticalTechnologyReadynessLevel = newCriticalTechnologyReadynessLevel == null ? CRITICAL_TECHNOLOGY_READYNESS_LEVEL_EDEFAULT
			: newCriticalTechnologyReadynessLevel;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
				AssessmentPackage.TECHNOLOGY__CRITICAL_TECHNOLOGY_READYNESS_LEVEL, oldCriticalTechnologyReadynessLevel,
				criticalTechnologyReadynessLevel));
			for (Capability providedCapability : this.getProvides()) {
				for (Technology requiringTechnology : providedCapability.getRequiredBy()) {
					requiringTechnology.updateCriticalTechnologyReadynessAssessments();
				}
			}
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ReadinessLevelAssessment> getCriticalReadinessLevelAssessments() {
		if (criticalReadinessLevelAssessments == null) {
			criticalReadinessLevelAssessments = new EObjectResolvingEList<ReadinessLevelAssessment>(
				ReadinessLevelAssessment.class, this,
				AssessmentPackage.TECHNOLOGY__CRITICAL_READINESS_LEVEL_ASSESSMENTS);
		}
		return criticalReadinessLevelAssessments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ReadinessLevelAssessment> getReadinessAssessments() {
		if (readinessAssessments == null) {
			readinessAssessments = new EObjectContainmentEList<ReadinessLevelAssessment>(
				ReadinessLevelAssessment.class, this, AssessmentPackage.TECHNOLOGY__READINESS_ASSESSMENTS);
		}
		return readinessAssessments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Capability> getRequires() {
		if (requires == null) {
			requires = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
				AssessmentPackage.TECHNOLOGY__REQUIRES, AssessmentPackage.CAPABILITY__REQUIRED_BY);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AssessmentPackage.TECHNOLOGY__REQUIRES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequires()).basicAdd(otherEnd, msgs);
		case AssessmentPackage.TECHNOLOGY__PROVIDES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvides()).basicAdd(otherEnd, msgs);
		case AssessmentPackage.TECHNOLOGY__DRIVEN_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDrivenBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AssessmentPackage.TECHNOLOGY__REQUIRES:
			return ((InternalEList<?>) getRequires()).basicRemove(otherEnd, msgs);
		case AssessmentPackage.TECHNOLOGY__PROVIDES:
			return ((InternalEList<?>) getProvides()).basicRemove(otherEnd, msgs);
		case AssessmentPackage.TECHNOLOGY__READINESS_ASSESSMENTS:
			return ((InternalEList<?>) getReadinessAssessments()).basicRemove(otherEnd, msgs);
		case AssessmentPackage.TECHNOLOGY__DRIVEN_BY:
			return ((InternalEList<?>) getDrivenBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AssessmentPackage.TECHNOLOGY__REQUIRES:
			return getRequires();
		case AssessmentPackage.TECHNOLOGY__PROVIDES:
			return getProvides();
		case AssessmentPackage.TECHNOLOGY__READINESS_ASSESSMENTS:
			return getReadinessAssessments();
		case AssessmentPackage.TECHNOLOGY__CRITICAL_READINESS_LEVEL_ASSESSMENTS:
			return getCriticalReadinessLevelAssessments();
		case AssessmentPackage.TECHNOLOGY__CRITICAL_TECHNOLOGY_READYNESS_LEVEL:
			return getCriticalTechnologyReadynessLevel();
		case AssessmentPackage.TECHNOLOGY__DRIVEN_BY:
			return getDrivenBy();
		case AssessmentPackage.TECHNOLOGY__EXCLUDES:
			return getExcludes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AssessmentPackage.TECHNOLOGY__REQUIRES:
			getRequires().clear();
			getRequires().addAll((Collection<? extends Capability>) newValue);
			return;
		case AssessmentPackage.TECHNOLOGY__PROVIDES:
			getProvides().clear();
			getProvides().addAll((Collection<? extends Capability>) newValue);
			return;
		case AssessmentPackage.TECHNOLOGY__READINESS_ASSESSMENTS:
			getReadinessAssessments().clear();
			getReadinessAssessments().addAll((Collection<? extends ReadinessLevelAssessment>) newValue);
			return;
		case AssessmentPackage.TECHNOLOGY__CRITICAL_READINESS_LEVEL_ASSESSMENTS:
			getCriticalReadinessLevelAssessments().clear();
			getCriticalReadinessLevelAssessments().addAll((Collection<? extends ReadinessLevelAssessment>) newValue);
			return;
		case AssessmentPackage.TECHNOLOGY__CRITICAL_TECHNOLOGY_READYNESS_LEVEL:
			setCriticalTechnologyReadynessLevel((TechnologyReadinessLevel) newValue);
			return;
		case AssessmentPackage.TECHNOLOGY__DRIVEN_BY:
			getDrivenBy().clear();
			getDrivenBy().addAll((Collection<? extends Industry>) newValue);
			return;
		case AssessmentPackage.TECHNOLOGY__EXCLUDES:
			getExcludes().clear();
			getExcludes().addAll((Collection<? extends Technology>) newValue);
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
		case AssessmentPackage.TECHNOLOGY__REQUIRES:
			getRequires().clear();
			return;
		case AssessmentPackage.TECHNOLOGY__PROVIDES:
			getProvides().clear();
			return;
		case AssessmentPackage.TECHNOLOGY__READINESS_ASSESSMENTS:
			getReadinessAssessments().clear();
			return;
		case AssessmentPackage.TECHNOLOGY__CRITICAL_READINESS_LEVEL_ASSESSMENTS:
			getCriticalReadinessLevelAssessments().clear();
			return;
		case AssessmentPackage.TECHNOLOGY__CRITICAL_TECHNOLOGY_READYNESS_LEVEL:
			setCriticalTechnologyReadynessLevel(CRITICAL_TECHNOLOGY_READYNESS_LEVEL_EDEFAULT);
			return;
		case AssessmentPackage.TECHNOLOGY__DRIVEN_BY:
			getDrivenBy().clear();
			return;
		case AssessmentPackage.TECHNOLOGY__EXCLUDES:
			getExcludes().clear();
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
		case AssessmentPackage.TECHNOLOGY__REQUIRES:
			return requires != null && !requires.isEmpty();
		case AssessmentPackage.TECHNOLOGY__PROVIDES:
			return provides != null && !provides.isEmpty();
		case AssessmentPackage.TECHNOLOGY__READINESS_ASSESSMENTS:
			return readinessAssessments != null && !readinessAssessments.isEmpty();
		case AssessmentPackage.TECHNOLOGY__CRITICAL_READINESS_LEVEL_ASSESSMENTS:
			return criticalReadinessLevelAssessments != null && !criticalReadinessLevelAssessments.isEmpty();
		case AssessmentPackage.TECHNOLOGY__CRITICAL_TECHNOLOGY_READYNESS_LEVEL:
			return criticalTechnologyReadynessLevel != CRITICAL_TECHNOLOGY_READYNESS_LEVEL_EDEFAULT;
		case AssessmentPackage.TECHNOLOGY__DRIVEN_BY:
			return drivenBy != null && !drivenBy.isEmpty();
		case AssessmentPackage.TECHNOLOGY__EXCLUDES:
			return excludes != null && !excludes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AssessmentPackage.TECHNOLOGY___UPDATE_CRITICAL_TECHNOLOGY_READYNESS_ASSESSMENTS:
			updateCriticalTechnologyReadynessAssessments();
			return null;
		case AssessmentPackage.TECHNOLOGY___UPDATE_REQUIRED_TECHNOLOGIES:
			updateRequiredTechnologies();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (criticalTechnologyReadynessLevel: ");
		result.append(criticalTechnologyReadynessLevel);
		result.append(')');
		return result.toString();
	}

} // TechnologyImpl
