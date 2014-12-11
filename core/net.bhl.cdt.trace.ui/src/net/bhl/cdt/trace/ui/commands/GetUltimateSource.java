/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.trace.ui.commands;

import net.bhl.cdt.connector.avl.AVL;
import net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator;
import net.bhl.cdt.connector.avl.avlmodel.AVLSection;
import net.bhl.cdt.connector.avl.avlmodel.AVLSurface;
import net.bhl.cdt.connector.avl.avlmodel.SufaceAngle;
import net.bhl.cdt.connector.avl.avlmodel.YDuplicate;
import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter;
import net.bhl.cdt.connector.avl.avlprocess.VariableSweep;
import net.bhl.cdt.connector.matlab.tornado.Tornado;
import net.bhl.cdt.connector.matlab.tornado.TornadoGeometry;
import net.bhl.cdt.connector.matlab.tornado.TornadoState;
import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.OperationWithOutput;
import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.process.designoperations.Assumption;
import net.bhl.cdt.trace.ui.lists.SafeList;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;

/**
 * This command retrieves the ultimate source operation of a given model element.
 * 
 * @author martin.glas
 */
public class GetUltimateSource extends AbstractCommand {

	private EObject element;
	private Shell shell;
	// Helps avoiding loops
	private SafeList<Object> alreadyVisited = new SafeList<Object>();

	/**
	 * This is the constructor of the command.
	 * 
	 * @param element the model element
	 * @param shell the current Shell
	 */
	public GetUltimateSource(EObject element, Shell shell) {
		this.element = element;
		setShell(shell);

	}

	private void setShell(Shell shell) {
		this.shell = shell;

	}

	@Override
	public void execute() {
		SafeList<OperationWithOutput> ultimateSourceOperations = getAllUltimateSourceOperations(element);

		ListDialog listDialog = new ListDialog(getShell());

		listDialog.setLabelProvider(new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE)));

		listDialog.setContentProvider(new AdapterFactoryContentProvider(new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE)) {
			@Override
			public Object[] getElements(Object object) {
				if (object instanceof Object[]) {
					return (Object[]) object;
				}
				return super.getElements(object);
			}
		});

		listDialog.setInput(ultimateSourceOperations.toList().toArray());

		listDialog.setTitle("Contributing Operations");
		listDialog.open();
		// for (OperationWithOutput operationWithOutput : ultimateSourceOperations) {

		// if (operationWithOutput instanceof NamedElement) {
		// ultimateSourceDescriptor = ((NamedElement) operationWithOutput).getName();
		// if (operationWithOutput instanceof FileParser) {
		// ultimateSourceDescriptor = ultimateSourceDescriptor
		// + (": " + ((FileParser) operationWithOutput).getFileURL());
		// } else {
		// System.out.println();
		// }
		// } else {
		// ultimateSourceDescriptor = "Anonmous Generator";
		// }
		// System.out.println(ultimateSourceDescriptor);
		// MessageDialog.openInformation(shell, "The ulimate source", ultimateSourceDescriptor);
		// }

	}

	/**
	 * Get the Ultimate Source of AVL considering the AVLProcessGenerator VariableSweeps and AVLModelGenerators
	 * References to a GeneratableElement.
	 * 
	 * @param avl
	 * @return
	 */
	private SafeList<OperationWithOutput> getAVLUltimateSourceOperations(AVL avl) {
		SafeList<OperationWithOutput> ultimateSourceOperations = new SafeList<OperationWithOutput>();
		for (EObject avlContent : avl.eContents()) {
			if (avlContent instanceof AVLProcessGenerator || avlContent instanceof AVLModelGenerator) {
				ultimateSourceOperations.safeAddAll(getAllUltimateSourceOperations(avlContent));
			}
		}
		return ultimateSourceOperations;
	}

	/**
	 * Get UltimateSourceOperations for all References of an eObject to a GeneratableElement.
	 * 
	 * @param eObject
	 * @return
	 */
	private SafeList<OperationWithOutput> getContentsUltimateSourceOperations(EObject eObject) {
		SafeList<OperationWithOutput> ultimateSourceOperations = new SafeList<OperationWithOutput>();
		EList<EReference> references = eObject.eClass().getEAllReferences();
		for (EReference reference : references) {
			Object value = eObject.eGet(reference);
			if (value instanceof GeneratableElement) {
				ultimateSourceOperations.safeAddAll(getAllUltimateSourceOperations((GeneratableElement) value));
			}
		}
		return ultimateSourceOperations;
	}

	private SafeList<OperationWithOutput> getAllUltimateSourceOperations(EObject element) {
		SafeList<OperationWithOutput> ultimateSourceOperations = new SafeList<OperationWithOutput>();

		if (element instanceof GeneratableElement) {
			ultimateSourceOperations = getUltimateSourceOperation((GeneratableElement) element);
		}

		EObject container = element.eContainer();

		if (container instanceof Assumption) {
			if (alreadyVisited.safeAdd(container)) {
				ultimateSourceOperations.safeAdd((OperationWithOutput) container);
			}
		}

		if (container instanceof AVLResultImporter && container.eContainer() != null
			&& container.eContainer().eContainer() instanceof AVL) {
			if (alreadyVisited.safeAdd(container)) {
				ultimateSourceOperations.safeAddAll(getAVLUltimateSourceOperations((AVL) container.eContainer()
					.eContainer()));
			}
		}

		if (element instanceof AVLSurface || element instanceof AVLModelGenerator
			|| element instanceof AVLProcessGenerator) {
			if (alreadyVisited.safeAdd(element)) {
				for (EObject component : element.eContents()) {
					ultimateSourceOperations.safeAddAll(getAllUltimateSourceOperations(component));
				}
			}
		}

		if (element instanceof VariableSweep || element instanceof SufaceAngle || element instanceof AVLSection
			|| element instanceof YDuplicate) {
			if (alreadyVisited.safeAdd(element)) {
				ultimateSourceOperations.safeAddAll(getContentsUltimateSourceOperations(element));
			}
		}

		if (container instanceof Tornado) {
			if (alreadyVisited.safeAdd(container)) {
				for (EObject tornadoContent : container.eContents()) {
					if (tornadoContent instanceof TornadoGeometry || tornadoContent instanceof TornadoState) {
						ultimateSourceOperations.safeAddAll(getContentsUltimateSourceOperations(tornadoContent));
					}
				}
			}
		}

		if (element instanceof OperationWithInput) {
			for (ProcessableElement processedElement : ((OperationWithInput) element).getProcessedElements()) {
				if (processedElement instanceof GeneratableElement) {
					ultimateSourceOperations
						.safeAddAll(getAllUltimateSourceOperations((GeneratableElement) processedElement));
				}
			}
		}

		return ultimateSourceOperations;
	}

	private Shell getShell() {

		return this.shell;
	}

	private SafeList<OperationWithOutput> getUltimateSourceOperation(GeneratableElement generatableElement) {
		SafeList<OperationWithOutput> ultimateSourceOperations = new SafeList<OperationWithOutput>();
		OperationWithOutput sourceOperation = generatableElement.getSourceOperation();
		if (sourceOperation != null) {
			if (sourceOperation instanceof OperationWithInput) {
				for (ProcessableElement inputElement : ((OperationWithInput) sourceOperation).getProcessedElements()) {
					if (inputElement instanceof GeneratableElement) {
						ultimateSourceOperations
							.safeAddAll(getUltimateSourceOperation((GeneratableElement) inputElement));
					}
				}
			} else {
				ultimateSourceOperations.safeAdd(sourceOperation);
			}
		}

		return ultimateSourceOperations;
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub

	}

}
