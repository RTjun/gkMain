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
 * Provides a wrapper for {@link ClassifyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ClassifyLocalService
 * @generated
 */
public class ClassifyLocalServiceWrapper
	implements ClassifyLocalService, ServiceWrapper<ClassifyLocalService> {

	public ClassifyLocalServiceWrapper() {
		this(null);
	}

	public ClassifyLocalServiceWrapper(
		ClassifyLocalService classifyLocalService) {

		_classifyLocalService = classifyLocalService;
	}

	/**
	 * Adds the classify to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ClassifyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param classify the classify
	 * @return the classify that was added
	 */
	@Override
	public ProductDAO.model.Classify addClassify(
		ProductDAO.model.Classify classify) {

		return _classifyLocalService.addClassify(classify);
	}

	/**
	 * Creates a new classify with the primary key. Does not add the classify to the database.
	 *
	 * @param ClassifyId the primary key for the new classify
	 * @return the new classify
	 */
	@Override
	public ProductDAO.model.Classify createClassify(long ClassifyId) {
		return _classifyLocalService.createClassify(ClassifyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _classifyLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the classify from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ClassifyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param classify the classify
	 * @return the classify that was removed
	 */
	@Override
	public ProductDAO.model.Classify deleteClassify(
		ProductDAO.model.Classify classify) {

		return _classifyLocalService.deleteClassify(classify);
	}

	/**
	 * Deletes the classify with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ClassifyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ClassifyId the primary key of the classify
	 * @return the classify that was removed
	 * @throws PortalException if a classify with the primary key could not be found
	 */
	@Override
	public ProductDAO.model.Classify deleteClassify(long ClassifyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _classifyLocalService.deleteClassify(ClassifyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _classifyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _classifyLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _classifyLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _classifyLocalService.dynamicQuery();
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

		return _classifyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDAO.model.impl.ClassifyModelImpl</code>.
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

		return _classifyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDAO.model.impl.ClassifyModelImpl</code>.
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

		return _classifyLocalService.dynamicQuery(
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

		return _classifyLocalService.dynamicQueryCount(dynamicQuery);
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

		return _classifyLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public ProductDAO.model.Classify fetchClassify(long ClassifyId) {
		return _classifyLocalService.fetchClassify(ClassifyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _classifyLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the classifies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDAO.model.impl.ClassifyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of classifies
	 * @param end the upper bound of the range of classifies (not inclusive)
	 * @return the range of classifies
	 */
	@Override
	public java.util.List<ProductDAO.model.Classify> getClassifies(
		int start, int end) {

		return _classifyLocalService.getClassifies(start, end);
	}

	/**
	 * Returns the number of classifies.
	 *
	 * @return the number of classifies
	 */
	@Override
	public int getClassifiesCount() {
		return _classifyLocalService.getClassifiesCount();
	}

	/**
	 * Returns the classify with the primary key.
	 *
	 * @param ClassifyId the primary key of the classify
	 * @return the classify
	 * @throws PortalException if a classify with the primary key could not be found
	 */
	@Override
	public ProductDAO.model.Classify getClassify(long ClassifyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _classifyLocalService.getClassify(ClassifyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _classifyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _classifyLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _classifyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the classify in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ClassifyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param classify the classify
	 * @return the classify that was updated
	 */
	@Override
	public ProductDAO.model.Classify updateClassify(
		ProductDAO.model.Classify classify) {

		return _classifyLocalService.updateClassify(classify);
	}

	@Override
	public ClassifyLocalService getWrappedService() {
		return _classifyLocalService;
	}

	@Override
	public void setWrappedService(ClassifyLocalService classifyLocalService) {
		_classifyLocalService = classifyLocalService;
	}

	private ClassifyLocalService _classifyLocalService;

}