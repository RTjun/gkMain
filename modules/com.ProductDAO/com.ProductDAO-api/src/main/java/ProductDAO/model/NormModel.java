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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Norm service. Represents a row in the &quot;GK_Norm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>ProductDAO.model.impl.NormModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>ProductDAO.model.impl.NormImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Norm
 * @generated
 */
@ProviderType
public interface NormModel extends BaseModel<Norm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a norm model instance should use the {@link Norm} interface instead.
	 */

	/**
	 * Returns the primary key of this norm.
	 *
	 * @return the primary key of this norm
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this norm.
	 *
	 * @param primaryKey the primary key of this norm
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the norm ID of this norm.
	 *
	 * @return the norm ID of this norm
	 */
	public long getNormId();

	/**
	 * Sets the norm ID of this norm.
	 *
	 * @param NormId the norm ID of this norm
	 */
	public void setNormId(long NormId);

	/**
	 * Returns the norm name of this norm.
	 *
	 * @return the norm name of this norm
	 */
	@AutoEscape
	public String getNormName();

	/**
	 * Sets the norm name of this norm.
	 *
	 * @param normName the norm name of this norm
	 */
	public void setNormName(String normName);

	@Override
	public Norm cloneWithOriginalValues();

}