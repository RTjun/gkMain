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

import ProductDAO.model.GKDetail;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing GKDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GKDetailCacheModel
	implements CacheModel<GKDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GKDetailCacheModel)) {
			return false;
		}

		GKDetailCacheModel gkDetailCacheModel = (GKDetailCacheModel)object;

		if (GKDetailId == gkDetailCacheModel.GKDetailId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, GKDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{GKDetailId=");
		sb.append(GKDetailId);
		sb.append(", GKnumber=");
		sb.append(GKnumber);
		sb.append(", norm=");
		sb.append(norm);
		sb.append(", GKName=");
		sb.append(GKName);
		sb.append(", preOrder=");
		sb.append(preOrder);
		sb.append(", GKComponent=");
		sb.append(GKComponent);
		sb.append(", freight=");
		sb.append(freight);
		sb.append(", price=");
		sb.append(price);
		sb.append(", team=");
		sb.append(team);
		sb.append(", remark=");
		sb.append(remark);
		sb.append(", imageName=");
		sb.append(imageName);
		sb.append(", total=");
		sb.append(total);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GKDetail toEntityModel() {
		GKDetailImpl gkDetailImpl = new GKDetailImpl();

		gkDetailImpl.setGKDetailId(GKDetailId);

		if (GKnumber == null) {
			gkDetailImpl.setGKnumber("");
		}
		else {
			gkDetailImpl.setGKnumber(GKnumber);
		}

		if (norm == null) {
			gkDetailImpl.setNorm("");
		}
		else {
			gkDetailImpl.setNorm(norm);
		}

		if (GKName == null) {
			gkDetailImpl.setGKName("");
		}
		else {
			gkDetailImpl.setGKName(GKName);
		}

		if (preOrder == null) {
			gkDetailImpl.setPreOrder("");
		}
		else {
			gkDetailImpl.setPreOrder(preOrder);
		}

		if (GKComponent == null) {
			gkDetailImpl.setGKComponent("");
		}
		else {
			gkDetailImpl.setGKComponent(GKComponent);
		}

		if (freight == null) {
			gkDetailImpl.setFreight("");
		}
		else {
			gkDetailImpl.setFreight(freight);
		}

		gkDetailImpl.setPrice(price);

		if (team == null) {
			gkDetailImpl.setTeam("");
		}
		else {
			gkDetailImpl.setTeam(team);
		}

		if (remark == null) {
			gkDetailImpl.setRemark("");
		}
		else {
			gkDetailImpl.setRemark(remark);
		}

		if (imageName == null) {
			gkDetailImpl.setImageName("");
		}
		else {
			gkDetailImpl.setImageName(imageName);
		}

		gkDetailImpl.setTotal(total);

		gkDetailImpl.resetOriginalValues();

		return gkDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		GKDetailId = objectInput.readLong();
		GKnumber = objectInput.readUTF();
		norm = objectInput.readUTF();
		GKName = objectInput.readUTF();
		preOrder = objectInput.readUTF();
		GKComponent = objectInput.readUTF();
		freight = objectInput.readUTF();

		price = objectInput.readInt();
		team = objectInput.readUTF();
		remark = objectInput.readUTF();
		imageName = objectInput.readUTF();

		total = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(GKDetailId);

		if (GKnumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(GKnumber);
		}

		if (norm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(norm);
		}

		if (GKName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(GKName);
		}

		if (preOrder == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(preOrder);
		}

		if (GKComponent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(GKComponent);
		}

		if (freight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(freight);
		}

		objectOutput.writeInt(price);

		if (team == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(team);
		}

		if (remark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remark);
		}

		if (imageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(imageName);
		}

		objectOutput.writeInt(total);
	}

	public long GKDetailId;
	public String GKnumber;
	public String norm;
	public String GKName;
	public String preOrder;
	public String GKComponent;
	public String freight;
	public int price;
	public String team;
	public String remark;
	public String imageName;
	public int total;

}