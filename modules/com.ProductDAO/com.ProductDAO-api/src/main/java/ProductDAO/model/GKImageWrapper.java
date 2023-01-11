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
 * This class is a wrapper for {@link GKImage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GKImage
 * @generated
 */
public class GKImageWrapper
	extends BaseModelWrapper<GKImage>
	implements GKImage, ModelWrapper<GKImage> {

	public GKImageWrapper(GKImage gkImage) {
		super(gkImage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("GKImageId", getGKImageId());
		attributes.put("GKDetailId", getGKDetailId());
		attributes.put("imageName", getImageName());
		attributes.put("imageData", getImageData());
		attributes.put("mimeType", getMimeType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long GKImageId = (Long)attributes.get("GKImageId");

		if (GKImageId != null) {
			setGKImageId(GKImageId);
		}

		Long GKDetailId = (Long)attributes.get("GKDetailId");

		if (GKDetailId != null) {
			setGKDetailId(GKDetailId);
		}

		String imageName = (String)attributes.get("imageName");

		if (imageName != null) {
			setImageName(imageName);
		}

		String imageData = (String)attributes.get("imageData");

		if (imageData != null) {
			setImageData(imageData);
		}

		String mimeType = (String)attributes.get("mimeType");

		if (mimeType != null) {
			setMimeType(mimeType);
		}
	}

	@Override
	public GKImage cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the gk detail ID of this gk image.
	 *
	 * @return the gk detail ID of this gk image
	 */
	@Override
	public long getGKDetailId() {
		return model.getGKDetailId();
	}

	/**
	 * Returns the gk image ID of this gk image.
	 *
	 * @return the gk image ID of this gk image
	 */
	@Override
	public long getGKImageId() {
		return model.getGKImageId();
	}

	/**
	 * Returns the image data of this gk image.
	 *
	 * @return the image data of this gk image
	 */
	@Override
	public String getImageData() {
		return model.getImageData();
	}

	/**
	 * Returns the image name of this gk image.
	 *
	 * @return the image name of this gk image
	 */
	@Override
	public String getImageName() {
		return model.getImageName();
	}

	/**
	 * Returns the mime type of this gk image.
	 *
	 * @return the mime type of this gk image
	 */
	@Override
	public String getMimeType() {
		return model.getMimeType();
	}

	/**
	 * Returns the primary key of this gk image.
	 *
	 * @return the primary key of this gk image
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
	 * Sets the gk detail ID of this gk image.
	 *
	 * @param GKDetailId the gk detail ID of this gk image
	 */
	@Override
	public void setGKDetailId(long GKDetailId) {
		model.setGKDetailId(GKDetailId);
	}

	/**
	 * Sets the gk image ID of this gk image.
	 *
	 * @param GKImageId the gk image ID of this gk image
	 */
	@Override
	public void setGKImageId(long GKImageId) {
		model.setGKImageId(GKImageId);
	}

	/**
	 * Sets the image data of this gk image.
	 *
	 * @param imageData the image data of this gk image
	 */
	@Override
	public void setImageData(String imageData) {
		model.setImageData(imageData);
	}

	/**
	 * Sets the image name of this gk image.
	 *
	 * @param imageName the image name of this gk image
	 */
	@Override
	public void setImageName(String imageName) {
		model.setImageName(imageName);
	}

	/**
	 * Sets the mime type of this gk image.
	 *
	 * @param mimeType the mime type of this gk image
	 */
	@Override
	public void setMimeType(String mimeType) {
		model.setMimeType(mimeType);
	}

	/**
	 * Sets the primary key of this gk image.
	 *
	 * @param primaryKey the primary key of this gk image
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected GKImageWrapper wrap(GKImage gkImage) {
		return new GKImageWrapper(gkImage);
	}

}