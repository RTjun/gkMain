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

package ProductDAO.service.persistence.impl;

import ProductDAO.exception.NoSuchImageException;

import ProductDAO.model.GKImage;
import ProductDAO.model.GKImageTable;
import ProductDAO.model.impl.GKImageImpl;
import ProductDAO.model.impl.GKImageModelImpl;

import ProductDAO.service.persistence.GKImagePersistence;
import ProductDAO.service.persistence.GKImageUtil;
import ProductDAO.service.persistence.impl.constants.GKPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the gk image service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {GKImagePersistence.class, BasePersistence.class})
public class GKImagePersistenceImpl
	extends BasePersistenceImpl<GKImage> implements GKImagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>GKImageUtil</code> to access the gk image persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		GKImageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public GKImagePersistenceImpl() {
		setModelClass(GKImage.class);

		setModelImplClass(GKImageImpl.class);
		setModelPKClass(long.class);

		setTable(GKImageTable.INSTANCE);
	}

	/**
	 * Caches the gk image in the entity cache if it is enabled.
	 *
	 * @param gkImage the gk image
	 */
	@Override
	public void cacheResult(GKImage gkImage) {
		entityCache.putResult(
			GKImageImpl.class, gkImage.getPrimaryKey(), gkImage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the gk images in the entity cache if it is enabled.
	 *
	 * @param gkImages the gk images
	 */
	@Override
	public void cacheResult(List<GKImage> gkImages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (gkImages.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (GKImage gkImage : gkImages) {
			if (entityCache.getResult(
					GKImageImpl.class, gkImage.getPrimaryKey()) == null) {

				cacheResult(gkImage);
			}
		}
	}

	/**
	 * Clears the cache for all gk images.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(GKImageImpl.class);

		finderCache.clearCache(GKImageImpl.class);
	}

	/**
	 * Clears the cache for the gk image.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GKImage gkImage) {
		entityCache.removeResult(GKImageImpl.class, gkImage);
	}

	@Override
	public void clearCache(List<GKImage> gkImages) {
		for (GKImage gkImage : gkImages) {
			entityCache.removeResult(GKImageImpl.class, gkImage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(GKImageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(GKImageImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new gk image with the primary key. Does not add the gk image to the database.
	 *
	 * @param GKImageId the primary key for the new gk image
	 * @return the new gk image
	 */
	@Override
	public GKImage create(long GKImageId) {
		GKImage gkImage = new GKImageImpl();

		gkImage.setNew(true);
		gkImage.setPrimaryKey(GKImageId);

		return gkImage;
	}

	/**
	 * Removes the gk image with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image that was removed
	 * @throws NoSuchImageException if a gk image with the primary key could not be found
	 */
	@Override
	public GKImage remove(long GKImageId) throws NoSuchImageException {
		return remove((Serializable)GKImageId);
	}

	/**
	 * Removes the gk image with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the gk image
	 * @return the gk image that was removed
	 * @throws NoSuchImageException if a gk image with the primary key could not be found
	 */
	@Override
	public GKImage remove(Serializable primaryKey) throws NoSuchImageException {
		Session session = null;

		try {
			session = openSession();

			GKImage gkImage = (GKImage)session.get(
				GKImageImpl.class, primaryKey);

			if (gkImage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchImageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(gkImage);
		}
		catch (NoSuchImageException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected GKImage removeImpl(GKImage gkImage) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(gkImage)) {
				gkImage = (GKImage)session.get(
					GKImageImpl.class, gkImage.getPrimaryKeyObj());
			}

			if (gkImage != null) {
				session.delete(gkImage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (gkImage != null) {
			clearCache(gkImage);
		}

		return gkImage;
	}

	@Override
	public GKImage updateImpl(GKImage gkImage) {
		boolean isNew = gkImage.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(gkImage);
			}
			else {
				gkImage = (GKImage)session.merge(gkImage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(GKImageImpl.class, gkImage, false, true);

		if (isNew) {
			gkImage.setNew(false);
		}

		gkImage.resetOriginalValues();

		return gkImage;
	}

	/**
	 * Returns the gk image with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the gk image
	 * @return the gk image
	 * @throws NoSuchImageException if a gk image with the primary key could not be found
	 */
	@Override
	public GKImage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchImageException {

		GKImage gkImage = fetchByPrimaryKey(primaryKey);

		if (gkImage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchImageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return gkImage;
	}

	/**
	 * Returns the gk image with the primary key or throws a <code>NoSuchImageException</code> if it could not be found.
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image
	 * @throws NoSuchImageException if a gk image with the primary key could not be found
	 */
	@Override
	public GKImage findByPrimaryKey(long GKImageId)
		throws NoSuchImageException {

		return findByPrimaryKey((Serializable)GKImageId);
	}

	/**
	 * Returns the gk image with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param GKImageId the primary key of the gk image
	 * @return the gk image, or <code>null</code> if a gk image with the primary key could not be found
	 */
	@Override
	public GKImage fetchByPrimaryKey(long GKImageId) {
		return fetchByPrimaryKey((Serializable)GKImageId);
	}

	/**
	 * Returns all the gk images.
	 *
	 * @return the gk images
	 */
	@Override
	public List<GKImage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<GKImage> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<GKImage> findAll(
		int start, int end, OrderByComparator<GKImage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<GKImage> findAll(
		int start, int end, OrderByComparator<GKImage> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<GKImage> list = null;

		if (useFinderCache) {
			list = (List<GKImage>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_GKIMAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_GKIMAGE;

				sql = sql.concat(GKImageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<GKImage>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the gk images from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (GKImage gkImage : findAll()) {
			remove(gkImage);
		}
	}

	/**
	 * Returns the number of gk images.
	 *
	 * @return the number of gk images
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_GKIMAGE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "GKImageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_GKIMAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return GKImageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the gk image persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_setGKImageUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setGKImageUtilPersistence(null);

		entityCache.removeCache(GKImageImpl.class.getName());
	}

	private void _setGKImageUtilPersistence(
		GKImagePersistence gkImagePersistence) {

		try {
			Field field = GKImageUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, gkImagePersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = GKPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = GKPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = GKPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_GKIMAGE =
		"SELECT gkImage FROM GKImage gkImage";

	private static final String _SQL_COUNT_GKIMAGE =
		"SELECT COUNT(gkImage) FROM GKImage gkImage";

	private static final String _ORDER_BY_ENTITY_ALIAS = "gkImage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No GKImage exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		GKImagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private GKImageModelArgumentsResolver _gkImageModelArgumentsResolver;

}