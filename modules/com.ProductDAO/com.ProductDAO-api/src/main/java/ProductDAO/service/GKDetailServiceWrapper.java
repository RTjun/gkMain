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

package ProductDAO.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GKDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see GKDetailService
 * @generated
 */
public class GKDetailServiceWrapper
	implements GKDetailService, ServiceWrapper<GKDetailService> {

	public GKDetailServiceWrapper() {
		this(null);
	}

	public GKDetailServiceWrapper(GKDetailService gkDetailService) {
		_gkDetailService = gkDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _gkDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public GKDetailService getWrappedService() {
		return _gkDetailService;
	}

	@Override
	public void setWrappedService(GKDetailService gkDetailService) {
		_gkDetailService = gkDetailService;
	}

	private GKDetailService _gkDetailService;

}