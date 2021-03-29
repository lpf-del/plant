package plants.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import plants.pojo.Species;

import java.util.List;

public class SpeciesMapperImpk extends SqlSessionDaoSupport implements SpeciesMapper{
    @Override
    public int addSpecies(Species species) {
        return 0;
    }

    @Override
    public int deleteSpeciesRyId(int sid) {
        return 0;
    }

    @Override
    public int updateSpecies(Species species) {
        return 0;
    }

    @Override
    public Species querySpeciesById(int sid) {
        return null;
    }

    @Override
    public List<Species> queryAllSpecies() {
        return null;
    }

    @Override
    public Species querySpeciesByName(String sname) {
        return null;
    }
}
