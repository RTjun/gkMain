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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Classify in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ClassifyCacheModel
	implements CacheModel<Classify>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ClassifyCacheModel)) {
			return false;
		}

		ClassifyCacheModel classifyCacheModel = (ClassifyCacheModel)object;

		if (ClassifyId == classifyCacheModel.ClassifyId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ClassifyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{ClassifyId=");
		sb.append(ClassifyId);
		sb.append(", classifyName=");
		sb.append(classifyName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Classify toEntityModel() {
		ClassifyImpl classifyImpl = new ClassifyImpl();

		classifyImpl.setClassifyId(ClassifyId);

		if (classifyName == null) {
			classifyImpl.setClassifyName("");
		}
		else {
			classifyImpl.setClassifyName(classifyName);
		}

		classifyImpl.resetOriginalValues();

		return classifyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ClassifyId = objectInput.readLong();
		classifyName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ClassifyId);

		if (classifyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(classifyName);
		}
	}

	public long ClassifyId;
	public String classifyName;

}