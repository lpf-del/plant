package plants.service;

import org.apache.ibatis.annotations.Param;
import plants.pojo.Relationship;

import java.util.List;

public interface RelationshipService {
    //增
    int addRelationship(Relationship relationships);
    //删
    int deleteRelationshipRyId(@Param("rid") int rid);
    //改
    int updateRelationship(Relationship relationship);
    //查
    Relationship queryRelationshipById(@Param("rid") int rid);
    Relationship queryRelationshipByName(@Param("rult") String rult);
    List<Relationship> queryAllRult();
    Relationship queryRelationshipByResult(@Param("Result") String Result);
}
