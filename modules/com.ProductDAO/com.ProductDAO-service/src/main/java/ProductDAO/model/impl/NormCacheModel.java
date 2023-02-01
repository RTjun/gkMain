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

import ProductDAO.model.Norm;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Norm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NormCacheModel implements CacheModel<Norm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NormCacheModel)) {
			return false;
		}

		NormCacheModel normCacheModel = (NormCacheModel)object;

		if (NormId == normCacheModel.NormId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, NormId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{NormId=");
		sb.append(NormId);
		sb.append(", normName=");
		sb.append(normName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Norm toEntityModel() {
		NormImpl normImpl = new NormImpl();

		normImpl.setNormId(NormId);

		if (normName == null) {
			normImpl.setNormName("");
		}
		else {
			normImpl.setNormName(normName);
		}

		normImpl.resetOriginalValues();

		return normImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		NormId = objectInput.readLong();
		normName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(NormId);

		if (normName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(normName);
		}
	}

	public long NormId;
	public String normName;

}