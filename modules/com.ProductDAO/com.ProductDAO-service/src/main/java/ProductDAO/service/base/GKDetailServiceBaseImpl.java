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

package ProductDAO.service.base;

import ProductDAO.model.GKDetail;

import ProductDAO.service.GKDetailService;
import ProductDAO.service.GKDetailServiceUtil;
import ProductDAO.service.persistence.ClassifyPersistence;
import ProductDAO.service.persistence.GKDetailPersistence;
import ProductDAO.service.persistence.GKImageFinder;
import ProductDAO.service.persistence.GKImagePersistence;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the gk detail remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link ProductDAO.service.impl.GKDetailServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductDAO.service.impl.GKDetailServiceImpl
 * @generated
 */
public abstract class GKDetailServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, GKDetailService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>GKDetailService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>GKDetailServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			GKDetailService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		gkDetailService = (GKDetailService)aopProxy;

		_setServiceUtilService(gkDetailService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return GKDetailService.class.getName();
	}

	protected Class<?> getModelClass() {
		return GKDetail.class;
	}

	protected String getModelClassName() {
		return GKDetail.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = gkDetailPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(GKDetailService gkDetailService) {
		try {
			Field field = GKDetailServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, gkDetailService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected ClassifyPersistence classifyPersistence;

	@Reference
	protected ProductDAO.service.GKDetailLocalService gkDetailLocalService;

	protected GKDetailService gkDetailService;

	@Reference
	protected GKDetailPersistence gkDetailPersistence;

	@Reference
	protected GKImagePersistence gkImagePersistence;

	@Reference
	protected GKImageFinder gkImageFinder;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

}