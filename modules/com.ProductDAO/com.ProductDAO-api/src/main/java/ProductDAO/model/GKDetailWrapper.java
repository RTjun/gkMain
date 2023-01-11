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
 * This class is a wrapper for {@link GKDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GKDetail
 * @generated
 */
public class GKDetailWrapper
	extends BaseModelWrapper<GKDetail>
	implements GKDetail, ModelWrapper<GKDetail> {

	public GKDetailWrapper(GKDetail gkDetail) {
		super(gkDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("GKDetailId", getGKDetailId());
		attributes.put("GKnumber", getGKnumber());
		attributes.put("norm", getNorm());
		attributes.put("GKName", getGKName());
		attributes.put("preOrder", getPreOrder());
		attributes.put("GKComponent", getGKComponent());
		attributes.put("freight", getFreight());
		attributes.put("price", getPrice());
		attributes.put("team", getTeam());
		attributes.put("remark", getRemark());
		attributes.put("imageName", getImageName());
		attributes.put("total", getTotal());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long GKDetailId = (Long)attributes.get("GKDetailId");

		if (GKDetailId != null) {
			setGKDetailId(GKDetailId);
		}

		String GKnumber = (String)attributes.get("GKnumber");

		if (GKnumber != null) {
			setGKnumber(GKnumber);
		}

		String norm = (String)attributes.get("norm");

		if (norm != null) {
			setNorm(norm);
		}

		String GKName = (String)attributes.get("GKName");

		if (GKName != null) {
			setGKName(GKName);
		}

		String preOrder = (String)attributes.get("preOrder");

		if (preOrder != null) {
			setPreOrder(preOrder);
		}

		String GKComponent = (String)attributes.get("GKComponent");

		if (GKComponent != null) {
			setGKComponent(GKComponent);
		}

		String freight = (String)attributes.get("freight");

		if (freight != null) {
			setFreight(freight);
		}

		Integer price = (Integer)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String team = (String)attributes.get("team");

		if (team != null) {
			setTeam(team);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
		}

		String imageName = (String)attributes.get("imageName");

		if (imageName != null) {
			setImageName(imageName);
		}

		Integer total = (Integer)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}
	}

	@Override
	public GKDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the freight of this gk detail.
	 *
	 * @return the freight of this gk detail
	 */
	@Override
	public String getFreight() {
		return model.getFreight();
	}

	/**
	 * Returns the gk component of this gk detail.
	 *
	 * @return the gk component of this gk detail
	 */
	@Override
	public String getGKComponent() {
		return model.getGKComponent();
	}

	/**
	 * Returns the gk detail ID of this gk detail.
	 *
	 * @return the gk detail ID of this gk detail
	 */
	@Override
	public long getGKDetailId() {
		return model.getGKDetailId();
	}

	/**
	 * Returns the gk name of this gk detail.
	 *
	 * @return the gk name of this gk detail
	 */
	@Override
	public String getGKName() {
		return model.getGKName();
	}

	/**
	 * Returns the g knumber of this gk detail.
	 *
	 * @return the g knumber of this gk detail
	 */
	@Override
	public String getGKnumber() {
		return model.getGKnumber();
	}

	/**
	 * Returns the image name of this gk detail.
	 *
	 * @return the image name of this gk detail
	 */
	@Override
	public String getImageName() {
		return model.getImageName();
	}

	/**
	 * Returns the norm of this gk detail.
	 *
	 * @return the norm of this gk detail
	 */
	@Override
	public String getNorm() {
		return model.getNorm();
	}

	/**
	 * Returns the pre order of this gk detail.
	 *
	 * @return the pre order of this gk detail
	 */
	@Override
	public String getPreOrder() {
		return model.getPreOrder();
	}

	/**
	 * Returns the price of this gk detail.
	 *
	 * @return the price of this gk detail
	 */
	@Override
	public int getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this gk detail.
	 *
	 * @return the primary key of this gk detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the remark of this gk detail.
	 *
	 * @return the remark of this gk detail
	 */
	@Override
	public String getRemark() {
		return model.getRemark();
	}

	/**
	 * Returns the team of this gk detail.
	 *
	 * @return the team of this gk detail
	 */
	@Override
	public String getTeam() {
		return model.getTeam();
	}

	/**
	 * Returns the total of this gk detail.
	 *
	 * @return the total of this gk detail
	 */
	@Override
	public int getTotal() {
		return model.getTotal();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the freight of this gk detail.
	 *
	 * @param freight the freight of this gk detail
	 */
	@Override
	public void setFreight(String freight) {
		model.setFreight(freight);
	}

	/**
	 * Sets the gk component of this gk detail.
	 *
	 * @param GKComponent the gk component of this gk detail
	 */
	@Override
	public void setGKComponent(String GKComponent) {
		model.setGKComponent(GKComponent);
	}

	/**
	 * Sets the gk detail ID of this gk detail.
	 *
	 * @param GKDetailId the gk detail ID of this gk detail
	 */
	@Override
	public void setGKDetailId(long GKDetailId) {
		model.setGKDetailId(GKDetailId);
	}

	/**
	 * Sets the gk name of this gk detail.
	 *
	 * @param GKName the gk name of this gk detail
	 */
	@Override
	public void setGKName(String GKName) {
		model.setGKName(GKName);
	}

	/**
	 * Sets the g knumber of this gk detail.
	 *
	 * @param GKnumber the g knumber of this gk detail
	 */
	@Override
	public void setGKnumber(String GKnumber) {
		model.setGKnumber(GKnumber);
	}

	/**
	 * Sets the image name of this gk detail.
	 *
	 * @param imageName the image name of this gk detail
	 */
	@Override
	public void setImageName(String imageName) {
		model.setImageName(imageName);
	}

	/**
	 * Sets the norm of this gk detail.
	 *
	 * @param norm the norm of this gk detail
	 */
	@Override
	public void setNorm(String norm) {
		model.setNorm(norm);
	}

	/**
	 * Sets the pre order of this gk detail.
	 *
	 * @param preOrder the pre order of this gk detail
	 */
	@Override
	public void setPreOrder(String preOrder) {
		model.setPreOrder(preOrder);
	}

	/**
	 * Sets the price of this gk detail.
	 *
	 * @param price the price of this gk detail
	 */
	@Override
	public void setPrice(int price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this gk detail.
	 *
	 * @param primaryKey the primary key of this gk detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the remark of this gk detail.
	 *
	 * @param remark the remark of this gk detail
	 */
	@Override
	public void setRemark(String remark) {
		model.setRemark(remark);
	}

	/**
	 * Sets the team of this gk detail.
	 *
	 * @param team the team of this gk detail
	 */
	@Override
	public void setTeam(String team) {
		model.setTeam(team);
	}

	/**
	 * Sets the total of this gk detail.
	 *
	 * @param total the total of this gk detail
	 */
	@Override
	public void setTotal(int total) {
		model.setTotal(total);
	}

	@Override
	protected GKDetailWrapper wrap(GKDetail gkDetail) {
		return new GKDetailWrapper(gkDetail);
	}

}