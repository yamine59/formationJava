package org.example.spring_demo_base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        System.out.println("Je passe dans la methode sayHello !!!!");
        return "hello";
    }

    @RequestMapping("/coucou")
    @ResponseBody
    public List<String> getPersons(){
        return List.of("Toto","Tata","titi");
    }

    @RequestMapping("/home/person")
    public String personInfos(Model model){
        model.addAttribute("firstname","Toto");
        model.addAttribute("lastname","Titi");
        List<String> persons = List.of("Toto","Tata","titi");
        model.addAttribute("persons",persons);
        return "person/details";
    }

    @RequestMapping("/home/personvide")
    public String personInfosVide(Model model){
        model.addAttribute("firstname","Toto");
        model.addAttribute("lastname","Titi");
        List<String> persons = List.of();
        model.addAttribute("persons",persons);
        return "person/details";
    }


}
