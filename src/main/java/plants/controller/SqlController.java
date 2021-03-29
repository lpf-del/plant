package plants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import plants.pojo.Relationship;
import plants.pojo.Species;
import plants.service.RelationshipService;
import plants.service.SpeciesService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class SqlController {
    @Autowired
    @Qualifier("SpeciesServiceImpl")
    private SpeciesService speciesService;
    @Autowired
    @Qualifier("RelationshipServiceImpl")
    private RelationshipService relationshipService;
    @RequestMapping("success")
    public String success(){
        return "sql";
    }
    @RequestMapping("/sql")
    public String sql(Model model){
        return "sql";
    }
    @RequestMapping("/relationship")
    public String relationship(Model model){
        List<Relationship> relationshipList = relationshipService.queryAllRult();
        model.addAttribute("relationshiplist",relationshipList);
        return "relationship";
    }
    @RequestMapping("/species")
    public String species(Model model){
        List<Species> speciesList = speciesService.queryAllSpecies();
        model.addAttribute("specieslist", speciesList);
        return "species";
    }
    @RequestMapping("/delate2")
    public String delate2(int id, Model model){
        speciesService.deleteSpeciesRyId(id);
        model.addAttribute("success","删除成功");
        return "successA";
    }
    @RequestMapping("/toUpdatespecies")
    public String toUpdatespecies(int id, Model model){
        Species species = speciesService.querySpeciesById(id);
        model.addAttribute("species", species);
        return "updatePlant";
    }
    @RequestMapping("/updateSpecies")
    public String updateSpecies(Species species,Model model){
        speciesService.updateSpecies(species);
        model.addAttribute("success","修改成功");
        return "successA";
    }
    @RequestMapping("/updateRelationship")
    public String updateRelationship(Relationship relationship,Model model){
        relationshipService.updateRelationship(relationship);
        model.addAttribute("success","修改成功");
        return "successA";
    }
}
