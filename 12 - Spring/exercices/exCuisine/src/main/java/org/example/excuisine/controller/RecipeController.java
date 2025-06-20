package org.example.excuisine.controller;

import jakarta.validation.Valid;
import org.example.excuisine.model.Recipe;
import org.example.excuisine.service.CategoryService;
import org.example.excuisine.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
public class RecipeController {
    private final RecipeService recipeService;
    private final CategoryService categoryService;

    public RecipeController(RecipeService recipeService, CategoryService categoryService) {
        this.recipeService = recipeService;
        this.categoryService = categoryService;
    }

    @GetMapping
    private String homePage(Model model){
        model.addAttribute("recettes", recipeService.getAll());
        return "recipe/homePage";
    }

    @GetMapping("/recipe/form")
    public String pageAdd2(Model model){
        model.addAttribute("recette",new Recipe());
        model.addAttribute("categories", categoryService.getAll());
        return "recipe/recipeForm";
    }

    @GetMapping("/recipe/update/{id}")
    public String pageUpdate(@PathVariable("id") UUID id, Model model ){
        model.addAttribute("recette", recipeService.getById(id));
        model.addAttribute("categories", categoryService.getAll());
        return "recipe/recipeForm";
    }

    @PostMapping("/recipe/save")
    public String save(@Valid @ModelAttribute("recette") Recipe recette, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "recipe/recipeForm";
        }
        if (recette.getId() == null){
            recette.setId(UUID.randomUUID());
        }

        recette.setCategorie(categoryService.getById(recette.getCategorie_id()));
        recipeService.saveOrUpdate(recette);
        return "redirect:/";
    }

    @GetMapping("/recipe/detail/{id}")
    public String pageDetail(@PathVariable("id") UUID id,Model model){
        model.addAttribute("recette", recipeService.getById(id));
        return "recipe/recipeDetail";
    }

    @GetMapping("/recipe/delete/{id}")
    public String pageDelete(@PathVariable("id") UUID id){
        recipeService.delete(id);
        return "redirect:/";
    }
}
