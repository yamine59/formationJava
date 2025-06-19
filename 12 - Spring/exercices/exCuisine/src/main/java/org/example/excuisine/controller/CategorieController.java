package org.example.excuisine.controller;

import jakarta.validation.Valid;
import org.example.excuisine.model.Categorie;
import org.example.excuisine.model.Recette;
import org.example.excuisine.service.CategorieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
public class CategorieController {

    private final CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
    @GetMapping("/categorie/list")
    public String pageList(Model model){
        model.addAttribute("categories",categorieService.getAll());
        return "categorie/categorieList";
    }

    @GetMapping("/categorie/form")
    public String pageAdd(Model model){
        model.addAttribute("categorie",new Categorie());
        return "categorie/categorieSOU";
    }



    @PostMapping("/categorie/save")
    public String save(@Valid @ModelAttribute("categorie")Categorie categorie, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "categorie/categorieSOU";
        }
        if (categorie.getId() == null){
            categorie.setId(UUID.randomUUID());
        }
        categorieService.saveOrUpdate(categorie);
        return "redirect:/categorie/list";
    }

    @GetMapping("/categorie/update/{id}")
    public String pageUpdate(@PathVariable("id")UUID id,Model model ){
        model.addAttribute("categorie",categorieService.getById(id));
        return "categorie/categorieSOU";
    }

    @GetMapping("/categorie/detail/{id}")
    public String pageDetail(@PathVariable("id") UUID id,Model model){
        model.addAttribute("categorie",categorieService.getById(id));
        return "categorie/categorieDetail";
    }

    @GetMapping("/categorie/delete/{id}")
    public String pageDelete(@PathVariable("id") UUID id){
        categorieService.delete(id);
        return "redirect:/categorie/list";
    }



}
