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

import ProductDAO.exception.NoSuchImageException;

import ProductDAO.model.GKImage;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the gk image service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GKImageUtil
 * @generated
 */
@ProviderType
public interface GKImagePersistence extends BasePersistence<GKImage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GKImageUtil} to access the gk image persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the gk image in the entity cache if it is enabled.
	 *
	 * @param gkImage the gk image
	 */
	public void cacheResult(GKImage gkImage);

	/**
	 * Caches the gk images in the entity cache if it is enabled.
	 *
	 * @param gkImages the gk images
	 */
	public void cacheResult(java.util.List<GKImage> gkImages);

	/**
	 * Creates a new gk image with the primary key. Does not add the gk image to the database.
	 *
	 * @param GKImageId the primary key for the new gk image
	 * @return the new gk image
	 */
	public GKImage create(long GKImageId);

	/**
	 * Removes the gk image with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image that was removed
	 * @throws NoSuchImageException if a gk image with the primary key could not be found
	 */
	public GKImage remove(long GKImageId) throws NoSuchImageException;

	public GKImage updateImpl(GKImage gkImage);

	/**
	 * Returns the gk image with the primary key or throws a <code>NoSuchImageException</code> if it could not be found.
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image
	 * @throws NoSuchImageException if a gk image with the primary key could not be found
	 */
	public GKImage findByPrimaryKey(long GKImageId) throws NoSuchImageException;

	/**
	 * Returns the gk image with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image, or <code>null</code> if a gk image with the primary key could not be found
	 */
	public GKImage fetchByPrimaryKey(long GKImageId);

	/**
	 * Returns all the gk images.
	 *
	 * @return the gk images
	 */
	public java.util.List<GKImage> findAll();

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
	public java.util.List<GKImage> findAll(int start, int end);

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
	public java.util.List<GKImage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GKImage>
			orderByComparator);

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
	public java.util.List<GKImage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GKImage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the gk images from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of gk images.
	 *
	 * @return the number of gk images
	 */
	public int countAll();

}