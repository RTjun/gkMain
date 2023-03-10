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

package ProductDAO.model.impl;

import ProductDAO.model.Classify;
import ProductDAO.model.ClassifyModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Classify service. Represents a row in the &quot;GK_Classify&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ClassifyModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ClassifyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClassifyImpl
 * @generated
 */
@JSON(strict = true)
public class ClassifyModelImpl
	extends BaseModelImpl<Classify> implements ClassifyModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a classify model instance should use the <code>Classify</code> interface instead.
	 */
	public static final String TABLE_NAME = "GK_Classify";

	public static final Object[][] TABLE_COLUMNS = {
		{"ClassifyId", Types.BIGINT}, {"classifyName", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("ClassifyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("classifyName", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table GK_Classify (ClassifyId LONG not null primary key,classifyName VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table GK_Classify";

	public static final String ORDER_BY_JPQL =
		" ORDER BY classify.ClassifyId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY GK_Classify.ClassifyId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CLASSIFYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public ClassifyModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ClassifyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setClassifyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ClassifyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Classify.class;
	}

	@Override
	public String getModelClassName() {
		return Classify.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Classify, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Classify, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Classify, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Classify)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Classify, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Classify, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Classify)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Classify, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Classify, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Classify, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Classify, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Classify, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Classify, Object>>();
		Map<String, BiConsumer<Classify, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Classify, ?>>();

		attributeGetterFunctions.put("ClassifyId", Classify::getClassifyId);
		attributeSetterBiConsumers.put(
			"ClassifyId", (BiConsumer<Classify, Long>)Classify::setClassifyId);
		attributeGetterFunctions.put("classifyName", Classify::getClassifyName);
		attributeSetterBiConsumers.put(
			"classifyName",
			(BiConsumer<Classify, String>)Classify::setClassifyName);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getClassifyId() {
		return _ClassifyId;
	}

	@Override
	public void setClassifyId(long ClassifyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ClassifyId = ClassifyId;
	}

	@JSON
	@Override
	public String getClassifyName() {
		if (_classifyName == null) {
			return "";
		}
		else {
			return _classifyName;
		}
	}

	@Override
	public void setClassifyName(String classifyName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_classifyName = classifyName;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Classify.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Classify toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Classify>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ClassifyImpl classifyImpl = new ClassifyImpl();

		classifyImpl.setClassifyId(getClassifyId());
		classifyImpl.setClassifyName(getClassifyName());

		classifyImpl.resetOriginalValues();

		return classifyImpl;
	}

	@Override
	public Classify cloneWithOriginalValues() {
		ClassifyImpl classifyImpl = new ClassifyImpl();

		classifyImpl.setClassifyId(
			this.<Long>getColumnOriginalValue("ClassifyId"));
		classifyImpl.setClassifyName(
			this.<String>getColumnOriginalValue("classifyName"));

		return classifyImpl;
	}

	@Override
	public int compareTo(Classify classify) {
		long primaryKey = classify.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Classify)) {
			return false;
		}

		Classify classify = (Classify)object;

		long primaryKey = classify.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Classify> toCacheModel() {
		ClassifyCacheModel classifyCacheModel = new ClassifyCacheModel();

		classifyCacheModel.ClassifyId = getClassifyId();

		classifyCacheModel.classifyName = getClassifyName();

		String classifyName = classifyCacheModel.classifyName;

		if ((classifyName != null) && (classifyName.length() == 0)) {
			classifyCacheModel.classifyName = null;
		}

		return classifyCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Classify, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Classify, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Classify, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Classify)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Classify, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Classify, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Classify, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Classify)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Classify>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Classify.class, ModelWrapper.class);

	}

	private long _ClassifyId;
	private String _classifyName;

	public <T> T getColumnValue(String columnName) {
		Function<Classify, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Classify)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("ClassifyId", _ClassifyId);
		_columnOriginalValues.put("classifyName", _classifyName);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("ClassifyId", 1L);

		columnBitmasks.put("classifyName", 2L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Classify _escapedModel;

}