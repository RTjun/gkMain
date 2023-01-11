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

package ProductDAO.service.persistence;

import ProductDAO.model.GKDetail;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the gk detail service. This utility wraps <code>ProductDAO.service.persistence.impl.GKDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GKDetailPersistence
 * @generated
 */
public class GKDetailUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(GKDetail gkDetail) {
		getPersistence().clearCache(gkDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, GKDetail> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GKDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GKDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GKDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<GKDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static GKDetail update(GKDetail gkDetail) {
		return getPersistence().update(gkDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static GKDetail update(
		GKDetail gkDetail, ServiceContext serviceContext) {

		return getPersistence().update(gkDetail, serviceContext);
	}

	/**
	 * Caches the gk detail in the entity cache if it is enabled.
	 *
	 * @param gkDetail the gk detail
	 */
	public static void cacheResult(GKDetail gkDetail) {
		getPersistence().cacheResult(gkDetail);
	}

	/**
	 * Caches the gk details in the entity cache if it is enabled.
	 *
	 * @param gkDetails the gk details
	 */
	public static void cacheResult(List<GKDetail> gkDetails) {
		getPersistence().cacheResult(gkDetails);
	}

	/**
	 * Creates a new gk detail with the primary key. Does not add the gk detail to the database.
	 *
	 * @param GKDetailId the primary key for the new gk detail
	 * @return the new gk detail
	 */
	public static GKDetail create(long GKDetailId) {
		return getPersistence().create(GKDetailId);
	}

	/**
	 * Removes the gk detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param GKDetailId the primary key of the gk detail
	 * @return the gk detail that was removed
	 * @throws NoSuchDetailException if a gk detail with the primary key could not be found
	 */
	public static GKDetail remove(long GKDetailId)
		throws ProductDAO.exception.NoSuchDetailException {

		return getPersistence().remove(GKDetailId);
	}

	public static GKDetail updateImpl(GKDetail gkDetail) {
		return getPersistence().updateImpl(gkDetail);
	}

	/**
	 * Returns the gk detail with the primary key or throws a <code>NoSuchDetailException</code> if it could not be found.
	 *
	 * @param GKDetailId the primary key of the gk detail
	 * @return the gk detail
	 * @throws NoSuchDetailException if a gk detail with the primary key could not be found
	 */
	public static GKDetail findByPrimaryKey(long GKDetailId)
		throws ProductDAO.exception.NoSuchDetailException {

		return getPersistence().findByPrimaryKey(GKDetailId);
	}

	/**
	 * Returns the gk detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param GKDetailId the primary key of the gk detail
	 * @return the gk detail, or <code>null</code> if a gk detail with the primary key could not be found
	 */
	public static GKDetail fetchByPrimaryKey(long GKDetailId) {
		return getPersistence().fetchByPrimaryKey(GKDetailId);
	}

	/**
	 * Returns all the gk details.
	 *
	 * @return the gk details
	 */
	public static List<GKDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the gk details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GKDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gk details
	 * @param end the upper bound of the range of gk details (not inclusive)
	 * @return the range of gk details
	 */
	public static List<GKDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the gk details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GKDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gk details
	 * @param end the upper bound of the range of gk details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gk details
	 */
	public static List<GKDetail> findAll(
		int start, int end, OrderByComparator<GKDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the gk details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GKDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gk details
	 * @param end the upper bound of the range of gk details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of gk details
	 */
	public static List<GKDetail> findAll(
		int start, int end, OrderByComparator<GKDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the gk details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of gk details.
	 *
	 * @return the number of gk details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GKDetailPersistence getPersistence() {
		return _persistence;
	}

	private static volatile GKDetailPersistence _persistence;

}