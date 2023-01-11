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

import ProductDAO.model.GKImage;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing GKImage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GKImageCacheModel implements CacheModel<GKImage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GKImageCacheModel)) {
			return false;
		}

		GKImageCacheModel gkImageCacheModel = (GKImageCacheModel)object;

		if (GKImageId == gkImageCacheModel.GKImageId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, GKImageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{GKImageId=");
		sb.append(GKImageId);
		sb.append(", GKDetailId=");
		sb.append(GKDetailId);
		sb.append(", imageName=");
		sb.append(imageName);
		sb.append(", imageData=");
		sb.append(imageData);
		sb.append(", mimeType=");
		sb.append(mimeType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GKImage toEntityModel() {
		GKImageImpl gkImageImpl = new GKImageImpl();

		gkImageImpl.setGKImageId(GKImageId);
		gkImageImpl.setGKDetailId(GKDetailId);

		if (imageName == null) {
			gkImageImpl.setImageName("");
		}
		else {
			gkImageImpl.setImageName(imageName);
		}

		if (imageData == null) {
			gkImageImpl.setImageData("");
		}
		else {
			gkImageImpl.setImageData(imageData);
		}

		if (mimeType == null) {
			gkImageImpl.setMimeType("");
		}
		else {
			gkImageImpl.setMimeType(mimeType);
		}

		gkImageImpl.resetOriginalValues();

		return gkImageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput)
		throws ClassNotFoundException, IOException {

		GKImageId = objectInput.readLong();

		GKDetailId = objectInput.readLong();
		imageName = objectInput.readUTF();
		imageData = (String)objectInput.readObject();
		mimeType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(GKImageId);

		objectOutput.writeLong(GKDetailId);

		if (imageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(imageName);
		}

		if (imageData == null) {
			objectOutput.writeObject("");
		}
		else {
			objectOutput.writeObject(imageData);
		}

		if (mimeType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mimeType);
		}
	}

	public long GKImageId;
	public long GKDetailId;
	public String imageName;
	public String imageData;
	public String mimeType;

}