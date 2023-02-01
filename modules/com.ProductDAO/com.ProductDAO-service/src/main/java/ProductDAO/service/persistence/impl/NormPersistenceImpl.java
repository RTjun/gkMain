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

import ProductDAO.exception.NoSuchNormException;

import ProductDAO.model.Norm;
import ProductDAO.model.NormTable;
import ProductDAO.model.impl.NormImpl;
import ProductDAO.model.impl.NormModelImpl;

import ProductDAO.service.persistence.NormPersistence;
import ProductDAO.service.persistence.NormUtil;
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
 * The persistence implementation for the norm service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {NormPersistence.class, BasePersistence.class})
public class NormPersistenceImpl
	extends BasePersistenceImpl<Norm> implements NormPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NormUtil</code> to access the norm persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NormImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public NormPersistenceImpl() {
		setModelClass(Norm.class);

		setModelImplClass(NormImpl.class);
		setModelPKClass(long.class);

		setTable(NormTable.INSTANCE);
	}

	/**
	 * Caches the norm in the entity cache if it is enabled.
	 *
	 * @param norm the norm
	 */
	@Override
	public void cacheResult(Norm norm) {
		entityCache.putResult(NormImpl.class, norm.getPrimaryKey(), norm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the norms in the entity cache if it is enabled.
	 *
	 * @param norms the norms
	 */
	@Override
	public void cacheResult(List<Norm> norms) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (norms.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Norm norm : norms) {
			if (entityCache.getResult(NormImpl.class, norm.getPrimaryKey()) ==
					null) {

				cacheResult(norm);
			}
		}
	}

	/**
	 * Clears the cache for all norms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NormImpl.class);

		finderCache.clearCache(NormImpl.class);
	}

	/**
	 * Clears the cache for the norm.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Norm norm) {
		entityCache.removeResult(NormImpl.class, norm);
	}

	@Override
	public void clearCache(List<Norm> norms) {
		for (Norm norm : norms) {
			entityCache.removeResult(NormImpl.class, norm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NormImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NormImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new norm with the primary key. Does not add the norm to the database.
	 *
	 * @param NormId the primary key for the new norm
	 * @return the new norm
	 */
	@Override
	public Norm create(long NormId) {
		Norm norm = new NormImpl();

		norm.setNew(true);
		norm.setPrimaryKey(NormId);

		return norm;
	}

	/**
	 * Removes the norm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param NormId the primary key of the norm
	 * @return the norm that was removed
	 * @throws NoSuchNormException if a norm with the primary key could not be found
	 */
	@Override
	public Norm remove(long NormId) throws NoSuchNormException {
		return remove((Serializable)NormId);
	}

	/**
	 * Removes the norm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the norm
	 * @return the norm that was removed
	 * @throws NoSuchNormException if a norm with the primary key could not be found
	 */
	@Override
	public Norm remove(Serializable primaryKey) throws NoSuchNormException {
		Session session = null;

		try {
			session = openSession();

			Norm norm = (Norm)session.get(NormImpl.class, primaryKey);

			if (norm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNormException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(norm);
		}
		catch (NoSuchNormException noSuchEntityException) {
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
	protected Norm removeImpl(Norm norm) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(norm)) {
				norm = (Norm)session.get(
					NormImpl.class, norm.getPrimaryKeyObj());
			}

			if (norm != null) {
				session.delete(norm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (norm != null) {
			clearCache(norm);
		}

		return norm;
	}

	@Override
	public Norm updateImpl(Norm norm) {
		boolean isNew = norm.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(norm);
			}
			else {
				norm = (Norm)session.merge(norm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(NormImpl.class, norm, false, true);

		if (isNew) {
			norm.setNew(false);
		}

		norm.resetOriginalValues();

		return norm;
	}

	/**
	 * Returns the norm with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the norm
	 * @return the norm
	 * @throws NoSuchNormException if a norm with the primary key could not be found
	 */
	@Override
	public Norm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNormException {

		Norm norm = fetchByPrimaryKey(primaryKey);

		if (norm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNormException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return norm;
	}

	/**
	 * Returns the norm with the primary key or throws a <code>NoSuchNormException</code> if it could not be found.
	 *
	 * @param NormId the primary key of the norm
	 * @return the norm
	 * @throws NoSuchNormException if a norm with the primary key could not be found
	 */
	@Override
	public Norm findByPrimaryKey(long NormId) throws NoSuchNormException {
		return findByPrimaryKey((Serializable)NormId);
	}

	/**
	 * Returns the norm with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param NormId the primary key of the norm
	 * @return the norm, or <code>null</code> if a norm with the primary key could not be found
	 */
	@Override
	public Norm fetchByPrimaryKey(long NormId) {
		return fetchByPrimaryKey((Serializable)NormId);
	}

	/**
	 * Returns all the norms.
	 *
	 * @return the norms
	 */
	@Override
	public List<Norm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the norms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of norms
	 * @param end the upper bound of the range of norms (not inclusive)
	 * @return the range of norms
	 */
	@Override
	public List<Norm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the norms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of norms
	 * @param end the upper bound of the range of norms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of norms
	 */
	@Override
	public List<Norm> findAll(
		int start, int end, OrderByComparator<Norm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the norms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of norms
	 * @param end the upper bound of the range of norms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of norms
	 */
	@Override
	public List<Norm> findAll(
		int start, int end, OrderByComparator<Norm> orderByComparator,
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

		List<Norm> list = null;

		if (useFinderCache) {
			list = (List<Norm>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NORM;

				sql = sql.concat(NormModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Norm>)QueryUtil.list(
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
	 * Removes all the norms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Norm norm : findAll()) {
			remove(norm);
		}
	}

	/**
	 * Returns the number of norms.
	 *
	 * @return the number of norms
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NORM);

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
		return "NormId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the norm persistence.
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

		_setNormUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setNormUtilPersistence(null);

		entityCache.removeCache(NormImpl.class.getName());
	}

	private void _setNormUtilPersistence(NormPersistence normPersistence) {
		try {
			Field field = NormUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, normPersistence);
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

	private static final String _SQL_SELECT_NORM = "SELECT norm FROM Norm norm";

	private static final String _SQL_COUNT_NORM =
		"SELECT COUNT(norm) FROM Norm norm";

	private static final String _ORDER_BY_ENTITY_ALIAS = "norm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Norm exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		NormPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private NormModelArgumentsResolver _normModelArgumentsResolver;

}