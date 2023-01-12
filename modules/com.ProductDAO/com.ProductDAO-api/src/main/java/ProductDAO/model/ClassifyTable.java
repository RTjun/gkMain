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
 * The table class for the &quot;GK_Classify&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Classify
 * @generated
 */
public class ClassifyTable extends BaseTable<ClassifyTable> {

	public static final ClassifyTable INSTANCE = new ClassifyTable();

	public final Column<ClassifyTable, Long> ClassifyId = createColumn(
		"ClassifyId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ClassifyTable, String> classifyName = createColumn(
		"classifyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ClassifyTable() {
		super("GK_Classify", ClassifyTable::new);
	}

}