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

import java.sql.Types;

/**
 * The table class for the &quot;GK_GKDetail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see GKDetail
 * @generated
 */
public class GKDetailTable extends BaseTable<GKDetailTable> {

	public static final GKDetailTable INSTANCE = new GKDetailTable();

	public final Column<GKDetailTable, Long> GKDetailId = createColumn(
		"GKDetailId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<GKDetailTable, String> GKnumber = createColumn(
		"GKnumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GKDetailTable, String> norm = createColumn(
		"norm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GKDetailTable, String> GKName = createColumn(
		"GKName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GKDetailTable, String> preOrder = createColumn(
		"preOrder", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GKDetailTable, String> GKComponent = createColumn(
		"GKComponent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GKDetailTable, String> freight = createColumn(
		"freight", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GKDetailTable, Integer> price = createColumn(
		"price", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<GKDetailTable, String> team = createColumn(
		"team", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GKDetailTable, String> remark = createColumn(
		"remark", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GKDetailTable, String> imageName = createColumn(
		"imageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GKDetailTable, Integer> total = createColumn(
		"total", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private GKDetailTable() {
		super("GK_GKDetail", GKDetailTable::new);
	}

}