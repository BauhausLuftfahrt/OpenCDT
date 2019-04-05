/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.core.model;

import java.time.LocalDateTime;

import net.bhl.cdt.util.constants.StringConstants;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-07
 *
 */
public final class CDTMetaModelManager {

	private static CDTMetaModelManager instance;

	public static CDTMetaModelManager getInstance() {
		if (instance == null)
			instance = new CDTMetaModelManager();

		return instance;
	}

	private CDTMetaModelManager() {
	}

//    public void initializeAIdentifiableItem(AIdentifiableItem item) {
//	item.setId(generateDateTimeID());
//    }

	private int lastGeneratedID;

	private String generateDateTimeID() {
		StringBuilder builder = new StringBuilder();

		LocalDateTime now = LocalDateTime.now();

		builder.append(now.getYear());
		builder.append(now.getMonth());
		builder.append(now.getDayOfMonth());
		builder.append(now.getHour());
		builder.append(now.getMinute());
		builder.append(now.getSecond());

		String id = builder.toString();

		int checkInt = Integer.parseUnsignedInt(id);

		if (checkInt == lastGeneratedID) {
			checkInt = checkInt + 1;
			id = checkInt + StringConstants.EMPTY;
		}

		lastGeneratedID = checkInt;

		return id;
	}
}
