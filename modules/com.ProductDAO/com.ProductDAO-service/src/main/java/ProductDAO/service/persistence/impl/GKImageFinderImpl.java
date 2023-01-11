package ProductDAO.service.persistence.impl;

import ProductDAO.model.GKImage;
import ProductDAO.model.impl.GKImageImpl;
import ProductDAO.service.persistence.GKImageFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.dao.orm.QueryUtil;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

@Component(service = GKImageFinder.class)
public class GKImageFinderImpl extends GKImageFinderBaseImpl implements GKImageFinder {

    @Reference
    private CustomSQL _CustomSQL;

    public static final String FIND_IMG_BY_GKDETAILID = GKImageFinder.class.getName() + ".findIMGByGKDetailId";

    public List<GKImage> findIMGByGKDetailId(long GKDetailId){
        Session session = null;
        try {
            session = openSession();

            String sql = _CustomSQL.get(getClass(),FIND_IMG_BY_GKDETAILID);
            System.out.println("sql"+sql);
            SQLQuery q = session.createSQLQuery(sql);
//            q.addScalar("GKDetailId", Type.LONG);
            q.addEntity("GKImage", GKImageImpl.class);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(GKDetailId);

            return (List<GKImage>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
        }catch (Exception e){

        }finally {
            closeSession(session);
        }
        return null;
    }

}
