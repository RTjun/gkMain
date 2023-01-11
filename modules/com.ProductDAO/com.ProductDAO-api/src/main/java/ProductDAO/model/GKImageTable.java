/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ProductDAO.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Clob;
import java.sql.Types;

/**
 * The table class for the &quot;GK_GKImage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see GKImage
 * @generated
 */
public class GKImageTable extends BaseTable<GKImageTable> {

	public static final GKImageTable INSTANCE = new GKImageTable();

	public final Column<GKImageTable, Long> GKImageId = createColumn(
		"GKImageId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<GKImageTable, Long> GKDetailId = createColumn(
		"GKDetailId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GKImageTable, String> imageName = createColumn(
		"imageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GKImageTable, Clob> imageData = createColumn(
		"imageData", Clob.class, Types.CLOB, Column.FLAG_DEFAULT);
	public final Column<GKImageTable, String> mimeType = createColumn(
		"mimeType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private GKImageTable() {
		super("GK_GKImage", GKImageTable::new);
	}

}