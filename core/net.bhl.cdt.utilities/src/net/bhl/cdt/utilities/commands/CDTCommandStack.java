/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * 
 */
package net.bhl.cdt.utilities.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.operations.DefaultOperationHistory;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.UndoContext;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.emfstore.client.model.changeTracking.commands.CommandObserver;
import org.eclipse.emf.emfstore.client.model.changeTracking.commands.EMFStoreCommandStack;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.transaction.impl.TransactionalCommandStackImpl;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;

/**
 * The command stack for the editing domain. This class implements the EMFStoreCommandStack and the
 * IWorkspaceCommandStack for handling both "worlds".
 * 
 * @author Michael Kagel
 */
public class CDTCommandStack extends TransactionalCommandStackImpl implements EMFStoreCommandStack,
	IWorkspaceCommandStack {

	private Object currentCommand;

	private List<CommandObserver> commandObservers;

	/**
	 * Dafault Constructor.
	 */
	public CDTCommandStack() {
		commandObservers = new ArrayList<CommandObserver>();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.transaction.impl.AbstractTransactionalCommandStack#basicExecute(org.eclipse.emf.common.command.Command)
	 */
	@Override
	protected void basicExecute(Command command) {
		// Notify about the command started!
		// check if we are already inside of a command, if not then notify.
		if (currentCommand == null) {
			currentCommand = command;
			notifiyListenersAboutStart(command);
		}

		try {
			super.basicExecute(command);
		} catch (OperationCanceledException e) {
			this.notifiyListenersAboutCommandFailed(command, e);
			this.currentCommand = null;
			throw e;
		}
		// Notify someone that the command is done.
		// Check if we are really at the end of the most outer command.
		if (currentCommand == command) {
			// check again if command was really completed.
			if (mostRecentCommand == command) {
				this.notifiyListenersAboutCommandCompleted(command);
			}
			currentCommand = null;
		}
	}

	private void notifiyListenersAboutStart(Command command) {
		for (CommandObserver commandObservers : this.commandObservers) {
			try {
				commandObservers.commandStarted(command);
				// BEGIN SUPRESS CATCH EXCEPTION
			} catch (RuntimeException e) {
				// END SUPRESS CATCH EXCEPTION
				ModelUtil.logWarning("Command Observer threw exception", e);
			}
		}
	}

	private void notifiyListenersAboutCommandFailed(Command command, OperationCanceledException exception) {
		for (CommandObserver commandObservers : this.commandObservers) {
			try {
				commandObservers.commandFailed(command, exception);
				// BEGIN SUPRESS CATCH EXCEPTION
			} catch (RuntimeException e) {
				// END SUPRESS CATCH EXCEPTION
				ModelUtil.logWarning("Command Observer threw exception", e);
			}
		}
	}

	private void notifiyListenersAboutCommandCompleted(Command command) {
		for (CommandObserver commandObservers : this.commandObservers) {
			try {
				commandObservers.commandCompleted(command);
				// BEGIN SUPRESS CATCH EXCEPTION
			} catch (RuntimeException e) {
				// END SUPRESS CATCH EXCEPTION
				ModelUtil.logWarning("Command Observer threw exception", e);
			}
		}
	}

	/**
	 * Add a command stack observer.
	 * 
	 * @param observer the observer
	 */
	public void addCommandStackObserver(CommandObserver observer) {
		commandObservers.add(observer);
	}

	/**
	 * Remove COmmand stack observer.
	 * 
	 * @param observer the observer
	 */
	public void removeCommandStackObserver(CommandObserver observer) {
		commandObservers.remove(observer);
	}

	/**
	 * Returns a undo context.
	 * 
	 * @return undo context
	 */
	public IUndoContext getDefaultUndoContext() {
		// TODO Auto-generated method stub
		return new UndoContext();
	}

	/**
	 * Returns the operation history.
	 * 
	 * @return operation history
	 */
	public IOperationHistory getOperationHistory() {
		// TODO Auto-generated method stub
		return new DefaultOperationHistory();
	}

}
