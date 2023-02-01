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
 * This class is a wrapper for {@link Norm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Norm
 * @generated
 */
public class NormWrapper
	extends BaseModelWrapper<Norm> implements ModelWrapper<Norm>, Norm {

	public NormWrapper(Norm norm) {
		super(norm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("NormId", getNormId());
		attributes.put("normName", getNormName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long NormId = (Long)attributes.get("NormId");

		if (NormId != null) {
			setNormId(NormId);
		}

		String normName = (String)attributes.get("normName");

		if (normName != null) {
			setNormName(normName);
		}
	}

	@Override
	public Norm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the norm ID of this norm.
	 *
	 * @return the norm ID of this norm
	 */
	@Override
	public long getNormId() {
		return model.getNormId();
	}

	/**
	 * Returns the norm name of this norm.
	 *
	 * @return the norm name of this norm
	 */
	@Override
	public String getNormName() {
		return model.getNormName();
	}

	/**
	 * Returns the primary key of this norm.
	 *
	 * @return the primary key of this norm
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
	 * Sets the norm ID of this norm.
	 *
	 * @param NormId the norm ID of this norm
	 */
	@Override
	public void setNormId(long NormId) {
		model.setNormId(NormId);
	}

	/**
	 * Sets the norm name of this norm.
	 *
	 * @param normName the norm name of this norm
	 */
	@Override
	public void setNormName(String normName) {
		model.setNormName(normName);
	}

	/**
	 * Sets the primary key of this norm.
	 *
	 * @param primaryKey the primary key of this norm
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected NormWrapper wrap(Norm norm) {
		return new NormWrapper(norm);
	}

}