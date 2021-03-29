package plants.dao;

import org.apache.ibatis.annotations.Param;
import plants.pojo.Species;

import java.util.List;

public interface SpeciesMapper {
    //增
    int addSpecies(Species species);
    //删
    int deleteSpeciesRyId(@Param("sid") int sid);
    //改
    int updateSpecies(Species species);
    //查
    Species querySpeciesById(@Param("sid") int sid);
    //所有
    List<Species> queryAllSpecies();
    //根据名称查
    Species querySpeciesByName(@Param("sname") String sname);
}
