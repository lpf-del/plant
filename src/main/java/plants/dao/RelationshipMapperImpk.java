package plants.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import plants.pojo.Relationship;

import java.util.List;

public class RelationshipMapperImpk extends SqlSessionDaoSupport implements RelationshipMapper{
    @Override
    public int addRelationship(Relationship relationships) {
        return 0;
    }

    @Override
    public int deleteRelationshipRyId(int rid) {
        return 0;
    }

    @Override
    public int updateRelationship(Relationship relationship) {
        return 0;
    }

    @Override
    public Relationship queryRelationshipById(int rid) {
        return null;
    }

    @Override
    public Relationship queryRelationshipByName(String rult) {
        return null;
    }

    @Override
    public List<Relationship> queryAllRult() {
        return null;
    }

    @Override
    public Relationship queryRelationshipByResult(String Result) {
        return null;
    }
}
