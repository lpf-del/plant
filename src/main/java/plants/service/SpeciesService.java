package plants.service;

import plants.pojo.Species;

import java.util.List;

public  interface SpeciesService {
    //增
    int addSpecies(Species species);
    //删
    int deleteSpeciesRyId( int sid);
    //改
    int updateSpecies(Species species);
    //查
    Species querySpeciesById(int sid);

    List<Species> queryAllSpecies();

    Species querySpeciesByName(String sname);
}
