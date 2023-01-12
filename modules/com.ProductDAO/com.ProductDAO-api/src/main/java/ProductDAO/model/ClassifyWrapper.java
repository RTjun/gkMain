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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Classify}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Classify
 * @generated
 */
public class ClassifyWrapper
	extends BaseModelWrapper<Classify>
	implements Classify, ModelWrapper<Classify> {

	public ClassifyWrapper(Classify classify) {
		super(classify);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ClassifyId", getClassifyId());
		attributes.put("classifyName", getClassifyName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ClassifyId = (Long)attributes.get("ClassifyId");

		if (ClassifyId != null) {
			setClassifyId(ClassifyId);
		}

		String classifyName = (String)attributes.get("classifyName");

		if (classifyName != null) {
			setClassifyName(classifyName);
		}
	}

	@Override
	public Classify cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the classify ID of this classify.
	 *
	 * @return the classify ID of this classify
	 */
	@Override
	public long getClassifyId() {
		return model.getClassifyId();
	}

	/**
	 * Returns the classify name of this classify.
	 *
	 * @return the classify name of this classify
	 */
	@Override
	public String getClassifyName() {
		return model.getClassifyName();
	}

	/**
	 * Returns the primary key of this classify.
	 *
	 * @return the primary key of this classify
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the classify ID of this classify.
	 *
	 * @param ClassifyId the classify ID of this classify
	 */
	@Override
	public void setClassifyId(long ClassifyId) {
		model.setClassifyId(ClassifyId);
	}

	/**
	 * Sets the classify name of this classify.
	 *
	 * @param classifyName the classify name of this classify
	 */
	@Override
	public void setClassifyName(String classifyName) {
		model.setClassifyName(classifyName);
	}

	/**
	 * Sets the primary key of this classify.
	 *
	 * @param primaryKey the primary key of this classify
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected ClassifyWrapper wrap(Classify classify) {
		return new ClassifyWrapper(classify);
	}

}