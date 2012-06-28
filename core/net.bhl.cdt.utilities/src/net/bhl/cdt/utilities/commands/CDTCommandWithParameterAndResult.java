/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.utilities.commands;

import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommandWithParameterAndResult;

/**
 * @see UnicaseCommandWithParameterAndResult
 * @author Michael Kagel
 * @param <T> result type
 * @param <U> parameter type
 */
public abstract class CDTCommandWithParameterAndResult<T, U> extends EMFStoreCommandWithParameterAndResult<T, U> {
}
