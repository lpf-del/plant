package plants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import plants.pojo.Species;
import plants.service.SpeciesService;

import java.util.List;

@Controller
@RequestMapping("/species")
public class SpeciesController {
    @Autowired
    @Qualifier("SpeciesServiceImpl")
    private SpeciesService speciesService;
    @RequestMapping("/allSpecies")
    public String speciesList(Model model){
        List<Species> specieslist = speciesService.queryAllSpecies();
        model.addAttribute("list",specieslist);
        return "allSpecies";
    }

    //增加植物页面
    @RequestMapping("/addPlant")
    public String toAddPlant(){
        return "addPlant";
    }
    //添加书籍的请求
    @RequestMapping("/addPlant1")
    public String addBook(Species species){
        System.out.println("addBook=>"+species);
        speciesService.addSpecies(species);
        return "redirect:/species/allSpecies";  //重定向到 @RequestMapping("/allBook")请求
    }
    //跳转到修改页面
    @RequestMapping("/toUpdatePlant")
    public String toUpdateBook(Model model, int id) {
        Species species = speciesService.querySpeciesById(id);
        System.out.println(species);
        model.addAttribute("species",species);
        return "updatePlant";
    }
    //修改书籍
    @RequestMapping("/updateSpecies")
    public String updateBook(Model model, Species species) {
        System.out.println(species);
        speciesService.updateSpecies(species);
        return "redirect:/species/allSpecies";
    }
    //删除书籍
    @RequestMapping("/delate/{sid}")
    public String deleteBook(@PathVariable("sid") int id) {
        speciesService.deleteSpeciesRyId(id);
        return "redirect:/species/allSpecies";
    }


}
