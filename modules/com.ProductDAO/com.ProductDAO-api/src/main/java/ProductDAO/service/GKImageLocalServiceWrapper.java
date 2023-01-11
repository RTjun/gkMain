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
 * Provides a wrapper for {@link GKImageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GKImageLocalService
 * @generated
 */
public class GKImageLocalServiceWrapper
	implements GKImageLocalService, ServiceWrapper<GKImageLocalService> {

	public GKImageLocalServiceWrapper() {
		this(null);
	}

	public GKImageLocalServiceWrapper(GKImageLocalService gkImageLocalService) {
		_gkImageLocalService = gkImageLocalService;
	}

	/**
	 * Adds the gk image to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GKImageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gkImage the gk image
	 * @return the gk image that was added
	 */
	@Override
	public ProductDAO.model.GKImage addGKImage(
		ProductDAO.model.GKImage gkImage) {

		return _gkImageLocalService.addGKImage(gkImage);
	}

	/**
	 * Creates a new gk image with the primary key. Does not add the gk image to the database.
	 *
	 * @param GKImageId the primary key for the new gk image
	 * @return the new gk image
	 */
	@Override
	public ProductDAO.model.GKImage createGKImage(long GKImageId) {
		return _gkImageLocalService.createGKImage(GKImageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gkImageLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the gk image from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GKImageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gkImage the gk image
	 * @return the gk image that was removed
	 */
	@Override
	public ProductDAO.model.GKImage deleteGKImage(
		ProductDAO.model.GKImage gkImage) {

		return _gkImageLocalService.deleteGKImage(gkImage);
	}

	/**
	 * Deletes the gk image with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GKImageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image that was removed
	 * @throws PortalException if a gk image with the primary key could not be found
	 */
	@Override
	public ProductDAO.model.GKImage deleteGKImage(long GKImageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gkImageLocalService.deleteGKImage(GKImageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gkImageLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _gkImageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _gkImageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _gkImageLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _gkImageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDAO.model.impl.GKImageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _gkImageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDAO.model.impl.GKImageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _gkImageLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _gkImageLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _gkImageLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ProductDAO.model.GKImage fetchGKImage(long GKImageId) {
		return _gkImageLocalService.fetchGKImage(GKImageId);
	}

	@Override
	public java.util.List<ProductDAO.model.GKImage> findIMGByGKDetailId(
		long GKDetailId) {

		return _gkImageLocalService.findIMGByGKDetailId(GKDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _gkImageLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the gk image with the primary key.
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image
	 * @throws PortalException if a gk image with the primary key could not be found
	 */
	@Override
	public ProductDAO.model.GKImage getGKImage(long GKImageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gkImageLocalService.getGKImage(GKImageId);
	}

	/**
	 * Returns a range of all the gk images.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDAO.model.impl.GKImageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gk images
	 * @param end the upper bound of the range of gk images (not inclusive)
	 * @return the range of gk images
	 */
	@Override
	public java.util.List<ProductDAO.model.GKImage> getGKImages(
		int start, int end) {

		return _gkImageLocalService.getGKImages(start, end);
	}

	/**
	 * Returns the number of gk images.
	 *
	 * @return the number of gk images
	 */
	@Override
	public int getGKImagesCount() {
		return _gkImageLocalService.getGKImagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _gkImageLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _gkImageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gkImageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the gk image in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GKImageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gkImage the gk image
	 * @return the gk image that was updated
	 */
	@Override
	public ProductDAO.model.GKImage updateGKImage(
		ProductDAO.model.GKImage gkImage) {

		return _gkImageLocalService.updateGKImage(gkImage);
	}

	@Override
	public GKImageLocalService getWrappedService() {
		return _gkImageLocalService;
	}

	@Override
	public void setWrappedService(GKImageLocalService gkImageLocalService) {
		_gkImageLocalService = gkImageLocalService;
	}

	private GKImageLocalService _gkImageLocalService;

}