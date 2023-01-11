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
 * Provides a wrapper for {@link GKDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GKDetailLocalService
 * @generated
 */
public class GKDetailLocalServiceWrapper
	implements GKDetailLocalService, ServiceWrapper<GKDetailLocalService> {

	public GKDetailLocalServiceWrapper() {
		this(null);
	}

	public GKDetailLocalServiceWrapper(
		GKDetailLocalService gkDetailLocalService) {

		_gkDetailLocalService = gkDetailLocalService;
	}

	/**
	 * Adds the gk detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GKDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gkDetail the gk detail
	 * @return the gk detail that was added
	 */
	@Override
	public ProductDAO.model.GKDetail addGKDetail(
		ProductDAO.model.GKDetail gkDetail) {

		return _gkDetailLocalService.addGKDetail(gkDetail);
	}

	/**
	 * Creates a new gk detail with the primary key. Does not add the gk detail to the database.
	 *
	 * @param GKDetailId the primary key for the new gk detail
	 * @return the new gk detail
	 */
	@Override
	public ProductDAO.model.GKDetail createGKDetail(long GKDetailId) {
		return _gkDetailLocalService.createGKDetail(GKDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gkDetailLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the gk detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GKDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gkDetail the gk detail
	 * @return the gk detail that was removed
	 */
	@Override
	public ProductDAO.model.GKDetail deleteGKDetail(
		ProductDAO.model.GKDetail gkDetail) {

		return _gkDetailLocalService.deleteGKDetail(gkDetail);
	}

	/**
	 * Deletes the gk detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GKDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param GKDetailId the primary key of the gk detail
	 * @return the gk detail that was removed
	 * @throws PortalException if a gk detail with the primary key could not be found
	 */
	@Override
	public ProductDAO.model.GKDetail deleteGKDetail(long GKDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gkDetailLocalService.deleteGKDetail(GKDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gkDetailLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _gkDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _gkDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _gkDetailLocalService.dynamicQuery();
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

		return _gkDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDAO.model.impl.GKDetailModelImpl</code>.
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

		return _gkDetailLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDAO.model.impl.GKDetailModelImpl</code>.
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

		return _gkDetailLocalService.dynamicQuery(
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

		return _gkDetailLocalService.dynamicQueryCount(dynamicQuery);
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

		return _gkDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public ProductDAO.model.GKDetail fetchGKDetail(long GKDetailId) {
		return _gkDetailLocalService.fetchGKDetail(GKDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _gkDetailLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the gk detail with the primary key.
	 *
	 * @param GKDetailId the primary key of the gk detail
	 * @return the gk detail
	 * @throws PortalException if a gk detail with the primary key could not be found
	 */
	@Override
	public ProductDAO.model.GKDetail getGKDetail(long GKDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gkDetailLocalService.getGKDetail(GKDetailId);
	}

	/**
	 * Returns a range of all the gk details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDAO.model.impl.GKDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gk details
	 * @param end the upper bound of the range of gk details (not inclusive)
	 * @return the range of gk details
	 */
	@Override
	public java.util.List<ProductDAO.model.GKDetail> getGKDetails(
		int start, int end) {

		return _gkDetailLocalService.getGKDetails(start, end);
	}

	/**
	 * Returns the number of gk details.
	 *
	 * @return the number of gk details
	 */
	@Override
	public int getGKDetailsCount() {
		return _gkDetailLocalService.getGKDetailsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _gkDetailLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _gkDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gkDetailLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the gk detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GKDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gkDetail the gk detail
	 * @return the gk detail that was updated
	 */
	@Override
	public ProductDAO.model.GKDetail updateGKDetail(
		ProductDAO.model.GKDetail gkDetail) {

		return _gkDetailLocalService.updateGKDetail(gkDetail);
	}

	@Override
	public GKDetailLocalService getWrappedService() {
		return _gkDetailLocalService;
	}

	@Override
	public void setWrappedService(GKDetailLocalService gkDetailLocalService) {
		_gkDetailLocalService = gkDetailLocalService;
	}

	private GKDetailLocalService _gkDetailLocalService;

}