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

import ProductDAO.exception.NoSuchNormException;

import ProductDAO.model.Norm;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the norm service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NormUtil
 * @generated
 */
@ProviderType
public interface NormPersistence extends BasePersistence<Norm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NormUtil} to access the norm persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the norm in the entity cache if it is enabled.
	 *
	 * @param norm the norm
	 */
	public void cacheResult(Norm norm);

	/**
	 * Caches the norms in the entity cache if it is enabled.
	 *
	 * @param norms the norms
	 */
	public void cacheResult(java.util.List<Norm> norms);

	/**
	 * Creates a new norm with the primary key. Does not add the norm to the database.
	 *
	 * @param NormId the primary key for the new norm
	 * @return the new norm
	 */
	public Norm create(long NormId);

	/**
	 * Removes the norm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param NormId the primary key of the norm
	 * @return the norm that was removed
	 * @throws NoSuchNormException if a norm with the primary key could not be found
	 */
	public Norm remove(long NormId) throws NoSuchNormException;

	public Norm updateImpl(Norm norm);

	/**
	 * Returns the norm with the primary key or throws a <code>NoSuchNormException</code> if it could not be found.
	 *
	 * @param NormId the primary key of the norm
	 * @return the norm
	 * @throws NoSuchNormException if a norm with the primary key could not be found
	 */
	public Norm findByPrimaryKey(long NormId) throws NoSuchNormException;

	/**
	 * Returns the norm with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param NormId the primary key of the norm
	 * @return the norm, or <code>null</code> if a norm with the primary key could not be found
	 */
	public Norm fetchByPrimaryKey(long NormId);

	/**
	 * Returns all the norms.
	 *
	 * @return the norms
	 */
	public java.util.List<Norm> findAll();

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
	public java.util.List<Norm> findAll(int start, int end);

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
	public java.util.List<Norm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Norm>
			orderByComparator);

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
	public java.util.List<Norm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Norm>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the norms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of norms.
	 *
	 * @return the number of norms
	 */
	public int countAll();

}