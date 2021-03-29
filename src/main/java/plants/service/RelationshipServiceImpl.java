package plants.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plants.dao.RelationshipMapper;
import plants.pojo.Relationship;

import java.util.List;

@Service
public class RelationshipServiceImpl implements RelationshipService{
    @Autowired
    private RelationshipMapper relationshipMapper;
    public void setRelationshipMapper(RelationshipMapper relationshipMapper){
        this.relationshipMapper = relationshipMapper;
    }
    @Override
    public int addRelationship(Relationship relationships) {
        return relationshipMapper.addRelationship(relationships);
    }

    @Override
    public int deleteRelationshipRyId(int rid) {
        return relationshipMapper.deleteRelationshipRyId(rid);
    }

    @Override
    public int updateRelationship(Relationship relationship) {
        return relationshipMapper.updateRelationship(relationship);
    }

    @Override
    public Relationship queryRelationshipById(int rid) {
        return relationshipMapper.queryRelationshipById(rid);
    }

    @Override
    public Relationship queryRelationshipByName(String rult) {
        return relationshipMapper.queryRelationshipByName(rult);
    }

    @Override
    public List<Relationship> queryAllRult() {
        return relationshipMapper.queryAllRult();
    }

    @Override
    public Relationship queryRelationshipByResult(String Result) {
        return relationshipMapper.queryRelationshipByResult(Result);
    }
}
