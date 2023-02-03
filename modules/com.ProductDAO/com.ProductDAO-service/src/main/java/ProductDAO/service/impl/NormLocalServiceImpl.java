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

import ProductDAO.model.Norm;
import ProductDAO.service.base.NormLocalServiceBaseImpl;

import ProductDAO.service.persistence.NormFinder;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=ProductDAO.model.Norm",
	service = AopService.class
)
public class NormLocalServiceImpl extends NormLocalServiceBaseImpl {

	@Reference
	NormFinder _normFinder;
	public List<Norm> findQuarterByNormId(int begin,int end){

		List<Norm> normList = _normFinder.findQuarterByNormId(begin,end);
		return normList;
	}
}