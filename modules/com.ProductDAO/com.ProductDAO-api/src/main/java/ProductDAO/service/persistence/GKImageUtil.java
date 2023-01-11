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

import ProductDAO.model.GKImage;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the gk image service. This utility wraps <code>ProductDAO.service.persistence.impl.GKImagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GKImagePersistence
 * @generated
 */
public class GKImageUtil {

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
	public static void clearCache(GKImage gkImage) {
		getPersistence().clearCache(gkImage);
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
	public static Map<Serializable, GKImage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GKImage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GKImage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GKImage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<GKImage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static GKImage update(GKImage gkImage) {
		return getPersistence().update(gkImage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static GKImage update(
		GKImage gkImage, ServiceContext serviceContext) {

		return getPersistence().update(gkImage, serviceContext);
	}

	/**
	 * Caches the gk image in the entity cache if it is enabled.
	 *
	 * @param gkImage the gk image
	 */
	public static void cacheResult(GKImage gkImage) {
		getPersistence().cacheResult(gkImage);
	}

	/**
	 * Caches the gk images in the entity cache if it is enabled.
	 *
	 * @param gkImages the gk images
	 */
	public static void cacheResult(List<GKImage> gkImages) {
		getPersistence().cacheResult(gkImages);
	}

	/**
	 * Creates a new gk image with the primary key. Does not add the gk image to the database.
	 *
	 * @param GKImageId the primary key for the new gk image
	 * @return the new gk image
	 */
	public static GKImage create(long GKImageId) {
		return getPersistence().create(GKImageId);
	}

	/**
	 * Removes the gk image with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image that was removed
	 * @throws NoSuchImageException if a gk image with the primary key could not be found
	 */
	public static GKImage remove(long GKImageId)
		throws ProductDAO.exception.NoSuchImageException {

		return getPersistence().remove(GKImageId);
	}

	public static GKImage updateImpl(GKImage gkImage) {
		return getPersistence().updateImpl(gkImage);
	}

	/**
	 * Returns the gk image with the primary key or throws a <code>NoSuchImageException</code> if it could not be found.
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image
	 * @throws NoSuchImageException if a gk image with the primary key could not be found
	 */
	public static GKImage findByPrimaryKey(long GKImageId)
		throws ProductDAO.exception.NoSuchImageException {

		return getPersistence().findByPrimaryKey(GKImageId);
	}

	/**
	 * Returns the gk image with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image, or <code>null</code> if a gk image with the primary key could not be found
	 */
	public static GKImage fetchByPrimaryKey(long GKImageId) {
		return getPersistence().fetchByPrimaryKey(GKImageId);
	}

	/**
	 * Returns all the gk images.
	 *
	 * @return the gk images
	 */
	public static List<GKImage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the gk images.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GKImageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gk images
	 * @param end the upper bound of the range of gk images (not inclusive)
	 * @return the range of gk images
	 */
	public static List<GKImage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the gk images.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GKImageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gk images
	 * @param end the upper bound of the range of gk images (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gk images
	 */
	public static List<GKImage> findAll(
		int start, int end, OrderByComparator<GKImage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the gk images.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GKImageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gk images
	 * @param end the upper bound of the range of gk images (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of gk images
	 */
	public static List<GKImage> findAll(
		int start, int end, OrderByComparator<GKImage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the gk images from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of gk images.
	 *
	 * @return the number of gk images
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GKImagePersistence getPersistence() {
		return _persistence;
	}

	private static volatile GKImagePersistence _persistence;

}