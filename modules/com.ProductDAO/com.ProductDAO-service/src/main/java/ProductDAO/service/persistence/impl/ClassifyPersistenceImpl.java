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

import ProductDAO.exception.NoSuchClassifyException;

import ProductDAO.model.Classify;
import ProductDAO.model.ClassifyTable;
import ProductDAO.model.impl.ClassifyImpl;
import ProductDAO.model.impl.ClassifyModelImpl;

import ProductDAO.service.persistence.ClassifyPersistence;
import ProductDAO.service.persistence.ClassifyUtil;
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
 * The persistence implementation for the classify service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {ClassifyPersistence.class, BasePersistence.class})
public class ClassifyPersistenceImpl
	extends BasePersistenceImpl<Classify> implements ClassifyPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ClassifyUtil</code> to access the classify persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ClassifyImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public ClassifyPersistenceImpl() {
		setModelClass(Classify.class);

		setModelImplClass(ClassifyImpl.class);
		setModelPKClass(long.class);

		setTable(ClassifyTable.INSTANCE);
	}

	/**
	 * Caches the classify in the entity cache if it is enabled.
	 *
	 * @param classify the classify
	 */
	@Override
	public void cacheResult(Classify classify) {
		entityCache.putResult(
			ClassifyImpl.class, classify.getPrimaryKey(), classify);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the classifies in the entity cache if it is enabled.
	 *
	 * @param classifies the classifies
	 */
	@Override
	public void cacheResult(List<Classify> classifies) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (classifies.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Classify classify : classifies) {
			if (entityCache.getResult(
					ClassifyImpl.class, classify.getPrimaryKey()) == null) {

				cacheResult(classify);
			}
		}
	}

	/**
	 * Clears the cache for all classifies.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ClassifyImpl.class);

		finderCache.clearCache(ClassifyImpl.class);
	}

	/**
	 * Clears the cache for the classify.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Classify classify) {
		entityCache.removeResult(ClassifyImpl.class, classify);
	}

	@Override
	public void clearCache(List<Classify> classifies) {
		for (Classify classify : classifies) {
			entityCache.removeResult(ClassifyImpl.class, classify);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ClassifyImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ClassifyImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new classify with the primary key. Does not add the classify to the database.
	 *
	 * @param ClassifyId the primary key for the new classify
	 * @return the new classify
	 */
	@Override
	public Classify create(long ClassifyId) {
		Classify classify = new ClassifyImpl();

		classify.setNew(true);
		classify.setPrimaryKey(ClassifyId);

		return classify;
	}

	/**
	 * Removes the classify with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ClassifyId the primary key of the classify
	 * @return the classify that was removed
	 * @throws NoSuchClassifyException if a classify with the primary key could not be found
	 */
	@Override
	public Classify remove(long ClassifyId) throws NoSuchClassifyException {
		return remove((Serializable)ClassifyId);
	}

	/**
	 * Removes the classify with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the classify
	 * @return the classify that was removed
	 * @throws NoSuchClassifyException if a classify with the primary key could not be found
	 */
	@Override
	public Classify remove(Serializable primaryKey)
		throws NoSuchClassifyException {

		Session session = null;

		try {
			session = openSession();

			Classify classify = (Classify)session.get(
				ClassifyImpl.class, primaryKey);

			if (classify == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchClassifyException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(classify);
		}
		catch (NoSuchClassifyException noSuchEntityException) {
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
	protected Classify removeImpl(Classify classify) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(classify)) {
				classify = (Classify)session.get(
					ClassifyImpl.class, classify.getPrimaryKeyObj());
			}

			if (classify != null) {
				session.delete(classify);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (classify != null) {
			clearCache(classify);
		}

		return classify;
	}

	@Override
	public Classify updateImpl(Classify classify) {
		boolean isNew = classify.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(classify);
			}
			else {
				classify = (Classify)session.merge(classify);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(ClassifyImpl.class, classify, false, true);

		if (isNew) {
			classify.setNew(false);
		}

		classify.resetOriginalValues();

		return classify;
	}

	/**
	 * Returns the classify with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the classify
	 * @return the classify
	 * @throws NoSuchClassifyException if a classify with the primary key could not be found
	 */
	@Override
	public Classify findByPrimaryKey(Serializable primaryKey)
		throws NoSuchClassifyException {

		Classify classify = fetchByPrimaryKey(primaryKey);

		if (classify == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchClassifyException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return classify;
	}

	/**
	 * Returns the classify with the primary key or throws a <code>NoSuchClassifyException</code> if it could not be found.
	 *
	 * @param ClassifyId the primary key of the classify
	 * @return the classify
	 * @throws NoSuchClassifyException if a classify with the primary key could not be found
	 */
	@Override
	public Classify findByPrimaryKey(long ClassifyId)
		throws NoSuchClassifyException {

		return findByPrimaryKey((Serializable)ClassifyId);
	}

	/**
	 * Returns the classify with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ClassifyId the primary key of the classify
	 * @return the classify, or <code>null</code> if a classify with the primary key could not be found
	 */
	@Override
	public Classify fetchByPrimaryKey(long ClassifyId) {
		return fetchByPrimaryKey((Serializable)ClassifyId);
	}

	/**
	 * Returns all the classifies.
	 *
	 * @return the classifies
	 */
	@Override
	public List<Classify> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Classify> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Classify> findAll(
		int start, int end, OrderByComparator<Classify> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Classify> findAll(
		int start, int end, OrderByComparator<Classify> orderByComparator,
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

		List<Classify> list = null;

		if (useFinderCache) {
			list = (List<Classify>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CLASSIFY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CLASSIFY;

				sql = sql.concat(ClassifyModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Classify>)QueryUtil.list(
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
	 * Removes all the classifies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Classify classify : findAll()) {
			remove(classify);
		}
	}

	/**
	 * Returns the number of classifies.
	 *
	 * @return the number of classifies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CLASSIFY);

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
		return "ClassifyId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CLASSIFY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ClassifyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the classify persistence.
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

		_setClassifyUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setClassifyUtilPersistence(null);

		entityCache.removeCache(ClassifyImpl.class.getName());
	}

	private void _setClassifyUtilPersistence(
		ClassifyPersistence classifyPersistence) {

		try {
			Field field = ClassifyUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, classifyPersistence);
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

	private static final String _SQL_SELECT_CLASSIFY =
		"SELECT classify FROM Classify classify";

	private static final String _SQL_COUNT_CLASSIFY =
		"SELECT COUNT(classify) FROM Classify classify";

	private static final String _ORDER_BY_ENTITY_ALIAS = "classify.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Classify exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		ClassifyPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private ClassifyModelArgumentsResolver _classifyModelArgumentsResolver;

}