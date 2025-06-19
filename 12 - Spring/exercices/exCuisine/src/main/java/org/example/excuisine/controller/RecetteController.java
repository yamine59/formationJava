package org.example.excuisine.controller;

import jakarta.validation.Valid;
import org.example.excuisine.model.Recette;
import org.example.excuisine.service.CategorieService;
import org.example.excuisine.service.RecetteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
public class RecetteController {
    private final RecetteService recetteService;
    private final CategorieService categorieService;

    public RecetteController(RecetteService recetteService, CategorieService categorieService) {
        this.recetteService = recetteService;
        this.categorieService = categorieService;
    }

    @GetMapping
    private String homePage(Model model){
        model.addAttribute("recettes",recetteService.getAll());
        return "recette/homePage";
    }

    @GetMapping("/recette/form")
    public String pageAdd2(Model model){
        model.addAttribute("recette",new Recette());
        model.addAttribute("categories",categorieService.getAll());
        return "recette/recetteSOU";
    }

    @GetMapping("/recette/update/{id}")
    public String pageUpdate(@PathVariable("id") UUID id, Model model ){
        model.addAttribute("recette",recetteService.getById(id));
        model.addAttribute("categories",categorieService.getAll());
        return "recette/recetteSOU";
    }

    @PostMapping("/recette/save")
    public String save(@Valid @ModelAttribute("recette")Recette recette, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "recette/recetteSOU";
        }
        if (recette.getId() == null){
            recette.setId(UUID.randomUUID());
        }

        System.out.println(recette);
        recetteService.saveOrUpdate(recette);
        return "redirect:/";
    }

    @GetMapping("/recette/detail/{id}")
    public String pageDetail(@PathVariable("id") UUID id,Model model){
        model.addAttribute("recette",recetteService.getById(id));
        return "recette/recetteDetail";
    }

    @GetMapping("/recette/delete/{id}")
    public String pageDelete(@PathVariable("id") UUID id){
        recetteService.delete(id);
        return "redirect:/";
    }
}
