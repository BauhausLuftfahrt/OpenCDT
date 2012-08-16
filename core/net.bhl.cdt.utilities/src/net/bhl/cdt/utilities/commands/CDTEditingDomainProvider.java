/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * 
 */
package net.bhl.cdt.utilities.commands;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.emfstore.client.model.util.EditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl.FactoryImpl;

/**
 * This class implements the ecp EditingDomainProvider interface for providing a CDT own editing domain. This domain
 * contains the CDTCommandStack.
 * 
 * @author Michael Kagel
 */
public class CDTEditingDomainProvider implements EditingDomainProvider {

	private static final String TRANSACTIONAL_EDITINGDOMAIN_ID = "net.bhl.cdt.utilities.commands.EditingDomain";

	/**
	 * Returns the editing domain for the given resource set.
	 * 
	 * @param resourceSet The resource set for which a editing domain should be created
	 * @return The editing domain for the given resource set.
	 */
	public EditingDomain getEditingDomain(ResourceSet resourceSet) {
		TransactionalEditingDomain domain = new TransactionalEditingDomainImpl(new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE), new CDTCommandStack(), resourceSet);
		((FactoryImpl) TransactionalEditingDomain.Factory.INSTANCE).mapResourceSet(domain);
		TransactionalEditingDomain.Registry.INSTANCE.add(TRANSACTIONAL_EDITINGDOMAIN_ID, domain);
		domain.setID(TRANSACTIONAL_EDITINGDOMAIN_ID);
		return domain;
	}
}
