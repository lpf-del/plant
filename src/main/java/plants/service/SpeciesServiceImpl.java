package plants.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plants.dao.SpeciesMapper;
import plants.pojo.Species;

import java.util.List;

@Service
public class SpeciesServiceImpl implements SpeciesService{
    //service调dao层
    @Autowired
    private SpeciesMapper speciesMapper;
    public void setSpeciesMapper(SpeciesMapper speciesMapper){
        this.speciesMapper = speciesMapper;
    }
    @Override
    public int addSpecies(Species species) {
        return speciesMapper.addSpecies(species);
    }

    @Override
    public int deleteSpeciesRyId(int sid) {
        return speciesMapper.deleteSpeciesRyId(sid);
    }

    @Override
    public int updateSpecies(Species species) {
        return speciesMapper.updateSpecies(species);
    }

    @Override
    public Species querySpeciesById(int sid) {
        return speciesMapper.querySpeciesById(sid);
    }

    @Override
    public List<Species> queryAllSpecies() {
        return speciesMapper.queryAllSpecies();
    }

    @Override
    public Species querySpeciesByName(String sname) {
        return speciesMapper.querySpeciesByName(sname);
    }
}
