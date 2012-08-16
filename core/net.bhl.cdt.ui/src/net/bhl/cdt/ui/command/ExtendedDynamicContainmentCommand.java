/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.common.handler.CreateContainmentHandler;
import org.eclipse.emf.ecp.common.model.ECPWorkspaceManager;
import org.eclipse.emf.ecp.common.model.NoWorkspaceException;
import org.eclipse.emf.ecp.common.model.workSpaceModel.ECPWorkspace;
import org.eclipse.emf.ecp.common.util.UiUtil;
import org.eclipse.emf.ecp.navigator.commands.DynamicContainmentCommands;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.common.CommonUtil;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;

/**
 * This class replaces the DynamicContainmentCommand class of the ecp framework.
 * The additonal function is the handling of a multiplicity one reference in the
 * createCommand method, everything else is copied from the unicase class.
 * 
 * @author Michael Kagel
 */
public class ExtendedDynamicContainmentCommand extends
		DynamicContainmentCommands {

	private static AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE));

	private static final String COMMAND_ID = "org.eclipse.emf.ecp.navigator.createContaiment";
	private EObject selectedME;

	/**
	 * . {@inheritDoc}
	 */
	@Override
	protected IContributionItem[] getContributionItems() {

		// 1. get selected EObject
		selectedME = UiUtil.getSelectedEObject();
		if (selectedME == null) {
			return new IContributionItem[0];
		}
		if (selectedME instanceof ProjectSpace) {
			return new IContributionItem[0];
		}

		// 2. get its containments
		Set<EClass> eClazz = CommonUtil
				.getAllEContainments(selectedME.eClass());
		if (eClazz.size() > 5) {
			return new IContributionItem[0];
		}

		// 3. create commands for these containments
		List<EReference> containments = selectedME.eClass()
				.getEAllContainments();
		IContributionItem[] commands = createCommands(containments);
		return commands;
	}

	/**
	 * .
	 * 
	 * @param containments
	 *            a list of EReference of containments of selected ME
	 * @return an array of IContributionsItem (commands) to create different
	 *         types of containments.
	 */
	private IContributionItem[] createCommands(List<EReference> containments) {

		List<IContributionItem> commands = new ArrayList<IContributionItem>();

		// every command takes its corresponding EClass type as parameter
		for (EReference containment : containments) {
			if (containment.isMany()) {
				continue;
			}

			// do not create any commands for containments with multiplicity one
			boolean contained = false;
			EList<EObject> eContents = selectedME.eContents();

			for (EObject eObject : eContents) {
				EClass contentEClass = eObject.eClass();
				EClass containmentEClass = containment.getEReferenceType();
				if (contentEClass.equals(containmentEClass)) {
					contained = true;
					break;
				}
			}

			if (contained) {
				continue;
			}

			// do not create any command for NonDomainElement types

			try {
				ECPWorkspace workSpace = ECPWorkspaceManager.getInstance()
						.getWorkSpace();
				if (workSpace.getProject(selectedME)
						.getMetaModelElementContext()
						.isNonDomainElement(containment.getEReferenceType())) {
					continue;
				}
			} catch (NoWorkspaceException e) {
				e.printStackTrace();
			}

			// if containment type is abstract, create a list of
			// commands for its subclasses
			if (containment.getEReferenceType().isAbstract()
					|| containment.getEReferenceType().isInterface()) {

				// note that a reference of commands array is passed,
				// corresponding commands are created and added to it,
				// then continue
				// TODO: fix
				addCommandsForSubTypes(containment.getEReferenceType(),
						commands);
				continue;
			}

			CommandContributionItemParameter commandParam = new CommandContributionItemParameter(
					PlatformUI.getWorkbench(), null, COMMAND_ID,
					CommandContributionItem.STYLE_PUSH);

			Map<Object, Object> commandParams = new HashMap<Object, Object>();

			commandParams.put(CreateContainmentHandler.COMMAND_ECLASS_PARAM,
					containment.getEReferenceType());
			commandParam.label = "New "
					+ containment.getEReferenceType().getName();
			commandParam.icon = getImage(containment.getEReferenceType());

			// create command
			commandParam.parameters = commandParams;
			CommandContributionItem command = new CommandContributionItem(
					commandParam);
			commands.add(command);
		}

		return commands.toArray(new IContributionItem[commands.size()]);

	}

	private ImageDescriptor getImage(EClass eClass) {
		EObject instance = (EObject) eClass.getEPackage().getEFactoryInstance()
				.create(eClass);
		Image image = labelProvider.getImage(instance);
		ImageDescriptor imageDescriptor = ImageDescriptor
				.createFromImage(image);
		return imageDescriptor;
	}

	/**
	 * If reference type is abstract create commands for its subclasses.
	 * 
	 * @param refClass
	 * @param commands
	 */
	private void addCommandsForSubTypes(EClass refClass,
			List<IContributionItem> commands) {

		// // do not create commands for subclasses of ModelElement
		// if (refClass.equals(MetamodelPackage.eINSTANCE.getModelElement())) {
		// return;
		// }

		Set<EClass> eClazz = CommonUtil.getAllSubEClasses(refClass);
		eClazz.remove(refClass);
		for (EClass eClass : eClazz) {
			CommandContributionItemParameter commandParam = new CommandContributionItemParameter(
					PlatformUI.getWorkbench(), null, COMMAND_ID,
					CommandContributionItem.STYLE_PUSH);

			Map<Object, Object> commandParams = new HashMap<Object, Object>();
			commandParams.put(CreateContainmentHandler.COMMAND_ECLASS_PARAM,
					eClass);
			commandParam.label = "New " + eClass.getName();
			commandParam.icon = getImage(eClass);

			// create command
			commandParam.parameters = commandParams;
			CommandContributionItem command = new CommandContributionItem(
					commandParam);
			commands.add(command);
		}

	}
}
