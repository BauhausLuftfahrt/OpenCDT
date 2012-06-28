/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.resources.commands;

import java.net.URI;

import net.bhl.cdt.resources.ResourceDescriptor;
import net.bhl.cdt.resources.Resources;
import net.bhl.cdt.resources.ResourcesFactory;
import net.bhl.cdt.resources.StructuralData;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.datatypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * @author Martin Glas <martin.glas@bauhaus-luftfahrt.net>
 * @version 2010.0611
 * @since 1.6
 */
public class InsertFileResourceCommand extends CDTCommand {
	/**
	 * This variable is a reference to the target model.
	 */
	private Resources resources;
	/**
	 * This variable contains the labeling name of the Configuration which will
	 * be inserted.
	 */
	private String name;
	/**
	 * This variable contains the Parameters which will be generated in the
	 * Configuration.
	 */
	private EList<DataType> dataTypes;
	private URI uri;

	/**
	 * @param uri
	 *            The URI of the imported file.
	 * @param targetResources
	 *            The Model in which the Configuration will be inserted in
	 * @param fileName
	 *            The name of the new Configuration
	 * @param importedExchangeElements
	 *            A list of Elements which will should be imported as new
	 *            Configuration
	 */

	public InsertFileResourceCommand(final Resources targetResources,
			String fileName, URI uri, EList<DataType> importedDataType) {
		super();
		this.resources = targetResources;
		this.name = fileName;
		this.dataTypes = importedDataType;
		this.uri = uri;
	}

	/**
	 * This method is the executes the command.
	 */
	@Override
	protected void doRun() {
		// TODO If Configuration with that name already exists do not crate a
		// new one

		ResourceDescriptor newResourceDescriptor = ResourcesFactory.eINSTANCE
				.createResourceDescriptor();

		// Set the name of the Configuration
		newResourceDescriptor.setName(name);
		// Set the URI of the File Resource
		newResourceDescriptor.setURI(uri.toString());

		// attach importedElements to the resourceDescriptor
		StructuralData structuralData = ResourcesFactory.eINSTANCE
				.createStructuralData();

		structuralData.getModelElements().addAll(dataTypes);
		newResourceDescriptor.setStructrualData(structuralData);
		// newResourceDescriptor.getStructrualData().getModelElements().addAll(exchangeElements);

		// attach the new Configuration to the model
		resources.getResources().add(newResourceDescriptor);

	}
}
