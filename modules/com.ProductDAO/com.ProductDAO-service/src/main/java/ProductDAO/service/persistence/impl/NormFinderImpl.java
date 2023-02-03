package ProductDAO.service.persistence.impl;

import ProductDAO.model.Norm;
import ProductDAO.model.impl.NormImpl;
import ProductDAO.service.persistence.NormFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.StringUtil;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

@Component(service = NormFinder.class)
public class NormFinderImpl extends NormFinderBaseImpl implements NormFinder {

    @Reference
    private CustomSQL _CustomSQL;
    public static final String FIND_QUARTER_BY_NORMID = NormFinder.class.getName() + ".findQuarterByNormId";

    public List<Norm> findQuarterByNormId(int begin,int end){
        Session session =null;
        try {
            session = openSession();

            String sql = _CustomSQL.get(getClass(),FIND_QUARTER_BY_NORMID);
            sql = StringUtil.replace(sql,"[$QUARTER$]","AND NORMNAME LIKE ?");

            SQLQuery q = session.createSQLQuery(sql);
            q.addEntity("Norm", NormImpl.class);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add("1/4"+"%");

            return (List<Norm>) QueryUtil.list(q,getDialect(),QueryUtil.ALL_POS,QueryUtil.ALL_POS);
        }catch (Exception e){
//            System.out.println("----------exception-----------");
        }finally {
            closeSession(session);
        }
//        System.out.println("---------------null-------------");
        return null;
    }
}
