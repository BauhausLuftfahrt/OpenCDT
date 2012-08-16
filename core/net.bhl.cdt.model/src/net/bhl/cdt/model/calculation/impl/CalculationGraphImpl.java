/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Model;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.calculation.AbstractNode;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationGraph;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.ControlNode;
import net.bhl.cdt.model.calculation.Node;
import net.bhl.cdt.model.calculation.StartSet;
import net.bhl.cdt.model.impl.ElementImpl;
import net.bhl.cdt.model.qualification.CalculationSpace;
import net.bhl.cdt.model.qualification.QualificationFactory;
import net.bhl.cdt.model.qualification.QualifyingSpace;
import net.bhl.cdt.model.util.CalculationHelper;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Graph</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.calculation.impl.CalculationGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.impl.CalculationGraphImpl#getFirstNode <em>First Node</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.impl.CalculationGraphImpl#getStartSet <em>Start Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalculationGraphImpl extends ElementImpl implements CalculationGraph {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNode> nodes;

	/**
	 * The cached value of the '{@link #getFirstNode() <em>First Node</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFirstNode()
	 * @generated
	 * @ordered
	 */
	protected AbstractNode firstNode;

	/**
	 * The cached value of the '{@link #getStartSet() <em>Start Set</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getStartSet()
	 * @generated
	 * @ordered
	 */
	protected StartSet startSet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculationGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculationPackage.Literals.CALCULATION_GRAPH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList.Resolving<AbstractNode>(AbstractNode.class, this, CalculationPackage.CALCULATION_GRAPH__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode getFirstNode() {
		if (firstNode != null && firstNode.eIsProxy()) {
			InternalEObject oldFirstNode = (InternalEObject)firstNode;
			firstNode = (AbstractNode)eResolveProxy(oldFirstNode);
			if (firstNode != oldFirstNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculationPackage.CALCULATION_GRAPH__FIRST_NODE, oldFirstNode, firstNode));
			}
		}
		return firstNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode basicGetFirstNode() {
		return firstNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstNode(AbstractNode newFirstNode) {
		AbstractNode oldFirstNode = firstNode;
		firstNode = newFirstNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.CALCULATION_GRAPH__FIRST_NODE, oldFirstNode, firstNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StartSet getStartSet() {
		if (startSet != null && startSet.eIsProxy()) {
			InternalEObject oldStartSet = (InternalEObject)startSet;
			startSet = (StartSet)eResolveProxy(oldStartSet);
			if (startSet != oldStartSet) {
				InternalEObject newStartSet = (InternalEObject)startSet;
				NotificationChain msgs = oldStartSet.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculationPackage.CALCULATION_GRAPH__START_SET, null, null);
				if (newStartSet.eInternalContainer() == null) {
					msgs = newStartSet.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculationPackage.CALCULATION_GRAPH__START_SET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculationPackage.CALCULATION_GRAPH__START_SET, oldStartSet, startSet));
			}
		}
		return startSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StartSet basicGetStartSet() {
		return startSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartSet(StartSet newStartSet, NotificationChain msgs) {
		StartSet oldStartSet = startSet;
		startSet = newStartSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculationPackage.CALCULATION_GRAPH__START_SET, oldStartSet, newStartSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartSet(StartSet newStartSet) {
		if (newStartSet != startSet) {
			NotificationChain msgs = null;
			if (startSet != null)
				msgs = ((InternalEObject)startSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculationPackage.CALCULATION_GRAPH__START_SET, null, msgs);
			if (newStartSet != null)
				msgs = ((InternalEObject)newStartSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculationPackage.CALCULATION_GRAPH__START_SET, null, msgs);
			msgs = basicSetStartSet(newStartSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.CALCULATION_GRAPH__START_SET, newStartSet, newStartSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculationPackage.CALCULATION_GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case CalculationPackage.CALCULATION_GRAPH__START_SET:
				return basicSetStartSet(null, msgs);
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
			case CalculationPackage.CALCULATION_GRAPH__NODES:
				return getNodes();
			case CalculationPackage.CALCULATION_GRAPH__FIRST_NODE:
				if (resolve) return getFirstNode();
				return basicGetFirstNode();
			case CalculationPackage.CALCULATION_GRAPH__START_SET:
				if (resolve) return getStartSet();
				return basicGetStartSet();
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
			case CalculationPackage.CALCULATION_GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends AbstractNode>)newValue);
				return;
			case CalculationPackage.CALCULATION_GRAPH__FIRST_NODE:
				setFirstNode((AbstractNode)newValue);
				return;
			case CalculationPackage.CALCULATION_GRAPH__START_SET:
				setStartSet((StartSet)newValue);
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
			case CalculationPackage.CALCULATION_GRAPH__NODES:
				getNodes().clear();
				return;
			case CalculationPackage.CALCULATION_GRAPH__FIRST_NODE:
				setFirstNode((AbstractNode)null);
				return;
			case CalculationPackage.CALCULATION_GRAPH__START_SET:
				setStartSet((StartSet)null);
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
			case CalculationPackage.CALCULATION_GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case CalculationPackage.CALCULATION_GRAPH__FIRST_NODE:
				return firstNode != null;
			case CalculationPackage.CALCULATION_GRAPH__START_SET:
				return startSet != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Returns a reference to model object that contains element
	 * 
	 * @author sven.ziemer
	 * @param element is the object for which the containing model object will be found
	 * @return a reference to the model object containing element
	 * @generated not
	 */
	public Model getContainingModel(Element e) {
		if (e == null)
			return null;
		if (e instanceof Model)
			return (Model) e;
		return getContainingModel((Element) e.eContainer());
	}

	/**
	 * Returns the CalculationSpace of the Model that contains the component that the current calculationGraph does
	 * operate on.
	 * 
	 * @return CalculationSpace
	 * @generated not
	 */
	@Override
	public CalculationSpace getCalculationSpace() {

		Model model = getContainingModel(this);
		if (model == null) {
			return null;
		}

		for (QualifyingSpace space : model.getQualifyingSpaces()) {
			if (space instanceof CalculationSpace) {
				return (CalculationSpace) space;
			}
		}

		CalculationSpace calculationSpace = QualificationFactory.eINSTANCE.createCalculationSpace();
		model.getQualifyingSpaces().add(calculationSpace);

		return calculationSpace;
	}

	/**
	 * Returns a list with values containing all start values for determined parameters
	 * 
	 * @return List<Value>
	 * @Override
	 * @generated not
	 */

	public List<Value> getStartValues() {

		HashSet<MappableComponentInterface> mappables = getMappables();
		List<Value> startValues = new ArrayList<Value>();

		for (MappableComponentInterface mappable : mappables) {
			Value value = mappable.getValue();
			if (!CalculationHelper.isQualified(value)) {
				startValues.add(value);
			}
		}
		return startValues;
	}

	/**
	 * Returns all parameters mapped to calculations in this GalculationGraph
	 * 
	 * @return HashSet<Parameters>
	 * @generated not
	 */
	private HashSet<MappableComponentInterface> getMappables() {
		HashSet<MappableComponentInterface> result = new HashSet<MappableComponentInterface>();
		if (this.getFirstNode() == null) {
			return null;
		} else {
			AbstractNode currentNode = this.getFirstNode();
			while (currentNode != null) {
				if (currentNode instanceof Node) {
					Calculation calculation = (((Node) currentNode).getCalculation());
					Collection<MappableComponentInterface> mappables = calculation.getParameterMapping()
						.getInputMappables().values();

					for (MappableComponentInterface mappable : mappables) {
						result.add(mappable);
					}
					currentNode = ((Node) currentNode).getNextNode();
				} else if (currentNode instanceof ControlNode) {
					currentNode = ((ControlNode) currentNode).getNextTrue();
				}

			}

			return result;

		}

	}
} // CalculationGraphImpl
