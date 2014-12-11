/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.trace.ui.commands;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.ProcessableElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.internal.server.model.versioning.HistoryInfo;

/**
 * This is a Helper class for the GetContriutingUsersCommand.
 * 
 * @author martin.glas
 */
@SuppressWarnings("restriction")
public final class GetContributingUsersHelper {
	private GetContributingUsersHelper() {

	}

	/**
	 * Get all contributing elements for a given list of elements (elementsToDo). Avoids duplicates.
	 * 
	 * @param elementsDone Elements that are already processed
	 * @param elementsToDo Elements for which other contributing elements have to be Fount
	 * @return the list of contributing users
	 */
	static List<EObject> getAllContributingElements(List<EObject> elementsDone, List<EObject> elementsToDo) {
		List<EObject> firstBuffer = new LinkedList<EObject>();
		List<EObject> secondBuffer = new LinkedList<EObject>();
		if (elementsToDo.isEmpty()) {
			return elementsDone;
		}
		elementsDone.addAll(elementsToDo);
		for (EObject elementToDo : elementsToDo) {
			if (elementToDo instanceof GeneratableElement) {
				firstBuffer = getContributingElements(elementsDone, (GeneratableElement) elementToDo);
			}
			for (EObject obj : firstBuffer) {
				if (!secondBuffer.contains(obj)) {
					secondBuffer.add(obj);
				}
			}
		}
		return getAllContributingElements(elementsDone, secondBuffer);
	}

	/**
	 * Get the directly contributing elements for one given element.
	 * 
	 * @param elements Control list to avoid duplicates.
	 * @param element The element.
	 * @return List of contributing elements.
	 */
	private static List<EObject> getContributingElements(List<EObject> elements, GeneratableElement element) {
		List<EObject> result = new LinkedList<EObject>();
		EObject sourceOperation = element.getSourceOperation();
		// add sourceOperation
		if (sourceOperation != null && !elements.contains(sourceOperation)) {
			result.add(sourceOperation);
		}
		// add inputElements
		if (sourceOperation instanceof OperationWithInput) {
			System.err.println("With Input");
			for (ProcessableElement inputElement : ((OperationWithInput) sourceOperation).getProcessedElements()) {
				if (inputElement instanceof GeneratableElement && !elements.contains(inputElement)) {
					result.add(inputElement);
				}
			}
		}
		return result;
	}

	/**
	 * Get the author of the last commit to an emfServer for a given Element ({@link #modelElement}).
	 * 
	 * @param infos a list of HistoryInfos
	 * @return returns the name of the last author of an EObject
	 */
	static String getLastAuthor(List<HistoryInfo> infos) {
		Iterator<HistoryInfo> iterator = infos.iterator();
		HistoryInfo last = null;
		if (iterator.hasNext()) {
			last = iterator.next();
			if (iterator.hasNext()) {
				last = iterator.next();
				if (last.getLogMessage() != null) {
					return last.getLogMessage().getAuthor();
				}
			}
		}
		return "unknown";
	}

}
