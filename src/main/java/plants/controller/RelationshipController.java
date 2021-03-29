package plants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import plants.pojo.Relationship;
import plants.pojo.Species;
import plants.service.RelationshipService;
import plants.service.SpeciesService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/relationship")
public class RelationshipController {
    @Autowired
    @Qualifier("RelationshipServiceImpl")
    private RelationshipService relationshipService;
    @Autowired
    @Qualifier("SpeciesServiceImpl")
    private SpeciesService speciesService;
    //增加植物规则页面
    @RequestMapping("/addPlantrule")
    public String toAddPlantRule(){
        return "addPlantRule";
    }
    //添加植物规则的请求
    @RequestMapping("/addPlantrule1")
    public String addPlantRule(Relationship relationship,Model model){
        relationship.setResult(relationship.getResult().trim());
        Relationship relationship1 = relationshipService.queryRelationshipByName(relationship.getRult());
        String rults = relationship.getRult();
        Pattern p = Pattern.compile("[&]");
        String[] r= p.split(rults);
        for (String s: r) {
            Species species = speciesService.querySpeciesByName(s);
            if(species==null){
                model.addAttribute("success","添加失败:添加的规则包含未知特征");
                return "addPlantRule";
            }
        }
        if(relationship1==null){
            relationshipService.addRelationship(relationship);
            model.addAttribute("success","添加成功");
            return "success";
        }else {
            model.addAttribute("success","添加失败:添加的规则已在数据库");
        }
        return "addPlantRule";

    }

    @RequestMapping("/queryrultzheng")
    public  String queryBook(String queryrultName, Model model){
        //输入的字符串去除空格
        queryrultName = queryrultName.replaceAll(" ","");
        //取出所有的规则对象
        List<Relationship> list = relationshipService.queryAllRult();
        //用正则表达式将每一个规则的特征提取出来，放在Sting[]数组中
        Pattern p = Pattern.compile("[&]");
        String[] r= p.split(queryrultName);
        //将特征集合放在list集合中
        List<String> stringList = new ArrayList<String>();
        List<String> stringList1 = new ArrayList<String>();
        List<Relationship> relationshiplist = new ArrayList<Relationship>();
        for (String string: r) {
            stringList.add(string);
        }
        //判断所有规则对象
        for(Relationship relationship:list){
            String[] r1= p.split(relationship.getRult());
            for (String string: r1) {
                stringList1.add(string);

            }
            boolean  bl = stringList.containsAll(stringList1);
            if (bl){
                stringList.removeAll(stringList1);
                stringList.add(relationship.getResult());
                relationshiplist.add(relationship);
            }
            stringList1.clear();
        }
        if (stringList.size()==1){
            for (String string:
                 stringList) {
                Relationship relationship = relationshipService.queryRelationshipByResult(string);
                if (relationship==null){
                    model.addAttribute("success","根据条件不能推断出植物");
                    List<Species> specieslist = speciesService.queryAllSpecies();
                    model.addAttribute("list",specieslist);
                    return "allSpecies";
                }
            }
            List<Species> specieslist = speciesService.queryAllSpecies();
            model.addAttribute("list",specieslist);
            model.addAttribute("relationshiplist",relationshiplist);
            model.addAttribute("tui","正向推理");
            return "allSpecies";
        }
        model.addAttribute("success","根据条件不能推断出植物");
        List<Species> specieslist = speciesService.queryAllSpecies();
        model.addAttribute("list",specieslist);
        return "allSpecies";
    }
    @RequestMapping("/queryrultni")
    public  String queryni(String queryrultName1,String queryrultName2, Model model){
        queryrultName2 = queryrultName2.replaceAll(" ","");
        queryrultName1 = queryrultName1.replaceAll(" ","");
        Relationship relationship = relationshipService.queryRelationshipByResult(queryrultName2);
        Pattern p = Pattern.compile("[&]");
        String[] r= p.split(relationship.getRult());
        //将特征集合放在list集合中
        List<String> stringList = new ArrayList<String>();
        List<String> stringList1 = new ArrayList<String>();
        List<String> stringList2 = new ArrayList<String>();
        String ss = "";
        ss += relationship.getResult() + "->" + relationship.getRult();
        for (String string: r) {
            stringList.add(string);
        }
        for (String string: stringList) {
            Relationship relationship1 = relationshipService.queryRelationshipByResult(string);
            if (relationship1!=null){
                stringList2.add(string);
                String[] r1= p.split(relationship1.getRult());
                for (String string1: r1) {
                    stringList1.add(string1);
                }
            }
        }
        stringList.removeAll(stringList2);
        stringList.addAll(stringList1);
        String s = "";
        for (String string:
             stringList) {
            s += string + "&";
        }
        s = s.substring(0,s.length()- 1);
        List<String> slist = new ArrayList<String>();
        String[] rr1= p.split(queryrultName1);
        for (String string: rr1) {
            slist.add(string);
        }
        String[] rr2= p.split(s);
        for (String string: rr2) {
            slist.remove(string);
        }
        if (slist.size()!=0){
            model.addAttribute("success","根据条件不能推断出植物");
            List<Species> specieslist = speciesService.queryAllSpecies();
            model.addAttribute("list",specieslist);
            return "allSpecies";
        }
        ss += "->" + s;
        model.addAttribute("tui","逆向推理");
        model.addAttribute("ni",ss);
        List<Species> specieslist = speciesService.queryAllSpecies();
        model.addAttribute("list",specieslist);
        return "allSpecies";
    }
    //跳转到修改页面
    @RequestMapping("/toUpdatePlant")
    public String toUpdateBook(Model model, int id) {
        Relationship relationship = relationshipService.queryRelationshipById(id);
        System.out.println(relationship);
        model.addAttribute("relationship",relationship);
        return "updaterult";
    }
    //删除书籍
    @RequestMapping("/delate/{rid}")
    public String deleteBook(@PathVariable("rid") int id, Model model) {
        relationshipService.deleteRelationshipRyId(id);
        model.addAttribute("success","删除成功");
        return "success";
    }
}
