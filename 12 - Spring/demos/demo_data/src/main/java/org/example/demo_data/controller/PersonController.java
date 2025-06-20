package org.example.demo_data.controller;

import org.example.demo_data.entity.Person;
import org.example.demo_data.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    public final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String home(Model model){
        model.addAttribute("persons",personService.findAll());
        return "home";
    }

    @GetMapping("/add-form")
    public String addForm(Model model){
        model.addAttribute("person",new Person());
        return "add-person";
    }

    @PostMapping("/add-form")
    public String addPerson(@ModelAttribute("person") Person person){
        personService.saveOrUpdate(person);
        return "redirect:/";
    }

}
