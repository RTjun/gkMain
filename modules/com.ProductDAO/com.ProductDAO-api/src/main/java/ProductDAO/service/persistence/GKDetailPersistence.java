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

import ProductDAO.exception.NoSuchDetailException;

import ProductDAO.model.GKDetail;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the gk detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GKDetailUtil
 * @generated
 */
@ProviderType
public interface GKDetailPersistence extends BasePersistence<GKDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GKDetailUtil} to access the gk detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the gk detail in the entity cache if it is enabled.
	 *
	 * @param gkDetail the gk detail
	 */
	public void cacheResult(GKDetail gkDetail);

	/**
	 * Caches the gk details in the entity cache if it is enabled.
	 *
	 * @param gkDetails the gk details
	 */
	public void cacheResult(java.util.List<GKDetail> gkDetails);

	/**
	 * Creates a new gk detail with the primary key. Does not add the gk detail to the database.
	 *
	 * @param GKDetailId the primary key for the new gk detail
	 * @return the new gk detail
	 */
	public GKDetail create(long GKDetailId);

	/**
	 * Removes the gk detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param GKDetailId the primary key of the gk detail
	 * @return the gk detail that was removed
	 * @throws NoSuchDetailException if a gk detail with the primary key could not be found
	 */
	public GKDetail remove(long GKDetailId) throws NoSuchDetailException;

	public GKDetail updateImpl(GKDetail gkDetail);

	/**
	 * Returns the gk detail with the primary key or throws a <code>NoSuchDetailException</code> if it could not be found.
	 *
	 * @param GKDetailId the primary key of the gk detail
	 * @return the gk detail
	 * @throws NoSuchDetailException if a gk detail with the primary key could not be found
	 */
	public GKDetail findByPrimaryKey(long GKDetailId)
		throws NoSuchDetailException;

	/**
	 * Returns the gk detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param GKDetailId the primary key of the gk detail
	 * @return the gk detail, or <code>null</code> if a gk detail with the primary key could not be found
	 */
	public GKDetail fetchByPrimaryKey(long GKDetailId);

	/**
	 * Returns all the gk details.
	 *
	 * @return the gk details
	 */
	public java.util.List<GKDetail> findAll();

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
	public java.util.List<GKDetail> findAll(int start, int end);

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
	public java.util.List<GKDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GKDetail>
			orderByComparator);

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
	public java.util.List<GKDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GKDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the gk details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of gk details.
	 *
	 * @return the number of gk details
	 */
	public int countAll();

}