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

import ProductDAO.model.Classify;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the classify service. This utility wraps <code>ProductDAO.service.persistence.impl.ClassifyPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClassifyPersistence
 * @generated
 */
public class ClassifyUtil {

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
	public static void clearCache(Classify classify) {
		getPersistence().clearCache(classify);
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
	public static Map<Serializable, Classify> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Classify> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Classify> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Classify> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Classify> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Classify update(Classify classify) {
		return getPersistence().update(classify);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Classify update(
		Classify classify, ServiceContext serviceContext) {

		return getPersistence().update(classify, serviceContext);
	}

	/**
	 * Caches the classify in the entity cache if it is enabled.
	 *
	 * @param classify the classify
	 */
	public static void cacheResult(Classify classify) {
		getPersistence().cacheResult(classify);
	}

	/**
	 * Caches the classifies in the entity cache if it is enabled.
	 *
	 * @param classifies the classifies
	 */
	public static void cacheResult(List<Classify> classifies) {
		getPersistence().cacheResult(classifies);
	}

	/**
	 * Creates a new classify with the primary key. Does not add the classify to the database.
	 *
	 * @param ClassifyId the primary key for the new classify
	 * @return the new classify
	 */
	public static Classify create(long ClassifyId) {
		return getPersistence().create(ClassifyId);
	}

	/**
	 * Removes the classify with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ClassifyId the primary key of the classify
	 * @return the classify that was removed
	 * @throws NoSuchClassifyException if a classify with the primary key could not be found
	 */
	public static Classify remove(long ClassifyId)
		throws ProductDAO.exception.NoSuchClassifyException {

		return getPersistence().remove(ClassifyId);
	}

	public static Classify updateImpl(Classify classify) {
		return getPersistence().updateImpl(classify);
	}

	/**
	 * Returns the classify with the primary key or throws a <code>NoSuchClassifyException</code> if it could not be found.
	 *
	 * @param ClassifyId the primary key of the classify
	 * @return the classify
	 * @throws NoSuchClassifyException if a classify with the primary key could not be found
	 */
	public static Classify findByPrimaryKey(long ClassifyId)
		throws ProductDAO.exception.NoSuchClassifyException {

		return getPersistence().findByPrimaryKey(ClassifyId);
	}

	/**
	 * Returns the classify with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ClassifyId the primary key of the classify
	 * @return the classify, or <code>null</code> if a classify with the primary key could not be found
	 */
	public static Classify fetchByPrimaryKey(long ClassifyId) {
		return getPersistence().fetchByPrimaryKey(ClassifyId);
	}

	/**
	 * Returns all the classifies.
	 *
	 * @return the classifies
	 */
	public static List<Classify> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the classifies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClassifyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of classifies
	 * @param end the upper bound of the range of classifies (not inclusive)
	 * @return the range of classifies
	 */
	public static List<Classify> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the classifies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClassifyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of classifies
	 * @param end the upper bound of the range of classifies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of classifies
	 */
	public static List<Classify> findAll(
		int start, int end, OrderByComparator<Classify> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the classifies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClassifyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of classifies
	 * @param end the upper bound of the range of classifies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of classifies
	 */
	public static List<Classify> findAll(
		int start, int end, OrderByComparator<Classify> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the classifies from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of classifies.
	 *
	 * @return the number of classifies
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ClassifyPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ClassifyPersistence _persistence;

}