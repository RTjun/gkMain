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

package ProductDAO.service.impl;

import ProductDAO.model.GKImage;
import ProductDAO.service.base.GKImageLocalServiceBaseImpl;

import ProductDAO.service.persistence.GKImageFinder;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

/**
 * @author Ian
 */
@Component(
	property = "model.class.name=ProductDAO.model.GKImage",
	service = AopService.class
)
public class GKImageLocalServiceImpl extends GKImageLocalServiceBaseImpl {

	@Reference
	GKImageFinder _gkImageFinder;
	public List<GKImage> findIMGByGKDetailId(long GKDetailId){

		List<GKImage> imageList = _gkImageFinder.findIMGByGKDetailId(GKDetailId);

		return imageList;
	}
}